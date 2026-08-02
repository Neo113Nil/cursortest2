package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithSubtitle.presentation;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithSubtitle/presentation/TravelTextWithSubtitleVO;Ll20/d;)V", "Landroid/widget/LinearLayout;", "container", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTav", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextWithSubtitleWidgetViewHolder extends k<TravelTextWithSubtitleVO> {
    private final LinearLayout container;
    private final TextAtomView subtitleTav;
    private final TextAtomView titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelTextWithSubtitleWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        LinearLayout linearLayout = containerView instanceof LinearLayout ? (LinearLayout) containerView : null;
        this.container = linearLayout;
        View view = linearLayout != null ? ViewGroupExtKt.get(linearLayout, 0) : null;
        this.titleTav = view instanceof TextAtomView ? (TextAtomView) view : null;
        KeyEvent.Callback callback = linearLayout != null ? ViewGroupExtKt.get(linearLayout, 1) : null;
        this.subtitleTav = callback instanceof TextAtomView ? (TextAtomView) callback : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelTextWithSubtitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        LinearLayout linearLayout = this.container;
        if (linearLayout != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            linearLayout.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.transparent));
            ViewExtKt.updatePadding(linearLayout, item.getOffsetHorizontal(), item.getOffsetTop(), item.getOffsetHorizontal(), item.getOffsetBottom());
            linearLayout.setGravity(item.getIsCentered() ? 17 : 8388611);
        }
        TextAtomView textAtomView = this.titleTav;
        if (textAtomView != null) {
            TextAtomHolderKt.bind$default(textAtomView, item.getTitle(), null, 2, null);
            ViewExtKt.updatePadding$default(textAtomView, 0, 0, item.getOffsetBetween(), 0, 11, null);
        }
        TextAtomView textAtomView2 = this.subtitleTav;
        if (textAtomView2 != null) {
            TextAtomHolderKt.bind$default(textAtomView2, item.getSubtitle(), null, 2, null);
        }
    }
}
