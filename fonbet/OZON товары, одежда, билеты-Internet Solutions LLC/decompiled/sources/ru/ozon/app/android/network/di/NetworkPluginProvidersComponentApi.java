package ru.ozon.app.android.network.di;

import We.B;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.NetworkAtMostQaUserPredicate;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/network/di/NetworkPluginProvidersComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/network/abtool/NetworkAtMostQaUserPredicate;", "getNetworkAtMostQaUserPredicate", "()Lru/ozon/app/android/network/abtool/NetworkAtMostQaUserPredicate;", "", "LWe/B;", "getLeadingHostInterceptors", "()Ljava/util/List;", "getTrailingHostInterceptors", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NetworkPluginProvidersComponentApi extends InterfaceC6958a {
    @NotNull
    List<B> getLeadingHostInterceptors();

    @NotNull
    NetworkAtMostQaUserPredicate getNetworkAtMostQaUserPredicate();

    @NotNull
    List<B> getTrailingHostInterceptors();
}
