package rl0;

import Sc.InterfaceC4008j;
import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ol0.C8751c;
import org.jetbrains.annotations.NotNull;

/* renamed from: rl0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9300k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final N f83686a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C9293d f83687b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final L f83688c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f83689d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f83690e;

    /* renamed from: rl0.k$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C9313y f83692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9313y c9313y) {
            super(0);
            this.f83692c = c9313y;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9300k c9300k = C9300k.this;
            c9300k.getClass();
            C8751c.a(c9300k.f83689d, this.f83692c);
            return Unit.f71690a;
        }
    }

    /* renamed from: rl0.k$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC7737t implements Function1<Unit, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f83693b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit it = unit;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    public C9300k(@NotNull N analyticsRepository, @NotNull C9293d sdkInfoRepository, @NotNull L appVersionNameRepository, @NotNull Context context) {
        C8751c analyticsEventProvider = C8751c.f78428a;
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(sdkInfoRepository, "sdkInfoRepository");
        Intrinsics.checkNotNullParameter(appVersionNameRepository, "appVersionNameRepository");
        Intrinsics.checkNotNullParameter(analyticsEventProvider, "analyticsEventProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83686a = analyticsRepository;
        this.f83687b = sdkInfoRepository;
        this.f83688c = appVersionNameRepository;
        this.f83689d = context;
        this.f83690e = Sc.k.b(new C9301l(this));
    }

    public final LinkedHashMap a(int i11) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String value = (String) this.f83688c.f83625a.f83616b.getValue();
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
        } else {
            value = null;
        }
        if (value != null) {
            linkedHashMap.put("appVersion", value);
        }
        String packageName = this.f83689d.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        linkedHashMap.put("app_bundle", packageName);
        linkedHashMap.put("update_type", i11 != 0 ? i11 != 1 ? "SILENT" : "IMMEDIATE" : "FLEXIBLE");
        return linkedHashMap;
    }

    public final void b(int i11, @NotNull String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(a(i11));
        linkedHashMap.put("errorCode", errorCode);
        a source = new a(new C9313y("updateStart.error", linkedHashMap));
        Intrinsics.checkNotNullParameter(source, "source");
        lm0.i iVar = new lm0.i(source);
        int i12 = jm0.e.f70218e;
        lm0.q.a(lm0.t.a(iVar, jm0.e.c()), jm0.j.a(), b.f83693b);
    }
}
