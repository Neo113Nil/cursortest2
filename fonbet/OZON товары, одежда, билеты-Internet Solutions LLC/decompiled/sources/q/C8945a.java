package q;

import Jl.C3398a;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.concurrent.ArrayBlockingQueue;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import x2.h;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8945a {

    /* renamed from: a, reason: collision with root package name */
    LayoutInflater f81274a;

    /* renamed from: b, reason: collision with root package name */
    Handler f81275b;

    /* renamed from: c, reason: collision with root package name */
    d f81276c;

    /* renamed from: q.a$a, reason: collision with other inner class name */
    final class C1370a implements Handler.Callback {
        C1370a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            View view = cVar.f81282d;
            C8945a c8945a = C8945a.this;
            if (view == null) {
                cVar.f81282d = c8945a.f81274a.inflate(cVar.f81281c, (ViewGroup) cVar.f81280b, false);
            }
            C3398a c3398a = cVar.f81283e;
            AsyncFrameLayout.inflateAsync$lambda$1((AsyncFrameLayout) c3398a.f14828a, cVar.f81282d, cVar.f81281c, cVar.f81280b);
            c8945a.f81276c.d(cVar);
            return true;
        }
    }

    /* renamed from: q.a$b */
    private static class b extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f81278a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            String[] strArr = f81278a;
            for (int i11 = 0; i11 < 3; i11++) {
                try {
                    createView = createView(str, strArr[i11], attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: q.a$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        C8945a f81279a;

        /* renamed from: b, reason: collision with root package name */
        AsyncFrameLayout f81280b;

        /* renamed from: c, reason: collision with root package name */
        int f81281c;

        /* renamed from: d, reason: collision with root package name */
        View f81282d;

        /* renamed from: e, reason: collision with root package name */
        C3398a f81283e;

        c() {
        }
    }

    /* renamed from: q.a$d */
    private static class d extends Thread {

        /* renamed from: c, reason: collision with root package name */
        private static final d f81284c;

        /* renamed from: a, reason: collision with root package name */
        private ArrayBlockingQueue<c> f81285a;

        /* renamed from: b, reason: collision with root package name */
        private h<c> f81286b;

        static {
            d dVar = new d();
            dVar.f81285a = new ArrayBlockingQueue<>(10);
            dVar.f81286b = new h<>(10);
            f81284c = dVar;
            dVar.start();
        }

        public static d b() {
            return f81284c;
        }

        public final void a(c cVar) {
            try {
                this.f81285a.put(cVar);
            } catch (InterruptedException e11) {
                throw new RuntimeException("Failed to enqueue async inflate request", e11);
            }
        }

        public final c c() {
            c a11 = this.f81286b.a();
            return a11 == null ? new c() : a11;
        }

        public final void d(c cVar) {
            cVar.f81283e = null;
            cVar.f81279a = null;
            cVar.f81280b = null;
            cVar.f81281c = 0;
            cVar.f81282d = null;
            this.f81286b.b(cVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    c take = this.f81285a.take();
                    try {
                        take.f81282d = take.f81279a.f81274a.inflate(take.f81281c, (ViewGroup) take.f81280b, false);
                    } catch (RuntimeException e11) {
                        Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e11);
                    }
                    Message.obtain(take.f81279a.f81275b, 0, take).sendToTarget();
                } catch (InterruptedException e12) {
                    Log.w("AsyncLayoutInflater", e12);
                }
            }
        }
    }

    public C8945a(@NonNull Context context) {
        C1370a c1370a = new C1370a();
        this.f81274a = new b(context);
        this.f81275b = new Handler(c1370a);
        this.f81276c = d.b();
    }

    public final void a(int i11, AsyncFrameLayout asyncFrameLayout, @NonNull C3398a c3398a) {
        d dVar = this.f81276c;
        c c11 = dVar.c();
        c11.f81279a = this;
        c11.f81281c = i11;
        c11.f81280b = asyncFrameLayout;
        c11.f81283e = c3398a;
        dVar.a(c11);
    }
}
