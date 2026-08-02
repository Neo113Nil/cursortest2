package jc0;

import Fb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import android.util.Base64;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import td0.C9862b;

/* renamed from: jc0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7345h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Moshi> f69714a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fb0.f f69715b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69716c;

    /* renamed from: jc0.h$a */
    static final class a extends AbstractC7737t implements Function0<JsonAdapter<Map<?, ?>>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<Map<?, ?>> invoke() {
            return ((Moshi) AbstractC7345h.this.f69714a.getValue()).c(Map.class);
        }
    }

    public AbstractC7345h(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        this.f69714a = moshi;
        this.f69715b = ozonIdConfig;
        this.f69716c = k.b(new a());
    }

    protected static void d(@NotNull Map map, @NotNull String key, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            map.put(key, obj);
        }
    }

    @NotNull
    protected final String b(@NotNull String str, @NotNull Function1<? super Map<String, Object>, Unit> createPayload) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(createPayload, "createPayload");
        Tc.d builder = new Tc.d();
        createPayload.invoke(builder);
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        if (u11.isEmpty()) {
            return str;
        }
        A.f33515l.getClass();
        A c11 = A.b.c("http://ozon.ru/" + str);
        String p11 = c11.p("payload");
        InterfaceC4008j interfaceC4008j = this.f69716c;
        Map map = null;
        if (p11 != null) {
            Intrinsics.checkNotNullParameter(p11, "<this>");
            byte[] decode = Base64.decode(p11, 1);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            String str2 = new String(decode, Charsets.UTF_8);
            String lineSeparator = System.lineSeparator();
            Intrinsics.checkNotNullExpressionValue(lineSeparator, "lineSeparator(...)");
            Map map2 = (Map) ((JsonAdapter) interfaceC4008j.getValue()).fromJson(kotlin.text.h.X(str2, lineSeparator, "", false));
            if (map2 != null) {
                map = new LinkedHashMap(U.h(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Double) {
                        value = Integer.valueOf((int) ((Number) value).doubleValue());
                    }
                    map.put(key, value);
                }
            }
        }
        if (map == null) {
            map = U.c();
        }
        JsonAdapter jsonAdapter = (JsonAdapter) interfaceC4008j.getValue();
        Intrinsics.checkNotNullExpressionValue(jsonAdapter, "<get-payloadsAdapter>(...)");
        LinkedHashMap m11 = U.m(map, u11);
        Intrinsics.checkNotNullParameter(jsonAdapter, "<this>");
        String json = jsonAdapter.toJson(m11);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String a11 = C9862b.a(1, bytes);
        A.a j11 = c11.j();
        j11.y("payload", a11);
        return kotlin.text.h.i0(j11.e().toString(), "http://ozon.ru/");
    }

    @NotNull
    protected final String c(@NotNull String actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return Sh.b.c("trackEvent?actionType=", actionType, "&namespace=", this.f69715b.getAppName() == f.a.BX_APP ? "bx" : "ozonid");
    }
}
