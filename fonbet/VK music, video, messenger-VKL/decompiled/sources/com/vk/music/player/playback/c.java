package com.vk.music.player.playback;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.tools.controls.seekbar.m;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlayAudioIds;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlayEntitySource;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.player.StartPlaySingleTrackSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.player.a;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.toggle.features.MusicFeatures;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.am6;
import xsna.b140;
import xsna.bya0;
import xsna.c5g;
import xsna.drm0;
import xsna.dya0;
import xsna.e7c;
import xsna.eip0;
import xsna.ekj;
import xsna.epx;
import xsna.g5g;
import xsna.gq0;
import xsna.gza0;
import xsna.gzs;
import xsna.hxa0;
import xsna.izs;
import xsna.j20;
import xsna.j5g;
import xsna.jog;
import xsna.k840;
import xsna.kb40;
import xsna.ke4;
import xsna.mom;
import xsna.n240;
import xsna.n43;
import xsna.nxa0;
import xsna.nya0;
import xsna.o4;
import xsna.om9;
import xsna.on00;
import xsna.ozd0;
import xsna.pn00;
import xsna.r770;
import xsna.rdi;
import xsna.s3q0;
import xsna.tc;
import xsna.ux40;
import xsna.wn4;
import xsna.wn7;
import xsna.wzs;
import xsna.xd50;
import xsna.xn4;
import xsna.xo9;
import xsna.y1b0;
import xsna.yba;
import xsna.z1b0;
import xsna.zd60;
import xsna.zgo;
import xsna.zxa0;

/* compiled from: PlaybackQueueImpl.kt */
/* loaded from: classes3.dex */
public final class c implements hxa0 {
    public final nya0 a;
    public final ozd0 b;
    public final nxa0 c;
    public final com.vk.music.pref.a d;
    public final izs<String, s3q0> e;
    public final gzs<Boolean> f;
    public final xn4 g;
    public e h;
    public PlayerTrack i;
    public a.C1330a j;
    public int r;
    public boolean t;
    public wn4 u;
    public final io.reactivex.rxjava3.disposables.c v;
    public PlayerTrack x;
    public final Handler k = new Handler(Looper.getMainLooper());
    public final o4 l = new o4(this, 16);
    public final LinkedHashMap m = new LinkedHashMap();
    public List<gza0> n = EmptyList.b;
    public ArrayList o = new ArrayList();
    public final LinkedHashSet p = new LinkedHashSet();
    public final eip0 q = new eip0();
    public a s = new a(0);
    public PlaybackQueueConfig w = PlaybackQueueConfig.DEFAULT;

    /* compiled from: PlaybackQueueImpl.kt */
    public static final class a {
        public final long a;
        public final String b;
        public final boolean c;

        public a() {
            this(0);
        }

        public static a a(a aVar, int i) {
            long j = aVar.a;
            String str = (i & 2) != 0 ? aVar.b : "";
            boolean z = (i & 4) != 0 ? aVar.c : false;
            aVar.getClass();
            return new a(j, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            String str = this.b;
            return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LastCachedTrackMeta(progressMs=");
            sb.append(this.a);
            sb.append(", lastCachedTrackUuid=");
            sb.append(this.b);
            sb.append(", needToAdvanceTillCurrent=");
            return q0.a(sb, this.c, ')');
        }

        public /* synthetic */ a(int i) {
            this(0L, null, false);
        }

        public a(long j, String str, boolean z) {
            this.a = j;
            this.b = str;
            this.c = z;
        }
    }

    public c(nya0 nya0Var, ozd0 ozd0Var, nxa0 nxa0Var, com.vk.music.pref.a aVar, q qVar, izs izsVar, gzs gzsVar, xn4 xn4Var) {
        this.a = nya0Var;
        this.b = ozd0Var;
        this.c = nxa0Var;
        this.d = aVar;
        this.e = izsVar;
        this.f = gzsVar;
        this.g = xn4Var;
        this.v = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n240(new ux40(this, 15), 9));
    }

