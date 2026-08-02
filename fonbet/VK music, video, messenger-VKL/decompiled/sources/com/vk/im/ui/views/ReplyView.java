package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.widget.AutoAdjustLinearLayout;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.StencilLayout;
import com.vk.superapp.ui.FixTextView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.bpn0;
import xsna.bwt0;
import xsna.e3m;
import xsna.ek30;
import xsna.fxj0;
import xsna.hk70;
import xsna.iah0;
import xsna.jwx;
import xsna.ktc0;
import xsna.pkd0;
import xsna.qcy;
import xsna.s3q0;
import xsna.too0;
import xsna.tz30;
import xsna.ysx0;
import xsna.ztx0;

/* compiled from: ReplyView.kt */
/* loaded from: classes2.dex */
public final class ReplyView extends AutoAdjustLinearLayout implements too0 {
    public static final /* synthetic */ int k = 0;
    public ImageView b;
    public StencilLayout c;
    public RestrictionFrescoImageViewLegacy d;
    public FixTextView e;
    public FixTextView f;
    public final a g;
    public final bpn0 h;
    public final bpn0 i;
    public final bpn0 j;

    public ReplyView(Context context) {
        super(context);
        this.g = new a();
        this.h = new bpn0(new pkd0(3));
        this.i = new bpn0(new hk70(this, 14));
        this.j = new bpn0(new com.vk.movika.sdk.base.model.props.a(27));
        b(context, null, 0, 0);
    }

