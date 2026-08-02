package io.sentry.rrweb;

import I1.w;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e extends d implements InterfaceC7220x0 {

    /* renamed from: d, reason: collision with root package name */
    private b f68423d;

    /* renamed from: e, reason: collision with root package name */
    private int f68424e;

    /* renamed from: f, reason: collision with root package name */
    private float f68425f;

    /* renamed from: g, reason: collision with root package name */
    private float f68426g;

    /* renamed from: h, reason: collision with root package name */
    private int f68427h;

    /* renamed from: i, reason: collision with root package name */
    private int f68428i;

    /* renamed from: j, reason: collision with root package name */
    private HashMap f68429j;

    /* renamed from: k, reason: collision with root package name */
    private HashMap f68430k;

    public static final class a implements InterfaceC7174n0<e> {
        @NotNull
        public static e b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            e eVar = new e();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName2 = interfaceC7131c1.nextName();
                nextName2.getClass();
                if (nextName2.equals("data")) {
                    interfaceC7131c1.beginObject();
                    HashMap hashMap2 = null;
                    while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        nextName = interfaceC7131c1.nextName();
                        nextName.getClass();
                        switch (nextName) {
                            case "x":
                                eVar.f68425f = interfaceC7131c1.j0();
                                break;
                            case "y":
                                eVar.f68426g = interfaceC7131c1.j0();
                                break;
                            case "id":
                                eVar.f68424e = interfaceC7131c1.nextInt();
                                break;
                            case "type":
                                eVar.f68423d = (b) interfaceC7131c1.S(iLogger, new b.a());
                                break;
                            case "pointerType":
                                eVar.f68427h = interfaceC7131c1.nextInt();
                                break;
                            case "pointerId":
                                eVar.f68428i = interfaceC7131c1.nextInt();
                                break;
                            default:
                                if (!d.a.a(eVar, nextName, interfaceC7131c1, iLogger)) {
                                    if (hashMap2 == null) {
                                        hashMap2 = new HashMap();
                                    }
                                    interfaceC7131c1.Q0(iLogger, hashMap2, nextName);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    eVar.o(hashMap2);
                    interfaceC7131c1.endObject();
                } else if (!b.a.a(eVar, nextName2, interfaceC7131c1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName2);
                }
            }
            eVar.s(hashMap);
            interfaceC7131c1.endObject();
            return eVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ e a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    /* loaded from: classes10.dex */
    public enum b implements InterfaceC7220x0 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        public static final class a implements InterfaceC7174n0<b> {
            @Override // io.sentry.InterfaceC7174n0
            @NotNull
            public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
                return b.values()[interfaceC7131c1.nextInt()];
            }
        }

        @Override // io.sentry.InterfaceC7220x0
        public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
            ((C7212v0) interfaceC7135d1).l(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f68427h = 2;
    }

    public final void o(Map<String, Object> map) {
        this.f68430k = (HashMap) map;
    }

    public final void p() {
        this.f68424e = 0;
    }

    public final void q(b bVar) {
        this.f68423d = bVar;
    }

    public final void r(int i11) {
        this.f68428i = i11;
    }

    public final void s(Map<String, Object> map) {
        this.f68429j = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        b.C1119b.a(this, c7212v0, iLogger);
        c7212v0.g("data");
        c7212v0.b();
        d.c.a(this, c7212v0, iLogger);
        c7212v0.g("type");
        c7212v0.m(iLogger, this.f68423d);
        c7212v0.g("id");
        c7212v0.l(this.f68424e);
        c7212v0.g("x");
        c7212v0.k(this.f68425f);
        c7212v0.g("y");
        c7212v0.k(this.f68426g);
        c7212v0.g("pointerType");
        c7212v0.l(this.f68427h);
        c7212v0.g("pointerId");
        c7212v0.l(this.f68428i);
        HashMap hashMap = this.f68430k;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f68430k, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        HashMap hashMap2 = this.f68429j;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                w.e(this.f68429j, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(float f7) {
        this.f68425f = f7;
    }

    public final void u(float f7) {
        this.f68426g = f7;
    }
}
