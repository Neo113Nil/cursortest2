package com.unity3d.ads.core.data.repository;

import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidDiagnosticEventRepository$flush$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
    int label;
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository, List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, rq3<? super AndroidDiagnosticEventRepository$flush$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidDiagnosticEventRepository;
        this.$events = list;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidDiagnosticEventRepository$flush$2(this.this$0, this.$events, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidDiagnosticEventRepository$flush$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        b1d b1dVar;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            b1dVar = this.this$0._diagnosticEvents;
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
            this.label = 1;
            if (b1dVar.emit(list, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
