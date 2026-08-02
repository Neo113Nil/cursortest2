package com.vk.im.ui.views.avatars;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.design.R$styleable;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.chats.ChatPreview;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.j;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a0a;
import xsna.cn70;
import xsna.epx;
import xsna.f5h0;
import xsna.fpf0;
import xsna.g9e0;
import xsna.kqj;
import xsna.lep;
import xsna.lpa0;
import xsna.m900;
import xsna.mdu0;
import xsna.mjw;
import xsna.ms5;
import xsna.msy;
import xsna.no;
import xsna.oo;
import xsna.qcy;
import xsna.qmm;
import xsna.qtd0;
import xsna.rhs;
import xsna.rj1;
import xsna.t61;
import xsna.too0;
import xsna.ur5;
import xsna.wm1;

/* compiled from: AvatarView.kt */
/* loaded from: classes2.dex */
public class AvatarView extends VKImageView implements too0, lep {
    public static final a y;
    public static final /* synthetic */ qcy<Object>[] z;
    public final com.vk.im.ui.views.avatars.b m;
    public final lpa0 n;
    public Object o;
    public Object p;
    public final g9e0 q;
    public final g9e0 r;
    public ImageList s;
    public Object t;
    public Integer u;
    public int v;
    public int w;
    public kqj<mjw> x;

    /* compiled from: AvatarView.kt */
    public static final class a {
    }

