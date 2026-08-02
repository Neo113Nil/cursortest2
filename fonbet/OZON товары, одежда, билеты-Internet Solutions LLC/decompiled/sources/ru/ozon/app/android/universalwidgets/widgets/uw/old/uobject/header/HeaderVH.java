package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header;

import Fs.ViewOnClickListenerC3059a;
import WZ.t;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.universalwidgets.databinding.ItemUwidgetHeaderBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.OpenNestedPageExtKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.HeaderVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.UWDeeplink;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\fJ#\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/header/HeaderVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "bindStub", "()V", "item", "bind", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;)V", "onViewInVisibleBounds", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/HeaderVO;", "Ll20/d;", "Lru/ozon/app/android/universalwidgets/databinding/ItemUwidgetHeaderBinding;", "binding", "Lru/ozon/app/android/universalwidgets/databinding/ItemUwidgetHeaderBinding;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeaderVH extends k<HeaderVO> {

    @NotNull
    private final ItemUwidgetHeaderBinding binding;
    private d info;
    private HeaderVO item;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderVH(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        ItemUwidgetHeaderBinding bind = ItemUwidgetHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.itemView.setOnClickListener(new ViewOnClickListenerC3059a(2, this, containerView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(HeaderVH headerVH, View view, View view2) {
        t tokenizedEvent;
        UWDeeplink deeplink;
        String str;
        HeaderVO headerVO = headerVH.item;
        if (headerVO != null && (deeplink = headerVO.getDeeplink()) != null) {
            ComposerReferences composerReferences = headerVH.ref;
            HeaderVO headerVO2 = headerVH.item;
            if (headerVO2 == null || (str = headerVO2.toString()) == null) {
                str = "";
            }
            view.setTransitionName("transition_view".concat(str));
            Unit unit = Unit.f71690a;
            OpenNestedPageExtKt.navigate(deeplink, composerReferences, "HeaderVH", U.i(new Pair("transition_view", view)));
        }
        HeaderVO headerVO3 = headerVH.item;
        if (headerVO3 == null || (tokenizedEvent = headerVO3.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(headerVH.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    private final void bindStub() {
        ItemUwidgetHeaderBinding itemUwidgetHeaderBinding = this.binding;
        TextView uWidgetHeaderTitleTv = itemUwidgetHeaderBinding.uWidgetHeaderTitleTv;
        Intrinsics.checkNotNullExpressionValue(uWidgetHeaderTitleTv, "uWidgetHeaderTitleTv");
        ViewExtKt.gone(uWidgetHeaderTitleTv);
        TextView uWidgetHeaderSubTitleTv = itemUwidgetHeaderBinding.uWidgetHeaderSubTitleTv;
        Intrinsics.checkNotNullExpressionValue(uWidgetHeaderSubTitleTv, "uWidgetHeaderSubTitleTv");
        ViewExtKt.gone(uWidgetHeaderSubTitleTv);
        ImageView uWidgetHeaderDisclosureIv = itemUwidgetHeaderBinding.uWidgetHeaderDisclosureIv;
        Intrinsics.checkNotNullExpressionValue(uWidgetHeaderDisclosureIv, "uWidgetHeaderDisclosureIv");
        ViewExtKt.gone(uWidgetHeaderDisclosureIv);
        itemUwidgetHeaderBinding.uWidgetHeaderCl.setBackground(null);
        itemUwidgetHeaderBinding.uWidgetHeaderCl.setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
        this.itemView.getLayoutParams().height = ResourceExtKt.toPx(12);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        HeaderVO headerVO = this.item;
        if (headerVO == null || (tokenizedEvent = headerVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.info = info;
        if (Intrinsics.d(item.getType(), "stub")) {
            bindStub();
        } else {
            bind(item);
        }
    }

    private final void bind(HeaderVO item) {
        ItemUwidgetHeaderBinding itemUwidgetHeaderBinding = this.binding;
        TextView uWidgetHeaderTitleTv = itemUwidgetHeaderBinding.uWidgetHeaderTitleTv;
        Intrinsics.checkNotNullExpressionValue(uWidgetHeaderTitleTv, "uWidgetHeaderTitleTv");
        TextViewExtKt.setTextOrGone(uWidgetHeaderTitleTv, item.getTitle());
        TextView uWidgetHeaderSubTitleTv = itemUwidgetHeaderBinding.uWidgetHeaderSubTitleTv;
        Intrinsics.checkNotNullExpressionValue(uWidgetHeaderSubTitleTv, "uWidgetHeaderSubTitleTv");
        TextViewExtKt.setTextOrGone(uWidgetHeaderSubTitleTv, item.getSubtitle());
        ImageView uWidgetHeaderDisclosureIv = itemUwidgetHeaderBinding.uWidgetHeaderDisclosureIv;
        Intrinsics.checkNotNullExpressionValue(uWidgetHeaderDisclosureIv, "uWidgetHeaderDisclosureIv");
        ViewExtKt.showOrGone(uWidgetHeaderDisclosureIv, item.getDisclosure());
        itemUwidgetHeaderBinding.uWidgetHeaderCl.setBackground(getContext().getDrawable(R$drawable.bg_white_ripple_blue));
        itemUwidgetHeaderBinding.getConstraintLayout().getLayoutParams().height = -2;
    }
}
