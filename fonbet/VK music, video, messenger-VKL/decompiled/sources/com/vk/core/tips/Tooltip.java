package com.vk.core.tips;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.TipAnchorView;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import xsna.asp;
import xsna.awt0;
import xsna.bpn0;
import xsna.c2c0;
import xsna.ckc;
import xsna.dcn;
import xsna.dq2;
import xsna.e3m;
import xsna.ea0;
import xsna.ejf0;
import xsna.f4m;
import xsna.f4p0;
import xsna.f6p0;
import xsna.fnj;
import xsna.g4p0;
import xsna.g6p0;
import xsna.gn10;
import xsna.gz80;
import xsna.gzs;
import xsna.h4p0;
import xsna.hpg;
import xsna.i0q0;
import xsna.i1f;
import xsna.i4p0;
import xsna.iah0;
import xsna.ilq;
import xsna.izs;
import xsna.k4p0;
import xsna.krv0;
import xsna.lkj0;
import xsna.o0l;
import xsna.ojg;
import xsna.ozl;
import xsna.p4p0;
import xsna.p7v;
import xsna.q1i0;
import xsna.r4p0;
import xsna.rme0;
import xsna.s3q0;
import xsna.s4p0;
import xsna.sc2;
import xsna.stg0;
import xsna.t4p0;
import xsna.v4p0;
import xsna.v5o;
import xsna.wrl0;
import xsna.x1e0;
import xsna.zrp;

/* compiled from: Tooltip.kt */
@ozl
/* loaded from: classes17.dex */
public final class Tooltip {
    public static final /* synthetic */ int n = 0;
    public final CharSequence a;
    public final CharSequence b;
    public final View.OnClickListener c;
    public final DialogInterface.OnShowListener d;
    public final f6p0 e;
    public final View.OnClickListener f;
    public final View.OnClickListener g;
    public final View.OnClickListener h;
    public final c i;
    public final Long j;
    public final f k;
    public int l;
    public sc2 m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Tooltip.kt */
    public static final class WindowStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WindowStyle[] $VALUES;
        public static final WindowStyle DEFAULT_FLOATING;
        public static final WindowStyle FULLSCREEN;
        public static final WindowStyle FULLSCREEN_WITH_STATUSBAR;

        static {
            WindowStyle windowStyle = new WindowStyle("DEFAULT_FLOATING", 0);
            DEFAULT_FLOATING = windowStyle;
            WindowStyle windowStyle2 = new WindowStyle("FULLSCREEN", 1);
            FULLSCREEN = windowStyle2;
            WindowStyle windowStyle3 = new WindowStyle("FULLSCREEN_WITH_STATUSBAR", 2);
            FULLSCREEN_WITH_STATUSBAR = windowStyle3;
            WindowStyle[] windowStyleArr = {windowStyle, windowStyle2, windowStyle3};
            $VALUES = windowStyleArr;
            $ENTRIES = new asp(windowStyleArr);
        }

        public WindowStyle() {
            throw null;
        }

        public static WindowStyle valueOf(String str) {
            return (WindowStyle) Enum.valueOf(WindowStyle.class, str);
        }

