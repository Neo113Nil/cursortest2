package ru.ozon.app.android.uikit.view.input;

import AU.a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/uikit/view/input/ToggleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "isChecked", "()Z", "checked", "", "setChecked", "(Z)V", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "(Landroid/view/accessibility/AccessibilityEvent;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "toggle", "()V", "Lkotlin/Function1;", "toggleListener", "Lkotlin/jvm/functions/Function1;", "getToggleListener", "()Lkotlin/jvm/functions/Function1;", "setToggleListener", "(Lkotlin/jvm/functions/Function1;)V", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToggleImageView extends AppCompatImageView implements Checkable {
    private Function1<? super Boolean, Unit> toggleListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOnClickListener(new a(this, 14));
    }

    @Override // android.widget.ImageView, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = ToggleImageView.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return isSelected();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        if (event != null) {
            event.setChecked(isSelected());
        }
        super.onInitializeAccessibilityEvent(event);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        if (info != null) {
            info.setCheckable(true);
        }
        if (info != null) {
            info.setChecked(isSelected());
        }
        super.onInitializeAccessibilityNodeInfo(info);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        setSelected(checked);
        Function1<? super Boolean, Unit> function1 = this.toggleListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(checked));
        }
        sendAccessibilityEvent(0);
    }

    public final void setToggleListener(Function1<? super Boolean, Unit> function1) {
        this.toggleListener = function1;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
