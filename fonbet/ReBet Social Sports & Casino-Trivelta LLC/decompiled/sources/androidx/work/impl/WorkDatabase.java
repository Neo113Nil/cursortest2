package androidx.work.impl;

import E2.h;
import F2.f;
import Q2.InterfaceC1491b;
import R2.C1528d;
import R2.C1531g;
import R2.C1532h;
import R2.C1533i;
import R2.C1534j;
import R2.C1535k;
import R2.C1536l;
import R2.C1537m;
import R2.C1538n;
import R2.C1539o;
import R2.C1540p;
import R2.C1544u;
import R2.Z;
import W9.d;
import X2.c;
import X2.e;
import X2.k;
import X2.q;
import X9.m;
import android.content.Context;
import androidx.room.v;
import androidx.room.w;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.shape.i;
import i3.C4527h;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/w;", "<init>", "()V", "Landroidx/work/impl/model/c;", "l", "()Landroidx/work/impl/model/c;", "LX2/a;", "g", "()LX2/a;", "LX2/q;", m.f13664a, "()LX2/q;", "LX2/e;", i.f35755A, "()LX2/e;", "LX2/i;", "j", "()LX2/i;", "LX2/k;", "k", "()LX2/k;", "LX2/c;", C4527h.f48087o, "()LX2/c;", d.f13160a, "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkDatabase extends w {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final h c(Context context, h.b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            h.b.a a10 = h.b.f2949f.a(context);
            a10.d(configuration.f2951b).c(configuration.f2952c).e(true).a(true);
            return new f().a(a10.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, InterfaceC1491b clock, boolean z10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (z10 ? v.c(context, WorkDatabase.class).c() : v.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: R2.H
                @Override // E2.h.c
                public final E2.h a(h.b bVar) {
                    E2.h c10;
                    c10 = WorkDatabase.Companion.c(context, bVar);
                    return c10;
                }
            })).g(queryExecutor).a(new C1528d(clock)).b(C1535k.f10039c).b(new C1544u(context, 2, 3)).b(C1536l.f10040c).b(C1537m.f10041c).b(new C1544u(context, 5, 6)).b(C1538n.f10042c).b(C1539o.f10043c).b(C1540p.f10044c).b(new Z(context)).b(new C1544u(context, 10, 11)).b(C1531g.f10035c).b(C1532h.f10036c).b(C1533i.f10037c).b(C1534j.f10038c).b(new C1544u(context, 21, 22)).e().d();
        }

        public Companion() {
        }
    }

    public abstract X2.a g();

    public abstract c h();

    public abstract e i();

    public abstract X2.i j();

    public abstract k k();

    public abstract androidx.work.impl.model.c l();

    public abstract q m();
}
