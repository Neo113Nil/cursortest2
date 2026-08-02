package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nd9 implements vsj {
    public static final b f;
    public static final b g;
    public final vsj a;
    public final b b;
    public b c;
    public byte[] d;
    public int e;

    static {
        qm8 qm8Var = new qm8();
        qm8Var.n = sjc.p(MimeTypes.APPLICATION_ID3);
        f = new b(qm8Var);
        qm8 qm8Var2 = new qm8();
        qm8Var2.n = sjc.p(MimeTypes.APPLICATION_EMSG);
        g = new b(qm8Var2);
    }

    public nd9(vsj vsjVar, int i) {
        this.a = vsjVar;
        if (i == 1) {
            this.b = f;
        } else {
            if (i != 3) {
                a70.p(ljg.j(i, "Unknown metadataType: "));
                throw null;
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // defpackage.vsj
    public final void a(long j, int i, int i2, int i3, tsj tsjVar) {
        this.c.getClass();
        int i4 = this.e - i3;
        j9e j9eVar = new j9e(Arrays.copyOfRange(this.d, i4 - i2, i4));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.e = i3;
        String str = this.c.o;
        b bVar = this.b;
        String str2 = bVar.o;
        String str3 = bVar.o;
        if (!Objects.equals(str, str2)) {
            if (!MimeTypes.APPLICATION_EMSG.equals(this.c.o)) {
                tgj.d0("Ignoring sample for unsupported format: " + this.c.o);
                return;
            }
            s36 K = ce0.K(j9eVar);
            b m = K.m();
            if (m == null || !Objects.equals(str3, m.o)) {
                tgj.d0("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + K.m());
                return;
            }
            byte[] t = K.t();
            t.getClass();
            j9eVar = new j9e(t);
        }
        int a = j9eVar.a();
        vsj vsjVar = this.a;
        vsjVar.g(a, j9eVar);
        vsjVar.a(j, i, a, 0, tsjVar);
    }

    @Override // defpackage.vsj
    public final void b(j9e j9eVar, int i, int i2) {
        int i3 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i3) {
            bArr = Arrays.copyOf(bArr, (i3 / 2) + i3);
            this.d = bArr;
        }
        j9eVar.k(bArr, this.e, i);
        this.e += i;
    }

    @Override // defpackage.vsj
    public final void d(b bVar) {
        this.c = bVar;
        this.a.d(this.b);
    }

    @Override // defpackage.vsj
    public final int e(ge4 ge4Var, int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (bArr.length < i2) {
            bArr = Arrays.copyOf(bArr, (i2 / 2) + i2);
            this.d = bArr;
        }
        int read = ge4Var.read(bArr, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        a70.q();
        return 0;
    }
}
