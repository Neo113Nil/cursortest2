package ru.ozon.id.logout.data;

import Fb0.f;
import Hb0.f;
import Ic0.i;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;
import ru.ozon.id.logout.data.api.ConfirmTrustedDeviceActionResponse;
import ru.ozon.id.logout.data.api.LogoutComposerApi;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f97164a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<LogoutComposerApi> f97165b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.c> f97166c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<i> f97167d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f97168e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final I f97169f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97170g;

    @e(c = "ru.ozon.id.logout.data.LogoutRepository$sendConfirmTrustedDeviceAction$2", f = "LogoutRepository.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super ConfirmTrustedDeviceActionResponse>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f97171d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ConfirmTrustedDeviceDTO.Button.Action f97172e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f97173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ConfirmTrustedDeviceDTO.Button.Action action, d dVar, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f97172e = action;
            this.f97173f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f97172e, this.f97173f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super ConfirmTrustedDeviceActionResponse> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f97171d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            String b11 = Nk.a.b("composer-api.bx/_action/", this.f97172e.getLink());
            d dVar = this.f97173f;
            LogoutComposerApi logoutComposerApi = (LogoutComposerApi) dVar.f97165b.getValue();
            Map<String, String> d11 = d.d(dVar);
            this.f97171d = 1;
            Object confirmTrustedDevice = logoutComposerApi.confirmTrustedDevice(b11, d11, this);
            return confirmTrustedDevice == aVar ? aVar : confirmTrustedDevice;
        }
    }

    public d() {
        throw null;
    }

    public d(f ozonIdConfig, InterfaceC4008j api, InterfaceC4008j appInfoRepository, InterfaceC4008j resetCookiesInterceptor, InterfaceC4008j featureFlagsStore) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(appInfoRepository, "appInfoRepository");
        Intrinsics.checkNotNullParameter(resetCookiesInterceptor, "resetCookiesInterceptor");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f97164a = ozonIdConfig;
        this.f97165b = api;
        this.f97166c = appInfoRepository;
        this.f97167d = resetCookiesInterceptor;
        this.f97168e = featureFlagsStore;
        this.f97169f = ioDispatcher;
        this.f97170g = k.b(new b(this));
    }

    public static final String a(d dVar) {
        return ((Boolean) dVar.f97168e.getValue().b(f.o.f10813a)).booleanValue() ? "logoutMobileV1" : "logout";
    }

    public static final Map d(d dVar) {
        return (Map) dVar.f97170g.getValue();
    }

    public static Object f(d dVar, boolean z11, Yb0.a aVar, kotlin.coroutines.jvm.internal.c cVar, int i11) {
        Boolean bool = Boolean.TRUE;
        boolean z12 = (i11 & 1) != 0;
        boolean z13 = (i11 & 2) != 0 ? false : z11;
        Boolean bool2 = (i11 & 4) != 0 ? null : bool;
        Yb0.a aVar2 = (i11 & 8) != 0 ? null : aVar;
        dVar.getClass();
        return C10727i.f(dVar.f97169f, new c(dVar, z13, z12, bool2, aVar2, null), cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f97164a, dVar.f97164a) && Intrinsics.d(this.f97165b, dVar.f97165b) && Intrinsics.d(this.f97166c, dVar.f97166c) && Intrinsics.d(this.f97167d, dVar.f97167d) && Intrinsics.d(this.f97168e, dVar.f97168e) && Intrinsics.d(this.f97169f, dVar.f97169f);
    }

    public final Object g(@NotNull ConfirmTrustedDeviceDTO.Button.Action action, @NotNull kotlin.coroutines.d<? super ConfirmTrustedDeviceActionResponse> dVar) {
        return C10727i.f(this.f97169f, new a(action, this, null), dVar);
    }

    public final int hashCode() {
        return this.f97169f.hashCode() + ((this.f97168e.hashCode() + ((this.f97167d.hashCode() + ((this.f97166c.hashCode() + ((this.f97165b.hashCode() + (this.f97164a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "LogoutRepository(ozonIdConfig=" + this.f97164a + ", api=" + this.f97165b + ", appInfoRepository=" + this.f97166c + ", resetCookiesInterceptor=" + this.f97167d + ", featureFlagsStore=" + this.f97168e + ", ioDispatcher=" + this.f97169f + ")";
    }
}