    public static void K(List list, String str, String str2, wzs wzsVar) {
        int i;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (epx.f(((gza0) it.next()).b, str)) {
                break;
            } else {
                i3++;
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (epx.f(((gza0) it2.next()).b, str2)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 < 0 || i < 0) {
            return;
        }
        wzsVar.invoke(Integer.valueOf(i3), Integer.valueOf(i));
    }

    @Override // xsna.hxa0
    public final boolean A(String str) {
        PlayerTrack playerTrack = this.i;
        String str2 = playerTrack != null ? playerTrack.f : null;
        eip0 eip0Var = this.q;
        return eip0Var.d(str) > eip0Var.d(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hxa0
    public final void B(StartPlaySource startPlaySource, ArrayList arrayList, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        PlaySourceMeta playSourceMeta;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MusicTrack musicTrack = (MusicTrack) it.next();
                if (musicTrack.Vb() || musicTrack.Qb()) {
                    return;
                }
            }
        }
        PlayerTrack a2 = this.q.a(0);
        MusicTrack musicTrack2 = a2 != null ? a2.b : null;
        if (musicTrack2 == null || !musicTrack2.Tb()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((MusicTrack) it2.next()).Tb()) {
                    return;
                }
            }
        }
        yba ybaVar = startPlaySource instanceof yba ? (yba) startPlaySource : null;
        String v0 = ybaVar != null ? ybaVar.v0() : null;
        if (v0 == null) {
            v0 = "";
        }
        String str = v0;
        if (startPlaySource == 0 || (playSourceMeta = startPlaySource.zb()) == null) {
            playSourceMeta = PlaySourceMeta.Default.b;
        }
        PlaybackLaunchMeta playbackLaunchMeta = new PlaybackLaunchMeta(musicPlaybackLaunchContext, str, PlayableType.MUSIC_TRACK, playSourceMeta, null, 16, null);
        if (d().isEmpty()) {
            int e = on00.e(c5g.u(arrayList, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                MusicTrack musicTrack3 = (MusicTrack) it3.next();
                Pair pair = new Pair(musicTrack3.Fb(), new xd50(musicTrack3, playbackLaunchMeta));
                linkedHashMap.put(pair.i(), pair.j());
            }
            LinkedHashMap linkedHashMap2 = this.m;
            linkedHashMap2.putAll(linkedHashMap);
            this.c.e(linkedHashMap2);
        }
        if (startPlaySource != 0) {
            this.b.a().k(startPlaySource, musicPlaybackLaunchContext, null, new e7c(6, this, playbackLaunchMeta));
            return;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            MusicTrack musicTrack4 = (MusicTrack) it4.next();
            arrayList2.add(new gza0(musicTrack4.Fb(), UUID.randomUUID().toString(), musicTrack4.r, musicTrack4.y, playbackLaunchMeta));
        }
        h(arrayList2);
    }

    @Override // xsna.hxa0
    public final PlayerTrack C() {
        return this.x;
    }

    public final boolean D() {
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        MusicTrack musicTrack3;
        PlayerTrack playerTrack = this.i;
        if (playerTrack != null && (musicTrack3 = playerTrack.b) != null && musicTrack3.Vb()) {
            return false;
        }
        PlayerTrack playerTrack2 = this.i;
        if (playerTrack2 != null && (musicTrack2 = playerTrack2.b) != null && musicTrack2.Mb()) {
            return false;
        }
        PlayerTrack playerTrack3 = this.i;
        return playerTrack3 == null || (musicTrack = playerTrack3.b) == null || !musicTrack.Ub();
    }

    public final void E(int i, boolean z) {
        MusicTrack musicTrack;
        eip0 eip0Var = this.q;
        int size = eip0Var.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            PlayerTrack a2 = eip0Var.a(i2);
            if (a2 != null && (musicTrack = a2.b) != null && musicTrack.b == i) {
                musicTrack.P = z;
            }
        }
    }

    public final void F(int i, izs izsVar, boolean z) {
        MusicTrack musicTrack;
        if (m()) {
            return;
        }
        if (this.o.size() <= this.r && this.w.i() && this.w.h()) {
            wn4 wn4Var = this.u;
            if (wn4Var != null) {
                wn4Var.m(i, new ekj(this, z, izsVar), new tc(2));
                return;
            }
            return;
        }
        boolean h = this.w.h();
        LinkedHashMap linkedHashMap = this.m;
        if (!h || this.w.l()) {
            if (this.w.h()) {
                return;
            }
            wn4 wn4Var2 = this.u;
            if (wn4Var2 != null) {
                wn4Var2.q(this.o, linkedHashMap, this.r);
            }
            wn4 wn4Var3 = this.u;
            if (wn4Var3 != null) {
                wn4Var3.m(i, new zd60(this, i, z, izsVar), new b140(this, 9));
                return;
            }
            return;
        }
        List<xd50> O0 = j5g.O0(linkedHashMap.values());
        int size = O0.size();
        if (!O0.isEmpty()) {
            List<xd50> list = O0;
            int e = on00.e(c5g.u(list, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
            for (Object obj : list) {
                linkedHashMap2.put(((xd50) obj).a.Fb(), obj);
            }
            linkedHashMap.putAll(linkedHashMap2);
            this.c.e(linkedHashMap);
            if (this.w.j() && this.w.l()) {
                I(O0);
            }
        }
        PlayerTrack playerTrack = this.i;
        if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
            G();
        }
        f(size, z);
        if (this.t) {
            return;
        }
        PlayerTrack playerTrack2 = this.i;
        izsVar.invoke(playerTrack2 != null ? playerTrack2.f : null);
    }

    public final void G() {
        LinkedHashMap linkedHashMap = this.m;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(drm0.c0((CharSequence) entry.getKey(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6).get(1), entry));
        }
        Map s = pn00.s(arrayList);
        ArrayList<gza0> arrayList2 = this.o;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        for (gza0 gza0Var : arrayList2) {
            if (!drm0.D(gza0Var.a, BundleUtil.UNDERLINE_TAG, false)) {
                Map.Entry entry2 = (Map.Entry) s.get(gza0Var.a);
                String str = entry2 != null ? (String) entry2.getKey() : null;
                if (str == null) {
                    str = "";
                }
                gza0Var = gza0.a(gza0Var, str, null, 30);
            }
            arrayList3.add(gza0Var);
        }
        ArrayList arrayList4 = new ArrayList(rdi.A(0, arrayList3));
        this.o = arrayList4;
        this.c.l(arrayList4);
    }

