package ec;

import android.os.Build;
import androidx.biometric.BiometricPrompt;
import cc.InterfaceC2910b;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f45929a = new j();

    @NotNull
    private static final String[] ONE_PLUS_MODELS_WITHOUT_BIOMETRIC_BUG = {"A0001", "ONE A2001", "ONE A2003", "ONE A2005", "ONE E1001", "ONE E1003", "ONE E1005", "ONEPLUS A3000", "ONEPLUS SM-A3000", "ONEPLUS A3003", "ONEPLUS A3010", "ONEPLUS A5000", "ONEPLUS A5010", "ONEPLUS A6000", "ONEPLUS A6003"};

    public final c a(ReactApplicationContext reactContext, InterfaceC2910b storage, BiometricPrompt.d promptInfo) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        return storage.e() ? b() ? new h(reactContext, storage, promptInfo) : new e(reactContext, storage, promptInfo) : new i();
    }

    public final boolean b() {
        return StringsKt.equals(Build.BRAND, "oneplus", true) && !ArraysKt.contains(ONE_PLUS_MODELS_WITHOUT_BIOMETRIC_BUG, Build.MODEL);
    }
}
