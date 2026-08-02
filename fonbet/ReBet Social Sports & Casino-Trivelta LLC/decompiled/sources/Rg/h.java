package Rg;

import Ph.C1469p;
import Tg.v;
import ah.InterfaceC2019k;
import ah.u;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;

/* loaded from: classes3.dex */
public abstract class h {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Protocol.values().length];
            try {
                iArr[Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Protocol.SPDY_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Protocol.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Protocol.QUIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Call f10300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Call call) {
            super(1);
            this.f10300d = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            this.f10300d.cancel();
        }
    }

    public static final class c implements InterfaceC2019k {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10301c = true;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Headers f10302d;

        public c(Headers headers) {
            this.f10302d = headers;
        }

        @Override // ch.x
        public Set a() {
            return this.f10302d.toMultimap().entrySet();
        }

        @Override // ch.x
        public boolean b() {
            return this.f10301c;
        }

        @Override // ch.x
        public List c(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            List<String> values = this.f10302d.values(name);
            if (values.isEmpty()) {
                return null;
            }
            return values;
        }

        @Override // ch.x
        public void d(Function2 function2) {
            InterfaceC2019k.b.a(this, function2);
        }

        @Override // ch.x
        public String get(String str) {
            return InterfaceC2019k.b.b(this, str);
        }

        @Override // ch.x
        public Set names() {
            return this.f10302d.names();
        }
    }

    public static final Object b(OkHttpClient okHttpClient, Request request, Wg.d dVar, Continuation continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        Call newCall = okHttpClient.newCall(request);
        newCall.enqueue(new Rg.b(dVar, c1469p));
        c1469p.c(new b(newCall));
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10;
    }

    public static final InterfaceC2019k c(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        return new c(headers);
    }

    public static final u d(Protocol protocol) {
        Intrinsics.checkNotNullParameter(protocol, "<this>");
        switch (a.$EnumSwitchMapping$0[protocol.ordinal()]) {
            case 1:
                return u.f16175d.a();
            case 2:
                return u.f16175d.b();
            case 3:
                return u.f16175d.e();
            case 4:
                return u.f16175d.c();
            case 5:
                return u.f16175d.c();
            case 6:
                return u.f16175d.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean e(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && StringsKt.contains((CharSequence) message, (CharSequence) "connect", true);
    }

    public static final Throwable f(Wg.d dVar, IOException iOException) {
        if (!(iOException instanceof i)) {
            return iOException instanceof SocketTimeoutException ? e(iOException) ? v.a(dVar, iOException) : v.b(dVar, iOException) : iOException;
        }
        Throwable cause = iOException.getCause();
        return cause == null ? iOException : cause;
    }
}
