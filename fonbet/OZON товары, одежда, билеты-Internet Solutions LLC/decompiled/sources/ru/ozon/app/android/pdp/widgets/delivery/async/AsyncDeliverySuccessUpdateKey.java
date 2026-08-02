package ru.ozon.app.android.pdp.widgets.delivery.async;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliverySuccessUpdateKey;", "LA00/a$J$a;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "vo", "<init>", "(Ll20/c;)V", "Ll20/c;", "getVo", "()Ll20/c;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncDeliverySuccessUpdateKey implements a.J.InterfaceC0007a {

    @NotNull
    private final c vo;

    public AsyncDeliverySuccessUpdateKey(@NotNull c vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.vo = vo;
    }

    @NotNull
    public final c getVo() {
        return this.vo;
    }
}
