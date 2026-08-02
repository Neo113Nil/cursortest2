package com.unity3d.ads.core.domain;

import com.ironsource.U3;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.au3;
import defpackage.f1d;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.s9a;
import defpackage.v98;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.y53;
import defpackage.yhj;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR*\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b$\u0010\u0019\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0012R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "focusRepository", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "isAdActivity", "Lau3;", "defaultDispatcher", "Lyhj;", "timeSource", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/FocusRepository;Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;Lau3;Lyhj;)V", "", "activityName", "", U3.i.u0, "(Ljava/lang/String;)V", U3.i.t0, "Lcom/unity3d/ads/core/data/repository/FocusState;", "newState", "onFocusStateChange", "(Lcom/unity3d/ads/core/data/repository/FocusState;)V", "invoke", "()V", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "Lau3;", "Lyhj;", "latestKnownActivityResumed", "Ljava/lang/String;", "getLatestKnownActivityResumed", "()Ljava/lang/String;", "setLatestKnownActivityResumed", "getLatestKnownActivityResumed$annotations", "Ljava/util/concurrent/ConcurrentHashMap;", "Ly53;", "focusTimesPerActivity", "Ljava/util/concurrent/ConcurrentHashMap;", "Lf1d;", "previousFocusState", "Lf1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleFocusCounters {

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final FocusRepository focusRepository;

    @NotNull
    private final ConcurrentHashMap<String, y53> focusTimesPerActivity;

    @NotNull
    private final AndroidGetIsAdActivity isAdActivity;

    @Nullable
    private volatile String latestKnownActivityResumed;

    @NotNull
    private final f1d previousFocusState;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final yhj timeSource;

    public AndroidHandleFocusCounters(@NotNull SessionRepository sessionRepository, @NotNull FocusRepository focusRepository, @NotNull AndroidGetIsAdActivity androidGetIsAdActivity, @NotNull au3 au3Var, @NotNull yhj yhjVar) {
        sessionRepository.getClass();
        focusRepository.getClass();
        androidGetIsAdActivity.getClass();
        au3Var.getClass();
        yhjVar.getClass();
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = androidGetIsAdActivity;
        this.defaultDispatcher = au3Var;
        this.timeSource = yhjVar;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = gdi.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState newState) {
        fdi fdiVar;
        Object value;
        FocusState focusState;
        f1d f1dVar = this.previousFocusState;
        do {
            fdiVar = (fdi) f1dVar;
            value = fdiVar.getValue();
            focusState = (FocusState) value;
        } while (!fdiVar.k(value, newState));
        if (focusState == null || newState.getClass() == focusState.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String activityName) {
        String str = this.latestKnownActivityResumed;
        if (str == null || str.equals(activityName)) {
            y53 remove = this.focusTimesPerActivity.remove(activityName);
            if (remove == null) {
                remove = this.timeSource.a();
            }
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) xd5.e(remove.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String activityName) {
        this.latestKnownActivityResumed = activityName;
        this.focusTimesPerActivity.put(activityName, this.timeSource.a());
    }

    @Nullable
    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        fcp.m0(new v98(this.focusRepository.getFocusState(), new AndroidHandleFocusCounters$invoke$1(this, null), 3), s9a.c(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(@Nullable String str) {
        this.latestKnownActivityResumed = str;
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, au3 au3Var, yhj yhjVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, au3Var, (i & 16) != 0 ? xhj.a : yhjVar);
    }
}
