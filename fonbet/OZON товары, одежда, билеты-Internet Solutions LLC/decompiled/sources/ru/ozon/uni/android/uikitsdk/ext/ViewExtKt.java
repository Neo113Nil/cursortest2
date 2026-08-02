package ru.ozon.uni.android.uikitsdk.ext;

import android.R;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\b\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0011"}, d2 = {"showKeyboard", "", "Landroid/view/View;", "hideKeyboard", "", "gone", "hide", "show", "removeSelf", "enableFocusable", "attrs", "Landroid/util/AttributeSet;", "setDrawableByNameOrGone", "Landroid/widget/ImageView;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "disableFocusable", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewExtKt {
    public static final void disableFocusable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
    }

    public static final void enableFocusable(@NotNull View view, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = {R.attr.focusable, R.attr.focusableInTouchMode};
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        view.setFocusable(obtainStyledAttributes.getBoolean(C7705l.L(iArr, R.attr.focusable), true));
        view.setFocusableInTouchMode(obtainStyledAttributes.getBoolean(C7705l.L(iArr, R.attr.focusableInTouchMode), true));
        obtainStyledAttributes.recycle();
    }

    public static final void gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void hide(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
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

    public static final void removeSelf(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
    }

    public static final void setDrawableByNameOrGone(@NotNull ImageView imageView, @NotNull String name) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            int identifier = imageView.getContext().getResources().getIdentifier(name, "drawable", imageView.getContext().getApplicationContext().getPackageName());
            if (identifier == 0) {
                gone(imageView);
            } else {
                imageView.setImageResource(identifier);
                show(imageView);
            }
        } catch (Exception unused) {
            gone(imageView);
        }
    }

    public static final void show(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void showKeyboard(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    public static final void enableFocusable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
    }
}
