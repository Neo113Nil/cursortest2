package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import i6.InterfaceC7015b;
import i6.q;
import i6.r;
import i6.u;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l6.AbstractC7878a;
import l6.InterfaceC7882e;
import m6.AbstractC8091d;

/* loaded from: classes.dex */
public class n implements ComponentCallbacks2, i6.m {
    private static final l6.i DECODE_TYPE_BITMAP = l6.i.decodeTypeOf(Bitmap.class).lock();
    private static final l6.i DECODE_TYPE_GIF = l6.i.decodeTypeOf(g6.c.class).lock();
    private static final l6.i DOWNLOAD_ONLY_OPTIONS = l6.i.diskCacheStrategyOf(V5.k.f28205b).priority(i.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final InterfaceC7015b connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<l6.h<Object>> defaultRequestListeners;
    protected final com.bumptech.glide.c glide;
    final i6.k lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private l6.i requestOptions;
    private final r requestTracker;
    private final u targetTracker;
    private final q treeNode;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            nVar.lifecycle.b(nVar);
        }
    }

    /* loaded from: classes8.dex */
    private static class b extends AbstractC8091d<View, Object> {
        b(@NonNull View view) {
            super(view);
        }

        @Override // m6.h
        public final void onLoadFailed(Drawable drawable) {
        }

        @Override // m6.h
        public final void onResourceReady(@NonNull Object obj, n6.c<? super Object> cVar) {
        }
    }

    private class c implements InterfaceC7015b.a {

        /* renamed from: a, reason: collision with root package name */
        private final r f57649a;

        c(@NonNull r rVar) {
            this.f57649a = rVar;
        }

        @Override // i6.InterfaceC7015b.a
        public final void a(boolean z11) {
            if (z11) {
                synchronized (n.this) {
                    this.f57649a.e();
                }
            }
        }
    }

    public n(@NonNull com.bumptech.glide.c cVar, @NonNull i6.k kVar, @NonNull q qVar, @NonNull Context context) {
        this(cVar, kVar, qVar, new r(), cVar.d(), context);
    }

    private synchronized void clearRequests() {
        try {
            Iterator it = this.targetTracker.b().iterator();
            while (it.hasNext()) {
                clear((m6.h<?>) it.next());
            }
            this.targetTracker.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void untrackOrDelegate(@NonNull m6.h<?> hVar) {
        boolean untrack = untrack(hVar);
        InterfaceC7882e request = hVar.getRequest();
        if (untrack || this.glide.j(hVar) || request == null) {
            return;
        }
        hVar.setRequest(null);
        request.clear();
    }

    @NonNull
    public <ResourceType> m<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new m<>(this.glide, this, cls, this.context);
    }

    @NonNull
    public m<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((AbstractC7878a<?>) DECODE_TYPE_BITMAP);
    }

    @NonNull
    public m<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    public void clear(@NonNull View view) {
        clear(new b(view));
    }

    List<l6.h<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    synchronized l6.i getDefaultRequestOptions() {
        return this.requestOptions;
    }

    @NonNull
    <T> o<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.f().e(cls);
    }

    @NonNull
    public m<Drawable> load(String str) {
        return asDrawable().load(str);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // i6.m
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        clearRequests();
        this.requestTracker.b();
        this.lifecycle.a(this);
        this.lifecycle.a(this.connectivityMonitor);
        p6.l.k(this.addSelfToLifecycle);
        this.glide.l(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // i6.m
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // i6.m
    public synchronized void onStop() {
        try {
            this.targetTracker.onStop();
            if (this.clearOnStop) {
                clearRequests();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        if (i11 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.c();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<n> it = this.treeNode.a().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.d();
    }

    public synchronized void resumeRequests() {
        this.requestTracker.f();
    }

    protected synchronized void setRequestOptions(@NonNull l6.i iVar) {
        this.requestOptions = iVar.mo17clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    synchronized void track(@NonNull m6.h<?> hVar, @NonNull InterfaceC7882e interfaceC7882e) {
        this.targetTracker.c(hVar);
        this.requestTracker.g(interfaceC7882e);
    }

    synchronized boolean untrack(@NonNull m6.h<?> hVar) {
        InterfaceC7882e request = hVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.a(request)) {
            return false;
        }
        this.targetTracker.d(hVar);
        hVar.setRequest(null);
        return true;
    }

    public void clear(m6.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        untrackOrDelegate(hVar);
    }

    @NonNull
    public m<Drawable> load(Uri uri) {
        return asDrawable().load(uri);
    }

    @NonNull
    public m<Drawable> load(Object obj) {
        return asDrawable().load(obj);
    }

    n(com.bumptech.glide.c cVar, i6.k kVar, q qVar, r rVar, i6.c cVar2, Context context) {
        this.targetTracker = new u();
        a aVar = new a();
        this.addSelfToLifecycle = aVar;
        this.glide = cVar;
        this.lifecycle = kVar;
        this.treeNode = qVar;
        this.requestTracker = rVar;
        this.context = context;
        InterfaceC7015b a11 = ((i6.e) cVar2).a(context.getApplicationContext(), new c(rVar));
        this.connectivityMonitor = a11;
        cVar.i(this);
        int i11 = p6.l.f80283d;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            p6.l.j(aVar);
        } else {
            kVar.b(this);
        }
        kVar.b(a11);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(cVar.f().c());
        setRequestOptions(cVar.f().d());
    }
}
