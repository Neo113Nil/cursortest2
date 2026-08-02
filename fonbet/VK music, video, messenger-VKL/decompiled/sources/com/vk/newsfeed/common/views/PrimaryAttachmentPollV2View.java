package com.vk.newsfeed.common.views;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.polls.PollOption;
import com.vk.feed.design.view.newsfeed.adaptive_discrete_text.VkFeedAdaptiveDiscreteTextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.R$styleable;
import com.vk.newsfeed.common.views.PrimaryAttachmentPollV2View;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import defpackage.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bwt0;
import xsna.c5g;
import xsna.c7d0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e43;
import xsna.e6o;
import xsna.iah0;
import xsna.itj0;
import xsna.jjc;
import xsna.lo3;
import xsna.qcy;
import xsna.rv2;
import xsna.smb0;
import xsna.tjo;
import xsna.tvb0;
import xsna.zrp;

/* compiled from: PrimaryAttachmentPollV2View.kt */
/* loaded from: classes4.dex */
public final class PrimaryAttachmentPollV2View extends ViewGroup implements View.OnClickListener {
    public static final /* synthetic */ int J = 0;
    public b A;
    public rv2 B;
    public final lo3 C;
    public final c7d0 D;
    public final int E;
    public Drawable F;
    public boolean G;
    public int H;
    public final List<com.vk.typography.a> I;
    public final ImageView b;
    public final FadingStackLayout c;
    public final VKImageView d;
    public final VkButton e;
    public final TextView f;
    public final VkButton g;
    public final ViewGroup h;
    public final TextView i;
    public final VkUserStack j;
    public final ProgressBar k;
    public final VkFeedAdaptiveDiscreteTextView l;
    public final View m;
    public final View n;
    public AnimatorSet o;
    public e6o p;
    public e6o q;
    public tvb0<smb0> r;
    public Mode s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public View.OnClickListener y;
    public View.OnClickListener z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrimaryAttachmentPollV2View.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode AT_MOST_SQUARE;
        public static final Mode SQUARE;
        public static final Mode UNSPECIFIED;

        static {
            Mode mode = new Mode("AT_MOST_SQUARE", 0);
            AT_MOST_SQUARE = mode;
            Mode mode2 = new Mode("SQUARE", 1);
            SQUARE = mode2;
            Mode mode3 = new Mode("UNSPECIFIED", 2);
            UNSPECIFIED = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* compiled from: PrimaryAttachmentPollV2View.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
        public int a;
    }

