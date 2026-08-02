package u4;

import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import h1.C4405a;
import h1.C4418n;
import h1.C4419o;
import h1.InterfaceC4411g;
import h1.InterfaceC4425u;
import j1.C5089a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import zendesk.core.Constants;

/* renamed from: u4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6502h {

    /* renamed from: a, reason: collision with root package name */
    public static final C6502h f66100a = new C6502h();

    /* renamed from: b, reason: collision with root package name */
    public static InterfaceC4411g.a f66101b;

    /* renamed from: c, reason: collision with root package name */
    public static InterfaceC4425u f66102c;

    /* renamed from: d, reason: collision with root package name */
    public static String f66103d;

    public static final InterfaceC4411g.a b(ReactContext reactContext, Uri uri) {
        Intrinsics.checkNotNull(uri);
        C4418n c4418n = new C4418n(uri);
        Intrinsics.checkNotNull(reactContext);
        final C4405a c4405a = new C4405a(reactContext);
        c4405a.b(c4418n);
        return new InterfaceC4411g.a() { // from class: u4.g
            @Override // h1.InterfaceC4411g.a
            public final InterfaceC4411g a() {
                InterfaceC4411g c10;
                c10 = C6502h.c(C4405a.this);
                return c10;
            }
        };
    }

    public static final InterfaceC4411g.a f(ReactContext context, D1.i iVar, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f66101b == null || (map != null && !map.isEmpty())) {
            f66101b = f66100a.d(context, iVar, map);
        }
        InterfaceC4411g.a aVar = f66101b;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type androidx.media3.datasource.DataSource.Factory");
        return aVar;
    }

    public static final InterfaceC4425u g(ReactContext context, D1.i iVar, Map map) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f66102c == null || (map != null && !map.isEmpty())) {
            f66102c = f66100a.e(context, iVar, map);
        }
        InterfaceC4425u interfaceC4425u = f66102c;
        Intrinsics.checkNotNull(interfaceC4425u, "null cannot be cast to non-null type androidx.media3.datasource.HttpDataSource.Factory");
        return interfaceC4425u;
    }

    public final InterfaceC4411g.a d(ReactContext reactContext, D1.i iVar, Map map) {
        return new C4419o.a(reactContext, e(reactContext, iVar, map));
    }

    public final InterfaceC4425u e(ReactContext reactContext, D1.i iVar, Map map) {
        OkHttpClient okHttpClient = OkHttpClientProvider.getOkHttpClient();
        CookieJar cookieJar = okHttpClient.cookieJar();
        Intrinsics.checkNotNull(cookieJar, "null cannot be cast to non-null type com.facebook.react.modules.network.CookieJarContainer");
        ((CookieJarContainer) cookieJar).setCookieJar(new JavaNetCookieJar(new ForwardingCookieHandler(reactContext)));
        Intrinsics.checkNotNull(okHttpClient, "null cannot be cast to non-null type okhttp3.Call.Factory");
        C5089a.b d10 = new C5089a.b(okHttpClient).d(iVar);
        Intrinsics.checkNotNullExpressionValue(d10, "setTransferListener(...)");
        if (map == null) {
            Intrinsics.checkNotNull(d10.e(h(reactContext)));
            return d10;
        }
        d10.c(map);
        if (!map.containsKey(Constants.USER_AGENT_HEADER_KEY)) {
            d10.e(h(reactContext));
        }
        return d10;
    }

    public final String h(ReactContext reactContext) {
        if (f66103d == null) {
            f66103d = e1.Z.A0(reactContext, reactContext.getPackageName());
        }
        String str = f66103d;
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public static final InterfaceC4411g c(C4405a c4405a) {
        return c4405a;
    }
}
