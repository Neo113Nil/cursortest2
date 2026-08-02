package ru.ozon.app.android.travel.favorite.delegate;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "isUserAuthenticated", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.favorite.delegate.HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2", f = "HotelFavoritesForAuthorizedFeatureActivator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2 extends j implements Function2<Boolean, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelFavoritesForAuthorizedFeatureActivator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2(HotelFavoritesForAuthorizedFeatureActivator hotelFavoritesForAuthorizedFeatureActivator, d<? super HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelFavoritesForAuthorizedFeatureActivator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2 hotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2 = new HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2(this.this$0, dVar);
        hotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2.L$0 = obj;
        return hotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, d<? super Boolean> dVar) {
        return ((HotelFavoritesForAuthorizedFeatureActivator$isFeatureActivatedFlow$2) create(bool, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean isFeatureEnabled;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Boolean bool = (Boolean) this.L$0;
        isFeatureEnabled = this.this$0.isFeatureEnabled();
        return Boolean.valueOf(isFeatureEnabled && !bool.booleanValue());
    }
}
