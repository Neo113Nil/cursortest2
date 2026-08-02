package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fpf0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidHandleFocusCounters.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleFocusCounters$invoke$1 extends SuspendLambda implements wzs<FocusState, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHandleFocusCounters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleFocusCounters$invoke$1(AndroidHandleFocusCounters androidHandleFocusCounters, spj<? super AndroidHandleFocusCounters$invoke$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidHandleFocusCounters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidHandleFocusCounters$invoke$1 androidHandleFocusCounters$invoke$1 = new AndroidHandleFocusCounters$invoke$1(this.this$0, spjVar);
        androidHandleFocusCounters$invoke$1.L$0 = obj;
        return androidHandleFocusCounters$invoke$1;
    }

    @Override // xsna.wzs
    public final Object invoke(FocusState focusState, spj<? super s3q0> spjVar) {
        return ((AndroidHandleFocusCounters$invoke$1) create(focusState, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        AndroidGetIsAdActivity androidGetIsAdActivity;
        SessionRepository sessionRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        FocusState focusState = (FocusState) this.L$0;
        this.this$0.onFocusStateChange(focusState);
        Activity activity = focusState.getActivity().get();
        if (activity == null || (str = fpf0.a(activity.getClass()).h()) == null) {
            str = "unknown_activity_name";
        }
        androidGetIsAdActivity = this.this$0.isAdActivity;
        if (!androidGetIsAdActivity.invoke(str)) {
            return s3q0.a;
        }
        sessionRepository = this.this$0.sessionRepository;
        sessionRepository.incrementGlobalAdsFocusChangeCount();
        if (focusState instanceof FocusState.Focused) {
            this.this$0.onResume(str);
        } else {
            if (!(focusState instanceof FocusState.Unfocused)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.onPause(str);
        }
        return s3q0.a;
    }
}
