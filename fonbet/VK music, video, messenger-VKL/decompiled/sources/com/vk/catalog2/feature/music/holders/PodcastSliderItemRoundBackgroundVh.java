package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastSliderItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastSliderItem;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.b0y;
import xsna.bn40;
import xsna.bwt0;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.enj;
import xsna.fl4;
import xsna.gmq;
import xsna.izs;
import xsna.lqk0;
import xsna.lyd;
import xsna.m1r;
import xsna.qtt;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s490;
import xsna.sd9;
import xsna.tmq;
import xsna.u2b0;
import xsna.ucp;
import xsna.v1v;
import xsna.wzs;

/* compiled from: PodcastSliderItemRoundBackgroundVh.kt */
/* loaded from: classes16.dex */
public final class PodcastSliderItemRoundBackgroundVh implements CatalogViewHolder, View.OnClickListener {
    public final int b;
    public final u2b0 c;
    public final fl4 d;
    public final sd9 e;
    public UIBlockPodcastSliderItem f;
    public ThumbsImageView g;
    public TextView h;
    public TextView i;
    public View j;
    public TextView k;
    public ViewGroup l;
    public View m;
    public TextView n;
    public VkButton o;
    public ImageView p;
    public ColorStateList q;
    public ColorStateList r;
    public final int s;
    public final int t;

