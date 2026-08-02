package com.vk.ads.yandex.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.common.MobileAds;
import xsna.ab6;
import xsna.asp;
import xsna.bpn0;
import xsna.e5y0;
import xsna.g2q0;
import xsna.l5y0;
import xsna.lau;
import xsna.m11;
import xsna.pvh0;
import xsna.qat0;
import xsna.rau;
import xsna.v4y0;
import xsna.y2;
import xsna.zrp;

/* compiled from: YandexAdFeatureImpl.kt */
/* loaded from: classes14.dex */
public final class YandexAdFeatureImpl implements v4y0 {
    public final lau a;
    public final Context b;
    public final m11 c;
    public final bpn0 d = new bpn0(new pvh0(this, 28));
    public InitializationState e = InitializationState.NOT_INITIALIZED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: YandexAdFeatureImpl.kt */
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

    /* compiled from: YandexAdFeatureImpl.kt */
    public static final class a implements lau.a {
        public final y2 a;
        public final /* synthetic */ Activity c;

        public a(Activity activity) {
            this.c = activity;
            this.a = new y2(YandexAdFeatureImpl.this, 12);
        }

        @Override // xsna.lau.a
        public final void a(rau rauVar) {
            int b = rauVar.b();
            YandexAdFeatureImpl yandexAdFeatureImpl = YandexAdFeatureImpl.this;
            Activity activity = this.c;
            if (b == 2) {
                rauVar.c(activity, new ab6(yandexAdFeatureImpl, activity, this.a, 13));
            } else {
                yandexAdFeatureImpl.c.c();
                MobileAds.initialize(activity, new qat0(yandexAdFeatureImpl, 6));
            }
        }

        @Override // xsna.lau.a
        public final void b(g2q0 g2q0Var) {
            this.a.invoke(Integer.valueOf(g2q0Var.a), "YandexAd. User consent info error: " + g2q0Var.b);
        }
    }

    public YandexAdFeatureImpl(lau lauVar, Context context, m11 m11Var) {
        this.a = lauVar;
        this.b = context;
        this.c = m11Var;
    }

    @Override // xsna.v4y0
    public final e5y0 a() {
        if (isInitialized()) {
            return (e5y0) this.d.getValue();
        }
        return null;
    }

    @Override // xsna.v4y0
    public final void b(Activity activity) {
        if (this.e != InitializationState.NOT_INITIALIZED) {
            return;
        }
        this.e = InitializationState.IN_PROGRESS;
        this.a.c(activity, new a(activity));
    }

    @Override // xsna.v4y0
    public final l5y0.a c() {
        return new l5y0.a();
    }

    @Override // xsna.v4y0
    public final boolean isInitialized() {
        return this.e == InitializationState.INITIALIZED;
    }
}
