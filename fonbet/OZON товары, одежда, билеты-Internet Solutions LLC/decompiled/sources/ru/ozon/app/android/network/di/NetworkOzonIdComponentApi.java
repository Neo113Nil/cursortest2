package ru.ozon.app.android.network.di;

import Ob0.a;
import We.B;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "", "LWe/B;", "getOzonIdInterceptors", "()Ljava/util/List;", "getOzonIdNetworkInterceptors", "LOb0/a;", "getOzonIdAppApi", "()LOb0/a;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NetworkOzonIdComponentApi extends InterfaceC6958a {
    @NotNull
    a getOzonIdAppApi();

    @NotNull
    List<B> getOzonIdInterceptors();

    @NotNull
    List<B> getOzonIdNetworkInterceptors();
}
