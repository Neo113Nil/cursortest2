package com.vk.im.design.view.comments;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.am;
import xsna.amu0;
import xsna.asp;
import xsna.bmu0;
import xsna.bq2;
import xsna.dmu0;
import xsna.e3m;
import xsna.f4m;
import xsna.hbh0;
import xsna.iut0;
import xsna.j870;
import xsna.tlo0;
import xsna.tq;
import xsna.vep;
import xsna.x7g;
import xsna.x9l0;
import xsna.zrp;

/* compiled from: VkCommentView.kt */
/* loaded from: classes2.dex */
public final class VkCommentView extends ConstraintLayout {
    public static final /* synthetic */ int G = 0;
    public final VkImage A;
    public final VkText B;
    public final VkText C;
    public final VkText D;
    public final VkCommentAuthorLikedView E;
    public final bq2 F;
    public Size t;
    public final ViewGroup u;
    public final VkAvatar v;
    public final VkText w;
    public final VkExpandableText x;
    public final VkImage y;
    public final VkImage z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkCommentView.kt */
    public static final class Size {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Size[] $VALUES;
        public static final Size Medium;
        public static final Size Small;

        static {
            Size size = new Size("Medium", 0);
            Medium = size;
            Size size2 = new Size("Small", 1);
            Small = size2;
            Size[] sizeArr = {size, size2};
            $VALUES = sizeArr;
            $ENTRIES = new asp(sizeArr);
        }

        public Size() {
            throw null;
        }

        public static Size valueOf(String str) {
            return (Size) Enum.valueOf(Size.class, str);
        }

        public static Size[] values() {
            return (Size[]) $VALUES.clone();
        }
    }

    /* compiled from: VkCommentView.kt */
    public static final class a {
    }

    /* compiled from: VkCommentView.kt */
    public static final class b {

        /* compiled from: VkCommentView.kt */
        public static final class a {
        }
    }

    /* compiled from: VkCommentView.kt */
    public static final class c {

        /* compiled from: VkCommentView.kt */
        public static final class a {
        }
    }

    /* compiled from: VkCommentView.kt */
    public static final class d {
    }

    /* compiled from: VkCommentView.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Size.values().length];
            try {
                iArr[Size.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Size size = Size.Medium;
        this.t = size;
        this.F = new bq2(context);
        LayoutInflater.from(context).inflate(R.layout.pds_comment, (ViewGroup) this, true);
        this.u = (ViewGroup) findViewById(R.id.pds_comment_attach_container);
        VkAvatar vkAvatar = (VkAvatar) findViewById(R.id.pds_comment_avatar);
        this.v = vkAvatar;
        this.w = (VkText) findViewById(R.id.pds_comment_title);
        VkExpandableText vkExpandableText = (VkExpandableText) findViewById(R.id.pds_comment_text);
        this.x = vkExpandableText;
        this.y = (VkImage) findViewById(R.id.pds_comment_verified_mark);
        this.z = (VkImage) findViewById(R.id.pds_comment_status_icon);
        this.A = (VkImage) findViewById(R.id.pds_comment_donut_icon);
        VkText vkText = (VkText) findViewById(R.id.pds_comment_author_badge);
        this.B = vkText;
        this.C = (VkText) findViewById(R.id.pds_comment_time);
        this.D = (VkText) findViewById(R.id.pds_comment_reply);
        this.E = (VkCommentAuthorLikedView) findViewById(R.id.pds_comment_author_liked_container);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        setAvatarSize(obtainStyledAttributes.getInt(0, 0) == 1 ? Size.Small : size);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            vkAvatar.setPlaceholderImage(resourceId);
        }
        P4();
        vkExpandableText.setMaxCollapsedLines(10);
        vkExpandableText.setExpandButton(new VkExpandableText.a(tq.h(tlo0.Companion, R.string.pds_comment_expand), new x7g(R.attr.vk_ui_text_secondary), null, new x9l0(this, 22), 20));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(hbh0.a(getContext(), 8.0f));
        gradientDrawable.setColor(e3m.f(R.attr.vk_ui_icon_secondary, getContext()));
        vkText.setBackground(gradientDrawable);
    }

    public final void P4() {
        int i = e.$EnumSwitchMapping$0[this.t.ordinal()];
        VkAvatar vkAvatar = this.v;
        if (i == 1) {
            vkAvatar.setFixedSize(hbh0.b(36, getContext()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkAvatar.setFixedSize(hbh0.b(28, getContext()));
        }
    }

    public final ViewGroup getAttachmentsContainer() {
        return this.u;
    }

    public final Size getAvatarSize() {
        return this.t;
    }

    public final void setAvatarSize(Size size) {
        this.t = size;
        P4();
    }

    public final void setBody(a aVar) {
        aVar.getClass();
        VkExpandableText vkExpandableText = this.x;
        vkExpandableText.setText((CharSequence) null);
        vkExpandableText.setContentDescription(null);
        vkExpandableText.o();
    }

    public final void setFooter(b bVar) {
        bVar.getClass();
        f4m.j(this.C);
        f4m.j(this.D);
        f4m.j(this.E);
    }

    public final void setIcon(c cVar) {
        cVar.getClass();
        VkAvatar vkAvatar = this.v;
        vkAvatar.o0(null, null);
        vkAvatar.W0(vep.a, false);
        iut0.o(vkAvatar, am.a.e, null, null);
        vkAvatar.setContentDescription(null);
        vkAvatar.setOnClickListener(new dmu0());
    }

    public final void setTitle(d dVar) {
        dVar.getClass();
        VkText vkText = this.w;
        vkText.setText((CharSequence) null);
        vkText.setOnClickListener(new amu0());
        VkImage vkImage = this.y;
        vkImage.setImageDrawable(null);
        vkImage.setVisibility(8);
        VkImage vkImage2 = this.z;
        vkImage2.o0(null, null);
        vkImage2.setVisibility(8);
        vkImage2.setOnClickListener(new bmu0());
        VkImage vkImage3 = this.A;
        vkImage3.setVisibility(8);
        vkImage3.setOnClickListener(new j870(dVar));
        this.B.setVisibility(8);
    }
}