    /* compiled from: AvatarView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AvatarView.class, "avatarLockedPlaceholderV2", "getAvatarLockedPlaceholderV2()Lcom/vk/im/ui/views/avatars/VkAvatarLockedDrawable;", 0);
        fpf0.a.getClass();
        z = new qcy[]{propertyReference1Impl};
        y = new a();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ur5 getAvatarLockedPlaceholder() {
        return (ur5) this.p.getValue();
    }

    private final mdu0 getAvatarLockedPlaceholderV2() {
        qcy<Object> qcyVar = z[0];
        return (mdu0) this.r.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Drawable getCurrentPlaceholderDrawable() {
        return (Drawable) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qmm getDialogWithSelfPlaceholder() {
        return (qmm) this.o.getValue();
    }

    private final Drawable getGroupPlaceholder() {
        return this.m.b();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    private final void setCurrentAvatar(ImageList imageList) {
        if (epx.f(this.s, imageList)) {
            return;
        }
        this.s = imageList;
        lpa0 lpa0Var = this.n;
        lpa0Var.d();
        lpa0Var.l = getController();
        lpa0Var.h = this.x;
        if (imageList == null || imageList.b.isEmpty()) {
            lpa0Var.c = null;
        } else {
            int i = this.w;
            Image Bb = imageList.Bb(i, i);
            if (Bb == null) {
                y.getClass();
                m900<String, Image> m900Var = Image.g;
                Bb = Image.a.a(400, "https://" + a0a.d + "/images/camera_400.png");
            }
            ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(Bb.d));
            h.g = ImageRequest.CacheChoice.SMALL;
            lpa0Var.c = h.a();
        }
        setController(lpa0Var.b());
    }

    private final void setPlaceholder(Drawable drawable) {
        if (epx.f(drawable, getCurrentPlaceholderDrawable())) {
            return;
        }
        this.t = msy.a(LazyThreadSafetyMode.NONE, new no(drawable, 5));
        getHierarchy().p(drawable, 1);
        getHierarchy().p(drawable, 5);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, xsna.too0
    public final void Ng() {
        this.t = new InitializedLazyImpl(this.m.a(getCurrentPlaceholderDrawable()));
        wm1 wm1Var = new wm1(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, wm1Var);
        this.p = msy.a(lazyThreadSafetyMode, new j(this, 9));
        if (getCurrentPlaceholderDrawable() instanceof mdu0) {
            this.q.d();
            this.t = new InitializedLazyImpl(getAvatarLockedPlaceholderV2());
        }
        getHierarchy().p(getCurrentPlaceholderDrawable(), 1);
        getHierarchy().p(getCurrentPlaceholderDrawable(), 5);
    }

    public final void T0(ImageList imageList, Drawable drawable) {
        setCurrentAvatar(imageList);
        if (drawable == null) {
            drawable = getCurrentPlaceholderDrawable();
        }
        setPlaceholder(drawable);
        getHierarchy().q((imageList == null || imageList.b.isEmpty()) ? 0 : this.v);
    }

    public final void U0() {
        T0(null, getCurrentPlaceholderDrawable());
    }

    public final void W0(ChatPreview chatPreview) {
        T0(chatPreview != null ? chatPreview.c : null, getGroupPlaceholder());
    }

    public final void X0(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        ChatSettings Hb = dialog != null ? dialog.Hb() : null;
        if (dialog == null) {
            T0(null, getCurrentPlaceholderDrawable());
            return;
        }
        if (dialog.Jc()) {
            T0(null, getDialogWithSelfPlaceholder());
            return;
        }
        com.vk.im.ui.views.avatars.b bVar = this.m;
        if (Hb != null) {
            T0(Hb.c, bVar.c(Hb, dialog.Sb().longValue(), dialog.hc()));
        } else {
            qtd0 Ab = profilesSimpleInfo != null ? profilesSimpleInfo.Ab(dialog.Sb()) : null;
            T0(Ab != null ? Ab.C8() : null, Ab != null ? bVar.d(Ab) : null);
        }
    }

    public final void Y0(qtd0 qtd0Var) {
        T0(qtd0Var != null ? qtd0Var.C8() : null, qtd0Var != null ? this.m.d(qtd0Var) : null);
    }

    public final void Z0() {
        T0(null, getAvatarLockedPlaceholderV2());
    }

    public final kqj<mjw> getControllerListener() {
        return this.x;
    }

    public final long getFadeDuration() {
        return getHierarchy().e.m;
    }

    public final Integer getTintColor() {
        return this.u;
    }

    public final int getViewSize() {
        return this.w;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        getHierarchy().p(getCurrentPlaceholderDrawable(), 1);
        getHierarchy().p(getCurrentPlaceholderDrawable(), 5);
        super.onAttachedToWindow();
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + this.w, getPaddingBottom() + getPaddingTop() + this.w);
    }

    public final void setControllerListener(kqj<mjw> kqjVar) {
        this.x = kqjVar;
    }

    public final void setFadeDuration(int i) {
        this.v = i;
        T0(this.s, getCurrentPlaceholderDrawable());
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int min = Math.min(layoutParams != null ? layoutParams.width : 0, layoutParams != null ? layoutParams.height : 0);
        this.w = min;
        if (min <= 0) {
            throw new IllegalArgumentException("Only exact size supported, specify avatar sizes in layout params");
        }
        oo ooVar = new oo(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, ooVar);
        this.p = msy.a(lazyThreadSafetyMode, new h(this, 6));
        this.q.d();
    }

    public final void setShape(AvatarShape avatarShape) {
        int i = b.$EnumSwitchMapping$0[avatarShape.ordinal()];
        if (i == 1) {
            getHierarchy().u(RoundingParams.a());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getHierarchy().u(RoundingParams.b(cn70.a() * 16.0f));
        }
    }

    public final void setTintColor(Integer num) {
        this.u = num;
        getHierarchy().n(num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP) : null);
    }

    public final void setViewSize(int i) {
        this.w = i;
    }

    @Override // xsna.lep
    public final void y() {
        if (getCurrentUrl() == null) {
            Drawable currentPlaceholderDrawable = getCurrentPlaceholderDrawable();
            com.vk.im.ui.views.avatars.a aVar = currentPlaceholderDrawable instanceof com.vk.im.ui.views.avatars.a ? (com.vk.im.ui.views.avatars.a) currentPlaceholderDrawable : null;
            if (aVar == null || aVar.h == null) {
                return;
            }
            invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.m = new com.vk.im.ui.views.avatars.b(context, true);
        this.n = rhs.e();
        g9e0 g9e0Var = new g9e0(new com.vk.movika.sdk.base.logic.interactor.b(context, this));
        this.q = g9e0Var;
        this.r = g9e0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
        if (obtainStyledAttributes.hasValue(0)) {
            setTintColor(Integer.valueOf(obtainStyledAttributes.getColor(0, -16777216)));
            setFadeDuration(obtainStyledAttributes.getInt(1, 300));
        }
        obtainStyledAttributes.recycle();
        t61 t61Var = new t61(context, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, t61Var);
        this.p = msy.a(lazyThreadSafetyMode, new ms5(context, 0));
        this.t = msy.a(lazyThreadSafetyMode, new rj1(this, 5));
        getHierarchy().u(RoundingParams.a());
        getHierarchy().o(f5h0.f.a);
    }

    public final void setFadeDuration(long j) {
        setFadeDuration((int) j);
    }
}
