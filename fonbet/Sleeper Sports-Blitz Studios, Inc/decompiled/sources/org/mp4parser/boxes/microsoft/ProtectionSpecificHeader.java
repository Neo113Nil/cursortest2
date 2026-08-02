package org.mp4parser.boxes.microsoft;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mp4parser.boxes.microsoft.contentprotection.GenericHeader;
import org.mp4parser.tools.Hex;

/* loaded from: classes10.dex */
public abstract class ProtectionSpecificHeader {
    protected static Map<UUID, Class<? extends ProtectionSpecificHeader>> uuidRegistry = new HashMap();

    public abstract ByteBuffer getData();

    public abstract UUID getSystemId();

    public abstract void parse(ByteBuffer byteBuffer);

    public static ProtectionSpecificHeader createFor(UUID uuid, ByteBuffer byteBuffer) {
        ProtectionSpecificHeader newInstance;
        Class<? extends ProtectionSpecificHeader> cls = uuidRegistry.get(uuid);
        if (cls != null) {
            try {
                newInstance = cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            newInstance = null;
        }
        if (newInstance == null) {
            newInstance = new GenericHeader();
        }
        newInstance.parse(byteBuffer);
        return newInstance;
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("somebody called equals on me but that's not supposed to happen.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProtectionSpecificHeader{data=");
        ByteBuffer duplicate = getData().duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        sb.append(Hex.encodeHex(bArr));
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
