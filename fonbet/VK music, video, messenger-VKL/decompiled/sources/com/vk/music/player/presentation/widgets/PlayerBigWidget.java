package com.vk.music.player.presentation.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
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
import xsna.cl30;
import xsna.iah0;
import xsna.k840;
import xsna.rkz;
import xsna.tib;
import xsna.u2b0;
import xsna.va4;

/* loaded from: classes3.dex */
public class PlayerBigWidget extends AudioPlayerWidget {

    @Nullable
    public static c b = null;
    public static int c = -1;
    public static int d = -1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        PendingIntent pendingIntent;
        boolean z4;
        Intent a2;
        PendingIntent h;
        boolean z5;
        Intent intent;
        PendingIntent h2;
        String str;
        int i2;
        int i3;
        int i4;
        tib a3 = k840.e.a();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_player_big);
        u2b0 b2 = k840.a.g().b();
        f H = b2.H();
        PlayState m0 = b2.m0();
        LoopMode repeatMode = b2.getRepeatMode();
        MusicTrack f = H == null ? null : H.f();
        boolean U0 = b2.U0();
        boolean z6 = f != null;
        boolean z7 = AudioPlayerWidget.f(b2) && z6;
        boolean z8 = H == null || !H.l(PlayerAction.changeTrackNext);
        boolean z9 = H == null || !H.l(PlayerAction.changeTrackPrev);
        boolean z10 = z7 && !m0.i();
        boolean z11 = (m0.i() || z7) ? false : true;
        boolean I1 = b2.I1();
        PendingIntent b3 = AudioPlayerWidget.b(context, "big_player_widget");
        PendingIntent c2 = AudioPlayerWidget.c(context, "big_player_widget");
        PendingIntent d2 = AudioPlayerWidget.d(context, "big_player_widget");
        if (z11) {
            if (z6) {
                boolean l = H.l(PlayerAction.playPause);
                f.a.C1335a c1335a = H.j;
                if (l) {
                    z = U0;
                    z2 = z9;
                    z3 = z8;
                    Parcelable playbackActionMeta = new PlaybackActionMeta(12, SystemClock.elapsedRealtime());
                    Intent a4 = a3.a(context, MusicPlayerAction.ACTION_TOGGLE_RESUME_PAUSE, null);
                    a4.putExtra("EXTRA_ACTION_META", playbackActionMeta);
                    pendingIntent = AudioPlayerWidget.h(context, "big_player_widget", a4);
                } else {
                    z = U0;
                    z2 = z9;
                    z3 = z8;
                    pendingIntent = null;
                }
                remoteViews.setOnClickPendingIntent(R.id.w_player_play_pause, pendingIntent);
                if (z3) {
                    z4 = z6;
                    h = null;
                } else {
                    if (f.Vb() || f.Mb() || f.Ub()) {
                        z4 = z6;
                        Parcelable playbackActionMeta2 = new PlaybackActionMeta(24, SystemClock.elapsedRealtime());
                        a2 = a3.a(context, MusicPlayerAction.ACTION_NEXT_15, null);
                        a2.putExtra("EXTRA_ACTION_META", playbackActionMeta2);
                    } else {
                        z4 = z6;
                        Parcelable playbackActionMeta3 = new PlaybackActionMeta(13, SystemClock.elapsedRealtime());
                        a2 = a3.a(context, MusicPlayerAction.ACTION_NEXT, null);
                        a2.putExtra("EXTRA_ACTION_META", playbackActionMeta3);
                    }
                    h = AudioPlayerWidget.h(context, "big_player_widget", a2);
                }
                remoteViews.setOnClickPendingIntent(R.id.w_player_next, h);
                if (z2) {
                    h2 = null;
                    str = 0;
                } else {
                    if (f.Vb() || f.Mb() || f.Ub()) {
                        Parcelable playbackActionMeta4 = new PlaybackActionMeta(25, SystemClock.elapsedRealtime());
                        z5 = false;
                        Intent a5 = a3.a(context, MusicPlayerAction.ACTION_PREV_15, null);
                        a5.putExtra("EXTRA_ACTION_META", playbackActionMeta4);
                        intent = a5;
                    } else {
                        z5 = false;
                        intent = a3.c(context, true, new PlaybackActionMeta(14, SystemClock.elapsedRealtime()), null);
                    }
                    h2 = AudioPlayerWidget.h(context, "big_player_widget", intent);
                    str = z5;
                }
                remoteViews.setOnClickPendingIntent(R.id.w_player_prev, h2);
                remoteViews.setOnClickPendingIntent(R.id.w_player_shuffle, H.l(PlayerAction.shuffle) ? AudioPlayerWidget.h(context, "big_player_widget", a3.a(context, MusicPlayerAction.ACTION_TOGGLE_SHUFFLE, str)) : str);
                remoteViews.setOnClickPendingIntent(R.id.w_player_repeat, H.l(PlayerAction.repeat) ? AudioPlayerWidget.h(context, "big_player_widget", a3.a(context, MusicPlayerAction.ACTION_TOGGLE_REPEAT, str)) : null);
                StringBuilder sb = new StringBuilder();
                sb.append(c1335a.i(H, H.k));
                sb.append(TextUtils.isEmpty(c1335a.c(H, H.k)) ? "" : " " + c1335a.c(H, H.k));
                remoteViews.setTextViewText(R.id.w_player_title, sb.toString());
                remoteViews.setTextViewText(R.id.w_player_artist, c1335a.g(H, H.k));
                remoteViews.setOnClickPendingIntent(R.id.w_player_cover, !I1 ? b3 : d2);
                remoteViews.setOnClickPendingIntent(R.id.w_player_clickbox, !I1 ? b3 : d2);
                c cVar = b;
                if (cVar != null) {
                    cVar.dispose();
                }
                if (I1) {
                    if (c == -1) {
                        c = context.getResources().getDimensionPixelSize(R.dimen.player_big_widget_width);
                        d = context.getResources().getDimensionPixelSize(R.dimen.player_big_widget_height);
                    }
                    b = new a0(AudioPlayerWidget.a(f, iah0.c(context)), new va4(1)).subscribe(new rkz(remoteViews, 15), new cl30(remoteViews, 6));
                } else {
                    remoteViews.setViewVisibility(R.id.w_player_cover, 8);
                    remoteViews.setViewVisibility(R.id.w_player_placeholder, 0);
                }
                remoteViews.setImageViewResource(R.id.w_player_placeholder, f.Vb() ? R.drawable.aplayer_cover_placeholder_podcast : R.drawable.aplayer_cover_placeholder);
            } else {
                remoteViews.setImageViewResource(R.id.w_player_placeholder, R.drawable.aplayer_cover_placeholder);
                z = U0;
                z2 = z9;
                z3 = z8;
                z4 = z6;
            }
            remoteViews.setViewVisibility(R.id.w_player_shuffle, (z4 && (f.Vb() || f.Mb() || f.Ub())) ? 8 : 0);
            remoteViews.setViewVisibility(R.id.w_player_repeat, (z4 && (f.Vb() || f.Mb() || f.Ub())) ? 8 : 0);
            if (z2 || f == null) {
                i2 = -1;
                i3 = 0;
            } else if (f.Vb() || f.Mb() || f.Ub()) {
                i3 = R.drawable.vk_icon_replay_15_36;
                i2 = -1;
            } else {
                i2 = -1;
                i3 = R.drawable.vk_icon_skip_previous_48;
            }
            remoteViews.setImageViewBitmap(R.id.w_player_prev, AudioPlayerWidget.e(i3, i2, context));
            int i5 = (z3 || f == null) ? 0 : (f.Vb() || f.Mb() || f.Ub()) ? R.drawable.ic_forward_15_36 : R.drawable.vk_icon_skip_next_48;
            if (i5 != 0) {
                remoteViews.setImageViewBitmap(R.id.w_player_next, AudioPlayerWidget.e(i5, -1, context));
            }
            remoteViews.setContentDescription(R.id.w_player_next, context.getString((z3 || f == null || !(f.Vb() || f.Mb() || f.Ub())) ? R.string.music_talkback_next : R.string.accessibility_rewind_on_15_sec_forward));
            remoteViews.setContentDescription(R.id.w_player_prev, context.getString((z2 || f == null || !(f.Vb() || f.Mb() || f.Ub())) ? R.string.music_talkback_prev : R.string.accessibility_rewind_on_15_sec_backward));
            remoteViews.setBoolean(R.id.w_player_artist, "setSingleLine", true);
            remoteViews.setImageViewBitmap(R.id.w_player_play_pause, AudioPlayerWidget.e(m0.h() ? R.drawable.vk_icon_pause_48 : R.drawable.vk_icon_play_48, -1, context));
            remoteViews.setContentDescription(R.id.w_player_play_pause, context.getString(m0.h() ? R.string.music_talkback_pause : R.string.music_talkback_play));
            if (z) {
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, AudioPlayerWidget.e(R.drawable.vk_icon_shuffle_24, -10842164, context));
                remoteViews.setContentDescription(R.id.w_player_shuffle, context.getString(R.string.music_talkback_shuffle_disable));
            } else {
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, AudioPlayerWidget.e(R.drawable.vk_icon_shuffle_24, -1, context));
                remoteViews.setContentDescription(R.id.w_player_shuffle, context.getString(R.string.music_talkback_shuffle_enable));
            }
            int i6 = a.a[repeatMode.ordinal()];
            if (i6 == 1) {
                i4 = R.id.w_player_repeat;
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_one_24, -10842164, context));
                remoteViews.setContentDescription(R.id.w_player_repeat, context.getString(R.string.music_talkback_repeat_off));
            } else if (i6 != 3) {
                Bitmap e = AudioPlayerWidget.e(R.drawable.vk_icon_repeat_24, -10842164, context);
                i4 = R.id.w_player_repeat;
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, e);
                remoteViews.setContentDescription(R.id.w_player_repeat, context.getString(R.string.music_talkback_repeat_one));
            } else {
                i4 = R.id.w_player_repeat;
                remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_24, -1, context));
                remoteViews.setContentDescription(R.id.w_player_repeat, context.getString(R.string.music_talkback_repeat_all));
            }
            if (!I1) {
                remoteViews.setImageViewBitmap(i4, null);
                remoteViews.setImageViewBitmap(R.id.w_player_shuffle, null);
            }
            remoteViews.setViewVisibility(R.id.w_player_inactive_view, 8);
            i = 0;
        } else {
            remoteViews.setOnClickPendingIntent(R.id.w_player_clickbox, c2);
            remoteViews.setOnClickPendingIntent(R.id.w_player_cover, c2);
            remoteViews.setTextViewText(R.id.w_player_title, "");
            remoteViews.setTextViewText(R.id.w_player_artist, "");
            remoteViews.setViewVisibility(R.id.w_player_cover, 8);
            i = 0;
            remoteViews.setViewVisibility(R.id.w_player_placeholder, 0);
            remoteViews.setViewVisibility(R.id.w_player_inactive_view, 0);
            remoteViews.setTextViewText(R.id.w_player_inactive_view, context.getString(z10 ? R.string.music_pause_alert_title : R.string.audio_widget_inactive));
            remoteViews.setOnClickPendingIntent(R.id.w_player_play_pause, null);
            remoteViews.setOnClickPendingIntent(R.id.w_player_next, null);
            remoteViews.setOnClickPendingIntent(R.id.w_player_prev, null);
            remoteViews.setOnClickPendingIntent(R.id.w_player_shuffle, null);
            remoteViews.setOnClickPendingIntent(R.id.w_player_repeat, null);
            remoteViews.setImageViewBitmap(R.id.w_player_prev, AudioPlayerWidget.e(R.drawable.vk_icon_skip_previous_48, -1, context));
            remoteViews.setImageViewBitmap(R.id.w_player_next, AudioPlayerWidget.e(R.drawable.vk_icon_skip_next_48, -1, context));
            remoteViews.setContentDescription(R.id.w_player_next, context.getString(R.string.music_talkback_next));
            remoteViews.setContentDescription(R.id.w_player_next, context.getString(R.string.music_talkback_prev));
            remoteViews.setImageViewBitmap(R.id.w_player_shuffle, AudioPlayerWidget.e(R.drawable.vk_icon_shuffle_24, -1, context));
            remoteViews.setImageViewBitmap(R.id.w_player_repeat, AudioPlayerWidget.e(R.drawable.vk_icon_repeat_24, -1, context));
        }
        if (iArr == null) {
            appWidgetManager.updateAppWidget(new ComponentName(context, (Class<?>) PlayerBigWidget.class), remoteViews);
            return;
        }
        int length = iArr.length;
        for (int i7 = i; i7 < length; i7++) {
            appWidgetManager.updateAppWidget(iArr[i7], remoteViews);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        i(context, appWidgetManager, iArr);
    }
}
