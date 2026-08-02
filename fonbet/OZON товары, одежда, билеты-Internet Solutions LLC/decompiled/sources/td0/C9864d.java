package td0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: td0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9864d {
    public static final void a(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Context requireContext = componentCallbacksC5392m.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Intrinsics.checkNotNullParameter(requireContext, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        ClipboardManager clipboardManager = (ClipboardManager) requireContext.getSystemService(ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", text));
        }
    }

    public static void b(Activity activity, String value) {
        ClipData newPlainText;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter("", "label");
        Intrinsics.checkNotNullParameter(value, "value");
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        if (clipboardManager == null || (newPlainText = ClipData.newPlainText("", value)) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(newPlainText);
    }
}
