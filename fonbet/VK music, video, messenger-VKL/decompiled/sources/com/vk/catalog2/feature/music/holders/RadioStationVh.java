package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.track.a;
import com.vk.music.view.ThumbsImageView;
import com.vk.stat.scheme.CommonAudioStat$AudioDomainEventEntity;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapPlayEventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ajc;
import xsna.arc0;
import xsna.b5a;
import xsna.c5g;
import xsna.c98;
import xsna.cfp0;
import xsna.cn70;
import xsna.cve0;
import xsna.dhr0;
import xsna.dve0;
import xsna.eve0;
import xsna.h7u0;
import xsna.iah0;
import xsna.k840;
import xsna.lqk0;
import xsna.n8g;
import xsna.qwp0;
import xsna.r5b0;
import xsna.s750;
import xsna.u2b0;
import xsna.u750;

/* compiled from: RadioStationVh.kt */
/* loaded from: classes16.dex */
public final class RadioStationVh implements CatalogViewHolder, View.OnClickListener {
    public static final float[] o;
    public final u2b0 b;
    public final a c;
    public final b5a d;
    public final u750 e;
    public View f;
    public ThumbsImageView g;
    public TextView h;
    public ImageView i;
    public ImageView j;
    public UIBlockRadioStation k;
    public final g l;
    public final eve0 m;
    public final dve0 n;

    static {
        float a = cn70.a() * 12.0f;
        o = new float[]{a, a, a, a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    }

    public RadioStationVh(u2b0 u2b0Var, a aVar, b5a b5aVar) {
        this.b = u2b0Var;
        this.c = aVar;
        this.d = b5aVar;
        s750 s750Var = k840.a.e;
        this.e = s750Var == null ? null : s750Var;
        this.l = new g();
        this.m = new eve0(this);
        this.n = new dve0(this);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        MusicTrack b;
        MusicTrack b2;
        UIBlockRadioStation uIBlockRadioStation = uIBlock instanceof UIBlockRadioStation ? (UIBlockRadioStation) uIBlock : null;
        if (uIBlockRadioStation == null) {
            return;
        }
        RadioStation radioStation = uIBlockRadioStation.y;
        this.k = uIBlockRadioStation;
        ThumbsImageView thumbsImageView = this.g;
        if (thumbsImageView != null) {
            thumbsImageView.setThumb(radioStation.c);
        }
        Integer num = radioStation.d;
        int intValue = num != null ? num.intValue() : 0;
        ImageView imageView = this.i;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
            if (gradientDrawable == null) {
                gradientDrawable = new GradientDrawable();
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setCornerRadii(o);
            gradientDrawable.setColors(new int[]{n8g.l(intValue, 38), n8g.l(intValue, 0)});
            imageView.setImageDrawable(gradientDrawable);
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(radioStation.e);
        }
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setAlpha(radioStation.h ? 1.0f : 0.4f);
        }
        ImageView imageView2 = this.j;
        u2b0 u2b0Var = this.b;
        if (imageView2 != null) {
            imageView2.setVisibility(u2b0Var.m0() != PlayState.STOPPED && (b = u2b0Var.b()) != null && b.Wb() && (b2 = u2b0Var.b()) != null && b2.b == radioStation.b ? 0 : 8);
        }
        ImageView imageView3 = this.j;
        if (imageView3 != null) {
            imageView3.setActivated(u2b0Var.m0() == PlayState.PLAYING);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_radio_slider, viewGroup, false);
        ThumbsImageView thumbsImageView = (ThumbsImageView) inflate.findViewById(R.id.radio_logo);
        thumbsImageView.setBackground(dhr0.t.c(R.attr.vk_ui_background_modal));
        this.g = thumbsImageView;
        this.h = (TextView) inflate.findViewById(R.id.radio_title);
        this.i = (ImageView) inflate.findViewById(R.id.bg_gradient);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.audio_playing_indicator);
        int i = 1;
        if (imageView != null) {
            float b = iah0.b(10.0f);
            r5b0.b bVar = new r5b0.b(inflate.getContext());
            bVar.a(R.integer.music_playing_drawable_rect_count);
            bVar.g(R.dimen.music_playing_drawable_rect_width);
            bVar.d(R.dimen.music_playing_drawable_rect_corners);
            bVar.e(R.dimen.music_playing_drawable_rect_height);
            bVar.f(R.dimen.music_playing_drawable_rect_min_height);
            bVar.c(R.color.music_playing_drawable_rect_white);
            bVar.b(R.dimen.music_playing_drawable_gap);
            bVar.j = new float[]{b, iah0.b(16.0f), iah0.b(18.0f), b};
            imageView.setImageDrawable(new r5b0(bVar));
        } else {
            imageView = null;
        }
        this.j = imageView;
        this.f = inflate;
        inflate.setOnClickListener(new c98(this, i));
        inflate.addOnAttachStateChangeListener(this.n);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack b;
        MusicTrack b2;
        UIBlockRadioStation uIBlockRadioStation = this.k;
        if (uIBlockRadioStation == null) {
            return;
        }
        RadioStation radioStation = uIBlockRadioStation.y;
        List<RadioStation> list = uIBlockRadioStation.z;
        boolean z = radioStation.h;
        int i = radioStation.b;
        if (z) {
            MusicTrack a = qwp0.a(radioStation);
            List<RadioStation> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(qwp0.a((RadioStation) it.next()));
            }
            u2b0 u2b0Var = this.b;
            r6 = (u2b0Var.h() && (b = u2b0Var.b()) != null && b.Wb() && (b2 = u2b0Var.b()) != null && b2.b == i) ? 1 : 0;
            this.d.a(new cfp0(uIBlockRadioStation, new MusicAnalyticsInfo(r6 != 0 ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
            if (r6 == 0) {
                this.e.k(new ajc(uIBlockRadioStation.b, uIBlockRadioStation.c, radioStation.i, new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(i)), list.indexOf(radioStation)), CommonAudioStat$TypeAudioTapPlayEventItem.Type.START);
            }
            u2b0Var.N0(new lqk0(new StartPlayEntitySource(StartPlayEntitySource.PlayEntitySource.CATALOG, uIBlockRadioStation.b, false, 4, null), a, arrayList, (MusicPlaybackLaunchContext) null, 0, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 952));
            return;
        }
        if (radioStation.g) {
            int i2 = h7u0.p;
            View view2 = this.f;
            if (view2 == null) {
                view2 = null;
            }
            h7u0.a c = h7u0.b.c(view2.getContext());
            c.g0(R.string.confirm);
            c.U(R.string.music_catalog_radio_station_disabled);
            c.c0(R.string.delete, new arc0(this, uIBlockRadioStation, r6));
            c.W(R.string.cancel, new cve0());
            c.m();
        }
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
