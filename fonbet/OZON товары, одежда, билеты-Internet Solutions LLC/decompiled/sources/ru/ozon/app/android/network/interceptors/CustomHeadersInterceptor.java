package ru.ozon.app.android.network.interceptors;

import Ib.a;
import We.B;
import We.G;
import We.L;
import We.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.common.NetworkHeadersProvider;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u0011*\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\r*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\r*\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/network/interceptors/CustomHeadersInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/common/NetworkHeadersProvider;", "networkHeadersProvider", "<init>", "(LIb/a;)V", "LWe/G$a;", "", "", "nativeHeaders", "(LWe/G$a;Ljava/util/Map;)LWe/G$a;", "", "", "containsNonAsciiCharacters", "(Ljava/util/Map$Entry;)Z", CommentV3DTO.HEADER_FIELD_NAME, "", "addUnsafeNonAsciiHeader", "(LWe/G$a;Ljava/util/Map$Entry;)V", "validValue", "(Ljava/lang/String;)Z", "validName", "", "validForHeaderValue", "(C)Z", "validForHeaderName", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomHeadersInterceptor extends BXInterceptor {

    @NotNull
    private final a<NetworkHeadersProvider> networkHeadersProvider;

    public CustomHeadersInterceptor(@NotNull a<NetworkHeadersProvider> networkHeadersProvider) {
        Intrinsics.checkNotNullParameter(networkHeadersProvider, "networkHeadersProvider");
        this.networkHeadersProvider = networkHeadersProvider;
    }

    private final void addUnsafeNonAsciiHeader(G.a aVar, Map.Entry<String, String> entry) {
        z.a h11 = aVar.b().e().h();
        h11.d(entry.getKey(), entry.getValue());
        aVar.e(h11.e());
    }

    private final boolean containsNonAsciiCharacters(Map.Entry<String, String> entry) {
        return (validName(entry.getKey()) && validValue(entry.getValue())) ? false : true;
    }

    private final G.a nativeHeaders(G.a aVar, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (containsNonAsciiCharacters(entry)) {
                addUnsafeNonAsciiHeader(aVar, entry);
            } else {
                aVar.d(entry.getKey(), entry.getValue());
            }
        }
        return aVar;
    }

    private final boolean validForHeaderName(char c11) {
        return '!' <= c11 && c11 < 127;
    }

    private final boolean validForHeaderValue(char c11) {
        if (c11 != '\t') {
            return ' ' <= c11 && c11 < 127;
        }
        return true;
    }

    private final boolean validName(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!validForHeaderName(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    private final boolean validValue(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!validForHeaderValue(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        return chain.proceed(nativeHeaders(new G.a(Ek.a.a(chain, "chain")), this.networkHeadersProvider.get().getNativeHeaders()).b());
    }
}
