package io.sentry.rrweb;

import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import java.util.HashMap;
import java.util.Map;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e extends d implements G0 {

    /* renamed from: d, reason: collision with root package name */
    public b f52644d;

    /* renamed from: e, reason: collision with root package name */
    public int f52645e;

    /* renamed from: f, reason: collision with root package name */
    public float f52646f;

    /* renamed from: g, reason: collision with root package name */
    public float f52647g;

    /* renamed from: h, reason: collision with root package name */
    public int f52648h;

    /* renamed from: i, reason: collision with root package name */
    public int f52649i;

    /* renamed from: j, reason: collision with root package name */
    public Map f52650j;

    /* renamed from: k, reason: collision with root package name */
    public Map f52651k;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            e eVar = new e();
            b.a aVar = new b.a();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals(EventKeys.DATA)) {
                    c(eVar, interfaceC4809q1, iLogger);
                } else if (!aVar.a(eVar, f02, interfaceC4809q1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC4809q1.g1(iLogger, hashMap, f02);
                }
            }
            eVar.t(hashMap);
            interfaceC4809q1.t();
            return eVar;
        }

        public final void c(e eVar, InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            d.a aVar = new d.a();
            interfaceC4809q1.m();
            HashMap hashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "x":
                        eVar.f52646f = interfaceC4809q1.nextFloat();
                        break;
                    case "y":
                        eVar.f52647g = interfaceC4809q1.nextFloat();
                        break;
                    case "id":
                        eVar.f52645e = interfaceC4809q1.nextInt();
                        break;
                    case "type":
                        eVar.f52644d = (b) interfaceC4809q1.x0(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f52648h = interfaceC4809q1.nextInt();
                        break;
                    case "pointerId":
                        eVar.f52649i = interfaceC4809q1.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, f02, interfaceC4809q1, iLogger)) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            interfaceC4809q1.g1(iLogger, hashMap, f02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            eVar.p(hashMap);
            interfaceC4809q1.t();
        }
    }

    public enum b implements G0 {
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

        public static final class a implements InterfaceC4859w0 {
            @Override // io.sentry.InterfaceC4859w0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
                return b.values()[interfaceC4809q1.nextInt()];
            }
        }

        @Override // io.sentry.G0
        public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
            interfaceC4813r1.a(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f52648h = 2;
    }

    private void o(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new d.c().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d("type").j(iLogger, this.f52644d);
        interfaceC4813r1.d(StackTraceHelper.ID_KEY).a(this.f52645e);
        interfaceC4813r1.d(C5444x.f55808b).b(this.f52646f);
        interfaceC4813r1.d("y").b(this.f52647g);
        interfaceC4813r1.d("pointerType").a(this.f52648h);
        interfaceC4813r1.d("pointerId").a(this.f52649i);
        Map map = this.f52651k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52651k.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void p(Map map) {
        this.f52651k = map;
    }

    public void q(int i10) {
        this.f52645e = i10;
    }

    public void r(b bVar) {
        this.f52644d = bVar;
    }

    public void s(int i10) {
        this.f52649i = i10;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        o(interfaceC4813r1, iLogger);
        Map map = this.f52650j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52650j.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void t(Map map) {
        this.f52650j = map;
    }

    public void u(float f10) {
        this.f52646f = f10;
    }

    public void v(float f10) {
        this.f52647g = f10;
    }
}
