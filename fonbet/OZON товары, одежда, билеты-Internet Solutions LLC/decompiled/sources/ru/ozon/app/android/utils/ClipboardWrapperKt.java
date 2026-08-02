package ru.ozon.app.android.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"toClipboard", "", "Landroid/content/Context;", "label", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClipboardWrapperKt {
    public static final void toClipboard(@NotNull Context context, @NotNull String label, @NotNull String value) {
        ClipData newPlainText;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null || (newPlainText = ClipData.newPlainText(label, value)) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(newPlainText);
    }

    public static /* synthetic */ void toClipboard$default(Context context, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        toClipboard(context, str, str2);
    }
}
