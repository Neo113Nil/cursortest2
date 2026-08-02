package com.vk.core.view.components.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.tabs.c;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.avj;
import xsna.e3m;
import xsna.ey2;
import xsna.fox;
import xsna.gpo0;
import xsna.nxv0;
import xsna.qko0;
import xsna.sex0;
import xsna.swe0;
import xsna.too0;

/* compiled from: VkTabContent.kt */
/* loaded from: classes17.dex */
public abstract class d extends ConstraintLayout implements fox, too0 {
    public static final /* synthetic */ int G = 0;
    public int A;
    public Tab$Mode B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final Paint F;
    public final TextView t;
    public final TextView u;
    public final ImageView v;
    public final ImageView w;
    public final VkCounter x;
    public final VkBadge y;
    public int z;

    /* compiled from: VkTabContent.kt */
    public static final class a {
        public static nxv0 a(Context context) {
            int i = d.G;
            return new nxv0(context);
        }
    }

    /* compiled from: VkTabContent.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Tab$Mode.values().length];
            try {
                iArr[Tab$Mode.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab$Mode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tab$Mode.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(Context context) {
        super(context, null, 0);
        this.z = -1;
        this.A = -1;
        this.B = Tab$Mode.Secondary;
        this.C = true;
        this.D = true;
        this.E = true;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.F = paint;
        LayoutInflater.from(context).inflate(R.layout.ds_internal_tab_content, (ViewGroup) this, true);
        setMode(this.B);
        setClipToPadding(false);
        setClipToOutline(true);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        this.t = (TextView) findViewById(R.id.title);
        this.u = (TextView) findViewById(R.id.title_with_emojis);
        this.v = (ImageView) findViewById(R.id.left_icon);
        this.w = (ImageView) findViewById(R.id.right_icon);
        this.x = (VkCounter) findViewById(R.id.counter);
        this.y = (VkBadge) findViewById(R.id.badge);
        P4();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.F, 0, 0);
        int integer = obtainStyledAttributes.getInteger(6, -1);
        int integer2 = obtainStyledAttributes.getInteger(0, 0);
        String string = obtainStyledAttributes.getString(7);
        string = string == null ? "" : string;
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        setLeftIconColorful(obtainStyledAttributes.getBoolean(3, true));
        setRightIconColorful(obtainStyledAttributes.getBoolean(5, true));
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
        setText(string);
        setIndicator(integer != 0 ? integer != 1 ? c.C0866c.a : new c.b(integer2) : c.a.a);
        V4(this, Integer.valueOf(resourceId), 6);
        X4(this, Integer.valueOf(resourceId2));
        setCounterAppearance((VkCounter.CounterAppearance) VkCounter.CounterAppearance.Appearance.h().get(resourceId3));
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void U4(d dVar, Drawable drawable, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        dVar.T4(drawable, z, Integer.MIN_VALUE);
    }

    public static /* synthetic */ void V4(d dVar, Integer num, int i) {
        dVar.Q4(Integer.MIN_VALUE, (i & 2) != 0, num);
    }

    public static void X4(d dVar, Integer num) {
        ImageView imageView = dVar.w;
        int a2 = e3m.a(R.dimen.ds_tab_icon_size, dVar.getContext());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = a2;
        layoutParams.height = a2;
        imageView.setLayoutParams(layoutParams);
        sex0.j(imageView, num);
        dVar.setRightIconColorful(true);
    }

    private final int getEndIconColor() {
        return gpo0.d(getEndIconColorRes(), this);
    }

    private final int getEndTextColor() {
        return gpo0.d(getEndTextColorRes(), this);
    }

    private final int getStartIconColor() {
        return gpo0.d(getStartIconColorRes(), this);
    }

    private final int getStartTextColor() {
        return gpo0.d(getStartTextColorRes(), this);
    }

    private final int getTransparentColor() {
        return gpo0.d(getTransparentColorRes(), this);
    }

    @Override // xsna.too0
    public void Ng() {
        if (!this.C) {
            gpo0.a(this.v);
        }
        if (!this.D) {
            gpo0.a(this.w);
        }
        P4();
    }

    public final void P4() {
        if (this.E) {
            this.t.setTextColor(getStartTextColor());
        }
        TextView textView = this.u;
        if (textView.getVisibility() == 0) {
            textView.setTextColor(getStartTextColor());
        }
        if (this.C) {
            this.v.setColorFilter(getStartIconColor());
        }
        if (this.D) {
            this.w.setColorFilter(getStartIconColor());
        }
        invalidate();
    }

    public final void Q4(int i, boolean z, Integer num) {
        if (i == Integer.MIN_VALUE) {
            i = e3m.a(R.dimen.ds_tab_icon_size, getContext());
        }
        ImageView imageView = this.v;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        if (!z) {
            gpo0.a(imageView);
        }
        sex0.j(imageView, num);
        setLeftIconColorful(z);
    }

