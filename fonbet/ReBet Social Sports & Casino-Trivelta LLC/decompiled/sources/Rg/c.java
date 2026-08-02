package Rg;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;

/* loaded from: classes3.dex */
public final class c extends Qg.g {

    /* renamed from: d, reason: collision with root package name */
    public OkHttpClient f10233d;

    /* renamed from: f, reason: collision with root package name */
    public WebSocket.Factory f10235f;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f10232c = a.f10236d;

    /* renamed from: e, reason: collision with root package name */
    public int f10234e = 10;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f10236d = new a();

        public a() {
            super(1);
        }

        public final void a(OkHttpClient.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "$this$null");
            builder.followRedirects(false);
            builder.followSslRedirects(false);
            builder.retryOnConnectionFailure(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OkHttpClient.Builder) obj);
            return Unit.INSTANCE;
        }
    }

    public final int c() {
        return this.f10234e;
    }

    public final Function1 d() {
        return this.f10232c;
    }

    public final OkHttpClient e() {
        return this.f10233d;
    }

    public final WebSocket.Factory f() {
        return this.f10235f;
    }
}
