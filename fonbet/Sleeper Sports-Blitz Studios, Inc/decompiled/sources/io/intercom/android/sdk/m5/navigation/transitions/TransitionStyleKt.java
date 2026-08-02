package io.intercom.android.sdk.m5.navigation.transitions;

import android.os.Bundle;
import androidx.core.os.BundleCompat;
import androidx.navigation.NavType;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionStyle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"TransitionArgNavType", "Landroidx/navigation/NavType;", "Lio/intercom/android/sdk/m5/navigation/transitions/TransitionArgs;", "getTransitionArgNavType", "()Landroidx/navigation/NavType;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransitionStyleKt {
    private static final NavType<TransitionArgs> TransitionArgNavType = new NavType<TransitionArgs>() { // from class: io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt$TransitionArgNavType$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public TransitionArgs get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            TransitionArgs transitionArgs = (TransitionArgs) BundleCompat.getParcelable(bundle, key, TransitionArgs.class);
            return transitionArgs == null ? new TransitionArgs(null, null, null, null, 15, null) : transitionArgs;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.navigation.NavType
        public TransitionArgs parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return toTransitionArgs(value);
        }

        @Override // androidx.navigation.NavType
        public void put(Bundle bundle, String key, TransitionArgs value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putParcelable(key, value);
        }

        private final TransitionArgs toTransitionArgs(String transitionArgs) {
            Object fromJson = new Gson().fromJson(transitionArgs, (Class<Object>) TransitionArgs.class);
            Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
            return (TransitionArgs) fromJson;
        }
    };

    public static final NavType<TransitionArgs> getTransitionArgNavType() {
        return TransitionArgNavType;
    }
}
