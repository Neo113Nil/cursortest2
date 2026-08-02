package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import com.facebook.react.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/devsupport/LogBoxDialog;", "Landroid/app/Dialog;", "context", "Landroid/app/Activity;", "reactRootView", "Landroid/view/View;", "<init>", "(Landroid/app/Activity;Landroid/view/View;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogBoxDialog extends Dialog {

    @Nullable
    private final View reactRootView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxDialog(@NotNull Activity context, @Nullable View view) {
        super(context, R.style.Theme_Catalyst_LogBox);
        Intrinsics.checkNotNullParameter(context, "context");
        this.reactRootView = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F0 onCreate$lambda$3$lambda$1(int i10, View view, F0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        androidx.core.graphics.e f10 = windowInsets.f(i10);
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(f10.f19098a, f10.f19099b, f10.f19100c, f10.f19101d);
        return F0.f19136b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F0 onCreate$lambda$3$lambda$2(Function2 function2, View p02, F0 p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (F0) function2.invoke(p02, p12);
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.reactRootView;
        if (view != null) {
            final int g10 = F0.p.g() | F0.p.a();
            final Function2 function2 = new Function2() { // from class: com.facebook.react.devsupport.V
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    F0 onCreate$lambda$3$lambda$1;
                    onCreate$lambda$3$lambda$1 = LogBoxDialog.onCreate$lambda$3$lambda$1(g10, (View) obj, (F0) obj2);
                    return onCreate$lambda$3$lambda$1;
                }
            };
            AbstractC2082d0.x0(view, new androidx.core.view.J() { // from class: com.facebook.react.devsupport.W
                @Override // androidx.core.view.J
                public final F0 f(View view2, F0 f02) {
                    F0 onCreate$lambda$3$lambda$2;
                    onCreate$lambda$3$lambda$2 = LogBoxDialog.onCreate$lambda$3$lambda$2(Function2.this, view2, f02);
                    return onCreate$lambda$3$lambda$2;
                }
            });
        }
    }
}
