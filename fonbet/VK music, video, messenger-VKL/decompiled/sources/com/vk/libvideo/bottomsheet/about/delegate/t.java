package com.vk.libvideo.bottomsheet.about.delegate;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.Thumb;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.design.view.text.MarqueeTextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.c4;
import xsna.cn70;
import xsna.drm0;
import xsna.hfz;
import xsna.i9;
import xsna.j9;
import xsna.jjc;
import xsna.m33;
import xsna.msy;
import xsna.p1u0;
import xsna.qq2;
import xsna.s0w0;
import xsna.vfz;

/* compiled from: AboutVideoRelatedAudioRowDelegate.kt */
/* loaded from: classes2.dex */
public final class t extends p1u0<AboutVideoItem.s> {
    public final c4 a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new i9(0));

    /* compiled from: AboutVideoRelatedAudioRowDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.s> {
        public final boolean l;
        public final c4 m;
        public final VkImage n;
        public final MarqueeTextView o;
        public final VkText p;
        public final ImageView q;
        public final ObjectAnimator r;

        /* compiled from: AboutVideoRelatedAudioRowDelegate.kt */
        /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.t$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1220a implements View.OnAttachStateChangeListener {
            public ViewOnAttachStateChangeListenerC1220a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                a aVar = a.this;
                if (aVar.o.n.isRunning()) {
                    return;
                }
                MarqueeTextView marqueeTextView = aVar.o;
                ValueAnimator valueAnimator = marqueeTextView.n;
                if (qq2.d(marqueeTextView.getContext())) {
                    return;
                }
                marqueeTextView.l = true;
                valueAnimator.setStartDelay(800L);
                valueAnimator.start();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                MarqueeTextView marqueeTextView = a.this.o;
                marqueeTextView.l = false;
                marqueeTextView.n.cancel();
            }
        }

        public a(ViewGroup viewGroup, boolean z, c4 c4Var) {
            super(bwt0.I(R.layout.video_related_audio_row, viewGroup, false));
            this.l = z;
            this.m = c4Var;
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.iv_track_image);
            this.n = vkImage;
            MarqueeTextView marqueeTextView = (MarqueeTextView) this.itemView.findViewById(R.id.tv_track_name_marquee);
            this.o = marqueeTextView;
            VkText vkText = (VkText) this.itemView.findViewById(R.id.tv_track_name_static);
            this.p = vkText;
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_toggle_add_remove);
            this.q = imageView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setInterpolator(new LinearInterpolator());
            this.r = ofFloat;
            ViewOnAttachStateChangeListenerC1220a viewOnAttachStateChangeListenerC1220a = new ViewOnAttachStateChangeListenerC1220a();
            vkImage.setClipToOutline(true);
            vkImage.setOutlineProvider(new s0w0(cn70.b(6), 6));
            jjc.g(this.itemView, new j9(this, 0));
            if (!z) {
                marqueeTextView.setVisibility(8);
                vkText.setVisibility(0);
            } else {
                marqueeTextView.setVisibility(0);
                vkText.setVisibility(8);
                this.itemView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1220a);
            }
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.s sVar) {
            AboutVideoItem.s sVar2 = sVar;
            boolean z = sVar2.h;
            boolean z2 = sVar2.l;
            String str = sVar2.f + " — " + sVar2.d;
            String str2 = sVar2.e;
            if (str2 == null) {
                str2 = "";
            }
            if (!drm0.N(str2)) {
                str = str + " (" + drm0.q0(str2, '(', ')') + ')';
            }
            if (this.l) {
                this.o.setText(str);
            } else {
                this.p.setText(str);
            }
            int i = z2 ? R.drawable.vk_icon_spinner_16 : z ? R.drawable.vk_icon_done_16 : R.drawable.vk_icon_add_16;
            int i2 = z ? R.string.related_music_track_row_icon_remove : R.string.related_music_track_row_icon_add;
            ImageView imageView = this.q;
            imageView.setImageDrawable(m33.a(i, imageView.getContext()));
            imageView.setContentDescription(imageView.getContext().getString(i2));
            ObjectAnimator objectAnimator = this.r;
            if (z2) {
                objectAnimator.start();
            } else if (objectAnimator.isRunning() || objectAnimator.isStarted()) {
                objectAnimator.cancel();
                imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            Thumb thumb = sVar2.g;
            VkImage vkImage = this.n;
            int measuredWidth = vkImage.getMeasuredWidth();
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            vkImage.o0(String.valueOf(thumb.Cb(measuredWidth, false)), null);
        }
    }

    public t(c4 c4Var) {
        this.a = c4Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.s> b(ViewGroup viewGroup) {
        return new a(viewGroup, !((Boolean) this.b.getValue()).booleanValue(), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.s;
    }
}
