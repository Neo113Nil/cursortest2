package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ybl extends ot8 implements gt8 {
    public static final ybl b = new ybl(6, tgj.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.gt8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        ti3 ti3Var = (ti3) obj2;
        zti ztiVar = (zti) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        nuj nujVar = (nuj) obj5;
        g8f g8fVar = (g8f) obj6;
        context.getClass();
        ti3Var.getClass();
        ztiVar.getClass();
        workDatabase.getClass();
        nujVar.getClass();
        g8fVar.getClass();
        int i = ssg.a;
        fri friVar = new fri(context, workDatabase, ti3Var);
        i3e.a(context, SystemJobService.class, true);
        rik.o().getClass();
        return b.j(friVar, new k39(context, ti3Var, nujVar, g8fVar, new c0l(g8fVar, ztiVar), ztiVar));
    }
}
