package ru.ozon.app.android.storefront.widgets.naviGrid3.presentation;

import Cy.b;
import Cz.ViewOnClickListenerC2788a;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.databinding.WidgetNaviGrid3Binding;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001!B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/NaviGrid3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/NaviGrid3ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;", "label", "", "bindLabel", "(Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/CornerLabel;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/NaviGrid3ItemVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "", "screenWidth", "I", "Lru/ozon/app/android/storefront/widgets/naviGrid3/presentation/NaviGrid3ItemVO;", "Lru/ozon/app/android/storefront/databinding/WidgetNaviGrid3Binding;", "binding", "Lru/ozon/app/android/storefront/databinding/WidgetNaviGrid3Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGrid3ViewHolder extends k<NaviGrid3ItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetNaviGrid3Binding binding;
    private NaviGrid3ItemVO item;

    @NotNull
    private final ComposerReferences refs;
    private final int screenWidth;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaviGrid3ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        int i11 = getContext().getResources().getConfiguration().smallestScreenWidthDp;
        this.screenWidth = i11;
        WidgetNaviGrid3Binding bind = WidgetNaviGrid3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        containerView.setOnClickListener(new ViewOnClickListenerC2788a(this, 12));
        bind.ivImage.setRatio(Float.valueOf(0.9f));
        bind.getConstraintLayout().setClipToOutline(true);
        if (i11 < 360) {
            bind.tvTitle.setTextSize(10.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(NaviGrid3ViewHolder naviGrid3ViewHolder, View view) {
        AtomAction action;
        NaviGrid3ItemVO boundedData = naviGrid3ViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        naviGrid3ViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(NaviGrid3ItemVO naviGrid3ItemVO, NaviGrid3ViewHolder naviGrid3ViewHolder, View view) {
        AtomAction badgeAction = naviGrid3ItemVO.getBadgeAction();
        if (badgeAction != null) {
            naviGrid3ViewHolder.actionHandler.invoke(badgeAction);
        }
    }

    private final void bindLabel(CornerLabel label) {
        TextView textView = this.binding.tvLabel;
        Intrinsics.f(textView);
        textView.setVisibility(label != null ? 0 : 8);
        if (label != null) {
            textView.setText(label.getText());
            Drawable background = textView.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                gradientDrawable.setColor(styleParser.parseColor(context, label.getBackgroundColor(), UniColors.TEXT_ACTION.getResId()));
            }
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView.setTextColor(styleParser2.parseColor(context2, label.getTextColor(), UniColors.TEXT_LIGHT_KEY.getResId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NaviGrid3ItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        bindLabel(item.getLabel());
        WidgetNaviGrid3Binding widgetNaviGrid3Binding = this.binding;
        AspectRatioImageView ivImage = widgetNaviGrid3Binding.ivImage;
        Intrinsics.checkNotNullExpressionValue(ivImage, "ivImage");
        ImageViewExtKt.load$default(ivImage, item.getImage(), null, null, null, null, false, null, 126, null);
        widgetNaviGrid3Binding.tvTitle.setText(item.getTitle());
        BadgeView badgeAtomV = widgetNaviGrid3Binding.badgeAtomV;
        Intrinsics.checkNotNullExpressionValue(badgeAtomV, "badgeAtomV");
        BadgeHolderKt.bindOrGone$default(badgeAtomV, item.getBadge(), (Function1) null, 2, (Object) null);
        widgetNaviGrid3Binding.badgeAtomV.setOnClickListener(new b(8, item, this));
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
