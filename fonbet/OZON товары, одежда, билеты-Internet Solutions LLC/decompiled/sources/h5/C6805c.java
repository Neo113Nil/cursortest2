package h5;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6805c extends AbstractRunnableC6804b {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.work.impl.C f64971b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f64972c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f64973d;

    C6805c(androidx.work.impl.C c11, String str, boolean z11) {
        this.f64971b = c11;
        this.f64972c = str;
        this.f64973d = z11;
    }

    @Override // h5.AbstractRunnableC6804b
    final void e() {
        androidx.work.impl.C c11 = this.f64971b;
        WorkDatabase n11 = c11.n();
        n11.beginTransaction();
        try {
            Iterator it = n11.f().c(this.f64972c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC6804b.a(c11, (String) it.next());
            }
            n11.setTransactionSuccessful();
            n11.endTransaction();
            if (this.f64973d) {
                androidx.work.impl.s.b(c11.h(), c11.n(), c11.l());
            }
        } catch (Throwable th2) {
            n11.endTransaction();
            throw th2;
        }
    }
}
