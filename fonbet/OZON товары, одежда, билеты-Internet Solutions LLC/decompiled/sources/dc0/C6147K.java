package dc0;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.K, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6147K extends CookieManager {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<URI, Map<String, ? extends List<String>>, Map<String, List<String>>> f61499a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<URI, Map<String, ? extends List<String>>, Unit> f61500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6147K(@NotNull Function2<? super URI, ? super Map<String, ? extends List<String>>, ? extends Map<String, ? extends List<String>>> onGetCookies, @NotNull Function2<? super URI, ? super Map<String, ? extends List<String>>, Unit> onSaveCookies) {
        super(null, CookiePolicy.ACCEPT_ALL);
        Intrinsics.checkNotNullParameter(onGetCookies, "onGetCookies");
        Intrinsics.checkNotNullParameter(onSaveCookies, "onSaveCookies");
        this.f61499a = onGetCookies;
        this.f61500b = onSaveCookies;
    }

    @NotNull
    public final Map<String, List<String>> a(URI uri, Map<String, ? extends List<String>> map) {
        Map<String, List<String>> map2 = super.get(uri, map);
        Intrinsics.checkNotNullExpressionValue(map2, "get(...)");
        return map2;
    }

    public final void b(URI uri, Map<String, ? extends List<String>> map) {
        super.put(uri, map);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    @NotNull
    public final Map<String, List<String>> get(URI uri, Map<String, ? extends List<String>> map) {
        return this.f61499a.invoke(uri, map);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final void put(URI uri, Map<String, ? extends List<String>> map) {
        this.f61500b.invoke(uri, map);
    }
}
