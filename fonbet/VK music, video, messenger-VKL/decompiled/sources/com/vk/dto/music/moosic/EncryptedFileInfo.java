package com.vk.dto.music.moosic;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ImageSizeKey;
import java.util.Arrays;
import org.json.JSONObject;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.f370;
import xsna.ho8;
import xsna.qcl;
import xsna.zcl;

/* compiled from: EncryptedFileInfo.kt */
/* loaded from: classes18.dex */
public final class EncryptedFileInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<EncryptedFileInfo> CREATOR = new b();
    public final String b;
    public final byte[] c;
    public final String d;

    /* compiled from: EncryptedFileInfo.kt */
    public static final class a {
        public static final char[] a = "0123456789ABCDEF".toCharArray();

        public static int a(char c) {
            if ('0' <= c && c < ':') {
                return c - ImageSizeKey.SIZE_KEY_UNDEFINED;
            }
            if ('A' <= c && c < 'G') {
                return c - '7';
            }
            if ('a' > c || c >= 'g') {
                return -1;
            }
            return c - 'W';
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<EncryptedFileInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final EncryptedFileInfo a(Serializer serializer) {
            return new EncryptedFileInfo(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EncryptedFileInfo[i];
        }
    }

    public EncryptedFileInfo(String str, byte[] bArr, String str2) {
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.M(this.c);
        serializer.j0(this.d);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new qcl(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EncryptedFileInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        EncryptedFileInfo encryptedFileInfo = (EncryptedFileInfo) obj;
        if (!epx.f(this.b, encryptedFileInfo.b)) {
            return false;
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            byte[] bArr2 = encryptedFileInfo.c;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (encryptedFileInfo.c != null) {
            return false;
        }
        return epx.f(this.d, encryptedFileInfo.d);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        byte[] bArr = this.c;
        int hashCode2 = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncryptedFileInfo(path=");
        sb.append(this.b);
        sb.append(", encryptionIV=");
        sb.append(Arrays.toString(this.c));
        sb.append(", encryptionKeyAlias=");
        return ho8.a(sb, this.d, ')');
    }

    public final String zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EncryptedFileInfo(JSONObject jSONObject) {
        this(r0, r3, f370.D(jSONObject, "encryption_key_alias"));
        byte[] bArr;
        String D = f370.D(jSONObject, "path");
        String D2 = f370.D(jSONObject, "encryption_iv");
        if (D2 != null) {
            char[] cArr = a.a;
            int length = D2.length();
            if (length % 2 == 0) {
                bArr = new byte[length / 2];
                for (int i = 0; i < length; i += 2) {
                    int a2 = a.a(D2.charAt(i));
                    int a3 = a.a(D2.charAt(i + 1));
                    if (a2 != -1 && a3 != -1) {
                        bArr[i / 2] = (byte) ((a2 * 16) + a3);
                    } else {
                        throw new IllegalArgumentException("contains illegal character for hexBinary: ".concat(D2).toString());
                    }
                }
            } else {
                throw new IllegalArgumentException("hexBinary needs to be even-length: ".concat(D2));
            }
        } else {
            bArr = null;
        }
    }

    public EncryptedFileInfo(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.a(), serializer.H());
    }
}
