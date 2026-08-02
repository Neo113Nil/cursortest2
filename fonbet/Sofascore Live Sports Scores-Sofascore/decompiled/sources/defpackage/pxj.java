package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pxj {
    public final Context a;
    public final int b;
    public final boolean c;
    public final cma d;
    public final int e;
    public final boolean f;
    public final AtomicInteger g;
    public final s4a h;
    public final AtomicBoolean i;
    public final long j;
    public final int k;
    public final boolean l;
    public final Integer m;
    public final ComponentName n;

    public pxj(Context context, int i, boolean z, cma cmaVar, int i2, boolean z2, AtomicInteger atomicInteger, s4a s4aVar, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = cmaVar;
        this.e = i2;
        this.f = z2;
        this.g = atomicInteger;
        this.h = s4aVar;
        this.i = atomicBoolean;
        this.j = j;
        this.k = i3;
        this.l = z3;
        this.m = num;
        this.n = componentName;
    }

    public static pxj a(pxj pxjVar, int i, AtomicInteger atomicInteger, s4a s4aVar, AtomicBoolean atomicBoolean, long j, int i2, Integer num, int i3) {
        return new pxj(pxjVar.a, pxjVar.b, pxjVar.c, pxjVar.d, (i3 & 16) != 0 ? pxjVar.e : i, (i3 & 32) != 0 ? pxjVar.f : true, (i3 & 64) != 0 ? pxjVar.g : atomicInteger, (i3 & 128) != 0 ? pxjVar.h : s4aVar, (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? pxjVar.i : atomicBoolean, (i3 & 512) != 0 ? pxjVar.j : j, (i3 & 1024) != 0 ? pxjVar.k : i2, (i3 & 4096) != 0 ? pxjVar.l : true, (i3 & 8192) != 0 ? pxjVar.m : num, pxjVar.n);
    }

    public final pxj b(s4a s4aVar, int i) {
        return a(this, i, null, s4aVar, null, 0L, 0, null, 32623);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pxj) {
            pxj pxjVar = (pxj) obj;
            if (this.a.equals(pxjVar.a) && this.b == pxjVar.b && this.c == pxjVar.c && this.d == pxjVar.d && this.e == pxjVar.e && this.f == pxjVar.f && Intrinsics.c(this.g, pxjVar.g) && Intrinsics.c(this.h, pxjVar.h) && Intrinsics.c(this.i, pxjVar.i) && this.j == pxjVar.j && this.k == pxjVar.k && this.l == pxjVar.l && Intrinsics.c(this.m, pxjVar.m) && Intrinsics.c(this.n, pxjVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(-1, wv8.a(this.k, ljg.c((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + dmi.e(wv8.a(this.e, (this.d.hashCode() + dmi.e(wv8.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31), 31, this.f)) * 31)) * 31)) * 31, 31, this.j), 31), 31), 31, this.l);
        Integer num = this.m;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.n;
        return hashCode + (componentName != null ? componentName.hashCode() : 0);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.g + ", parentContext=" + this.h + ", isBackgroundSpecified=" + this.i + ", layoutSize=" + ((Object) s75.d(this.j)) + ", layoutCollectionViewId=" + this.k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.n + ')';
    }
}
