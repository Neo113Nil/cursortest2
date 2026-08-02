package com.vk.music.player.presentation.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.f;
import com.vk.music.player.service.MusicPlayerAction;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import xsna.bdz;
import xsna.c4b0;
import xsna.drm0;
import xsna.fai;
import xsna.fsq;
import xsna.k840;
import xsna.s490;
import xsna.tib;
import xsna.u2b0;

/* loaded from: classes3.dex */
public class PlayerSmallWidget extends AudioPlayerWidget {

    @Nullable
    public static c b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoopMode.values().length];
            a = iArr;
            try {
                iArr[LoopMode.TRACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LoopMode.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LoopMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void i(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        PlayState playState;
        boolean z;
        boolean z2;
        PendingIntent h;
        Intent a2;
        String str;
        PendingIntent h2;
        Intent intent;
        PendingIntent h3;
        int i;
        String sb;
        tib a3 = k840.e.a();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_player);
        u2b0 b2 = k840.a.g().b();
        f H = b2.H();
        PlayState m0 = b2.m0();
        MusicTrack f = H == null ? null : H.f();
        boolean z3 = f != null;
        boolean z4 = H == null || !H.l(PlayerAction.changeTrackNext);
        boolean z5 = H == null || !H.l(PlayerAction.changeTrackPrev);
        boolean z6 = AudioPlayerWidget.f(b2) && z3;
        boolean z7 = (m0.i() || z6) ? false : true;
        boolean z8 = z6 && !m0.i();
        boolean I1 = b2.I1();
        boolean U0 = b2.U0();
        LoopMode repeatMode = b2.getRepeatMode();
        PendingIntent b3 = AudioPlayerWidget.b(context, "small_player_widget");
        PendingIntent d = AudioPlayerWidget.d(context, "small_player_widget");
        PendingIntent c = AudioPlayerWidget.c(context, "small_player_widget");
        if (H == null || H.l(PlayerAction.playPause)) {
            playState = m0;
            z = z8;
            z2 = z4;
            PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(12, SystemClock.elapsedRealtime());
            Intent a4 = a3.a(context, MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE, null);
            a4.putExtra("EXTRA_ACTION_META", playbackActionMeta);
            h = AudioPlayerWidget.h(context, "small_player_widget", a4);
        } else {
            playState = m0;
            z = z8;
            z2 = z4;
            h = null;
        }
        remoteViews.setOnClickPendingIntent(R.id.w_player_play_pause, h);
        if (z2) {
            str = "EXTRA_ACTION_META";
            h2 = null;
        } else {
            if (f.Vb() || f.Mb() || f.Ub()) {
                PlaybackActionMeta playbackActionMeta2 = new PlaybackActionMeta(24, SystemClock.elapsedRealtime());
                a2 = a3.a(context, MusicPlayerAction.ACTION_NEXT_15, null);
                str = "EXTRA_ACTION_META";
                a2.putExtra(str, playbackActionMeta2);
            } else {
                str = "EXTRA_ACTION_META";
                PlaybackActionMeta playbackActionMeta3 = new PlaybackActionMeta(13, SystemClock.elapsedRealtime());
                a2 = a3.a(context, MusicPlayerAction.ACTION_NEXT, null);
                a2.putExtra(str, playbackActionMeta3);
            }
            h2 = AudioPlayerWidget.h(context, "small_player_widget", a2);
        }
        remoteViews.setOnClickPendingIntent(R.id.w_player_next, h2);
        if (z5) {
            h3 = null;
        } else {
            if (f.Vb() || f.Mb() || f.Ub()) {
                PlaybackActionMeta playbackActionMeta4 = new PlaybackActionMeta(25, SystemClock.elapsedRealtime());
                Intent a5 = a3.a(context, MusicPlayerAction.ACTION_PREV_15, null);
                a5.putExtra(str, playbackActionMeta4);
                intent = a5;
            } else {
                intent = a3.c(context, true, new PlaybackActionMeta(14, SystemClock.elapsedRealtime()), null);
            }
            h3 = AudioPlayerWidget.h(context, "small_player_widget", intent);
        }
        remoteViews.setOnClickPendingIntent(R.id.w_player_prev, h3);
        remoteViews.setOnClickPendingIntent(R.id.w_player_shuffle, (H == null || H.l(PlayerAction.shuffle)) ? AudioPlayerWidget.h(context, "small_player_widget", a3.a(context, MusicPlayerAction.ACTION_TOGGLE_SHUFFLE, null)) : null);
        remoteViews.setOnClickPendingIntent(R.id.w_player_repeat, (H == null || H.l(PlayerAction.repeat)) ? AudioPlayerWidget.h(context, "small_player_widget", a3.a(context, MusicPlayerAction.ACTION_TOGGLE_REPEAT, null)) : null);
        if (z7) {
            remoteViews.setOnClickPendingIntent(R.id.w_player_artist, !I1 ? b3 : d);
            remoteViews.setOnClickPendingIntent(R.id.w_player_cover, !I1 ? b3 : d);
            remoteViews.setOnClickPendingIntent(R.id.w_player_cover_wrap, !I1 ? b3 : d);
            if (f != null) {
                if (I1) {
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = f.d;
                    String E = fai.E(f);
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append((Object) drm0.p0(s490.b(E == null ? "" : E, str2, context.getColor(R.color.vk_steel_gray_300))));
                    sb2.append(" - ");
                    sb2.append(fai.d(f).toString());
                    sb = sb2.toString();
                } else {
                    sb = context.getString(R.string.audio_ad_title);
                }
                remoteViews.setTextViewText(R.id.w_player_artist, sb);
            }
            c cVar = b;
            if (cVar != null) {
                cVar.dispose();
            }
            if (!I1 || f == null) {
                remoteViews.setViewVisibility(R.id.w_player_cover, 8);
                remoteViews.setViewVisibility(R.id.w_player_cover_placeholder, 0);
            } else {
                b = new a0(AudioPlayerWidget.a(f, 130.0f), new c4b0()).subscribe(new bdz(remoteViews, 16), new fsq(remoteViews, 19));
            }
            remoteViews.setImageViewResource(R.id.w_player_play_pause, playState.h() ? R.drawable.vk_icon_pause_36 : R.drawable.vk_icon_play_36);
            remoteViews.setContentDescription(R.id.w_player_play_pause, context.getString(playState.h() ? R.string.music_talkback_pause : R.string.music_talkback_play));
            remoteViews.setViewVisibility(R.id.w_player_btns_wrap, 0);
            remoteViews.setViewVisibility(R.id.w_player_artist, 0);
            remoteViews.setViewVisibility(R.id.w_player_placeholder, 8);
            remoteViews.setImageViewResource(R.id.w_player_cover_placeholder, (f == null || !f.Vb()) ? R.drawable.ic_music_120 : R.drawable.ic_podcast_120);
            if (U0) {
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, AudioPlayerWidget.e(R.drawable.vk_icon_shuffle_24, -10842164, context));
                remoteViews.setContentDescription(R.id.w_player_shuffle, context.getString(R.string.music_talkback_shuffle_disable));
            } else {
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, AudioPlayerWidget.e(R.drawable.vk_icon_shuffle_24, context.getColor(R.color.vk_steel_gray_300), context));
                remoteViews.setContentDescription(R.id.w_player_shuffle, context.getString(R.string.music_talkback_shuffle_enable));
            }
            int i2 = a.a[repeatMode.ordinal()];
            if (i2 == 1) {
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_one_24, -10842164, context));
                remoteViews.setContentDescription(R.id.w_player_repeat, context.getString(R.string.music_talkback_repeat_off));
            } else if (i2 != 3) {
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_24, -10842164, context));
                remoteViews.setContentDescription(R.id.w_player_repeat, context.getString(R.string.music_talkback_repeat_one));
            } else {
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_24, context.getColor(R.color.vk_steel_gray_300), context));
                remoteViews.setContentDescription(R.id.w_player_repeat, context.getString(R.string.music_talkback_repeat_all));
            }
            if (!I1 || (f != null && (f.Vb() || f.Mb() || f.Ub()))) {
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, null);
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, null);
            }
            i = 0;
        } else {
            remoteViews.setViewVisibility(R.id.w_player_artist, 8);
            remoteViews.setViewVisibility(R.id.w_player_placeholder, 0);
            remoteViews.setTextViewText(R.id.w_player_placeholder, context.getString(z ? R.string.music_pause_alert_title : R.string.audio_widget_inactive));
            remoteViews.setViewVisibility(R.id.w_player_btns_wrap, 8);
            remoteViews.setViewVisibility(R.id.w_player_cover, 8);
            remoteViews.setImageViewResource(R.id.w_player_bg, R.drawable.transparent);
            i = 0;
            remoteViews.setViewVisibility(R.id.w_player_cover_placeholder, 0);
            remoteViews.setOnClickPendingIntent(R.id.w_player_cover_wrap, c);
            remoteViews.setOnClickPendingIntent(R.id.w_player_placeholder, c);
            remoteViews.setImageViewResource(R.id.w_player_cover_placeholder, R.drawable.ic_music_120);
        }
        remoteViews.setImageViewResource(R.id.w_player_prev, (z5 || f == null) ? i : (f.Vb() || f.Mb() || f.Ub()) ? R.drawable.vk_icon_replay_15_24 : R.drawable.vk_icon_skip_previous_36);
        remoteViews.setImageViewResource(R.id.w_player_next, (z2 || f == null) ? i : (f.Vb() || f.Mb() || f.Ub()) ? R.drawable.vk_icon_forward_15_24 : R.drawable.vk_icon_skip_next_36);
        int i3 = R.string.music_talkback_next;
        if (!z2 && f != null && (f.Vb() || f.Mb() || f.Ub())) {
            i3 = R.string.accessibility_rewind_on_15_sec_forward;
        }
        remoteViews.setContentDescription(R.id.w_player_next, context.getString(i3));
        int i4 = R.string.music_talkback_prev;
        if (!z5 && f != null && (f.Vb() || f.Mb() || f.Ub())) {
            i4 = R.string.accessibility_rewind_on_15_sec_backward;
        }
        remoteViews.setContentDescription(R.id.w_player_prev, context.getString(i4));
        if (iArr == null) {
            appWidgetManager.updateAppWidget(new ComponentName(context, (Class<?>) PlayerSmallWidget.class), remoteViews);
            return;
        }
        int length = iArr.length;
        for (int i5 = i; i5 < length; i5++) {
            appWidgetManager.updateAppWidget(iArr[i5], remoteViews);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        i(context, appWidgetManager, iArr);
    }
}
