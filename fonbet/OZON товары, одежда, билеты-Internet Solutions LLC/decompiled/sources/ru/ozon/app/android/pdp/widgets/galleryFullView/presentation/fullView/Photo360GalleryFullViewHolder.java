package ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.ItemGalleryFullView360Binding;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/Photo360GalleryFullViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/fullView/BaseGalleryFullViewHolder;", "photo360View", "Lru/ozon/app/android/pdp/databinding/ItemGalleryFullView360Binding;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/pdp/databinding/ItemGalleryFullView360Binding;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Photo360;", "(Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GalleryFullViewVO$GalleryItemVO$Photo360;)Lkotlin/Unit;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Photo360GalleryFullViewHolder extends BaseGalleryFullViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemGalleryFullView360Binding photo360View;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Photo360GalleryFullViewHolder(@NotNull ItemGalleryFullView360Binding photo360View, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(photo360View, "photo360View");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ConstraintLayout constraintLayout = photo360View.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.photo360View = photo360View;
        this.actionHandler = actionHandler;
    }

    public final Unit bind(@NotNull GalleryFullViewVO.GalleryItemVO.Photo360 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView preview360Iv = this.photo360View.preview360Iv;
        Intrinsics.checkNotNullExpressionValue(preview360Iv, "preview360Iv");
        ImageViewExtKt.load$default(preview360Iv, item.getPreviewUrl(), null, null, null, null, false, null, 126, null);
        SmallButtonView button360Sbv = this.photo360View.button360Sbv;
        Intrinsics.checkNotNullExpressionValue(button360Sbv, "button360Sbv");
        WrappedButtonHolderKt.bind(button360Sbv, item.getButton(), this.actionHandler);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.photo360View.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor == null) {
            return null;
        }
        this.photo360View.getConstraintLayout().getBackground().setColorFilter(new PorterDuffColorFilter(parseColor.intValue(), PorterDuff.Mode.SRC_IN));
        return Unit.f71690a;
    }
}
