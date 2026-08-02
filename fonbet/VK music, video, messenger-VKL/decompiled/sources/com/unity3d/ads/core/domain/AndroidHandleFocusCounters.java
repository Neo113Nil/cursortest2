package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.jvo0;
import xsna.kvo0;
import xsna.ovj;
import xsna.rsr;
import xsna.u6i;
import xsna.vtk0;
import xsna.xh50;
import xsna.zcl;
import xsna.zno;
import xsna.zvj;

/* compiled from: AndroidHandleFocusCounters.kt */
/* loaded from: classes14.dex */
public final class AndroidHandleFocusCounters {
    private final ovj defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, u6i> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final xh50<FocusState> previousFocusState;
    private final SessionRepository sessionRepository;
    private final kvo0 timeSource;

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, ovj ovjVar, kvo0 kvo0Var) {
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = androidGetIsAdActivity;
        this.defaultDispatcher = ovjVar;
        this.timeSource = kvo0Var;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = vtk0.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        FocusState value;
        FocusState focusState2;
        xh50<FocusState> xh50Var = this.previousFocusState;
        do {
            value = xh50Var.getValue();
            focusState2 = value;
        } while (!xh50Var.compareAndSet(value, focusState));
        if (focusState2 == null || focusState.getClass() == focusState2.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 == null || str2.equals(str)) {
            u6i remove = this.focusTimesPerActivity.remove(str);
            if (remove == null) {
                remove = this.timeSource.a();
            }
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) zno.e(remove.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.a());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.focusRepository.getFocusState(), new AndroidHandleFocusCounters$invoke$1(this, null)), zvj.a(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, ovj ovjVar, kvo0 kvo0Var, int i, zcl zclVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, ovjVar, (i & 16) != 0 ? jvo0.a : kvo0Var);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }
}
