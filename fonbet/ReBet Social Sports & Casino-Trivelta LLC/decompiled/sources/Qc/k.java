package Qc;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class k {
    public static final UIManager a(UIManagerHelper uIManagerHelper, ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(uIManagerHelper, "<this>");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        if (uIManager != null) {
            return uIManager;
        }
        throw new IllegalStateException("[RNScreens] UIManager must not be null");
    }
}
