package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import defpackage.k13;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class JvmProtoBufUtil {

    @NotNull
    private static final ExtensionRegistryLite EXTENSION_REGISTRY;

    @NotNull
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    static {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(newInstance);
        newInstance.getClass();
        EXTENSION_REGISTRY = newInstance;
    }

    private JvmProtoBufUtil() {
    }

    public static /* synthetic */ JvmMemberSignature.Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z);
    }

    public static final boolean isMovedFromInterfaceCompanion(@NotNull ProtoBuf.Property property) {
        property.getClass();
        Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = property.getExtension(JvmProtoBuf.flags);
        extension.getClass();
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        bool.getClass();
        return bool.booleanValue();
    }

    private final String mapTypeDefault(ProtoBuf.Type type, NameResolver nameResolver) {
        if (type.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName()));
        }
        return null;
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(@NotNull byte[] bArr, @NotNull String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), ProtoBuf.Class.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom(@NotNull String[] strArr, @NotNull String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(strArr));
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr2), ProtoBuf.Function.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    private final JvmNameResolver readNameResolver(InputStream inputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        parseDelimitedFrom.getClass();
        return new JvmNameResolver(parseDelimitedFrom, strArr);
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(@NotNull byte[] bArr, @NotNull String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair<>(INSTANCE.readNameResolver(byteArrayInputStream, strArr), ProtoBuf.Package.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @NotNull
    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    @Nullable
    public final JvmMemberSignature.Method getJvmConstructorSignature(@NotNull ProtoBuf.Constructor constructor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String f0;
        constructor.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.constructorSignature;
        generatedExtension.getClass();
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(constructor, generatedExtension);
        String string = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(k13.r(valueParameterList, 10));
            for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                valueParameter.getClass();
                String mapTypeDefault = jvmProtoBufUtil.mapTypeDefault(ProtoTypeTableUtilKt.type(valueParameter, typeTable), nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList.add(mapTypeDefault);
            }
            f0 = CollectionsKt.f0(arrayList, "", "(", ")V", null, 56);
        } else {
            f0 = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(string, f0);
    }

    @Nullable
    public final JvmMemberSignature.Field getJvmFieldSignature(@NotNull ProtoBuf.Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, boolean z) {
        String mapTypeDefault;
        property.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.propertySignature;
        generatedExtension.getClass();
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(property, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmProtoBuf.JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        if (field == null && z) {
            return null;
        }
        int name = (field == null || !field.hasName()) ? property.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            mapTypeDefault = mapTypeDefault(ProtoTypeTableUtilKt.returnType(property, typeTable), nameResolver);
            if (mapTypeDefault == null) {
                return null;
            }
        } else {
            mapTypeDefault = nameResolver.getString(field.getDesc());
        }
        return new JvmMemberSignature.Field(nameResolver.getString(name), mapTypeDefault);
    }

    @Nullable
    public final JvmMemberSignature.Method getJvmMethodSignature(@NotNull ProtoBuf.Function function, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        String concat;
        function.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.methodSignature;
        generatedExtension.getClass();
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(function, generatedExtension);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List k = b.k(ProtoTypeTableUtilKt.receiverType(function, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
            valueParameterList.getClass();
            ArrayList arrayList = new ArrayList(k13.r(valueParameterList, 10));
            for (ProtoBuf.ValueParameter valueParameter : valueParameterList) {
                valueParameter.getClass();
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            ArrayList w0 = CollectionsKt.w0(arrayList, k);
            ArrayList arrayList2 = new ArrayList(k13.r(w0, 10));
            Iterator it = w0.iterator();
            while (it.hasNext()) {
                String mapTypeDefault = INSTANCE.mapTypeDefault((ProtoBuf.Type) it.next(), nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList2.add(mapTypeDefault);
            }
            String mapTypeDefault2 = mapTypeDefault(ProtoTypeTableUtilKt.returnType(function, typeTable), nameResolver);
            if (mapTypeDefault2 == null) {
                return null;
            }
            concat = CollectionsKt.f0(arrayList2, "", "(", ")", null, 56).concat(mapTypeDefault2);
        } else {
            concat = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(name), concat);
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(@NotNull String[] strArr, @NotNull String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        decodeBytes.getClass();
        return readClassDataFrom(decodeBytes, strArr2);
    }

    @NotNull
    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(@NotNull String[] strArr, @NotNull String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        decodeBytes.getClass();
        return readPackageDataFrom(decodeBytes, strArr2);
    }
}
