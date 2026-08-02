package ru.ozon.app.android.geo.addresseditcarousel.presentation;

import Vg.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.options.OptionsAdapter;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditCarouselBinding;
import ru.ozon.app.android.geo.map.DetailsSheetManager;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditCarouselBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "detailsSheetManager", "LVg/d;", "customActionHandlerFactory", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetAddressEditCarouselBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/map/DetailsSheetManager;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditCarouselBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/map/DetailsSheetManager;", "LVg/d;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "titleAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/options/OptionsAdapter;", "optionsAdapter", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/options/OptionsAdapter;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditCarouselWidgetViewHolder extends k<AddressEditCarouselVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAddressEditCarouselBinding binding;

    @NotNull
    private final d customActionHandlerFactory;

    @NotNull
    private final DetailsSheetManager detailsSheetManager;

    @NotNull
    private final OptionsAdapter optionsAdapter;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final AtomsAdapter titleAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressEditCarouselWidgetViewHolder(@NotNull WidgetAddressEditCarouselBinding binding, @NotNull ComposerReferences ref, @NotNull DetailsSheetManager detailsSheetManager, @NotNull d customActionHandlerFactory) {
        super(r5);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(detailsSheetManager, "detailsSheetManager");
        Intrinsics.checkNotNullParameter(customActionHandlerFactory, "customActionHandlerFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.detailsSheetManager = detailsSheetManager;
        this.customActionHandlerFactory = customActionHandlerFactory;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(Header.class, null, 2, null), new HeaderAtom.Configuration(0, 0, 0, 8, null, null, null, 0, false, null, 1015, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 6, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 521151, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, "optionsHeader"), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 0, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 521215, null))), null, null, null, 14, null);
        this.titleAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressEditCarouselWidgetViewHolder$actionHandler$1(this)).onClick(new AddressEditCarouselWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        OptionsAdapter optionsAdapter = new OptionsAdapter(buildHandler);
        this.optionsAdapter = optionsAdapter;
        binding.atomsLayoutVAL.setAdapter(atomsAdapter);
        binding.optionsRv.setAdapter(optionsAdapter);
        RecyclerView recyclerView = binding.optionsRv;
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new OptionsItemDecorator(context));
        atomsAdapter.setOnAction(buildHandler);
        binding.moreOptionsBtn.setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditCarouselVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.titleAdapter.bind(getContext(), item.getElements());
        this.optionsAdapter.submitList(item.getOptions());
        SingleAtom moreOptionsBtn = this.binding.moreOptionsBtn;
        Intrinsics.checkNotNullExpressionValue(moreOptionsBtn, "moreOptionsBtn");
        ViewExtKt.showOrGone(moreOptionsBtn, Boolean.valueOf(item.getMoreButton() != null));
        ButtonV3Atom.LargeBorderlessButton moreButton = item.getMoreButton();
        if (moreButton != null) {
            SingleAtom.bind$default(this.binding.moreOptionsBtn, moreButton, false, 2, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressEditCarouselVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AddressEditCarouselWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
