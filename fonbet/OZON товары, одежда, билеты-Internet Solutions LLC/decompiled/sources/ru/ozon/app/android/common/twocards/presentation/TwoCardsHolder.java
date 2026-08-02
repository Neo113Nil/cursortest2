package ru.ozon.app.android.common.twocards.presentation;

import Ez.ViewOnClickListenerC2979c;
import W10.c;
import WZ.t;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.twocards.presentation.CardVO;
import ru.ozon.app.android.common.ui.twocards.databinding.WidgetCommonTwoCardsBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithPointsView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceWithPointsHolderKt;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001<\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010#\u001a\u00060!j\u0002`\"H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020.8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R\u0014\u00104\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00100R\u0014\u00105\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/common/twocards/presentation/TwoCardsHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/twocards/presentation/CardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "", "gradientColors", "Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;", "cardPaddingsModel", "", "setBackground", "(Ljava/util/List;Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "tintColor", "setTitle", "(Ljava/lang/String;Ljava/lang/String;)V", "updateChildPaddings", "(Lru/ozon/app/android/common/twocards/presentation/CardVO$CardPaddingsModel;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/common/twocards/presentation/CardVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/common/twocards/presentation/CardVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/common/ui/twocards/databinding/WidgetCommonTwoCardsBinding;", "binding", "Lru/ozon/app/android/common/ui/twocards/databinding/WidgetCommonTwoCardsBinding;", "", "disclosureIndex", "I", "cardBgInsetIndex", "dp16", "defaultTitleColor", "defaultDisclosureColor", "defaultCardColor", "", "defaultCardColorArray", "[I", "Landroid/graphics/drawable/GradientDrawable;", "cardBg", "Landroid/graphics/drawable/GradientDrawable;", "ru/ozon/app/android/common/twocards/presentation/TwoCardsHolder$widgetBg$1", "widgetBg", "Lru/ozon/app/android/common/twocards/presentation/TwoCardsHolder$widgetBg$1;", "two-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TwoCardsHolder extends k<CardVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCommonTwoCardsBinding binding;

    @NotNull
    private final GradientDrawable cardBg;
    private final int cardBgInsetIndex;
    private final int defaultCardColor;

    @NotNull
    private final int[] defaultCardColorArray;
    private final int defaultDisclosureColor;
    private final int defaultTitleColor;
    private final int disclosureIndex;
    private final int dp16;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TwoCardsHolder$widgetBg$1 widgetBg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoCardsHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        WidgetCommonTwoCardsBinding bind = WidgetCommonTwoCardsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.disclosureIndex = 2;
        this.cardBgInsetIndex = 1;
        this.dp16 = ResourceExtKt.toPx(16);
        this.defaultTitleColor = ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_text_secondary);
        this.defaultDisclosureColor = ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_separator);
        int themeColor = ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_bg_secondary);
        this.defaultCardColor = themeColor;
        this.defaultCardColorArray = new int[]{themeColor, themeColor};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(12));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        this.cardBg = gradientDrawable;
        TwoCardsHolder$widgetBg$1 twoCardsHolder$widgetBg$1 = new TwoCardsHolder$widgetBg$1(new Drawable[]{new ColorDrawable(ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_bg_primary)), gradientDrawable});
        this.widgetBg = twoCardsHolder$widgetBg$1;
        containerView.setOnClickListener(new ViewOnClickListenerC2979c(this, 9));
        containerView.setBackground(twoCardsHolder$widgetBg$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TwoCardsHolder twoCardsHolder, View view) {
        AtomAction action;
        CardVO boundedData = twoCardsHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        twoCardsHolder.actionHandler.invoke(action);
    }

    private final void setBackground(List<String> gradientColors, CardVO.CardPaddingsModel cardPaddingsModel) {
        if (gradientColors.isEmpty()) {
            this.cardBg.setColors(this.defaultCardColorArray);
        } else {
            List<String> list = gradientColors;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(StyleParser.INSTANCE.parseColorInt(getContext(), (String) it.next(), this.defaultCardColor)));
            }
            this.cardBg.setColors(C7714v.T0(arrayList));
        }
        TwoCardsHolder$widgetBg$1 twoCardsHolder$widgetBg$1 = this.widgetBg;
        twoCardsHolder$widgetBg$1.setLayerInsetStart(this.cardBgInsetIndex, cardPaddingsModel.getPaddingStart());
        twoCardsHolder$widgetBg$1.setLayerInsetEnd(this.cardBgInsetIndex, cardPaddingsModel.getPaddingEnd());
        twoCardsHolder$widgetBg$1.updateBounds();
    }

    private final void setTitle(String title, String tintColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        int parseColorInt = styleParser.parseColorInt(getContext(), tintColor, this.defaultTitleColor);
        int parseColorInt2 = styleParser.parseColorInt(getContext(), tintColor, this.defaultDisclosureColor);
        TextView textView = this.binding.tvTitle;
        Drawable drawable = textView.getCompoundDrawablesRelative()[this.disclosureIndex];
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(parseColorInt2, PorterDuff.Mode.SRC_IN));
        }
        textView.setText(title);
        textView.setTextColor(parseColorInt);
    }

    private final void updateChildPaddings(CardVO.CardPaddingsModel cardPaddingsModel) {
        LinearLayoutCompat constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.f(constraintLayout);
        Iterator<View> it = C5316f0.b(constraintLayout).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            }
            LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) layoutParams;
            aVar.setMarginStart(cardPaddingsModel.getPaddingStart() + this.dp16);
            aVar.setMarginEnd(cardPaddingsModel.getPaddingEnd() + this.dp16);
            view.setLayoutParams(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CardVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetCommonTwoCardsBinding widgetCommonTwoCardsBinding = this.binding;
        BadgeView badge = widgetCommonTwoCardsBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bindOrGone(badge, item.getBadge(), this.actionHandler);
        PriceWithPointsView priceWithPoints = widgetCommonTwoCardsBinding.priceWithPoints;
        Intrinsics.checkNotNullExpressionValue(priceWithPoints, "priceWithPoints");
        PriceWithPointsHolderKt.bindOrGone(priceWithPoints, item.getPriceWithPoints(), this.actionHandler);
        setTitle(item.getTitle(), item.getTintColor());
        setBackground(item.getGradientColors(), item.getCardPaddingsModel());
        updateChildPaddings(item.getCardPaddingsModel());
        LinearLayoutCompat constraintLayout = widgetCommonTwoCardsBinding.getConstraintLayout();
        TestInfo testInfo = item.getTestInfo();
        constraintLayout.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CardVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