    public static void a(ReplyView replyView, View view, Integer num, Integer num2, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (num != null) {
            marginLayoutParams.width = num.intValue();
        }
        if (num2 != null) {
            marginLayoutParams.height = num2.intValue();
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private final jwx getBlurPostProcessor() {
        return (jwx) this.j.getValue();
    }

    private final tz30 getContentFormatter() {
        return (tz30) this.i.getValue();
    }

    private final DisplayNameFormatter getNameFormatter() {
        return (DisplayNameFormatter) this.h.getValue();
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        setLineColor(typedArray.getColor(3, -16777216));
        float f = 2;
        setLineSize(typedArray.getDimensionPixelSize(5, iah0.a(f)));
        setLineCornerRadius(typedArray.getDimensionPixelSize(4, iah0.a(f)));
        int a2 = e3m.a(R.dimen.reply_preview_size, getContext());
        setIconWidth(typedArray.getDimensionPixelSize(2, a2));
        setIconHeight(typedArray.getDimensionPixelSize(1, a2));
        setIconCornerRadius(typedArray.getDimensionPixelSize(0, iah0.a(4)));
        setIconLocalImage(null);
        setIconRemoteImage(null);
        setTitleText(typedArray.getString(8));
        setTitleTextAppearance(typedArray.getResourceId(9, 0));
        setSubtitleText(typedArray.getString(6));
        setSubtitleTextAppearance(typedArray.getResourceId(7, 0));
    }

    @Override // xsna.too0
    public final void Ng() {
        setLineColor(e3m.f(R.attr.vk_legacy_im_reply_separator, getContext()));
        FixTextView fixTextView = this.e;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setTextColor(e3m.f(R.attr.vk_legacy_im_text_name, getContext()));
        FixTextView fixTextView2 = this.f;
        (fixTextView2 != null ? fixTextView2 : null).setTextColor(e3m.f(R.attr.vk_legacy_text_primary, getContext()));
    }

    public final void b(Context context, AttributeSet attributeSet, int i, int i2) {
        LayoutInflater.from(context).inflate(R.layout.vkim_reply_view, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.line);
        this.c = (StencilLayout) findViewById(R.id.icon_container);
        this.d = (RestrictionFrescoImageViewLegacy) findViewById(R.id.icon);
        this.e = (FixTextView) findViewById(R.id.title);
        this.f = (FixTextView) findViewById(R.id.subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.z, i, i2);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        if (restrictionFrescoImageViewLegacy == null) {
            restrictionFrescoImageViewLegacy = null;
        }
        restrictionFrescoImageViewLegacy.setPlaceholder(new ek30(context, 0));
        ImageView imageView = this.b;
        (imageView != null ? imageView : null).setImageDrawable(this.g);
    }

    public final void c(Peer peer, ProfilesSimpleInfo profilesSimpleInfo) {
        String b = getNameFormatter().b(peer, profilesSimpleInfo);
        String string = getContext().getString(R.string.vkim_msg_content_expired);
        setTitleText(b);
        setSubtitleText(string);
    }

    public final void d(com.vk.im.engine.models.messages.a aVar, PhotoRestriction photoRestriction, ProfilesSimpleInfo profilesSimpleInfo, String str, StencilLayout.a aVar2, boolean z) {
        Object obj;
        s3q0 s3q0Var;
        if (z) {
            c(aVar.getFrom(), profilesSimpleInfo);
            return;
        }
        String b = getNameFormatter().b(aVar.getFrom(), profilesSimpleInfo);
        CharSequence a2 = getContentFormatter().a(aVar);
        Iterator<T> it = aVar.K0().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Attach) obj) instanceof ztx0) {
                    break;
                }
            }
        }
        ztx0 ztx0Var = obj instanceof ztx0 ? (ztx0) obj : null;
        jwx blurPostProcessor = ((ztx0Var instanceof ysx0) && ((ysx0) ztx0Var).e()) ? getBlurPostProcessor() : null;
        setTitleText(b);
        setSubtitleText(a2);
        setRestrictions(photoRestriction);
        setIconLocalImage(ztx0Var != null ? ztx0Var.d() : null);
        setIconRemoteImage(ztx0Var != null ? ztx0Var.f() : null);
        setIconPostProcessor(blurPostProcessor);
        if (str != null) {
            StencilLayout stencilLayout = this.c;
            if (stencilLayout == null) {
                stencilLayout = null;
            }
            stencilLayout.setStencil(str);
            if (aVar2 != null) {
                StencilLayout stencilLayout2 = this.c;
                if (stencilLayout2 == null) {
                    stencilLayout2 = null;
                }
                stencilLayout2.b(aVar2);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var != null) {
                return;
            }
        }
        StencilLayout stencilLayout3 = this.c;
        if (stencilLayout3 == null) {
            stencilLayout3 = null;
        }
        stencilLayout3.b = null;
        stencilLayout3.requestLayout();
    }

    public final void e() {
        StencilLayout stencilLayout = this.c;
        if (stencilLayout == null) {
            stencilLayout = null;
        }
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy2 = restrictionFrescoImageViewLegacy != null ? restrictionFrescoImageViewLegacy : null;
        List<? extends fxj0> list = restrictionFrescoImageViewLegacy2.K;
        int i = 0;
        boolean z = true;
        boolean z2 = list == null || list.isEmpty();
        List<? extends fxj0> list2 = restrictionFrescoImageViewLegacy2.L;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        if (z2 && z) {
            i = 8;
        }
        stencilLayout.setVisibility(i);
    }

    public final void setIconCornerRadius(int i) {
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        if (restrictionFrescoImageViewLegacy == null) {
            restrictionFrescoImageViewLegacy = null;
        }
        restrictionFrescoImageViewLegacy.setCornerRadius(i);
    }

    public final void setIconHeight(int i) {
        StencilLayout stencilLayout = this.c;
        if (stencilLayout == null) {
            stencilLayout = null;
        }
        a(this, stencilLayout, null, Integer.valueOf(i), 61);
    }

    public final void setIconLocalImage(ImageList imageList) {
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        if (restrictionFrescoImageViewLegacy == null) {
            restrictionFrescoImageViewLegacy = null;
        }
        restrictionFrescoImageViewLegacy.setLocalImage(imageList);
        e();
    }

    public final void setIconPostProcessor(ktc0 ktc0Var) {
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        if (restrictionFrescoImageViewLegacy == null) {
            restrictionFrescoImageViewLegacy = null;
        }
        restrictionFrescoImageViewLegacy.setPostprocessor(ktc0Var);
    }

    public final void setIconRemoteImage(ImageList imageList) {
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        if (restrictionFrescoImageViewLegacy == null) {
            restrictionFrescoImageViewLegacy = null;
        }
        restrictionFrescoImageViewLegacy.setRemoteImage(imageList);
        e();
    }

    public final void setIconWidth(int i) {
        StencilLayout stencilLayout = this.c;
        if (stencilLayout == null) {
            stencilLayout = null;
        }
        a(this, stencilLayout, Integer.valueOf(i), null, 62);
    }

    public final void setLineColor(int i) {
        a aVar = this.g;
        aVar.a.setColor(i);
        aVar.invalidateSelf();
    }

    public final void setLineCornerRadius(int i) {
        a aVar = this.g;
        aVar.c = i;
        aVar.invalidateSelf();
    }

    public final void setLineSize(int i) {
        ImageView imageView = this.b;
        if (imageView == null) {
            imageView = null;
        }
        a(this, imageView, Integer.valueOf(i), null, 62);
    }

    public final void setRestrictions(PhotoRestriction photoRestriction) {
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        if (restrictionFrescoImageViewLegacy == null) {
            restrictionFrescoImageViewLegacy = null;
        }
        restrictionFrescoImageViewLegacy.setRestrictions(photoRestriction);
    }

    public final void setSubtitleText(CharSequence charSequence) {
        FixTextView fixTextView = this.f;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setText(charSequence);
    }

    public final void setSubtitleTextAppearance(int i) {
        FixTextView fixTextView = this.f;
        if (fixTextView == null) {
            fixTextView = null;
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        fixTextView.setTextAppearance(i);
    }

    public final void setSubtitleTextColor(int i) {
        FixTextView fixTextView = this.f;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setTextColor(i);
    }

    public final void setTitleText(CharSequence charSequence) {
        FixTextView fixTextView = this.e;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setText(charSequence);
    }

    public final void setTitleTextAppearance(int i) {
        FixTextView fixTextView = this.e;
        if (fixTextView == null) {
            fixTextView = null;
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        fixTextView.setTextAppearance(i);
    }

    public final void setTitleTextColor(int i) {
        FixTextView fixTextView = this.e;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setTextColor(i);
    }

    public final void setSubtitleText(int i) {
        FixTextView fixTextView = this.f;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setText(i);
    }

    public final void setTitleText(int i) {
        FixTextView fixTextView = this.e;
        if (fixTextView == null) {
            fixTextView = null;
        }
        fixTextView.setText(i);
    }

    public ReplyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new a();
        this.h = new bpn0(new pkd0(3));
        this.i = new bpn0(new hk70(this, 14));
        this.j = new bpn0(new com.vk.movika.sdk.base.model.props.a(27));
        b(context, attributeSet, 0, 0);
    }

    public ReplyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new a();
        this.h = new bpn0(new pkd0(3));
        this.i = new bpn0(new hk70(this, 14));
        this.j = new bpn0(new com.vk.movika.sdk.base.model.props.a(27));
        b(context, attributeSet, i, 0);
    }

    /* compiled from: ReplyView.kt */
    public static final class a extends Drawable {
        public final Paint a = new Paint(1);
        public final RectF b = new RectF();
        public int c;

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            RectF rectF = this.b;
            rectF.set(bounds);
            int i = this.c;
            Paint paint = this.a;
            if (i == 0) {
                canvas.drawRect(rectF, paint);
            } else {
                canvas.drawRoundRect(rectF, i, i, paint);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public ReplyView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = new a();
        this.h = new bpn0(new pkd0(3));
        this.i = new bpn0(new hk70(this, 14));
        this.j = new bpn0(new com.vk.movika.sdk.base.model.props.a(27));
        b(context, attributeSet, i, i2);
    }
}
