package ru.ozon.fintech.ui.row.base;

import C.D;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/fintech/ui/row/base/FrameRoundRow;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getRounded", "Landroid/view/ViewOutlineProvider;", "stateRadius", "(Ljava/lang/Integer;)Landroid/view/ViewOutlineProvider;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class FrameRoundRow extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameRoundRow(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ViewOutlineProvider getRounded(final Integer stateRadius) {
        return new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.row.base.FrameRoundRow$getRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Integer num = stateRadius;
                int d11 = D.d(num != null ? num.intValue() : 0);
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                if (view != null) {
                    view.setTag(new Pair("radius", Integer.valueOf(d11)));
                }
            }
        };
    }
}
