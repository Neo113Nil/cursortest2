package com.vk.catalog2.common.ui.mvp.auto;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog2.common.ui.mvp.auto.AndroidAutoException;
import com.vk.catalog2.common.ui.mvp.auto.b;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.e;
import com.vk.music.player.f;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import defpackage.i0;
import defpackage.k0;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.ahe;
import xsna.b22;
import xsna.bn40;
import xsna.c5g;
import xsna.cp0;
import xsna.czw;
import xsna.d8u0;
import xsna.dx4;
import xsna.e43;
import xsna.e8u0;
import xsna.enj;
import xsna.epx;
import xsna.exi0;
import xsna.f22;
import xsna.fa40;
import xsna.g22;
import xsna.ga;
import xsna.gf0;
import xsna.gkj0;
import xsna.gs00;
import xsna.h22;
import xsna.h8u0;
import xsna.h9i0;
import xsna.hs1;
import xsna.hto0;
import xsna.i22;
import xsna.ia;
import xsna.iah0;
import xsna.is1;
import xsna.itg0;
import xsna.izs;
import xsna.j22;
import xsna.j990;
import xsna.k22;
import xsna.k840;
import xsna.k8u0;
import xsna.lqk0;
import xsna.m22;
import xsna.mp0;
import xsna.ms;
import xsna.n40;
import xsna.ns1;
import xsna.o25;
import xsna.o9;
import xsna.px0;
import xsna.q22;
import xsna.r6h;
import xsna.r6m;
import xsna.rl3;
import xsna.rsg0;
import xsna.s6;
import xsna.u2b0;
import xsna.u6;
import xsna.uy3;
import xsna.v5u0;
import xsna.vl0;
import xsna.waf0;
import xsna.wx00;
import xsna.xf40;
import xsna.y96;
import xsna.yfb;
import xsna.zm80;

/* compiled from: AndroidAutoMediaSessionCallbackImpl.kt */
/* loaded from: classes16.dex */
public final class a extends f22 {
    public final Context a;
    public final MediaSessionCompat b;
    public final m22 c;
    public final u2b0 d;
    public final com.vk.music.track.a e;
    public final b f;
    public final h8u0<q22> g;
    public C0494a h;
    public b.a i;
    public final e8u0 j;
    public final io.reactivex.rxjava3.disposables.b k = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: AndroidAutoMediaSessionCallbackImpl.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.auto.a$a, reason: collision with other inner class name */
    public final class C0494a extends e.a {
        public f b;

