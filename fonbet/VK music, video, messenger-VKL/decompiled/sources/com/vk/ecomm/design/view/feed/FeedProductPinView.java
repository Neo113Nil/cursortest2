package com.vk.ecomm.design.view.feed;

import android.content.res.ColorStateList;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.asp;
import xsna.awt0;
import xsna.bd0;
import xsna.bpn0;
import xsna.e3m;
import xsna.e43;
import xsna.gzs;
import xsna.iah0;
import xsna.krv0;
import xsna.l7s;
import xsna.l8g;
import xsna.ocg;
import xsna.s3q0;
import xsna.swe0;
import xsna.u2r;
import xsna.v2r;
import xsna.vr6;
import xsna.w2r;
import xsna.x2r;
import xsna.zrp;

/* compiled from: FeedProductPinView.kt */
/* loaded from: classes18.dex */
public final class FeedProductPinView extends FrameLayout {
    public static final int u = iah0.a(16);
    public final VkText b;
    public final VkText c;
    public final VkImageSimple d;
    public final u2r e;
    public final bpn0 f;
    public CharSequence g;
    public CharSequence h;
    public boolean i;
    public String j;
    public PinGravity k;
    public int l;
    public boolean m;
    public Rect n;
    public Rect o;
    public int p;
    public int q;
    public boolean r;
    public gzs<s3q0> s;
    public gzs<s3q0> t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedProductPinView.kt */
    public static final class PinGravity {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PinGravity[] $VALUES;
        public static final PinGravity BOTTOM;
        public static final PinGravity LEFT;
        public static final PinGravity RIGHT;
        public static final PinGravity TOP;

