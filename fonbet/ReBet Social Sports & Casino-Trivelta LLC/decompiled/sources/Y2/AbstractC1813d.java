package Y2;

import Q2.K;
import R2.AbstractC1548y;
import R2.C1543t;
import R2.InterfaceC1545v;
import R2.Y;
import Y2.AbstractC1813d;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: Y2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1813d {

    /* renamed from: Y2.d$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y f13949d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ UUID f13950e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y y10, UUID uuid) {
            super(0);
            this.f13949d = y10;
            this.f13950e = uuid;
        }

        public static final void b(Y y10, UUID uuid) {
            String uuid2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
            AbstractC1813d.d(y10, uuid2);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m35invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m35invoke() {
            WorkDatabase s10 = this.f13949d.s();
            Intrinsics.checkNotNullExpressionValue(s10, "workManagerImpl.workDatabase");
            final Y y10 = this.f13949d;
            final UUID uuid = this.f13950e;
            s10.runInTransaction(new Runnable() { // from class: Y2.c
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1813d.a.b(Y.this, uuid);
                }
            });
            AbstractC1813d.i(this.f13949d);
        }
    }

    public static final void d(Y y10, String str) {
        WorkDatabase s10 = y10.s();
        Intrinsics.checkNotNullExpressionValue(s10, "workManagerImpl.workDatabase");
        h(s10, str);
        C1543t p10 = y10.p();
        Intrinsics.checkNotNullExpressionValue(p10, "workManagerImpl.processor");
        p10.q(str, 1);
        Iterator it = y10.q().iterator();
        while (it.hasNext()) {
            ((InterfaceC1545v) it.next()).a(str);
        }
    }

    public static final Q2.x e(UUID id2, Y workManagerImpl) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        Q2.H n10 = workManagerImpl.f().n();
        Z2.a c10 = workManagerImpl.t().c();
        Intrinsics.checkNotNullExpressionValue(c10, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return Q2.B.c(n10, "CancelWorkById", c10, new a(workManagerImpl, id2));
    }

    public static final void f(final String name, final Y workManagerImpl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        final WorkDatabase s10 = workManagerImpl.s();
        Intrinsics.checkNotNullExpressionValue(s10, "workManagerImpl.workDatabase");
        s10.runInTransaction(new Runnable() { // from class: Y2.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1813d.g(WorkDatabase.this, name, workManagerImpl);
            }
        });
    }

    public static final void g(WorkDatabase workDatabase, String str, Y y10) {
        Iterator it = workDatabase.l().g(str).iterator();
        while (it.hasNext()) {
            d(y10, (String) it.next());
        }
    }

    public static final void h(WorkDatabase workDatabase, String str) {
        androidx.work.impl.model.c l10 = workDatabase.l();
        X2.a g10 = workDatabase.g();
        List mutableListOf = CollectionsKt.mutableListOf(str);
        while (!mutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(mutableListOf);
            K.c h10 = l10.h(str2);
            if (h10 != K.c.SUCCEEDED && h10 != K.c.FAILED) {
                l10.j(str2);
            }
            mutableListOf.addAll(g10.b(str2));
        }
    }

    public static final void i(Y y10) {
        AbstractC1548y.f(y10.f(), y10.s(), y10.q());
    }
}
