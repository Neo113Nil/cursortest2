package com.vk.unitylevelplay.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import com.mbridge.msdk.config.component.status.MBComponentLifecycleProvider;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.LevelPlayPrivacySettings;
import com.unity3d.services.core.configuration.AdsSdkInitializer;
import sg.bigo.ads.controller.provider.BigoAdsProvider;
import xsna.asp;
import xsna.asu0;
import xsna.b25;
import xsna.bpn0;
import xsna.bu00;
import xsna.d4q0;
import xsna.drm0;
import xsna.e4q0;
import xsna.f7c;
import xsna.fs2;
import xsna.g2q0;
import xsna.ki4;
import xsna.lau;
import xsna.m11;
import xsna.rau;
import xsna.s3q0;
import xsna.sqf0;
import xsna.usx;
import xsna.wzs;
import xsna.zrp;

/* compiled from: UnityLevelPlayFeatureImpl.kt */
/* loaded from: classes6.dex */
public final class UnityLevelPlayFeatureImpl implements d4q0 {
    public final lau a;
    public final b25 b;
    public final m11 c;
    public volatile InitializationState d = InitializationState.NOT_INITIALIZED;
    public final bpn0 e = new bpn0(new sqf0(8));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityLevelPlayFeatureImpl.kt */
    public static final class InitializationState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InitializationState[] $VALUES;
        public static final InitializationState INITIALIZED;
        public static final InitializationState IN_PROGRESS;
        public static final InitializationState NOT_INITIALIZED;

        static {
            InitializationState initializationState = new InitializationState("NOT_INITIALIZED", 0);
            NOT_INITIALIZED = initializationState;
            InitializationState initializationState2 = new InitializationState("IN_PROGRESS", 1);
            IN_PROGRESS = initializationState2;
            InitializationState initializationState3 = new InitializationState("INITIALIZED", 2);
            INITIALIZED = initializationState3;
            InitializationState[] initializationStateArr = {initializationState, initializationState2, initializationState3};
            $VALUES = initializationStateArr;
            $ENTRIES = new asp(initializationStateArr);
        }

        public InitializationState() {
            throw null;
        }

        public static InitializationState valueOf(String str) {
            return (InitializationState) Enum.valueOf(InitializationState.class, str);
        }

        public static InitializationState[] values() {
            return (InitializationState[]) $VALUES.clone();
        }
    }

    /* compiled from: UnityLevelPlayFeatureImpl.kt */
    public static final class a implements lau.a {
        public final f7c a;
        public final /* synthetic */ Activity c;

        public a(wzs<? super Integer, ? super String, s3q0> wzsVar, Activity activity) {
            this.c = activity;
            this.a = new f7c(6, UnityLevelPlayFeatureImpl.this, wzsVar);
        }

        @Override // xsna.lau.a
        public final void a(rau rauVar) {
            UnityLevelPlayFeatureImpl unityLevelPlayFeatureImpl = UnityLevelPlayFeatureImpl.this;
            lau lauVar = unityLevelPlayFeatureImpl.a;
            int e = lauVar.e();
            if (e == 2) {
                LevelPlayPrivacySettings.setCCPA(false);
            } else if (e == 1) {
                LevelPlayPrivacySettings.setCCPA(true);
            }
            lauVar.f(new e4q0());
            int b = rauVar.b();
            Activity activity = this.c;
            f7c f7cVar = this.a;
            if (b == 2) {
                rauVar.c(activity, new ki4(unityLevelPlayFeatureImpl, activity, f7cVar, 9));
            } else {
                unityLevelPlayFeatureImpl.e(activity, f7cVar);
            }
        }

        @Override // xsna.lau.a
        public final void b(g2q0 g2q0Var) {
            this.a.invoke(Integer.valueOf(g2q0Var.a), "UnityLevelPlay. User consent info error: " + g2q0Var.b);
        }
    }

    public UnityLevelPlayFeatureImpl(lau lauVar, b25 b25Var, m11 m11Var) {
        this.a = lauVar;
        this.b = b25Var;
        this.c = m11Var;
    }

    @Override // xsna.d4q0
    public final void a(int i, String str) {
        this.c.a(i, str);
    }

    @Override // xsna.d4q0
    public final void b(Application application) {
        BigoAdsProvider bigoAdsProvider = new BigoAdsProvider();
        bigoAdsProvider.attachInfo(application, null);
        bigoAdsProvider.onCreate();
        MBComponentLifecycleProvider mBComponentLifecycleProvider = new MBComponentLifecycleProvider();
        mBComponentLifecycleProvider.attachInfo(application, null);
        mBComponentLifecycleProvider.onCreate();
        new AdsSdkInitializer().create2((Context) application);
    }

    @Override // xsna.d4q0
    public final void c(Activity activity, wzs<? super Integer, ? super String, s3q0> wzsVar) {
        if (this.d != InitializationState.NOT_INITIALIZED) {
            return;
        }
        this.d = InitializationState.IN_PROGRESS;
        this.a.c(activity, new a(wzsVar, activity));
    }

    @Override // xsna.d4q0
    public final bu00 d() {
        return new bu00();
    }

    public final void e(Activity activity, f7c f7cVar) {
        String string;
        ApplicationInfo applicationInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 128).applicationInfo;
        String str = null;
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        if (bundle != null && (string = bundle.getString("com.vk.unitylevelplay.LEVEL_PLAY_APP_ID")) != null) {
            str = drm0.U(string, "string/");
        }
        if (str == null) {
            ((Handler) this.e.getValue()).post(new fs2(f7cVar, 16));
            return;
        }
        LevelPlayInitRequest.Builder builder = new LevelPlayInitRequest.Builder(str);
        String q = this.b.q();
        if (q != null) {
            builder.withUserId(q);
        }
        LevelPlayInitRequest build = builder.build();
        this.c.c();
        asu0.a.getClass();
        asu0.h().submit(new usx(activity, build, this, f7cVar, 1));
    }

    @Override // xsna.d4q0
    public final boolean isInitialized() {
        return this.d == InitializationState.INITIALIZED;
    }
}
