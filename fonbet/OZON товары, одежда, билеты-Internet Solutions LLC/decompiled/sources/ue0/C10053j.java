package ue0;

import Je0.d;
import Je0.s;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ei0.InterfaceC6369b;
import ie0.C7064a;
import java.lang.ref.WeakReference;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.ApiHost;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import te0.C9868c;

/* renamed from: ue0.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10053j implements InterfaceC10046c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100682a = k.b(new a());

    /* renamed from: ue0.j$a */
    static final class a extends AbstractC7737t implements Function0<sj.d> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final sj.d invoke() {
            Context context;
            C10053j.this.getClass();
            try {
                ae0.i.f36650a.getClass();
                WeakReference a11 = ae0.i.a();
                if (a11 == null || (context = (Context) a11.get()) == null) {
                    C7064a.f66281a.getClass();
                    WeakReference e11 = C7064a.e();
                    context = e11 != null ? (Context) e11.get() : null;
                }
                if (context != null) {
                    C9868c.a(context);
                }
                return sj.e.f98817f.q(new sj.a("maps_sdk", "maps_sdk_android", null));
            } catch (Exception e12) {
                String message = e12.getMessage();
                if (message == null) {
                    message = e12.toString();
                }
                Log.e("Logger", message, e12);
                return null;
            }
        }
    }

    private static xj.a d(String str, Throwable th2) {
        ApiHost host;
        GeoProviderConfig.SdkType sdkType;
        C7064a.f66281a.getClass();
        GeoProviderConfig g10 = C7064a.g();
        String str2 = null;
        Pair pair = new Pair("current_provider_name", (g10 == null || (sdkType = g10.getSdkType()) == null) ? null : sdkType.getName$mapsdk_fullFirebaseOpenglRelease());
        Pair pair2 = new Pair("is_lite_version", Boolean.FALSE);
        ie0.g.f66321a.getClass();
        GeoProxyConfig c11 = ie0.g.c();
        Pair pair3 = new Pair("client_name", c11 != null ? c11.getAppName() : null);
        GeoProxyConfig c12 = ie0.g.c();
        if (c12 != null && (host = c12.getHost()) != null) {
            str2 = host.getUrl();
        }
        LinkedHashMap l11 = U.l(pair, pair2, pair3, new Pair("remote_url", str2), new Pair("sdk_version", "14.8.1"));
        if (th2 != null) {
            l11.put("exception_message", th2.getMessage());
            l11.put("exception_stacktrace", C4001c.b(th2));
        }
        if (str != null) {
            l11.put("error_code", str);
        }
        return sj.f.a(l11);
    }

    @Override // ue0.InterfaceC10046c
    public final void a(@NotNull String tag, @NotNull String message, Throwable th2) {
        String a11;
        Je0.c cVar;
        InterfaceC6369b ozonTracker;
        ApiHost host;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        ie0.g gVar = ie0.g.f66321a;
        gVar.getClass();
        GeoProxyConfig c11 = ie0.g.c();
        if ((c11 == null || (host = c11.getHost()) == null || host.getIsStage()) && !(th2 instanceof UnknownHostException)) {
            Je0.c cVar2 = null;
            if ((th2 != null ? th2.getCause() : null) instanceof UnknownHostException) {
                return;
            }
            try {
                String str = tag + ": " + message;
                if (th2 instanceof C10044a) {
                    a11 = Ke0.a.a(str + " " + C7705l.F(((C10044a) th2).getStackTrace()));
                } else {
                    a11 = null;
                }
                sj.d dVar = (sj.d) this.f100682a.getValue();
                if (dVar != null) {
                    dVar.c(str, d(a11, th2), Boolean.FALSE);
                }
                if (th2 instanceof C10044a) {
                    gVar.getClass();
                    if (ie0.g.c() == null) {
                        Je0.c.f14654d = null;
                    } else {
                        cVar = Je0.c.f14654d;
                        if (cVar != null) {
                            cVar2 = Je0.c.f14654d;
                        } else {
                            GeoProxyConfig c12 = ie0.g.c();
                            if (c12 != null && (ozonTracker = c12.getOzonTracker()) != null) {
                                Je0.c.f14654d = new Je0.c(ozonTracker);
                                cVar2 = Je0.c.f14654d;
                            }
                            d.a.a();
                        }
                    }
                    Je0.c cVar3 = cVar2;
                    if (cVar3 != null) {
                        C7064a.f66281a.getClass();
                        GeoProviderConfig g10 = C7064a.g();
                        Je0.e eVar = Je0.e.ERROR;
                        Intrinsics.f(a11);
                        Je0.c.d(cVar3, g10, eVar, null, null, null, new s(kotlin.text.h.q0(UserVerificationMethods.USER_VERIFY_PATTERN, str), a11), 60);
                    }
                }
            } catch (Exception e11) {
                String message2 = e11.getMessage();
                if (message2 == null) {
                    message2 = e11.toString();
                }
                Log.e("Logger", message2, e11);
            }
        }
    }

    @Override // ue0.InterfaceC10046c
    public final void b(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // ue0.InterfaceC10046c
    public final void c(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @NotNull
    public final String toString() {
        return "OzonLogger";
    }
}
