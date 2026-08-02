package com.vk.music.player.playback;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceSourceDto;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.StartPlayAudioIds;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlaySingleTrackSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayUserSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import io.reactivex.rxjava3.disposables.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.cx00;
import xsna.efz;
import xsna.epx;
import xsna.go9;
import xsna.gza0;
import xsna.ie90;
import xsna.ix4;
import xsna.mm1;
import xsna.o440;
import xsna.ox80;
import xsna.q76;
import xsna.qjg;
import xsna.rsg0;
import xsna.s3q0;
import xsna.t34;
import xsna.tfx;
import xsna.wzs;
import xsna.yba;
import xsna.yfb;

/* compiled from: PlaybackTrackListSourceImpl.kt */
/* loaded from: classes3.dex */
public final class d extends q76 {
    public final ix4 c;

    public d() {
        super(2);
        this.c = new ix4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.q76
    public final void k(StartPlaySource startPlaySource, MusicPlaybackLaunchContext musicPlaybackLaunchContext, AdsAudioPixelsContainer adsAudioPixelsContainer, wzs<? super List<gza0>, ? super String, s3q0> wzsVar) {
        tfx e;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"source = ".concat(qjg.a(startPlaySource))});
        }
        com.vk.core.utils.newtork.b.a.getClass();
        Object obj = null;
        if (!com.vk.core.utils.newtork.b.d()) {
            f();
            wzsVar.invoke(EmptyList.b, null);
            return;
        }
        yba ybaVar = startPlaySource instanceof yba ? (yba) startPlaySource : null;
        String v0 = ybaVar != null ? ybaVar.v0() : null;
        PlaybackLaunchMeta playbackLaunchMeta = new PlaybackLaunchMeta(musicPlaybackLaunchContext, v0 == null ? "" : v0, PlayableType.MUSIC_TRACK, startPlaySource.zb(), adsAudioPixelsContainer);
        String Lb = MusicPlaybackLaunchContext.Fb(playbackLaunchMeta.zb()).Cb(musicPlaybackLaunchContext.Gb()).Lb();
        if (startPlaySource instanceof StartPlaySingleTrackSource) {
            f();
            wzsVar.invoke(EmptyList.b, null);
            return;
        }
        if (startPlaySource instanceof StartPlayAudioIds) {
            f();
            List<String> list = ((StartPlayAudioIds) startPlaySource).c;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q76.n((String) it.next(), "", playbackLaunchMeta));
            }
            wzsVar.invoke(arrayList, null);
            return;
        }
        boolean z = startPlaySource instanceof StartPlayCatalogSource;
        ix4 ix4Var = this.c;
        if (z) {
            e = ix4Var.e(AudioGetIdsBySourceSourceDto.CATALOG, ((StartPlayCatalogSource) startPlaySource).c, Lb);
        } else if (startPlaySource instanceof StartPlayPlaylistSource) {
            e = ix4Var.e(AudioGetIdsBySourceSourceDto.PLAYLIST, ((StartPlayPlaylistSource) startPlaySource).Bb(), playbackLaunchMeta.zb());
        } else if (startPlaySource instanceof StartPlayUserSource) {
            e = ix4Var.e(AudioGetIdsBySourceSourceDto.PLAYLIST, efz.b(((StartPlayUserSource) startPlaySource).c.b, "_-1", new StringBuilder()), playbackLaunchMeta.zb());
        } else {
            if (!(startPlaySource instanceof StartPlayEntitySource)) {
                wzsVar.invoke(EmptyList.b, null);
                f();
                return;
            }
            Iterator<E> it2 = AudioGetIdsBySourceSourceDto.i().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (epx.f(((AudioGetIdsBySourceSourceDto) next).j(), ((StartPlayEntitySource) startPlaySource).c.h())) {
                    obj = next;
                    break;
                }
            }
            AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto = (AudioGetIdsBySourceSourceDto) obj;
            StartPlayEntitySource startPlayEntitySource = (StartPlayEntitySource) startPlaySource;
            String str = startPlayEntitySource.d;
            if (startPlayEntitySource.c == StartPlayEntitySource.PlayEntitySource.IM) {
                str = go9.b(BundleUtil.UNDERLINE_TAG, str);
            }
            e = ix4Var.e(audioGetIdsBySourceSourceDto, str, playbackLaunchMeta.zb());
        }
        ((g) this.b).b(rsg0.T(yfb.x(e)).U(new t34(new mm1(24, this, playbackLaunchMeta), 28)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ox80(new ie90(wzsVar, 3), 1), new cx00(new o440(wzsVar, 12), 13)));
    }
}
