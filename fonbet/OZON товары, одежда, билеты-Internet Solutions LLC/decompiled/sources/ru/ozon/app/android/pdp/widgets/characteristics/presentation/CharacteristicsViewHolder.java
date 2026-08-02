package ru.ozon.app.android.pdp.widgets.characteristics.presentation;

import A00.a;
import AD.b;
import Vg.d;
import W10.c;
import WZ.l;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.lifecycle.C5423j;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.PdpWidgetCharacteristicsBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.widgets.characteristics.core.PdpCharacteristicsExpandedUpdateKey;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsViewHolder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00120)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;", "", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;LVg/d;)V", "", "isExpanded", "", "updateList", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;Z)V", "characteristicsVO", "updateExpandButton", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;Z)Lkotlin/Unit;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetCharacteristicsBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpWidgetCharacteristicsBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsAdapter;", "characteristicsAdapter", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsViewHolder extends TabEmbeddedWidgetViewHolder<CharacteristicsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PdpWidgetCharacteristicsBinding binding;

    @NotNull
    private final CharacteristicsAdapter characteristicsAdapter;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$u$c;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(LA00/a$u$c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<a.u.c, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(a.u.c cVar) {
            invoke2(cVar);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(a.u.c cVar) {
            CharacteristicsVO characteristicsVO = (CharacteristicsVO) CharacteristicsViewHolder.this.getBoundedData();
            if (characteristicsVO != null) {
                CharacteristicsViewHolder.this.updateList(characteristicsVO, characteristicsVO.getIsExpandedDefault());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(containerView, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        PdpWidgetCharacteristicsBinding bind = PdpWidgetCharacteristicsBinding.bind(getContainerView());
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new CharacteristicsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        CharacteristicsAdapter characteristicsAdapter = new CharacteristicsAdapter(buildHandler, tokenizedAnalytics);
        this.characteristicsAdapter = characteristicsAdapter;
        RecyclerView recyclerView = bind.characteristicsRv;
        recyclerView.setItemAnimator(null);
        recyclerView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        recyclerView.setAdapter(characteristicsAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new CharacteristicsDecoration(context));
        C5423j events = refs.getController().getEvents();
        T t2 = new T();
        t2.a(events, new CharacteristicsViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new CharacteristicsViewHolder$special$$inlined$filterIsInstance$1(t2)));
        t2.observe(refs.getContainer().g(), new CharacteristicsViewHolderKt$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
        bind.pdpTextDescriptionExpandLayer.setOnClickListener(new b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(CharacteristicsViewHolder characteristicsViewHolder, View view) {
        CharacteristicsButton characteristicsButton;
        l lVar = characteristicsViewHolder.tokenizedAnalytics;
        CharacteristicsVO characteristicsVO = (CharacteristicsVO) characteristicsViewHolder.getBoundedData();
        TokenizedAnalyticsExtKt.processClickEvents(lVar, (characteristicsVO == null || (characteristicsButton = characteristicsVO.getCharacteristicsButton()) == null) ? null : characteristicsButton.getTokenizedEvent());
        characteristicsViewHolder.refs.getController().update(new PdpCharacteristicsExpandedUpdateKey(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit updateExpandButton(CharacteristicsVO characteristicsVO, boolean isExpanded) {
        if (characteristicsVO.getCharacteristicsButton() == null || isExpanded) {
            Layer pdpTextDescriptionExpandLayer = this.binding.pdpTextDescriptionExpandLayer;
            Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionExpandLayer, "pdpTextDescriptionExpandLayer");
            ViewExtKt.gone(pdpTextDescriptionExpandLayer);
            return Unit.f71690a;
        }
        Layer pdpTextDescriptionExpandLayer2 = this.binding.pdpTextDescriptionExpandLayer;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionExpandLayer2, "pdpTextDescriptionExpandLayer");
        ViewExtKt.show(pdpTextDescriptionExpandLayer2);
        TextAtomV2View pdpTextDescriptionExpandTav = this.binding.pdpTextDescriptionExpandTav;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionExpandTav, "pdpTextDescriptionExpandTav");
        TextHolderKt.bind$default(pdpTextDescriptionExpandTav, characteristicsVO.getCharacteristicsButton().getText(), null, 2, null);
        View pdpTextDescriptionGradientV = this.binding.pdpTextDescriptionGradientV;
        Intrinsics.checkNotNullExpressionValue(pdpTextDescriptionGradientV, "pdpTextDescriptionGradientV");
        CharacteristicsViewHolderKt.bind(pdpTextDescriptionGradientV, characteristicsVO.getBackgroundColor());
        return TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, characteristicsVO.getCharacteristicsButton().getTokenizedEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateList(final CharacteristicsVO characteristicsVO, final boolean z11) {
        this.characteristicsAdapter.submitList(z11 ? characteristicsVO.getUnLimitList() : characteristicsVO.getLimitList(), new Runnable() { // from class: AD.a
            @Override // java.lang.Runnable
            public final void run() {
                CharacteristicsViewHolder.this.updateExpandButton(characteristicsVO, z11);
            }
        });
    }

    @NotNull
    public View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull CharacteristicsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.binding.rootCl.setBackgroundColor(ContextExtKt.parseColor(getContext(), item.getBackgroundColor()));
        updateList(item, item.getIsExpanded());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CharacteristicsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
