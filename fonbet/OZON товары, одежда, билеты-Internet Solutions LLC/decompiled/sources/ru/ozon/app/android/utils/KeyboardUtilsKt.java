package ru.ozon.app.android.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u0001*\u00020\u000eH\u0007¢\u0006\u0004\b\f\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "", "showKeyboard", "(Landroid/view/View;)V", "Landroidx/fragment/app/m;", "Landroid/widget/EditText;", "editText", "(Landroidx/fragment/app/m;Landroid/widget/EditText;)V", "Landroid/content/Context;", "Landroid/widget/TextView;", "textView", "(Landroid/content/Context;Landroid/widget/TextView;)V", "toggleKeyboard", "(Landroidx/fragment/app/m;)V", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "", "hideKeyboard", "(Landroidx/fragment/app/m;)Z", "(Landroid/view/View;)Z", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KeyboardUtilsKt {
    public static final boolean hideKeyboard(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        View view = componentCallbacksC5392m.getView();
        if (view != null) {
            return hideKeyboard(view);
        }
        return false;
    }

    public static final void showKeyboard(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    public static final void toggleKeyboard(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        r requireActivity = componentCallbacksC5392m.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        toggleKeyboard(requireActivity);
    }

    public static final boolean hideKeyboard(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            return inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }

    @SuppressLint({"WrongConstant"})
    public static final void toggleKeyboard(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).toggleSoftInput(1, 0);
    }

    public static final void showKeyboard(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(componentCallbacksC5392m, "<this>");
        Intrinsics.checkNotNullParameter(editText, "editText");
        Context requireContext = componentCallbacksC5392m.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        showKeyboard(requireContext, editText);
    }

    public static final void showKeyboard(@NotNull Context context, @NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.requestFocus();
        Object systemService = context.getSystemService("input_method");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(textView, 1);
    }
}
