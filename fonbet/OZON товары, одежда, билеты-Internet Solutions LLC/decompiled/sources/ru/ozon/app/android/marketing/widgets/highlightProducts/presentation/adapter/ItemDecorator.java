package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001b\u0010%\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/ItemDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "dividerPosition", "setDividerPosition", "(I)V", "", "isMiniWidget", "setDividerHeight", "(Z)V", "Landroid/content/Context;", "I", "nonMiniDividerHeight", "dividerHeight", "dividerColor$delegate", "LSc/j;", "getDividerColor", "()I", "dividerColor", "Landroid/graphics/drawable/GradientDrawable;", "divider$delegate", "getDivider", "()Landroid/graphics/drawable/GradientDrawable;", "divider", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemDecorator extends RecyclerView.n {

    @NotNull
    private final Context context;

    /* renamed from: divider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j divider;

    /* renamed from: dividerColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dividerColor;
    private int dividerHeight;
    private int dividerPosition;
    private final int nonMiniDividerHeight;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dividerSize = ResourceExtKt.toPx(1);
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dividerDefaultHeight = ResourceExtKt.toPx(24);
    private static final int dividerSelectHeight = ResourceExtKt.toPx(40);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/ItemDecorator$Companion;", "", "<init>", "()V", "dividerSize", "", "getDividerSize", "()I", "dp4", "dividerDefaultHeight", "dividerSelectHeight", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDividerSize() {
            return ItemDecorator.dividerSize;
        }

        private Companion() {
        }
    }

    public ItemDecorator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dividerPosition = -1;
        int i11 = AppTypeResolver.INSTANCE.isSelect(context) ? dividerSelectHeight : dividerDefaultHeight;
        this.nonMiniDividerHeight = i11;
        this.dividerHeight = i11;
        this.dividerColor = k.b(new ItemDecorator$dividerColor$2(this));
        this.divider = k.b(new ItemDecorator$divider$2(this));
    }

    private final GradientDrawable getDivider() {
        return (GradientDrawable) this.divider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDividerColor() {
        return ((Number) this.dividerColor.getValue()).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (parent.findContainingViewHolder(view) != null) {
            int i11 = this.dividerPosition;
            if (childAdapterPosition == i11) {
                outRect.left = dp4;
            }
            if (childAdapterPosition == i11 - 1) {
                outRect.right = dp4;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        View view;
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<View> it = C5316f0.b(parent).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext() || (childAdapterPosition = parent.getChildAdapterPosition((view = (View) c5314e0.next()))) == -1) {
                return;
            }
            if (childAdapterPosition == this.dividerPosition - 1) {
                int right = view.getRight();
                ViewGroup viewGroup = (ViewGroup) view;
                View view2 = (View) l.l(C5316f0.b(viewGroup));
                int bottom = (((viewGroup.getBottom() - viewGroup.getTop()) + (view2 != null ? view2.getTop() : 0)) / 2) - (this.dividerHeight / 2);
                getDivider().setBounds(new Rect(right, bottom, getDivider().getIntrinsicWidth() + right, this.dividerHeight + bottom));
                getDivider().draw(canvas);
            }
        }
    }

    public final void setDividerHeight(boolean isMiniWidget) {
        this.dividerHeight = isMiniWidget ? dividerDefaultHeight : this.nonMiniDividerHeight;
    }

    public final void setDividerPosition(int dividerPosition) {
        this.dividerPosition = dividerPosition;
    }
}
