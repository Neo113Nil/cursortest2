package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation;

import Ae.x0;
import He.b;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data.MercuryCertificatesAddressMapperKt;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data.SearchMercuryAddressResponse;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.UiState;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.AddressesVO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.MercuryCertificatesAddressViewModel$fetchAddresses$1", f = "MercuryCertificatesAddressViewModel.kt", l = {48, 50}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MercuryCertificatesAddressViewModel$fetchAddresses$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ Map<String, String> $params;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MercuryCertificatesAddressViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MercuryCertificatesAddressViewModel$fetchAddresses$1(MercuryCertificatesAddressViewModel mercuryCertificatesAddressViewModel, AtomAction atomAction, Map<String, String> map, d<? super MercuryCertificatesAddressViewModel$fetchAddresses$1> dVar) {
        super(2, dVar);
        this.this$0 = mercuryCertificatesAddressViewModel;
        this.$action = atomAction;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MercuryCertificatesAddressViewModel$fetchAddresses$1 mercuryCertificatesAddressViewModel$fetchAddresses$1 = new MercuryCertificatesAddressViewModel$fetchAddresses$1(this.this$0, this.$action, this.$params, dVar);
        mercuryCertificatesAddressViewModel$fetchAddresses$1.L$0 = obj;
        return mercuryCertificatesAddressViewModel$fetchAddresses$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (xe.Y.b(300, r8) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        x0 x0Var;
        x0 x0Var2;
        SearchMercuryAddressResponse searchMercuryAddressResponse;
        x0 x0Var3;
        x0 x0Var4;
        String link;
        ComposerNavigator composerNavigator;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            Lm0.a.f17149a.e(e12);
        }
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            x0Var = this.this$0._addressesState;
            if (!(x0Var.getValue() instanceof UiState.AddressesState)) {
                x0Var2 = this.this$0._addressesState;
                x0Var2.setValue(UiState.LoadingState.INSTANCE);
            }
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                ActionV2Response actionV2Response = (ActionV2Response) obj;
                if (actionV2Response != null && (searchMercuryAddressResponse = (SearchMercuryAddressResponse) actionV2Response.getData()) != null) {
                    MercuryCertificatesAddressViewModel mercuryCertificatesAddressViewModel = this.this$0;
                    AddressesVO vo = MercuryCertificatesAddressMapperKt.toVO(searchMercuryAddressResponse);
                    if (vo.getError() != null) {
                        AtomAction action = vo.getError().getAction();
                        AtomAction.DismissRedirect dismissRedirect = action instanceof AtomAction.DismissRedirect ? (AtomAction.DismissRedirect) action : null;
                        if (dismissRedirect != null && (link = dismissRedirect.getLink()) != null) {
                            composerNavigator = mercuryCertificatesAddressViewModel.navigator;
                            ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, link, null, 2, null);
                        }
                    } else {
                        List<AddressesVO.AddressVO> addresses = vo.getAddresses();
                        if (addresses != null) {
                            x0Var4 = mercuryCertificatesAddressViewModel._addressesState;
                            x0Var4.setValue(new UiState.AddressesState(addresses));
                        } else {
                            x0Var3 = mercuryCertificatesAddressViewModel._addressesState;
                            x0Var3.setValue(UiState.ErrorState.INSTANCE);
                        }
                    }
                }
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1 mercuryCertificatesAddressViewModel$fetchAddresses$1$result$1 = new MercuryCertificatesAddressViewModel$fetchAddresses$1$result$1(this.$action, this.$params, this.this$0, null);
        this.L$0 = m11;
        this.label = 2;
        obj = C10727i.f(bVar, mercuryCertificatesAddressViewModel$fetchAddresses$1$result$1, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MercuryCertificatesAddressViewModel$fetchAddresses$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
