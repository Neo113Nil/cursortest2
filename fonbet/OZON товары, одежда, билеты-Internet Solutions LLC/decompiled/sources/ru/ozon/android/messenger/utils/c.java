package ru.ozon.android.messenger.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class c {
    public static final androidx.appcompat.app.g a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof androidx.appcompat.app.g) {
            return (androidx.appcompat.app.g) context;
        }
        return null;
    }

    public static int b(int i11, Context context) {
        TypedValue typedValue = new TypedValue();
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.data;
    }

    @NotNull
    public static final LayoutInflater c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        LayoutInflater from = LayoutInflater.from(context);
        Intrinsics.f(from);
        return from;
    }

    @NotNull
    public static final String d(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = ru.ozon.android.messenger.framework.data.a.c(context).getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public static final OzonSpannableString e(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String string = ru.ozon.android.messenger.framework.data.a.c(context).getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new OzonSpannableString(string);
    }

    public static void f(Context context, String value) {
        ClipData newPlainText;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter("", "label");
        Intrinsics.checkNotNullParameter(value, "value");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null || (newPlainText = ClipData.newPlainText("", value)) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(newPlainText);
    }
}
