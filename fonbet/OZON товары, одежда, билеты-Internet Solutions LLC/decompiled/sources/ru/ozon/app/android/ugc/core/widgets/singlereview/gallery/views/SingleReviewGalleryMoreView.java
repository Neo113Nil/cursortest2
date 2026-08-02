package ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views;

import Cy.b;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\f¨\u0006("}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryMoreView;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/gallery/views/SingleReviewGalleryItemView;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Landroid/graphics/Bitmap;", "iconPlayBitmap", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/video/preload/PlayerPreloader;Landroid/graphics/Bitmap;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createMoreTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroid/view/View;", "getMoreTextViewIfCreated", "()Landroid/view/View;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;", "item", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "mediaPreviewCornerRadius", "Lkotlin/Function1;", "", "", "openDeeplink", "bindMedia", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "showMoreButton", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindMoreButton", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewMedia/presentation/MediaVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Lru/ozon/uni/atoms/data/common/CornerRadius;Lkotlin/jvm/functions/Function1;)V", "", "showMoreTextViewId", "I", "showMoreTextView$delegate", "LSc/j;", "getShowMoreTextView", "showMoreTextView", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SingleReviewGalleryMoreView extends SingleReviewGalleryItemView {

    /* renamed from: showMoreTextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j showMoreTextView;
    private final int showMoreTextViewId;
    public static final int $stable = 8;
    private static final int textMargin = Dimens.INSTANCE.getDP_16();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewGalleryMoreView(@NotNull Context context, @NotNull PlayerPreloader playerPreloader, @NotNull Bitmap iconPlayBitmap) {
        super(context, playerPreloader, iconPlayBitmap);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(iconPlayBitmap, "iconPlayBitmap");
        this.showMoreTextViewId = R$id.showMoreTav;
        this.showMoreTextView = DelegatesKt.lazyUnsafe(new SingleReviewGalleryMoreView$special$$inlined$lazyView$1(this, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindMoreButton$lambda$0(ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Function1 function1, View view) {
        AtomAction atomAction;
        AtomActionDTO action = largeBorderlessButton.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, largeBorderlessButton.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View createMoreTextView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(this.showMoreTextViewId);
        textAtomV2View.setMaxLines(1);
        textAtomV2View.setGravity(17);
        textAtomV2View.setTextAppearance(textAtomV2View.getContext(), R$style.TextStyle_Head_M);
        Context context2 = textAtomV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textAtomV2View.setTextColor(ThemeExtKt.themeColor(context2, R$attr.textLightKey));
        textAtomV2View.setTextIsSelectable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i11 = textMargin;
        layoutParams.setMargins(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i11, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        layoutParams.gravity = 17;
        textAtomV2View.setLayoutParams(layoutParams);
        return textAtomV2View;
    }

    private final View getMoreTextViewIfCreated() {
        Object obj;
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                obj = null;
                break;
            }
            obj = c5314e0.next();
            if (((View) obj).getId() == this.showMoreTextViewId) {
                break;
            }
        }
        return (View) obj;
    }

    private final TextAtomV2View getShowMoreTextView() {
        return (TextAtomV2View) this.showMoreTextView.getValue();
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views.SingleReviewGalleryItemView
    public void bindMedia(@NotNull MediaVO item, CornerRadius mediaPreviewCornerRadius, @NotNull Function1<? super String, Unit> openDeeplink) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(openDeeplink, "openDeeplink");
        super.bindMedia(item, mediaPreviewCornerRadius, openDeeplink);
        View moreTextViewIfCreated = getMoreTextViewIfCreated();
        if (moreTextViewIfCreated != null) {
            ViewExtKt.gone(moreTextViewIfCreated);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setPictureBackgroundTint(ThemeExtKt.themeColor(context, R$attr.layerFloor0));
    }

    public final void bindMoreButton(@NotNull MediaVO item, @NotNull ButtonV3Atom.LargeBorderlessButton showMoreButton, CornerRadius mediaPreviewCornerRadius, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(showMoreButton, "showMoreButton");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        bind(item, Boolean.TRUE, mediaPreviewCornerRadius);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setPictureBackgroundTint(ThemeExtKt.themeColor(context, R$attr.layerOverlayParanja));
        setOnClickListener(new b(7, showMoreButton, onAction));
        TextAtomV2View showMoreTextView = getShowMoreTextView();
        ViewExtKt.show(showMoreTextView);
        showMoreTextView.setText(showMoreButton.getText());
    }
}