        /* compiled from: FeedProductPinView.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PinGravity.values().length];
                try {
                    iArr[PinGravity.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PinGravity.BOTTOM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PinGravity.LEFT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PinGravity.RIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            PinGravity pinGravity = new PinGravity("TOP", 0);
            TOP = pinGravity;
            PinGravity pinGravity2 = new PinGravity("BOTTOM", 1);
            BOTTOM = pinGravity2;
            PinGravity pinGravity3 = new PinGravity("LEFT", 2);
            LEFT = pinGravity3;
            PinGravity pinGravity4 = new PinGravity("RIGHT", 3);
            RIGHT = pinGravity4;
            PinGravity[] pinGravityArr = {pinGravity, pinGravity2, pinGravity3, pinGravity4};
            $VALUES = pinGravityArr;
            $ENTRIES = new asp(pinGravityArr);
        }

        public PinGravity() {
            throw null;
        }

        public static PinGravity valueOf(String str) {
            return (PinGravity) Enum.valueOf(PinGravity.class, str);
        }

        public static PinGravity[] values() {
            return (PinGravity[]) $VALUES.clone();
        }
    }

    /* compiled from: FeedProductPinView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinGravity.values().length];
            try {
                iArr[PinGravity.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinGravity.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PinGravity.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PinGravity.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FeedProductPinView(l7s l7sVar) {
        super(l7sVar, null, 0);
        u2r u2rVar = new u2r(l7sVar);
        this.e = u2rVar;
        this.f = new bpn0(new ocg(l7sVar, 17));
        LayoutInflater.from(l7sVar).inflate(R.layout.feed_product_pin_view, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.pin_container);
        VkText vkText = (VkText) findViewById(R.id.title);
        this.b = vkText;
        vkText.setSingleLine(true);
        VkText vkText2 = (VkText) findViewById(R.id.description);
        this.c = vkText2;
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.icon_btn);
        this.d = vkImageSimple;
        setClipChildren(false);
        setClipToPadding(false);
        setOnClickListener(new vr6(this, 2));
        vkImageSimple.setOnClickListener(new bd0(this, 4));
        int m = krv0.m(R.attr.vk_ui_text_contrast, getContext());
        vkText.setTextColor(m);
        vkText2.setTextColor(m);
        vkImageSimple.setImageTintList(ColorStateList.valueOf(krv0.m(R.attr.vk_ui_icon_contrast, getContext())));
        viewGroup.getBackground().setAlpha(l8g.b(0.7f));
        vkText.setTextAppearance(e3m.g(R.attr.vk_ui_typography_caption1_medium, l7sVar));
        vkText2.setTextAppearance(e3m.g(R.attr.vk_ui_typography_caption2_caps, l7sVar));
        int i = (v2r.b * 2) + v2r.c;
        u2rVar.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        addView(u2rVar);
        this.k = PinGravity.TOP;
        this.l = iah0.a(228);
        this.n = new Rect();
        this.o = new Rect(0, 0, l7sVar.getResources().getDisplayMetrics().widthPixels, l7sVar.getResources().getDisplayMetrics().heightPixels);
        this.r = true;
    }

    public static final void a(FeedProductPinView feedProductPinView, TextView textView, String str, int i, int i2) {
        feedProductPinView.getClass();
        if (textView.getVisibility() == 0) {
            if (textView.getPaint().measureText(str) <= textView.getWidth()) {
                textView.getPaint().setShader(null);
                return;
            }
            textView.getPaint().setShader(new LinearGradient(textView.getWidth() - i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textView.getWidth(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{i2, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    public static int b(int i, int i2, int i3) {
        return i2 <= i3 ? swe0.g(i, i2, i3) : i;
    }

    public static void c(FeedProductPinView feedProductPinView, CharSequence charSequence, String str, boolean z, Rect rect, Rect rect2, String str2, int i) {
        int i2;
        Rect rect3;
        List l;
        CharSequence charSequence2 = (i & 1) != 0 ? feedProductPinView.g : charSequence;
        CharSequence charSequence3 = (i & 2) != 0 ? feedProductPinView.h : str;
        boolean z2 = (i & 4) != 0 ? feedProductPinView.i : z;
        PinGravity pinGravity = feedProductPinView.k;
        int i3 = feedProductPinView.l;
        boolean z3 = (i & 32) != 0 ? feedProductPinView.m : true;
        Rect rect4 = (i & 64) != 0 ? feedProductPinView.n : rect;
        Rect rect5 = (i & 128) != 0 ? feedProductPinView.o : rect2;
        boolean z4 = feedProductPinView.r;
        String str3 = (i & 512) != 0 ? feedProductPinView.j : str2;
        feedProductPinView.r = z4;
        feedProductPinView.g = charSequence2;
        VkText vkText = feedProductPinView.b;
        vkText.setText(charSequence2);
        awt0.v(vkText, !(charSequence2 == null || charSequence2.length() == 0));
        Object obj = null;
        if (!z4) {
            vkText.getPaint().setShader(null);
        } else if (!vkText.isLaidOut() || vkText.isLayoutRequested()) {
            vkText.addOnLayoutChangeListener(new x2r(feedProductPinView, charSequence2));
        } else {
            a(feedProductPinView, vkText, String.valueOf(charSequence2), v2r.f, krv0.m(R.attr.vk_ui_text_contrast, feedProductPinView.getContext()));
        }
        feedProductPinView.h = charSequence3;
        VkText vkText2 = feedProductPinView.c;
        vkText2.setText(charSequence3);
        awt0.v(vkText2, !(charSequence3 == null || charSequence3.length() == 0));
        feedProductPinView.i = z2;
        feedProductPinView.j = str3;
        VkImageSimple vkImageSimple = feedProductPinView.d;
        if (z2) {
            vkImageSimple.setImportantForAccessibility(1);
            vkImageSimple.setContentDescription(str3);
            vkImageSimple.setImageResource(R.drawable.vk_icon_cancel_16);
        } else {
            vkImageSimple.setImportantForAccessibility(2);
            vkImageSimple.setContentDescription(null);
            vkImageSimple.setImageResource(R.drawable.vk_icon_chevron_12);
        }
        awt0.j(u, vkImageSimple);
        feedProductPinView.k = pinGravity;
        feedProductPinView.l = i3;
        feedProductPinView.m = z3;
        feedProductPinView.n = rect4;
        feedProductPinView.o = rect5;
        if (z3) {
            feedProductPinView.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), 0);
            int b = (b(feedProductPinView.getMeasuredWidth(), v2r.d, feedProductPinView.l) - feedProductPinView.getPaddingStart()) - feedProductPinView.getPaddingEnd();
            int i4 = v2r.c;
            int i5 = v2r.b * 2;
            int i6 = b + i4 + i5;
            int measuredHeight = feedProductPinView.getMeasuredHeight();
            int i7 = v2r.e;
            if (measuredHeight < i7) {
                measuredHeight = i7;
            }
            int paddingTop = ((measuredHeight - feedProductPinView.getPaddingTop()) - feedProductPinView.getPaddingBottom()) + i4 + i5;
            PinGravity pinGravity2 = feedProductPinView.k;
            pinGravity2.getClass();
            int i8 = PinGravity.a.$EnumSwitchMapping$0[pinGravity2.ordinal()];
            if (i8 == 1) {
                l = e43.l(PinGravity.TOP, PinGravity.BOTTOM);
            } else if (i8 == 2) {
                l = e43.l(PinGravity.BOTTOM, PinGravity.TOP);
            } else if (i8 == 3) {
                l = e43.l(PinGravity.LEFT, PinGravity.RIGHT);
            } else {
                if (i8 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                l = e43.l(PinGravity.RIGHT, PinGravity.LEFT);
            }
            for (Object obj2 : l) {
                int i9 = a.$EnumSwitchMapping$0[((PinGravity) obj2).ordinal()];
                if (i9 == 1) {
                    if (rect4.top - paddingTop >= feedProductPinView.o.top) {
                        obj = obj2;
                        break;
                    }
                } else if (i9 == 2) {
                    if (rect4.bottom + paddingTop <= feedProductPinView.o.bottom) {
                        obj = obj2;
                        break;
                    }
                } else if (i9 == 3) {
                    if (rect4.left - i6 >= feedProductPinView.o.left) {
                        obj = obj2;
                        break;
                    }
                } else {
                    if (i9 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (rect4.right + i6 <= feedProductPinView.o.right) {
                        obj = obj2;
                        break;
                    }
                }
            }
            PinGravity pinGravity3 = (PinGravity) obj;
            pinGravity = pinGravity3 == null ? feedProductPinView.k : pinGravity3;
        }
        pinGravity.getClass();
        int i10 = PinGravity.a.$EnumSwitchMapping$0[pinGravity.ordinal()];
        if (i10 == 1) {
            i2 = 0;
            rect3 = new Rect(0, 0, 0, (v2r.b * 2) + v2r.c);
        } else if (i10 == 2) {
            i2 = 0;
            rect3 = new Rect(0, (v2r.b * 2) + v2r.c, 0, 0);
        } else if (i10 == 3) {
            i2 = 0;
            rect3 = new Rect(0, 0, (v2r.b * 2) + v2r.c, 0);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 0;
            rect3 = new Rect((v2r.b * 2) + v2r.c, 0, 0, 0);
        }
        feedProductPinView.setPadding(rect3.left, rect3.top, rect3.right, rect3.bottom);
        feedProductPinView.measure(View.MeasureSpec.makeMeasureSpec(feedProductPinView.l, Integer.MIN_VALUE), i2);
        int b2 = b(feedProductPinView.getMeasuredWidth(), v2r.d, feedProductPinView.l);
        int measuredHeight2 = feedProductPinView.getMeasuredHeight();
        int i11 = v2r.e;
        if (measuredHeight2 < i11) {
            measuredHeight2 = i11;
        }
        Rect rect6 = feedProductPinView.o;
        int i12 = rect6.right - b2;
        int i13 = rect6.bottom - measuredHeight2;
        int i14 = rect6.left;
        int i15 = rect6.top;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i16 = iArr[pinGravity.ordinal()];
        if (i16 == 1) {
            feedProductPinView.p = feedProductPinView.n.centerX() - (b2 / 2);
            feedProductPinView.q = (((v2r.b * 2) + v2r.c) / 2) + (feedProductPinView.n.top - measuredHeight2);
        } else if (i16 == 2) {
            feedProductPinView.p = feedProductPinView.n.centerX() - (b2 / 2);
            feedProductPinView.q = feedProductPinView.n.bottom - (((v2r.b * 2) + v2r.c) / 2);
        } else if (i16 == 3) {
            Rect rect7 = feedProductPinView.n;
            feedProductPinView.p = (((v2r.b * 2) + v2r.c) / 2) + (rect7.left - b2);
            feedProductPinView.q = rect7.centerY() - (measuredHeight2 / 2);
        } else {
            if (i16 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Rect rect8 = feedProductPinView.n;
            feedProductPinView.p = rect8.right - (((v2r.b * 2) + v2r.c) / 2);
            feedProductPinView.q = rect8.centerY() - (measuredHeight2 / 2);
        }
        feedProductPinView.p = b(feedProductPinView.p, i14, i12);
        feedProductPinView.q = b(feedProductPinView.q, i15, i13);
        feedProductPinView.setX(feedProductPinView.p);
        feedProductPinView.setY(feedProductPinView.q);
        u2r u2rVar = feedProductPinView.e;
        int i17 = v2r.c;
        int i18 = v2r.b * 2;
        int i19 = (b2 - i17) - i18;
        int i20 = (measuredHeight2 - i17) - i18;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        int i21 = iArr[pinGravity.ordinal()];
        if (i21 == 1) {
            ref$IntRef.element = (feedProductPinView.n.centerX() - feedProductPinView.p) - ((i18 + i17) / 2);
            ref$IntRef2.element = i20;
        } else if (i21 == 2) {
            ref$IntRef.element = (feedProductPinView.n.centerX() - feedProductPinView.p) - ((i18 + i17) / 2);
            ref$IntRef2.element = 0;
        } else if (i21 == 3) {
            ref$IntRef.element = i19;
            ref$IntRef2.element = (feedProductPinView.n.centerY() - feedProductPinView.q) - ((i18 + i17) / 2);
        } else {
            if (i21 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ref$IntRef.element = 0;
            ref$IntRef2.element = (feedProductPinView.n.centerY() - feedProductPinView.q) - ((i18 + i17) / 2);
        }
        ref$IntRef.element = b(ref$IntRef.element, 0, i19);
        ref$IntRef2.element = b(ref$IntRef2.element, 0, i20);
        if (!feedProductPinView.isLaidOut() || feedProductPinView.isLayoutRequested()) {
            feedProductPinView.addOnLayoutChangeListener(new w2r(feedProductPinView, ref$IntRef, ref$IntRef2));
        } else {
            u2rVar.setX(ref$IntRef.element);
            u2rVar.setY(ref$IntRef2.element);
        }
    }

    private final int getOverlaySecondaryColor() {
        return ((Number) this.f.getValue()).intValue();
    }

    public final boolean getAllowAutoChangeGravity() {
        return this.m;
    }

    public final String getCloseButtonContentDescription() {
        return this.j;
    }

    public final int getCustomMaxWidth() {
        return this.l;
    }

    public final CharSequence getDescription() {
        return this.h;
    }

    public final Rect getDisplayRect() {
        return this.o;
    }

    public final PinGravity getGravity() {
        return this.k;
    }

    public final gzs<s3q0> getOnPinClickHandler() {
        return this.s;
    }

    public final gzs<s3q0> getOnPinCloseHandler() {
        return this.t;
    }

    public final int getPositionX() {
        return this.p;
    }

    public final int getPositionY() {
        return this.q;
    }

    public final Rect getRect() {
        return this.n;
    }

    public final CharSequence getTitle() {
        return this.g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.l, Integer.MIN_VALUE), i2);
    }

    public final void setOnPinClickHandler(gzs<s3q0> gzsVar) {
        this.s = gzsVar;
    }

    public final void setOnPinCloseHandler(gzs<s3q0> gzsVar) {
        this.t = gzsVar;
    }

    public final void setupBlurContent(VkBlurContentView vkBlurContentView) {
    }
}