    /* compiled from: PodcastSliderItemRoundBackgroundVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Boolean, gmq, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(Boolean bool, gmq gmqVar) {
            boolean booleanValue = bool.booleanValue();
            ImageView imageView = ((PodcastSliderItemRoundBackgroundVh) this.receiver).p;
            if (imageView != null) {
                imageView.setActivated(booleanValue);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PodcastSliderItemRoundBackgroundVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<gmq, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gmq gmqVar) {
            PodcastSliderItemRoundBackgroundVh podcastSliderItemRoundBackgroundVh = (PodcastSliderItemRoundBackgroundVh) this.receiver;
            podcastSliderItemRoundBackgroundVh.getClass();
            boolean X = gmqVar.X();
            ImageView imageView = podcastSliderItemRoundBackgroundVh.p;
            if (imageView != null) {
                imageView.setActivated(X);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PodcastSliderItemRoundBackgroundVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<MusicTrack, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(MusicTrack musicTrack) {
            ((PodcastSliderItemRoundBackgroundVh) this.receiver).a(musicTrack);
            return s3q0.a;
        }
    }

    /* compiled from: PodcastSliderItemRoundBackgroundVh.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public PodcastSliderItemRoundBackgroundVh(int i, u2b0 u2b0Var, sd9 sd9Var) {
        fl4 g = lyd.g();
        this.b = i;
        this.c = u2b0Var;
        this.d = g;
        this.e = sd9Var;
        this.s = R.drawable.vk_icon_play_16;
        this.t = R.drawable.vk_icon_pause_16;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        String f;
        if (uIBlock instanceof UIBlockPodcastSliderItem) {
            UIBlockPodcastSliderItem uIBlockPodcastSliderItem = (UIBlockPodcastSliderItem) uIBlock;
            this.f = uIBlockPodcastSliderItem;
            PodcastSliderItem podcastSliderItem = uIBlockPodcastSliderItem.y;
            if (podcastSliderItem.c == PodcastSliderItem.Type.RANDOM_BUTTON) {
                TextView textView = this.h;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(R.string.podcast_lucky_holder_title);
                if (this.k != null) {
                    View view = this.j;
                    if (view != null) {
                        bwt0.p0(view, false);
                    }
                    TextView textView2 = this.k;
                    if (textView2 != null) {
                        bwt0.p0(textView2, true);
                    }
                    TextView textView3 = this.k;
                    if (textView3 != null) {
                        textView3.setText(R.string.podcast_lucky_holder_subtitle);
                    }
                } else {
                    TextView textView4 = this.i;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    textView4.setText(R.string.podcast_lucky_holder_subtitle);
                    TextView textView5 = this.i;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    textView5.setTextColor(R.color.vk_white_alpha60);
                }
                ThumbsImageView thumbsImageView = this.g;
                if (thumbsImageView == null) {
                    thumbsImageView = null;
                }
                thumbsImageView.setBackgorundColorRes(R.color.vk_white_alpha20);
                ThumbsImageView thumbsImageView2 = this.g;
                if (thumbsImageView2 == null) {
                    thumbsImageView2 = null;
                }
                TextView textView6 = this.h;
                if (textView6 == null) {
                    textView6 = null;
                }
                Context context = textView6.getContext();
                e3m.a aVar = e3m.a;
                int color = context.getColor(R.color.vk_white);
                thumbsImageView2.o = 0;
                thumbsImageView2.p = color;
                thumbsImageView2.setEmptyPlaceholder(R.drawable.vk_icon_shuffle_outline_56);
                ThumbsImageView thumbsImageView3 = this.g;
                if (thumbsImageView3 == null) {
                    thumbsImageView3 = null;
                }
                thumbsImageView3.setThumbs(null);
                ImageView imageView = this.p;
                if (imageView != null) {
                    bwt0.p0(imageView, false);
                }
                View view2 = this.m;
                if (view2 != null) {
                    bwt0.p0(view2, false);
                }
                ViewGroup viewGroup = this.l;
                if (viewGroup != null) {
                    ColorStateList colorStateList = this.q;
                    if (colorStateList == null) {
                        TextView textView7 = this.h;
                        colorStateList = ColorStateList.valueOf((textView7 != null ? textView7 : null).getContext().getColor(R.color.vk_blue_200));
                        this.q = colorStateList;
                    }
                    viewGroup.setBackgroundTintList(colorStateList);
                    return;
                }
                return;
            }
            MusicTrack musicTrack = podcastSliderItem.d;
            TextView textView8 = this.k;
            if (textView8 != null) {
                bwt0.p0(textView8, false);
            }
            View view3 = this.j;
            if (view3 != null) {
                bwt0.p0(view3, true);
            }
            TextView textView9 = this.i;
            if (textView9 == null) {
                textView9 = null;
            }
            textView9.setTextColor(dhr0.t.c(R.attr.vk_ui_text_subhead));
            ThumbsImageView thumbsImageView4 = this.g;
            if (thumbsImageView4 == null) {
                thumbsImageView4 = null;
            }
            thumbsImageView4.h(R.drawable.vk_icon_song_outline_28);
            ThumbsImageView thumbsImageView5 = this.g;
            if (thumbsImageView5 == null) {
                thumbsImageView5 = null;
            }
            thumbsImageView5.setBackgroundAttrRes(R.attr.vk_ui_image_placeholder);
            ViewGroup viewGroup2 = this.l;
            if (viewGroup2 != null) {
                ColorStateList colorStateList2 = this.r;
                if (colorStateList2 == null) {
                    TextView textView10 = this.h;
                    if (textView10 == null) {
                        textView10 = null;
                    }
                    Context context2 = textView10.getContext();
                    e3m.a aVar2 = e3m.a;
                    colorStateList2 = ColorStateList.valueOf(context2.getColor(R.color.vk_gray_800));
                    this.r = colorStateList2;
                }
                viewGroup2.setBackgroundTintList(colorStateList2);
            }
            ThumbsImageView thumbsImageView6 = this.g;
            if (thumbsImageView6 == null) {
                thumbsImageView6 = null;
            }
            thumbsImageView6.setThumb(musicTrack.Jb());
            View view4 = this.m;
            if (view4 != null) {
                bwt0.p0(view4, musicTrack.s);
            }
            VkButton vkButton = this.o;
            if (vkButton != null) {
                u2b0 u2b0Var = this.c;
                Integer valueOf = Integer.valueOf((u2b0Var.h() && u2b0Var.y0(musicTrack)) ? this.t : this.s);
                int[] iArr = VkButton.W;
                vkButton.a5(true, valueOf);
            }
            str = "";
            if (!musicTrack.Vb()) {
                ImageView imageView2 = this.p;
                if (imageView2 != null) {
                    bwt0.p0(imageView2, false);
                }
                TextView textView11 = this.h;
                if (textView11 == null) {
                    textView11 = null;
                }
                textView11.setText(musicTrack.d);
                TextView textView12 = this.i;
                TextView textView13 = textView12 == null ? null : textView12;
                float textSize = (textView12 != null ? textView12 : null).getTextSize();
                ucp ucpVar = ucp.a;
                StringBuilder sb = new StringBuilder();
                List<Artist> list = musicTrack.t;
                if (list != null) {
                    str = s490.i(list);
                } else {
                    String str2 = musicTrack.h;
                    if (str2 != null) {
                        str = str2;
                    }
                }
                sb.append(str);
                sb.append(' ');
                sb.append(s490.c(musicTrack.u));
                textView13.setText(ucp.j(drm0.p0(sb.toString()).toString(), Float.valueOf(textSize)));
                return;
            }
            TextView textView14 = this.h;
            if (textView14 == null) {
                textView14 = null;
            }
            textView14.setText(musicTrack.d);
            ImageView imageView3 = this.p;
            if (imageView3 != null) {
                bwt0.p0(imageView3, true);
            }
            ImageView imageView4 = this.p;
            if (imageView4 != null) {
                Episode episode = musicTrack.w;
                imageView4.setActivated(episode != null ? episode.c : false);
            }
            if (this.n == null) {
                TextView textView15 = this.i;
                if (textView15 == null) {
                    textView15 = null;
                }
                TextView textView16 = this.h;
                Context context3 = (textView16 != null ? textView16 : null).getContext();
                String str3 = musicTrack.h;
                str = str3 != null ? str3 : "";
                int i = musicTrack.f;
                long j = i % 60;
                int i2 = (i % 3600) / 60;
                int i3 = i / 3600;
                textView15.setText(i3 > 0 ? context3.getString(R.string.music_dot_delimiter, str, v1v.a(' ', enj.f(R.plurals.music_hours, i3, context3), enj.f(R.plurals.music_minutes, i2, context3))) : i2 > 0 ? context3.getString(R.string.music_dot_delimiter, str, enj.f(R.plurals.music_minutes, i2, context3)) : context3.getString(R.string.music_dot_delimiter, str, enj.f(R.plurals.music_seconds, (int) j, context3)));
                return;
            }
            TextView textView17 = this.i;
            if (textView17 == null) {
                textView17 = null;
            }
            textView17.setText(musicTrack.h);
            TextView textView18 = this.n;
            if (textView18 != null) {
                TextView textView19 = this.h;
                Context context4 = (textView19 != null ? textView19 : null).getContext();
                int i4 = musicTrack.f;
                long j2 = i4 % 60;
                int i5 = (i4 % 3600) / 60;
                int i6 = i4 / 3600;
                if (i6 > 0) {
                    f = enj.f(R.plurals.music_hours, i6, context4);
                    String f2 = enj.f(R.plurals.music_minutes, i5, context4);
                    if (i5 > 0) {
                        f = v1v.a(' ', f, f2);
                    }
                } else {
                    f = i5 > 0 ? enj.f(R.plurals.music_minutes, i5, context4) : enj.f(R.plurals.music_seconds, (int) j2, context4);
                }
                textView18.setText(f);
            }
        }
    }

    public final void a(MusicTrack musicTrack) {
        String str;
        if (musicTrack == null) {
            return;
        }
        ShuffleMode shuffleMode = ShuffleMode.SHUFFLE_OFF;
        UIBlockPodcastSliderItem uIBlockPodcastSliderItem = this.f;
        if (uIBlockPodcastSliderItem == null || (str = uIBlockPodcastSliderItem.f) == null) {
            str = "";
        }
        this.c.N0(new lqk0((StartPlaySource) null, musicTrack, (List) null, MusicPlaybackLaunchContext.Fb(str), 0, shuffleMode, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 949));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.h = (TextView) inflate.findViewById(R.id.audio_title);
        this.g = (ThumbsImageView) inflate.findViewById(R.id.audio_image);
        this.i = (TextView) inflate.findViewById(R.id.audio_subtitle);
        ImageView imageView = null;
        this.m = bwt0.q(inflate, R.id.explicit, null, 6);
        this.j = bwt0.q(inflate, R.id.audio_subtitle_container, null, 6);
        this.k = (TextView) bwt0.q(inflate, R.id.lucky_subtitle, null, 6);
        this.l = (ViewGroup) bwt0.q(inflate, R.id.background_container, null, 6);
        this.n = (TextView) bwt0.q(inflate, R.id.audio_text, null, 6);
        bwt0.h0(this, inflate);
        VkButton vkButton = (VkButton) bwt0.q(inflate, R.id.audio_listen_button, null, 6);
        if (vkButton != null) {
            bwt0.h0(this, vkButton);
        } else {
            vkButton = null;
        }
        this.o = vkButton;
        ImageView imageView2 = (ImageView) bwt0.q(inflate, R.id.audio_fave, null, 6);
        if (imageView2 != null) {
            bwt0.h0(this, imageView2);
            imageView = imageView2;
        }
        this.p = imageView;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockPodcastSliderItem uIBlockPodcastSliderItem = this.f;
        if (uIBlockPodcastSliderItem == null) {
            return;
        }
        PodcastSliderItem podcastSliderItem = uIBlockPodcastSliderItem.y;
        int id = view.getId();
        if (id == R.id.audio_fave) {
            MusicTrack musicTrack = podcastSliderItem.d;
            if (musicTrack == null) {
                return;
            }
            tmq.a().l(view.getContext(), musicTrack, new a(2, this, PodcastSliderItemRoundBackgroundVh.class, "onChangeFave", "onChangeFave(ZLcom/vk/dto/fave/Favable;)V", 0), new b(1, this, PodcastSliderItemRoundBackgroundVh.class, "onChangeFave", "onChangeFave(Lcom/vk/dto/fave/Favable;)V", 0), musicTrack.r);
            return;
        }
        if (id == R.id.audio_listen_button) {
            if (podcastSliderItem.c == PodcastSliderItem.Type.RANDOM_BUTTON) {
                this.e.getClass();
                bn40.f(new Object[0]);
                rsg0.y0(new qtt(), null, null, 3).subscribe(new m1r(new c(1, this, PodcastSliderItemRoundBackgroundVh.class, "playTrack", "playTrack(Lcom/vk/dto/music/MusicTrack;)V", 0), 17), new b0y(new d(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 16));
                return;
            } else {
                MusicTrack musicTrack2 = podcastSliderItem.d;
                if (musicTrack2 != null) {
                    a(musicTrack2);
                    return;
                }
                return;
            }
        }
        MusicTrack musicTrack3 = podcastSliderItem.d;
        if (musicTrack3 == null || podcastSliderItem.c == PodcastSliderItem.Type.RANDOM_BUTTON) {
            return;
        }
        if (!musicTrack3.Vb()) {
            a(musicTrack3);
            return;
        }
        MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(uIBlockPodcastSliderItem.f).Cb(uIBlockPodcastSliderItem.p.h());
        this.d.O(view.getContext(), musicTrack3.c, musicTrack3.b, Cb, musicTrack3.I);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
