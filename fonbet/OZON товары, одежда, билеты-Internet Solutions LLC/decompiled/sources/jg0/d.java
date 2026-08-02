package jg0;

import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import pg0.C8928b;
import pg0.InterfaceC8927a;
import rg0.C9270b;
import sg0.InterfaceC9693a;
import tg0.C9873a;
import wg0.m;
import xb0.InterfaceC10696a;
import xb0.InterfaceC10697b;
import yg0.C10900c;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70076a = k.b(C1148d.f70084b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C9270b> f70077b = k.b(a.f70081b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70078c = k.b(b.f70082b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70079d = k.b(c.f70083b);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f70080e = 0;

    static final class a extends AbstractC7737t implements Function0<C9270b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f70081b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C9270b invoke() {
            return new C9270b(k.b(C7424a.f70073b), k.b(jg0.b.f70074b), k.b(jg0.c.f70075b));
        }
    }

    static final class b extends AbstractC7737t implements Function0<C9873a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f70082b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final C9873a invoke() {
            return new C9873a(k.b(e.f70085b));
        }
    }

    static final class c extends AbstractC7737t implements Function0<C10900c> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f70083b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final C10900c invoke() {
            int i11 = d.f70080e;
            Application a11 = d.a();
            InterfaceC10697b d11 = d.d();
            return new C10900c(a11, d11 != null ? d11.B() : null, f.f70086a.g().getTestDsn());
        }
    }

    /* renamed from: jg0.d$d, reason: collision with other inner class name */
    static final class C1148d extends AbstractC7737t implements Function0<C8928b> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1148d f70084b = new C1148d(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8928b invoke() {
            return new C8928b(d.a());
        }
    }

    public static final Application a() {
        return f.f70086a.i().a().c().a();
    }

    public static final C10900c b() {
        return (C10900c) f70079d.getValue();
    }

    @NotNull
    public static InterfaceC4008j c() {
        return f70077b;
    }

    public static InterfaceC10697b d() {
        Ld0.e d11 = f.f70086a.i().a().d(InterfaceC10696a.class);
        InterfaceC10697b interfaceC10697b = d11 instanceof InterfaceC10697b ? (InterfaceC10697b) d11 : null;
        if (interfaceC10697b == null) {
            InterfaceC9693a.f98765a.a("AndroidDI: Не проинициализирован `OzonIdLibsApi`");
        }
        return interfaceC10697b;
    }

    @NotNull
    public static C9873a e() {
        return (C9873a) f70078c.getValue();
    }

    @NotNull
    public static m f() {
        C10900c c10900c = (C10900c) f70079d.getValue();
        InterfaceC10697b d11 = d();
        return new m(c10900c, d11 != null ? d11.B() : null);
    }

    @NotNull
    public static InterfaceC8927a g() {
        return (InterfaceC8927a) f70076a.getValue();
    }
}
