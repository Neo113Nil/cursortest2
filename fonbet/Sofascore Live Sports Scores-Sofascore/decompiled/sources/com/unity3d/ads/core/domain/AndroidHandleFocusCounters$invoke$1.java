package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.a70;
import defpackage.duf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/unity3d/ads/core/data/repository/FocusState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidHandleFocusCounters$invoke$1 extends hoi implements Function2<FocusState, rq3<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHandleFocusCounters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleFocusCounters$invoke$1(AndroidHandleFocusCounters androidHandleFocusCounters, rq3<? super AndroidHandleFocusCounters$invoke$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidHandleFocusCounters;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidHandleFocusCounters$invoke$1 androidHandleFocusCounters$invoke$1 = new AndroidHandleFocusCounters$invoke$1(this.this$0, rq3Var);
        androidHandleFocusCounters$invoke$1.L$0 = obj;
        return androidHandleFocusCounters$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FocusState focusState, rq3<? super Unit> rq3Var) {
        return ((AndroidHandleFocusCounters$invoke$1) create(focusState, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        AndroidGetIsAdActivity androidGetIsAdActivity;
        SessionRepository sessionRepository;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        FocusState focusState = (FocusState) this.L$0;
        this.this$0.onFocusStateChange(focusState);
        Activity activity = focusState.getActivity().get();
        if (activity != null) {
            str = duf.a.getOrCreateKotlinClass(activity.getClass()).getQualifiedName();
        }
        str = "unknown_activity_name";
        androidGetIsAdActivity = this.this$0.isAdActivity;
        if (!androidGetIsAdActivity.invoke(str)) {
            return Unit.a;
        }
        sessionRepository = this.this$0.sessionRepository;
        sessionRepository.incrementGlobalAdsFocusChangeCount();
        if (focusState instanceof FocusState.Focused) {
            this.this$0.onResume(str);
        } else {
            if (!(focusState instanceof FocusState.Unfocused)) {
                zzl.b();
                return null;
            }
            this.this$0.onPause(str);
        }
        return Unit.a;
    }
}
