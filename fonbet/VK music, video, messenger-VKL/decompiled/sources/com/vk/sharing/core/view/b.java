package com.vk.sharing.core.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import defpackage.q0;
import xsna.dhr0;
import xsna.epx;
import xsna.h12;
import xsna.iah0;
import xsna.k0;
import xsna.ogu;
import xsna.qmm;
import xsna.qoy;
import xsna.qtd0;
import xsna.zxt0;

/* compiled from: GridTargetViewHolder.kt */
/* loaded from: classes5.dex */
public final class b extends RecyclerView.e0 implements zxt0 {
    public final l l;
    public final com.vk.im.ui.views.avatars.b m;

    /* compiled from: GridTargetViewHolder.kt */
    public final class a implements VkTile.g {
        public final FrameLayout a;
        public final VKImageView b;
        public final LottieAnimationView c;
        public final View d;
        public boolean e;

        public a(Context context) {
            FrameLayout frameLayout = new FrameLayout(context);
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setTag("avatar");
            vKImageView.setRound(true);
            vKImageView.setPlaceholderImage(b.this.m.f());
            frameLayout.addView(vKImageView);
            this.b = vKImageView;
            View view = new View(context);
            view.setId(View.generateViewId());
            float f = 6;
            view.setTranslationX(iah0.a(f));
            view.setTranslationY(iah0.a(f));
            float f2 = 28;
            view.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f2), 85));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(iah0.a(2), dhr0.t.c(R.attr.vk_ui_background_modal));
            view.setBackground(gradientDrawable);
            view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setLayerType(1, null);
            frameLayout.post(new k0(4, frameLayout, view));
            this.d = view;
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            lottieAnimationView.setId(View.generateViewId());
            float f3 = 4;
            lottieAnimationView.setTranslationX(iah0.a(f3));
            lottieAnimationView.setTranslationY(iah0.a(f3));
            float f4 = 24;
            lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f4), iah0.a(f4), 85));
            lottieAnimationView.setAnimation(R.raw.check_circle_filled_blue_24);
            lottieAnimationView.setRepeatCount(0);
            lottieAnimationView.setSpeed(1.0f);
            frameLayout.post(new h12(4, frameLayout, lottieAnimationView));
            lottieAnimationView.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lottieAnimationView.f.c.addUpdateListener(new ogu(this, 0));
            this.c = lottieAnimationView;
            this.a = frameLayout;
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final void a(ConstraintLayout constraintLayout, VkTile.h hVar) {
            VKImageView vKImageView;
            ImageList C8;
            Image Bb;
            LottieAnimationView lottieAnimationView;
            if (hVar instanceof C1781b) {
                FrameLayout frameLayout = this.a;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                float f = 64;
                layoutParams.width = iah0.a(f);
                layoutParams.height = iah0.a(f);
                C1781b c1781b = (C1781b) hVar;
                Dialog dialog = c1781b.a;
                boolean z = c1781b.c;
                ProfilesSimpleInfo profilesSimpleInfo = c1781b.b;
                ChatSettings Hb = dialog != null ? dialog.Hb() : null;
                if (dialog == null) {
                    VKImageView vKImageView2 = this.b;
                    if (vKImageView2 != null) {
                        vKImageView2.getBackend().cancel();
                    }
                } else if (dialog.Jc()) {
                    VKImageView vKImageView3 = this.b;
                    if (vKImageView3 != null) {
                        frameLayout.getContext();
                        qmm qmmVar = new qmm(160);
                        float f2 = 8;
                        qmmVar.setLayerInset(1, iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2));
                        vKImageView3.setImageDrawable(qmmVar);
                    }
                } else {
                    b bVar = b.this;
                    if (Hb != null) {
                        Image Bb2 = Hb.c.Bb(160, 160);
                        String str = Bb2 != null ? Bb2.d : null;
                        VKImageView vKImageView4 = this.b;
                        if (vKImageView4 != null) {
                            vKImageView4.setPlaceholderImage(bVar.m.c(Hb, dialog.Sb().longValue(), dialog.hc()));
                        }
                        VKImageView vKImageView5 = this.b;
                        if (vKImageView5 != null) {
                            vKImageView5.o0(str, null);
                        }
                    } else {
                        qtd0 Ab = profilesSimpleInfo != null ? profilesSimpleInfo.Ab(dialog.Sb()) : null;
                        String str2 = (Ab == null || (C8 = Ab.C8()) == null || (Bb = C8.Bb(160, 160)) == null) ? null : Bb.d;
                        if (Ab != null && (vKImageView = this.b) != null) {
                            com.vk.im.ui.views.avatars.b bVar2 = bVar.m;
                            bVar2.getClass();
                            vKImageView.setPlaceholderImage(bVar2.e(Ab.name(), Ab.t8()));
                        }
                        VKImageView vKImageView6 = this.b;
                        if (vKImageView6 != null) {
                            vKImageView6.o0(str2, null);
                        }
                    }
                }
                boolean z2 = this.e;
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z2 == z) {
                    LottieAnimationView lottieAnimationView2 = this.c;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.setProgress(z ? 1.0f : 0.0f);
                    }
                    if (z) {
                        View view = this.d;
                        if (view != null) {
                            view.setScaleX(1.0f);
                        }
                        View view2 = this.d;
                        if (view2 != null) {
                            view2.setScaleY(1.0f);
                        }
                    } else {
                        View view3 = this.d;
                        if (view3 != null) {
                            view3.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        View view4 = this.d;
                        if (view4 != null) {
                            view4.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                } else if (z) {
                    LottieAnimationView lottieAnimationView3 = this.c;
                    if (lottieAnimationView3 != null) {
                        lottieAnimationView3.setSpeed(1.0f);
                    }
                    LottieAnimationView lottieAnimationView4 = this.c;
                    if (lottieAnimationView4 != null) {
                        lottieAnimationView4.f.y();
                    }
                    LottieAnimationView lottieAnimationView5 = this.c;
                    if (lottieAnimationView5 != null) {
                        lottieAnimationView5.m0();
                    }
                } else {
                    LottieAnimationView lottieAnimationView6 = this.c;
                    if (lottieAnimationView6 != null) {
                        lottieAnimationView6.setSpeed(-1.0f);
                    }
                    LottieAnimationView lottieAnimationView7 = this.c;
                    if (lottieAnimationView7 != null) {
                        lottieAnimationView7.f.y();
                    }
                    LottieAnimationView lottieAnimationView8 = this.c;
                    if (lottieAnimationView8 != null) {
                        lottieAnimationView8.m0();
                    }
                }
                this.e = z;
                if (c1781b.d || (lottieAnimationView = this.c) == null) {
                    return;
                }
                lottieAnimationView.W();
                lottieAnimationView.l0();
                if (this.e) {
                    f3 = 1.0f;
                }
                lottieAnimationView.setProgress(f3);
            }
        }

        @Override // com.vk.core.view.components.tile.VkTile.g
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: GridTargetViewHolder.kt */
    /* renamed from: com.vk.sharing.core.view.b$b, reason: collision with other inner class name */
    public static final class C1781b implements VkTile.h {
        public final Dialog a;
        public final ProfilesSimpleInfo b;
        public final boolean c;
        public final boolean d;

        public C1781b(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2) {
            this.a = dialog;
            this.b = profilesSimpleInfo;
            this.c = z;
            this.d = z2;
        }

        public static C1781b a(C1781b c1781b, boolean z, int i) {
            Dialog dialog = (i & 1) != 0 ? c1781b.a : null;
            ProfilesSimpleInfo profilesSimpleInfo = c1781b.b;
            boolean z2 = c1781b.c;
            if ((i & 8) != 0) {
                z = c1781b.d;
            }
            c1781b.getClass();
            return new C1781b(dialog, profilesSimpleInfo, z2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1781b)) {
                return false;
            }
            C1781b c1781b = (C1781b) obj;
            return epx.f(this.a, c1781b.a) && epx.f(this.b, c1781b.b) && this.c == c1781b.c && this.d == c1781b.d;
        }

        public final int hashCode() {
            Dialog dialog = this.a;
            return Boolean.hashCode(this.d) + qoy.b(io.reactivex.rxjava3.subjects.c.a(this.b, (dialog == null ? 0 : dialog.hashCode()) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VisualContentParams(dialog=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", shouldAnimate=");
            return q0.a(sb, this.d, ')');
        }
    }

    public b(f fVar, VkTile vkTile) {
        super(vkTile);
        this.l = fVar;
        this.m = new com.vk.im.ui.views.avatars.b(fVar.getView().getContext(), true);
        VkTile vkTile2 = (VkTile) this.itemView;
        vkTile2.setVisualContentType(VkTile.VisualContentType.Avatar);
        vkTile2.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(82), -2));
    }

    @Override // xsna.zxt0
    public final void R4() {
        VkTile vkTile = (VkTile) this.itemView;
        vkTile.setVisualContentParams(C1781b.a((C1781b) vkTile.getVisualContentParams(), false, 7));
    }

    @Override // xsna.zxt0
    public final void r5() {
        VkTile vkTile = (VkTile) this.itemView;
        vkTile.setVisualContentParams(C1781b.a((C1781b) vkTile.getVisualContentParams(), true, 7));
    }
}
