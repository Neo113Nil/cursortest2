package c;

import Ph.AbstractC1440a0;
import Ph.AbstractC1455i;
import Ph.C1452g0;
import com.surt.guardian.network.RiskLevel;
import com.surt.guardian.utils.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.CertificatePinner;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: d, reason: collision with root package name */
    public static final Dc.a f26396d = new Dc.a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final MediaType f26397e = MediaType.INSTANCE.get("application/json; charset=utf-8");

    /* renamed from: a, reason: collision with root package name */
    public final String f26398a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26399b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f26400c;

    public D(String baseUrl, List certificatePins) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(certificatePins, "certificatePins");
        this.f26398a = baseUrl;
        this.f26399b = certificatePins;
        this.f26400c = LazyKt.lazy(new C2448j(this));
    }

    public static RiskLevel a(String str) {
        String str2;
        if (str != null) {
            str2 = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -2024701067) {
                if (hashCode != 75572) {
                    if (hashCode != 2217378) {
                        if (hashCode == 696544716 && str2.equals("BLOCKED")) {
                            return RiskLevel.BLOCKED;
                        }
                    } else if (str2.equals("HIGH")) {
                        return RiskLevel.HIGH;
                    }
                } else if (str2.equals("LOW")) {
                    return RiskLevel.LOW;
                }
            } else if (str2.equals("MEDIUM")) {
                return RiskLevel.MEDIUM;
            }
        }
        return RiskLevel.UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: Exception -> 0x005e, TryCatch #1 {Exception -> 0x005e, blocks: (B:24:0x0092, B:28:0x00a1, B:30:0x00a9, B:31:0x00ad, B:50:0x005a), top: B:49:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [T] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v13, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f0 -> B:11:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0101 -> B:12:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(D d10, C2469v c2469v, Continuation continuation) {
        C2456n c2456n;
        int i10;
        int i11;
        Ref.ObjectRef objectRef;
        C2469v c2469v2;
        int i12;
        Ref.LongRef longRef;
        ?? e10;
        ?? r72;
        int i13;
        C2469v c2469v3;
        Object value;
        d10.getClass();
        if (continuation instanceof C2456n) {
            c2456n = (C2456n) continuation;
            int i14 = c2456n.f26638v;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2456n.f26638v = i14 - Integer.MIN_VALUE;
                Object obj = c2456n.f26636t;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c2456n.f26638v;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = 1000L;
                    i11 = 3;
                    objectRef = objectRef2;
                    c2469v2 = c2469v;
                    i12 = 0;
                    longRef = longRef2;
                    if (i12 >= i11) {
                    }
                } else if (i10 == 1) {
                    i12 = c2456n.f26635s;
                    i13 = c2456n.f26634r;
                    i11 = c2456n.f26633q;
                    longRef = (Ref.LongRef) c2456n.f26632p;
                    objectRef = (Ref.ObjectRef) c2456n.f26631o;
                    r72 = (Function1) c2456n.f26630n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r72 = r72;
                    } catch (Exception e11) {
                        e10 = e11;
                        objectRef.element = e10;
                        Logger.f41582a.f("ApiClient", "Request failed (attempt " + (i12 + 1) + "/3): " + e10.getMessage());
                        c2469v3 = r72;
                        if (i12 < 2) {
                        }
                    }
                    value = ((Result) obj).getValue();
                    if (!Result.m154isSuccessimpl(value)) {
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i15 = c2456n.f26634r;
                    int i16 = c2456n.f26633q;
                    Ref.LongRef longRef3 = (Ref.LongRef) c2456n.f26632p;
                    Ref.ObjectRef objectRef3 = (Ref.ObjectRef) c2456n.f26631o;
                    ?? r62 = (Function1) c2456n.f26630n;
                    ResultKt.throwOnFailure(obj);
                    C2469v c2469v4 = r62;
                    longRef3.element *= 2;
                    c2469v2 = c2469v4;
                    objectRef = objectRef3;
                    longRef = longRef3;
                    i11 = i16;
                    i13 = i15;
                    i12 = i13 + 1;
                    if (i12 >= i11) {
                        try {
                        } catch (Exception e12) {
                            r72 = c2469v2;
                            e10 = e12;
                            i13 = i12;
                            objectRef.element = e10;
                            Logger.f41582a.f("ApiClient", "Request failed (attempt " + (i12 + 1) + "/3): " + e10.getMessage());
                            c2469v3 = r72;
                            if (i12 < 2) {
                            }
                        }
                        c2456n.f26630n = c2469v2;
                        c2456n.f26631o = objectRef;
                        c2456n.f26632p = longRef;
                        c2456n.f26633q = i11;
                        c2456n.f26634r = i12;
                        c2456n.f26635s = i12;
                        c2456n.f26638v = 1;
                        Object invoke = c2469v2.invoke(c2456n);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r72 = c2469v2;
                        obj = invoke;
                        i13 = i12;
                        value = ((Result) obj).getValue();
                        if (!Result.m154isSuccessimpl(value)) {
                            return value;
                        }
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(value);
                        objectRef.element = m150exceptionOrNullimpl instanceof Exception ? (Exception) m150exceptionOrNullimpl : 0;
                        c2469v3 = r72;
                        if (i12 < 2) {
                            long j10 = longRef.element;
                            c2456n.f26630n = c2469v3;
                            c2456n.f26631o = objectRef;
                            c2456n.f26632p = longRef;
                            c2456n.f26633q = i11;
                            c2456n.f26634r = i13;
                            c2456n.f26638v = 2;
                            if (AbstractC1440a0.a(j10, c2456n) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i15 = i13;
                            i16 = i11;
                            longRef3 = longRef;
                            objectRef3 = objectRef;
                            c2469v4 = c2469v3;
                            longRef3.element *= 2;
                            c2469v2 = c2469v4;
                            objectRef = objectRef3;
                            longRef = longRef3;
                            i11 = i16;
                            i13 = i15;
                            i12 = i13 + 1;
                            if (i12 >= i11) {
                                Result.Companion companion = Result.INSTANCE;
                                Throwable th2 = (Exception) objectRef.element;
                                if (th2 == null) {
                                    th2 = new IOException("Request failed after 3 attempts");
                                }
                                return Result.m147constructorimpl(ResultKt.createFailure(th2));
                            }
                        } else {
                            c2469v2 = c2469v3;
                            i12 = i13 + 1;
                            if (i12 >= i11) {
                            }
                        }
                    }
                }
            }
        }
        c2456n = new C2456n(d10, continuation);
        Object obj2 = c2456n.f26636t;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c2456n.f26638v;
        if (i10 != 0) {
        }
    }

    public static ArrayList d(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object opt = jSONArray.opt(i10);
            if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
                opt = null;
            } else if (opt instanceof JSONObject) {
                Intrinsics.checkNotNull(opt);
                opt = e((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                Intrinsics.checkNotNull(opt);
                opt = d((JSONArray) opt);
            }
            arrayList.add(opt);
        }
        return arrayList;
    }

    public static LinkedHashMap e(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            Intrinsics.checkNotNull(next);
            if (Intrinsics.areEqual(opt, JSONObject.NULL)) {
                opt = null;
            } else if (opt instanceof JSONObject) {
                Intrinsics.checkNotNull(opt);
                opt = e((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                Intrinsics.checkNotNull(opt);
                opt = d((JSONArray) opt);
            }
            linkedHashMap.put(next, opt);
        }
        return linkedHashMap;
    }

    public static final OkHttpClient g(D d10) {
        d10.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder retryOnConnectionFailure = builder.connectTimeout(10L, timeUnit).readTimeout(20L, timeUnit).writeTimeout(20L, timeUnit).retryOnConnectionFailure(false);
        if (!d10.f26399b.isEmpty()) {
            String str = (String) StringsKt.split$default((CharSequence) new Regex("^https?://").replace(d10.f26398a, ""), new String[]{"/"}, false, 0, 6, (Object) null).get(0);
            CertificatePinner.Builder builder2 = new CertificatePinner.Builder();
            Iterator it = d10.f26399b.iterator();
            while (it.hasNext()) {
                builder2.add(str, "sha256/" + ((String) it.next()));
            }
            retryOnConnectionFailure.certificatePinner(builder2.build());
            Logger.f41582a.d("ApiClient", "Certificate pinning enabled with " + d10.f26399b.size() + " pins");
        }
        retryOnConnectionFailure.addInterceptor(new C2440f());
        return retryOnConnectionFailure.build();
    }

    public static final OkHttpClient i(D d10) {
        return (OkHttpClient) d10.f26400c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(G g10, String str, Continuation continuation) {
        r rVar;
        int i10;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i11 = rVar.f26659p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f26659p = i11 - Integer.MIN_VALUE;
                Object obj = rVar.f26657n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = rVar.f26659p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ph.L b10 = C1452g0.b();
                    C2473z c2473z = new C2473z(this, g10, str, null);
                    rVar.f26659p = 1;
                    obj = AbstractC1455i.g(b10, c2473z, rVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        rVar = new r(this, continuation);
        Object obj2 = rVar.f26657n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = rVar.f26659p;
        if (i10 != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
