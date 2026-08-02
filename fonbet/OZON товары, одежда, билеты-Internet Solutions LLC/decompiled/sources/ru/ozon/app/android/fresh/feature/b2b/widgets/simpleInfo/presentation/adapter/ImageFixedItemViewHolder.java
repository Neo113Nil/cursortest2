package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ImageFixedItemViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageFixedView", "Lru/ozon/uni/android/atom/image/Image;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "rootView", "Landroid/view/ViewGroup;", "<init>", "(Lru/ozon/uni/android/atom/image/Image;Lkotlin/jvm/functions/Function1;Landroid/view/ViewGroup;)V", "bind", "item", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageFixedItemViewHolder extends ItemViewHolder<ImageDTO> {
    public static final int $stable = Image.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Image imageFixedView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageFixedItemViewHolder(@NotNull Image imageFixedView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull ViewGroup rootView) {
        super(rootView);
        Intrinsics.checkNotNullParameter(imageFixedView, "imageFixedView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.imageFixedView = imageFixedView;
        this.actionHandler = actionHandler;
    }

    public void bind(@NotNull ImageDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bindOrGone(this.imageFixedView, item, this.actionHandler);
    }
}
