package le;

import Ph.AbstractC1457j;
import Ph.P;
import android.os.Build;
import be.InterfaceC2419a;
import com.twilio.voice.Constants;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import de.AbstractC4064a;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import og.i;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import rd.C6218a;
import yd.C6876a;

/* loaded from: classes4.dex */
public final class c implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final Ae.a f55842a;

    /* renamed from: b, reason: collision with root package name */
    public final C6876a f55843b;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f55844n;

        /* renamed from: o, reason: collision with root package name */
        public int f55845o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f55846p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Request.Builder f55847q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ c f55848r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Request f55849s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f55850t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Request.Builder builder, c cVar, Request request, String str, Continuation continuation) {
            super(2, continuation);
            this.f55847q = builder;
            this.f55848r = cVar;
            this.f55849s = request;
            this.f55850t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f55847q, this.f55848r, this.f55849s, this.f55850t, continuation);
            aVar.f55846p = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x011a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String z10;
            c cVar;
            Request.Builder builder;
            Request.Builder builder2;
            Object m147constructorimpl;
            String d10;
            String c10;
            String g10;
            String h10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f55845o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f55847q.addHeader("X-SIQ-Channel", Constants.PLATFORM_ANDROID);
                if (this.f55848r.e(this.f55849s)) {
                    Request.Builder builder3 = this.f55847q;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        String Y10 = C6218a.Y(true);
                        Intrinsics.checkNotNullExpressionValue(Y10, "getUserAgentDetails(...)");
                        m147constructorimpl = Result.m147constructorimpl(builder3.addHeader("X-Pex-Agent", Y10));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                    if (m150exceptionOrNullimpl != null) {
                        LiveChatUtil.log(m150exceptionOrNullimpl);
                    }
                }
                this.f55847q.addHeader("X-Mobilisten-Version", String.valueOf(LiveChatUtil.getVersion()));
                Request.Builder builder4 = this.f55847q;
                String mobilistenVersionName = LiveChatUtil.getMobilistenVersionName();
                Intrinsics.checkNotNullExpressionValue(mobilistenVersionName, "getMobilistenVersionName(...)");
                builder4.addHeader("X-Mobilisten-Version-Name", mobilistenVersionName);
                Request.Builder builder5 = this.f55847q;
                String platformName = LiveChatUtil.getPlatformName();
                Intrinsics.checkNotNullExpressionValue(platformName, "getPlatformName(...)");
                builder5.addHeader("X-Mobilisten-Platform", platformName);
                z10 = this.f55848r.f55842a.z();
                if (z10 != null) {
                    cVar = this.f55848r;
                    Request request = this.f55849s;
                    builder = this.f55847q;
                    if (cVar.f(request)) {
                        if (i.f(z10)) {
                            builder.addHeader("x-siq-accesstoken", z10);
                        }
                        String h11 = cVar.f55842a.h();
                        if (h11 != null && h11.length() > 0) {
                            builder.addHeader("x-siq-appid", h11);
                        }
                    } else {
                        if (Intrinsics.areEqual(cVar.f55843b.b().b(), Boxing.boxBoolean(false)) && i.f(z10)) {
                            Bd.b u10 = cVar.f55843b.u();
                            if (u10 != null) {
                                C6876a c6876a = cVar.f55843b;
                                Bd.a aVar = Bd.a.ApiCallValidation;
                                this.f55846p = cVar;
                                this.f55844n = builder;
                                this.f55845o = 1;
                                obj = c6876a.c(u10, aVar, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                builder2 = builder;
                            }
                            z10 = cVar.f55842a.z();
                        }
                        if (i.f(z10)) {
                            Intrinsics.checkNotNull(z10);
                            builder.addHeader("x-siq-accesstoken", z10);
                        }
                        h10 = cVar.f55842a.h();
                        if (h10 != null && h10.length() > 0) {
                            builder.addHeader("x-siq-appid", h10);
                        }
                    }
                }
                d10 = MobilistenUtil.d();
                if (d10 != null) {
                    this.f55847q.addHeader("x-appkey", d10);
                }
                c10 = MobilistenUtil.c();
                if (c10 != null) {
                    this.f55847q.addHeader("x-accesskey", c10);
                }
                g10 = MobilistenUtil.g();
                if (g10 != null) {
                    this.f55847q.addHeader("x-bundleid", g10);
                }
                return this.f55847q.header(zendesk.core.Constants.USER_AGENT_HEADER_KEY, this.f55850t);
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builder2 = (Request.Builder) this.f55844n;
            cVar = (c) this.f55846p;
            ResultKt.throwOnFailure(obj);
            builder = builder2;
            z10 = cVar.f55842a.z();
            if (i.f(z10)) {
            }
            h10 = cVar.f55842a.h();
            if (h10 != null) {
                builder.addHeader("x-siq-appid", h10);
            }
            d10 = MobilistenUtil.d();
            if (d10 != null) {
            }
            c10 = MobilistenUtil.c();
            if (c10 != null) {
            }
            g10 = MobilistenUtil.g();
            if (g10 != null) {
            }
            return this.f55847q.header(zendesk.core.Constants.USER_AGENT_HEADER_KEY, this.f55850t);
        }
    }

    public c(Ae.a commonPreferencesLocalDataSource, C6876a authenticationRepository) {
        Intrinsics.checkNotNullParameter(commonPreferencesLocalDataSource, "commonPreferencesLocalDataSource");
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        this.f55842a = commonPreferencesLocalDataSource;
        this.f55843b = authenticationRepository;
    }

    public final boolean e(Request request) {
        return AbstractC4064a.a(request, be.c.class) != null;
    }

    public final boolean f(Request request) {
        return AbstractC4064a.a(request, InterfaceC2419a.class) != null;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", ");
        Intrinsics.checkNotNull(str2);
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = str2.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase2 = str.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!StringsKt.startsWith$default(lowerCase, lowerCase2, false, 2, (Object) null)) {
            str2 = str + ' ' + str2;
        }
        sb2.append(str2);
        sb2.append(')');
        String sb3 = sb2.toString();
        Request request = chain.request();
        Request.Builder method = request.newBuilder().method(request.method(), request.body());
        AbstractC1457j.b(null, new a(method, this, request, sb3, null), 1, null);
        return chain.proceed(method.build());
    }
}