        public static WindowStyle[] values() {
            return (WindowStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: Tooltip.kt */
    public static final class a {
        public static androidx.appcompat.app.d a(Context context, String str, String str2, RectF rectF, WindowStyle windowStyle, View.OnClickListener onClickListener, DialogInterface.OnShowListener onShowListener, g6p0 g6p0Var, int i, int i2, Drawable drawable, float f, Integer num, int i3, boolean z, NavigationBarStyle navigationBarStyle, int i4, rme0 rme0Var, Long l, p7v p7vVar, i1f i1fVar, Integer num2, Boolean bool, int i5) {
            int i6 = Tooltip.n;
            View.OnClickListener onClickListener2 = (i5 & 32) != 0 ? null : onClickListener;
            DialogInterface.OnShowListener onShowListener2 = (i5 & 64) != 0 ? null : onShowListener;
            g6p0 g6p0Var2 = (i5 & 128) != 0 ? null : g6p0Var;
            Drawable drawable2 = (i5 & 1024) != 0 ? null : drawable;
            float f2 = (i5 & 2048) != 0 ? 0.72f : f;
            Integer num3 = (i5 & 4096) != 0 ? null : num;
            int i7 = (i5 & 8192) != 0 ? 0 : i3;
            boolean z2 = (i5 & 16384) != 0 ? false : z;
            NavigationBarStyle navigationBarStyle2 = (32768 & i5) != 0 ? null : navigationBarStyle;
            int i8 = (131072 & i5) != 0 ? 1 : i4;
            rme0 rme0Var2 = (262144 & i5) != 0 ? null : rme0Var;
            c.C0781c c0781c = new c.C0781c(0);
            Long l2 = (2097152 & i5) != 0 ? null : l;
            return new Tooltip(context, str, str2, windowStyle, onClickListener2, onShowListener2, g6p0Var2, i, i2, drawable2, f2, num3, i7, z2, navigationBarStyle2, i8, false, rme0Var2, null, c0781c, null, null, (33554432 & i5) != 0 ? null : i1fVar, (16777216 & i5) != 0 ? null : p7vVar, l2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, (134217728 & i5) != 0 ? null : num2, null, (i5 & 268435456) != 0 ? null : bool, -500170752, 6).i(context, rectF);
        }
    }

    /* compiled from: Tooltip.kt */
    public interface b extends dcn {
        void b(boolean z);
    }

    /* compiled from: Tooltip.kt */
    public interface c {
        void c(int i);
    }

    /* compiled from: Tooltip.kt */
    public static final class d {
        public final int a;

        public d(int i) {
            this.a = i;
        }
    }

    /* compiled from: Tooltip.kt */
    public static final class e implements View.OnApplyWindowInsetsListener {
        public final TipAnchorView a;

        public e(TipAnchorView tipAnchorView) {
            this.a = tipAnchorView;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int stableInsetLeft = windowInsets.getStableInsetLeft();
            int stableInsetRight = windowInsets.getStableInsetRight();
            if (gz80.a(28)) {
                if (stableInsetLeft <= 0) {
                    DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                    stableInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
                }
                if (stableInsetRight <= 0) {
                    DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
                    stableInsetRight = displayCutout2 != null ? displayCutout2.getSafeInsetRight() : 0;
                }
            }
            TipAnchorView tipAnchorView = this.a;
            tipAnchorView.setPadding(stableInsetLeft, tipAnchorView.getPaddingTop(), stableInsetRight, tipAnchorView.getPaddingBottom());
            return windowInsets;
        }
    }

    /* compiled from: Tooltip.kt */
    public static final class g {
        public final TipAnchorView a;
        public final View b;
        public final View c;

        public g(TipAnchorView tipAnchorView, View view, View view2) {
            this.a = tipAnchorView;
            this.b = view;
            this.c = view2;
        }
    }

    /* compiled from: Tooltip.kt */
    public static final /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowStyle.values().length];
            try {
                iArr[WindowStyle.FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowStyle.FULLSCREEN_WITH_STATUSBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Tooltip.kt */
    public static final class i extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public i(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
        }
    }

    static {
        new bpn0(new c2c0(12));
    }

    public Tooltip(Context context, CharSequence charSequence, CharSequence charSequence2, WindowStyle windowStyle, View.OnClickListener onClickListener, DialogInterface.OnShowListener onShowListener, f6p0 f6p0Var, int i2, int i3, Drawable drawable, float f2, Integer num, int i4, boolean z, NavigationBarStyle navigationBarStyle, int i5, boolean z2, gzs gzsVar, gzs gzsVar2, c.a aVar, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, c cVar, Long l, float f3, Integer num2, Integer num3, boolean z3, int i6, WeakReference weakReference, Integer num4, d dVar, Boolean bool, int i7, int i8) {
        int i9;
        int i10;
        WindowStyle windowStyle2;
        c cVar2;
        int i11;
        int i12;
        WindowStyle windowStyle3 = (i7 & 8) != 0 ? WindowStyle.DEFAULT_FLOATING : windowStyle;
        View.OnClickListener onClickListener5 = (i7 & 16) != 0 ? null : onClickListener;
        DialogInterface.OnShowListener onShowListener2 = (i7 & 32) != 0 ? null : onShowListener;
        f6p0 f6p0Var2 = (i7 & 64) != 0 ? null : f6p0Var;
        if ((i7 & 128) != 0) {
            e3m.a aVar2 = e3m.a;
            i9 = context.getColor(R.color.vk_tip_background);
        } else {
            i9 = i2;
        }
        if ((i7 & 256) != 0) {
            e3m.a aVar3 = e3m.a;
            i10 = context.getColor(R.color.vk_white);
        } else {
            i10 = i3;
        }
        Drawable drawable2 = (i7 & 512) != 0 ? null : drawable;
        float f4 = (i7 & 1024) != 0 ? 0.72f : f2;
        Integer num5 = (i7 & 2048) != 0 ? null : num;
        int i13 = (i7 & 4096) != 0 ? 0 : i4;
        boolean z4 = (i7 & 8192) != 0 ? false : z;
        NavigationBarStyle navigationBarStyle2 = (i7 & 16384) != 0 ? null : navigationBarStyle;
        int i14 = (i7 & 32768) != 0 ? 1 : i5;
        boolean z5 = (i7 & 65536) != 0 ? false : z2;
        gzs gzsVar3 = (i7 & 131072) != 0 ? null : gzsVar;
        gzs gzsVar4 = (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : gzsVar2;
        c.a c0781c = (i7 & 524288) != 0 ? new c.C0781c(0) : aVar;
        View.OnClickListener onClickListener6 = (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : onClickListener2;
        int i15 = i10;
        View.OnClickListener onClickListener7 = (i7 & 2097152) != 0 ? null : onClickListener3;
        View.OnClickListener onClickListener8 = (i7 & 4194304) != 0 ? null : onClickListener4;
        if ((i7 & 8388608) != 0) {
            windowStyle2 = windowStyle3;
            cVar2 = null;
        } else {
            windowStyle2 = windowStyle3;
            cVar2 = cVar;
        }
        c.a aVar4 = c0781c;
        Long l2 = (i7 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : l;
        float f5 = (i7 & 33554432) != 0 ? 0.4f : f3;
        Integer num6 = (i7 & 67108864) != 0 ? null : num2;
        Integer num7 = (i7 & 134217728) != 0 ? null : num3;
        boolean z6 = (i7 & 268435456) != 0 ? false : z3;
        boolean z7 = (i7 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0;
        if ((i7 & 1073741824) != 0) {
            i11 = i9;
            i12 = -iah0.a(2.0f);
        } else {
            i11 = i9;
            i12 = i6;
        }
        WeakReference weakReference2 = (i7 & Integer.MIN_VALUE) != 0 ? null : weakReference;
        Integer num8 = (i8 & 1) != 0 ? null : num4;
        d dVar2 = (i8 & 2) != 0 ? null : dVar;
        Boolean bool2 = (i8 & 8) != 0 ? null : bool;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = onClickListener5;
        this.d = onShowListener2;
        this.e = f6p0Var2;
        this.f = onClickListener6;
        this.g = onClickListener7;
        this.h = onClickListener8;
        this.i = cVar2;
        this.j = l2;
        Integer num9 = num8;
        this.k = new f(windowStyle2, i11, Integer.valueOf(i15), drawable2, f4, num6, num9, num5, num7, i13, z4, navigationBarStyle2, i14, z5, gzsVar3, gzsVar4, aVar4, f5, z6, z7, i12, weakReference2, dVar2, bool2);
    }

    public static boolean f(int i2, Integer num) {
        return (num == null || (i2 & num.intValue()) == 0) ? false : true;
    }

    public static com.vk.core.tips.b l(Tooltip tooltip, Context context, RectF rectF, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        boolean z5 = (i2 & 4) != 0 ? true : z;
        int i3 = 16;
        return tooltip.k(context, z5, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? true : z3, (i2 & 32) != 0 ? true : z4, false, new x1e0(rectF, i3), new x1e0(rectF, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r12 == 5) goto L46;
     */
    @SuppressLint({"RtlHardcoded"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q1i0 a(Context context, RectF rectF, Integer num) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        boolean z = rectF.right > ((float) i2);
        f fVar = this.k;
        boolean z2 = fVar.k;
        int i4 = R.drawable.vk_bg_tip_no_tail_center;
        int i5 = z2 ? R.drawable.vk_bg_tip_no_tail_center : z ? R.drawable.vk_bg_tip_tail_top_center_compact : R.drawable.vk_bg_tip_tail_top_center;
        int i6 = z ? R.drawable.vk_bg_tip_tail_right_compact : R.drawable.vk_bg_tip_tail_right;
        if (!z2) {
            i4 = R.drawable.vk_bg_tip_tail_bottom_center;
        }
        q1i0 q1i0Var = new q1i0(context, i5, i4, i6);
        q1i0Var.setColorFilter(fVar.b, PorterDuff.Mode.MULTIPLY);
        int i7 = 3;
        if (num != null && num.intValue() == 5) {
            q1i0Var.d(iah0.a(32), iah0.a(28), iah0.a(40), iah0.a(36));
        } else if (num != null && num.intValue() == 3) {
            q1i0Var.d(iah0.a(40), iah0.a(28), iah0.a(32), iah0.a(36));
        }
        float f2 = i3 - rectF.bottom;
        float f3 = rectF.top;
        HashSet hashSet = iah0.a;
        int intValue = num != null ? num.intValue() : f3 - ((float) fnj.a(context)) > f2 ? 48 : 80;
        if (intValue != 48 && (fnj.a(context) / 2) + i3 >= rectF.centerY()) {
            if (intValue != 80) {
                if (intValue == 3) {
                    i7 = 5;
                }
            }
            i7 = 48;
        } else {
            i7 = 80;
        }
        q1i0Var.b(i7);
        return q1i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x015a, code lost:
    
        if (r1 == 80) goto L64;
     */
    @SuppressLint({"RtlHardcoded"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g b(Context context, gzs<? extends RectF> gzsVar) {
        View view;
        int intValue;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        Integer num;
        f fVar = this.k;
        gzs<View> gzsVar2 = fVar.o;
        Integer num2 = fVar.g;
        gzs<View> gzsVar3 = fVar.p;
        gzs<View> gzsVar4 = fVar.o;
        TipAnchorView tipAnchorView = (TipAnchorView) LayoutInflater.from(context).inflate(gzsVar2 == null ? R.layout.vk_tip_bubble : R.layout.vk_tip_container, (ViewGroup) null, false);
        if (gzsVar4 != null) {
            ViewGroup viewGroup = (ViewGroup) tipAnchorView.findViewById(R.id.fl_custom_tip_container);
            View invoke = gzsVar4.invoke();
            viewGroup.addView(invoke);
            view = invoke;
        } else {
            view = null;
        }
        if (gzsVar3 != null) {
            ((ViewGroup) tipAnchorView.findViewById(R.id.outside_container)).addView(gzsVar3.invoke(), new FrameLayout.LayoutParams(-2, -2, 1));
        }
        RectF invoke2 = gzsVar.invoke();
        int i3 = fVar.u;
        float f2 = i3;
        RectF rectF = new RectF(invoke2.left, invoke2.top - f2, invoke2.right, invoke2.bottom + f2);
        TipAnchorView tipAnchorView2 = (TipAnchorView) tipAnchorView.findViewById(R.id.anchor);
        View findViewById = tipAnchorView.findViewById(R.id.bg);
        Integer num3 = fVar.h;
        Integer valueOf = num3 != null ? Integer.valueOf(Gravity.getAbsoluteGravity(num3.intValue(), context.getResources().getConfiguration().getLayoutDirection())) : null;
        boolean z = (valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 5);
        if (z) {
            float f3 = invoke2.left;
            float f4 = fVar.j;
            invoke2.left = f3 - f4;
            invoke2.right += f4;
            rectF.left -= f4;
            rectF.right += f4;
            int a2 = (valueOf != null && valueOf.intValue() == 5) ? iah0.a(20.0f) : iah0.a(12.0f);
            int a3 = (valueOf != null && valueOf.intValue() == 3) ? iah0.a(20.0f) : iah0.a(12.0f);
            tipAnchorView2.setClipChildren(false);
            View findViewById2 = tipAnchorView.findViewById(R.id.text_container);
            if (findViewById2 != null) {
                num = num2;
                findViewById2.setPadding(a2, iah0.a(8.5f), a3, iah0.a(8.5f));
                f4m.m(16, findViewById2);
            } else {
                num = num2;
            }
            intValue = num != null ? num.intValue() : iah0.a(230.0f);
        } else {
            intValue = num2 != null ? num2.intValue() : iah0.a(480.0f);
        }
        int i4 = intValue;
        q1i0 a4 = a(context, invoke2, valueOf);
        findViewById.setBackground(a4);
        findViewById.setPadding(0, 0, 0, 0);
        f4p0 f4p0Var = new f4p0(gzsVar, rectF, i3, z, this);
        int i5 = a4.k;
        int i6 = 3;
        if (i5 != 3) {
            if (i5 != 5) {
                i2 = 48;
                i6 = 80;
                if (i5 != 48) {
                }
            }
            i2 = i6;
        } else {
            i2 = 5;
        }
        float f5 = fVar.e;
        Boolean bool = fVar.x;
        boolean booleanValue = bool != null ? bool.booleanValue() : (view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1) ? false : true;
        tipAnchorView2.c = i2;
        tipAnchorView2.d = a4;
        tipAnchorView2.e = f5;
        tipAnchorView2.f = i4;
        tipAnchorView2.h = booleanValue;
        tipAnchorView2.b = f4p0Var;
        tipAnchorView2.i = fVar;
        h(tipAnchorView);
        ViewParent parent = tipAnchorView.getParent();
        View view2 = tipAnchorView;
        while (parent instanceof View) {
            view2 = (View) parent;
            view2.setBackgroundColor(0);
            parent = view2.getParent();
        }
        return new g(tipAnchorView, findViewById, view2);
    }

    public final View c(Context context, RectF rectF) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_tip_container_view, (ViewGroup) null, false);
        f fVar = this.k;
        if (fVar.o != null) {
            ((ViewGroup) inflate.findViewById(R.id.fl_custom_tip_container)).addView(fVar.o.invoke());
        }
        inflate.setBackground(a(context, rectF, fVar.h));
        inflate.setPadding(0, 0, 0, 0);
        h(inflate);
        return inflate;
    }

    public final dq2 d() {
        return new dq2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0, (int) (255 * this.k.r), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 200L, 4, 120L, 320L, new ilq());
    }

    public final void e(g gVar, int i2) {
        View view = gVar.b;
        sc2 sc2Var = this.m;
        if (sc2Var != null) {
            i0q0.g(sc2Var);
        }
        this.l = 4;
        if (i2 != 0) {
            View.OnClickListener onClickListener = this.c;
            if (i2 == 1) {
                View.OnClickListener onClickListener2 = this.f;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(gVar.c);
                } else if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            } else if (i2 == 3 && onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else {
            View.OnClickListener onClickListener3 = this.h;
            if (onClickListener3 != null) {
                onClickListener3.onClick(gVar.a);
            }
        }
        f6p0 f6p0Var = this.e;
        if (f6p0Var != null) {
            f6p0Var.d(i2);
        }
        c cVar = this.i;
        if (cVar != null) {
            cVar.c(i2);
        }
    }

    public final void g(izs izsVar) {
        this.l = 2;
        Long l = this.j;
        if (l != null) {
            sc2 sc2Var = new sc2(izsVar, 11);
            this.m = sc2Var;
            i0q0.d(l.longValue(), sc2Var);
        }
    }

    public final void h(View view) {
        int color;
        int color2;
        Context context = view.getContext();
        TextView textView = (TextView) view.findViewById(R.id.title);
        f fVar = this.k;
        if (textView != null) {
            CharSequence charSequence = this.a;
            if (charSequence == null || charSequence.length() == 0) {
                f4m.j(textView);
            } else {
                textView.setVisibility(0);
                d dVar = fVar.w;
                Integer num = fVar.i;
                if (dVar != null) {
                    textView.setShadowLayer(3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, dVar.a);
                }
                Integer num2 = fVar.c;
                if (num2 != null) {
                    color2 = num2.intValue();
                } else {
                    e3m.a aVar = e3m.a;
                    color2 = context.getColor(R.color.vk_white);
                }
                textView.setTextColor(color2);
                textView.setText(charSequence);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, fVar.d, (Drawable) null);
                if (f(17, num) || f(1, num)) {
                    textView.setGravity(1);
                    textView.setTextAlignment(1);
                }
            }
        }
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        if (textView2 != null) {
            CharSequence charSequence2 = this.b;
            if (charSequence2 == null || charSequence2.length() == 0) {
                f4m.j(textView2);
                return;
            }
            textView2.setVisibility(0);
            textView2.setText(charSequence2);
            Integer num3 = fVar.c;
            Integer num4 = fVar.i;
            if (num3 != null) {
                color = num3.intValue();
            } else {
                Context context2 = textView2.getContext();
                e3m.a aVar2 = e3m.a;
                color = context2.getColor(R.color.vk_white);
            }
            textView2.setTextColor(color);
            if (f(17, num4) || f(1, num4)) {
                textView2.setGravity(1);
                textView2.setTextAlignment(1);
            }
        }
    }

    public final androidx.appcompat.app.d i(Context context, RectF rectF) {
        x1e0 x1e0Var = new x1e0(rectF, 16);
        if (this.l != 0) {
            throw new IllegalStateException("Tooltip showing was already started");
        }
        final g b2 = b(context, x1e0Var);
        TipAnchorView tipAnchorView = b2.a;
        f fVar = this.k;
        WindowStyle windowStyle = fVar.a;
        c.a aVar = fVar.q;
        final androidx.appcompat.app.d create = ((windowStyle == WindowStyle.FULLSCREEN || !(aVar instanceof c.C0781c)) ? new d.a(context, R.style.VkTooltipFullScreenDialog) : (windowStyle == WindowStyle.FULLSCREEN_WITH_STATUSBAR && iah0.s(context)) ? new d.a(context, R.style.VkTooltipFitWindowDialogStyle) : (windowStyle == WindowStyle.DEFAULT_FLOATING && iah0.s(context)) ? new d.a(context, R.style.VkTooltipDefaultDialogStyle) : new d.a(context)).setView(tipAnchorView).create();
        Window window = create.getWindow();
        if (window != null) {
            if (!(aVar instanceof c.C0781c)) {
                window.clearFlags(1024);
            }
            int i2 = 2;
            window.clearFlags(2);
            window.addFlags(67108864);
            int i3 = h.$EnumSwitchMapping$0[windowStyle.ordinal()];
            if (i3 == 1) {
                window.addFlags(Integer.MIN_VALUE);
            } else if (i3 == 2) {
                window.addFlags(512);
            }
            window.setStatusBarColor(0);
            NavigationBarStyle navigationBarStyle = fVar.l;
            if (navigationBarStyle != null) {
                krv0.t(window, navigationBarStyle);
            }
            if (gz80.a(28)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i4 = fVar.m;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 == 1 || i4 != 2) {
                    i2 = 1;
                }
                attributes.layoutInDisplayCutoutMode = i2;
            }
            window.setLayout(-1, -1);
            if (fVar.n) {
                window.addFlags(131088);
            }
        }
        final ojg ojgVar = new ojg(create, this, b2, 4);
        create.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.j4p0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
                if (i5 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                ojg.this.invoke(2);
                return true;
            }
        });
        create.setOnShowListener(new k4p0(this, 0));
        tipAnchorView.setDismissListener(ojgVar);
        View view = b2.b;
        View view2 = b2.c;
        view.setOnClickListener(new hpg(3, this, ojgVar));
        awt0.t(tipAnchorView, new t4p0(view2, x1e0Var, true, true, ojgVar));
        final com.vk.core.tips.c cVar = new com.vk.core.tips.c(rectF, aVar);
        awt0.t(tipAnchorView, new gzs() { // from class: xsna.l4p0
            @Override // xsna.gzs
            public final Object invoke() {
                Window window2 = androidx.appcompat.app.d.this.getWindow();
                com.vk.core.tips.c cVar2 = cVar;
                if (window2 != null) {
                    window2.setBackgroundDrawable(cVar2);
                }
                Tooltip tooltip = this;
                tooltip.l = 1;
                dq2 d2 = tooltip.d();
                Tooltip.g gVar = b2;
                tooltip.o(cVar2, gVar, d2, new ie3(tooltip, gVar, ojgVar));
                return s3q0.a;
            }
        });
        Activity h2 = e3m.h(context);
        if (h2 != null && (h2.isFinishing() || h2.isDestroyed())) {
            L.G("error: can't start dialog on destroyed activity!");
            return create;
        }
        if (h2 != null) {
            ea0.a(h2, new ejf0(this, 10));
        }
        f6p0 f6p0Var = this.e;
        if (f6p0Var != null) {
            f6p0Var.c();
        }
        create.show();
        return create;
    }

    public final com.vk.core.tips.a j(Context context, RectF rectF) {
        if (this.l == 0) {
            return new com.vk.core.tips.a(i(context, rectF), this);
        }
        throw new IllegalStateException("Tooltip showing was already started");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r0 != 2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.vk.core.tips.b k(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, gzs gzsVar, gzs gzsVar2) {
        s3q0 s3q0Var;
        Window window;
        View decorView;
        Configuration configuration;
        if (this.l != 0) {
            throw new IllegalStateException("Tooltip showing was already started");
        }
        g b2 = b(context, gzsVar);
        TipAnchorView tipAnchorView = b2.a;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Activity h2 = e3m.h(context);
        if (h2 == null) {
            return null;
        }
        f fVar = this.k;
        boolean z6 = fVar.q instanceof c.C0781c;
        boolean z7 = !z6;
        Resources resources = h2.getResources();
        int i2 = 0;
        int i3 = ((resources == null || (configuration = resources.getConfiguration()) == null) ? 1 : configuration.orientation) == 1 ? 1 : 0;
        int requestedOrientation = h2.getRequestedOrientation();
        if (!z6) {
            h2.setRequestedOrientation(i3);
        }
        int i4 = z5 ? -2147352304 : -2147352320;
        if (z3) {
            i4 |= 2;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, i4, 1);
        if (z3) {
            layoutParams.dimAmount = fVar.r;
        }
        layoutParams.softInputMode = 1;
        if (gz80.a(28)) {
            int i5 = fVar.m;
            if (i5 != 0) {
                if (i5 != 1) {
                    i2 = 2;
                }
                i2 = 1;
            }
            layoutParams.layoutInDisplayCutoutMode = i2;
        }
        if (!z6) {
            layoutParams.screenOrientation = i3;
        }
        try {
            windowManager.addView(tipAnchorView, layoutParams);
            s3q0Var = s3q0.a;
        } catch (Throwable unused) {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            return null;
        }
        dq2 d2 = d();
        com.vk.core.tips.c cVar = new com.vk.core.tips.c((RectF) gzsVar2.invoke(), fVar.q);
        p4p0 p4p0Var = new p4p0(this, tipAnchorView, windowManager, z7, h2, requestedOrientation, b2);
        r4p0 r4p0Var = new r4p0(this, h2, cVar, b2, d2, p4p0Var);
        View view = b2.b;
        View view2 = b2.c;
        view.setOnClickListener(new hpg(3, this, r4p0Var));
        awt0.t(tipAnchorView, new t4p0(view2, gzsVar, z2, z4, r4p0Var));
        if (z4) {
            awt0.h(tipAnchorView, new wrl0(r4p0Var, 9), true);
        }
        awt0.t(tipAnchorView, new o0l(tipAnchorView, cVar, this, b2, d2, r4p0Var, 1));
        tipAnchorView.setFocusable(true);
        tipAnchorView.setFocusableInTouchMode(true);
        if (z) {
            tipAnchorView.requestFocus();
        }
        tipAnchorView.setOnApplyWindowInsetsListener(new s4p0(tipAnchorView, 0));
        Activity h3 = e3m.h(context);
        if (h3 != null && (window = h3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            tipAnchorView.setSystemUiVisibility(decorView.getSystemUiVisibility());
        }
        f6p0 f6p0Var = this.e;
        if (f6p0Var != null) {
            f6p0Var.c();
        }
        return new com.vk.core.tips.b(r4p0Var, p4p0Var);
    }

    public final v4p0 n(Context context, gzs gzsVar, boolean z, ViewGroup viewGroup) {
        Configuration configuration;
        if (this.l != 0) {
            throw new IllegalStateException("Tooltip showing was already started");
        }
        final RectF rectF = (RectF) gzsVar.invoke();
        final g b2 = b(context, gzsVar);
        TipAnchorView tipAnchorView = b2.a;
        Activity h2 = e3m.h(context);
        if (h2 == null) {
            return null;
        }
        int requestedOrientation = h2.getRequestedOrientation();
        f fVar = this.k;
        boolean z2 = fVar.q instanceof c.C0781c;
        boolean z3 = !z2;
        boolean z4 = false;
        if (!z2) {
            Resources resources = h2.getResources();
            h2.setRequestedOrientation(((resources == null || (configuration = resources.getConfiguration()) == null) ? 1 : configuration.orientation) == 1 ? 1 : 0);
        }
        Window window = h2.getWindow();
        if (window != null) {
            if (viewGroup != null) {
                viewGroup.addView(tipAnchorView, new ViewGroup.LayoutParams(-1, -1));
            } else {
                window.addContentView(tipAnchorView, new FrameLayout.LayoutParams(-1, -1));
            }
            z4 = true;
        }
        if (!z4) {
            return null;
        }
        final dq2 d2 = d();
        final com.vk.core.tips.c cVar = new com.vk.core.tips.c(rectF, fVar.q);
        g4p0 g4p0Var = new g4p0(this, tipAnchorView, h2, z3, requestedOrientation, b2);
        final h4p0 h4p0Var = new h4p0(this, h2, cVar, b2, d2, g4p0Var);
        b2.b.setOnClickListener(new ckc(5, this, h4p0Var));
        awt0.h(tipAnchorView, new stg0(h4p0Var, 13), true);
        tipAnchorView.setDismissListener(h4p0Var);
        awt0.t(tipAnchorView, new gzs() { // from class: xsna.o4p0
            @Override // xsna.gzs
            public final Object invoke() {
                Tooltip.g gVar = Tooltip.g.this;
                View view = gVar.c;
                final RectF rectF2 = rectF;
                final h4p0 h4p0Var2 = h4p0Var;
                view.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.q4p0
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        h4p0Var2.invoke(Integer.valueOf(rectF2.contains(motionEvent.getX(), motionEvent.getY()) ? 1 : 0));
                        return false;
                    }
                });
                TipAnchorView tipAnchorView2 = gVar.a;
                com.vk.core.tips.c cVar2 = cVar;
                tipAnchorView2.setBackground(cVar2);
                Tooltip tooltip = this;
                tooltip.l = 1;
                tooltip.o(cVar2, gVar, d2, new com.vk.catalog2.common.ui.holders.b(tooltip, gVar, h4p0Var2));
                return s3q0.a;
            }
        });
        tipAnchorView.setFocusable(true);
        tipAnchorView.setFocusableInTouchMode(true);
        if (z) {
            tipAnchorView.requestFocus();
        }
        tipAnchorView.setOnApplyWindowInsetsListener(new e(tipAnchorView));
        return new v4p0(g4p0Var, tipAnchorView);
    }

    public final void o(com.vk.core.tips.c cVar, g gVar, dq2 dq2Var, gzs<s3q0> gzsVar) {
        if (this.k.q instanceof c.C0781c) {
            gzsVar.invoke();
            return;
        }
        TipAnchorView tipAnchorView = gVar.a;
        View view = gVar.b;
        float f2 = dq2Var.a;
        Interpolator interpolator = dq2Var.k;
        float f3 = dq2Var.f;
        float f4 = dq2Var.e;
        int i2 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, dq2Var.b);
        ofFloat.addUpdateListener(new i4p0(0, cVar, tipAnchorView));
        ValueAnimator ofInt = ValueAnimator.ofInt(dq2Var.c, dq2Var.d);
        ofInt.addUpdateListener(new gn10(cVar, i2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f4, f3);
        ofFloat2.addUpdateListener(new lkj0(view, 1));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                viewGroup.getChildAt(i3).setVisibility(dq2Var.h);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofInt, ofFloat2);
        animatorSet.setDuration(dq2Var.j);
        Interpolator interpolator2 = interpolator;
        animatorSet.setInterpolator(interpolator2);
        animatorSet.addListener(new i(gzsVar));
        animatorSet.start();
        animatorSet.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f4, f3);
        ofFloat3.setStartDelay(dq2Var.g);
        ofFloat3.setDuration(dq2Var.i);
        ofFloat3.setInterpolator(interpolator2);
        ofFloat3.addUpdateListener(new v5o(view, i2));
        ofFloat3.start();
    }

    /* compiled from: Tooltip.kt */
    public static final class f {
        public final WindowStyle a;
        public final int b;
        public final Integer c;
        public final Drawable d;
        public final float e;
        public final Integer f;
        public final Integer g;
        public final Integer h;
        public final Integer i;
        public final int j;
        public final boolean k;
        public final NavigationBarStyle l;
        public final int m;
        public final boolean n;
        public final gzs<View> o;
        public final gzs<View> p;
        public final c.a q;
        public final float r;
        public final boolean s;
        public final boolean t;
        public final int u;
        public final WeakReference<View> v;
        public final d w;
        public final Boolean x;

        public f(WindowStyle windowStyle, int i, Integer num, Drawable drawable, float f, Integer num2, Integer num3, Integer num4, Integer num5, int i2, boolean z, NavigationBarStyle navigationBarStyle, int i3, boolean z2, gzs gzsVar, gzs gzsVar2, c.a aVar, float f2, boolean z3, boolean z4, int i4, WeakReference weakReference, d dVar, Boolean bool) {
            this.a = windowStyle;
            this.b = i;
            this.c = num;
            this.d = drawable;
            this.e = f;
            this.f = num2;
            this.g = num3;
            this.h = num4;
            this.i = num5;
            this.j = i2;
            this.k = z;
            this.l = navigationBarStyle;
            this.m = i3;
            this.n = z2;
            this.o = gzsVar;
            this.p = gzsVar2;
            this.q = aVar;
            this.r = f2;
            this.s = z3;
            this.t = z4;
            this.u = i4;
            this.v = weakReference;
            this.w = dVar;
            this.x = bool;
        }

        public f(int i, Integer num, Integer num2, Integer num3, gzs gzsVar, int i2, int i3) {
            this(WindowStyle.DEFAULT_FLOATING, i, num, null, (i3 & 16) != 0 ? 0.72f : 1.0f, null, (i3 & 64) != 0 ? null : num2, num3, null, 0, false, null, 1, (i3 & 8192) == 0, (i3 & 16384) != 0 ? null : gzsVar, null, new c.C0781c(0), 0.4f, false, false, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? -iah0.a(2.0f) : i2, null, null, null);
        }
    }
}
