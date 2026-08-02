package androidx.work.impl;

import Ph.L;
import Ph.P;
import Ph.Q;
import Q2.E;
import R2.AbstractC1548y;
import R2.C1543t;
import R2.InterfaceC1545v;
import R2.W;
import R2.Y;
import V2.n;
import Z2.b;
import Z2.c;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.plaid.internal.EnumC3631g;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0418a extends FunctionReferenceImpl implements Function6 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0418a f23785a = new C0418a();

        public C0418a() {
            super(6, a.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // kotlin.jvm.functions.Function6
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context p02, androidx.work.a p12, b p22, WorkDatabase p32, n p42, C1543t p52) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            Intrinsics.checkNotNullParameter(p22, "p2");
            Intrinsics.checkNotNullParameter(p32, "p3");
            Intrinsics.checkNotNullParameter(p42, "p4");
            Intrinsics.checkNotNullParameter(p52, "p5");
            return a.b(p02, p12, p22, p32, p42, p52);
        }
    }

    public static final List b(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, C1543t c1543t) {
        InterfaceC1545v c10 = AbstractC1548y.c(context, workDatabase, aVar);
        Intrinsics.checkNotNullExpressionValue(c10, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt.listOf((Object[]) new InterfaceC1545v[]{c10, new S2.b(context, aVar, nVar, c1543t, new W(c1543t, bVar), bVar)});
    }

    public static final Y c(Context context, androidx.work.a configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }

    public static final Y d(Context context, androidx.work.a configuration, b workTaskExecutor, WorkDatabase workDatabase, n trackers, C1543t processor, Function6 schedulersCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new Y(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ Y e(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, C1543t c1543t, Function6 function6, int i10, Object obj) {
        n nVar2;
        if ((i10 & 4) != 0) {
            bVar = new c(aVar.m());
        }
        b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            Z2.a c10 = bVar2.c();
            Intrinsics.checkNotNullExpressionValue(c10, "workTaskExecutor.serialTaskExecutor");
            workDatabase = companion.b(applicationContext, c10, aVar.a(), context.getResources().getBoolean(E.f9220a));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            nVar2 = new n(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, bVar2, workDatabase, nVar2, (i10 & 32) != 0 ? new C1543t(context.getApplicationContext(), aVar, bVar2, workDatabase) : c1543t, (i10 & 64) != 0 ? C0418a.f23785a : function6);
    }

    public static final P f(b taskExecutor) {
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        L b10 = taskExecutor.b();
        Intrinsics.checkNotNullExpressionValue(b10, "taskExecutor.taskCoroutineDispatcher");
        return Q.a(b10);
    }
}
