package ru.ozon.app.android.travel.favorite.delegate;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "", "kotlin.jvm.PlatformType", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1", f = "HotelFavoritesForAuthorizedFeatureActivator.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1 extends j implements Function2<InterfaceC2397i<? super Boolean>, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isUserAuthenticated;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1(boolean z11, d<? super HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1> dVar) {
        super(2, dVar);
        this.$isUserAuthenticated = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1 hotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1 = new HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1(this.$isUserAuthenticated, dVar);
        hotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1.L$0 = obj;
        return hotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super Boolean> interfaceC2397i, d<? super Unit> dVar) {
        return ((HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            Boolean valueOf = Boolean.valueOf(this.$isUserAuthenticated);
            this.label = 1;
            if (interfaceC2397i.emit(valueOf, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
