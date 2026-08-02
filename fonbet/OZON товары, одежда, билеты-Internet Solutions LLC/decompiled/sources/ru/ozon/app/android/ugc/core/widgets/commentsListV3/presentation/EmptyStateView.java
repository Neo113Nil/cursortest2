package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation;

import Im.a;
import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentsListDTO;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/EmptyStateView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "bind", "", "item", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsListDTO$EmptyStateDTO;", "bindOrGone", "show", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyStateView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable | Image.$stable;

    @NotNull
    private final Image imageView;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.commentsListEmptyStateImage);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.topMargin = dimens.getDP_12();
        image.setLayoutParams(layoutParams);
        setGravity(1);
        this.imageView = image;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.commentsListEmptyStateTitle);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setGravity(1);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View2, R$id.commentsListEmptyStateSubtitle, -2, -2);
        a11.bottomMargin = dimens.getDP_20();
        textAtomV2View2.setLayoutParams(a11);
        textAtomV2View2.setGravity(1);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleTav = textAtomV2View2;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(image);
        addView(textAtomV2View);
        addView(textAtomV2View2);
    }

    public final void bind(@NotNull CommentsListDTO.EmptyStateDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageHolderKt.bind$default(this.imageView, item.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        TextAtomV2View textAtomV2View = this.subtitleTav;
        TextHolderKt.bind$default(textAtomV2View, item.getSubtitle(), null, 2, null);
        ViewExtKt.updatePadding$default(textAtomV2View, 0, 0, 0, Dimens.INSTANCE.getDP_8(), 5, null);
    }

    public final void bindOrGone(CommentsListDTO.EmptyStateDTO item, boolean show) {
        if (item == null || !show) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(item);
        }
    }
}
