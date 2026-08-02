package fi0;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.provider.Settings;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Namespace;

/* loaded from: classes7.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f63504a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f63505b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6571a f63506c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f63507d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Namespace f63508e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63509f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63510g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63511h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f63512i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private String f63513j;

    /* renamed from: k, reason: collision with root package name */
    private String f63514k;

    static final class a extends AbstractC7737t implements Function0<String> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String advertisingId;
            InterfaceC6571a interfaceC6571a = t.this.f63506c;
            return (interfaceC6571a == null || (advertisingId = interfaceC6571a.advertisingId()) == null) ? "0" : advertisingId;
        }
    }

    static final class b extends AbstractC7737t implements Function0<String> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            InterfaceC6571a interfaceC6571a = t.this.f63506c;
            if (interfaceC6571a != null) {
                return interfaceC6571a.firebaseAppInstanceId();
            }
            return null;
        }
    }

    static final class c extends AbstractC7737t implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return t.j(t.this);
        }
    }

    public t(@NotNull Context context, @NotNull j objectService, @NotNull x settings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(objectService, "objectService");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f63504a = context;
        this.f63505b = objectService;
        this.f63506c = settings.j();
        this.f63507d = settings.o();
        this.f63508e = settings.B();
        this.f63509f = Sc.k.b(new a());
        this.f63510g = Sc.k.b(new b());
        this.f63511h = Sc.k.b(new c());
        this.f63512i = settings.E();
        this.f63513j = settings.w();
    }

    public static final String j(t tVar) {
        String string = Settings.Secure.getString(tVar.f63504a.getContentResolver(), "android_id");
        if (string != null) {
            return string;
        }
        j jVar = tVar.f63505b;
        String b11 = jVar.b();
        if (b11 != null) {
            return b11;
        }
        String uuid = UUID.randomUUID().toString();
        jVar.a(uuid);
        Intrinsics.checkNotNullExpressionValue(uuid, "also(...)");
        return uuid;
    }

    @Override // fi0.s
    public final String a() {
        return this.f63514k;
    }

    @Override // fi0.s
    @NotNull
    public final String b() {
        return this.f63507d;
    }

    @Override // fi0.s
    public final String c() {
        return (String) this.f63510g.getValue();
    }

    @Override // fi0.s
    public final void d(String str) {
        this.f63514k = str;
    }

    @Override // fi0.s
    @NotNull
    public final String e() {
        return (String) this.f63509f.getValue();
    }

    @Override // fi0.s
    @NotNull
    public final Namespace f() {
        return this.f63508e;
    }

    @Override // fi0.s
    @NotNull
    public final String g() {
        return this.f63512i;
    }

    @Override // fi0.s
    @NotNull
    public final String h() {
        return (String) this.f63511h.getValue();
    }

    @Override // fi0.s
    @NotNull
    public final String i() {
        return this.f63513j;
    }
}
