package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import defpackage.bf3;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class PsshAtomUtil {
    private static final String TAG = "PsshAtomUtil";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class PsshAtom {
        private final byte[] schemeData;
        private final UUID uuid;
        private final int version;

        public PsshAtom(UUID uuid, int i, byte[] bArr) {
            this.uuid = uuid;
            this.version = i;
            this.schemeData = bArr;
        }
    }

    private PsshAtomUtil() {
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        boolean z = uuidArr != null;
        int length = bArr != null ? bArr.length : 0;
        int i = length + 32;
        if (z) {
            i = bf3.c(uuidArr.length, 16, 4, i);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.putInt(i);
        allocate.putInt(Atom.TYPE_pssh);
        allocate.putInt(z ? C.DEFAULT_MUXED_BUFFER_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (z) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    @Nullable
    private static PsshAtom parsePsshAtom(byte[] bArr) {
        int parseFullAtomVersion;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.limit() < 32) {
            return null;
        }
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readInt() != parsableByteArray.bytesLeft() + 4 || parsableByteArray.readInt() != Atom.TYPE_pssh || (parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt())) > 1) {
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.readLong(), parsableByteArray.readLong());
        if (parseFullAtomVersion == 1) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedIntToInt() * 16);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt != parsableByteArray.bytesLeft()) {
            return null;
        }
        byte[] bArr2 = new byte[readUnsignedIntToInt];
        parsableByteArray.readBytes(bArr2, 0, readUnsignedIntToInt);
        return new PsshAtom(uuid, parseFullAtomVersion, bArr2);
    }

    @Nullable
    public static byte[] parseSchemeSpecificData(byte[] bArr, UUID uuid) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        if (uuid == null || uuid.equals(parsePsshAtom.uuid)) {
            return parsePsshAtom.schemeData;
        }
        uuid.toString();
        Objects.toString(parsePsshAtom.uuid);
        return null;
    }

    @Nullable
    public static UUID parseUuid(byte[] bArr) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return null;
        }
        return parsePsshAtom.uuid;
    }

    public static int parseVersion(byte[] bArr) {
        PsshAtom parsePsshAtom = parsePsshAtom(bArr);
        if (parsePsshAtom == null) {
            return -1;
        }
        return parsePsshAtom.version;
    }

    public static byte[] buildPsshAtom(UUID uuid, @Nullable byte[] bArr) {
        return buildPsshAtom(uuid, null, bArr);
    }
}
