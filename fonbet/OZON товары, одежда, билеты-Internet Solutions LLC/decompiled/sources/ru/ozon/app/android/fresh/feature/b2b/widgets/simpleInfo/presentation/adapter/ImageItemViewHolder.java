package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.data.SimpleInfoImageDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ImageItemViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/data/SimpleInfoImageDTO;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/atom/image/Image;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "setupMargins", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageItemViewHolder extends ItemViewHolder<SimpleInfoImageDTO> {
    public static final int $stable = Image.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Image imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageItemViewHolder(@NotNull Image imageView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(imageView);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.imageView = imageView;
        this.actionHandler = actionHandler;
    }

    private final void setupMargins(SimpleInfoImageDTO item) {
        int i11;
        int i12;
        int i13;
        Context context = this.imageView.getContext();
        Integer leftMargin = item.getLeftMargin();
        int i14 = 0;
        if (leftMargin != null) {
            int intValue = leftMargin.intValue();
            Intrinsics.f(context);
            i11 = ResourceExtKt.toPx(intValue, context);
        } else {
            i11 = 0;
        }
        Integer topMargin = item.getTopMargin();
        if (topMargin != null) {
            int intValue2 = topMargin.intValue();
            Intrinsics.f(context);
            i12 = ResourceExtKt.toPx(intValue2, context);
        } else {
            i12 = 0;
        }
        Integer rightMargin = item.getRightMargin();
        if (rightMargin != null) {
            int intValue3 = rightMargin.intValue();
            Intrinsics.f(context);
            i13 = ResourceExtKt.toPx(intValue3, context);
        } else {
            i13 = 0;
        }
        Integer bottomMargin = item.getBottomMargin();
        if (bottomMargin != null) {
            int intValue4 = bottomMargin.intValue();
            Intrinsics.f(context);
            i14 = ResourceExtKt.toPx(intValue4, context);
        }
        Image image = this.imageView;
        ViewGroup.LayoutParams layoutParams = image.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i11, i12, i13, i14);
        image.setLayoutParams(marginLayoutParams);
    }

    public void bind(@NotNull SimpleInfoImageDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bindOrGone(this.imageView, item.getImage(), this.actionHandler);
        setupMargins(item);
        this.imageView.setContentDescription(item.getImage().getType().getValue());
    }
}
