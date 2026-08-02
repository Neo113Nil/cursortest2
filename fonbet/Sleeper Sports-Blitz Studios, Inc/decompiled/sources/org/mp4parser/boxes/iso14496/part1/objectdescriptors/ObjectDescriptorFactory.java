package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.mp4parser.tools.IsoTypeReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes10.dex */
public class ObjectDescriptorFactory {
    protected static Logger LOG = LoggerFactory.getLogger((Class<?>) ObjectDescriptorFactory.class);
    protected static Map<Integer, Map<Integer, Class<? extends BaseDescriptor>>> descriptorRegistry = new HashMap();

    static {
        HashSet<Class<? extends BaseDescriptor>> hashSet = new HashSet();
        hashSet.add(DecoderSpecificInfo.class);
        hashSet.add(SLConfigDescriptor.class);
        hashSet.add(BaseDescriptor.class);
        hashSet.add(ExtensionDescriptor.class);
        hashSet.add(ObjectDescriptorBase.class);
        hashSet.add(ProfileLevelIndicationDescriptor.class);
        hashSet.add(AudioSpecificConfig.class);
        hashSet.add(ExtensionProfileLevelDescriptor.class);
        hashSet.add(ESDescriptor.class);
        hashSet.add(DecoderConfigDescriptor.class);
        for (Class<? extends BaseDescriptor> cls : hashSet) {
            Descriptor descriptor = (Descriptor) cls.getAnnotation(Descriptor.class);
            int[] tags = descriptor.tags();
            int objectTypeIndication = descriptor.objectTypeIndication();
            Map<Integer, Class<? extends BaseDescriptor>> map = descriptorRegistry.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            descriptorRegistry.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static BaseDescriptor createFrom(int i, ByteBuffer byteBuffer) throws IOException {
        BaseDescriptor unknownDescriptor;
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        Map<Integer, Class<? extends BaseDescriptor>> map = descriptorRegistry.get(Integer.valueOf(i));
        if (map == null) {
            map = descriptorRegistry.get(-1);
        }
        Class<? extends BaseDescriptor> cls = map.get(Integer.valueOf(readUInt8));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            if (LOG.isWarnEnabled()) {
                LOG.warn("No ObjectDescriptor found for objectTypeIndication {} and tag {} found: {}", Integer.toHexString(i), Integer.toHexString(readUInt8), cls);
            }
            unknownDescriptor = new UnknownDescriptor();
        } else {
            try {
                unknownDescriptor = cls.newInstance();
            } catch (Exception e) {
                LOG.error("Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + readUInt8, (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        unknownDescriptor.parse(readUInt8, byteBuffer);
        return unknownDescriptor;
    }
}