        public C0494a() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void K1() {
            a aVar = a.this;
            LoopMode repeatMode = aVar.d.getRepeatMode();
            aVar.b.setPlaybackState(a.e(aVar, null, 0L, false, repeatMode, 127));
            MediaSessionCompat mediaSessionCompat = aVar.b;
            int i = b22.a.$EnumSwitchMapping$1[repeatMode.ordinal()];
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            } else if (i == 2) {
                i2 = 2;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            mediaSessionCompat.setRepeatMode(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        
            if (xsna.epx.f(r2, r4 != null ? java.lang.Boolean.valueOf(r4.n()) : null) == false) goto L34;
         */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void N3(PlayState playState, f fVar) {
            String string;
            bn40.f("onStateChanged", " state:", String.valueOf(playState), " position:", Long.valueOf(fVar != null ? fVar.h() : 0L), " duration:", Long.valueOf(fVar != null ? fVar.e() : 0L));
            if (playState == null) {
                return;
            }
            if (playState == PlayState.PAUSED) {
                r6m.a.getClass();
                if (!r6m.b) {
                    long F0 = a.this.d.F0();
                    ms i = o25.a().i();
                    if (!k840.a.i.b() && F0 >= TimeUnit.MINUTES.toMillis(i.E)) {
                        a aVar = a.this;
                        aVar.c(aVar.a, "background_exceeded");
                        return;
                    }
                }
            }
            MediaMetadataCompat mediaMetadataCompat = null;
            if (playState != PlayState.PLAYING) {
                Boolean valueOf = fVar != null ? Boolean.valueOf(fVar.n()) : null;
                f fVar2 = this.b;
            }
            if (fVar != null) {
                a aVar2 = a.this;
                Context context = aVar2.a;
                int k = aVar2.d.k();
                int p = a.this.d.p();
                MusicTrack f = fVar.f();
                if (f != null) {
                    long j = !fVar.n() ? 0L : 1L;
                    AdvertisementInfo c = fVar.c();
                    SparseArray<Uri> sparseArray = c != null ? c.c : null;
                    Context context2 = e43.a;
                    int c2 = iah0.c(context2 != null ? context2 : null);
                    String Kb = fVar.n() ? f.Kb(c2) : sparseArray != null ? new Thumb(sparseArray).Ab(c2, false) : String.valueOf(enj.k(R.drawable.ic_song_placeholder_96, context));
                    if (fVar.n()) {
                        string = f.d;
                        if (string == null) {
                            string = "";
                        }
                    } else {
                        string = context.getString(R.string.audio_ad_title);
                    }
                    MediaMetadataCompat.Builder putString = new MediaMetadataCompat.Builder().putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, string).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, fVar.n() ? f.h : "");
                    if (Kb != null) {
                        putString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, Kb);
                    }
                    mediaMetadataCompat = putString.putLong(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, j).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, fVar.e()).putLong(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, k).putLong(MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, p).build();
                }
                if (mediaMetadataCompat != null) {
                    a.this.b.setMetadata(mediaMetadataCompat);
                }
            }
            this.b = fVar;
            a aVar3 = a.this;
            aVar3.b.setPlaybackState(a.e(aVar3, playState, fVar != null ? fVar.h() : 0L, false, null, 252));
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void n3() {
            a aVar = a.this;
            boolean U0 = aVar.d.U0();
            aVar.b.setPlaybackState(a.e(aVar, null, 0L, U0, null, 191));
            MediaSessionCompat mediaSessionCompat = aVar.b;
            int i = 1;
            if (!U0) {
                if (U0) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 0;
            }
            mediaSessionCompat.setShuffleMode(i);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[LOOP:2: B:27:0x007d->B:29:0x0083, LOOP_END] */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void y4(List<PlayerTrack> list) {
            ArrayList arrayList;
            List<izs<b.a, MediaDescriptionCompat>> list2;
            Iterator<T> it;
            Iterator it2;
            a aVar = a.this;
            b bVar = aVar.f;
            MediaSessionCompat mediaSessionCompat = aVar.b;
            ListBuilder listBuilder = null;
            if (list != null) {
                if (aVar.d.A0()) {
                    list = null;
                }
                if (list != null) {
                    List<PlayerTrack> list3 = list;
                    arrayList = new ArrayList(c5g.u(list3, 10));
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((PlayerTrack) it3.next()).b);
                    }
                    b.a aVar2 = aVar.i;
                    list2 = bVar.f;
                    if (arrayList != null && aVar2 != null) {
                        ListBuilder listBuilder2 = new ListBuilder(list2.size() + arrayList.size());
                        it = list2.iterator();
                        while (it.hasNext()) {
                            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) ((izs) it.next()).invoke(aVar2);
                            if (mediaDescriptionCompat != null) {
                                listBuilder2.add(new MediaSessionCompat.QueueItem(mediaDescriptionCompat, listBuilder2.size()));
                            }
                        }
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            listBuilder2.add(new MediaSessionCompat.QueueItem(bVar.b.a((MusicTrack) it2.next(), aVar2.a, aVar2.b, null).getDescription(), listBuilder2.size()));
                        }
                        listBuilder = listBuilder2.g();
                        bVar.e = listBuilder;
                    }
                    mediaSessionCompat.setQueue(listBuilder);
                    mediaSessionCompat.setQueueTitle(bVar.d);
                }
            }
            arrayList = null;
            b.a aVar22 = aVar.i;
            list2 = bVar.f;
            if (arrayList != null) {
                ListBuilder listBuilder22 = new ListBuilder(list2.size() + arrayList.size());
                it = list2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                }
                listBuilder = listBuilder22.g();
                bVar.e = listBuilder;
            }
            mediaSessionCompat.setQueue(listBuilder);
            mediaSessionCompat.setQueueTitle(bVar.d);
        }
    }

    public a(Context context, MediaSessionCompat mediaSessionCompat, m22 m22Var, u2b0 u2b0Var, com.vk.music.track.a aVar, b bVar, h8u0 h8u0Var) {
        this.a = context;
        this.b = mediaSessionCompat;
        this.c = m22Var;
        this.d = u2b0Var;
        this.e = aVar;
        this.f = bVar;
        this.g = h8u0Var;
        this.j = new e8u0(context, aVar, u2b0Var, new px0(this, 2));
    }

    public static PlaybackStateCompat e(a aVar, PlayState playState, long j, boolean z, LoopMode loopMode, int i) {
        long j2;
        u2b0 u2b0Var = aVar.d;
        PlayState m0 = (i & 1) != 0 ? u2b0Var.m0() : playState;
        if ((i & 2) != 0) {
            j2 = u2b0Var.H() != null ? r4.h() : 0L;
        } else {
            j2 = j;
        }
        long d = u2b0Var.H() != null ? r4.d() : 0L;
        long k = u2b0Var.k();
        int i2 = 1;
        boolean z2 = !aVar.e.i(u2b0Var.b());
        MusicTrack b = u2b0Var.b();
        boolean z3 = b != null && b.P;
        boolean U0 = (i & 64) != 0 ? u2b0Var.U0() : z;
        LoopMode repeatMode = (i & 128) != 0 ? u2b0Var.getRepeatMode() : loopMode;
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
        int i3 = b22.a.$EnumSwitchMapping$0[m0.ordinal()];
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 3;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 0;
            }
        }
        PlaybackStateCompat.Builder activeQueueItemId = builder.setState(i2, j2, 1.0f).setBufferedPosition(d).setActions(2427190L).setActiveQueueItemId(k + aVar.f.f.size());
        aVar.d(activeQueueItemId, z2, z3, U0, repeatMode);
        return activeQueueItemId.build();
    }

    @Override // xsna.f22
    public final PlaybackStateCompat a() {
        PlaybackStateCompat.Builder activeQueueItemId = new PlaybackStateCompat.Builder().setActions(2427190L).setBufferedPosition(0L).setState(1, -1L, 1.0f).setActiveQueueItemId(-1L);
        u2b0 u2b0Var = this.d;
        boolean z = !this.e.i(u2b0Var.b());
        MusicTrack b = u2b0Var.b();
        d(activeQueueItemId, z, b != null && b.P, u2b0Var.U0(), u2b0Var.getRepeatMode());
        return activeQueueItemId.build();
    }

    @Override // xsna.f22
    public final void b() {
        C0494a c0494a = this.h;
        if (c0494a != null) {
            this.d.n0(c0494a);
        }
        r6m.a.getClass();
        if (r6m.b) {
            this.d.stop(26);
        }
        this.b.setActive(false);
        this.k.dispose();
    }

    @Override // xsna.f22
    public final void c(Context context, String str) {
        bn40.f("parentId:", str);
        int i = AndroidAutoException.b;
        AndroidAutoException a = AndroidAutoException.a.a(context, str);
        this.b.setPlaybackState(new PlaybackStateCompat.Builder().setState(7, -1L, 1.0f).setErrorMessage(!epx.f(a.d(), "error") ? 1 : 0, a.getMessage()).build());
    }

    public final void d(PlaybackStateCompat.Builder builder, boolean z, boolean z2, boolean z3, LoopMode loopMode) {
        int i;
        int i2;
        int i3;
        int i4;
        PlaybackStateCompat.CustomAction customAction;
        int i5;
        int i6;
        int i7;
        int i8;
        u2b0 u2b0Var = this.d;
        if (u2b0Var.I1()) {
            MusicTrack b = u2b0Var.b();
            gkj0 gkj0Var = new gkj0(z3);
            PlaybackStateCompat.CustomAction customAction2 = null;
            if (u2b0Var.A0()) {
                gkj0Var = null;
            }
            if (u2b0Var.A0()) {
                loopMode = null;
            }
            Context context = this.j.a;
            if (z) {
                i = R.string.music_talkback_remove_from_my_music;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.music_talkback_add_to_my_music;
            }
            String string = context.getString(i);
            if (z) {
                i2 = R.drawable.vk_icon_done_36;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.drawable.vk_icon_add_36;
            }
            PlaybackStateCompat.CustomAction build = new PlaybackStateCompat.CustomAction.Builder("ACTION_LIKE", string, i2).setExtras(b != null ? yfb.b(new Pair("CUSTOM_ACTION.track_id", b.Fb())) : null).build();
            if (z2) {
                i3 = R.string.music_talkback_dislike_track_active;
            } else {
                if (z2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.music_talkback_dislike_track_not_active;
            }
            String string2 = context.getString(i3);
            if (z2) {
                i4 = R.drawable.vk_icon_dislike_circle_subtract_60;
            } else {
                if (z2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = R.drawable.vk_icon_dislike_circle_transparent_60;
            }
            PlaybackStateCompat.CustomAction build2 = new PlaybackStateCompat.CustomAction.Builder("ACTION_DISLIKE", string2, i4).setExtras(b != null ? yfb.b(new Pair("CUSTOM_ACTION.track_id", b.Fb())) : null).build();
            if (gkj0Var != null) {
                boolean z4 = gkj0Var.a;
                if (z4) {
                    i7 = R.string.music_talkback_shuffle_disable;
                } else {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = R.string.music_talkback_shuffle_enable;
                }
                String string3 = context.getString(i7);
                if (z4) {
                    i8 = R.drawable.vk_icon_shuffle_circle_subtract_60;
                } else {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i8 = R.drawable.vk_icon_shuffle_circle_transparent_60;
                }
                customAction = new PlaybackStateCompat.CustomAction.Builder("ACTION_SHUFFLE", string3, i8).setExtras(null).build();
            } else {
                customAction = null;
            }
            if (loopMode != null) {
                int[] iArr = b22.a.$EnumSwitchMapping$1;
                int i9 = iArr[loopMode.ordinal()];
                if (i9 == 1) {
                    i5 = R.string.music_talkback_repeat_all;
                } else if (i9 == 2) {
                    i5 = R.string.music_talkback_repeat_one;
                } else {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = R.string.music_talkback_repeat_off;
                }
                String string4 = context.getString(i5);
                int i10 = iArr[loopMode.ordinal()];
                if (i10 == 1) {
                    i6 = R.drawable.vk_icon_repeat_circle_transparent_60;
                } else if (i10 == 2) {
                    i6 = R.drawable.vk_icon_repeat_circle_subtract_60;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = R.drawable.vk_icon_repeat_1_circle_subtract_60;
                }
                customAction2 = new PlaybackStateCompat.CustomAction.Builder("ACTION_REPEAT", string4, i6).setExtras(null).build();
            }
            Iterator it = rl3.I(new PlaybackStateCompat.CustomAction[]{build, build2, customAction, customAction2}).iterator();
            while (it.hasNext()) {
                builder.addCustomAction((PlaybackStateCompat.CustomAction) it.next());
            }
        }
    }

    public final void f(MusicPlaybackLaunchContext musicPlaybackLaunchContext, MusicTrack musicTrack, List<MusicTrack> list, String str, PlayRequestTrigger playRequestTrigger, ShuffleMode shuffleMode) {
        this.c.b(str, list);
        this.i = new b.a(musicPlaybackLaunchContext, str);
        bn40.f("setting queue", Integer.valueOf(list.size()));
        int i = 0;
        AdsAudioPixelsContainer adsAudioPixelsContainer = null;
        this.d.N0(new lqk0(new StartPlayCatalogSource(str, null, null, null, epx.f(musicPlaybackLaunchContext.t(), "synthetic_offline_tracks_header"), null, 46, null), musicTrack, list, musicPlaybackLaunchContext, i, shuffleMode, playRequestTrigger, adsAudioPixelsContainer, 0L, 816));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        bn40.f("command: " + str + ", extras: " + bundle + ", cb: " + resultReceiver);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        MusicTrack b;
        MusicTrack b2;
        bn40.f("action: " + str + ", extras: " + bundle);
        e8u0 e8u0Var = this.j;
        com.vk.music.track.a aVar = e8u0Var.b;
        com.vk.music.track.a aVar2 = e8u0Var.b;
        u2b0 u2b0Var = e8u0Var.c;
        if (str != null) {
            int hashCode = str.hashCode();
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            switch (hashCode) {
                case -2088741424:
                    if (str.equals("ACTION_SHUFFLE")) {
                        u2b0Var.o();
                        break;
                    }
                    break;
                case -1345854524:
                    if (str.equals("ACTION_REPEAT")) {
                        u2b0Var.V0();
                        break;
                    }
                    break;
                case -528949248:
                    if (str.equals("ACTION_LIKE")) {
                        String string = bundle != null ? bundle.getString("CUSTOM_ACTION.track_id") : null;
                        MusicTrack b3 = u2b0Var.b();
                        if (epx.f(string, b3 != null ? b3.Fb() : null) && (b = u2b0Var.b()) != null) {
                            if (!aVar.i(b)) {
                                itg0.i(7, new a0(aVar.u1(b, true).E(new v5u0(new h9i0(6, e8u0Var, b), 1), lVar, kVar, kVar).F(new wx00(new hto0(4, e8u0Var, b), 28)), new y96(e8u0Var, 3)), null, null, null);
                                break;
                            } else {
                                if (b.P) {
                                    itg0.i(7, aVar.p1(b, true, false), null, null, null);
                                }
                                itg0.i(7, new a0(aVar2.e1(b, MusicPlaybackLaunchContext.A, true), new zm80(e8u0Var, 4)), null, null, null);
                                break;
                            }
                        }
                    }
                    break;
                case 1805536252:
                    if (str.equals("ACTION_DISLIKE")) {
                        String string2 = bundle != null ? bundle.getString("CUSTOM_ACTION.track_id") : null;
                        MusicTrack b4 = u2b0Var.b();
                        if (epx.f(string2, b4 != null ? b4.Fb() : null) && (b2 = u2b0Var.b()) != null) {
                            if (!b2.P) {
                                boolean i0 = aVar.i0(b2);
                                itg0.i(7, new a0((aVar.i0(b2) ? aVar.u1(b2, false).L(new gs00(new r6h(e8u0Var, b2, i0, 2), 21), false) : aVar.q1(b2, i0)).E(new j990(new exi0(b2, 29), 19), lVar, kVar, kVar), new uy3(e8u0Var, 10)), null, null, null);
                                break;
                            } else {
                                itg0.i(7, new a0(aVar2.p1(b2, false, true).E(new d8u0(new waf0(b2, 24), 0), lVar, kVar, kVar), new ahe(e8u0Var, 5)), null, null, null);
                                if (b2.l && b2.m) {
                                    itg0.i(7, new a0(aVar2.e1(b2, MusicPlaybackLaunchContext.A, true), new czw(e8u0Var, 1)), null, null, null);
                                    break;
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        bn40.f("mediaButtonEvent:", String.valueOf(intent));
        return super.onMediaButtonEvent(intent);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPause() {
        bn40.f(new Object[0]);
        this.d.pause(12);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlay() {
        bn40.f(new Object[0]);
        super.onPlay();
        this.d.f(new PlaybackActionMeta(12, 0L, 2, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        if (str == null) {
            bn40.d("mediaId is null");
            c(this.a, "error");
            return;
        }
        q22 a = this.g.a(str);
        boolean z = a instanceof q22.f;
        int i = 0;
        int i2 = 1;
        m22 m22Var = this.c;
        io.reactivex.rxjava3.disposables.b bVar = this.k;
        if (z) {
            q22.f fVar = (q22.f) a;
            bVar.b(m22Var.a(fVar.d, fVar.c).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cp0(new g22(i, fVar, this), i2)));
            return;
        }
        if (a instanceof q22.c) {
            q22.c cVar = (q22.c) a;
            bn40.f("fastPlay(id: " + cVar + ')');
            com.vk.core.utils.newtork.b.a.getClass();
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = com.vk.core.utils.newtork.b.d() ? MusicPlaybackLaunchContext.J : MusicPlaybackLaunchContext.I;
            if (cVar.b) {
                musicPlaybackLaunchContext = musicPlaybackLaunchContext.Ab();
            }
            bVar.b(m22Var.a(cVar.d, cVar.c).subscribe(new is1(new hs1(this, musicPlaybackLaunchContext, cVar, i2), i2)));
            return;
        }
        if (a instanceof q22.d) {
            q22.d dVar = (q22.d) a;
            bn40.f("playPlaylist(id: " + dVar + ')');
            Set<Integer> set = Playlist.P;
            Triple c = Playlist.a.c(dVar.a);
            UserId userId = (UserId) c.d();
            int intValue = ((Number) c.g()).intValue();
            ModernPlaylistModel c2 = k840.c.c(a.class, userId, intValue, (String) c.h());
            bVar.b(c2.F(dVar.d).subscribe(new i22(new h22(c2, this, dVar, userId, intValue), i), new gf0(new ns1(this, i2), i2)));
            return;
        }
        if (a instanceof q22.g) {
            q22.g gVar = (q22.g) a;
            bn40.f("playVkMix(mixId: " + gVar + ')');
            String str2 = gVar.c;
            String str3 = gVar.a;
            String string = gVar.d.b.getString("__META_TITLE");
            if (string == null) {
                string = "";
            }
            this.d.N0(new lqk0((StartPlaySource) new StartPlayVkMixSource(str2, "", str3, false, string, null, null, null, null, null, 992, null), (MusicTrack) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), MusicPlaybackLaunchContext.M.Bb(gVar.c), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
            return;
        }
        if (a instanceof q22.a) {
            q22.a aVar = (q22.a) a;
            bn40.f("playArtist(id: " + aVar + ')');
            bVar.b(((fa40) m22Var.b).b(aVar.a).l0(EmptyList.b).subscribe(new mp0(new u6(2, this, aVar), i2), new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, 6), 4)));
            return;
        }
        if (a instanceof q22.b) {
            q22.b bVar2 = (q22.b) a;
            bn40.f("playCurator(id: " + bVar2 + ')');
            String str4 = bVar2.a;
            ((xf40) m22Var.c).getClass();
            bVar.b(xf40.a(str4).l0(EmptyList.b).subscribe(new j22(new o9(i2, this, bVar2), i), new vl0(new s6(this, 5), 3)));
            return;
        }
        if (!(a instanceof q22.e)) {
            if (a != null) {
                throw new NoWhenBranchMatchedException();
            }
            bn40.h("unknown mediaId:", str.toString(), " extras: ", String.valueOf(bundle), ")");
        } else {
            bn40.f("playPodcast(id: " + ((q22.e) a) + ')');
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        super.onPlayFromSearch(str, bundle);
        bn40.f("onPlayFromSearch(query:", String.valueOf(str), " extras: ", bundle.toString(), ")");
        if (str == null || str.length() == 0) {
            return;
        }
        int i = 3;
        this.k.b(rsg0.y0(new dx4(str, MusicPlaybackLaunchContext.H.t()), null, null, 3).subscribe(new ia(new k22(0, str, this), i), new i0(new n40(this, i), 3)));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        bn40.f("onPlayFromUri(uri: : ", String.valueOf(uri), HandleInvocationsFromAdViewer.KEY_EXTRAS, String.valueOf(bundle), ")");
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepare() {
        bn40.f(new Object[0]);
        super.onPrepare();
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        super.onPrepareFromSearch(str, bundle);
        bn40.f("onPrepareFromSearch(query:", String.valueOf(str), " extras: ", String.valueOf(bundle), ")");
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSeekTo(long j) {
        bn40.f(k0.a(j, "pos:"));
        PlaybackActionMeta playbackActionMeta = new PlaybackActionMeta(19, 0L, 2, null);
        this.d.G0((int) j, playbackActionMeta);
        this.b.setPlaybackState(e(this, null, j, false, null, 253));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToNext() {
        bn40.f(new Object[0]);
        this.d.s0(new PlaybackActionMeta(13, 0L, 2, null));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToPrevious() {
        bn40.f(new Object[0]);
        this.d.w0(true, new PlaybackActionMeta(14, 0L, 2, null));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onSkipToQueueItem(long j) {
        PlayerTrack playerTrack;
        Object obj;
        super.onSkipToQueueItem(j);
        bn40.f("id:", Long.valueOf(j));
        u2b0 u2b0Var = this.d;
        List<PlayerTrack> g = u2b0Var.g();
        int i = (int) j;
        b bVar = this.f;
        int size = i - bVar.f.size();
        if (size < 0 || size >= g.size()) {
            playerTrack = null;
        } else {
            k8u0 k8u0Var = bVar.c;
            String mediaId = ((MediaSessionCompat.QueueItem) bVar.e.get(i)).getDescription().getMediaId();
            if (mediaId == null) {
                mediaId = "";
            }
            q22 a = k8u0Var.a.a(mediaId);
            q22.f fVar = a instanceof q22.f ? (q22.f) a : null;
            PlayerTrack playerTrack2 = g.get(size);
            if (!epx.f(playerTrack2.b.Ib(), fVar != null ? fVar.a : null)) {
                playerTrack2 = null;
            }
            playerTrack = playerTrack2;
            if (playerTrack == null) {
                Iterator<T> it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((PlayerTrack) obj).b.Ib(), fVar != null ? fVar.a : null)) {
                            break;
                        }
                    }
                }
                playerTrack = (PlayerTrack) obj;
            }
        }
        if (playerTrack != null) {
            u2b0.v0(u2b0Var, playerTrack, null, 14);
        } else {
            MediaDescriptionCompat description = ((MediaSessionCompat.QueueItem) bVar.e.get(i)).getDescription();
            onPlayFromMediaId(description.getMediaId(), description.getExtras());
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public final void onStop() {
        bn40.f(new Object[0]);
        this.d.stop(26);
    }
}
