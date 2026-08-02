package com.vk.update.core;

import androidx.activity.ComponentActivity;
import com.vk.update.core.c;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.mixed.q;
import io.reactivex.rxjava3.internal.operators.observable.e0;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.t;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a8v;
import xsna.azt;
import xsna.ch3;
import xsna.e4t;
import xsna.epx;
import xsna.eqd;
import xsna.fpf0;
import xsna.gex0;
import xsna.hg1;
import xsna.hn70;
import xsna.k0j;
import xsna.o1e;
import xsna.o7;
import xsna.ov2;
import xsna.pwk;
import xsna.qcy;
import xsna.ro;
import xsna.tts;
import xsna.vrw;
import xsna.wrw;

/* compiled from: InAppUpdateManager.kt */
/* loaded from: classes6.dex */
public final class a {
    public static final /* synthetic */ qcy<Object>[] m;
    public final int a;
    public final ComponentActivity b;
    public final InAppUpdateUi c;
    public final t d;
    public final ArrayList e;
    public final long f;
    public final ro g;
    public final gex0.b h;
    public final azt i;
    public final f<C1935a> j;
    public io.reactivex.rxjava3.disposables.c k;
    public final hn70 l;

    /* compiled from: InAppUpdateManager.kt */
    /* renamed from: com.vk.update.core.a$a, reason: collision with other inner class name */
    public static final class C1935a {
        public final wrw a;
        public final vrw b;

        public C1935a(wrw wrwVar, vrw vrwVar) {
            this.a = wrwVar;
            this.b = vrwVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1935a)) {
                return false;
            }
            C1935a c1935a = (C1935a) obj;
            return epx.f(this.a, c1935a.a) && epx.f(this.b, c1935a.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateEvent(info=" + this.a + ", engine=" + this.b + ')';
        }
    }

    /* compiled from: InAppUpdateManager.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadState.values().length];
            try {
                iArr[DownloadState.DOWNLOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadState.NOT_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadState.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, "updateAvailableTime", "getUpdateAvailableTime()J", 0);
        fpf0.a.getClass();
        m = new qcy[]{mutablePropertyReference1Impl};
        TimeUnit.DAYS.toMillis(7L);
    }

    public a() {
        throw null;
    }

    public a(int i, ComponentActivity componentActivity, InAppUpdateUi inAppUpdateUi, t tVar, ArrayList arrayList, long j, ro roVar, gex0.b bVar) {
        azt aztVar = new azt(7);
        this.a = i;
        this.b = componentActivity;
        this.c = inAppUpdateUi;
        this.d = tVar;
        this.e = arrayList;
        this.f = j;
        this.g = roVar;
        this.h = bVar;
        this.i = aztVar;
        this.j = new f<>();
        this.k = EmptyDisposable.INSTANCE;
        this.l = new hn70("in_app_update_prefs", "last_update_time");
    }

    public final void a(x<Boolean> xVar) {
        i0 i0Var = new i0(new q(xVar, new o7(new pwk(this, 22), 17)), new e4t(new k0j(this, 22), 4));
        a8v a8vVar = new a8v(new o1e(this, 29), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        hg1.a(new e0(i0Var.E(a8vVar, lVar, kVar, kVar)).k(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tts(new eqd(this, 27), 6)), this.b);
    }

    public final void b(C1935a c1935a) {
        String a = c1935a.b.a();
        wrw wrwVar = c1935a.a;
        final long j = wrwVar.b;
        this.h.a(a, new c.g(j));
        vrw vrwVar = c1935a.b;
        final String a2 = vrwVar.a();
        hg1.a(vrwVar.f(wrwVar).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.xrw
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.update.core.a.this.h.a(a2, new c.d(j));
            }
        }, new ov2(new ch3(j, this, a2, 2), 26)), this.b);
        qcy<Object> qcyVar = m[0];
        this.l.b(0L);
    }
}
