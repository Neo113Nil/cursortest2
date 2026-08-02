package ru.ozon.uni.android.component.layout;

import Jl.C3398a;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q.C8945a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017R,\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00110\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isActivityDestroyed", "(Landroid/content/Context;)Z", "layoutResId", "", "inflateAsync", "(I)V", "Lkotlin/Function2;", "Landroid/view/View;", "action", "invokeWhenInflated", "(Lkotlin/jvm/functions/Function2;)V", "clearPendingActions", "()V", "", "pendingActions", "Ljava/util/List;", "inflatedView", "Landroid/view/View;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncFrameLayout extends FrameLayout {
    private View inflatedView;

    @NotNull
    private final List<Function2<AsyncFrameLayout, View, Unit>> pendingActions;

    public /* synthetic */ AsyncFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inflateAsync$lambda$1(AsyncFrameLayout asyncFrameLayout, View view, int i11, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(view, "view");
        asyncFrameLayout.inflatedView = view;
        Context context = asyncFrameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (asyncFrameLayout.isActivityDestroyed(context)) {
            return;
        }
        asyncFrameLayout.addView(view);
        Iterator<T> it = asyncFrameLayout.pendingActions.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(asyncFrameLayout, view);
        }
        asyncFrameLayout.pendingActions.clear();
    }

    private final boolean isActivityDestroyed(Context context) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        return activity != null && activity.isDestroyed();
    }

    public final void clearPendingActions() {
        this.pendingActions.clear();
    }

    public final void inflateAsync(int layoutResId) {
        new C8945a(getContext()).a(layoutResId, this, new C3398a(this));
    }

    public final void invokeWhenInflated(@NotNull Function2<? super AsyncFrameLayout, ? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.inflatedView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!isActivityDestroyed(context)) {
                View view = this.inflatedView;
                if (view != null) {
                    action.invoke(this, view);
                    return;
                }
                return;
            }
        }
        this.pendingActions.add(action);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pendingActions = new ArrayList();
    }
}
