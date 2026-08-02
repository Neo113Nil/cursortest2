package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yif implements h18 {
    public static final Charset c = Charset.forName(C.UTF8_NAME);
    public final File a;
    public xif b;

    public yif(File file) {
        this.a = file;
    }

    @Override // defpackage.h18
    public final void a() {
        k53.a0(this.b);
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    @Override // defpackage.h18
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String q() {
        a01 a01Var;
        byte[] bArr;
        File file = this.a;
        if (file.exists()) {
            if (this.b == null) {
                try {
                    this.b = new xif(file);
                } catch (IOException unused) {
                    Objects.toString(file);
                }
            }
            xif xifVar = this.b;
            if (xifVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[xifVar.p()];
                try {
                    this.b.g(new k1d(20, bArr2, iArr));
                } catch (IOException unused2) {
                }
                a01Var = new a01(bArr2, iArr[0]);
                if (a01Var != null) {
                    bArr = null;
                } else {
                    int i = a01Var.b;
                    bArr = new byte[i];
                    System.arraycopy(a01Var.a, 0, bArr, 0, i);
                }
                if (bArr == null) {
                    return new String(bArr, c);
                }
                return null;
            }
        }
        a01Var = null;
        if (a01Var != null) {
        }
        if (bArr == null) {
        }
    }

    @Override // defpackage.h18
    public final void v(long j, String str) {
        File file = this.a;
        if (this.b == null) {
            try {
                this.b = new xif(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.b.e(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(c));
            while (!this.b.h() && this.b.p() > 65536) {
                this.b.k();
            }
        } catch (IOException unused2) {
        }
    }
}
