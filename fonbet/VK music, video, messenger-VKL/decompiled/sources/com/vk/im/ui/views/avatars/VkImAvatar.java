package com.vk.im.ui.views.avatars;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.epx;
import xsna.fp;
import xsna.fpf0;
import xsna.g9e0;
import xsna.hdu0;
import xsna.mdu0;
import xsna.pvh0;
import xsna.qcy;
import xsna.qmm;
import xsna.qtd0;
import xsna.wrl0;

/* compiled from: VkImAvatar.kt */
/* loaded from: classes2.dex */
public final class VkImAvatar extends VkAvatar {
    public static final /* synthetic */ qcy<Object>[] z = {new PropertyReference1Impl(VkImAvatar.class, "dialogWithSelfPlaceholder", "getDialogWithSelfPlaceholder()Lcom/vk/im/ui/views/avatars/DialogWithSelfDrawable;", 0), fp.c(0, VkImAvatar.class, "avatarLockedPlaceholder", "getAvatarLockedPlaceholder()Lcom/vk/im/ui/views/avatars/VkAvatarLockedDrawable;", fpf0.a)};
    public String t;
    public final b u;
    public final g9e0 v;
    public final g9e0 w;
    public final g9e0 x;
    public Drawable y;

    public VkImAvatar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static mdu0 X0(VkImAvatar vkImAvatar) {
        return new mdu0(vkImAvatar.getViewSize());
    }

    public static qmm Y0(VkImAvatar vkImAvatar) {
        return new qmm(vkImAvatar.getViewSize());
    }

    public static void a1(VkImAvatar vkImAvatar, Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, int i) {
        Drawable drawable;
        ImageList C8;
        Image Bb;
        b bVar = vkImAvatar.u;
        ChatSettings Hb = dialog != null ? dialog.Hb() : null;
        if (dialog == null) {
            vkImAvatar.t = "";
            vkImAvatar.o1(null, vkImAvatar.getUserPlaceholder(), null, false);
            return;
        }
        if (dialog.Jc()) {
            vkImAvatar.t = "";
            vkImAvatar.o1(null, vkImAvatar.getDialogWithSelfPlaceholder(), null, false);
            return;
        }
        if (Hb != null) {
            Image Bb2 = Hb.c.Bb(vkImAvatar.getViewSize(), vkImAvatar.getViewSize());
            String str = Bb2 != null ? Bb2.d : null;
            if (epx.f(str, vkImAvatar.t)) {
                return;
            }
            vkImAvatar.t = str != null ? str : "";
            p1(vkImAvatar, str, bVar.c(Hb, dialog.Sb().longValue(), dialog.hc()), false, 4);
            return;
        }
        qtd0 Ab = profilesSimpleInfo != null ? profilesSimpleInfo.Ab(dialog.Sb()) : null;
        String str2 = (Ab == null || (C8 = Ab.C8()) == null || (Bb = C8.Bb(vkImAvatar.getViewSize(), vkImAvatar.getViewSize())) == null) ? null : Bb.d;
        if (epx.f(str2, vkImAvatar.t)) {
            return;
        }
        vkImAvatar.t = str2 != null ? str2 : "";
        if (Ab != null) {
            bVar.getClass();
            drawable = bVar.e(Ab.name(), Ab.t8());
        } else {
            drawable = null;
        }
        vkImAvatar.o1(str2, drawable, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c1(VkImAvatar vkImAvatar, qtd0 qtd0Var) {
        String str;
        Image Bb;
        Drawable drawable = null;
        if (qtd0Var != null) {
            vkImAvatar.getClass();
            ImageList C8 = qtd0Var.C8();
            if (C8 != null && (Bb = C8.Bb(vkImAvatar.getViewSize(), vkImAvatar.getViewSize())) != null) {
                str = Bb.d;
                if (epx.f(str, vkImAvatar.t)) {
                    vkImAvatar.t = str == null ? "" : str;
                    if (qtd0Var != null) {
                        b bVar = vkImAvatar.u;
                        bVar.getClass();
                        drawable = bVar.e(qtd0Var.name(), qtd0Var.t8());
                    }
                    p1(vkImAvatar, str, drawable, false, 8);
                    return;
                }
                return;
            }
        }
        str = null;
        if (epx.f(str, vkImAvatar.t)) {
        }
    }

    public static void e1(VkImAvatar vkImAvatar) {
        vkImAvatar.t = "";
        vkImAvatar.o1(null, vkImAvatar.getDialogWithSelfPlaceholder(), null, false);
    }

    public static void f1(VkImAvatar vkImAvatar) {
        vkImAvatar.t = "";
        p1(vkImAvatar, null, vkImAvatar.getAvatarLockedPlaceholder(), false, 8);
    }

    private final mdu0 getAvatarLockedPlaceholder() {
        qcy<Object> qcyVar = z[1];
        return (mdu0) this.x.b();
    }

    private final qmm getDialogWithSelfPlaceholder() {
        qcy<Object> qcyVar = z[0];
        return (qmm) this.v.b();
    }

    private final Drawable getUserPlaceholder() {
        return this.u.f();
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

    public static /* synthetic */ void p1(VkImAvatar vkImAvatar, String str, Drawable drawable, boolean z2, int i) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        vkImAvatar.o1(str, drawable, null, z2);
    }

    @Override // com.vk.core.view.components.picture.b, androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
        super.Ng();
        Drawable drawable = this.y;
        if (drawable == null) {
            return;
        }
        Drawable a = this.u.a(drawable);
        if (drawable instanceof mdu0) {
            g9e0 g9e0Var = this.w;
            g9e0Var.d();
            setPlaceholderImage((Drawable) g9e0Var.b());
        } else if (drawable instanceof qmm) {
            g9e0 g9e0Var2 = this.v;
            g9e0Var2.d();
            setPlaceholderImage((Drawable) g9e0Var2.b());
        } else if (a != drawable) {
            this.y = a;
            setPlaceholderImage(a);
        }
    }

    public final void Z0(ImageList imageList, Drawable drawable) {
        Image Bb;
        String str = (imageList == null || (Bb = imageList.Bb(getViewSize(), getViewSize())) == null) ? null : Bb.d;
        if (epx.f(str, this.t)) {
            return;
        }
        this.t = str == null ? "" : str;
        p1(this, str, drawable, false, 4);
    }

    public final String getCurrentAvatarUrl() {
        return this.t;
    }

    public final void o1(String str, Drawable drawable, hdu0 hdu0Var, boolean z2) {
        this.y = drawable;
        W0(hdu0Var, z2);
        setPlaceholderImage(drawable);
        o0(str, null);
    }

    public VkImAvatar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.t = "";
        this.u = new b(context, true);
        this.v = new g9e0(new wrl0(context, this));
        g9e0 g9e0Var = new g9e0(new pvh0(context, this));
        this.w = g9e0Var;
        this.x = g9e0Var;
    }
}
