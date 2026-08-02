package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import Bc.h;
import Bc.t;
import GZ.g;
import Sc.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mc.C8125a;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data.SisLikeResponse;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.uni.atoms.af.AtomAction;
import sc.C9653a;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel$processAction$1", f = "SellerHeaderViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SellerHeaderViewModel$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ boolean $shouldShowMessage;
    int label;
    final /* synthetic */ SellerHeaderViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerHeaderViewModel$processAction$1(AtomAction atomAction, SellerHeaderViewModel sellerHeaderViewModel, Map<String, String> map, boolean z11, d<? super SellerHeaderViewModel$processAction$1> dVar) {
        super(2, dVar);
        this.$atomAction = atomAction;
        this.this$0 = sellerHeaderViewModel;
        this.$params = map;
        this.$shouldShowMessage = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SellerHeaderViewModel$processAction$1(this.$atomAction, this.this$0, this.$params, this.$shouldShowMessage, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String id2;
        AuthStateStorage authStateStorage;
        ActionV2Repository actionV2Repository;
        g gVar;
        String str;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AtomAction atomAction = this.$atomAction;
        if (atomAction != null && (id2 = atomAction.getId()) != null) {
            SellerHeaderViewModel sellerHeaderViewModel = this.this$0;
            Map<String, String> map = this.$params;
            boolean z11 = this.$shouldShowMessage;
            authStateStorage = sellerHeaderViewModel.authStateStorage;
            if (authStateStorage.isAuthenticated()) {
                actionV2Repository = sellerHeaderViewModel.actionV2Repository;
                t g10 = actionV2Repository.callAction(new ActionV2Request(map, id2, false, 4, null), SisLikeResponse.class).j(Mc.a.b()).g(C8125a.a());
                final SellerHeaderViewModel$processAction$1$1$1 sellerHeaderViewModel$processAction$1$1$1 = new SellerHeaderViewModel$processAction$1$1$1(sellerHeaderViewModel, id2, map, z11);
                h hVar = new h(g10, new qc.g() { // from class: ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.a
                    @Override // qc.g
                    public final void accept(Object obj2) {
                        Function1.this.invoke(obj2);
                    }
                });
                final SellerHeaderViewModel$processAction$1$1$2 sellerHeaderViewModel$processAction$1$1$2 = new SellerHeaderViewModel$processAction$1$1$2(map, sellerHeaderViewModel, id2, z11);
                new Bc.j(hVar, new qc.g() { // from class: ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.b
                    @Override // qc.g
                    public final void accept(Object obj2) {
                        Function1.this.invoke(obj2);
                    }
                }).h(C9653a.g(), C9653a.f98525e);
            } else {
                gVar = sellerHeaderViewModel.router;
                str = sellerHeaderViewModel.authUri;
                g.a.a(gVar, str, null, null, 6);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SellerHeaderViewModel$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
