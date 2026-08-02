package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import AA.d;
import BT.b;
import Cw.c;
import Lm0.a;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.p;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalAddressMobileBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddressSearchResult;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.adapter.AddLegalAddressAdapter;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import sc.C9653a;
import xc.C10699b;
import xc.f;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalAddressMobileBinding;", "binding", "Ll10/b;", "controller", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "router", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalAddressMobileBinding;Ll10/b;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewModel;)V", "", SearchIntents.EXTRA_QUERY, "", "searchSuggest", "(Ljava/lang/String;)V", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "postData", "checkAddress", "(Ljava/lang/String;Ljava/lang/String;)V", "observeSearchResult", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddressSearchResult;", "it", "applySearchResult", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddressSearchResult;)V", "showErrorAndHideContent", "hideErrorShowContent", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddLegalAddressMobileBinding;", "Ll10/b;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewModel;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileVO;", "Lnc/b;", "checkAddressDisposable", "Lnc/b;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressAdapter;", "adapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/adapter/AddLegalAddressAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalAddressMobileViewHolder extends k<AddLegalAddressMobileVO> {

    @NotNull
    private final AddLegalAddressAdapter adapter;

    @NotNull
    private final WidgetAddLegalAddressMobileBinding binding;
    private InterfaceC8487b checkAddressDisposable;

    @NotNull
    private final InterfaceC7851b controller;
    private AddLegalAddressMobileVO item;

    @NotNull
    private final LegalRouter router;

    @NotNull
    private final AddLegalAddressMobileViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddLegalAddressMobileViewHolder(@NotNull WidgetAddLegalAddressMobileBinding binding, @NotNull InterfaceC7851b controller, @NotNull LegalRouter router, @NotNull AddLegalAddressMobileViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.controller = controller;
        this.router = router;
        this.viewModel = viewModel;
        AddLegalAddressAdapter addLegalAddressAdapter = new AddLegalAddressAdapter();
        this.adapter = addLegalAddressAdapter;
        RecyclerView recyclerView = binding.legalsAddressRv;
        addLegalAddressAdapter.setAddressCallback(new AddLegalAddressMobileViewHolder$1$1(this));
        recyclerView.setAdapter(addLegalAddressAdapter);
        binding.legalsAddressRv.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        binding.searchAddressSv.o(new SearchView.l() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewHolder.2
            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextChange(String newText) {
                AddLegalAddressMobileViewHolder.this.searchSuggest(newText);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextSubmit(String query) {
                AddLegalAddressMobileViewHolder.this.searchSuggest(query);
                return true;
            }
        });
        observeSearchResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySearchResult(AddressSearchResult it) {
        if (it instanceof AddressSearchResult.Success) {
            hideErrorShowContent();
            this.adapter.submitList(((AddressSearchResult.Success) it).getList());
        } else if (it instanceof AddressSearchResult.Fail) {
            showErrorAndHideContent();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAddress(String address, String postData) {
        InterfaceC8487b interfaceC8487b = this.checkAddressDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        y<String> checkLegalAddress = this.viewModel.checkLegalAddress(address, postData);
        d dVar = new d(AddLegalAddressMobileViewHolder$checkAddress$1.INSTANCE, 7);
        checkLegalAddress.getClass();
        xc.k kVar = new xc.k(new f(checkLegalAddress, dVar), C8125a.a());
        C10699b c10699b = new C10699b(new c(new AddLegalAddressMobileViewHolder$checkAddress$2(this), 7), new b(AddLegalAddressMobileViewHolder$checkAddress$3.INSTANCE, 4), C9653a.f98523c);
        kVar.a(c10699b);
        this.checkAddressDisposable = c10699b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAddress$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    private final void hideErrorShowContent() {
        TextAtomV2View legalsAddressErrorTv = this.binding.legalsAddressErrorTv;
        Intrinsics.checkNotNullExpressionValue(legalsAddressErrorTv, "legalsAddressErrorTv");
        ViewExtKt.gone(legalsAddressErrorTv);
        RecyclerView legalsAddressRv = this.binding.legalsAddressRv;
        Intrinsics.checkNotNullExpressionValue(legalsAddressRv, "legalsAddressRv");
        ViewExtKt.show(legalsAddressRv);
    }

    private final void observeSearchResult() {
        p<AddressSearchResult> observeOn = this.viewModel.observeAddresses().observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, this, new AddLegalAddressMobileViewHolder$observeSearchResult$1(this), new AddLegalAddressMobileViewHolder$observeSearchResult$2(a.f17149a), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchSuggest(String query) {
        if (query == null) {
            return;
        }
        this.viewModel.searchAddress(query);
        AddLegalAddressMobileVO addLegalAddressMobileVO = this.item;
        if (addLegalAddressMobileVO != null) {
            this.controller.update(new AddLegalQueryUpdate(addLegalAddressMobileVO.getId(), query));
        }
    }

    private final void showErrorAndHideContent() {
        TextAtomV2View legalsAddressErrorTv = this.binding.legalsAddressErrorTv;
        Intrinsics.checkNotNullExpressionValue(legalsAddressErrorTv, "legalsAddressErrorTv");
        ViewExtKt.show(legalsAddressErrorTv);
        RecyclerView legalsAddressRv = this.binding.legalsAddressRv;
        Intrinsics.checkNotNullExpressionValue(legalsAddressRv, "legalsAddressRv");
        ViewExtKt.gone(legalsAddressRv);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        InterfaceC8487b interfaceC8487b = this.checkAddressDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddLegalAddressMobileVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        WidgetAddLegalAddressMobileBinding widgetAddLegalAddressMobileBinding = this.binding;
        widgetAddLegalAddressMobileBinding.searchAddressSv.p(item.getQuery(), true);
        widgetAddLegalAddressMobileBinding.searchAddressSv.q(item.getPlaceholder());
        TextAtomV2View legalsAddressInfoTv = widgetAddLegalAddressMobileBinding.legalsAddressInfoTv;
        Intrinsics.checkNotNullExpressionValue(legalsAddressInfoTv, "legalsAddressInfoTv");
        TextHolderKt.bind$default(legalsAddressInfoTv, item.getTitle(), null, 2, null);
        TextAtomV2View legalsAddressErrorTv = widgetAddLegalAddressMobileBinding.legalsAddressErrorTv;
        Intrinsics.checkNotNullExpressionValue(legalsAddressErrorTv, "legalsAddressErrorTv");
        TextHolderKt.bind$default(legalsAddressErrorTv, item.getError(), null, 2, null);
    }
}
