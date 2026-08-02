package com.vk.attachpicker.screen.filters;

import android.graphics.Bitmap;
import android.net.Uri;
import io.reactivex.rxjava3.processors.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import xsna.jeq0;
import xsna.mcr0;
import xsna.mf1;
import xsna.s3q0;
import xsna.sbq;
import xsna.tbq;
import xsna.ubq;

/* compiled from: ExtendedLutsImageLoader.kt */
/* loaded from: classes15.dex */
public final class a {
    public final c<AbstractC0387a> a;
    public final c b;
    public final ConcurrentHashMap<Integer, String> c;
    public final ReentrantLock d;
    public final ConcurrentHashMap<Integer, b> e;
    public final io.reactivex.rxjava3.disposables.b f;

    /* compiled from: ExtendedLutsImageLoader.kt */
    /* renamed from: com.vk.attachpicker.screen.filters.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0387a {

        /* compiled from: ExtendedLutsImageLoader.kt */
        /* renamed from: com.vk.attachpicker.screen.filters.a$a$a, reason: collision with other inner class name */
        public static final class C0388a extends AbstractC0387a {
            public final int a;

            public C0388a(int i) {
                this.a = i;
            }
        }

        /* compiled from: ExtendedLutsImageLoader.kt */
        /* renamed from: com.vk.attachpicker.screen.filters.a$a$b */
        public static final class b extends AbstractC0387a {
            public final int a;

            public b(int i) {
                this.a = i;
            }
        }

        /* compiled from: ExtendedLutsImageLoader.kt */
        /* renamed from: com.vk.attachpicker.screen.filters.a$a$c */
        public static final class c extends AbstractC0387a {
            public final int a;
            public final Bitmap b;

            public c(int i, Bitmap bitmap) {
                this.a = i;
                this.b = bitmap;
            }
        }
    }

    /* compiled from: ExtendedLutsImageLoader.kt */
    public static abstract class b {

        /* compiled from: ExtendedLutsImageLoader.kt */
        /* renamed from: com.vk.attachpicker.screen.filters.a$b$a, reason: collision with other inner class name */
        public static final class C0389a extends b {
            public static final C0389a a = new C0389a();
        }

        /* compiled from: ExtendedLutsImageLoader.kt */
        /* renamed from: com.vk.attachpicker.screen.filters.a$b$b, reason: collision with other inner class name */
        public static final class C0390b extends b {
            public final io.reactivex.rxjava3.disposables.c a;

            public C0390b(io.reactivex.rxjava3.disposables.c cVar) {
                this.a = cVar;
            }
        }
    }

    public a() {
        c<AbstractC0387a> cVar = new c<>();
        this.a = cVar;
        this.b = cVar;
        this.c = new ConcurrentHashMap<>();
        this.d = new ReentrantLock();
        this.e = new ConcurrentHashMap<>();
        this.f = new io.reactivex.rxjava3.disposables.b();
    }

    public final void a(int i) {
        io.reactivex.rxjava3.disposables.c cVar;
        String str = this.c.get(Integer.valueOf(i));
        if (str != null) {
            c<AbstractC0387a> cVar2 = this.a;
            ConcurrentHashMap<Integer, b> concurrentHashMap = this.e;
            ReentrantLock reentrantLock = this.d;
            try {
                Uri g = jeq0.g(str);
                reentrantLock.lock();
                if (!(concurrentHashMap.get(Integer.valueOf(i)) instanceof b.C0390b)) {
                    concurrentHashMap.put(Integer.valueOf(i), new b.C0390b(null));
                    cVar2.onNext(new AbstractC0387a.b(i));
                    io.reactivex.rxjava3.disposables.c subscribe = mcr0.h(g).subscribe(new mf1(new sbq(this, i, 0), 22), new ubq(new tbq(this, i), 0));
                    concurrentHashMap.put(Integer.valueOf(i), new b.C0390b(subscribe));
                    this.f.b(subscribe);
                }
            } catch (Exception unused) {
                reentrantLock.lock();
                b bVar = concurrentHashMap.get(Integer.valueOf(i));
                if ((bVar instanceof b.C0390b) && (cVar = ((b.C0390b) bVar).a) != null) {
                    cVar.dispose();
                }
                concurrentHashMap.put(Integer.valueOf(i), b.C0389a.a);
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
                cVar2.onNext(new AbstractC0387a.C0388a(i));
            } catch (Throwable th) {
                throw th;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
