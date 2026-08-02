package ru.ozon.app.android.composer.miniapp;

import A00.a;
import BZ.e;
import GZ.c;
import HZ.d;
import L00.g;
import L00.i;
import QZ.g;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/miniapp/MiniAppComposerInterceptor;", "LQZ/g;", "LHZ/d;", "deeplinkMiniAppMapper", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LHZ/d;LBZ/e;)V", "Li10/h;", "state", "LL00/g;", "request", "LL00/i;", "extras", "interceptRequest", "(Li10/h;LL00/g;LL00/i;)LL00/g;", "LHZ/d;", "LBZ/e;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MiniAppComposerInterceptor implements g {

    @NotNull
    private final d deeplinkMiniAppMapper;

    @NotNull
    private final e miniAppConfigHolder;

    public MiniAppComposerInterceptor(@NotNull d deeplinkMiniAppMapper, @NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(deeplinkMiniAppMapper, "deeplinkMiniAppMapper");
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.deeplinkMiniAppMapper = deeplinkMiniAppMapper;
        this.miniAppConfigHolder = miniAppConfigHolder;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
        String c11;
        String b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (!MiniAppExtKt.isMain(this.miniAppConfigHolder)) {
            h.c d11 = state.d();
            if ((d11 instanceof h.c.a) && (c11 = ((h.c.a) d11).c()) != null && !Uri.parse(c11).isOpaque()) {
                b11 = this.deeplinkMiniAppMapper.b(c11, c.INTERNAL);
                if (!Intrinsics.d(b11, c11)) {
                    request.getClass();
                    g.a aVar = new g.a(request);
                    aVar.g(b11);
                    return aVar.a();
                }
            }
        }
        return request;
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
