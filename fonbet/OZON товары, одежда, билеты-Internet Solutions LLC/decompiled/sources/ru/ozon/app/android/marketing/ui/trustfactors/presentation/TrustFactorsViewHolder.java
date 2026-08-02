package ru.ozon.app.android.marketing.ui.trustfactors.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import XT.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.ui.trustfactors.data.Alignment;
import ru.ozon.app.android.marketing.ui.trustfactors.databinding.ItemTrustFactorBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001'B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Landroid/widget/LinearLayout;", "containerView", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Landroid/widget/LinearLayout;LWZ/l;)V", "Lru/ozon/app/android/marketing/ui/trustfactors/databinding/ItemTrustFactorBinding;", "", "index", "Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorItemVO;", "item", "", "bindItem", "(Lru/ozon/app/android/marketing/ui/trustfactors/databinding/ItemTrustFactorBinding;ILru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorItemVO;)V", "setAlignment", "(Lru/ozon/app/android/marketing/ui/trustfactors/databinding/ItemTrustFactorBinding;Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorItemVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/widget/LinearLayout;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrustFactorsViewHolder extends k<TrustFactorsVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LinearLayout containerView;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsViewHolder$Companion;", "", "<init>", "()V", "TRUST_FACTORS_LOCATOR", "", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustFactorsViewHolder(@NotNull ComposerReferences refs, @NotNull LinearLayout containerView, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void bindItem(final ItemTrustFactorBinding itemTrustFactorBinding, int i11, TrustFactorItemVO trustFactorItemVO) {
        setAlignment(itemTrustFactorBinding, trustFactorItemVO);
        itemTrustFactorBinding.getConstraintLayout().setContentDescription("trustFactors_" + i11);
        IconView icon = itemTrustFactorBinding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        IconHolderKt.bindOrGone(icon, trustFactorItemVO.getIcon(), this.actionHandler);
        itemTrustFactorBinding.title.setMovementMethod(null);
        TextAtomV2View title = itemTrustFactorBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind(title, trustFactorItemVO.getTitle(), this.actionHandler);
        final TextAtomV2View textAtomV2View = itemTrustFactorBinding.title;
        textAtomV2View.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.marketing.ui.trustfactors.presentation.TrustFactorsViewHolder$bindItem$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (textAtomV2View.getMeasuredWidth() <= 0 || textAtomV2View.getMeasuredHeight() <= 0) {
                    return;
                }
                textAtomV2View.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                TextAtomV2View textAtomV2View2 = itemTrustFactorBinding.title;
                textAtomV2View2.setWidth(textAtomV2View2.getMeasuredWidth() + 1);
            }
        });
        itemTrustFactorBinding.subtitle.setMovementMethod(null);
        TextAtomV2View subtitle = itemTrustFactorBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextHolderKt.bind(subtitle, trustFactorItemVO.getSubtitle(), this.actionHandler);
        itemTrustFactorBinding.getConstraintLayout().setOnClickListener(new a(3, trustFactorItemVO, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindItem$lambda$4(TrustFactorItemVO trustFactorItemVO, TrustFactorsViewHolder trustFactorsViewHolder, View view) {
        AtomAction action = trustFactorItemVO.getAction();
        if (action != null) {
            trustFactorsViewHolder.actionHandler.invoke(action);
        }
    }

    private final void setAlignment(ItemTrustFactorBinding itemTrustFactorBinding, TrustFactorItemVO trustFactorItemVO) {
        if (trustFactorItemVO.getAlignment() == Alignment.LEFT) {
            IconView icon = itemTrustFactorBinding.icon;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.f41598E = 0.0f;
            icon.setLayoutParams(bVar);
            TextAtomV2View subtitle = itemTrustFactorBinding.subtitle;
            Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
            ViewGroup.LayoutParams layoutParams2 = subtitle.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            ((ViewGroup.MarginLayoutParams) bVar2).width = -2;
            bVar2.f41616W = false;
            bVar2.f41658v = -1;
            subtitle.setLayoutParams(bVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TrustFactorsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.removeAllViewsInLayout();
        this.containerView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBackgroundColor(), R$color.layer_floor_1));
        int i11 = 0;
        for (Object obj : item.getTrustFactors()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ItemTrustFactorBinding inflate = ItemTrustFactorBinding.inflate(LayoutInflater.from(getContext()), this.containerView, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            bindItem(inflate, i11, (TrustFactorItemVO) obj);
            i11 = i12;
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TrustFactorsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        Iterator<T> it = item.getTrustFactors().iterator();
        while (it.hasNext()) {
            t tokenizedEvent2 = ((TrustFactorItemVO) it.next()).getTokenizedEvent();
            if (tokenizedEvent2 != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent2, null, 2, null);
            }
        }
    }
}
