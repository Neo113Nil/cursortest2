package com.facebook.react.modules.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.facebook.react.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.z;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B!\b\u0011\u0012\f\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/dialog/AlertFragment;", "Landroidx/fragment/app/m;", "Landroid/content/DialogInterface$OnClickListener;", "<init>", "()V", "Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;", "Lcom/facebook/react/modules/dialog/DialogModule;", "listener", "Landroid/os/Bundle;", "arguments", "(Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;Landroid/os/Bundle;)V", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "", "which", "", ViewProps.ON_CLICK, "(Landroid/content/DialogInterface;I)V", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lcom/facebook/react/modules/dialog/DialogModule$AlertFragmentListener;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"fragment_subclass_nonempty_constructor"})
/* loaded from: classes2.dex */
public final class AlertFragment extends DialogInterfaceOnCancelListenerC2163m implements DialogInterface.OnClickListener {

    @NotNull
    public static final String ARG_BUTTON_NEGATIVE = "button_negative";

    @NotNull
    public static final String ARG_BUTTON_NEUTRAL = "button_neutral";

    @NotNull
    public static final String ARG_BUTTON_POSITIVE = "button_positive";

    @NotNull
    public static final String ARG_ITEMS = "items";

    @NotNull
    public static final String ARG_MESSAGE = "message";

    @NotNull
    public static final String ARG_TITLE = "title";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final DialogModule.AlertFragmentListener listener;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J \u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/dialog/AlertFragment$Companion;", "", "<init>", "()V", "ARG_TITLE", "", "ARG_MESSAGE", "ARG_BUTTON_POSITIVE", "ARG_BUTTON_NEGATIVE", "ARG_BUTTON_NEUTRAL", "ARG_ITEMS", "createDialog", "Landroid/app/Dialog;", "activityContext", "Landroid/content/Context;", "arguments", "Landroid/os/Bundle;", "fragment", "Landroid/content/DialogInterface$OnClickListener;", "isAppCompatTheme", "", "getAccessibleTitle", "Landroid/view/View;", "titleText", "createAppCompatDialog", "createAppDialog", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Dialog createAppCompatDialog(Context activityContext, Bundle arguments, DialogInterface.OnClickListener fragment) {
            a.C0340a c0340a = new a.C0340a(activityContext);
            if (arguments.containsKey("title")) {
                String str = (String) S7.a.c(arguments.getString("title"));
                Intrinsics.checkNotNull(str);
                c0340a.c(getAccessibleTitle(activityContext, str));
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_POSITIVE)) {
                c0340a.m(arguments.getString(AlertFragment.ARG_BUTTON_POSITIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEGATIVE)) {
                c0340a.h(arguments.getString(AlertFragment.ARG_BUTTON_NEGATIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEUTRAL)) {
                c0340a.i(arguments.getString(AlertFragment.ARG_BUTTON_NEUTRAL), fragment);
            }
            if (arguments.containsKey("message")) {
                c0340a.g(arguments.getString("message"));
            }
            if (arguments.containsKey(AlertFragment.ARG_ITEMS)) {
                c0340a.e(arguments.getCharSequenceArray(AlertFragment.ARG_ITEMS), fragment);
            }
            androidx.appcompat.app.a create = c0340a.create();
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        @Deprecated(message = "non-AppCompat dialogs are deprecated and will be removed in a future version.", replaceWith = @ReplaceWith(expression = "createAppCompatDialog(activityContext, arguments, fragment)", imports = {}))
        private final Dialog createAppDialog(Context activityContext, Bundle arguments, DialogInterface.OnClickListener fragment) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activityContext);
            if (arguments.containsKey("title")) {
                String str = (String) S7.a.c(arguments.getString("title"));
                Intrinsics.checkNotNull(str);
                builder.setCustomTitle(getAccessibleTitle(activityContext, str));
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_POSITIVE)) {
                builder.setPositiveButton(arguments.getString(AlertFragment.ARG_BUTTON_POSITIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEGATIVE)) {
                builder.setNegativeButton(arguments.getString(AlertFragment.ARG_BUTTON_NEGATIVE), fragment);
            }
            if (arguments.containsKey(AlertFragment.ARG_BUTTON_NEUTRAL)) {
                builder.setNeutralButton(arguments.getString(AlertFragment.ARG_BUTTON_NEUTRAL), fragment);
            }
            if (arguments.containsKey("message")) {
                builder.setMessage(arguments.getString("message"));
            }
            if (arguments.containsKey(AlertFragment.ARG_ITEMS)) {
                builder.setItems(arguments.getCharSequenceArray(AlertFragment.ARG_ITEMS), fragment);
            }
            AlertDialog create = builder.create();
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return create;
        }

        private final View getAccessibleTitle(Context activityContext, String titleText) {
            View inflate = LayoutInflater.from(activityContext).inflate(R.layout.alert_title_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            Object c10 = S7.a.c(inflate.findViewById(R.id.alert_title));
            Intrinsics.checkNotNullExpressionValue(c10, "assertNotNull(...)");
            final TextView textView = (TextView) c10;
            textView.setText(titleText);
            textView.setFocusable(true);
            if (Build.VERSION.SDK_INT >= 28) {
                textView.setAccessibilityHeading(true);
                return inflate;
            }
            AbstractC2082d0.l0(textView, new C2075a() { // from class: com.facebook.react.modules.dialog.AlertFragment$Companion$getAccessibleTitle$1
                @Override // androidx.core.view.C2075a
                public void onInitializeAccessibilityNodeInfo(View view, z info) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(info, "info");
                    super.onInitializeAccessibilityNodeInfo(textView, info);
                    info.H0(true);
                }
            });
            return inflate;
        }

        private final boolean isAppCompatTheme(Context activityContext) {
            TypedArray obtainStyledAttributes = activityContext.obtainStyledAttributes(j.AppCompatTheme);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            boolean hasValue = obtainStyledAttributes.hasValue(j.f55351q0);
            obtainStyledAttributes.recycle();
            return hasValue;
        }

        @JvmStatic
        @NotNull
        public final Dialog createDialog(@NotNull Context activityContext, @NotNull Bundle arguments, @NotNull DialogInterface.OnClickListener fragment) {
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return isAppCompatTheme(activityContext) ? createAppCompatDialog(activityContext, arguments, fragment) : createAppDialog(activityContext, arguments, fragment);
        }

        private Companion() {
        }
    }

    public AlertFragment() {
        this.listener = null;
    }

    @JvmStatic
    @NotNull
    public static final Dialog createDialog(@NotNull Context context, @NotNull Bundle bundle, @NotNull DialogInterface.OnClickListener onClickListener) {
        return INSTANCE.createDialog(context, bundle, onClickListener);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@NotNull DialogInterface dialog, int which) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        DialogModule.AlertFragmentListener alertFragmentListener = this.listener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onClick(dialog, which);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Companion companion = INSTANCE;
        AbstractActivityC2168s requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        return companion.createDialog(requireActivity, requireArguments, this);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        DialogModule.AlertFragmentListener alertFragmentListener = this.listener;
        if (alertFragmentListener != null) {
            alertFragmentListener.onDismiss(dialog);
        }
    }

    @SuppressLint({"ValidFragment"})
    public AlertFragment(@Nullable DialogModule.AlertFragmentListener alertFragmentListener, @Nullable Bundle bundle) {
        this.listener = alertFragmentListener;
        setArguments(bundle);
    }
}
