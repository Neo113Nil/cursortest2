package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenChallenge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudio;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogPromoBannerVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bwt0;
import xsna.cfp0;
import xsna.epx;
import xsna.f4m;
import xsna.h94;
import xsna.iah0;
import xsna.n8g;
import xsna.ob50;
import xsna.r8a;
import xsna.sua;
import xsna.u4a;

/* compiled from: ClipsMusicSelectorCatalogPromoBannerVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicSelectorCatalogPromoBannerVh extends CatalogPromoBannerVh {
    public static final h94 C = new h94(R.drawable.vk_icon_pause_16, R.string.music_talkback_pause, R.attr.vk_legacy_button_secondary_foreground);
    public static final h94 D = new h94(R.drawable.vk_icon_play_16, R.string.music_talkback_play, R.attr.vk_legacy_button_secondary_foreground);
    public static final float E = iah0.a(6);
    public static final int F = n8g.l(16746624, 255);
    public static final int G = n8g.l(15085163, 255);
    public TextView A;
    public ImageView B;
    public final u4a w;
    public final UIBlock x;
    public UIBlockMusicTrack y;
    public VKImageView z;

    /* compiled from: ClipsMusicSelectorCatalogPromoBannerVh.kt */
    public static final class a extends Drawable {
        public final int a;
        public final Integer b;
        public final Paint c = new Paint(1);

        public a(int i, Integer num) {
            this.a = i;
            this.b = num;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            RectF rectF = new RectF(getBounds());
            float f = ClipsMusicSelectorCatalogPromoBannerVh.E;
            canvas.drawRoundRect(rectF, f, f, this.c);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return this.c.getAlpha();
        }

        @Override // android.graphics.drawable.Drawable
        public final void onBoundsChange(Rect rect) {
            if (rect.width() > 0) {
                Paint paint = this.c;
                Integer num = this.b;
                if (num == null) {
                    paint.setColor(this.a);
                    return;
                }
                int width = rect.width();
                int height = rect.height();
                float f = width * width;
                float f2 = height * height;
                float f3 = (f - f2) / ((f + f2) * 2);
                float f4 = width * f3;
                float f5 = f3 * height;
                paint.setShader(new LinearGradient(rect.left + f4, rect.top - f5, rect.right - f4, rect.bottom + f5, this.a, num.intValue(), Shader.TileMode.CLAMP));
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            this.c.setAlpha(i);
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.c.setColorFilter(colorFilter);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipsMusicSelectorCatalogPromoBannerVh(u4a u4aVar, UIBlock uIBlock) {
        super(r0.e, r0.f, new b(), r0.w, true, 0, R.layout.catalog_music_promo_banner, R.layout.catalog_music_container_promo_banner, true);
        u4a.a aVar = u4aVar.b;
        this.w = u4aVar;
        this.x = uIBlock;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009d A[SYNTHETIC] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.container.CatalogPromoBannerVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        UIBlockActionPlayAudio uIBlockActionPlayAudio;
        UIBlockMusicTrack uIBlockMusicTrack;
        Iterator<T> it;
        UIBlockActionOpenChallenge uIBlockActionOpenChallenge;
        super.N6(uIBlock);
        if (!(uIBlock instanceof UIBlockPlaceholder)) {
            return;
        }
        View view = this.m;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        ArrayList<UIBlockAction> arrayList = ((UIBlockPlaceholder) uIBlock).G;
        Iterator<T> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                uIBlockActionPlayAudio = null;
                break;
            }
            UIBlockAction uIBlockAction = (UIBlockAction) it2.next();
            uIBlockActionPlayAudio = uIBlockAction instanceof UIBlockActionPlayAudio ? (UIBlockActionPlayAudio) uIBlockAction : null;
            if (uIBlockActionPlayAudio != null) {
                break;
            }
        }
        if (uIBlockActionPlayAudio != null) {
            MusicTrack musicTrack = uIBlockActionPlayAudio.z;
            u4a u4aVar = this.w;
            if (u4aVar.b.i.h() && epx.f(u4aVar.b.i.b(), musicTrack)) {
                ImageView imageView = this.B;
                if (imageView != null) {
                    C.a(imageView, true);
                }
            } else {
                ImageView imageView2 = this.B;
                if (imageView2 != null) {
                    D.a(imageView2, true);
                }
            }
            if (musicTrack != null) {
                uIBlockMusicTrack = new UIBlockMusicTrack(sua.l(uIBlockActionPlayAudio), musicTrack, "", null, null, null, false, null, 248, null);
                this.y = uIBlockMusicTrack;
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        uIBlockActionOpenChallenge = null;
                        break;
                    }
                    UIBlockAction uIBlockAction2 = (UIBlockAction) it.next();
                    uIBlockActionOpenChallenge = uIBlockAction2 instanceof UIBlockActionOpenChallenge ? (UIBlockActionOpenChallenge) uIBlockAction2 : null;
                    if (uIBlockActionOpenChallenge != null) {
                        break;
                    }
                }
                if (uIBlockActionOpenChallenge == null) {
                    TextView textView = this.A;
                    if (textView != null) {
                        f4m.j(textView);
                    }
                    VKImageView vKImageView = this.z;
                    if (vKImageView != null) {
                        f4m.j(vKImageView);
                    }
                    TextView textView2 = this.n;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setVisibility(0);
                    TextView textView3 = this.l;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    TextView textView4 = this.l;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    textView3.setBackground(new a(textView4.getContext().getColor(R.color.vk_white_alpha20), null));
                    return;
                }
                if (uIBlockActionPlayAudio != null) {
                    MusicTrack musicTrack2 = uIBlockActionPlayAudio.z;
                    TextView textView5 = this.A;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                        textView5.setText(musicTrack2 != null ? ob50.a(musicTrack2) : null);
                    }
                    VKImageView vKImageView2 = this.z;
                    if (vKImageView2 != null) {
                        vKImageView2.setVisibility(0);
                        vKImageView2.load(musicTrack2 != null ? musicTrack2.Kb(vKImageView2.getMeasuredWidth()) : null);
                    }
                    TextView textView6 = this.n;
                    if (textView6 == null) {
                        textView6 = null;
                    }
                    f4m.j(textView6);
                } else {
                    TextView textView7 = this.A;
                    if (textView7 != null) {
                        f4m.j(textView7);
                    }
                    VKImageView vKImageView3 = this.z;
                    if (vKImageView3 != null) {
                        f4m.j(vKImageView3);
                    }
                    TextView textView8 = this.n;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    f4m.j(textView8);
                }
                TextView textView9 = this.l;
                (textView9 != null ? textView9 : null).setBackground(new a(F, Integer.valueOf(G)));
                return;
            }
        }
        uIBlockMusicTrack = null;
        this.y = uIBlockMusicTrack;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (uIBlockActionOpenChallenge == null) {
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.CatalogPromoBannerVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        this.z = (VKImageView) k5.findViewById(R.id.catalog_banner_author_avatar);
        this.A = (TextView) k5.findViewById(R.id.catalog_banner_author_name);
        ImageView imageView = (ImageView) k5.findViewById(R.id.catalog_banner_button_play);
        bwt0.h0(this, imageView);
        this.B = imageView;
        UIBlock uIBlock = this.x;
        if (uIBlock != null) {
            N6(uIBlock);
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.CatalogPromoBannerVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionOpenChallenge uIBlockActionOpenChallenge;
        String str;
        UIBlockPlaceholder uIBlockPlaceholder = this.t;
        if (view == null || uIBlockPlaceholder == null) {
            return;
        }
        u4a u4aVar = this.w;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        Integer num = null;
        aVar.f.a(new cfp0(uIBlockPlaceholder, null));
        Iterator<T> it = uIBlockPlaceholder.G.iterator();
        while (true) {
            if (!it.hasNext()) {
                uIBlockActionOpenChallenge = null;
                break;
            }
            UIBlockAction uIBlockAction = (UIBlockAction) it.next();
            uIBlockActionOpenChallenge = uIBlockAction instanceof UIBlockActionOpenChallenge ? (UIBlockActionOpenChallenge) uIBlockAction : null;
            if (uIBlockActionOpenChallenge != null) {
                break;
            }
        }
        String str2 = uIBlockActionOpenChallenge != null ? uIBlockActionOpenChallenge.z : null;
        UIBlockPlaceholder uIBlockPlaceholder2 = this.t;
        if (uIBlockPlaceholder2 != null && (str = uIBlockPlaceholder2.z) != null) {
            num = Integer.valueOf(Integer.parseInt(str));
        }
        AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = new AudioFromMusicCatalogInfo(num, null, null, false, str2, 14, null);
        if (view.getId() == R.id.catalog_banner_button_play) {
            aVar2.f.a(new cfp0(uIBlockPlaceholder, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Play)));
        } else {
            aVar2.f.a(new cfp0(uIBlockPlaceholder, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Open)));
        }
        u4aVar.c.a.q(view.getId(), this.y, audioFromMusicCatalogInfo);
    }

    /* compiled from: ClipsMusicSelectorCatalogPromoBannerVh.kt */
    public static final class b implements r8a {
        @Override // xsna.r8a
        public final CharSequence a(String str) {
            return str;
        }

        @Override // xsna.r8a
        public final CharSequence b(CharSequence charSequence, View.OnClickListener onClickListener, float f) {
            return charSequence;
        }
    }
}
