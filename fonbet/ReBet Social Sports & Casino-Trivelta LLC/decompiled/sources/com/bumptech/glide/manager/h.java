package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bumptech.glide.load.resource.bitmap.A;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f30095a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f30096b;

    public class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f30097a;

        /* renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        public class RunnableC0473a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnDrawListener f30099a;

            public RunnableC0473a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f30099a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                A.b().h();
                h.this.f30096b = true;
                h.b(a.this.f30097a, this.f30099a);
                h.this.f30095a.clear();
            }
        }

        public a(View view) {
            this.f30097a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            com.bumptech.glide.util.l.w(new RunnableC0473a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.i
    public void a(Activity activity) {
        if (!this.f30096b && this.f30095a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
