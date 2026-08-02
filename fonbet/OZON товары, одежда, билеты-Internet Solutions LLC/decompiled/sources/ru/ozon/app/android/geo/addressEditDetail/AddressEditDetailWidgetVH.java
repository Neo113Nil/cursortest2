package ru.ozon.app.android.geo.addressEditDetail;

import Vg.d;
import W10.c;
import WZ.t;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditformprompt.OpenSearchActionHandler;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditDetailBinding;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00150$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailVO;", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditDetailBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "viewModel", "Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "openSearchActionHandler", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "yandexSearchSheetSharedViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/geo/databinding/WidgetAddressEditDetailBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditDetailBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/geo/pvzSearcher/PvzSearcherViewModel;", "Lru/ozon/app/android/geo/addresseditformprompt/OpenSearchActionHandler;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementListAdapter;", "newAddressAdapter", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementListAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "addressAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonAdapter", "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailVO;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailWidgetVH extends k<AddressEditDetailVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter addressAdapter;

    @NotNull
    private final WidgetAddressEditDetailBinding binding;

    @NotNull
    private final AtomsAdapter buttonAdapter;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private AddressEditDetailVO item;

    @NotNull
    private final AddressEditDetailDynamicElementListAdapter newAddressAdapter;

    @NotNull
    private final OpenSearchActionHandler openSearchActionHandler;

    @NotNull
    private final ComposerReferences ref;

    @NotNull
    private final PvzSearcherViewModel viewModel;

    @NotNull
    private final YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressEditDetailWidgetVH(@NotNull WidgetAddressEditDetailBinding binding, @NotNull ComposerReferences ref, @NotNull PvzSearcherViewModel viewModel, @NotNull OpenSearchActionHandler openSearchActionHandler, @NotNull YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(r7);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(openSearchActionHandler, "openSearchActionHandler");
        Intrinsics.checkNotNullParameter(yandexSearchSheetSharedViewModel, "yandexSearchSheetSharedViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.ref = ref;
        this.viewModel = viewModel;
        this.openSearchActionHandler = openSearchActionHandler;
        this.yandexSearchSheetSharedViewModel = yandexSearchSheetSharedViewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new AddressEditDetailWidgetVH$actionHandler$1(this)).onClick(new AddressEditDetailWidgetVH$actionHandler$2(this)).onComposerAction(new AddressEditDetailWidgetVH$actionHandler$3(this)).buildHandler();
        this.actionHandler = buildHandler;
        AddressEditDetailDynamicElementListAdapter addressEditDetailDynamicElementListAdapter = new AddressEditDetailDynamicElementListAdapter(buildHandler);
        this.newAddressAdapter = addressEditDetailDynamicElementListAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(Header.class, null, 2, null), new HeaderAtom.Configuration(0, 0, 0, 8, null, null, null, 5, false, null, 887, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 6, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 522175, null)), new Pair(new Atom.ConfCondition(CommonText.TextSmall.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, 0, 0, 6, null, 0, false, false, 8, null, null, 0, 0, null, null, null, 522175, null)), new Pair(new Atom.ConfCondition(Button.class, null, 2, null), new ButtonAtom.Configuration(0, 0, 8, 0, 11, null)), new Pair(new Atom.ConfCondition(CommonButton.ButtonSecondary.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 8, 0, false, 0, null, 123, null))), null, null, null, 14, null);
        this.addressAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonAdapter = atomsAdapter2;
        binding.addressVAL.setAdapter(atomsAdapter);
        atomsAdapter.setOnAction(buildHandler);
        binding.buttonFAL.setAdapter(atomsAdapter2);
        atomsAdapter2.setOnAction(new ActionHandler.Builder(ref, this).buildHandler());
        binding.addressRv.setAdapter(addressEditDetailDynamicElementListAdapter);
        binding.addressRv.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        binding.addressRv.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditDetailVO item, @NotNull l20.d info) {
        List<? extends AtomDTO> list;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        if (item.getNewAddress() != null || item.getAddress() == null) {
            this.newAddressAdapter.submitList(item.getNewAddress());
            RecyclerView addressRv = this.binding.addressRv;
            Intrinsics.checkNotNullExpressionValue(addressRv, "addressRv");
            ViewExtKt.show(addressRv);
            VerticalAtomsLayout addressVAL = this.binding.addressVAL;
            Intrinsics.checkNotNullExpressionValue(addressVAL, "addressVAL");
            ViewExtKt.gone(addressVAL);
        } else {
            this.addressAdapter.bind(getContext(), item.getAddress());
            VerticalAtomsLayout addressVAL2 = this.binding.addressVAL;
            Intrinsics.checkNotNullExpressionValue(addressVAL2, "addressVAL");
            ViewExtKt.show(addressVAL2);
            RecyclerView addressRv2 = this.binding.addressRv;
            Intrinsics.checkNotNullExpressionValue(addressRv2, "addressRv");
            ViewExtKt.gone(addressRv2);
        }
        FrameAtomsLayout buttonFAL = this.binding.buttonFAL;
        Intrinsics.checkNotNullExpressionValue(buttonFAL, "buttonFAL");
        ViewExtKt.showOrGone(buttonFAL, Boolean.valueOf(item.getButton() != null));
        AtomsAdapter atomsAdapter = this.buttonAdapter;
        Context context = getContext();
        AtomDTO button = item.getButton();
        if (button == null || (list = C7714v.a0(button)) == null) {
            list = K.f71697a;
        }
        atomsAdapter.bind(context, list);
        this.openSearchActionHandler.setOpenSearchOptions(item.getOptions());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressEditDetailVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AddressEditDetailWidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
