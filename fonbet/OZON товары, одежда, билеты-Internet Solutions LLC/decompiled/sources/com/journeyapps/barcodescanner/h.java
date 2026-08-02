package com.journeyapps.barcodescanner;

import N9.o;
import O9.n;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import h9.q;
import h9.s;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private O9.e f60321a;

    /* renamed from: b, reason: collision with root package name */
    private HandlerThread f60322b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f60323c;

    /* renamed from: d, reason: collision with root package name */
    private N9.f f60324d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f60325e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f60326f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f60327g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Object f60328h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Handler.Callback f60329i = new a();

    /* renamed from: j, reason: collision with root package name */
    private final n f60330j = new b();

    final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            h hVar = h.this;
            if (i11 == R.id.zxing_decode) {
                h.a(hVar, (N9.n) message.obj);
                return true;
            }
            if (i11 != R.id.zxing_preview_failed) {
                return true;
            }
            h.b(hVar);
            return true;
        }
    }

    final class b implements n {
        b() {
        }

        @Override // O9.n
        public final void a(N9.n nVar) {
            synchronized (h.this.f60328h) {
                try {
                    if (h.this.f60327g) {
                        h.this.f60323c.obtainMessage(R.id.zxing_decode, nVar).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // O9.n
        public final void b() {
            synchronized (h.this.f60328h) {
                try {
                    if (h.this.f60327g) {
                        h.this.f60323c.obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public h(O9.e eVar, N9.f fVar, Handler handler) {
        o.d();
        this.f60321a = eVar;
        this.f60324d = fVar;
        this.f60325e = handler;
    }

    static void a(h hVar, N9.n nVar) {
        hVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        nVar.c(hVar.f60326f);
        h9.n a11 = hVar.f60326f == null ? null : nVar.a();
        q b11 = a11 != null ? hVar.f60324d.b(a11) : null;
        Handler handler = hVar.f60325e;
        if (b11 != null) {
            Log.d("h", "Found barcode in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            if (handler != null) {
                com.journeyapps.barcodescanner.a aVar = new com.journeyapps.barcodescanner.a();
                aVar.f60268a = b11;
                aVar.f60269b = nVar;
                Message obtain = Message.obtain(handler, R.id.zxing_decode_succeeded, aVar);
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else if (handler != null) {
            Message.obtain(handler, R.id.zxing_decode_failed).sendToTarget();
        }
        if (handler != null) {
            ArrayList c11 = hVar.f60324d.c();
            ArrayList arrayList = new ArrayList(c11.size());
            Iterator it = c11.iterator();
            while (it.hasNext()) {
                arrayList.add(nVar.e((s) it.next()));
            }
            Message.obtain(handler, R.id.zxing_possible_result_points, arrayList).sendToTarget();
        }
        hVar.f60321a.p(hVar.f60330j);
    }

    static void b(h hVar) {
        hVar.f60321a.p(hVar.f60330j);
    }

    public final void f(Rect rect) {
        this.f60326f = rect;
    }

    public final void g(N9.f fVar) {
        this.f60324d = fVar;
    }

    public final void h() {
        o.d();
        HandlerThread handlerThread = new HandlerThread("h");
        this.f60322b = handlerThread;
        handlerThread.start();
        this.f60323c = new Handler(this.f60322b.getLooper(), this.f60329i);
        this.f60327g = true;
        this.f60321a.p(this.f60330j);
    }

    public final void i() {
        o.d();
        synchronized (this.f60328h) {
            this.f60327g = false;
            this.f60323c.removeCallbacksAndMessages(null);
            this.f60322b.quit();
        }
    }
}
