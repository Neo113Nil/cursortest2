package ru.ozon.uni.android.haptic;

import Sc.o;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/android/haptic/HapticVibrator;", "", "<init>", "()V", "Lru/ozon/uni/android/haptic/HapticToken;", "hapticToken", "", "getVibrateEffectByToken", "(Lru/ozon/uni/android/haptic/HapticToken;)Ljava/lang/Integer;", "Landroid/view/View;", "", "vibrate", "(Landroid/view/View;Lru/ozon/uni/android/haptic/HapticToken;)V", "", "isHapticsEnabled", "Z", "()Z", "setHapticsEnabled", "(Z)V", "isAndroidQOrLater", "isAndroidROrLater", "isAndroidUDCOrLater", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HapticVibrator {

    @NotNull
    public static final HapticVibrator INSTANCE = new HapticVibrator();
    private static boolean isHapticsEnabled = true;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HapticCategory.values().length];
            try {
                iArr[HapticCategory.PREDEFINED_EFFECTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HapticCategory.FEEDBACK_EFFECTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HapticToken.values().length];
            try {
                iArr2[HapticToken.HEAVY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HapticToken.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HapticToken.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HapticToken.SOFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HapticToken.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HapticToken.WARNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HapticToken.ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private HapticVibrator() {
    }

    private final Integer getVibrateEffectByToken(HapticToken hapticToken) {
        switch (WhenMappings.$EnumSwitchMapping$1[hapticToken.ordinal()]) {
            case 1:
                return isAndroidQOrLater() ? 5 : null;
            case 2:
                return isAndroidQOrLater() ? 0 : null;
            case 3:
                return isAndroidQOrLater() ? 2 : null;
            case 4:
                return isAndroidUDCOrLater() ? 26 : null;
            case 5:
                return isAndroidROrLater() ? 16 : null;
            case 6:
            case 7:
                return isAndroidROrLater() ? 17 : null;
            default:
                throw new o();
        }
    }

    private final boolean isAndroidQOrLater() {
        return Build.VERSION.SDK_INT >= 29;
    }

    private final boolean isAndroidROrLater() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private final boolean isAndroidUDCOrLater() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public final void setHapticsEnabled(boolean z11) {
        isHapticsEnabled = z11;
    }

    public final void vibrate(@NotNull View view, @NotNull HapticToken hapticToken) {
        Integer vibrateEffectByToken;
        VibrationEffect createPredefined;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(hapticToken, "hapticToken");
        if (isHapticsEnabled && isAndroidQOrLater() && (vibrateEffectByToken = getVibrateEffectByToken(hapticToken)) != null) {
            int intValue = vibrateEffectByToken.intValue();
            int i11 = WhenMappings.$EnumSwitchMapping$0[hapticToken.getCategory().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new o();
                }
                view.performHapticFeedback(intValue);
            } else {
                Vibrator vibrator = (Vibrator) a.getSystemService(view.getContext(), Vibrator.class);
                if (vibrator == null) {
                    return;
                }
                createPredefined = VibrationEffect.createPredefined(intValue);
                vibrator.vibrate(createPredefined);
            }
        }
    }
}
