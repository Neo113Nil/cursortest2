package com.vk.superapp.ui.uniwidgets.config;

import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import xsna.dzg0;

/* compiled from: SuperappTextStylesRoboto.kt */
/* loaded from: classes11.dex */
public final class a implements SuperappTextStylesBridge {
    public final dzg0 a = new dzg0(1);

    /* compiled from: SuperappTextStylesRoboto.kt */
    /* renamed from: com.vk.superapp.ui.uniwidgets.config.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class C1909a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SuperappTextStylesBridge.FontWeight.values().length];
            try {
                iArr[SuperappTextStylesBridge.FontWeight.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperappTextStylesBridge.FontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperappTextStylesBridge.FontWeight.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuperappTextStylesBridge.FontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a a() {
        return new SuperappTextStylesBridge.a(16.0f, 20.0f, 0.01f, SuperappTextStylesBridge.FontWeight.REGULAR, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a b() {
        return new SuperappTextStylesBridge.a(32.0f, 38.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, SuperappTextStylesBridge.FontWeight.LIGHT, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a c() {
        return new SuperappTextStylesBridge.a(12.0f, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, SuperappTextStylesBridge.FontWeight.REGULAR, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a d() {
        return new SuperappTextStylesBridge.a(20.0f, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, SuperappTextStylesBridge.FontWeight.REGULAR, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a e() {
        return new SuperappTextStylesBridge.a(13.0f, 16.0f, 0.02f, SuperappTextStylesBridge.FontWeight.BOLD, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a f() {
        return new SuperappTextStylesBridge.a(15.0f, 20.0f, 0.01f, SuperappTextStylesBridge.FontWeight.REGULAR, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a g() {
        return new SuperappTextStylesBridge.a(13.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, SuperappTextStylesBridge.FontWeight.REGULAR, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a h() {
        return new SuperappTextStylesBridge.a(14.0f, 18.0f, 0.02f, SuperappTextStylesBridge.FontWeight.MEDIUM, this.a);
    }

    @Override // com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge
    public final SuperappTextStylesBridge.a i() {
        return new SuperappTextStylesBridge.a(15.0f, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, SuperappTextStylesBridge.FontWeight.MEDIUM, this.a);
    }
}
