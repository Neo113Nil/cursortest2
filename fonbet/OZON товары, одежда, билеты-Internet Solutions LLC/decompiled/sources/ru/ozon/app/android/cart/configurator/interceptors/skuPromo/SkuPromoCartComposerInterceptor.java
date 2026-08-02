package ru.ozon.app.android.cart.configurator.interceptors.skuPromo;

import A00.a;
import L00.g;
import L00.i;
import QZ.g;
import Tc.d;
import android.net.Uri;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/configurator/interceptors/skuPromo/SkuPromoCartComposerInterceptor;", "LQZ/g;", "<init>", "()V", "Li10/h;", "", "", "", "getRequestParams", "(Li10/h;)Ljava/util/Map;", "state", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "LL00/g;", "request", "LL00/i;", "extras", "interceptRequest", "(Li10/h;LL00/g;LL00/i;)LL00/g;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SkuPromoCartComposerInterceptor implements g {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/configurator/interceptors/skuPromo/SkuPromoCartComposerInterceptor$Companion;", "", "<init>", "()V", "USES_REFRESH_URL_FLAG", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Map<String, Object> getRequestParams(h hVar) {
        Map<String, Object> b11;
        d builder = new d();
        builder.putAll(hVar.f());
        builder.putAll(hVar.e());
        h.a b12 = hVar.b();
        if (b12 != null && (b11 = b12.b()) != null) {
            builder.putAll(b11);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
        String e11;
        Uri parse;
        Map<String, Object> b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        h.a b12 = state.b();
        boolean z11 = false;
        if (b12 != null && (b11 = b12.b()) != null && b11.containsKey("skuPromo_usesRefreshUrlFromState")) {
            z11 = true;
        }
        Map k11 = U.k(getRequestParams(state));
        if (!z11) {
            request.getClass();
            g.a aVar = new g.a(request);
            aVar.h(k11);
            return aVar.a();
        }
        h.c d11 = state.d();
        h.c.a aVar2 = d11 instanceof h.c.a ? (h.c.a) d11 : null;
        if (aVar2 != null && (e11 = aVar2.e()) != null && (parse = Uri.parse(e11)) != null) {
            Uri uri = parse.getQueryParameterNames().contains("skuPromo") ? parse : null;
            if (uri != null) {
                request.getClass();
                g.a aVar3 = new g.a(request);
                aVar3.g(SkuPromoCommonKt.removeSkuPromoQueryParams(uri));
                aVar3.h(k11);
                return aVar3.a();
            }
        }
        request.getClass();
        g.a aVar4 = new g.a(request);
        aVar4.h(k11);
        return aVar4.a();
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        i10.g g10;
        h.a aVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (!(trigger instanceof a.u.c) && (!(trigger instanceof a.u.b) || ((a.u.b) trigger).j() != null)) {
            return state;
        }
        h.a b11 = state.b();
        Map<String, Object> b12 = b11 != null ? b11.b() : null;
        if (b12 == null) {
            b12 = U.c();
        }
        Map n11 = U.n(b12, new Pair("skuPromo_usesRefreshUrlFromState", Boolean.TRUE));
        if (b11 != null) {
            aVar = h.a.a(b11, n11);
        } else {
            if ((b11 == null || (g10 = b11.c()) == null) && (g10 = state.g()) == null) {
                g10 = i10.g.GET;
            }
            aVar = new h.a(n11, g10);
        }
        return h.a(state, null, null, null, aVar, null, 47);
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
