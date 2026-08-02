package ru.ozon.app.android.network.cronet;

import Ga.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetClient;", "", "LGa/a;", "knet", "<init>", "(LGa/a;)V", "LGa/a;", "getKnet", "()LGa/a;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetClient {

    @NotNull
    private final a knet;

    public CronetClient(@NotNull a knet) {
        Intrinsics.checkNotNullParameter(knet, "knet");
        this.knet = knet;
    }

    @NotNull
    public final a getKnet() {
        return this.knet;
    }
}
