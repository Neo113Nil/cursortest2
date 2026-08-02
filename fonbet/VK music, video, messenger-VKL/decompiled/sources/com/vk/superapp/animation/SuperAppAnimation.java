package com.vk.superapp.animation;

import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeSuperappSnowItem;
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.flowable.m;
import io.reactivex.rxjava3.internal.operators.flowable.r;
import java.io.ByteArrayInputStream;
import java.util.WeakHashMap;
import xsna.asp;
import xsna.asu0;
import xsna.b0u0;
import xsna.dhr0;
import xsna.drm0;
import xsna.emb;
import xsna.epx;
import xsna.g5j0;
import xsna.gzs;
import xsna.h5j0;
import xsna.h7n0;
import xsna.ho8;
import xsna.i7n0;
import xsna.iut0;
import xsna.j5g;
import xsna.j7n0;
import xsna.jyo0;
import xsna.k7n0;
import xsna.l4k0;
import xsna.mbs;
import xsna.mmm0;
import xsna.qvo;
import xsna.qyi0;
import xsna.s3q0;
import xsna.s440;
import xsna.sbn0;
import xsna.shy;
import xsna.sl30;
import xsna.uk;
import xsna.xq70;
import xsna.zrp;

/* compiled from: SuperAppAnimation.kt */
/* loaded from: classes6.dex */
public final class SuperAppAnimation {
    public static boolean i;
    public static boolean j;
    public final FragmentActivity a;
    public final mbs b;
    public final a c;
    public final gzs<s3q0> d;
    public k7n0 e;
    public WindowManager f;
    public c g;
    public final com.vk.superapp.animation.a h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppAnimation.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ALL;
        public static final a Companion;
        public static final Type OPEN;
        public static final Type SHAKE;

        /* compiled from: SuperAppAnimation.kt */
        public static final class a {
        }

        static {
            Type type = new Type("OPEN", 0);
            OPEN = type;
            Type type2 = new Type("SHAKE", 1);
            SHAKE = type2;
            Type type3 = new Type("ALL", 2);
            ALL = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: SuperAppAnimation.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;
        public final Type d;
        public final String e;
        public final String f;

        public a(String str, String str2, int i, Type type, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = type;
            this.e = str3;
            this.f = str4;
        }

        public final int a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (this.d.hashCode() + shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
            String str2 = this.e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Animation(url=");
            sb.append(this.a);
            sb.append(", urlDark=");
            sb.append(this.b);
            sb.append(", repeat=");
            sb.append(this.c);
            sb.append(", type=");
            sb.append(this.d);
            sb.append(", byteArrayStr=");
            sb.append(this.e);
            sb.append(", byteArrayStrDark=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: SuperAppAnimation.kt */
    public static final class b {
        public final a a;
        public final a b;

        public b(a aVar, a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final b a(a aVar, a aVar2) {
            if (aVar == null) {
                aVar = this.a;
            }
            if (aVar2 == null) {
                aVar2 = this.b;
            }
            return new b(aVar, aVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.b;
            return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public final String toString() {
            return "PendingAnimation(shakeAnimation=" + this.a + ", openAnimation=" + this.b + ')';
        }
    }

    public /* synthetic */ SuperAppAnimation(FragmentActivity fragmentActivity, mbs mbsVar, a aVar) {
        this(fragmentActivity, mbsVar, aVar, null);
    }

    public final boolean a() {
        return this.e != null && i;
    }

    public final void b() {
        e();
        c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = null;
        this.b.d(this.h);
    }

    public final void c() {
        mbs mbsVar = this.b;
        com.vk.superapp.animation.a aVar = this.h;
        mbsVar.d(aVar);
        mbsVar.a(aVar);
        Type type = this.c.d;
        if (type == Type.OPEN || type == Type.ALL) {
            if (i || j) {
                return;
            }
            d();
            new sbn0(MobileOfficialAppsCoreNavStat$EventScreen.SUPER_APP, SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeSuperappSnowItem(SchemeStat$TypeSuperappSnowItem.Type.DEFAULT), 3)).q();
            i = true;
            return;
        }
        if (type == Type.SHAKE) {
            c cVar = this.g;
            if (cVar == null || cVar.h()) {
                f();
            }
        }
    }

    public final void d() {
        Window window;
        View decorView;
        IBinder windowToken;
        String str;
        String str2;
        e();
        FragmentActivity fragmentActivity = this.a;
        Object systemService = fragmentActivity.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (window = fragmentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (windowToken = decorView.getWindowToken()) == null) {
            return;
        }
        k7n0 k7n0Var = new k7n0(this, fragmentActivity);
        k7n0Var.setScaleType(ImageView.ScaleType.CENTER_CROP);
        k7n0Var.setFailureListener(new qvo(1));
        k7n0Var.U(new j7n0(k7n0Var, this));
        k7n0Var.setFitsSystemWindows(false);
        i7n0 i7n0Var = new i7n0();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(k7n0Var, i7n0Var);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 1000;
        layoutParams.token = windowToken;
        layoutParams.softInputMode = 1;
        layoutParams.windowAnimations = 0;
        layoutParams.format = -3;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.gravity = 0;
        layoutParams.flags = 66832;
        layoutParams.layoutInDisplayCutoutMode = 1;
        windowManager.addView(k7n0Var, layoutParams);
        this.f = windowManager;
        this.e = k7n0Var;
        boolean M = dhr0.M();
        a aVar = this.c;
        if (M) {
            str = aVar.f;
            if (str == null) {
                str = aVar.e;
            }
        } else {
            str = aVar.e;
        }
        if (M) {
            str2 = aVar.b;
            if (str2 == null) {
                str2 = aVar.a;
            }
        } else {
            str2 = aVar.a;
        }
        if (str == null || str.length() <= 0) {
            k7n0 k7n0Var2 = this.e;
            if (k7n0Var2 != null) {
                k7n0Var2.s0(str2, (String) j5g.i0(drm0.c0(str2, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
            }
        } else {
            k7n0 k7n0Var3 = this.e;
            if (k7n0Var3 != null) {
                k7n0Var3.q0(new ByteArrayInputStream(str.getBytes(emb.b)), (String) j5g.i0(drm0.c0(str2, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
            }
        }
        int i2 = aVar.c;
        k7n0Var.setRepeatCount(i2 != -1 ? i2 - 1 : -1);
        k7n0Var.m0();
    }

    public final void e() {
        k7n0 k7n0Var;
        WindowManager windowManager = this.f;
        if (windowManager != null && (k7n0Var = this.e) != null) {
            k7n0Var.W();
            windowManager.removeView(k7n0Var);
        }
        this.f = null;
        this.e = null;
    }

    public final void f() {
        h7n0 h7n0Var = new h7n0();
        jyo0 jyo0Var = g5j0.b;
        h5j0.a.getClass();
        int i2 = 17;
        c subscribe = new r(new m(g5j0.b.a(this.a, h5j0.a.b).k(1L, h7n0Var, BackpressureOverflowStrategy.DROP_OLDEST), new sl30(new l4k0(5), 29), io.reactivex.rxjava3.internal.functions.a.d).j(asu0.a.d()), new xq70(new qyi0(this, 7), i2)).subscribe(new s440(new mmm0(this, 1), i2));
        c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = subscribe;
    }

    public SuperAppAnimation(FragmentActivity fragmentActivity, mbs mbsVar, a aVar, uk ukVar) {
        this.a = fragmentActivity;
        this.b = mbsVar;
        this.c = aVar;
        this.d = ukVar;
        this.h = new com.vk.superapp.animation.a(this);
    }
}
