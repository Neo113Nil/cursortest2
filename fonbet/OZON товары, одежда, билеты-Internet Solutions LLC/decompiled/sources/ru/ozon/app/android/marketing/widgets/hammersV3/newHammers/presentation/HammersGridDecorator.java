package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammerGridCellsOffsetDecorator;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.OldHammersV3BodyViewHolder;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersGridDecorator;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammerGridCellsOffsetDecorator;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "spanPosition", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "", "itemOffsetWithSpanPosition", "(ILandroid/view/View;Landroid/graphics/Rect;)V", "Ljava/lang/Class;", "Landroidx/recyclerview/widget/RecyclerView$C;", "decoratedVhClass", "", "needDecorate", "(Ljava/lang/Class;)Z", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersGridDecorator extends HammerGridCellsOffsetDecorator {
    private static final int screenOffset = ResourceExtKt.toPx(16);
    private static final int itemOffset = ResourceExtKt.toPx(8);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersGridDecorator(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammerGridCellsOffsetDecorator
    public void itemOffsetWithSpanPosition(int spanPosition, @NotNull View view, @NotNull Rect outRect) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        if (spanPosition == 0) {
            HammerGridCellsOffsetDecorator.updateRect$default(this, outRect, Integer.valueOf(screenOffset), null, null, null, 14, null);
            return;
        }
        if (spanPosition == 1) {
            int i11 = itemOffset;
            HammerGridCellsOffsetDecorator.updateRect$default(this, outRect, Integer.valueOf(i11), Integer.valueOf(i11), null, null, 12, null);
        } else {
            if (spanPosition != 2) {
                return;
            }
            HammerGridCellsOffsetDecorator.updateRect$default(this, outRect, null, Integer.valueOf(screenOffset), null, null, 13, null);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammerGridCellsOffsetDecorator
    public boolean needDecorate(@NotNull Class<? extends RecyclerView.C> decoratedVhClass) {
        Intrinsics.checkNotNullParameter(decoratedVhClass, "decoratedVhClass");
        return Intrinsics.d(decoratedVhClass, HammersV3BodyViewHolder.class) || Intrinsics.d(decoratedVhClass, OldHammersV3BodyViewHolder.class);
    }
}
