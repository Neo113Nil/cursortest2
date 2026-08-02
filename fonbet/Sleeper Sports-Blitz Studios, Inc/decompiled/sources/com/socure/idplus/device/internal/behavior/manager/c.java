package com.socure.idplus.device.internal.behavior.manager;

import android.os.Handler;
import android.os.Message;
import com.socure.idplus.device.internal.behavior.model.Events;
import com.socure.idplus.device.internal.behavior.model.FocusChangeEvent;
import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import com.socure.idplus.device.internal.behavior.model.KeyPressEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LocationEvent;
import com.socure.idplus.device.internal.behavior.model.PointerEvent;
import com.socure.idplus.device.internal.behavior.model.SessionData;
import com.socure.idplus.device.internal.behavior.model.SessionDataRequest;
import com.socure.idplus.device.internal.behavior.model.ViewportSizeEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c implements com.socure.idplus.device.internal.thread.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.socure.idplus.device.internal.thread.b f847a;
    public final com.socure.idplus.device.internal.api.b b;
    public final Function0 c;
    public String d;
    public int e;
    public final com.socure.idplus.device.internal.behavior.dataHandler.b f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public Long o;
    public com.socure.idplus.device.internal.api.a p;
    public Function0 q;

    public c(com.socure.idplus.device.internal.thread.c socureThread, com.socure.idplus.device.internal.api.b apiClient, d stopCaptureCallback) {
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(stopCaptureCallback, "stopCaptureCallback");
        this.f847a = socureThread;
        this.b = apiClient;
        this.c = stopCaptureCallback;
        this.f = new com.socure.idplus.device.internal.behavior.dataHandler.b();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    public final void a() {
        Long l = this.o;
        if (l != null) {
            long longValue = l.longValue();
            Handler handler = ((com.socure.idplus.device.internal.thread.c) this.f847a).f899a;
            if (handler != null) {
                handler.removeMessages(3);
            }
            com.socure.idplus.device.internal.thread.c cVar = (com.socure.idplus.device.internal.thread.c) this.f847a;
            cVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = null;
            Handler handler2 = cVar.f899a;
            if (handler2 != null) {
                handler2.sendMessageDelayed(obtain, longValue);
            }
        }
    }

    public final void b() {
        boolean z;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        boolean z2 = true;
        List list7 = null;
        if (this.h.isEmpty()) {
            z = false;
            list = null;
        } else {
            List list8 = CollectionsKt.toList(this.h);
            this.h.clear();
            list = list8;
            z = true;
        }
        if (this.i.isEmpty()) {
            list2 = null;
        } else {
            List list9 = CollectionsKt.toList(this.i);
            this.i.clear();
            list2 = list9;
            z = true;
        }
        if (this.j.isEmpty()) {
            list3 = null;
        } else {
            List list10 = CollectionsKt.toList(this.j);
            this.j.clear();
            list3 = list10;
            z = true;
        }
        if (this.k.isEmpty()) {
            list4 = null;
        } else {
            List list11 = CollectionsKt.toList(this.k);
            this.k.clear();
            list4 = list11;
            z = true;
        }
        if (this.l.isEmpty()) {
            list5 = null;
        } else {
            List list12 = CollectionsKt.toList(this.l);
            this.l.clear();
            list5 = list12;
            z = true;
        }
        if (this.n.isEmpty()) {
            list6 = null;
        } else {
            List list13 = CollectionsKt.toList(this.n);
            this.n.clear();
            list6 = list13;
            z = true;
        }
        if (this.m.isEmpty()) {
            z2 = z;
        } else {
            list7 = CollectionsKt.toList(this.m);
            this.m.clear();
        }
        List list14 = list7;
        if (z2) {
            SessionData sessionData = new SessionData(new Events(list3, list4, list, list2, list5, list14, list6));
            String str = this.d;
            com.socure.idplus.device.internal.api.a aVar = this.p;
            if (str != null && aVar != null) {
                a(aVar, str, sessionData);
                return;
            }
            this.g.add(sessionData);
            if (this.g.size() > 7) {
                this.c.invoke();
            }
        }
    }

    public final void a(FocusChangeEvent focusChangeEvent) {
        Objects.toString(focusChangeEvent);
        this.j.add(focusChangeEvent);
    }

    public final void a(InputChangeEvent inputChangeEvent) {
        Objects.toString(inputChangeEvent);
        this.k.add(inputChangeEvent);
    }

    public final void a(KeyPressEvent keyPressEvent) {
        Objects.toString(keyPressEvent);
        this.h.add(keyPressEvent);
    }

    public final void a(LifeCycleEvent lifeCycleEvent) {
        Objects.toString(lifeCycleEvent);
        this.n.add(lifeCycleEvent);
    }

    public final void a(LocationEvent locationEvent) {
        Objects.toString(locationEvent);
        this.l.add(locationEvent);
    }

    public final void a(PointerEvent pointerEvent) {
        Objects.toString(pointerEvent);
        this.i.add(pointerEvent);
    }

    public final void a(ViewportSizeEvent viewportSizeEvent) {
        Objects.toString(viewportSizeEvent);
        this.m.add(viewportSizeEvent);
    }

    public final void a(com.socure.idplus.device.internal.api.a apiClient, String sessionToken, SessionData sessionData) {
        this.e++;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        SessionDataRequest sessionDataRequest = new SessionDataRequest(null, null, uuid, this.e, sessionData, 3, null);
        com.socure.idplus.device.internal.behavior.dataHandler.b bVar = this.f;
        a onSuccess = a.f845a;
        b onError = new b(this, sessionData);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(sessionDataRequest, "sessionDataRequest");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter("BehaviorDataHandler", "tag");
        Intrinsics.checkNotNullParameter("Data Upload Initiated", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        com.socure.idplus.device.internal.network.c.a(new com.socure.idplus.device.internal.behavior.dataHandler.a(apiClient, com.socure.idplus.device.internal.common.utils.a.a(sessionToken), sessionDataRequest), onSuccess, onError);
    }
}
