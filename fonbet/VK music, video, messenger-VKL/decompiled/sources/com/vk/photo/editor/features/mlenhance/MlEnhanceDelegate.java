package com.vk.photo.editor.features.mlenhance;

import android.graphics.Bitmap;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.photo.editor.features.mlenhance.a;
import xsna.asp;
import xsna.e4p;
import xsna.zrp;

/* compiled from: MlEnhanceDelegate.kt */
/* loaded from: classes4.dex */
public interface MlEnhanceDelegate {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MlEnhanceDelegate.kt */
    public static final class OnboardingResource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingResource[] $VALUES;
        public static final OnboardingResource Pic1Enhanced;
        public static final OnboardingResource Pic1Original;
        public static final OnboardingResource Pic2Enhanced;
        public static final OnboardingResource Pic2Original;

        static {
            OnboardingResource onboardingResource = new OnboardingResource("Pic1Original", 0);
            Pic1Original = onboardingResource;
            OnboardingResource onboardingResource2 = new OnboardingResource("Pic1Enhanced", 1);
            Pic1Enhanced = onboardingResource2;
            OnboardingResource onboardingResource3 = new OnboardingResource("Pic2Original", 2);
            Pic2Original = onboardingResource3;
            OnboardingResource onboardingResource4 = new OnboardingResource("Pic2Enhanced", 3);
            Pic2Enhanced = onboardingResource4;
            OnboardingResource[] onboardingResourceArr = {onboardingResource, onboardingResource2, onboardingResource3, onboardingResource4};
            $VALUES = onboardingResourceArr;
            $ENTRIES = new asp(onboardingResourceArr);
        }

        public OnboardingResource() {
            throw null;
        }

        public static OnboardingResource valueOf(String str) {
            return (OnboardingResource) Enum.valueOf(OnboardingResource.class, str);
        }

        public static OnboardingResource[] values() {
            return (OnboardingResource[]) $VALUES.clone();
        }
    }

    /* compiled from: MlEnhanceDelegate.kt */
    public interface a {
        void a(e4p e4pVar);

        void onError();
    }

    void a(Bitmap bitmap, d dVar);

    boolean b();

    void c();

    LottieAnimationView d();

    Object e(OnboardingResource onboardingResource, a.C1462a c1462a);
}
