package ru.ozon.app.android.checkoutgeo.location;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.w0;
import De.C2862e;
import Sc.s;
import Wc.a;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AddressLocalStore;
import xe.N;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/AddressLocalStoreImpl;", "Lru/ozon/app/android/location/AddressLocalStore;", "Landroid/content/SharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "", "addressId", "", "storeAddress", "(Ljava/lang/String;)V", "consumerId", "LAe/h;", "getFilteredAddressIdChangedFlow", "(Ljava/lang/String;)LAe/h;", "Landroid/content/SharedPreferences;", "", "activeConsumerIds", "Ljava/util/Set;", "LAe/w0;", "_addressIdChangedFlow", "LAe/w0;", "addressIdChangedFlow", "LAe/h;", "getAddressIdChangedFlow", "()LAe/h;", "LAe/M0;", "addressIdFlow", "LAe/M0;", "getAddressIdFlow", "()LAe/M0;", "getAddressId", "()Ljava/lang/String;", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressLocalStoreImpl implements AddressLocalStore {

    @NotNull
    private final w0<String> _addressIdChangedFlow;

    @NotNull
    private final Set<String> activeConsumerIds;

    @NotNull
    private final InterfaceC2395h<String> addressIdChangedFlow;

    @NotNull
    private final M0<String> addressIdFlow;

    @NotNull
    private final SharedPreferences preferences;

    public AddressLocalStoreImpl(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
        this.activeConsumerIds = new LinkedHashSet();
        C0 b11 = E0.b(1, 0, null, 6);
        this._addressIdChangedFlow = b11;
        this.addressIdChangedFlow = C2399j.o(b11);
        InterfaceC2395h c11 = C2399j.c(getAddressIdChangedFlow(), 1, EnumC11113a.DROP_OLDEST);
        C2862e a11 = N.a(xe.E0.a());
        int i11 = I0.f818a;
        this.addressIdFlow = C2399j.M(c11, a11, I0.a.c(), preferences.getString("LAST_CHOSEN_ADDRESS_ID", null));
    }

    public String getAddressId() {
        return getAddressIdFlow().getValue();
    }

    @NotNull
    public InterfaceC2395h<String> getAddressIdChangedFlow() {
        return this.addressIdChangedFlow;
    }

    @NotNull
    public M0<String> getAddressIdFlow() {
        return this.addressIdFlow;
    }

    @Override // ru.ozon.app.android.location.AddressLocalStore
    @NotNull
    public InterfaceC2395h<String> getFilteredAddressIdChangedFlow(@NotNull final String consumerId) {
        Intrinsics.checkNotNullParameter(consumerId, "consumerId");
        final InterfaceC2395h<String> addressIdChangedFlow = getAddressIdChangedFlow();
        return new C2408n0(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.checkoutgeo.location.AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.checkoutgeo.location.AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ String $consumerId$inlined;
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ AddressLocalStoreImpl this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.checkoutgeo.location.AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$$inlined$filter$1$2", f = "AddressLocalStoreImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.checkoutgeo.location.AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AddressLocalStoreImpl addressLocalStoreImpl, String str) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = addressLocalStoreImpl;
                    this.$consumerId$inlined = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    Set set;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                set = this.this$0.activeConsumerIds;
                                if (!set.contains(this.$consumerId$inlined)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super String> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this, consumerId), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AddressLocalStoreImpl$getFilteredAddressIdChangedFlow$2(this, consumerId, null));
    }

    @Override // ru.ozon.app.android.location.AddressLocalStore
    public void storeAddress(String addressId) {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString("LAST_CHOSEN_ADDRESS_ID", addressId);
        edit.apply();
        if (!Intrinsics.d(getAddressId(), addressId)) {
            this.activeConsumerIds.clear();
        }
        this._addressIdChangedFlow.tryEmit(addressId);
    }
}
