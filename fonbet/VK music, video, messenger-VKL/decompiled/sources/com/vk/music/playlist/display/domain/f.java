package com.vk.music.playlist.display.domain;

import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.playlist.display.data.LoadPlaylistStateValue;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.music.playlist.display.domain.e;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a020;
import xsna.c5g;
import xsna.di40;
import xsna.dm50;
import xsna.drm0;
import xsna.eph;
import xsna.epx;
import xsna.hqz;
import xsna.iqz;
import xsna.j5g;
import xsna.jqz;
import xsna.lab0;
import xsna.on00;
import xsna.pn00;
import xsna.rd1;
import xsna.s3q0;
import xsna.s490;
import xsna.sdz;
import xsna.ucp;
import xsna.yfn;

/* compiled from: DisplayMusicPlaylistReducer.kt */
/* loaded from: classes3.dex */
public final class f extends dm50<i, e, yfn> {
    public final sdz d;

    /* compiled from: DisplayMusicPlaylistReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LoadPlaylistTracksRequest.State.values().length];
            try {
                iArr[LoadPlaylistTracksRequest.State.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadPlaylistTracksRequest.State.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadPlaylistTracksRequest.State.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoadPlaylistStateValue.values().length];
            try {
                iArr2[LoadPlaylistStateValue.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LoadPlaylistStateValue.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LoadPlaylistStateValue.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LoadPlaylistStateValue.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public f(yfn yfnVar, sdz sdzVar) {
        super(yfnVar);
        this.d = sdzVar;
    }

    public static lab0.a i(MusicTrack musicTrack, yfn yfnVar, int i) {
        String str;
        ucp ucpVar = ucp.a;
        StringBuilder sb = new StringBuilder();
        List<Artist> list = musicTrack.t;
        if (list != null) {
            str = s490.i(list);
        } else {
            str = musicTrack.h;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        sb.append(' ');
        sb.append(s490.c(musicTrack.u));
        CharSequence i2 = ucp.i(drm0.p0(sb.toString()).toString());
        String Fb = musicTrack.Fb();
        Thumb Jb = musicTrack.Jb();
        String obj = i2.toString();
        String str2 = musicTrack.d;
        String str3 = str2 == null ? "" : str2;
        String str4 = musicTrack.e;
        return new lab0.a(Fb, Jb, obj, str3, str4 == null ? "" : str4, musicTrack.Lb(), (musicTrack.B() || musicTrack.Pb()) ? false : true, epx.f(yfnVar.l, musicTrack.Fb()) ? yfnVar.k : MusicTrackPlayState.NONE, di40.a(musicTrack.J), musicTrack.f, musicTrack.B, i);
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.dm50
    public final yfn c(yfn yfnVar, e eVar) {
        lab0.a aVar;
        yfn yfnVar2 = yfnVar;
        e eVar2 = eVar;
        Map<String, MusicTrack> map = yfnVar2.n;
        LoadPlaylistTracksRequest loadPlaylistTracksRequest = yfnVar2.s;
        List<lab0.a> list = yfnVar2.m;
        if (eVar2 instanceof e.k) {
            jqz jqzVar = ((e.k) eVar2).b;
            if (epx.f(jqzVar, jqz.b.a)) {
                return yfn.a(yfnVar2, LoadPlaylistStateValue.LOADING, null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, false, null, null, 8388590);
            }
            if (epx.f(jqzVar, jqz.c.a)) {
                return yfn.a(yfnVar2, LoadPlaylistStateValue.REFRESHING, null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, false, null, null, 8388590);
            }
            if (jqzVar instanceof jqz.a) {
                return yfn.a(yfnVar2, LoadPlaylistStateValue.ERROR, null, ((jqz.a) jqzVar).a, null, null, null, null, null, null, null, null, 0L, false, null, null, false, null, null, 8388590);
            }
            if (jqzVar instanceof iqz) {
                iqz iqzVar = (iqz) jqzVar;
                return yfn.a(yfnVar2, LoadPlaylistStateValue.COMPLETED, iqzVar.a, null, iqzVar.b, iqzVar.c, iqzVar.d, iqzVar.e, null, null, EmptyList.b, new LinkedHashMap(), 0L, false, null, null, false, iqzVar.g, null, 6276620);
            }
            if (!(jqzVar instanceof hqz)) {
                throw new NoWhenBranchMatchedException();
            }
            hqz hqzVar = (hqz) jqzVar;
            List<MusicTrack> list2 = hqzVar.b;
            LinkedHashMap linkedHashMap = hqzVar.c;
            List<MusicTrack> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            int i = 0;
            for (MusicTrack musicTrack : list3) {
                if (linkedHashMap.containsKey(musicTrack.Fb())) {
                    i = 0;
                }
                i++;
                arrayList.add(i(musicTrack, yfnVar2, i));
            }
            LoadPlaylistStateValue loadPlaylistStateValue = LoadPlaylistStateValue.COMPLETED;
            Playlist playlist = hqzVar.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (MusicTrack musicTrack2 : list3) {
                String Fb = musicTrack2.Fb();
                String str = musicTrack2.y;
                if (str == null) {
                    str = "";
                }
                arrayList2.add(new AudioAudioRawIdTrackedDto(Fb, str));
            }
            int e = on00.e(c5g.u(list3, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
            for (Object obj : list3) {
                linkedHashMap2.put(((MusicTrack) obj).Fb(), obj);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            Iterator it = arrayList.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((lab0.a) it.next()).j;
            }
            return yfn.a(yfnVar2, loadPlaylistStateValue, playlist, null, EmptyList.b, null, null, arrayList2, null, null, arrayList, linkedHashMap3, j, false, LoadPlaylistTracksRequest.a(loadPlaylistTracksRequest, list2.size(), LoadPlaylistTracksRequest.State.COMPLETED, 43), null, false, linkedHashMap, null, 6145548);
        }
        if (eVar2 instanceof e.m) {
            return yfn.a(yfnVar2, null, ((e.m) eVar2).b, null, null, null, null, null, null, null, null, null, 0L, false, null, null, false, null, null, 8388605);
        }
        if (eVar2 instanceof e.l) {
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, null, null, 0L, false, ((e.l) eVar2).b, null, false, null, null, 8257535);
        }
        if (eVar2 instanceof e.b) {
            e.b bVar = (e.b) eVar2;
            List<MusicTrack> list4 = bVar.c;
            int size = list.size();
            List<lab0.a> list5 = list;
            List<MusicTrack> list6 = list4;
            ArrayList arrayList3 = new ArrayList();
            for (MusicTrack musicTrack3 : list6) {
                if (yfnVar2.w.containsKey(musicTrack3.Fb())) {
                    size = 0;
                }
                if (map.containsKey(musicTrack3.Fb())) {
                    aVar = null;
                } else {
                    size++;
                    aVar = i(musicTrack3, yfnVar2, size);
                }
                if (aVar != null) {
                    arrayList3.add(aVar);
                }
            }
            ArrayList u0 = j5g.u0(arrayList3, list5);
            ArrayList arrayList4 = new ArrayList(c5g.u(list6, 10));
            for (MusicTrack musicTrack4 : list6) {
                arrayList4.add(new Pair(musicTrack4.Fb(), musicTrack4));
            }
            pn00.p(map, arrayList4);
            s3q0 s3q0Var = s3q0.a;
            Iterator it2 = u0.iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                j2 += ((lab0.a) it2.next()).j;
            }
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, u0, map, j2, false, bVar.b, null, false, null, null, 8243199);
        }
        if (eVar2 instanceof e.C1348e) {
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, null, null, 0L, false, null, ((e.C1348e) eVar2).b, false, null, null, 8126463);
        }
        if (eVar2 instanceof e.c) {
            e.c cVar = (e.c) eVar2;
            String str2 = cVar.b;
            MusicTrackPlayState musicTrackPlayState = str2 == null ? MusicTrackPlayState.NONE : cVar.c ? MusicTrackPlayState.PLAYING : MusicTrackPlayState.PAUSED;
            List<lab0.a> list7 = list;
            ArrayList arrayList5 = new ArrayList(c5g.u(list7, 10));
            for (lab0.a aVar2 : list7) {
                arrayList5.add(lab0.a.a(aVar2, epx.f(cVar.b, aVar2.a) ? musicTrackPlayState : MusicTrackPlayState.NONE, null, 3967));
            }
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, musicTrackPlayState, str2, arrayList5, null, 0L, false, null, null, false, null, null, 8385023);
        }
        if (eVar2.equals(e.g.b)) {
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, MusicTrackPlayState.REQUESTED, null, null, null, 0L, false, null, null, false, null, null, 8387071);
        }
        if (eVar2 instanceof e.i) {
            e.i iVar = (e.i) eVar2;
            String str3 = iVar.b;
            List<lab0.a> list8 = list;
            ArrayList arrayList6 = new ArrayList(c5g.u(list8, 10));
            for (lab0.a aVar3 : list8) {
                if (epx.f(str3, aVar3.a)) {
                    aVar3 = lab0.a.a(aVar3, null, di40.a(iVar.c), 3839);
                }
                arrayList6.add(aVar3);
            }
            MusicTrack musicTrack5 = map.get(str3);
            if (musicTrack5 != null) {
                map.put(str3, MusicTrack.zb(musicTrack5, 0, null, 0, 0, null, false, null, iVar.c, false, false, null, null, null, -1, 1048571));
            }
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, arrayList6, map, 0L, false, null, null, false, null, null, 8382463);
        }
        if (eVar2 instanceof e.j) {
            e.j jVar = (e.j) eVar2;
            List<lab0.a> list9 = list;
            ArrayList arrayList7 = new ArrayList(c5g.u(list9, 10));
            for (lab0.a aVar4 : list9) {
                DownloadingState downloadingState = jVar.b.get(aVar4.a);
                if (downloadingState != null) {
                    aVar4 = lab0.a.a(aVar4, null, di40.a(downloadingState), 3839);
                }
                arrayList7.add(aVar4);
            }
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, arrayList7, null, 0L, false, null, null, false, null, null, 8386559);
        }
        if (eVar2 instanceof e.n) {
            return yfn.a(yfnVar2, null, Playlist.zb(yfnVar2.c, null, null, null, ((e.n) eVar2).b, -1, 254), null, null, null, null, null, null, null, null, null, 0L, false, null, null, false, null, null, 8388605);
        }
        if (eVar2 instanceof e.f) {
            return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, null, null, 0L, ((e.f) eVar2).b, null, null, false, null, null, 8372223);
        }
        if (!(eVar2 instanceof e.h)) {
            if (eVar2 instanceof e.d) {
                return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, ((e.d) eVar2).b, null, null, 7864319);
            }
            if (eVar2 instanceof e.a) {
                return yfn.a(yfnVar2, null, null, null, null, null, null, null, null, null, null, null, 0L, false, null, null, false, null, ((e.a) eVar2).b, 4194303);
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj2 : list) {
            if (!epx.f(((lab0.a) obj2).a, ((e.h) eVar2).b.Fb())) {
                arrayList8.add(obj2);
            }
        }
        MusicTrack musicTrack6 = ((e.h) eVar2).b;
        MusicTrackPlayState musicTrackPlayState2 = epx.f(musicTrack6.Fb(), yfnVar2.l) ? MusicTrackPlayState.PAUSED : yfnVar2.k;
        List<AudioAudioRawIdTrackedDto> list10 = yfnVar2.j;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj3 : list10) {
            if (!epx.f(a020.p((AudioAudioRawIdTrackedDto) obj3), musicTrack6.Fb())) {
                arrayList9.add(obj3);
            }
        }
        Iterator it3 = arrayList8.iterator();
        long j3 = 0;
        while (it3.hasNext()) {
            j3 += ((lab0.a) it3.next()).j;
        }
        return yfn.a(yfnVar2, null, null, null, null, null, null, arrayList9, musicTrackPlayState2, null, arrayList8, null, j3, false, LoadPlaylistTracksRequest.a(loadPlaylistTracksRequest, loadPlaylistTracksRequest.c - 1, null, 59), null, false, null, null, 8246527);
    }

    @Override // xsna.dm50
    public final i d() {
        return new i(e(new rd1(15)), e(g.b), e(new eph(this, 11)));
    }

    @Override // xsna.dm50
    public final void h(yfn yfnVar, i iVar) {
        yfn yfnVar2 = yfnVar;
        i iVar2 = iVar;
        int i = a.$EnumSwitchMapping$1[yfnVar2.b.ordinal()];
        if (i == 1) {
            f(iVar2.a, yfnVar2);
            return;
        }
        if (i == 2) {
            f(iVar2.b, yfnVar2);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f(iVar2.c, yfnVar2);
        }
    }
}
