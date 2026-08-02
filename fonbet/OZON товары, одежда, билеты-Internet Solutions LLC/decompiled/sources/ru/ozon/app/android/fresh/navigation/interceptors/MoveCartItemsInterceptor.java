package ru.ozon.app.android.fresh.navigation.interceptors;

import A00.a;
import L00.g;
import L00.i;
import QZ.g;
import i10.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsInterceptor;", "LQZ/g;", "Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "payloadHandler", "<init>", "(Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;)V", "Li10/h;", "state", "LL00/g;", "request", "LL00/i;", "extras", "interceptRequest", "(Li10/h;LL00/g;LL00/i;)LL00/g;", "Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MoveCartItemsInterceptor implements g {

    @NotNull
    private final MoveCartItemsPayloadHandler payloadHandler;

    public MoveCartItemsInterceptor(@NotNull MoveCartItemsPayloadHandler payloadHandler) {
        Intrinsics.checkNotNullParameter(payloadHandler, "payloadHandler");
        this.payloadHandler = payloadHandler;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        request.getClass();
        g.a aVar = new g.a(request);
        aVar.i();
        aVar.h(U.i(new Pair("payload", this.payloadHandler.getPayload())));
        L00.g a11 = aVar.a();
        this.payloadHandler.clearMoveCartItemsPayload();
        g.a.a(state, a11, extras);
        return a11;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h hVar, @NotNull a aVar) {
        g.a.b(hVar, aVar);
        return hVar;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