    public final void T4(Drawable drawable, boolean z, int i) {
        if (i == Integer.MIN_VALUE) {
            i = e3m.a(R.dimen.ds_tab_icon_size, getContext());
        }
        ImageView imageView = this.v;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        if (!z) {
            gpo0.a(imageView);
        }
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(0);
        setLeftIconColorful(z);
    }

    public final void Y4(CharSequence charSequence, List<qko0> list) {
        TextView textView = this.t;
        if (list == null) {
            ey2.i(textView, String.valueOf(charSequence));
            return;
        }
        String valueOf = String.valueOf(charSequence);
        int startTextColor = getStartTextColor();
        if (list.isEmpty()) {
            ey2.i(textView, valueOf);
            textView.setTextColor(startTextColor);
        } else {
            SpannableString spannableString = new SpannableString(valueOf);
            spannableString.setSpan(new ForegroundColorSpan(getTransparentColor()), 0, valueOf.length(), 33);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                long j = ((qko0) it.next()).a;
                int g = swe0.g((int) (j >> 32), 0, valueOf.length());
                int g2 = swe0.g((int) (j & 4294967295L), 0, valueOf.length());
                if (g < g2) {
                    spannableString.setSpan(new ForegroundColorSpan(startTextColor), g, g2, 33);
                }
            }
            ey2.i(textView, spannableString);
        }
        TextView textView2 = this.u;
        textView2.setVisibility(0);
        ey2.i(textView2, String.valueOf(charSequence));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int endIconColor;
        if (view.equals(this.u)) {
            return super.drawChild(canvas, view, j);
        }
        if (this.z >= this.A) {
            return super.drawChild(canvas, view, j);
        }
        if (view.equals(this.t) && this.E) {
            endIconColor = getEndTextColor();
        } else if (view.equals(this.v) && this.C) {
            endIconColor = getEndIconColor();
        } else {
            if (!view.equals(this.w) || !this.D) {
                return super.drawChild(canvas, view, j);
            }
            endIconColor = getEndIconColor();
        }
        Paint paint = this.F;
        paint.setColor(endIconColor);
        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), null);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.drawRect(this.z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.A, getHeight(), paint);
        canvas.restore();
        return drawChild;
    }

    public final VkBadge getBadge() {
        return this.y;
    }

    public final VkCounter getCounter() {
        return this.x;
    }

    public abstract int getEndIconColorRes();

    public abstract int getEndTextColorRes();

    public final ImageView getLeftIcon() {
        return this.v;
    }

    public final boolean getLeftIconColorful() {
        return this.C;
    }

    public final ImageView getRightIcon() {
        return this.w;
    }

    public final boolean getRightIconColorful() {
        return this.D;
    }

    public abstract int getStartIconColorRes();

    public abstract int getStartTextColorRes();

    public final TextView getTitleOnlyText() {
        return this.t;
    }

    public final boolean getTitleTextColorful() {
        return this.E;
    }

    public final TextView getTitleWithEmojis() {
        return this.u;
    }

    public abstract int getTransparentColorRes();

    @Override // xsna.fox
    public void m0(int i, int i2) {
        if (this.z == i && this.A == i2) {
            return;
        }
        this.z = i;
        this.A = i2;
        P4();
    }

    public final void setBadgeAppearance(VkBadge.Appearance appearance) {
        this.y.setAppearance(appearance);
    }

    public final void setCounterAppearance(VkCounter.CounterAppearance counterAppearance) {
        this.x.setAppearance(counterAppearance);
    }

    public final void setCounterMode(VkCounter.Mode mode) {
        this.x.setMode(mode);
    }

    public abstract void setEndIconColorRes(int i);

    public abstract void setEndTextColorRes(int i);

    public final void setIconSelectedColorAttr(int i) {
        int startIconColorRes = getStartIconColorRes();
        int endIconColorRes = getEndIconColorRes();
        setStartIconColorRes(startIconColorRes);
        setEndIconColorRes(endIconColorRes);
        setRightIconColorful(true);
        setLeftIconColorful(true);
    }

    public final void setIconUnselectedColorAttr(int i) {
        int endIconColorRes = getEndIconColorRes();
        setStartIconColorRes(i);
        setEndIconColorRes(endIconColorRes);
        setRightIconColorful(true);
        setLeftIconColorful(true);
    }

    public final void setIndicator(c cVar) {
        boolean equals = cVar.equals(c.a.a);
        VkBadge vkBadge = this.y;
        VkCounter vkCounter = this.x;
        if (equals) {
            vkCounter.setVisibility(8);
            vkBadge.setVisibility(0);
            return;
        }
        if (!(cVar instanceof c.b)) {
            if (!cVar.equals(c.C0866c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            vkCounter.setVisibility(8);
            vkBadge.setVisibility(8);
            return;
        }
        if (vkCounter.getVisibility() == 0) {
            vkCounter.setCounterWithAnimation(((c.b) cVar).a);
        } else {
            vkCounter.setCounterWithoutAnimation(((c.b) cVar).a);
        }
        vkCounter.setVisibility(0);
        vkBadge.setVisibility(8);
    }

    public final void setLeftIconColorful(boolean z) {
        this.C = z;
        P4();
    }

    public final void setLeftIconTint(int i) {
        gpo0.f(this.v, Integer.valueOf(i));
        setLeftIconColorful(false);
    }

    public final void setMode(Tab$Mode tab$Mode) {
        int a2;
        int a3;
        int a4;
        float f;
        int i;
        int i2;
        int i3;
        float f2;
        this.B = tab$Mode;
        getContext();
        int i4 = b.$EnumSwitchMapping$0[tab$Mode.ordinal()];
        if (i4 == 1) {
            a2 = e3m.a(R.dimen.ds_tab_default_min_height, getContext());
            a3 = e3m.a(R.dimen.ds_tab_default_horizontal_padding, getContext());
            a4 = e3m.a(R.dimen.ds_tab_default_vertical_padding, getContext());
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = e3m.a(R.dimen.ds_tab_accent_min_height, getContext());
                a3 = e3m.a(R.dimen.ds_tab_accent_horizontal_padding, getContext());
                i2 = e3m.a(R.dimen.ds_tab_accent_vertical_padding, getContext());
                f2 = getContext().getResources().getDimension(R.dimen.ds_tab_accent_corner_radius);
                i3 = R.attr.vk_ui_text_accent_themed;
                i = R.attr.vk_ui_icon_accent_themed;
                setMinWidth(e3m.a(R.dimen.ds_tab_min_width, getContext()));
                setMinHeight(a2);
                setPaddingRelative(a3, i2, a3, i2);
                setOutlineProvider(new avj(f2));
                setStartTextColorRes(R.attr.vk_ui_text_secondary);
                setEndTextColorRes(i3);
                setStartIconColorRes(R.attr.vk_ui_text_secondary);
                setEndIconColorRes(i);
            }
            a2 = e3m.a(R.dimen.ds_tab_secondary_min_height, getContext());
            a3 = e3m.a(R.dimen.ds_tab_secondary_horizontal_padding, getContext());
            a4 = e3m.a(R.dimen.ds_tab_secondary_vertical_padding, getContext());
            f = getContext().getResources().getDimension(R.dimen.ds_tab_secondary_corner_radius);
        }
        float f3 = f;
        i = R.attr.vk_ui_icon_primary;
        i2 = a4;
        i3 = R.attr.vk_ui_text_primary;
        f2 = f3;
        setMinWidth(e3m.a(R.dimen.ds_tab_min_width, getContext()));
        setMinHeight(a2);
        setPaddingRelative(a3, i2, a3, i2);
        setOutlineProvider(new avj(f2));
        setStartTextColorRes(R.attr.vk_ui_text_secondary);
        setEndTextColorRes(i3);
        setStartIconColorRes(R.attr.vk_ui_text_secondary);
        setEndIconColorRes(i);
    }

    public final void setRightIconColorful(boolean z) {
        this.D = z;
        P4();
    }

    public final void setRightIconTint(int i) {
        gpo0.f(this.w, Integer.valueOf(i));
        setRightIconColorful(false);
    }

    public abstract void setStartIconColorRes(int i);

    public abstract void setStartTextColorRes(int i);

    public final void setText(CharSequence charSequence) {
        Y4(charSequence, null);
    }

    public final void setTextSelectedColorAttr(int i) {
        setStartTextColorRes(getStartTextColorRes());
        setEndTextColorRes(i);
        setTitleTextColorful(true);
    }

    public final void setTextTint(int i) {
        gpo0.i(this.t, i);
        setTitleTextColorful(false);
    }

    public final void setTextUnselectedColorAttr(int i) {
        int endTextColorRes = getEndTextColorRes();
        setStartTextColorRes(i);
        setEndTextColorRes(endTextColorRes);
        setTitleTextColorful(true);
    }

    public final void setTitleTextColorful(boolean z) {
        this.E = z;
        P4();
    }

    public final void setText(int i) {
        TextView textView = this.t;
        textView.setText(i);
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ? 4 : 0);
    }

    public final void setLeftIconTint(ColorStateList colorStateList) {
        ImageView imageView = this.v;
        if (colorStateList == null) {
            gpo0.a(imageView);
        }
        imageView.setImageTintList(colorStateList);
        setLeftIconColorful(false);
    }

    public final void setRightIconTint(ColorStateList colorStateList) {
        ImageView imageView = this.w;
        if (colorStateList == null) {
            gpo0.a(imageView);
        }
        imageView.setImageTintList(colorStateList);
        setRightIconColorful(false);
    }

    public final void setTextTint(ColorStateList colorStateList) {
        this.t.setTextColor(colorStateList);
        setTitleTextColorful(false);
    }
}
