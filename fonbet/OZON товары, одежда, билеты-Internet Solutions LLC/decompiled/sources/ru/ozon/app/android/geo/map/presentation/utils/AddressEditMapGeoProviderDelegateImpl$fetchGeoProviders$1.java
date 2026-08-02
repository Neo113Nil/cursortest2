package ru.ozon.app.android.geo.map.presentation.utils;

import Sc.r;
import Sc.s;
import Wc.a;
import android.content.Context;
import je0.C7415j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.presentation.utils.AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1", f = "AddressEditMapGeoProviderDelegate.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $doOnComplete;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressEditMapGeoProviderDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1(AddressEditMapGeoProviderDelegateImpl addressEditMapGeoProviderDelegateImpl, Context context, Function0<Unit> function0, d<? super AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1> dVar) {
        super(2, dVar);
        this.this$0 = addressEditMapGeoProviderDelegateImpl;
        this.$context = context;
        this.$doOnComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1 addressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1 = new AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1(this.this$0, this.$context, this.$doOnComplete, dVar);
        addressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1.L$0 = obj;
        return addressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object geoProviders;
        AddressEditMapGeoProviderDelegateImpl addressEditMapGeoProviderDelegateImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                AddressEditMapGeoProviderDelegateImpl addressEditMapGeoProviderDelegateImpl2 = this.this$0;
                Context context = this.$context;
                r.Companion companion = r.INSTANCE;
                this.L$0 = addressEditMapGeoProviderDelegateImpl2;
                this.label = 1;
                geoProviders = addressEditMapGeoProviderDelegateImpl2.getGeoProviders(context, this);
                if (geoProviders == aVar) {
                    return aVar;
                }
                addressEditMapGeoProviderDelegateImpl = addressEditMapGeoProviderDelegateImpl2;
                obj = geoProviders;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                addressEditMapGeoProviderDelegateImpl = (AddressEditMapGeoProviderDelegateImpl) this.L$0;
                s.b(obj);
            }
            addressEditMapGeoProviderDelegateImpl.tabsGeoProviderConfigs = (C7415j) obj;
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Function0<Unit> function0 = this.$doOnComplete;
        if (!(a11 instanceof r.b)) {
            function0.invoke();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressEditMapGeoProviderDelegateImpl$fetchGeoProviders$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
