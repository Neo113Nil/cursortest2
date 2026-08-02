package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.oog;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.z9a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends hoi implements Function2<ku3, rq3<? super String>, Object> {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, rq3<? super AndroidFIdDataSource$invoke$1$1> rq3Var) {
        super(2, rq3Var);
        this.$task = task;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super String> rq3Var) {
        return ((AndroidFIdDataSource$invoke$1$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            return obj;
        }
        y6a.M(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final oog oogVar = new oog(z9a.b(this));
        final Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return Unit.a;
            }

            public final void invoke(String str) {
                rq3<String> rq3Var = oogVar;
                p2g p2gVar = w2g.b;
                rq3Var.resumeWith(str);
            }
        };
        task.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ Function1 function;

            {
                function1.getClass();
                this.function = function1;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                exc.getClass();
                rq3<String> rq3Var = oogVar;
                p2g p2gVar = w2g.b;
                rq3Var.resumeWith(new u2g(exc));
            }
        });
        Object b = oogVar.b();
        return b == lu3Var ? lu3Var : b;
    }
}
