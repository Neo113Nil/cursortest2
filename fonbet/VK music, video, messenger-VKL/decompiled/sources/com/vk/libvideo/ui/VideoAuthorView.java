package com.vk.libvideo.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.avatar.badge.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.R$styleable;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ap30;
import xsna.ape0;
import xsna.asp;
import xsna.c3s0;
import xsna.cn70;
import xsna.d3s0;
import xsna.e3s0;
import xsna.e420;
import xsna.e43;
import xsna.epx;
import xsna.etv0;
import xsna.f4m;
import xsna.fxc0;
import xsna.hdu0;
import xsna.hnj;
import xsna.izs;
import xsna.jjc;
import xsna.mmm0;
import xsna.ndu0;
import xsna.pkk;
import xsna.pyn;
import xsna.qoy;
import xsna.qyi0;
import xsna.rtg0;
import xsna.s3q0;
import xsna.shy;
import xsna.tkg0;
import xsna.ukg0;
import xsna.y8g0;
import xsna.zrp;
import xsna.zyl0;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class VideoAuthorView extends FrameLayout {
    public static final /* synthetic */ int l = 0;
    public final VkCell b;
    public final tkg0 c;
    public final int d;
    public izs<? super Action, s3q0> e;
    public final boolean f;
    public boolean g;
    public AnimatorSet h;
    public etv0 i;
    public final boolean j;
    public VkAvatar k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAuthorView.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action Analytics;
        public static final Action AvatarClick;
        public static final Action Click;
        public static final Action Notifications;
        public static final Action OpenDonut;
        public static final Action Subscribe;
        public static final Action Unsubscribe;

        static {
            Action action = new Action("Analytics", 0);
            Analytics = action;
            Action action2 = new Action("Subscribe", 1);
            Subscribe = action2;
            Action action3 = new Action("Unsubscribe", 2);
            Unsubscribe = action3;
            Action action4 = new Action("Click", 3);
            Click = action4;
            Action action5 = new Action("AvatarClick", 4);
            AvatarClick = action5;
            Action action6 = new Action("Notifications", 5);
            Notifications = action6;
            Action action7 = new Action("OpenDonut", 6);
            OpenDonut = action7;
            Action[] actionArr = {action, action2, action3, action4, action5, action6, action7};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAuthorView.kt */
    public static final class a {
        public final String a;
        public final CharSequence b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final hdu0 f;
        public final VkAvatarBadge g;

        public a() {
            this("", null, -1, true, false, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            CharSequence charSequence = this.b;
            int b = qoy.b(qoy.b(shy.a(this.c, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31, this.d), 31, this.e);
            hdu0 hdu0Var = this.f;
            int hashCode2 = (b + (hdu0Var == null ? 0 : hdu0Var.hashCode())) * 31;
            VkAvatarBadge vkAvatarBadge = this.g;
            return hashCode2 + (vkAvatarBadge != null ? vkAvatarBadge.hashCode() : 0);
        }

        public final String toString() {
            return "Info(avatarUrl=" + this.a + ", title=" + ((Object) this.b) + ", subscribersAmount=" + this.c + ", isSubscribersVisible=" + this.d + ", isVerified=" + this.e + ", border=" + this.f + ", badge=" + this.g + ')';
        }

        public a(String str, CharSequence charSequence, int i, boolean z, boolean z2, ndu0 ndu0Var, b bVar) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            this.d = z;
            this.e = z2;
            this.f = ndu0Var;
            this.g = bVar;
        }
    }

    public VideoAuthorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkAvatar vkAvatar;
        this.d = -1;
        this.e = new e420(28);
        this.f = fxc0.B().J().Z() || fxc0.B().J().R();
        boolean N1 = fxc0.B().J().N1();
        boolean b = fxc0.B().J().b();
        VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
        videoFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(videoFeatures);
        this.j = a2;
        Context a3 = hnj.a(context);
        LayoutInflater.from(a3).inflate(R.layout.video_author, this);
        TypedValue typedValue = new TypedValue();
        a3.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        setMinimumHeight(y8g0.a(a2 ? R.dimen.video_author_view_min_height_redesign : R.dimen.video_author_view_min_height));
        VkCell vkCell = (VkCell) findViewById(R.id.author_cell);
        this.b = vkCell;
        vkCell.setLeftMainAvatarController(new c3s0(this));
        tkg0 tkg0Var = new tkg0(a3);
        this.c = tkg0Var;
        vkCell.setRightExtraViewController(new ukg0(tkg0Var));
        TypedArray obtainStyledAttributes = a3.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        int color = obtainStyledAttributes.getColor(1, -1);
        if (color != -1) {
            this.d = color;
            tkg0Var.f.setColorFilter(color);
            tkg0Var.g.setColorFilter(color);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        View view = tkg0Var.e;
        if (resourceId != -1) {
            view.setBackgroundResource(resourceId);
        }
        obtainStyledAttributes.recycle();
        jjc.g(this, new rtg0(this, 17));
        if (b && N1 && (vkAvatar = this.k) != null) {
            jjc.g(vkAvatar, new ape0(this, 25));
        }
        jjc.g(tkg0Var.c, new qyi0(this, 16));
        jjc.g(tkg0Var.d, new ap30(this, 28));
        jjc.g(view, new mmm0(this, 12));
        jjc.g(tkg0Var.b, new zyl0(this, 14));
        addOnAttachStateChangeListener(new d3s0(this));
    }

    public final void a() {
        tkg0 tkg0Var = this.c;
        boolean z = this.f;
        if (!z || !this.g || !tkg0Var.c.isShown()) {
            if (z) {
                AnimatorSet animatorSet = this.h;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.h = null;
                VkSimpleButton vkSimpleButton = tkg0Var.c;
                vkSimpleButton.setScaleX(1.0f);
                vkSimpleButton.setScaleY(1.0f);
                vkSimpleButton.setLayerType(0, null);
                vkSimpleButton.setHasTransientState(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = this.h;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            VkSimpleButton vkSimpleButton2 = tkg0Var.c;
            vkSimpleButton2.setPivotX(vkSimpleButton2.getWidth() / 2.0f);
            vkSimpleButton2.setPivotY(vkSimpleButton2.getHeight() / 2.0f);
            vkSimpleButton2.setHasTransientState(true);
            vkSimpleButton2.setLayerType(2, null);
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkSimpleButton2, (Property<VkSimpleButton, Float>) property, 0.95f, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vkSimpleButton2, (Property<VkSimpleButton, Float>) property2, 0.95f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(vkSimpleButton2, (Property<VkSimpleButton, Float>) property, 1.0f, 0.95f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(vkSimpleButton2, (Property<VkSimpleButton, Float>) property2, 1.0f, 0.95f);
            pkk pkkVar = new pkk(0.3d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0.6d, 1.0d);
            for (ObjectAnimator objectAnimator : e43.l(ofFloat, ofFloat2, ofFloat3, ofFloat4)) {
                objectAnimator.setDuration(750L);
                objectAnimator.setInterpolator(pkkVar);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ofFloat, ofFloat2);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ofFloat3, ofFloat4);
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playSequentially(animatorSet4, animatorSet3);
            animatorSet5.addListener(new e3s0(new Ref$BooleanRef(), this, animatorSet5));
            this.h = animatorSet5;
            animatorSet5.start();
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a();
    }

    public final void setDonutButton(pyn pynVar) {
        boolean equals = pynVar.equals(pyn.a.a);
        tkg0 tkg0Var = this.c;
        if (equals) {
            f4m.j(tkg0Var.b);
            return;
        }
        if (!(pynVar instanceof pyn.b)) {
            throw new NoWhenBranchMatchedException();
        }
        VkButton vkButton = tkg0Var.b;
        vkButton.setPadding(0, 0, 0, 0);
        vkButton.d5(Integer.valueOf(((pyn.b) pynVar).a));
        int i = this.d;
        if (i != -1) {
            vkButton.setIconTint(i);
        } else {
            vkButton.setTrailingIconTint(R.attr.vk_ui_icon_secondary);
        }
        vkButton.setTrailingIconSize(Integer.valueOf(cn70.b(20)));
        vkButton.setContentDescription(vkButton.getContext().getString(R.string.video_donate_author));
        vkButton.setVisibility(0);
    }

    public final void setNotificationButtonIcon(int i) {
        this.c.f.setImageResource(i);
    }

    public final void setOnActionListener(izs<? super Action, s3q0> izsVar) {
        this.e = izsVar;
    }

    public final void setSubscribeButtonMode(VkButton.Mode mode) {
        this.c.c.setMode(mode);
    }
}
