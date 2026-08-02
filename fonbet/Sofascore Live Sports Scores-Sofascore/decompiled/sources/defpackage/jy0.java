package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.preference.PreferenceManager;
import android.widget.TextView;
import com.facebook.w;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jy0 implements g {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public jy0() {
        this.b = new gf9[32];
        this.c = new float[32];
        this.d = new byte[32];
        y0d y0dVar = rrg.a;
        this.e = new y0d();
        this.f = new y0d();
    }

    public static jy0 c(int i, Context context) {
        l4a.h("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, pjf.z);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList x = w3a.x(context, obtainStyledAttributes, 4);
        ColorStateList x2 = w3a.x(context, obtainStyledAttributes, 9);
        ColorStateList x3 = w3a.x(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        xah a = xah.g(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        jy0 jy0Var = new jy0();
        l4a.i(rect.left);
        l4a.i(rect.top);
        l4a.i(rect.right);
        l4a.i(rect.bottom);
        jy0Var.b = rect;
        jy0Var.c = x2;
        jy0Var.d = x;
        jy0Var.e = x3;
        jy0Var.a = dimensionPixelSize;
        jy0Var.f = a;
        return jy0Var;
    }

    public void a(long j) {
        g9i g9iVar = (g9i) this.e;
        if (g9iVar == null || g9iVar.isCancelled() || g9iVar.t()) {
            x7k x7kVar = y7k.b;
            this.a = (int) j;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "LinearGoNextActionImpl", vxd.m("Start timer for duration: ", j, " seconds"), null, false, 12, null);
            this.e = xw3.L((ad2) this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g(this, null, 1), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(long j, j9e j9eVar) {
        int i;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        if (j != C.TIME_UNSET && (i = this.a) != 0) {
            if (i != -1 && priorityQueue.size() >= this.a) {
                zyf zyfVar = (zyf) priorityQueue.peek();
                String str = nik.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            j9e j9eVar2 = arrayDeque2.isEmpty() ? new j9e() : (j9e) arrayDeque2.pop();
            j9eVar2.K(j9eVar.a());
            System.arraycopy(j9eVar.a, j9eVar.b, j9eVar2.a, 0, j9eVar2.a());
            zyf zyfVar2 = (zyf) this.f;
            if (zyfVar2 != null && j == zyfVar2.b) {
                zyfVar2.a.add(j9eVar2);
                return;
            }
            zyf zyfVar3 = arrayDeque.isEmpty() ? new zyf() : (zyf) arrayDeque.pop();
            ArrayList arrayList = zyfVar3.a;
            z1a.s(j != C.TIME_UNSET);
            z1a.E(arrayList.isEmpty());
            zyfVar3.b = j;
            arrayList.add(j9eVar2);
            priorityQueue.add(zyfVar3);
            this.f = zyfVar3;
            int i2 = this.a;
            if (i2 != -1) {
                d(i2);
                return;
            }
            return;
        }
        ((azf) this.b).e(j, j9eVar);
    }

    public void d(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            zyf zyfVar = (zyf) priorityQueue.poll();
            String str = nik.a;
            int i2 = 0;
            while (true) {
                arrayList = zyfVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((azf) this.b).e(zyfVar.b, (j9e) arrayList.get(i2));
                ((ArrayDeque) this.c).push((j9e) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            zyf zyfVar2 = (zyf) this.f;
            if (zyfVar2 != null && zyfVar2.b == zyfVar.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(zyfVar);
        }
    }

    public void e(Runnable runnable) {
        zqi zqiVar = (zqi) this.b;
        if (zqiVar.a.getLooper().getThread().isAlive()) {
            zqiVar.e(runnable);
        }
    }

    public void f(int i) {
        z1a.E(i >= 0);
        this.a = i;
        d(i);
    }

    public void g(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.c;
        qzb qzbVar = new qzb();
        qzb qzbVar2 = new qzb();
        xah xahVar = (xah) this.f;
        qzbVar.setShapeAppearanceModel(xahVar);
        qzbVar2.setShapeAppearanceModel(xahVar);
        qzbVar.t((ColorStateList) this.d);
        float f = this.a;
        ColorStateList colorStateList2 = (ColorStateList) this.e;
        qzbVar.A(f);
        qzbVar.y(colorStateList2);
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), qzbVar, qzbVar2);
        Rect rect = (Rect) this.b;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public void h(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        vg6 vg6Var = ((eg6) this.d).a;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        int i = vg6.r0;
        vg6Var.j0();
        vg6Var.Z(1, 10, num);
        vg6Var.Z(2, 10, num);
        vg6Var.m.g(21, new uz1(intValue, 5));
    }

    public void i() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", ((Long) this.b).longValue());
        Long l = (Long) this.c;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l != null ? l.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.a);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.d).toString());
        edit.apply();
        n6g n6gVar = (n6g) this.f;
        if (n6gVar != null) {
            SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", n6gVar.c);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", n6gVar.b);
            edit2.apply();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public ddi l() {
        throw null;
    }

    public jy0(azf azfVar) {
        this.b = azfVar;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public jy0(Long l, Long l2) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.b = l;
        this.c = l2;
        this.d = randomUUID;
    }
}
