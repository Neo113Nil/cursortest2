package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ezc extends yzf {
    public static final zdc g;
    public static final zdc h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public final gc2 c;
    public final List d;
    public final zdc e;
    public long f;

    static {
        Regex regex = zdc.e;
        g = bea.v("multipart/mixed");
        bea.v("multipart/alternative");
        bea.v("multipart/digest");
        bea.v("multipart/parallel");
        h = bea.v("multipart/form-data");
        i = new byte[]{58, 32};
        j = new byte[]{13, 10};
        k = new byte[]{45, 45};
    }

    public ezc(gc2 gc2Var, zdc zdcVar, List list) {
        zdcVar.getClass();
        list.getClass();
        this.c = gc2Var;
        this.d = list;
        Regex regex = zdc.e;
        this.e = bea.v(zdcVar + "; boundary=" + gc2Var.w());
        this.f = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(k62 k62Var, boolean z) {
        x52 x52Var;
        k62 k62Var2;
        if (z) {
            k62Var2 = new x52();
            x52Var = k62Var2;
        } else {
            x52Var = 0;
            k62Var2 = k62Var;
        }
        List list = this.d;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            gc2 gc2Var = this.c;
            byte[] bArr = k;
            byte[] bArr2 = j;
            if (i2 >= size) {
                k62Var2.getClass();
                k62Var2.write(bArr);
                k62Var2.i0(gc2Var);
                k62Var2.write(bArr);
                k62Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                x52Var.getClass();
                long j3 = j2 + x52Var.b;
                x52Var.k();
                return j3;
            }
            dzc dzcVar = (dzc) list.get(i2);
            q89 q89Var = dzcVar.a;
            yzf yzfVar = dzcVar.b;
            k62Var2.getClass();
            k62Var2.write(bArr);
            k62Var2.i0(gc2Var);
            k62Var2.write(bArr2);
            int size2 = q89Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k62Var2.S(vha.j(q89Var, i3)).write(i).S(vha.l(q89Var, i3)).write(bArr2);
            }
            zdc contentType = yzfVar.contentType();
            if (contentType != null) {
                k62Var2.S("Content-Type: ").S(contentType.a).write(bArr2);
            }
            long contentLength = yzfVar.contentLength();
            if (contentLength == -1 && z) {
                x52Var.getClass();
                x52Var.k();
                return -1L;
            }
            k62Var2.write(bArr2);
            if (z) {
                j2 += contentLength;
            } else {
                yzfVar.writeTo(k62Var2);
            }
            k62Var2.write(bArr2);
            i2++;
        }
    }

    @Override // defpackage.yzf
    public final long contentLength() {
        long j2 = this.f;
        if (j2 != -1) {
            return j2;
        }
        long a = a(null, true);
        this.f = a;
        return a;
    }

    @Override // defpackage.yzf
    public final zdc contentType() {
        return this.e;
    }

    @Override // defpackage.yzf
    public final boolean isOneShot() {
        List list = this.d;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((dzc) it.next()).b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yzf
    public final void writeTo(k62 k62Var) {
        a(k62Var, false);
    }
}
