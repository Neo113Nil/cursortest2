package com.vk.im.ui.views.avatars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.movika.sdk.base.flow.binding.j;
import kotlin.LazyThreadSafetyMode;
import xsna.aq5;
import xsna.cn70;
import xsna.cq5;
import xsna.enh;
import xsna.epx;
import xsna.j5g;
import xsna.msy;
import xsna.qmm;
import xsna.qtd0;
import xsna.r9r0;
import xsna.srd;
import xsna.taj;
import xsna.u9r0;
import xsna.ur5;

/* compiled from: ImAvatarView.kt */
/* loaded from: classes2.dex */
public final class ImAvatarView extends VKAvatarView {
    public static final /* synthetic */ int z = 0;
    public String s;
    public final b t;
    public final Object u;
    public final Object v;
    public final Object w;
    public Drawable x;
    public int y;

    /* compiled from: ImAvatarView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImStoryState.values().length];
            try {
                iArr[ImStoryState.SEEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImStoryState.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static qmm e1(ImAvatarView imAvatarView) {
        int viewSize = imAvatarView.getViewSize();
        Float f = imAvatarView.getAvatarBorderConfigParamsOverride().c;
        return new qmm(viewSize - ((f != null ? (int) f.floatValue() : 0) * 4));
    }

    public static ur5 f1(ImAvatarView imAvatarView, Context context) {
        int viewSize = imAvatarView.getViewSize();
        Float f = imAvatarView.getAvatarBorderConfigParamsOverride().c;
        return new ur5(context, viewSize - ((f != null ? (int) f.floatValue() : 0) * 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ur5 getAvatarLockedPlaceholder() {
        return (ur5) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final taj getContactsPlaceholder() {
        return (taj) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qmm getDialogWithSelfPlaceholder() {
        return (qmm) this.u.getValue();
    }

    private final Drawable getUserPlaceholder() {
        return this.t.f();
    }

    private final int getViewSize() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width - (getPaddingRight() + getPaddingLeft());
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height - (getPaddingBottom() + getPaddingTop());
        } else {
            i2 = 0;
        }
        return Math.max(Math.min(i, i2), 0);
    }

    public static void x1(ImAvatarView imAvatarView, Drawable drawable) {
        imAvatarView.y = 0;
        imAvatarView.x = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        imAvatarView.invalidate();
    }

    @Override // com.vk.avatar.api.VKAvatarView
    public final void X0() {
        getHierarchy().q(200);
    }

    public final String getCurrentAvatarUrl() {
        return this.s;
    }

    public final void o1(ImageList imageList, Drawable drawable) {
        Image Bb;
        String str = (imageList == null || (Bb = imageList.Bb(getViewSize(), getViewSize())) == null) ? null : Bb.d;
        if (epx.f(str, this.s)) {
            return;
        }
        this.s = str == null ? "" : str;
        VKAvatarView.Z0(this, str, drawable, null, null, 12);
    }

    @Override // com.vk.avatar.api.VKAvatarView, com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        u9r0 config;
        super.onDraw(canvas);
        if (getAvatarBorderConfigParamsOverride().e && (config = getConfig()) != null) {
            aq5.a.getClass();
            r9r0 r9r0Var = (r9r0) j5g.a0(aq5.a.b.b(getContext(), config, getAvatarBorderConfigParamsOverride().j).d);
            if (r9r0Var != null) {
                r9r0Var.b(getContext(), canvas);
            }
        }
        Drawable drawable = this.x;
        if (drawable != null) {
            int width = (getWidth() - this.y) - drawable.getIntrinsicWidth();
            int i = this.y;
            canvas.save();
            canvas.translate(width, i);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final void p1(ImageList imageList, Drawable drawable, AvatarBorderType avatarBorderType) {
        Image Bb;
        String str = (imageList == null || (Bb = imageList.Bb(getViewSize(), getViewSize())) == null) ? null : Bb.d;
        if (epx.f(str, this.s)) {
            return;
        }
        this.s = str == null ? "" : str;
        VKAvatarView.Z0(this, str, drawable, avatarBorderType, null, 8);
    }

    public final void r1(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        ImageList C8;
        Image Bb;
        Drawable drawable = null;
        ChatSettings Hb = dialog != null ? dialog.Hb() : null;
        if (dialog == null) {
            this.s = "";
            VKAvatarView.Z0(this, null, getUserPlaceholder(), null, null, 13);
            return;
        }
        if (dialog.Jc()) {
            this.s = "";
            VKAvatarView.Z0(this, null, getDialogWithSelfPlaceholder(), null, null, 13);
            return;
        }
        b bVar = this.t;
        if (Hb != null) {
            Image Bb2 = Hb.c.Bb(getViewSize(), getViewSize());
            String str = Bb2 != null ? Bb2.d : null;
            if (epx.f(str, this.s)) {
                return;
            }
            this.s = str != null ? str : "";
            VKAvatarView.Z0(this, str, bVar.c(Hb, dialog.Sb().longValue(), dialog.hc()), null, null, 12);
            return;
        }
        qtd0 Ab = profilesSimpleInfo != null ? profilesSimpleInfo.Ab(dialog.Sb()) : null;
        String str2 = (Ab == null || (C8 = Ab.C8()) == null || (Bb = C8.Bb(getViewSize(), getViewSize())) == null) ? null : Bb.d;
        if (epx.f(str2, this.s)) {
            return;
        }
        this.s = str2 != null ? str2 : "";
        AvatarBorderType avatarBorderType = (Ab == null || !Ab.n9()) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON;
        if (Ab != null) {
            bVar.getClass();
            drawable = bVar.e(Ab.name(), Ab.t8());
        }
        VKAvatarView.Z0(this, str2, drawable, avatarBorderType, null, 8);
    }

    public final void s1(qtd0 qtd0Var) {
        ImageList C8;
        Image Bb;
        Drawable drawable = null;
        String str = (qtd0Var == null || (C8 = qtd0Var.C8()) == null || (Bb = C8.Bb(getViewSize(), getViewSize())) == null) ? null : Bb.d;
        if (epx.f(str, this.s)) {
            return;
        }
        this.s = str == null ? "" : str;
        if (qtd0Var != null) {
            b bVar = this.t;
            bVar.getClass();
            drawable = bVar.e(qtd0Var.name(), qtd0Var.t8());
        }
        VKAvatarView.Z0(this, str, drawable, (qtd0Var == null || !qtd0Var.n9()) ? AvatarBorderType.CIRCLE : AvatarBorderType.HEXAGON, null, 8);
    }

    public final void t1() {
        this.s = "";
        VKAvatarView.Z0(this, null, getDialogWithSelfPlaceholder(), null, null, 13);
    }

    public final void u1() {
        this.s = "";
        VKAvatarView.Z0(this, null, getContactsPlaceholder(), null, null, 13);
    }

    public final void w1(ImStoryState imStoryState) {
        AvatarBorderType avatarBorderType;
        u9r0 config = getConfig();
        if (config == null || (avatarBorderType = config.c) == null) {
            avatarBorderType = AvatarBorderType.CIRCLE;
        }
        int i = imStoryState == null ? -1 : a.$EnumSwitchMapping$0[imStoryState.ordinal()];
        VKAvatarView.c1(this, avatarBorderType, i != 1 ? i != 2 ? cq5.b.a : cq5.h.a : cq5.m.a, 4);
    }

    public ImAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.s = "";
        this.t = new b(context, true);
        enh enhVar = new enh(this, context);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, enhVar);
        this.v = msy.a(lazyThreadSafetyMode, new srd(context, 1));
        this.w = msy.a(lazyThreadSafetyMode, new j(13, this, context));
        this.y = cn70.b(0);
    }
}
