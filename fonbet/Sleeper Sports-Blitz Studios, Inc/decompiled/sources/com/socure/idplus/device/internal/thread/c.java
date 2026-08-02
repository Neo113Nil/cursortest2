package com.socure.idplus.device.internal.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.socure.idplus.device.internal.behavior.model.FocusChangeEvent;
import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import com.socure.idplus.device.internal.behavior.model.KeyPressEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import com.socure.idplus.device.internal.behavior.model.PointerEvent;
import com.socure.idplus.device.internal.behavior.model.SessionData;
import com.socure.idplus.device.internal.behavior.model.ViewportSizeEvent;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c extends HandlerThread implements Handler.Callback, b {

    /* renamed from: a, reason: collision with root package name */
    public Handler f899a;
    public a b;

    public c() {
        super("SocureThread");
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Handler handler = this.f899a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        a aVar = this.b;
        if (aVar == null) {
            return false;
        }
        int i = msg.what;
        Object obj = msg.obj;
        Bundle data = msg.getData();
        com.socure.idplus.device.internal.behavior.manager.c cVar = (com.socure.idplus.device.internal.behavior.manager.c) aVar;
        switch (i) {
            case 1:
                if (data == null) {
                    return false;
                }
                String string = data.getString("keySessionToken");
                String host = data.getString("keyHostUrl");
                if (string != null && host != null) {
                    com.socure.idplus.device.internal.api.b bVar = cVar.b;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(host, "host");
                    com.socure.idplus.device.internal.api.a aVar2 = bVar.e;
                    if (aVar2 == null) {
                        aVar2 = bVar.a(host);
                        bVar.e = aVar2;
                    }
                    cVar.p = aVar2;
                    cVar.d = string;
                    Iterator it = cVar.g.iterator();
                    while (it.hasNext()) {
                        cVar.a(aVar2, string, (SessionData) it.next());
                    }
                    cVar.g.clear();
                }
                return true;
            case 2:
                Intrinsics.checkNotNullParameter("BehaviorSessionManager", "tag");
                Intrinsics.checkNotNullParameter("handleStopCapture", "msg");
                com.socure.idplus.device.internal.logger.a aVar3 = com.socure.idplus.device.internal.logger.a.f870a;
                Handler handler = ((c) cVar.f847a).f899a;
                if (handler != null) {
                    handler.removeMessages(3);
                }
                Handler handler2 = ((c) cVar.f847a).f899a;
                if (handler2 != null) {
                    handler2.removeMessages(2);
                }
                if (cVar.d == null) {
                    cVar.g.clear();
                    cVar.h.clear();
                    cVar.i.clear();
                    cVar.j.clear();
                    cVar.k.clear();
                    cVar.l.clear();
                    cVar.m.clear();
                    cVar.n.clear();
                } else {
                    cVar.b();
                }
                return true;
            case 3:
                cVar.b();
                cVar.a();
                return true;
            case 4:
                if (!(obj instanceof KeyPressEvent)) {
                    return false;
                }
                cVar.a((KeyPressEvent) obj);
                return true;
            case 5:
                if (!(obj instanceof PointerEvent)) {
                    return false;
                }
                cVar.a((PointerEvent) obj);
                return true;
            case 6:
                if (!(obj instanceof FocusChangeEvent)) {
                    return false;
                }
                cVar.a((FocusChangeEvent) obj);
                return true;
            case 7:
                Handler handler3 = ((c) cVar.f847a).f899a;
                if (handler3 != null) {
                    handler3.removeMessages(3);
                }
                cVar.b();
                return true;
            case 8:
                cVar.a();
                return true;
            case 9:
                if (!(obj instanceof InputChangeEvent)) {
                    return false;
                }
                cVar.a((InputChangeEvent) obj);
                return true;
            case 10:
                if (!(obj instanceof LocationEvent)) {
                    return false;
                }
                cVar.a((LocationEvent) obj);
                return true;
            case 11:
                if (!(obj instanceof LifeCycleEvent)) {
                    return false;
                }
                cVar.a((LifeCycleEvent) obj);
                return true;
            case 12:
                if (!(obj instanceof ViewportSizeEvent)) {
                    return false;
                }
                cVar.a((ViewportSizeEvent) obj);
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        super.start();
        this.f899a = new Handler(getLooper(), this);
    }

    public final void a(com.socure.idplus.device.internal.behavior.manager.c handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.b = handler;
    }

    public final void a() {
        quitSafely();
        this.f899a = null;
    }
}
