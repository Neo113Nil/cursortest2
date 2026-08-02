package n2;

import android.text.TextUtils;
import b1.C2338G;
import com.orkestapay.orkestapay.core.clicktopay.WebviewActivity;
import e1.InterfaceC4148o;
import e1.J;
import e2.AbstractC4167i;
import e2.s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final J f56997a = new J();

    /* renamed from: b, reason: collision with root package name */
    public final b f56998b = new b();

    public static int d(J j10) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = j10.g();
            String x10 = j10.x();
            i10 = x10 == null ? 0 : WebviewActivity.STYLE.equals(x10) ? 2 : x10.startsWith("NOTE") ? 1 : 3;
        }
        j10.b0(i11);
        return i10;
    }

    public static void e(J j10) {
        while (!TextUtils.isEmpty(j10.x())) {
        }
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        d n10;
        this.f56997a.Z(bArr, i11 + i10);
        this.f56997a.b0(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f56997a);
            while (!TextUtils.isEmpty(this.f56997a.x())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int d10 = d(this.f56997a);
                if (d10 == 0) {
                    AbstractC4167i.c(new j(arrayList2), bVar, interfaceC4148o);
                    return;
                }
                if (d10 == 1) {
                    e(this.f56997a);
                } else if (d10 == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f56997a.x();
                    arrayList.addAll(this.f56998b.d(this.f56997a));
                } else if (d10 == 3 && (n10 = e.n(this.f56997a, arrayList)) != null) {
                    arrayList2.add(n10);
                }
            }
        } catch (C2338G e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // e2.s
    public int c() {
        return 1;
    }
}
