package com.vk.core.view.components.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.a;
import com.google.android.material.shape.d;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ci0;
import xsna.d3m;
import xsna.dcn;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.gwi0;
import xsna.gzs;
import xsna.hbh0;
import xsna.i0q0;
import xsna.ryo;
import xsna.s01;
import xsna.s3q0;
import xsna.shy;
import xsna.swe0;
import xsna.t01;
import xsna.tn9;
import xsna.uh3;
import xsna.v8e;
import xsna.zrp;

/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class VkTooltip extends LinearLayout implements dcn {
    public int A;
    public int B;
    public boolean C;
    public PopupWindow b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final TextView e;
    public final TextView f;
    public final AppCompatImageView g;
    public LinearLayout h;
    public CharSequence i;
    public boolean j;
    public CharSequence k;
    public boolean l;
    public int m;
    public Appearance n;
    public TooltipGravity o;
    public int p;
    public boolean q;
    public boolean r;
    public final int s;
    public Rect t;
    public int u;
    public int v;
    public View.OnClickListener w;
    public b x;
    public Long y;
    public boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTooltip.kt */
    public static final class Appearance {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Appearance[] $VALUES;
        public static final Appearance Accent;
        public static final Appearance InvariablyBlack;
        public static final Appearance InvariablyWhite;
        public static final Appearance Inversion;
        public static final Appearance Neutral;
        public static final Appearance Transparent;

        static {
            Appearance appearance = new Appearance("Neutral", 0);
            Neutral = appearance;
            Appearance appearance2 = new Appearance("Accent", 1);
            Accent = appearance2;
            Appearance appearance3 = new Appearance("Inversion", 2);
            Inversion = appearance3;
            Appearance appearance4 = new Appearance("InvariablyWhite", 3);
            InvariablyWhite = appearance4;
            Appearance appearance5 = new Appearance("InvariablyBlack", 4);
            InvariablyBlack = appearance5;
            Appearance appearance6 = new Appearance("Transparent", 5);
            Transparent = appearance6;
            Appearance[] appearanceArr = {appearance, appearance2, appearance3, appearance4, appearance5, appearance6};
            $VALUES = appearanceArr;
            $ENTRIES = new asp(appearanceArr);
        }

        public Appearance() {
            throw null;
        }

        public static zrp<Appearance> h() {
            return $ENTRIES;
        }

        public static Appearance valueOf(String str) {
            return (Appearance) Enum.valueOf(Appearance.class, str);
        }

        public static Appearance[] values() {
            return (Appearance[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTooltip.kt */
    public static final class DismissReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DismissReason[] $VALUES;
        public static final DismissReason AUTO_DISMISS;
        public static final DismissReason BACK_CLICK;
        public static final DismissReason CLOSE_BUTTON_CLICK;
        public static final DismissReason DISMISS_FROM_CODE;
        public static final DismissReason OUT_CLICK;
        public static final DismissReason TOOLTIP_CLICK;

        static {
            DismissReason dismissReason = new DismissReason("OUT_CLICK", 0);
            OUT_CLICK = dismissReason;
            DismissReason dismissReason2 = new DismissReason("TOOLTIP_CLICK", 1);
            TOOLTIP_CLICK = dismissReason2;
            DismissReason dismissReason3 = new DismissReason("CLOSE_BUTTON_CLICK", 2);
            CLOSE_BUTTON_CLICK = dismissReason3;
            DismissReason dismissReason4 = new DismissReason("BACK_CLICK", 3);
            BACK_CLICK = dismissReason4;
            DismissReason dismissReason5 = new DismissReason("AUTO_DISMISS", 4);
            AUTO_DISMISS = dismissReason5;
            DismissReason dismissReason6 = new DismissReason("DISMISS_FROM_CODE", 5);
            DISMISS_FROM_CODE = dismissReason6;
            DismissReason[] dismissReasonArr = {dismissReason, dismissReason2, dismissReason3, dismissReason4, dismissReason5, dismissReason6};
            $VALUES = dismissReasonArr;
            $ENTRIES = new asp(dismissReasonArr);
        }

        public DismissReason() {
            throw null;
        }

        public static DismissReason valueOf(String str) {
            return (DismissReason) Enum.valueOf(DismissReason.class, str);
        }

        public static DismissReason[] values() {
            return (DismissReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkTooltip.kt */
    public static final class TooltipGravity {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TooltipGravity[] $VALUES;
        public static final TooltipGravity BOTTOM;
        public static final TooltipGravity LEFT;
        public static final TooltipGravity RIGHT;
        public static final TooltipGravity TOP;

        /* compiled from: VkTooltip.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TooltipGravity.values().length];
                try {
                    iArr[TooltipGravity.RIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TooltipGravity.BOTTOM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TooltipGravity.LEFT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TooltipGravity.TOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            TooltipGravity tooltipGravity = new TooltipGravity("TOP", 0);
            TOP = tooltipGravity;
            TooltipGravity tooltipGravity2 = new TooltipGravity("BOTTOM", 1);
            BOTTOM = tooltipGravity2;
            TooltipGravity tooltipGravity3 = new TooltipGravity("LEFT", 2);
            LEFT = tooltipGravity3;
            TooltipGravity tooltipGravity4 = new TooltipGravity("RIGHT", 3);
            RIGHT = tooltipGravity4;
            TooltipGravity[] tooltipGravityArr = {tooltipGravity, tooltipGravity2, tooltipGravity3, tooltipGravity4};
            $VALUES = tooltipGravityArr;
            $ENTRIES = new asp(tooltipGravityArr);
        }

        public TooltipGravity() {
            throw null;
        }

        public static TooltipGravity valueOf(String str) {
            return (TooltipGravity) Enum.valueOf(TooltipGravity.class, str);
        }

        public static TooltipGravity[] values() {
            return (TooltipGravity[]) $VALUES.clone();
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class a {
        public final Context a;
        public CharSequence b;
        public CharSequence c;
        public boolean h;
        public final int k;
        public int l;
        public ci0 m;
        public b n;
        public Long o;
        public LinearLayout q;
        public int d = Integer.MAX_VALUE;
        public Appearance e = Appearance.Accent;
        public TooltipGravity f = TooltipGravity.TOP;
        public boolean g = true;
        public boolean i = true;
        public boolean j = true;
        public boolean p = true;

        public a(Context context) {
            this.a = context;
            this.k = hbh0.b(4, context);
            this.l = hbh0.b(264, context);
        }

        public final VkTooltip a(Rect rect) {
            CharSequence charSequence;
            CharSequence charSequence2 = this.b;
            if ((charSequence2 == null || charSequence2.length() == 0) && (((charSequence = this.c) == null || charSequence.length() == 0) && this.q == null)) {
                throw new IllegalArgumentException("title, description or extra must not be null!");
            }
            final VkTooltip vkTooltip = new VkTooltip(this.a);
            VkTooltip.c(vkTooltip, this.b, this.c, this.d, !this.g, this.e, this.f, this.l, !this.h, this.i, this.k, rect, this.o, this.p, this.q);
            final PopupWindow popupWindow = new PopupWindow((View) vkTooltip, -2, -2, true);
            popupWindow.setOutsideTouchable(true);
            vkTooltip.setOnTooltipClickListener(this.m);
            vkTooltip.setTooltipDismissListener(new gwi0(vkTooltip, this, popupWindow, 2));
            popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: xsna.ctv0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    VkTooltip vkTooltip2 = VkTooltip.this;
                    if (f4m.b(vkTooltip2).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    VkTooltip.a aVar = this;
                    if (aVar.j) {
                        vkTooltip2.a(new akd0(popupWindow, 27));
                        VkTooltip.b bVar = aVar.n;
                        if (bVar != null) {
                            bVar.b(VkTooltip.DismissReason.OUT_CLICK);
                        }
                    }
                    return true;
                }
            });
            popupWindow.setWidth(vkTooltip.getMeasuredWidth());
            popupWindow.setHeight(vkTooltip.getMeasuredHeight());
            popupWindow.showAtLocation(vkTooltip, 0, vkTooltip.getPositionX(), vkTooltip.getPositionY());
            vkTooltip.post(new tn9(vkTooltip, 24));
            Long l = this.o;
            if (l != null) {
                i0q0.d(l.longValue(), new v8e(popupWindow, vkTooltip, this, 3));
            }
            vkTooltip.b = popupWindow;
            return vkTooltip;
        }
    }

    /* compiled from: VkTooltip.kt */
    public interface b {
        void b(DismissReason dismissReason);
    }

    /* compiled from: VkTooltip.kt */
    public static final class c extends ryo {
        public final Context b;
        public final float c;
        public final com.vk.core.view.components.tooltip.b d = com.vk.core.view.components.tooltip.b.a;

        public c(Context context, float f) {
            this.b = context;
            this.c = f;
        }

        @Override // xsna.ryo
        public final void b(float f, float f2, float f3, com.google.android.material.shape.d dVar) {
            float f4 = f2 - this.c;
            com.vk.core.view.components.tooltip.b bVar = this.d;
            bVar.getClass();
            Context context = this.b;
            float f5 = (-hbh0.b(8, context)) * f3;
            bVar.getClass();
            float b = hbh0.b(20, context) / 2.0f;
            bVar.getClass();
            float b2 = hbh0.b(20, context) * 0.18f;
            float f6 = f4 - b;
            dVar.d(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            d.C0125d c0125d = new d.C0125d(f6 + b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4 - b2, f5, f4, f5);
            ArrayList arrayList = dVar.g;
            arrayList.add(c0125d);
            dVar.i = true;
            dVar.c = f4;
            dVar.d = f5;
            float f7 = f4 + b;
            arrayList.add(new d.C0125d(f4 + b2, f5, f7 - b2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            dVar.i = true;
            dVar.c = f7;
            dVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final class d {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + shy.a(0, shy.a(0, Integer.hashCode(0) * 31, 31), 31);
        }

        public final String toString() {
            return "TooltipPadding(left=0, top=0, right=0, bottom=0)";
        }
    }

    /* compiled from: VkTooltip.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TooltipGravity.values().length];
            try {
                iArr[TooltipGravity.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipGravity.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipGravity.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TooltipGravity.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkTooltip(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_tooltip, this);
        this.e = (TextView) findViewById(R.id.title);
        this.c = (ViewGroup) findViewById(R.id.tooltip_container);
        this.d = (ViewGroup) findViewById(R.id.text_container);
        this.f = (TextView) findViewById(R.id.description);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.close_btn);
        this.g = appCompatImageView;
        appCompatImageView.setVisibility(8);
        f4m.j(this);
        setOnClickListener(new s01(this, 14));
        appCompatImageView.setOnClickListener(new t01(this, 11));
        setOnKeyListener(new View.OnKeyListener() { // from class: xsna.zsv0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                VkTooltip.b bVar = VkTooltip.this.x;
                if (bVar != null) {
                    bVar.b(VkTooltip.DismissReason.BACK_CLICK);
                }
                return true;
            }
        });
        this.j = true;
        this.l = true;
        this.m = Integer.MAX_VALUE;
        this.n = Appearance.Neutral;
        this.o = TooltipGravity.BOTTOM;
        this.p = hbh0.b(PsExtractor.VIDEO_STREAM_MASK, context);
        this.s = hbh0.b(4, context);
        this.t = new Rect();
        this.z = true;
    }

    public static void c(VkTooltip vkTooltip, CharSequence charSequence, CharSequence charSequence2, int i, boolean z, Appearance appearance, TooltipGravity tooltipGravity, int i2, boolean z2, boolean z3, int i3, Rect rect, Long l, boolean z4, LinearLayout linearLayout) {
        TooltipGravity tooltipGravity2;
        Rect rect2;
        List l2;
        Object obj;
        boolean z5 = vkTooltip.j;
        boolean z6 = vkTooltip.l;
        AppCompatImageView appCompatImageView = vkTooltip.g;
        ViewGroup viewGroup = vkTooltip.d;
        TextView textView = vkTooltip.f;
        vkTooltip.i = charSequence;
        TextView textView2 = vkTooltip.e;
        textView2.setText(charSequence);
        f4m.E(textView2, !(charSequence == null || charSequence.length() == 0));
        vkTooltip.j = z5;
        textView2.setMaxLines(z5 ? Integer.MAX_VALUE : 1);
        vkTooltip.k = charSequence2;
        textView.setText(charSequence2);
        f4m.E(textView, !(charSequence2 == null || charSequence2.length() == 0));
        int i4 = i;
        vkTooltip.m = i4;
        vkTooltip.l = z6;
        if (!z6) {
            i4 = 1;
        }
        textView.setMaxLines(i4);
        appCompatImageView.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            if (z) {
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
            } else {
                layoutParams2.width = -2;
                layoutParams2.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            viewGroup.setLayoutParams(layoutParams2);
        }
        vkTooltip.n = appearance;
        com.vk.core.view.components.tooltip.c tooltipDefaults = vkTooltip.getTooltipDefaults();
        if (tooltipDefaults instanceof com.vk.core.view.components.tooltip.a) {
            Context context = vkTooltip.getContext();
            ((com.vk.core.view.components.tooltip.a) tooltipDefaults).getClass();
            textView2.setTextAppearance(e3m.g(R.attr.vk_ui_typography_text, context));
            textView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_paragraph, vkTooltip.getContext()));
            textView2.invalidate();
            textView.invalidate();
            textView2.setIncludeFontPadding(false);
            textView.setIncludeFontPadding(false);
        }
        int f = e3m.f(tooltipDefaults.b(appearance), vkTooltip.getContext());
        textView2.setTextColor(f);
        textView.setTextColor(f);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(e3m.f(tooltipDefaults.f(appearance), vkTooltip.getContext())));
        com.vk.core.view.components.tooltip.c tooltipDefaults2 = vkTooltip.getTooltipDefaults();
        vkTooltip.getContext();
        tooltipDefaults2.a();
        viewGroup.setPadding(0, 0, 0, 0);
        int e2 = tooltipDefaults2.e(vkTooltip.getContext());
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.setMarginStart(e2);
        }
        vkTooltip.o = tooltipGravity;
        vkTooltip.p = i2;
        vkTooltip.q = z2;
        vkTooltip.r = z3;
        rect.top -= i3;
        rect.bottom += i3;
        rect.left -= i3;
        rect.right += i3;
        vkTooltip.t = rect;
        vkTooltip.y = l;
        vkTooltip.z = z4;
        LinearLayout linearLayout2 = vkTooltip.h;
        if (linearLayout2 != null) {
            viewGroup.removeView(linearLayout2);
        }
        vkTooltip.h = linearLayout;
        if (linearLayout != null) {
            viewGroup.addView(linearLayout, viewGroup.indexOfChild(textView) + 1);
        }
        ViewGroup viewGroup2 = vkTooltip.c;
        com.vk.core.view.components.tooltip.c tooltipDefaults3 = vkTooltip.getTooltipDefaults();
        int c2 = vkTooltip.q ? tooltipDefaults3.c(vkTooltip.getContext()) : 0;
        if (vkTooltip.r) {
            Rect rect3 = vkTooltip.t;
            DisplayMetrics displayMetrics = vkTooltip.getContext().getResources().getDisplayMetrics();
            vkTooltip.measure(View.MeasureSpec.makeMeasureSpec(vkTooltip.p, Integer.MIN_VALUE), 0);
            int measuredWidth = vkTooltip.getMeasuredWidth();
            int i5 = vkTooltip.p;
            if (measuredWidth > i5) {
                measuredWidth = i5;
            }
            int i6 = measuredWidth + c2;
            int measuredHeight = vkTooltip.getMeasuredHeight();
            int i7 = displayMetrics.heightPixels / 2;
            if (measuredHeight > i7) {
                measuredHeight = i7;
            }
            int i8 = measuredHeight + c2;
            TooltipGravity tooltipGravity3 = vkTooltip.o;
            tooltipGravity3.getClass();
            int i9 = TooltipGravity.a.$EnumSwitchMapping$0[tooltipGravity3.ordinal()];
            if (i9 == 1) {
                l2 = e43.l(TooltipGravity.RIGHT, TooltipGravity.LEFT, TooltipGravity.TOP, TooltipGravity.BOTTOM);
            } else if (i9 == 2) {
                l2 = e43.l(TooltipGravity.BOTTOM, TooltipGravity.TOP, TooltipGravity.LEFT, TooltipGravity.RIGHT);
            } else if (i9 == 3) {
                l2 = e43.l(TooltipGravity.LEFT, TooltipGravity.RIGHT, TooltipGravity.TOP, TooltipGravity.BOTTOM);
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                l2 = e43.l(TooltipGravity.TOP, TooltipGravity.BOTTOM, TooltipGravity.LEFT, TooltipGravity.RIGHT);
            }
            for (Object obj2 : l2) {
                int i10 = e.$EnumSwitchMapping$0[((TooltipGravity) obj2).ordinal()];
                if (i10 == 1) {
                    if (rect3.top - i8 >= 0) {
                        obj = obj2;
                        break;
                    }
                } else if (i10 == 2) {
                    if (rect3.bottom + i8 <= displayMetrics.heightPixels) {
                        obj = obj2;
                        break;
                    }
                } else if (i10 == 3) {
                    if (rect3.left - i6 >= 0) {
                        obj = obj2;
                        break;
                    }
                } else {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (rect3.right + i6 <= displayMetrics.widthPixels) {
                        obj = obj2;
                        break;
                    }
                }
            }
            obj = null;
            tooltipGravity2 = (TooltipGravity) obj;
            if (tooltipGravity2 == null) {
                tooltipGravity2 = vkTooltip.o;
            }
        } else {
            tooltipGravity2 = vkTooltip.o;
        }
        int i11 = vkTooltip.s;
        tooltipGravity2.getClass();
        int i12 = TooltipGravity.a.$EnumSwitchMapping$0[tooltipGravity2.ordinal()];
        if (i12 == 1) {
            rect2 = new Rect(i11, 0, 0, 0);
        } else if (i12 == 2) {
            rect2 = new Rect(0, i11, 0, 0);
        } else if (i12 == 3) {
            rect2 = new Rect(0, 0, i11, 0);
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            rect2 = new Rect(0, 0, 0, i11);
        }
        f4m.u(viewGroup2, rect2.left, rect2.top, rect2.right, rect2.bottom);
        vkTooltip.measure(View.MeasureSpec.makeMeasureSpec(vkTooltip.p, Integer.MIN_VALUE), 0);
        a.C0123a c0123a = new a.C0123a();
        c0123a.c(tooltipDefaults3.g(vkTooltip.getContext()));
        DisplayMetrics displayMetrics2 = vkTooltip.getContext().getResources().getDisplayMetrics();
        int measuredWidth2 = vkTooltip.getMeasuredWidth();
        int i13 = vkTooltip.p;
        if (measuredWidth2 > i13) {
            measuredWidth2 = i13;
        }
        int measuredHeight2 = vkTooltip.getMeasuredHeight();
        int i14 = displayMetrics2.heightPixels;
        int i15 = i14 / 2;
        if (measuredHeight2 > i15) {
            measuredHeight2 = i15;
        }
        int i16 = displayMetrics2.widthPixels - measuredWidth2;
        int i17 = i14 - measuredHeight2;
        int i18 = e.$EnumSwitchMapping$0[tooltipGravity2.ordinal()];
        if (i18 == 1) {
            float f2 = measuredWidth2 / 2.0f;
            vkTooltip.u = swe0.g((int) (vkTooltip.t.centerX() - f2), 0, i16);
            vkTooltip.v = vkTooltip.t.top - measuredHeight2;
            if (vkTooltip.q) {
                c0123a.k = new c(vkTooltip.getContext(), (r4.centerX() - vkTooltip.u) - f2);
            }
            vkTooltip.A = vkTooltip.t.centerX();
            vkTooltip.B = vkTooltip.t.top;
        } else if (i18 == 2) {
            vkTooltip.u = swe0.g(vkTooltip.t.centerX() - (measuredWidth2 / 2), 0, i16);
            vkTooltip.v = vkTooltip.t.bottom;
            if (vkTooltip.q) {
                c0123a.i = new c(vkTooltip.getContext(), -((r4.centerX() - vkTooltip.u) - (measuredWidth2 / 2.0f)));
            }
            vkTooltip.A = vkTooltip.t.centerX();
            vkTooltip.B = vkTooltip.t.bottom;
        } else if (i18 == 3) {
            Rect rect4 = vkTooltip.t;
            vkTooltip.u = rect4.left - measuredWidth2;
            vkTooltip.v = swe0.g(rect4.centerY() - (measuredHeight2 / 2), 0, i17);
            if (vkTooltip.q) {
                c0123a.j = new c(vkTooltip.getContext(), (vkTooltip.t.centerY() - vkTooltip.v) - (measuredHeight2 / 2.0f));
            }
            Rect rect5 = vkTooltip.t;
            vkTooltip.A = rect5.left;
            vkTooltip.B = rect5.centerY();
        } else {
            if (i18 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Rect rect6 = vkTooltip.t;
            vkTooltip.u = rect6.right;
            vkTooltip.v = swe0.g(rect6.centerY() - (measuredHeight2 / 2), 0, i17);
            if (vkTooltip.q) {
                c0123a.l = new c(vkTooltip.getContext(), (vkTooltip.t.centerY() - vkTooltip.v) - (measuredHeight2 / 2.0f));
            }
            Rect rect7 = vkTooltip.t;
            vkTooltip.A = rect7.right;
            vkTooltip.B = rect7.centerY();
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(c0123a.a());
        materialShapeDrawable.setTint(e3m.f(tooltipDefaults3.d(vkTooltip.n), vkTooltip.getContext()));
        viewGroup2.setBackground(materialShapeDrawable);
        viewGroup2.setElevation(vkTooltip.n == Appearance.Transparent ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : tooltipDefaults3.h(vkTooltip.getContext()));
    }

    private final com.vk.core.view.components.tooltip.c getTooltipDefaults() {
        getContext();
        return com.vk.core.view.components.tooltip.b.a;
    }

    public final void a(gzs<s3q0> gzsVar) {
        if (this.C) {
            return;
        }
        this.C = true;
        getLocationOnScreen(new int[2]);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 0, this.A - r1[0], 0, this.B - r1[1]);
        scaleAnimation.setDuration(150L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(150L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        d3m.h(animationSet, new uh3(29, gzsVar, this));
        animationSet.setFillAfter(true);
        startAnimation(animationSet);
    }

    @Override // xsna.dcn
    public final void dismiss() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        b bVar = this.x;
        if (bVar != null) {
            bVar.b(DismissReason.DISMISS_FROM_CODE);
        }
    }

    public final boolean getAllowAutoChangeGravity() {
        return this.r;
    }

    public final int getAnchorMargin() {
        return this.s;
    }

    public final Appearance getAppearance() {
        return this.n;
    }

    public final CharSequence getDescription() {
        return this.k;
    }

    public final int getDescriptionMaxLines() {
        return this.m;
    }

    public final Long getDismissDelayTimeMs() {
        return this.y;
    }

    @Override // android.widget.LinearLayout
    public final TooltipGravity getGravity() {
        return this.o;
    }

    public final int getMaxWidth() {
        return this.p;
    }

    public final View.OnClickListener getOnTooltipClickListener() {
        return this.w;
    }

    public final int getPositionX() {
        return this.u;
    }

    public final int getPositionY() {
        return this.v;
    }

    public final Rect getRect() {
        return this.t;
    }

    public final boolean getShouldDismissOnTooltipClick() {
        return this.z;
    }

    public final CharSequence getTitle() {
        return this.i;
    }

    public final b getTooltipDismissListener() {
        return this.x;
    }

    public final boolean getWithPointer() {
        return this.q;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.p, Integer.MIN_VALUE), i2);
    }

    public final void setOnTooltipClickListener(View.OnClickListener onClickListener) {
        this.w = onClickListener;
    }

    public final void setTooltipDismissListener(b bVar) {
        this.x = bVar;
    }

    private static /* synthetic */ void getTooltipDefaults$annotations() {
    }
}