    public final void H(String str, boolean z, izs<? super String, s3q0> izsVar) {
        MusicTrack musicTrack;
        int i = 0;
        this.r = 0;
        wn4 wn4Var = this.u;
        if (wn4Var != null) {
            wn4Var.g();
        }
        ArrayList arrayList = new ArrayList(this.n);
        this.o = arrayList;
        this.c.l(arrayList);
        if (str != null) {
            Iterator it = this.o.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (epx.f(((gza0) it.next()).b, str)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                i = i2;
            }
        }
        int i3 = i + 150;
        if (this.w.k() && !z) {
            F(i3, izsVar, true);
            return;
        }
        PlayerTrack playerTrack = this.i;
        if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
            G();
        }
        f(i3, true);
        if (this.t) {
            return;
        }
        PlayerTrack playerTrack2 = this.i;
        izsVar.invoke(playerTrack2 != null ? playerTrack2.f : null);
    }

    public final void I(List<xd50> list) {
        List<xd50> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (xd50 xd50Var : list2) {
            MusicTrack musicTrack = xd50Var.a;
            arrayList.add(new gza0(musicTrack.Fb(), UUID.randomUUID().toString(), musicTrack.r, musicTrack.y, xd50Var.b));
        }
        ArrayList arrayList2 = new ArrayList(this.n);
        arrayList2.addAll(arrayList);
        this.n = arrayList2;
        this.o.addAll(arrayList);
        List<gza0> list3 = this.n;
        nxa0 nxa0Var = this.c;
        nxa0Var.b(list3);
        nxa0Var.l(this.o);
    }

    public final void J(String str, boolean z, izs<? super String, s3q0> izsVar) {
        MusicTrack musicTrack;
        this.r = 0;
        wn4 wn4Var = this.u;
        if (wn4Var != null) {
            wn4Var.g();
        }
        ArrayList arrayList = new ArrayList(this.n);
        this.o = arrayList;
        Collections.shuffle(arrayList);
        this.c.l(this.o);
        if (str != null) {
            Iterator it = this.o.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (epx.f(((gza0) it.next()).b, str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Collections.swap(this.o, i, 0);
            }
        }
        if (!z) {
            F(150, izsVar, true);
            return;
        }
        PlayerTrack playerTrack = this.i;
        if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
            G();
        }
        f(150, true);
        if (this.t) {
            return;
        }
        PlayerTrack playerTrack2 = this.i;
        izsVar.invoke(playerTrack2 != null ? playerTrack2.f : null);
    }

    @Override // xsna.hxa0
    public final void a() {
        this.c.a();
    }

    @Override // xsna.hxa0
    public final PlayerTrack b() {
        return this.i;
    }

    @Override // xsna.hxa0
    public final PlayerTrack c() {
        PlayerTrack playerTrack = this.i;
        String str = playerTrack != null ? playerTrack.f : null;
        eip0 eip0Var = this.q;
        PlayerTrack c = eip0Var.c(str);
        if (c != null || !D()) {
            return c;
        }
        if (this.a.a() == LoopMode.LIST) {
            return eip0Var.b();
        }
        return null;
    }

    @Override // xsna.hxa0
    public final ArrayList d() {
        List unmodifiableList = Collections.unmodifiableList(this.q.a);
        ArrayList arrayList = new ArrayList(c5g.u(unmodifiableList, 10));
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlayerTrack) it.next()).f);
        }
        ArrayList arrayList2 = this.o;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            gza0 gza0Var = (gza0) obj;
            if (!this.p.contains(gza0Var.a) && !arrayList.contains(gza0Var.b)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    @Override // xsna.hxa0
    public final void e() {
        eip0 eip0Var = this.q;
        eip0Var.a.clear();
        eip0Var.b.clear();
        this.r = 0;
        this.h = null;
        j(null);
        this.m.clear();
        this.n = EmptyList.b;
        this.o.clear();
        wn4 wn4Var = this.u;
        if (wn4Var != null) {
            wn4Var.g();
        }
    }

    public final void f(int i, boolean z) {
        int i2;
        if (this.o.size() <= this.r) {
            return;
        }
        eip0 eip0Var = this.q;
        if (z) {
            eip0Var.a.clear();
            eip0Var.b.clear();
            this.r = 0;
        }
        int min = Math.min(this.o.size(), this.r + i);
        for (int i3 = this.r; i3 < min; i3++) {
            String str = ((gza0) this.o.get(i3)).a;
            String str2 = ((gza0) this.o.get(i3)).b;
            xd50 xd50Var = (xd50) this.m.get(str);
            if (xd50Var != null) {
                MusicTrack musicTrack = xd50Var.a;
                if (!musicTrack.B()) {
                    boolean f = epx.f(str2, this.s.b);
                    e eVar = this.h;
                    musicTrack.y = (eVar != null ? eVar.a : null) instanceof StartPlayAudioIds ? musicTrack.y : ((gza0) this.o.get(i3)).d;
                    if (f) {
                        Episode episode = musicTrack.w;
                        if (episode != null) {
                            episode.d = this.s.a;
                        }
                        AudioBookChapter audioBookChapter = musicTrack.O;
                        if (audioBookChapter != null) {
                            int ceil = (int) Math.ceil(this.s.a / 1000);
                            AudioBookFile audioBookFile = audioBookChapter.d;
                            if (audioBookFile != null && ceil > (i2 = audioBookFile.c)) {
                                ceil = i2;
                            }
                            audioBookChapter.e = ceil;
                        }
                    }
                    PlayerTrack playerTrack = new PlayerTrack(musicTrack, xd50Var.b, 0, f ? this.s.a : 0L, str2, 4, null);
                    if (f || this.s.b == null) {
                        j(playerTrack);
                        this.s = a.a(this.s, 5);
                    }
                    CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = eip0Var.a;
                    copyOnWriteArrayList.add(playerTrack);
                    eip0Var.b.put(playerTrack.f, Integer.valueOf(copyOnWriteArrayList.size() - 1));
                    eip0Var.e(copyOnWriteArrayList);
                }
            }
        }
        int size = this.o.size();
        int i4 = this.r + i;
        if (size < i4) {
            this.r = this.o.size();
        } else {
            this.r = i4;
        }
    }

    public final void g(ArrayList arrayList) {
        int i;
        boolean isEmpty = this.n.isEmpty();
        nxa0 nxa0Var = this.c;
        if (isEmpty) {
            this.n = arrayList;
            nxa0Var.b(arrayList);
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.o = arrayList2;
            nxa0Var.l(arrayList2);
            i = 0;
        } else {
            Iterator<gza0> it = this.n.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                String str = it.next().b;
                PlayerTrack playerTrack = this.i;
                if (epx.f(str, playerTrack != null ? playerTrack.f : null)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                i2 = this.n.size() - 1;
            }
            ArrayList arrayList3 = new ArrayList(this.n);
            arrayList3.addAll(i2 + 1, arrayList);
            this.n = arrayList3;
            nxa0Var.b(arrayList3);
            Iterator it2 = this.o.iterator();
            i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                String str2 = ((gza0) it2.next()).b;
                PlayerTrack playerTrack2 = this.i;
                if (epx.f(str2, playerTrack2 != null ? playerTrack2.f : null)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = this.o.size() - 1;
            }
            this.o.addAll(i + 1, arrayList);
            nxa0Var.l(this.o);
        }
        int i3 = i + 1;
        int size = arrayList.size() + (this.o.size() - i3);
        this.r = i3;
        eip0 eip0Var = this.q;
        CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = eip0Var.a;
        if (i3 >= 0 && copyOnWriteArrayList.size() - 1 >= i3) {
            List<PlayerTrack> subList = copyOnWriteArrayList.subList(i3, copyOnWriteArrayList.size());
            Iterator<PlayerTrack> it3 = subList.iterator();
            while (it3.hasNext()) {
                eip0Var.b.remove(it3.next().f);
            }
            copyOnWriteArrayList.removeAll(subList);
            eip0Var.e(copyOnWriteArrayList);
        }
        F(size, this.e, false);
    }

    @Override // xsna.hxa0
    public final PlayerTrack getFirst() {
        return this.q.b();
    }

    @Override // xsna.hxa0
    public final PlayerTrack getLast() {
        CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = this.q.a;
        if (copyOnWriteArrayList.isEmpty()) {
            return null;
        }
        return copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1);
    }

    @Override // xsna.hxa0
    public final int getSize() {
        return this.q.a.size();
    }

    public final void h(ArrayList arrayList) {
        MusicTrack musicTrack;
        boolean isEmpty = this.n.isEmpty();
        nxa0 nxa0Var = this.c;
        if (isEmpty) {
            this.n = arrayList;
            nxa0Var.b(arrayList);
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.o = arrayList2;
            nxa0Var.l(arrayList2);
        } else {
            ArrayList arrayList3 = new ArrayList(this.n);
            arrayList3.addAll(arrayList);
            this.n = arrayList3;
            nxa0Var.b(arrayList3);
            this.o.addAll(arrayList);
            nxa0Var.l(this.o);
        }
        int i = this.r;
        int size = this.o.size() - arrayList.size();
        izs<String, s3q0> izsVar = this.e;
        if (i != size) {
            PlayerTrack playerTrack = this.i;
            izsVar.invoke(playerTrack != null ? playerTrack.f : null);
            return;
        }
        int size2 = this.o.size();
        PlayerTrack playerTrack2 = this.i;
        if (playerTrack2 != null && (musicTrack = playerTrack2.b) != null && musicTrack.Wb()) {
            G();
        }
        f(size2, false);
        if (this.t) {
            return;
        }
        PlayerTrack playerTrack3 = this.i;
        izsVar.invoke(playerTrack3 != null ? playerTrack3.f : null);
    }

    @Override // xsna.hxa0
    public final boolean hasNext() {
        boolean z;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        MusicTrack musicTrack3;
        MusicTrack musicTrack4;
        MusicTrack musicTrack5;
        String str;
        if (this.d.n0() != LoopMode.LIST) {
            PlayerTrack playerTrack = this.i;
            if (playerTrack == null || (str = playerTrack.f) == null) {
                z = false;
            } else {
                PlayerTrack last = getLast();
                z = !str.equals(last != null ? last.f : null);
            }
            if (!z) {
                PlayerTrack playerTrack2 = this.i;
                if (!((playerTrack2 == null || (musicTrack5 = playerTrack2.b) == null || !musicTrack5.Vb()) ? false : true)) {
                    PlayerTrack playerTrack3 = this.i;
                    if (!((playerTrack3 == null || (musicTrack4 = playerTrack3.b) == null || !musicTrack4.Mb()) ? false : true)) {
                        PlayerTrack playerTrack4 = this.i;
                        if (!((playerTrack4 == null || (musicTrack3 = playerTrack4.b) == null || !musicTrack3.Ub()) ? false : true)) {
                            PlayerTrack playerTrack5 = this.i;
                            if ((playerTrack5 == null || (musicTrack2 = playerTrack5.b) == null || !musicTrack2.Qb()) ? false : true) {
                                PlayerTrack playerTrack6 = this.i;
                                if ((playerTrack6 == null || (musicTrack = playerTrack6.b) == null || musicTrack.Wb()) ? false : true) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // xsna.hxa0
    public final e i() {
        return this.h;
    }

    @Override // xsna.hxa0
    public final void j(PlayerTrack playerTrack) {
        a.C1330a c1330a;
        PlayerTrack playerTrack2 = this.i;
        this.i = playerTrack;
        Handler handler = this.k;
        o4 o4Var = this.l;
        handler.removeCallbacks(o4Var);
        handler.postDelayed(o4Var, 1000L);
        if (epx.f(playerTrack2 != null ? playerTrack2.f : null, playerTrack != null ? playerTrack.f : null) || (c1330a = this.j) == null) {
            return;
        }
        com.vk.music.player.a.a(com.vk.music.player.a.this, playerTrack);
    }

    @Override // xsna.hxa0
    public final void k(List<String> list) {
        PlayerTrack playerTrack;
        ArrayList arrayList = new ArrayList(this.n);
        g5g.D(arrayList, true, new jog(list, 1));
        this.n = arrayList;
        g5g.D(this.o, true, new mom(list, 1));
        this.c.k(list);
        for (String str : list) {
            eip0 eip0Var = this.q;
            CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = eip0Var.a;
            int d = eip0Var.d(str);
            if (d >= 0) {
                playerTrack = copyOnWriteArrayList.remove(d);
                playerTrack.d = -1;
                eip0Var.b.clear();
                eip0Var.e(copyOnWriteArrayList);
            } else {
                playerTrack = null;
            }
            if (playerTrack != null) {
                this.r--;
            }
        }
    }

    @Override // xsna.hxa0
    public final void l(String str, String str2) {
        K(this.n, str, str2, new m(this, 10));
        K(this.o, str, str2, new om9(this, 11));
        eip0 eip0Var = this.q;
        CopyOnWriteArrayList<PlayerTrack> copyOnWriteArrayList = eip0Var.a;
        int d = eip0Var.d(str);
        int d2 = eip0Var.d(str2);
        if (d < d2) {
            while (d < d2) {
                int i = d + 1;
                Collections.swap(copyOnWriteArrayList, d, i);
                d = i;
            }
        } else if (d > d2) {
            while (d >= d2 + 1) {
                Collections.swap(copyOnWriteArrayList, d, d - 1);
                d--;
            }
        }
        eip0Var.b.clear();
        eip0Var.e(copyOnWriteArrayList);
    }

    @Override // xsna.hxa0
    public final boolean m() {
        wn4 wn4Var = this.u;
        if (wn4Var != null) {
            return wn4Var.l();
        }
        return false;
    }

    @Override // xsna.hxa0
    public final List<PlayerTrack> n() {
        return Collections.unmodifiableList(this.q.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0164 A[LOOP:0: B:36:0x015e->B:38:0x0164, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    @Override // xsna.hxa0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(StartPlaySource startPlaySource, Integer num, List list, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext, AdsAudioPixelsContainer adsAudioPixelsContainer, y1b0 y1b0Var) {
        boolean z2;
        String v0;
        List list2;
        boolean isEmpty;
        PlaybackQueueConfig playbackQueueConfig;
        boolean z3;
        boolean z4;
        wn4 wn4Var;
        PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta;
        gza0 gza0Var;
        e();
        nya0 nya0Var = this.a;
        nya0Var.d(z);
        if (z) {
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (!((MusicTrack) it.next()).Tb()) {
                    }
                }
            }
            z2 = true;
            if (!(startPlaySource instanceof StartPlaySingleTrackSource) || (startPlaySource instanceof StartPlayVkMixSource)) {
                nya0Var.b(LoopMode.NONE);
            }
            yba ybaVar = !(startPlaySource instanceof yba) ? (yba) startPlaySource : null;
            v0 = ybaVar == null ? ybaVar.v0() : null;
            if (v0 == null) {
                v0 = "";
            }
            String str = v0;
            if (startPlaySource != 0 || (r2 = startPlaySource.zb()) == null) {
                PlaySourceMeta playSourceMeta = PlaySourceMeta.Default.b;
            }
            PlaybackLaunchMeta playbackLaunchMeta = new PlaybackLaunchMeta(musicPlaybackLaunchContext, str, PlayableType.MUSIC_TRACK, playSourceMeta, adsAudioPixelsContainer);
            e eVar = new e(startPlaySource, playbackLaunchMeta);
            this.h = eVar;
            nxa0 nxa0Var = this.c;
            nxa0Var.f(eVar);
            PlaybackQueueConfig.Companion.getClass();
            list2 = list;
            isEmpty = list2.isEmpty();
            if (!isEmpty) {
                List list4 = list;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (!((MusicTrack) it2.next()).Qb()) {
                            break;
                        }
                    }
                }
                MusicTrack musicTrack = (MusicTrack) j5g.a0(list);
                if (musicTrack != null && !musicTrack.Wb()) {
                    playbackQueueConfig = PlaybackQueueConfig.DEFAULT;
                    this.w = playbackQueueConfig;
                    this.u = this.g.a((MusicTrack) j5g.a0(list), eVar);
                    List<MusicTrack> list5 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                    for (MusicTrack musicTrack2 : list5) {
                        arrayList.add(new gza0(musicTrack2.Fb(), UUID.randomUUID().toString(), musicTrack2.r, musicTrack2.y, playbackLaunchMeta));
                    }
                    this.n = arrayList;
                    nxa0Var.b(arrayList);
                    z3 = startPlaySource instanceof StartPlayAudioIds;
                    if (!z3) {
                        int e = on00.e(c5g.u(list5, 10));
                        if (e < 16) {
                            e = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                        for (MusicTrack musicTrack3 : list5) {
                            Pair pair = new Pair(musicTrack3.Fb(), new xd50(musicTrack3, playbackLaunchMeta));
                            linkedHashMap.put(pair.i(), pair.j());
                        }
                        LinkedHashMap linkedHashMap2 = this.m;
                        linkedHashMap2.putAll(linkedHashMap);
                        nxa0Var.e(linkedHashMap2);
                    }
                    boolean booleanValue = this.f.invoke().booleanValue();
                    String str2 = (num != null || (gza0Var = (gza0) j5g.b0(num.intValue(), this.n)) == null) ? null : gza0Var.b;
                    StartPlayPlaylistSource startPlayPlaylistSource = startPlaySource instanceof StartPlayPlaylistSource ? (StartPlayPlaylistSource) startPlaySource : null;
                    z4 = ((!z2 && startPlaySource != 0 && booleanValue) || list2.isEmpty() || z3 || (((startPlayPlaylistSource != null || (playlistPlaySourceMeta = startPlayPlaylistSource.c) == null) ? false : j5g.P(k840.b.c, Integer.valueOf(playlistPlaySourceMeta.e))) && num == null)) ? false : true;
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.i, new Object[]{"isStartPlayNow = " + z4 + ", pivotTrackUuid = " + str2});
                    }
                    if (z4) {
                        if (z2) {
                            J(str2, true, new zgo(y1b0Var, str2, this, 3));
                        } else {
                            H(str2, true, new gq0(y1b0Var, str2, this, 7));
                        }
                    }
                    if (startPlaySource == 0) {
                        if (z4) {
                            return;
                        }
                        y1b0Var.invoke(null);
                        return;
                    }
                    if (MusicFeatures.AUDIO_FIX_SEARCH_MUSIC_LAUNCH.h() && (startPlaySource instanceof StartPlayCatalogSource) && drm0.D(musicPlaybackLaunchContext.t(), MusicPlaybackLaunchContext.o.t(), false)) {
                        return;
                    }
                    if (this.w.l()) {
                        Object n43Var = z2 ? new n43(y1b0Var, str2, this, 4) : new bya0(z4, this, y1b0Var, str2);
                        wn4 wn4Var2 = this.u;
                        if (wn4Var2 != null) {
                            wn4Var2.p(new j20(20, this, n43Var));
                            return;
                        }
                        return;
                    }
                    if (!this.w.l() && this.w.h()) {
                        this.w.m(true);
                        return;
                    } else {
                        if (this.w.j() || (wn4Var = this.u) == null) {
                            return;
                        }
                        wn4Var.n(startPlaySource, musicPlaybackLaunchContext, adsAudioPixelsContainer, new zxa0(this, z2, z4, str2, y1b0Var));
                        return;
                    }
                }
            }
            if (startPlaySource != 0) {
                playbackQueueConfig = PlaybackQueueConfig.MUSIC_WITHOUT_SOURCE_CONFIG;
            } else if (startPlaySource instanceof StartPlayPodcastSource) {
                playbackQueueConfig = PlaybackQueueConfig.PODCAST_CONFIG;
            } else if (startPlaySource instanceof StartPlayVkMixSource) {
                PlaybackQueueConfig playbackQueueConfig2 = PlaybackQueueConfig.VK_MIX_CONFIG;
                playbackQueueConfig2.m(isEmpty);
                playbackQueueConfig = playbackQueueConfig2;
            } else {
                if (startPlaySource instanceof StartPlayCatalogSource) {
                    if (!list2.isEmpty()) {
                        List list6 = list;
                        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                            Iterator it3 = list6.iterator();
                            while (it3.hasNext()) {
                                if (!((MusicTrack) it3.next()).Vb()) {
                                }
                            }
                        }
                        playbackQueueConfig = PlaybackQueueConfig.PODCAST_CONFIG;
                    }
                    playbackQueueConfig = PlaybackQueueConfig.MUSIC_CONFIG;
                    break;
                }
                playbackQueueConfig = startPlaySource instanceof StartPlayEntitySource ? ((MusicTrack) j5g.Y(list)).Wb() ? PlaybackQueueConfig.RADIO_CONFIG : PlaybackQueueConfig.MUSIC_CONFIG : PlaybackQueueConfig.MUSIC_CONFIG;
            }
            this.w = playbackQueueConfig;
            this.u = this.g.a((MusicTrack) j5g.a0(list), eVar);
            List<MusicTrack> list52 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list52, 10));
            while (r19.hasNext()) {
            }
            this.n = arrayList2;
            nxa0Var.b(arrayList2);
            z3 = startPlaySource instanceof StartPlayAudioIds;
            if (!z3) {
            }
            boolean booleanValue2 = this.f.invoke().booleanValue();
            if (num != null) {
            }
            if (startPlaySource instanceof StartPlayPlaylistSource) {
            }
            if (!z2) {
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
            }
            if (z4) {
            }
            if (startPlaySource == 0) {
            }
        }
        z2 = false;
        if (!(startPlaySource instanceof StartPlaySingleTrackSource)) {
        }
        nya0Var.b(LoopMode.NONE);
        if (!(startPlaySource instanceof yba)) {
        }
        if (ybaVar == null) {
        }
        if (v0 == null) {
        }
        String str3 = v0;
        if (startPlaySource != 0) {
        }
        PlaySourceMeta playSourceMeta2 = PlaySourceMeta.Default.b;
        PlaybackLaunchMeta playbackLaunchMeta2 = new PlaybackLaunchMeta(musicPlaybackLaunchContext, str3, PlayableType.MUSIC_TRACK, playSourceMeta2, adsAudioPixelsContainer);
        e eVar2 = new e(startPlaySource, playbackLaunchMeta2);
        this.h = eVar2;
        nxa0 nxa0Var2 = this.c;
        nxa0Var2.f(eVar2);
        PlaybackQueueConfig.Companion.getClass();
        list2 = list;
        isEmpty = list2.isEmpty();
        if (!isEmpty) {
        }
        if (startPlaySource != 0) {
        }
        this.w = playbackQueueConfig;
        this.u = this.g.a((MusicTrack) j5g.a0(list), eVar2);
        List<MusicTrack> list522 = list;
        ArrayList arrayList22 = new ArrayList(c5g.u(list522, 10));
        while (r19.hasNext()) {
        }
        this.n = arrayList22;
        nxa0Var2.b(arrayList22);
        z3 = startPlaySource instanceof StartPlayAudioIds;
        if (!z3) {
        }
        boolean booleanValue22 = this.f.invoke().booleanValue();
        if (num != null) {
        }
        if (startPlaySource instanceof StartPlayPlaylistSource) {
        }
        if (!z2) {
        }
        L l22 = L.a;
        l22.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
        }
        if (z4) {
        }
        if (startPlaySource == 0) {
        }
    }

    @Override // xsna.hxa0
    public final void p(izs<? super String, s3q0> izsVar) {
        PlayerMode playerMode;
        MusicTrack musicTrack;
        if (this.a.a() != LoopMode.NONE) {
            PlayerTrack playerTrack = this.i;
            if (playerTrack == null || (musicTrack = playerTrack.b) == null || (playerMode = xo9.l(musicTrack)) == null) {
                playerMode = PlayerMode.LOADING;
            }
            if (playerMode != PlayerMode.EXTERNAL_AUDIO && !this.t) {
                PlayerTrack playerTrack2 = this.i;
                this.e.invoke(playerTrack2 != null ? playerTrack2.f : null);
            }
        }
        PlayerTrack playerTrack3 = this.i;
        if (playerTrack3 != null) {
            int size = getSize() - playerTrack3.d;
            wn4 wn4Var = this.u;
            if (size <= (wn4Var != null ? wn4Var.o() : 5)) {
                z(izsVar);
            }
        }
    }

    @Override // xsna.hxa0
    public final void q(boolean z, kb40 kb40Var) {
        PlayerTrack playerTrack = this.i;
        String str = playerTrack != null ? playerTrack.f : null;
        if (z) {
            J(str, false, kb40Var);
        } else {
            H(str, false, kb40Var);
        }
    }

    @Override // xsna.hxa0
    public final boolean r() {
        return this.w.h();
    }

    @Override // xsna.hxa0
    public final void release() {
        this.w = PlaybackQueueConfig.DEFAULT;
        this.t = true;
        this.v.dispose();
        this.c.d();
        e();
        this.u = null;
    }

    @Override // xsna.hxa0
    public final List<PlayerTrack> s(int i) {
        List<PlayerTrack> n = n();
        PlayerTrack playerTrack = this.i;
        int d = this.q.d(playerTrack != null ? playerTrack.f : null);
        if (d == -1 || i <= 0) {
            return EmptyList.b;
        }
        int i2 = d + 1;
        return i2 >= n.size() ? (D() && this.a.a() == LoopMode.LIST) ? j5g.H0(n, i) : EmptyList.b : n.subList(i2, Math.min(i + i2, n.size()));
    }

    @Override // xsna.hxa0
    public final PlayerTrack t(String str) {
        eip0 eip0Var = this.q;
        int d = eip0Var.d(str);
        PlayerTrack playerTrack = d >= 0 ? eip0Var.a.get(d) : null;
        if (playerTrack == null) {
            return null;
        }
        if (!playerTrack.b.Pb() || this.f.invoke().booleanValue()) {
            return playerTrack;
        }
        return null;
    }

    @Override // xsna.hxa0
    public final PlayerTrack u() {
        PlayerTrack playerTrack = this.i;
        String str = playerTrack != null ? playerTrack.f : null;
        eip0 eip0Var = this.q;
        int d = eip0Var.d(str);
        if (d > 0) {
            return eip0Var.a.get(d - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hxa0
    public final void v(StartPlaySource startPlaySource, ArrayList arrayList, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        PlaySourceMeta playSourceMeta;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MusicTrack musicTrack = (MusicTrack) it.next();
                if (musicTrack.Vb() || musicTrack.Qb()) {
                    return;
                }
            }
        }
        PlayerTrack a2 = this.q.a(0);
        MusicTrack musicTrack2 = a2 != null ? a2.b : null;
        if (musicTrack2 == null || !musicTrack2.Tb()) {
            return;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((MusicTrack) it2.next()).Tb()) {
                    return;
                }
            }
        }
        yba ybaVar = startPlaySource instanceof yba ? (yba) startPlaySource : null;
        String v0 = ybaVar != null ? ybaVar.v0() : null;
        if (v0 == null) {
            v0 = "";
        }
        String str = v0;
        if (startPlaySource == 0 || (playSourceMeta = startPlaySource.zb()) == null) {
            playSourceMeta = PlaySourceMeta.Default.b;
        }
        PlaybackLaunchMeta playbackLaunchMeta = new PlaybackLaunchMeta(musicPlaybackLaunchContext, str, PlayableType.MUSIC_TRACK, playSourceMeta, null, 16, null);
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MusicTrack musicTrack3 = (MusicTrack) it3.next();
            Pair pair = new Pair(musicTrack3.Fb(), new xd50(musicTrack3, playbackLaunchMeta));
            linkedHashMap.put(pair.i(), pair.j());
        }
        LinkedHashMap linkedHashMap2 = this.m;
        linkedHashMap2.putAll(linkedHashMap);
        this.c.e(linkedHashMap2);
        if (startPlaySource != 0) {
            this.b.a().k(startPlaySource, musicPlaybackLaunchContext, null, new wn7(11, this, playbackLaunchMeta));
            return;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            MusicTrack musicTrack4 = (MusicTrack) it4.next();
            arrayList2.add(new gza0(musicTrack4.Fb(), UUID.randomUUID().toString(), musicTrack4.r, musicTrack4.y, playbackLaunchMeta));
        }
        g(arrayList2);
    }

    @Override // xsna.hxa0
    public final void w(a.C1330a c1330a) {
        this.j = c1330a;
    }

    @Override // xsna.hxa0
    public final void x(z1b0 z1b0Var) {
        wn4 wn4Var = this.u;
        if (wn4Var != null) {
            wn4Var.p(new r770(3, this, z1b0Var));
        }
    }

    @Override // xsna.hxa0
    public final void y(boolean z, ke4 ke4Var) {
        this.c.c(new am6(this, z, ke4Var, 1));
    }

    @Override // xsna.hxa0
    public final void z(izs<? super String, s3q0> izsVar) {
        int intValue;
        a aVar = this.s;
        int i = 150;
        if (!aVar.c) {
            F(150, izsVar, false);
            return;
        }
        this.s = a.a(aVar, 3);
        Iterator it = this.o.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (epx.f(((gza0) it.next()).b, this.s.b)) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == -1) {
            valueOf = null;
        }
        if (valueOf != null && (intValue = valueOf.intValue() + 1) >= 150) {
            i = intValue;
        }
        int i3 = i;
        if (i3 <= 250) {
            F(i3, izsVar, false);
            return;
        }
        int ceil = (int) Math.ceil(i3 / 250.0f);
        if (1 == ceil) {
            F(i3 % 250, izsVar, false);
        } else {
            F(250, new dya0(this, 1, i3, ceil, izsVar), false);
        }
    }
}
