package com.vk.core.view.components.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.gpo0;
import xsna.hbh0;
import xsna.too0;
import xsna.x7g;
import xsna.x9;
import xsna.zrp;

/* compiled from: VkBadge.kt */
/* loaded from: classes17.dex */
public class VkBadge extends View implements too0 {
    public final int b;
    public Appearance c;
    public final Paint d;

    /* compiled from: VkBadge.kt */
    public interface Appearance {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkBadge.kt */
        public static final class Design implements Appearance {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Design[] $VALUES;
            public static final Design Accent;
            public static final Design AccentGreen;
            public static final Design AccentRed;
            public static final Design Contrast;
            public static final Design Neutral;

            static {
                Design design = new Design("Accent", 0);
                Accent = design;
                Design design2 = new Design("Neutral", 1);
                Neutral = design2;
                Design design3 = new Design("AccentGreen", 2);
                AccentGreen = design3;
                Design design4 = new Design("AccentRed", 3);
                AccentRed = design4;
                Design design5 = new Design("Contrast", 4);
                Contrast = design5;
                Design[] designArr = {design, design2, design3, design4, design5};
                $VALUES = designArr;
                $ENTRIES = new asp(designArr);
            }

            public Design() {
                throw null;
            }

            public static zrp<Design> h() {
                return $ENTRIES;
            }

            public static Design valueOf(String str) {
                return (Design) Enum.valueOf(Design.class, str);
            }

            public static Design[] values() {
                return (Design[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VkBadge.kt */
        public static final class LegoDesign implements Appearance {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ LegoDesign[] $VALUES;
            public static final LegoDesign High;
            public static final LegoDesign Low;
            public static final LegoDesign Medium;

            static {
                LegoDesign legoDesign = new LegoDesign("High", 0);
                High = legoDesign;
                LegoDesign legoDesign2 = new LegoDesign("Medium", 1);
                Medium = legoDesign2;
                LegoDesign legoDesign3 = new LegoDesign("Low", 2);
                Low = legoDesign3;
                LegoDesign[] legoDesignArr = {legoDesign, legoDesign2, legoDesign3};
                $VALUES = legoDesignArr;
                $ENTRIES = new asp(legoDesignArr);
            }

            public LegoDesign() {
                throw null;
            }

            public static LegoDesign valueOf(String str) {
                return (LegoDesign) Enum.valueOf(LegoDesign.class, str);
            }

            public static LegoDesign[] values() {
                return (LegoDesign[]) $VALUES.clone();
            }
        }

        /* compiled from: VkBadge.kt */
        public static final class a implements Appearance {
            public final x7g b;

            public a(x7g x7gVar) {
                this.b = x7gVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b.equals(((a) obj).b);
            }

            public final int hashCode() {
                return Integer.hashCode(this.b.a);
            }

            public final String toString() {
                return "Custom(color=" + this.b + ')';
            }
        }
    }

    /* compiled from: VkBadge.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Appearance.Design.values().length];
            try {
                iArr[Appearance.Design.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Appearance.Design.Neutral.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Appearance.Design.AccentGreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Appearance.Design.AccentRed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Appearance.Design.Contrast.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Appearance.LegoDesign.values().length];
            try {
                iArr2[Appearance.LegoDesign.High.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Appearance.LegoDesign.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Appearance.LegoDesign.Low.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public VkBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d.setColor(a());
    }

    public final int a() {
        getContext();
        Appearance appearance = this.c;
        Appearance.Design design = Appearance.Design.Accent;
        int i = R.attr.vk_ui_background_accent_themed;
        if (appearance != design) {
            if (appearance != Appearance.Design.Neutral) {
                if (appearance == Appearance.Design.AccentGreen) {
                    i = R.attr.vk_ui_accent_green;
                } else {
                    if (appearance != Appearance.Design.AccentRed) {
                        if (appearance == Appearance.Design.Contrast) {
                            i = R.attr.vk_ui_background_content;
                        } else if (appearance instanceof Appearance.LegoDesign) {
                            int i2 = a.$EnumSwitchMapping$1[((Appearance.LegoDesign) appearance).ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            }
                        } else if (!(appearance instanceof Appearance.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    i = R.attr.vk_ui_accent_red;
                }
            }
            i = R.attr.vk_ui_icon_secondary;
        }
        return gpo0.d(i, this);
    }

    public final Appearance getAppearance() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        int i = this.b;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredWidth, measuredHeight, i / 2.0f, i / 2.0f, this.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(Appearance appearance) {
        this.c = appearance;
        this.d.setColor(a());
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = hbh0.b(6, context);
        this.c = Appearance.Design.AccentRed;
        Paint c = x9.c(true);
        c.setColor(a());
        this.d = c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e, 0, 0);
        setAppearance((Appearance) Appearance.Design.h().get(obtainStyledAttributes.getInteger(0, 2)));
        obtainStyledAttributes.recycle();
    }
}
