package com.ironsource;

import com.ironsource.InterfaceC4050e4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import defpackage.d28;
import defpackage.dmi;
import defpackage.ot8;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4086g4 implements InterfaceC4268q7 {

    @NotNull
    private final C4032d4 a;

    @NotNull
    private final Function1<C4376w8, Object> b;

    @NotNull
    private final InterfaceC4357v7 c;

    @NotNull
    private final InterfaceC4193m4 d;
    private final String e;

    @NotNull
    private C4376w8 f;
    private long g;

    @NotNull
    private final C4005bd h;

    @NotNull
    private String i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g4$a */
    public /* synthetic */ class a extends ot8 implements Function1<w2g, Unit> {
        public a(Object obj) {
            super(1, 0, C4086g4.class, obj, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V");
        }

        public final void a(@NotNull Object obj) {
            ((C4086g4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            a(((w2g) obj).a);
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.g4$b */
    public /* synthetic */ class b extends ot8 implements Function1<w2g, Unit> {
        public b(Object obj) {
            super(1, 0, C4086g4.class, obj, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V");
        }

        public final void a(@NotNull Object obj) {
            ((C4086g4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            a(((w2g) obj).a);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4086g4(@NotNull C4032d4 c4032d4, @NotNull Function1<? super C4376w8, ? extends Object> function1, @NotNull InterfaceC4357v7 interfaceC4357v7, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        c4032d4.getClass();
        function1.getClass();
        interfaceC4357v7.getClass();
        interfaceC4193m4.getClass();
        this.a = c4032d4;
        this.b = function1;
        this.c = interfaceC4357v7;
        this.d = interfaceC4193m4;
        this.e = "g4";
        this.f = new C4376w8(c4032d4.d(), "mobileController_0.html");
        this.g = interfaceC4193m4.a();
        this.h = new C4005bd(c4032d4.a());
        this.i = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        p2g p2gVar = w2g.b;
        if (obj instanceof u2g) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || Intrinsics.c(jSONObject.optString("htmlBuildNumber"), "")) {
            a("0").m();
            return;
        }
        SDKUtils.updateControllerConfig("abTestMap", jSONObject);
        String string = jSONObject.getString("htmlBuildNumber");
        string.getClass();
        this.i = string;
        C4068f4 a2 = a(string);
        if (!a2.j()) {
            a2.m();
            return;
        }
        C4376w8 k = a2.k();
        this.f = k;
        this.b.invoke(k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        p2g p2gVar = w2g.b;
        boolean z = obj instanceof u2g;
        if (z) {
            new InterfaceC4050e4.a(this.a.b()).a();
        } else {
            C4376w8 c4376w8 = (C4376w8) (z ? null : obj);
            if (!Intrinsics.c(c4376w8 != null ? c4376w8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    c4376w8.getClass();
                    d28.f(c4376w8, this.f);
                } catch (Exception e) {
                    C4157k4.d().a(e);
                    e.getMessage();
                }
                c4376w8.getClass();
                this.f = c4376w8;
            }
            new InterfaceC4050e4.b(this.a.b(), this.g, this.d).a();
        }
        Function1<C4376w8, Object> function1 = this.b;
        if (z) {
            obj = null;
        }
        function1.invoke(obj);
    }

    @Override // com.ironsource.InterfaceC4268q7
    @NotNull
    public C4376w8 c() {
        return this.f;
    }

    @NotNull
    public final Function1<C4376w8, Object> d() {
        return this.b;
    }

    @NotNull
    public final InterfaceC4193m4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4268q7
    public boolean a(@NotNull C4376w8 c4376w8) {
        c4376w8.getClass();
        String name = c4376w8.getName();
        name.getClass();
        return new Regex("mobileController(_\\d+)?\\.html").f(name);
    }

    private final C4068f4 a(String str) {
        return new C4068f4(new C4438zg(this.h, str), dmi.r(this.a.d(), "/mobileController_", str, ".html"), this.c, new a(this));
    }

    @Override // com.ironsource.InterfaceC4268q7
    public void b() {
        this.g = this.d.a();
        new C4009c(new C4027d(this.h), dmi.y(this.a.d(), "/temp"), this.c, new b(this)).m();
    }
}
