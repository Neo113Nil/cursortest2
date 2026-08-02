package com.vk.music.offline.impl.sync;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioAudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioGetUserConfigResponseDto;
import com.vk.api.generated.audio.dto.AudioMoosicAudioDto;
import com.vk.api.generated.audio.dto.AudioMoosicPlaylistDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioStandaloneMigrationStateResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.music.offline.impl.sync.a;
import defpackage.j0;
import io.reactivex.rxjava3.core.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import xsna.aa6;
import xsna.by5;
import xsna.c5g;
import xsna.ca6;
import xsna.com;
import xsna.cqm0;
import xsna.eiy;
import xsna.f6w;
import xsna.fl30;
import xsna.gvs;
import xsna.h7;
import xsna.hx4;
import xsna.i630;
import xsna.ij8;
import xsna.ix4;
import xsna.j5n;
import xsna.j89;
import xsna.jr;
import xsna.jt4;
import xsna.kr;
import xsna.mp3;
import xsna.nr;
import xsna.oc4;
import xsna.on00;
import xsna.or20;
import xsna.pey;
import xsna.r2v;
import xsna.rsg0;
import xsna.rv4;
import xsna.t7;
import xsna.tfx;
import xsna.u730;
import xsna.u8c;
import xsna.ubq;
import xsna.wo40;
import xsna.wr;
import xsna.x310;
import xsna.xr;
import xsna.yfb;

/* compiled from: MusicOfflineSyncServiceHelper.kt */
/* loaded from: classes.dex */
public final class MusicOfflineSyncServiceHelper {
    public final ix4 a = new ix4();

    /* compiled from: MusicOfflineSyncServiceHelper.kt */
    /* loaded from: classes3.dex */
    public static final class MoosicMigrationException extends Exception {
        public MoosicMigrationException() {
            super("audioIds is null or empty");
        }
    }

    public static void h(String str, Throwable th) {
        new a.m(str, th).q();
    }

    public final LinkedHashMap a(ArrayList arrayList) {
        tfx tfxVar = new tfx("audio.getAudioRestrictions", new jr(4), new kr(5));
        tfxVar.i("audios", arrayList);
        Iterable iterable = (Iterable) rsg0.a0(yfb.x(tfxVar)).F(new ubq(new gvs(this), 17)).a();
        int e = on00.e(c5g.u(iterable, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (Object obj : iterable) {
            linkedHashMap.put(((AudioAudioRestrictionDto) obj).d(), obj);
        }
        return linkedHashMap;
    }

    public final LinkedHashMap b(List list) {
        q w;
        Object obj;
        Integer g;
        Pair pair;
        if (list.isEmpty()) {
            w = q.T(EmptyList.b);
        } else {
            int i = 4;
            w = q.e0(0, ((list.size() - 1) / 100) + 1).t(new x310(new ij8(21, list, this), i)).f0(new ArrayList(), new r2v(new j89(6), 8)).l(new or20(new pey(7), i)).w();
        }
        LinkedHashMap linkedHashMap = null;
        try {
            obj = w.a();
        } catch (Throwable unused) {
            obj = null;
        }
        List<AudioMoosicPlaylistDto> list2 = (List) obj;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioMoosicPlaylistDto audioMoosicPlaylistDto : list2) {
                AudioPlaylistDto e = audioMoosicPlaylistDto.e();
                if (e == null || (g = cqm0.g(audioMoosicPlaylistDto.d())) == null) {
                    pair = null;
                } else {
                    jt4.a.getClass();
                    Playlist a = jt4.a(e);
                    UserId.b bVar = UserId.c;
                    pair = new Pair(g, a.Ab());
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            int e2 = on00.e(c5g.u(arrayList, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            linkedHashMap = new LinkedHashMap(e2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                Pair pair3 = new Pair(pair2.i(), pair2.j());
                linkedHashMap.put(pair3.i(), pair3.j());
            }
        }
        return linkedHashMap;
    }

    public final LinkedHashMap c(List list) {
        Object obj;
        Integer g;
        Pair pair;
        LinkedHashMap linkedHashMap = null;
        try {
            obj = (list.isEmpty() ? q.T(EmptyList.b) : q.e0(0, ((list.size() - 1) / 100) + 1).t(new t7(new by5(21, list, this), 24)).f0(new ArrayList(), new aa6(new u8c((byte) 0, 3), 29)).l(new ca6(new j5n(15), 27)).w()).a();
        } catch (Throwable unused) {
            obj = null;
        }
        List<AudioMoosicPlaylistDto> list2 = (List) obj;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioMoosicPlaylistDto audioMoosicPlaylistDto : list2) {
                AudioPlaylistDto e = audioMoosicPlaylistDto.e();
                if (e == null || (g = cqm0.g(audioMoosicPlaylistDto.d())) == null) {
                    pair = null;
                } else {
                    jt4.a.getClass();
                    Playlist a = jt4.a(e);
                    UserId.b bVar = UserId.c;
                    pair = new Pair(g, a.Ab());
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            int e2 = on00.e(c5g.u(arrayList, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            linkedHashMap = new LinkedHashMap(e2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                Pair pair3 = new Pair(pair2.i(), pair2.j());
                linkedHashMap.put(pair3.i(), pair3.j());
            }
        }
        return linkedHashMap;
    }

    public final q<List<AudioMoosicAudioDto>> d(List<String> list) {
        return list.isEmpty() ? q.T(EmptyList.b) : q.e0(0, ((list.size() - 1) / 500) + 1).t(new h7(new mp3(19, list, this), 29)).f0(new ArrayList(), new u730(new rv4((byte) 0, 3), 1)).l(new i630(new f6w(12), 3)).w();
    }

    public final Integer e() {
        Object obj;
        try {
            obj = rsg0.a0(yfb.x(new tfx("audio.getUserConfig", new nr(3), new j0(7)))).F(new fl30(new wo40(this, 1), 5)).a();
        } catch (Throwable unused) {
            obj = null;
        }
        AudioGetUserConfigResponseDto audioGetUserConfigResponseDto = (AudioGetUserConfigResponseDto) obj;
        if (audioGetUserConfigResponseDto != null) {
            return audioGetUserConfigResponseDto.d();
        }
        return null;
    }

    public final Serializable f(List list) {
        try {
            Iterable iterable = (Iterable) rsg0.T(yfb.x(hx4.o(this.a, list, null, 6))).a();
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(oc4.d((AudioAudioDto) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public final boolean g() {
        Object obj;
        try {
            obj = rsg0.a0(yfb.x(new tfx("audio.startStandaloneMigration", new wr(5), new xr(4)))).F(new eiy(new com(this, 21), 7)).a();
        } catch (Throwable unused) {
            obj = null;
        }
        AudioStandaloneMigrationStateResponseDto audioStandaloneMigrationStateResponseDto = (AudioStandaloneMigrationStateResponseDto) obj;
        return (audioStandaloneMigrationStateResponseDto == null || audioStandaloneMigrationStateResponseDto.d() == AudioStandaloneMigrationStateResponseDto.StatusDto.ERROR) ? false : true;
    }
}
