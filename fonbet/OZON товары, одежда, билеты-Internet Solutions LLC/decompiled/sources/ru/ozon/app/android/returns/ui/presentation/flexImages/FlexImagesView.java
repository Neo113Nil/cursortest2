package ru.ozon.app.android.returns.ui.presentation.flexImages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0007J(\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "flexImagesAdapter", "Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesAdapter;", "flexImagesDecoration", "Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesDecoration;", "topAdditionalMarginForDeletable", "setMargin", "", "margin", "bind", "items", "", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FlexImagesView extends RecyclerView {

    @NotNull
    private final FlexImagesAdapter flexImagesAdapter;

    @NotNull
    private final FlexImagesDecoration flexImagesDecoration;
    private final int topAdditionalMarginForDeletable;

    public /* synthetic */ FlexImagesView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull List<? extends ImageVI> items, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        int i11;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        FlexImagesDecoration flexImagesDecoration = this.flexImagesDecoration;
        List<? extends ImageVI> list = items;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ImageVI) it.next()) instanceof ImageVI.Deletable) {
                    i11 = this.topAdditionalMarginForDeletable;
                    break;
                }
            }
        }
        i11 = 0;
        flexImagesDecoration.setTopAdditionalMargin(i11);
        this.flexImagesAdapter.withAction(actionHandler).submitList(items);
    }

    public final void setMargin(int margin) {
        this.flexImagesDecoration.setMargin(margin);
        invalidateItemDecorations();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexImagesView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FlexImagesAdapter flexImagesAdapter = new FlexImagesAdapter();
        this.flexImagesAdapter = flexImagesAdapter;
        FlexImagesDecoration flexImagesDecoration = new FlexImagesDecoration(context);
        this.flexImagesDecoration = flexImagesDecoration;
        this.topAdditionalMarginForDeletable = ResourceExtKt.toPx(4, context);
        setClipChildren(false);
        setId(View.generateViewId());
        setLayoutParams(new RecyclerView.p(-1, -2));
        setNestedScrollingEnabled(false);
        setLayoutManager(new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.returns.ui.presentation.flexImages.FlexImagesView.1
            {
                setFlexDirection(0);
                setJustifyContent(0);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.o
            public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams lp) {
                return new FlexboxLayoutManager.b(lp);
            }
        });
        setAdapter(flexImagesAdapter);
        addItemDecoration(flexImagesDecoration);
    }
}
