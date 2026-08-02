package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ojk implements KSerializer {
    public static final ojk a = new ojk();
    public static final g7f b = new g7f("kotlin.uuid.Uuid", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        ijk ijkVar = jjk.c;
        String z = decoder.z();
        ijkVar.getClass();
        z.getClass();
        int length = z.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char charAt = z.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = x99.b[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                mjk.b(i, z, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char charAt2 = z.charAt(i2);
                if ((charAt2 >>> '\b') == 0) {
                    long j6 = x99.b[charAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                mjk.b(i2, z, "a hexadecimal digit");
                throw null;
            }
            jjk.c.getClass();
            return ijk.a(j, j4);
        }
        if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(z.length() <= 64 ? z : z.substring(0, 64).concat("..."));
            sb.append("\" of length ");
            sb.append(z.length());
            throw new IllegalArgumentException(sb.toString());
        }
        long j7 = 0;
        while (i < 8) {
            long j8 = j7 << 4;
            char charAt3 = z.charAt(i);
            if ((charAt3 >>> '\b') == 0) {
                long j9 = x99.b[charAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            mjk.b(i, z, "a hexadecimal digit");
            throw null;
        }
        if (z.charAt(8) != '-') {
            mjk.b(8, z, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i3 = 9; i3 < 13; i3++) {
            long j11 = j10 << 4;
            char charAt4 = z.charAt(i3);
            if ((charAt4 >>> '\b') == 0) {
                long j12 = x99.b[charAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            mjk.b(i3, z, "a hexadecimal digit");
            throw null;
        }
        if (z.charAt(13) != '-') {
            mjk.b(13, z, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i4 = 14; i4 < 18; i4++) {
            long j14 = j13 << 4;
            char charAt5 = z.charAt(i4);
            if ((charAt5 >>> '\b') == 0) {
                long j15 = x99.b[charAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            mjk.b(i4, z, "a hexadecimal digit");
            throw null;
        }
        if (z.charAt(18) != '-') {
            mjk.b(18, z, "'-' (hyphen)");
            throw null;
        }
        long j16 = 0;
        for (int i5 = 19; i5 < 23; i5++) {
            long j17 = j16 << 4;
            char charAt6 = z.charAt(i5);
            if ((charAt6 >>> '\b') == 0) {
                long j18 = x99.b[charAt6];
                if (j18 >= 0) {
                    j16 = j17 | j18;
                }
            }
            mjk.b(i5, z, "a hexadecimal digit");
            throw null;
        }
        if (z.charAt(23) != '-') {
            mjk.b(23, z, "'-' (hyphen)");
            throw null;
        }
        long j19 = 0;
        for (int i6 = 24; i6 < 36; i6++) {
            long j20 = j19 << 4;
            char charAt7 = z.charAt(i6);
            if ((charAt7 >>> '\b') == 0) {
                long j21 = x99.b[charAt7];
                if (j21 >= 0) {
                    j19 = j20 | j21;
                }
            }
            mjk.b(i6, z, "a hexadecimal digit");
            throw null;
        }
        jjk.c.getClass();
        return ijk.a((j7 << 32) | (j10 << 16) | j13, (j16 << 48) | j19);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jjk jjkVar = (jjk) obj;
        encoder.getClass();
        jjkVar.getClass();
        encoder.F(jjkVar.toString());
    }
}