    /* compiled from: PrimaryAttachmentPollV2View.kt */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: PrimaryAttachmentPollV2View.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [xsna.c7d0] */
    public PrimaryAttachmentPollV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.s = Mode.SQUARE;
        this.t = true;
        this.u = 8;
        this.v = 8;
        this.C = new lo3(this, 3);
        this.D = new View.OnLongClickListener() { // from class: xsna.c7d0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                PollOption answerRaw;
                rv2 rv2Var;
                int i = PrimaryAttachmentPollV2View.J;
                if (!(view instanceof smb0) || (answerRaw = ((smb0) view).getAnswerRaw()) == null || (rv2Var = PrimaryAttachmentPollV2View.this.B) == null) {
                    return false;
                }
                return rv2Var.a(answerRaw);
            }
        };
        this.E = cn70.b(90);
        FontFamily fontFamily = FontFamily.DISPLAY_DEMIBOLD;
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        List<com.vk.typography.a> l = e43.l(a.C1933a.a(context, fontFamily, 21.0f, textSizeUnit), a.C1933a.a(context, fontFamily, 18.0f, textSizeUnit), a.C1933a.a(context, fontFamily, 16.0f, textSizeUnit));
        this.I = l;
        LayoutInflater.from(context).inflate(R.layout.primary_poll_view_2, this);
        this.d = (VKImageView) findViewById(R.id.poll_background);
        this.b = (ImageView) findViewById(R.id.poll_actions);
        VkButton vkButton = (VkButton) findViewById(R.id.poll_show_results);
        this.e = vkButton;
        this.f = (TextView) findViewById(R.id.poll_info);
        this.g = (VkButton) findViewById(R.id.poll_multiple_vote_button);
        this.h = (ViewGroup) findViewById(R.id.poll_results);
        this.i = (TextView) findViewById(R.id.votes_count);
        this.k = (ProgressBar) findViewById(R.id.multiple_progress);
        VkFeedAdaptiveDiscreteTextView vkFeedAdaptiveDiscreteTextView = (VkFeedAdaptiveDiscreteTextView) findViewById(R.id.poll_title);
        this.l = vkFeedAdaptiveDiscreteTextView;
        vkFeedAdaptiveDiscreteTextView.setFontStyles(l);
        this.m = findViewById(R.id.poll_info);
        this.n = findViewById(R.id.poll_footer_container);
        this.j = (VkUserStack) findViewById(R.id.photo_strip_view);
        FadingStackLayout fadingStackLayout = (FadingStackLayout) findViewById(R.id.options_container);
        this.c = fadingStackLayout;
        fadingStackLayout.setCutView(vkButton);
        setClipChildren(false);
        c();
    }

    public static int b(View view) {
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(View view, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int a2;
        int i8;
        if (view.getVisibility() != 8) {
            a aVar = (a) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight > i3) {
                measuredHeight = i3;
            }
            if (measuredHeight <= 0) {
                return;
            }
            int i9 = aVar.a;
            if (i9 == 0) {
                i9 = 8388659;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 7;
            if (absoluteGravity == 1) {
                i4 = ((i2 - measuredWidth) / 2) + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                i5 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            } else {
                if (absoluteGravity != 5) {
                    i6 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    i7 = i9 & 112;
                    if (i7 == 16) {
                        if (i7 == 48) {
                            i8 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        } else if (i7 != 80) {
                            i8 = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                        } else {
                            a2 = (i3 - measuredHeight) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        a2 = i + i8;
                    } else {
                        a2 = (j0.a(i3, i, measuredHeight, 2, i) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                    }
                    view.layout(i6, a2, measuredWidth + i6, measuredHeight + a2);
                }
                i4 = i2 - measuredWidth;
                i5 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            }
            i6 = i4 - i5;
            i7 = i9 & 112;
            if (i7 == 16) {
            }
            view.layout(i6, a2, measuredWidth + i6, measuredHeight + a2);
        }
    }

    private final void setHasCut(boolean z) {
        if (z != this.x) {
            this.x = z;
            bwt0.p0(this.e, z);
            setForeground((this.x || !this.G) ? this.F : null);
            setAnswersEnabled(this.t);
            setMultipleVoteButtonVisibility(this.u);
        }
    }

    public final smb0 a(int i) {
        View childAt = this.c.getChildAt(i);
        if (childAt instanceof smb0) {
            return (smb0) childAt;
        }
        return null;
    }

    public final void c() {
        View.OnClickListener onClickListener = this.p;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.g.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.p;
        if (onClickListener2 == null) {
            onClickListener2 = this;
        }
        this.b.setOnClickListener(onClickListener2);
        View.OnClickListener onClickListener3 = this.p;
        if (onClickListener3 == null) {
            onClickListener3 = this;
        }
        setOnClickListener(onClickListener3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void e(int i, int i2, int i3) {
        FadingStackLayout fadingStackLayout = this.c;
        fadingStackLayout.setMaxHeight(i3);
        fadingStackLayout.measure(i, View.MeasureSpec.makeMeasureSpec(i3, i2));
        setHasCut(fadingStackLayout.j);
        bwt0.p0(this.e, this.x);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-2, -2);
        aVar.a = 8388659;
        return aVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            a aVar = new a((a) layoutParams);
            aVar.a = 8388659;
            return aVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a aVar2 = new a((ViewGroup.MarginLayoutParams) layoutParams);
            aVar2.a = 8388659;
            return aVar2;
        }
        if (layoutParams != null) {
            a aVar3 = new a(layoutParams);
            aVar3.a = 8388659;
            return aVar3;
        }
        a aVar4 = new a(-2, -2);
        aVar4.a = 8388659;
        return aVar4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar;
        if (jjc.b()) {
            return;
        }
        if (view.equals(this.b)) {
            View.OnClickListener onClickListener = this.y;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        if (view.equals(this.g)) {
            View.OnClickListener onClickListener2 = this.z;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
                return;
            }
            return;
        }
        if (!view.equals(this) || (bVar = this.A) == null) {
            return;
        }
        bVar.a(this.x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        VKImageView vKImageView = this.d;
        if (vKImageView.getVisibility() != 8) {
            vKImageView.layout(0, 0, i7, i8);
        }
        VkFeedAdaptiveDiscreteTextView vkFeedAdaptiveDiscreteTextView = this.l;
        if (vkFeedAdaptiveDiscreteTextView.getVisibility() != 8) {
            ViewGroup.LayoutParams layoutParams = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i9 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i10 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i11 = i7 - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0);
            ViewGroup.LayoutParams layoutParams4 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            vkFeedAdaptiveDiscreteTextView.layout(i9, i10, i11, vkFeedAdaptiveDiscreteTextView.getMeasuredHeight() + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0));
            ViewGroup.LayoutParams layoutParams5 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            int measuredHeight = vkFeedAdaptiveDiscreteTextView.getMeasuredHeight() + (marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0);
            ViewGroup.LayoutParams layoutParams6 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            i5 = measuredHeight + (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0);
        } else {
            i5 = 0;
        }
        View view = this.m;
        if (view.getVisibility() != 8) {
            ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            int i12 = marginLayoutParams7 != null ? marginLayoutParams7.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
            int i13 = (marginLayoutParams8 != null ? marginLayoutParams8.topMargin : 0) + i5;
            ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
            int i14 = i7 - (marginLayoutParams9 != null ? marginLayoutParams9.rightMargin : 0);
            int measuredHeight2 = view.getMeasuredHeight() + i5;
            ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
            view.layout(i12, i13, i14, measuredHeight2 + (marginLayoutParams10 != null ? marginLayoutParams10.topMargin : 0));
            ViewGroup.LayoutParams layoutParams11 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
            int measuredHeight3 = view.getMeasuredHeight() + (marginLayoutParams11 != null ? marginLayoutParams11.topMargin : 0);
            ViewGroup.LayoutParams layoutParams12 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
            i5 += measuredHeight3 + (marginLayoutParams12 != null ? marginLayoutParams12.bottomMargin : 0);
        }
        View view2 = this.n;
        if (view2.getVisibility() != 8) {
            view2.layout(0, i8 - view2.getMeasuredHeight(), i7, i8);
        }
        if (this.x) {
            VkButton vkButton = this.e;
            ViewGroup.LayoutParams layoutParams13 = vkButton.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams13 : null;
            int i15 = marginLayoutParams13 != null ? marginLayoutParams13.leftMargin : 0;
            int measuredHeight4 = (i8 - view2.getMeasuredHeight()) - vkButton.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams14 = vkButton.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams14 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams14 : null;
            vkButton.layout(i15, measuredHeight4, i7 - (marginLayoutParams14 != null ? marginLayoutParams14.rightMargin : 0), i8 - view2.getMeasuredHeight());
            int measuredHeight5 = vkButton.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams15 = vkButton.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams15 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams15 : null;
            i6 = measuredHeight5 + (marginLayoutParams15 != null ? marginLayoutParams15.topMargin : 0);
        } else {
            i6 = 0;
        }
        int i16 = c.$EnumSwitchMapping$0[this.s.ordinal()];
        FadingStackLayout fadingStackLayout = this.c;
        d(fadingStackLayout, i5, i7, i16 == 1 ? Integer.MAX_VALUE : ((((fadingStackLayout.getMeasuredWidth() - i5) - view2.getMeasuredHeight()) - getPaddingTop()) - getPaddingBottom()) - i6);
        d(this.b, 0, i7, i8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i);
        boolean z = View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824;
        measureChild(this.b, i, i2);
        View view = this.m;
        measureChild(view, i, i2);
        int measuredHeight2 = this.E - view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight2 - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0), Integer.MIN_VALUE);
        VkFeedAdaptiveDiscreteTextView vkFeedAdaptiveDiscreteTextView = this.l;
        measureChild(vkFeedAdaptiveDiscreteTextView, i, makeMeasureSpec);
        View view2 = this.n;
        measureChild(view2, i, i2);
        if (bwt0.K(vkFeedAdaptiveDiscreteTextView)) {
            int measuredHeight3 = vkFeedAdaptiveDiscreteTextView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams2 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i5 = measuredHeight3 + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0);
            ViewGroup.LayoutParams layoutParams3 = vkFeedAdaptiveDiscreteTextView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i3 = i5 + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
        } else {
            i3 = 0;
        }
        if (bwt0.K(view)) {
            int measuredHeight4 = view.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            int i6 = measuredHeight4 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0);
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            i4 = i6 + (marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0);
        } else {
            i4 = 0;
        }
        int measuredHeight5 = view2.getMeasuredHeight() + i3 + i4 + getPaddingBottom() + getPaddingTop();
        if (z) {
            measuredHeight = View.MeasureSpec.getSize(i2);
            e(i, 1073741824, measuredHeight - measuredHeight5);
        } else {
            Mode mode = this.s;
            if (mode == Mode.SQUARE) {
                e(i, 1073741824, size - measuredHeight5);
            } else {
                Mode mode2 = Mode.AT_MOST_SQUARE;
                FadingStackLayout fadingStackLayout = this.c;
                if (mode == mode2) {
                    e(i, Integer.MIN_VALUE, size - measuredHeight5);
                    int b2 = b(fadingStackLayout) + measuredHeight5 + (this.x ? b(this.e) : 0);
                    if (b2 <= size) {
                        measuredHeight = b2;
                    }
                } else {
                    e(i, 0, Integer.MAX_VALUE);
                    measuredHeight = fadingStackLayout.getMeasuredHeight() + measuredHeight5;
                }
            }
            measuredHeight = size;
        }
        this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setActionsClickListener(View.OnClickListener onClickListener) {
        this.y = onClickListener;
    }

    public final void setActionsImageResourceId(int i) {
        this.b.setImageResource(i);
    }

    public final void setActionsImageTintList(ColorStateList colorStateList) {
        this.b.setImageTintList(colorStateList);
    }

    public final void setActionsVisible(boolean z) {
        bwt0.p0(this.b, z);
    }

    public final void setAnswersCount(int i) {
        this.H = i;
    }

    public final void setAnswersEnabled(boolean z) {
        this.t = z;
        int i = this.H;
        for (int i2 = 0; i2 < i; i2++) {
            smb0 a2 = a(i2);
            if (a2 != null) {
                boolean z2 = z && !this.x;
                boolean z3 = this.G;
                a2.setEnabled(z2);
                a2.setClickable(z2 && z3);
                a2.setLongClickable(z2);
                a2.setMultipleChoiceClickable(z2);
            }
        }
    }

    public final void setAnswersFadingColor(Integer num) {
        this.c.setFadingColor(num);
    }

    public final void setAnswersListener(rv2 rv2Var) {
        this.B = rv2Var;
    }

    public final void setAnswersViewCount(int i) {
        int i2;
        smb0 smb0Var;
        FadingStackLayout fadingStackLayout = this.c;
        int childCount = fadingStackLayout.getChildCount();
        if (c.$EnumSwitchMapping$0[this.s.ordinal()] != 1) {
            int b2 = cn70.b(12);
            int b3 = (((iah0.f().widthPixels - cn70.b(102)) - cn70.b(54)) / ((b2 / 2) + cn70.b(38))) + 1;
            if (i > b3) {
                i = b3;
            }
        }
        if (childCount < i) {
            int i3 = i - childCount;
            for (int i4 = 0; i4 < i3; i4++) {
                tvb0<smb0> tvb0Var = this.r;
                if (tvb0Var == null || (smb0Var = tvb0Var.c()) == null) {
                    smb0Var = new smb0(getContext());
                }
                fadingStackLayout.addView(smb0Var, -1, -2);
            }
            return;
        }
        if (childCount <= i || i > (i2 = childCount - 1)) {
            return;
        }
        while (true) {
            smb0 a2 = a(i2);
            if (a2 != null) {
                fadingStackLayout.removeView(a2);
                a2.setOnClickListener(null);
                a2.setOnLongClickListener(null);
                a2.setOnAnswerCheckedListener(null);
                tvb0<smb0> tvb0Var2 = this.r;
                if (tvb0Var2 != null) {
                    tvb0Var2.a(a2);
                }
            }
            if (i2 == i) {
                return;
            } else {
                i2--;
            }
        }
    }

    public final void setBackgroundBackgroundDrawable(Drawable drawable) {
        this.d.setBackground(drawable);
    }

    public final void setBackgroundDrawableFactory(tjo tjoVar) {
        this.d.setDrawableFactory(tjoVar);
    }

    public final void setBackgroundImageDrawable(Drawable drawable) {
        this.d.setImageDrawable(drawable);
    }

    public final void setBackgroundImageResource(int i) {
        this.d.setImageResource(i);
    }

    public final void setBackgroundUrl(String str) {
        this.d.load(str);
    }

    public final void setCanVote(boolean z) {
        this.G = z;
    }

    public final void setForegroundDrawable(Drawable drawable) {
        this.F = drawable;
        if (!this.x && this.G) {
            drawable = null;
        }
        setForeground(drawable);
    }

    public final void setFriendsPhotos(List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            itj0.d((String) it.next(), arrayList);
        }
        this.j.setAvatars(arrayList);
    }

    public final void setFriendsPhotosVisible(boolean z) {
        this.w = z;
        if (this.u == 0 && !this.x) {
            z = false;
        }
        bwt0.p0(this.j, z);
    }

    public final void setInfoText(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    public final void setInfoTextColor(int i) {
        this.f.setTextColor(i);
    }

    public final void setMode(Mode mode) {
        if (this.s != mode) {
            this.s = mode;
            requestLayout();
            invalidate();
        }
    }

    public final void setMultipleProgressColor(int i) {
        this.k.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    public final void setMultipleProgressVisibility(int i) {
        this.k.setVisibility(i);
    }

    public final void setMultipleVoteButtonClickListener(View.OnClickListener onClickListener) {
        this.z = onClickListener;
    }

    public final void setMultipleVoteButtonDynamicBackgroundResource(int i) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(i, this.g);
    }

    public final void setMultipleVoteButtonTextColor(int i) {
        this.g.setTextTint(ColorStateList.valueOf(i));
    }

    public final void setMultipleVoteButtonVisibility(int i) {
        this.u = i;
        if (this.x) {
            i = 8;
        }
        this.g.setVisibility(i);
        setVotesCountVisibility(this.v);
        setFriendsPhotosVisible(this.w);
    }

    public final void setPollViewClickListener(b bVar) {
        this.A = bVar;
    }

    public final void setPool(tvb0<smb0> tvb0Var) {
        this.r = tvb0Var;
    }

    public final void setShowResultButtonText(String str) {
        this.e.setText(str);
    }

    public final void setShowResultsButtonDynamicBackgroundResource(int i) {
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(i, this.e);
    }

    public final void setShowResultsButtonTextColor(int i) {
        this.e.setTextTint(ColorStateList.valueOf(i));
    }

    public final void setTitleViewText(String str) {
        this.l.setText(str);
    }

    public final void setTitleViewTextColor(int i) {
        this.l.setTextColor(i);
    }

    public final void setVotesCountText(CharSequence charSequence) {
        this.i.setText(charSequence);
    }

    public final void setVotesCountTextColor(int i) {
        this.i.setTextColor(i);
    }

    public final void setVotesCountVisibility(int i) {
        this.v = i;
        if (this.u == 0 && !this.x) {
            i = 8;
        }
        this.i.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.a = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h);
        aVar.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return aVar;
    }
}
