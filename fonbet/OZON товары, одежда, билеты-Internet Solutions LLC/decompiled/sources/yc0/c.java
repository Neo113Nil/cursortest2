package yc0;

import Fb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f106552a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f106553b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ub0.c> f106554c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106555d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106556e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f106557f;

    static final class a extends AbstractC7737t implements Function1<Map<String, String>, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, String> map) {
            String str;
            Map<String, String> buildMutableMapLazy = map;
            Intrinsics.checkNotNullParameter(buildMutableMapLazy, "$this$buildMutableMapLazy");
            c cVar = c.this;
            buildMutableMapLazy.putAll(cVar.d());
            int i11 = 0;
            while (true) {
                str = "14.8.1";
                if (i11 >= 6) {
                    i11 = -1;
                    break;
                }
                char charAt = "14.8.1".charAt(i11);
                if (!Character.isDigit(charAt) && charAt != '.') {
                    break;
                }
                i11++;
            }
            if (i11 != -1) {
                str = "14.8.1".substring(0, i11);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            }
            buildMutableMapLazy.put("x-o3-sdk-versions", "ozonid_android/" + str);
            f fVar = cVar.f106553b;
            String meshVersion = fVar.getMeshVersion();
            if (meshVersion != null) {
                buildMutableMapLazy.put("x-o3-meshversion", meshVersion);
            }
            String abVariants = fVar.getAbVariants();
            if (abVariants != null) {
                buildMutableMapLazy.put("x-o3-ab-variants", abVariants);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<Map<String, String>, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, String> map) {
            Map<String, String> buildMutableMapLazy = map;
            Intrinsics.checkNotNullParameter(buildMutableMapLazy, "$this$buildMutableMapLazy");
            c cVar = c.this;
            buildMutableMapLazy.putAll(c.b(cVar));
            buildMutableMapLazy.put("accept", "application/json; charset=utf-8");
            f fVar = cVar.f106553b;
            buildMutableMapLazy.put("user-agent", fVar.getUserAgent());
            String internalHeadersToken = fVar.getInternalHeadersToken();
            if (internalHeadersToken != null) {
                buildMutableMapLazy.put("x-o3-internal-headers-token", internalHeadersToken);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: yc0.c$c, reason: collision with other inner class name */
    static final class C2304c extends AbstractC7737t implements Function1<Map<String, String>, Unit> {
        C2304c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Map<String, String> map) {
            Map<String, String> buildMutableMapLazy = map;
            Intrinsics.checkNotNullParameter(buildMutableMapLazy, "$this$buildMutableMapLazy");
            f fVar = c.this.f106553b;
            buildMutableMapLazy.put("x-o3-app-name", fVar.getAppName().a());
            buildMutableMapLazy.put("x-o3-app-version", fVar.getAppVersion());
            return Unit.f71690a;
        }
    }

    public c(@NotNull Application application, @NotNull f ozonIdConfig, @NotNull InterfaceC4008j<Ub0.c> localization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f106552a = application;
        this.f106553b = ozonIdConfig;
        this.f106554c = localization;
        this.f106555d = k.b(new yc0.b(new C2304c()));
        this.f106556e = k.b(new yc0.b(new a()));
        this.f106557f = k.b(new yc0.b(new b()));
    }

    public static final Map b(c cVar) {
        return (Map) cVar.f106556e.getValue();
    }

    @NotNull
    public final Map<String, String> c() {
        Map<String, String> map = (Map) this.f106557f.getValue();
        map.put("x-o3-language", this.f106554c.getValue().b());
        return map;
    }

    @NotNull
    public final Map<String, String> d() {
        return (Map) this.f106555d.getValue();
    }

    @NotNull
    public final Map<String, String> e() {
        Map<String, String> map = (Map) this.f106556e.getValue();
        map.put("x-o3-language", this.f106554c.getValue().b());
        map.put("x-ob-theme", ThemeExtKt.isDarkThemeActive(this.f106552a) ? "dark" : "light");
        return map;
    }
}
