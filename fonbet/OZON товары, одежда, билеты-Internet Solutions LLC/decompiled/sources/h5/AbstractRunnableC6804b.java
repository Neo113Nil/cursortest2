package h5;

import androidx.annotation.NonNull;
import androidx.work.impl.WorkDatabase;
import androidx.work.r;
import androidx.work.v;
import g5.InterfaceC6629b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC6804b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.n f64968a = new androidx.work.impl.n();

    /* renamed from: h5.b$a */
    /* loaded from: classes8.dex */
    final class a extends AbstractRunnableC6804b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.C f64969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f64970c;

        a(androidx.work.impl.C c11, UUID uuid) {
            this.f64969b = c11;
            this.f64970c = uuid;
        }

        @Override // h5.AbstractRunnableC6804b
        final void e() {
            androidx.work.impl.C c11 = this.f64969b;
            WorkDatabase n11 = c11.n();
            n11.beginTransaction();
            try {
                AbstractRunnableC6804b.a(c11, this.f64970c.toString());
                n11.setTransactionSuccessful();
                n11.endTransaction();
                androidx.work.impl.s.b(c11.h(), c11.n(), c11.l());
            } catch (Throwable th2) {
                n11.endTransaction();
                throw th2;
            }
        }
    }

    static void a(androidx.work.impl.C c11, String str) {
        WorkDatabase n11 = c11.n();
        g5.C f7 = n11.f();
        InterfaceC6629b a11 = n11.a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            v.a d11 = f7.d(str2);
            if (d11 != v.a.SUCCEEDED && d11 != v.a.FAILED) {
                f7.f(v.a.CANCELLED, str2);
            }
            linkedList.addAll(a11.b(str2));
        }
        c11.k().l(str);
        Iterator<androidx.work.impl.r> it = c11.l().iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    @NonNull
    public static AbstractRunnableC6804b b(@NonNull androidx.work.impl.C c11, @NonNull UUID uuid) {
        return new a(c11, uuid);
    }

    @NonNull
    public static AbstractRunnableC6804b c(@NonNull androidx.work.impl.C c11, @NonNull String str) {
        return new C6805c(c11, str, true);
    }

    @NonNull
    public final androidx.work.impl.n d() {
        return this.f64968a;
    }

    abstract void e();

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.n nVar = this.f64968a;
        try {
            e();
            nVar.a(androidx.work.r.f45549a);
        } catch (Throwable th2) {
            nVar.a(new r.a.C0824a(th2));
        }
    }
}
