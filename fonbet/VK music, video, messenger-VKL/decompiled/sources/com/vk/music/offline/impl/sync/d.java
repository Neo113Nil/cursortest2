package com.vk.music.offline.impl.sync;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import com.ironsource.C4217a2;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.audio.dto.AudioAudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistByIdExtendedExtraFieldsDto;
import com.vk.api.generated.audio.dto.AudioGetPlaylistExtendedResponseDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.audio.dto.AudioMoosicAudioDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.moosic.VkMusicOldPlaylistEntity;
import com.vk.music.offline.impl.sync.MusicOfflineSyncServiceHelper;
import com.vk.music.offline.impl.sync.a;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.ab3;
import xsna.ar40;
import xsna.asu0;
import xsna.b0y;
import xsna.bb3;
import xsna.bn40;
import xsna.bpn0;
import xsna.c3v;
import xsna.c5g;
import xsna.c63;
import xsna.c6v0;
import xsna.cfl;
import xsna.dgm;
import xsna.dq40;
import xsna.drm0;
import xsna.dz2;
import xsna.e43;
import xsna.ehs;
import xsna.epx;
import xsna.g950;
import xsna.ga40;
import xsna.gl30;
import xsna.gz80;
import xsna.h03;
import xsna.hp30;
import xsna.hx4;
import xsna.i5s;
import xsna.ix4;
import xsna.j5g;
import xsna.ja50;
import xsna.jgp;
import xsna.jt4;
import xsna.jw30;
import xsna.jw5;
import xsna.k840;
import xsna.k850;
import xsna.l5m;
import xsna.lhg;
import xsna.lt70;
import xsna.msy;
import xsna.nbr;
import xsna.nu70;
import xsna.o25;
import xsna.oc4;
import xsna.on00;
import xsna.p4g;
import xsna.pn00;
import xsna.pou;
import xsna.q830;
import xsna.qgp0;
import xsna.qy8;
import xsna.r63;
import xsna.rn00;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sc2;
import xsna.so40;
import xsna.t98;
import xsna.tuq;
import xsna.tv9;
import xsna.uq;
import xsna.v4v;
import xsna.w8i;
import xsna.w9j;
import xsna.xq40;
import xsna.yfb;
import xsna.zhy0;
import xsna.zo4;
import xsna.zq40;

/* compiled from: MusicOfflineSyncManagerImpl.kt */
/* loaded from: classes.dex */
public final class d implements zq40, w8i {
    public final Context b;
    public final dq40 c;
    public final g950 d;
    public final xq40 e;
    public final MusicOfflineSyncServiceHelper f;
    public volatile UserId l;
    public volatile Boolean m;
    public volatile boolean n;
    public final bpn0 g = new bpn0(new qy8(this, 9));
    public final bpn0 h = new bpn0(new ab3(7));
    public final bpn0 i = new bpn0(new ehs(this, 3));
    public final Object j = msy.a(LazyThreadSafetyMode.NONE, new bb3(7));
    public final LinkedHashMap k = new LinkedHashMap();
    public final ConcurrentHashMap<String, Boolean> o = new ConcurrentHashMap<>();
    public final bpn0 p = new bpn0(new r63(7));

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((Playlist) t).v), Integer.valueOf(((Playlist) t2).v));
        }
    }

    public d(Context context, dq40 dq40Var, qgp0 qgp0Var, g950 g950Var, xq40 xq40Var, MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper) {
        this.b = context;
        this.c = dq40Var;
        this.d = g950Var;
        this.e = xq40Var;
        this.f = musicOfflineSyncServiceHelper;
    }

    public static void f(Collection collection, LinkedHashMap linkedHashMap, Set set) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            VkMusicOldPlaylistEntity vkMusicOldPlaylistEntity = (VkMusicOldPlaylistEntity) it.next();
            int d = vkMusicOldPlaylistEntity.d();
            SparseArray sparseArray = new SparseArray();
            String b = vkMusicOldPlaylistEntity.b();
            Thumb thumb = null;
            if (b != null) {
                Context context = e43.a;
                sparseArray.append(200, Uri.fromFile(new File((context != null ? context : null).getFilesDir(), b)));
                thumb = new Thumb(String.valueOf(d), 200, 200, sparseArray);
            }
            Playlist playlist = (Playlist) linkedHashMap.get(Integer.valueOf(d));
            if (playlist != null) {
                playlist.m = thumb;
            }
            boolean containsAll = set.containsAll(vkMusicOldPlaylistEntity.e());
            Playlist playlist2 = (Playlist) linkedHashMap.get(Integer.valueOf(d));
            if (playlist2 != null) {
                playlist2.H = containsAll ? DownloadingState.Downloaded.b : DownloadingState.PartlyDownloaded.b;
            }
        }
    }

    public static void m(String str, String str2) {
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.MUSIC_DOWNLOAD_REMOVAL.h(), str, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }

    @Override // xsna.zq40
    public final void a(Playlist playlist) {
        if (BuildInfo.u() && !i().L0()) {
            if ((i().N0().contains(playlist.Ib()) || i().N0().contains(playlist.Hb())) && i().j0()) {
                asu0.a.getClass();
                asu0.n().execute(new w9j(4, this, playlist));
            }
        }
    }

    @Override // xsna.zq40
    public final void b() {
        this.m = null;
        this.n = true;
    }

    @Override // xsna.zq40
    public final void c() {
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        dq40 dq40Var = this.c;
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = this.f;
        if (gz80.a(31)) {
            c63 c63Var = c63.a;
            if (!c63.f) {
                return;
            }
        }
        LinkedHashMap j = j(false);
        ArrayList v = c5g.v(j.values());
        if (v.isEmpty()) {
            return;
        }
        if (v.size() < 250) {
            ArrayList arrayList = new ArrayList(c5g.u(v, 10));
            Iterator it = v.iterator();
            while (it.hasNext()) {
                arrayList.add(((MusicTrack) it.next()).Fb());
            }
            LinkedHashMap a2 = musicOfflineSyncServiceHelper.a(arrayList);
            if (a2.isEmpty()) {
                return;
            }
            for (Map.Entry entry : j.entrySet()) {
                String str = (String) entry.getKey();
                List<MusicTrack> list = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (MusicTrack musicTrack3 : list) {
                    AudioAudioRestrictionDto audioAudioRestrictionDto = (AudioAudioRestrictionDto) a2.get(musicTrack3.Fb());
                    if (audioAudioRestrictionDto != null) {
                        AudioRestrictionDto e = audioAudioRestrictionDto.e();
                        musicTrack2 = MusicTrack.zb(musicTrack3, 0, null, 0, e != null ? e.j() : 0, null, false, null, null, false, false, null, null, null, -33, 1048575);
                    } else {
                        musicTrack2 = null;
                    }
                    if (musicTrack2 != null) {
                        arrayList2.add(musicTrack2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    dq40Var.T(str, arrayList2);
                }
            }
            return;
        }
        for (List list2 : p4g.p(250, new ArrayList(v))) {
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((MusicTrack) it2.next()).Fb());
            }
            LinkedHashMap a3 = musicOfflineSyncServiceHelper.a(arrayList3);
            if (!a3.isEmpty()) {
                for (Map.Entry entry2 : j.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List<MusicTrack> list3 = (List) entry2.getValue();
                    ArrayList arrayList4 = new ArrayList();
                    for (MusicTrack musicTrack4 : list3) {
                        AudioAudioRestrictionDto audioAudioRestrictionDto2 = (AudioAudioRestrictionDto) a3.get(musicTrack4.Fb());
                        if (audioAudioRestrictionDto2 != null) {
                            AudioRestrictionDto e2 = audioAudioRestrictionDto2.e();
                            musicTrack = MusicTrack.zb(musicTrack4, 0, null, 0, e2 != null ? e2.j() : 0, null, false, null, null, false, false, null, null, null, -33, 1048575);
                        } else {
                            musicTrack = null;
                        }
                        if (musicTrack != null) {
                            arrayList4.add(musicTrack);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        dq40Var.T(str2, arrayList4);
                    }
                }
            }
        }
    }

    @Override // xsna.zq40
    public final boolean d(String str) {
        return BuildInfo.u() && !i().L0() && i().N0().contains(str) && i().j0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (xsna.c63.f == false) goto L94;
     */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zq40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        nu70 nu70Var;
        if (o25.a().b()) {
            if (gz80.a(31)) {
                c63 c63Var = c63.a;
            }
            this.m = Boolean.TRUE;
            UserId c = o25.a().c();
            if (!epx.f(this.l, c)) {
                this.l = c;
                if (!this.d.c()) {
                    this.l = null;
                    return false;
                }
                LinkedHashMap j = j(false);
                dq40 dq40Var = this.c;
                for (Map.Entry entry : j.entrySet()) {
                    String str = (String) entry.getKey();
                    List<MusicTrack> list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (MusicTrack musicTrack : list) {
                        if (musicTrack.W == null) {
                            xq40 xq40Var = this.e;
                            if (musicTrack.S4()) {
                                Pair pair = (Pair) xq40Var.invoke(musicTrack);
                                if (!((Boolean) pair.i()).booleanValue()) {
                                    arrayList.add(musicTrack);
                                    String Fb = musicTrack.Fb();
                                    CorruptedReason corruptedReason = (CorruptedReason) pair.j();
                                    if (corruptedReason == null) {
                                        corruptedReason = CorruptedReason.UNKNOWN;
                                    }
                                    linkedHashMap.put(Fb, corruptedReason);
                                }
                            } else if (musicTrack.Pb() && ((Boolean) ((Pair) xq40Var.invoke(musicTrack)).i()).booleanValue()) {
                                arrayList2.add(musicTrack);
                            }
                        }
                    }
                    bn40.f(uq.b(arrayList, new StringBuilder("corrupted tracks size = ")), uq.b(arrayList2, new StringBuilder("downloaded tracks size = ")));
                    dq40Var.X(arrayList, linkedHashMap, str);
                    if (!arrayList.isEmpty()) {
                        Map a2 = pou.a(new t98(linkedHashMap.values()));
                        boolean b = k840.a.i.b();
                        boolean booleanValue = ((Boolean) this.h.getValue()).booleanValue();
                        Integer num = (Integer) a2.get(CorruptedReason.UNKNOWN);
                        int intValue = num != null ? num.intValue() : 0;
                        Integer num2 = (Integer) a2.get(CorruptedReason.MANIFEST_DB);
                        int intValue2 = num2 != null ? num2.intValue() : 0;
                        Integer num3 = (Integer) a2.get(CorruptedReason.MANIFEST_PLAYLIST);
                        int intValue3 = num3 != null ? num3.intValue() : 0;
                        Integer num4 = (Integer) a2.get(CorruptedReason.SEGMENT);
                        int intValue4 = num4 != null ? num4.intValue() : 0;
                        Integer num5 = (Integer) a2.get(CorruptedReason.SD_CARD);
                        int intValue5 = num5 != null ? num5.intValue() : 0;
                        Integer num6 = (Integer) a2.get(CorruptedReason.MALFORMED);
                        new lt70.a(intValue, intValue2, intValue3, b, booleanValue, intValue4, intValue5, num6 != null ? num6.intValue() : 0).q();
                    }
                    dq40Var.Y(str, arrayList2);
                }
                dq40 dq40Var2 = this.c;
                ja50 d = k840.a.f().d();
                for (MusicOfflineCacheStorage musicOfflineCacheStorage : ((k850) this.i.getValue()).c()) {
                    List<MusicTrack> a3 = dq40Var2.a();
                    if (a3.isEmpty()) {
                        break;
                    }
                    for (MusicTrack musicTrack2 : a3) {
                        if (d.b(dq40Var2.B(musicTrack2), musicOfflineCacheStorage)) {
                            dq40Var2.c(musicTrack2.Fb(), musicOfflineCacheStorage);
                        }
                    }
                }
                for (Map.Entry entry2 : j(true).entrySet()) {
                    List list2 = (List) entry2.getValue();
                    if (list2.size() < 250) {
                        n((String) entry2.getKey(), list2);
                    } else {
                        Iterator it = p4g.p(250, new ArrayList(list2)).iterator();
                        while (it.hasNext()) {
                            n((String) entry2.getKey(), (List) it.next());
                        }
                    }
                }
                if (i().O() && (nu70Var = (nu70) this.j.getValue()) != null) {
                    nu70Var.m();
                }
                this.l = null;
                return true;
            }
            return false;
        }
        if (this.m == null) {
            this.m = Boolean.FALSE;
        }
        return false;
    }

    @Override // xsna.zq40
    public final void g() {
        if (BuildInfo.u()) {
            if ((epx.f(this.m, Boolean.FALSE) || !this.n) && !k()) {
                boolean g0 = i().g0();
                boolean z = false;
                boolean z2 = i().A0() && i().j0();
                boolean l0 = i().l0();
                boolean L0 = i().L0();
                boolean Y = i().Y();
                boolean z3 = z2 && l0 && L0;
                boolean z4 = g0 && Y;
                if (!z3 || !z4) {
                    String[] databaseList = this.b.databaseList();
                    Regex regex = new Regex("^\\d+$");
                    int length = databaseList.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (regex.f(drm0.l0(databaseList[i], JwtParser.SEPARATOR_CHAR))) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        UserId c = o25.a().c();
                        i().i0(c);
                        i().q0(c);
                        i().m(c);
                        i().K(c);
                        i().d0(c);
                        i().A(c);
                    }
                }
                if (z) {
                    asu0.a.getClass();
                    asu0.n().execute(new sc2(this, 4));
                }
            }
        }
    }

    public final q830 h(Integer num) {
        if (num == null || num.intValue() == 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = this.k;
        Object obj = linkedHashMap.get(num);
        if (obj == null) {
            int i = q830.c;
            obj = q830.a.a(num.intValue(), this.b);
            linkedHashMap.put(num, obj);
        }
        return (q830) obj;
    }

    public final com.vk.music.pref.a i() {
        return (com.vk.music.pref.a) this.g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LinkedHashMap j(boolean z) {
        VKApiExecutionException vKApiExecutionException;
        VKApiExecutionException vKApiExecutionException2;
        dq40 dq40Var = this.c;
        List<MusicTrack> V = dq40Var.V();
        ArrayList arrayList = new ArrayList();
        for (Object obj : V) {
            if (((MusicTrack) obj).W == null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap m = pn00.m(new Pair(null, arrayList));
        for (Playlist playlist : dq40Var.j()) {
            if (z) {
                List<MusicTrack> list = playlist.y;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((MusicTrack) it.next()).Sb()) {
                        }
                    }
                }
                try {
                    dz2 x = yfb.x(hx4.x((hx4) this.p.getValue(), playlist.c, playlist.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
                    x.n = true;
                    AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) rsg0.a0(x).a();
                    jt4.a.getClass();
                    dq40Var.W(Playlist.zb(jt4.a(audioPlaylistDto), null, null, EmptyList.b, null, -8388609, 255));
                    String Ib = playlist.Ib();
                    List<MusicTrack> list2 = playlist.y;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((MusicTrack) obj2).W == null) {
                            arrayList2.add(obj2);
                        }
                    }
                    m.put(Ib, arrayList2);
                } catch (Throwable th) {
                    th = th;
                    bn40.c(th, new Object[0]);
                    while (true) {
                        if (th == null) {
                            vKApiExecutionException = null;
                            break;
                        }
                        if (th instanceof VKApiExecutionException) {
                            vKApiExecutionException = (VKApiExecutionException) th;
                            List<VKApiExecutionException> v = vKApiExecutionException.v();
                            if (v != null && (vKApiExecutionException2 = (VKApiExecutionException) j5g.a0(v)) != null) {
                                vKApiExecutionException = vKApiExecutionException2;
                            }
                        } else {
                            th = th.getCause();
                        }
                    }
                    if (vKApiExecutionException != null && vKApiExecutionException.s() == 104) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("playlist_error_message", vKApiExecutionException.u());
                        jSONObject.put("code", vKApiExecutionException.s());
                        jSONObject.put("subcode", vKApiExecutionException.C());
                        m(jSONObject.toString(), "playlist_sync");
                        dq40Var.D(o25.a().c(), playlist);
                    }
                }
            }
            String Ib2 = playlist.Ib();
            List<MusicTrack> list3 = playlist.y;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list3) {
                if (((MusicTrack) obj3).W == null) {
                    arrayList3.add(obj3);
                }
            }
            m.put(Ib2, arrayList3);
        }
        return m;
    }

    public final boolean k() {
        return i().A0() && i().j0() && i().g0() && i().Y();
    }

    public final void l(UserId userId, int i, List list) {
        boolean z;
        boolean z2;
        if (list == null) {
            if (i == 0 || userId.b == 0) {
                list = EmptyList.b;
            } else {
                q830 h = h(Integer.valueOf(i));
                if (h == null) {
                    list = EmptyList.b;
                } else {
                    LinkedHashMap n = h.n();
                    Set p = q830.p(n);
                    Set o = q830.o(n);
                    LinkedHashMap m = q830.m(h, p);
                    LinkedHashMap h2 = q830.h(h, o);
                    Collection values = n.values();
                    ArrayList arrayList = new ArrayList(c5g.u(values, 10));
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((c6v0) it.next()).b());
                    }
                    Collection values2 = m.values();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = values2.iterator();
                    while (it2.hasNext()) {
                        String a2 = ((VkMusicOldPlaylistEntity) it2.next()).a();
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    }
                    ArrayList u0 = j5g.u0(arrayList2, arrayList);
                    Collection values3 = h2.values();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = values3.iterator();
                    while (it3.hasNext()) {
                        String a3 = ((VkMusicOldPlaylistEntity) it3.next()).a();
                        if (a3 != null) {
                            arrayList3.add(a3);
                        }
                    }
                    list = j5g.u0(arrayList3, u0);
                }
            }
        }
        Context context = this.b;
        File file = new File(context.getCacheDir(), lhg.a(i, "photos_cache/"));
        File file2 = new File(context.getFilesDir(), lhg.a(i, "photos_cache/"));
        if (list.isEmpty()) {
            i().m(userId);
            return;
        }
        try {
            z = file.exists();
        } catch (SecurityException unused) {
            z = false;
        }
        if (!z) {
            i().m(userId);
            return;
        }
        try {
            z2 = file2.exists();
        } catch (SecurityException unused2) {
            z2 = false;
        }
        if (z2 || file2.mkdirs()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    try {
                        if (list.contains(file3.getName())) {
                            nbr.k(file3, new File(file2, file3.getName()), true, 4);
                            file3.delete();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused3) {
                    }
                }
            }
            i().m(userId);
        }
    }

    public final void n(String str, List list) {
        MusicTrack musicTrack;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((MusicTrack) it.next()).Ib());
            }
            zo4 zo4Var = new zo4(arrayList3);
            zo4Var.n = true;
            Iterable iterable = (Iterable) rsg0.a0(zo4Var).a();
            int e = on00.e(c5g.u(iterable, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj : iterable) {
                linkedHashMap.put(((MusicTrack) obj).Fb(), obj);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MusicTrack musicTrack2 = (MusicTrack) it2.next();
                if (linkedHashMap.get(musicTrack2.Fb()) == null) {
                    arrayList.add(musicTrack2);
                } else {
                    MusicTrack musicTrack3 = (MusicTrack) linkedHashMap.get(musicTrack2.Fb());
                    if (!epx.f(musicTrack2.a0, musicTrack3 != null ? musicTrack3.a0 : null) && (musicTrack = (MusicTrack) linkedHashMap.get(musicTrack2.Fb())) != null) {
                        arrayList2.add(musicTrack);
                    }
                }
            }
        } catch (Throwable th) {
            bn40.c(th, new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("removed_tracks_size", arrayList.size());
        m(jSONObject.toString(), "tracks_sync");
        dq40 dq40Var = this.c;
        dq40Var.P(str, arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        dq40Var.I(o25.a().c(), arrayList2);
    }

    @Override // xsna.zq40
    public final boolean o() {
        return (!BuildInfo.u() || epx.f(this.m, Boolean.FALSE) || k()) ? false : true;
    }

    @Override // xsna.zq40
    public final void p() {
        if (BuildInfo.u() && !i().Q() && i().j0()) {
            asu0.a.getClass();
            asu0.n().execute(new tv9(this, 6));
        }
    }

    public final void q(int i, UserId userId) {
        Map map;
        LinkedHashMap linkedHashMap;
        List<AudioMoosicAudioDto> list;
        Map map2;
        int i2;
        Map map3 = jgp.b;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"moosicUserId: " + i + ", vkUserId: " + userId});
        }
        if (i == 0 || userId.b == 0 || !o25.a().a(userId)) {
            return;
        }
        q830 h = h(Integer.valueOf(i));
        Map n = h != null ? h.n() : map3;
        if (n.isEmpty() || h == null) {
            if (h == null) {
                new a.n("first_chance_helper_null").q();
            } else {
                new a.n("first_chance_old_tracks_empty").q();
            }
            i().q0(userId);
            i().m(userId);
            i().K(userId);
            return;
        }
        a.l.h.q();
        Collection values = n.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((c6v0) it.next()).c()));
        }
        Set S0 = j5g.S0(arrayList);
        LinkedHashMap m = q830.m(h, q830.p(n));
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = this.f;
        Collection values2 = m.values();
        ArrayList arrayList2 = new ArrayList(c5g.u(values2, 10));
        Iterator it2 = values2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((VkMusicOldPlaylistEntity) it2.next()).d()));
        }
        LinkedHashMap c = musicOfflineSyncServiceHelper.c(j5g.O0(arrayList2));
        if (c == null) {
            new a.n("first_chance_moosic_to_vk_playlists_from_remote_null").q();
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.i, new Object[]{"Unable to obtain playlists!"});
            }
            this.m = Boolean.FALSE;
            return;
        }
        LinkedHashMap h2 = q830.h(h, q830.o(n));
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper2 = this.f;
        Collection values3 = h2.values();
        ArrayList arrayList3 = new ArrayList(c5g.u(values3, 10));
        Iterator it3 = values3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(((VkMusicOldPlaylistEntity) it3.next()).d()));
        }
        LinkedHashMap b = musicOfflineSyncServiceHelper2.b(j5g.O0(arrayList3));
        if (b == null) {
            new a.n("first_chance_moosic_to_vk_albums_from_remote_null").q();
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.i, new Object[]{"Unable to obtain albums!"});
            }
            this.m = Boolean.FALSE;
            return;
        }
        List<Playlist> j = this.c.j();
        ArrayList arrayList4 = new ArrayList(c5g.u(j, 10));
        Iterator<T> it4 = j.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Playlist) it4.next()).Ib());
        }
        Set S02 = j5g.S0(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it5 = j.iterator();
        while (it5.hasNext()) {
            String str = ((Playlist) it5.next()).h;
            if (str != null) {
                arrayList5.add(str);
            }
        }
        Set S03 = j5g.S0(arrayList5);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : c.entrySet()) {
            if (!S02.contains(((Playlist) entry.getValue()).Ib())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
                n = n;
            }
        }
        Map map4 = n;
        L.o(new dgm(linkedHashMap2, 26));
        if (linkedHashMap2.isEmpty()) {
            map = map3;
            linkedHashMap = c;
        } else {
            f(m.values(), linkedHashMap2, S0);
            this.c.R(userId, j5g.O0(linkedHashMap2.values()));
            com.vk.music.pref.a i3 = i();
            Collection values4 = linkedHashMap2.values();
            map = map3;
            linkedHashMap = c;
            ArrayList arrayList6 = new ArrayList(c5g.u(values4, 10));
            Iterator it6 = values4.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((Playlist) it6.next()).Ib());
            }
            i3.C0(userId, j5g.S0(arrayList6));
        }
        for (Iterator it7 = linkedHashMap2.entrySet().iterator(); it7.hasNext(); it7 = it7) {
            Map.Entry entry2 = (Map.Entry) it7.next();
            new a.c(String.valueOf(((Number) entry2.getKey()).intValue()), ((Playlist) entry2.getValue()).Ib(), h.j(String.valueOf(((Number) entry2.getKey()).intValue())), ((Playlist) entry2.getValue()).v).q();
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : b.entrySet()) {
            if (!S02.contains(((Playlist) entry3.getValue()).Ib())) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        L.o(new cfl(linkedHashMap3, 26));
        if (!linkedHashMap3.isEmpty()) {
            f(h2.values(), linkedHashMap3, S0);
            this.c.R(userId, j5g.O0(linkedHashMap3.values()));
            com.vk.music.pref.a i4 = i();
            Collection values5 = linkedHashMap3.values();
            ArrayList arrayList7 = new ArrayList(c5g.u(values5, 10));
            Iterator it8 = values5.iterator();
            while (it8.hasNext()) {
                arrayList7.add(((Playlist) it8.next()).Ib());
            }
            i4.C0(userId, j5g.S0(arrayList7));
        }
        for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
            new a.b(String.valueOf(((Number) entry4.getKey()).intValue()), ((Playlist) entry4.getValue()).Ib(), h.b(String.valueOf(((Number) entry4.getKey()).intValue())), ((Playlist) entry4.getValue()).v).q();
        }
        Collection values6 = m.values();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj : values6) {
            if (!linkedHashMap.keySet().contains(Integer.valueOf(((VkMusicOldPlaylistEntity) obj).d()))) {
                arrayList8.add(obj);
            }
        }
        Collection values7 = h2.values();
        ArrayList arrayList9 = new ArrayList();
        for (Object obj2 : values7) {
            if (!b.keySet().contains(Integer.valueOf(((VkMusicOldPlaylistEntity) obj2).d()))) {
                arrayList9.add(obj2);
            }
        }
        ArrayList u0 = j5g.u0(arrayList9, arrayList8);
        L.o(new hp30(u0, 2));
        this.c.C(i, u0);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry5 : m.entrySet()) {
            if ((!linkedHashMap.keySet().contains(Integer.valueOf(((VkMusicOldPlaylistEntity) entry5.getValue()).d())) && !S03.contains(((VkMusicOldPlaylistEntity) entry5.getValue()).c())) || linkedHashMap2.keySet().contains(Integer.valueOf(((VkMusicOldPlaylistEntity) entry5.getValue()).d()))) {
                linkedHashMap4.put(entry5.getKey(), entry5.getValue());
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry6 : h2.entrySet()) {
            if ((!b.keySet().contains(Integer.valueOf(((VkMusicOldPlaylistEntity) entry6.getValue()).d())) && !S03.contains(((VkMusicOldPlaylistEntity) entry6.getValue()).c())) || linkedHashMap3.keySet().contains(Integer.valueOf(((VkMusicOldPlaylistEntity) entry6.getValue()).d()))) {
                linkedHashMap5.put(entry6.getKey(), entry6.getValue());
            }
        }
        try {
            list = this.f.d(j5g.O0(map4.keySet())).a();
        } catch (Throwable unused) {
            list = null;
        }
        List<AudioMoosicAudioDto> list2 = list;
        if (list2 != null) {
            List<AudioMoosicAudioDto> list3 = list2;
            int e = on00.e(c5g.u(list3, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(e);
            for (AudioMoosicAudioDto audioMoosicAudioDto : list3) {
                Pair pair = new Pair(audioMoosicAudioDto.e(), oc4.d(audioMoosicAudioDto.d()));
                linkedHashMap6.put(pair.i(), pair.j());
            }
            map2 = map4;
            this.c.z(i, map2, linkedHashMap6, linkedHashMap4, linkedHashMap5, linkedHashMap2, linkedHashMap3, m.keySet(), h2.keySet());
            int size = map2.size();
            int size2 = linkedHashMap6.size();
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            for (Map.Entry entry7 : map2.entrySet()) {
                if (!((c6v0) entry7.getValue()).a().isEmpty()) {
                    linkedHashMap7.put(entry7.getKey(), entry7.getValue());
                }
            }
            new a.d(size, size2, linkedHashMap7.size()).q();
            i2 = i;
        } else {
            map2 = map4;
            i2 = i;
            this.c.z(i2, map2, map, linkedHashMap4, linkedHashMap5, linkedHashMap2, linkedHashMap3, m.keySet(), h2.keySet());
            int size3 = map2.size();
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            for (Map.Entry entry8 : map2.entrySet()) {
                if (!((c6v0) entry8.getValue()).a().isEmpty()) {
                    linkedHashMap8.put(entry8.getKey(), entry8.getValue());
                }
            }
            new a.d(size3, 0, linkedHashMap8.size()).q();
        }
        i().q0(userId);
        if (list2 != null && u0.isEmpty()) {
            i().K(userId);
        }
        Collection values8 = map2.values();
        ArrayList arrayList10 = new ArrayList(c5g.u(values8, 10));
        Iterator it9 = values8.iterator();
        while (it9.hasNext()) {
            arrayList10.add(((c6v0) it9.next()).b());
        }
        Collection values9 = m.values();
        ArrayList arrayList11 = new ArrayList();
        Iterator it10 = values9.iterator();
        while (it10.hasNext()) {
            String a2 = ((VkMusicOldPlaylistEntity) it10.next()).a();
            if (a2 != null) {
                arrayList11.add(a2);
            }
        }
        ArrayList u02 = j5g.u0(arrayList11, arrayList10);
        Collection values10 = h2.values();
        ArrayList arrayList12 = new ArrayList();
        Iterator it11 = values10.iterator();
        while (it11.hasNext()) {
            String a3 = ((VkMusicOldPlaylistEntity) it11.next()).a();
            if (a3 != null) {
                arrayList12.add(a3);
            }
        }
        l(userId, i2, j5g.u0(arrayList12, u02));
    }

    public final void r(UserId userId) {
        boolean z;
        Object obj;
        if (userId.b == 0 || !o25.a().a(userId)) {
            return;
        }
        if (!i().Q()) {
            u(userId);
        }
        Set<String> N0 = i().N0();
        List<Playlist> U = this.c.U();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : U) {
            if (N0.contains(((Playlist) obj2).Ib())) {
                arrayList.add(obj2);
            }
        }
        List D0 = j5g.D0(new a(), arrayList);
        for (String str : N0) {
            Iterator<T> it = U.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (epx.f(((Playlist) obj).Ib(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                i().L(userId, str);
            }
        }
        L.o(new ar40(D0, 0));
        Iterator it2 = D0.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            } else {
                s(userId, (Playlist) it2.next(), false);
            }
        }
        if (i().Q() && i().N0().isEmpty()) {
            z = true;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{zhy0.a("VkMusicMigration allEntitiesSynced? - ", z)});
        }
        if (z) {
            i().d0(userId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0236  */
    /* JADX WARN: Type inference failed for: r6v10, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(UserId userId, Playlist playlist, boolean z) {
        List failure;
        ArrayList arrayList;
        Throwable a2;
        Object failure2;
        String Ib = z ? i().N0().contains(playlist.Ib()) ? playlist.Ib() : playlist.Hb() : playlist.Ib();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.o;
        Boolean bool = concurrentHashMap.get(Ib);
        Boolean bool2 = Boolean.TRUE;
        if (epx.f(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(Ib, bool2);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{i5s.a(new StringBuilder("VkMusicMigration Get playlist "), playlist.h, " tracks")});
        }
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = this.f;
        ix4 ix4Var = musicOfflineSyncServiceHelper.a;
        if (playlist.v > 1000) {
            try {
                failure = new ArrayList();
                List<AudioAudioRawIdTrackedDto> f = ((AudioGetPlaylistExtendedResponseDto) rsg0.a0(yfb.x(ix4Var.p(playlist.c, playlist.b, Collections.singletonList(AudioGetPlaylistByIdExtendedExtraFieldsDto.AUDIO_IDS), null, null, null))).F(new b0y(new tuq(musicOfflineSyncServiceHelper, 16), 12)).a()).f();
                if (f != null) {
                    List<AudioAudioRawIdTrackedDto> list = f;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AudioAudioRawIdTrackedDto) it.next()).d());
                    }
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = j5g.U0(arrayList, 500, 500, true).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Serializable f2 = musicOfflineSyncServiceHelper.f((List) it2.next());
                            Throwable a3 = Result.a(f2);
                            if (a3 != null) {
                                MusicOfflineSyncServiceHelper.h("audio.getById", a3);
                                failure = new Result.Failure(a3);
                                break;
                            }
                            failure.addAll((List) f2);
                        }
                    }
                }
                failure = new Result.Failure(new MusicOfflineSyncServiceHelper.MoosicMigrationException());
            } catch (Throwable th2) {
                th = th2;
                failure = new Result.Failure(th);
                if (!(failure instanceof Result.Failure)) {
                }
                a2 = Result.a(failure);
                if (a2 != null) {
                }
                concurrentHashMap.put(Ib, Boolean.FALSE);
            }
        } else {
            try {
                List<AudioAudioDto> d = ((AudioGetResponseDto) rsg0.a0(yfb.x(hx4.r(ix4Var, playlist.c, Integer.valueOf(playlist.b), null, null, playlist.x, null, 15354))).F(new gl30(new v4v(musicOfflineSyncServiceHelper, 19), 2)).a()).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator it3 = d.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(oc4.d((AudioAudioDto) it3.next()));
                }
                failure = arrayList2;
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
        }
        if (!(failure instanceof Result.Failure)) {
            List list2 = failure;
            L l2 = L.a;
            l2.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l2, L.LogType.i, new Object[]{"VkMusicMigration Recieved " + list2.size() + " tracks"});
            }
            try {
                if (!list2.isEmpty()) {
                    new a.e(this.c.w(userId, Ib, list2)).q();
                }
                i().L(userId, Ib);
                l2.getClass();
                if (!L.m(loggerOutputTarget)) {
                    L.u(l2, L.LogType.i, new Object[]{"VkMusicMigration Client playlist " + playlist.h + " migration DONE"});
                }
                failure2 = s3q0.a;
            } catch (Throwable th4) {
                failure2 = new Result.Failure(th4);
            }
            Throwable a4 = Result.a(failure2);
            if (a4 != null) {
                new a.f("playlist_mapping_error", a4, true).q();
                i().L(userId, Ib);
            }
        }
        a2 = Result.a(failure);
        if (a2 != null) {
            boolean a5 = h03.a(a2);
            boolean z2 = !a5;
            if (!a5) {
                i().L(userId, Ib);
            }
            new a.f("playlist_sync_error", a2, z2).q();
        }
        concurrentHashMap.put(Ib, Boolean.FALSE);
    }

    public final void t(int i, UserId userId) {
        List<AudioMoosicAudioDto> list;
        if (i == 0 || userId.b == 0 || !o25.a().a(userId)) {
            return;
        }
        q830 h = h(Integer.valueOf(i));
        Map n = h != null ? h.n() : jgp.b;
        if (h == null || n.isEmpty()) {
            if (h == null) {
                new a.n("second_chance_helper_null").q();
            } else {
                new a.n("second_chance_old_tracks_empty").q();
            }
            i().m(userId);
            i().K(userId);
            return;
        }
        new a.p(this.c.g(userId), this.c.e(userId), this.c.d(userId)).q();
        Collection values = n.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((c6v0) it.next()).c()));
        }
        Set S0 = j5g.S0(arrayList);
        LinkedHashMap m = q830.m(h, q830.p(n));
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = this.f;
        Collection values2 = m.values();
        ArrayList arrayList2 = new ArrayList(c5g.u(values2, 10));
        Iterator it2 = values2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(String.valueOf(((VkMusicOldPlaylistEntity) it2.next()).d()));
        }
        LinkedHashMap c = musicOfflineSyncServiceHelper.c(j5g.O0(arrayList2));
        if (c == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.i, new Object[]{"Unable to obtain playlists!"});
            }
            this.m = Boolean.FALSE;
            return;
        }
        LinkedHashMap h2 = q830.h(h, q830.o(n));
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper2 = this.f;
        Collection values3 = h2.values();
        ArrayList arrayList3 = new ArrayList(c5g.u(values3, 10));
        Iterator it3 = values3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(String.valueOf(((VkMusicOldPlaylistEntity) it3.next()).d()));
        }
        LinkedHashMap b = musicOfflineSyncServiceHelper2.b(j5g.O0(arrayList3));
        if (b == null) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.i, new Object[]{"Unable to obtain albums!"});
            }
            this.m = Boolean.FALSE;
            return;
        }
        List<Playlist> j = this.c.j();
        ArrayList arrayList4 = new ArrayList(c5g.u(j, 10));
        Iterator<T> it4 = j.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Playlist) it4.next()).Ib());
        }
        Set S02 = j5g.S0(arrayList4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c.entrySet()) {
            if (!S02.contains(((Playlist) entry.getValue()).Ib())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        L.o(new jw30(linkedHashMap, 3));
        char c2 = '_';
        if (!linkedHashMap.isEmpty()) {
            f(m.values(), linkedHashMap, S0);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(userId);
                sb.append(c2);
                sb.append(((Number) entry2.getKey()).intValue());
                linkedHashMap2.put(sb.toString(), entry2.getValue());
                c2 = '_';
            }
            this.c.S(userId, rn00.x(linkedHashMap2));
            com.vk.music.pref.a i2 = i();
            Collection values4 = linkedHashMap.values();
            ArrayList arrayList5 = new ArrayList(c5g.u(values4, 10));
            Iterator it5 = values4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(((Playlist) it5.next()).Ib());
            }
            i2.C0(userId, j5g.S0(arrayList5));
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            new a.c(String.valueOf(((Number) entry3.getKey()).intValue()), ((Playlist) entry3.getValue()).Ib(), h.j(String.valueOf(((Number) entry3.getKey()).intValue())), ((Playlist) entry3.getValue()).v).q();
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry4 : b.entrySet()) {
            if (!S02.contains(((Playlist) entry4.getValue()).Ib())) {
                linkedHashMap3.put(entry4.getKey(), entry4.getValue());
            }
        }
        L.o(new so40(linkedHashMap3, 1));
        if (!linkedHashMap3.isEmpty()) {
            f(h2.values(), linkedHashMap3, S0);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(on00.e(linkedHashMap3.size()));
            for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(userId);
                sb2.append('_');
                sb2.append(((Number) entry5.getKey()).intValue());
                linkedHashMap4.put(sb2.toString(), entry5.getValue());
            }
            this.c.S(userId, rn00.x(linkedHashMap4));
            com.vk.music.pref.a i3 = i();
            Collection values5 = linkedHashMap3.values();
            ArrayList arrayList6 = new ArrayList(c5g.u(values5, 10));
            Iterator it6 = values5.iterator();
            while (it6.hasNext()) {
                arrayList6.add(((Playlist) it6.next()).Ib());
            }
            i3.C0(userId, j5g.S0(arrayList6));
        }
        for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
            new a.b(String.valueOf(((Number) entry6.getKey()).intValue()), ((Playlist) entry6.getValue()).Ib(), h.b(String.valueOf(((Number) entry6.getKey()).intValue())), ((Playlist) entry6.getValue()).v).q();
        }
        try {
            list = this.f.d(j5g.O0(n.keySet())).a();
        } catch (Throwable unused) {
            list = null;
        }
        List<AudioMoosicAudioDto> list2 = list;
        if (list2 == null) {
            new a.n("second_chance_moosic_to_vk_tracks_null").q();
            this.m = Boolean.FALSE;
            return;
        }
        if (list2.isEmpty()) {
            new a.n("second_chance_moosic_to_vk_tracks_empty").q();
            i().K(userId);
            return;
        }
        List<AudioMoosicAudioDto> list3 = list2;
        int e = on00.e(c5g.u(list3, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(e);
        for (AudioMoosicAudioDto audioMoosicAudioDto : list3) {
            Pair pair = new Pair(audioMoosicAudioDto.e(), oc4.d(audioMoosicAudioDto.d()));
            linkedHashMap5.put(pair.i(), pair.j());
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry7 : linkedHashMap5.entrySet()) {
            if (((MusicTrack) entry7.getValue()).b > 0) {
                linkedHashMap6.put(entry7.getKey(), entry7.getValue());
            }
        }
        this.c.v(i, linkedHashMap6, n);
        int size = n.size();
        int size2 = linkedHashMap6.size();
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        for (Map.Entry entry8 : n.entrySet()) {
            if (!((c6v0) entry8.getValue()).a().isEmpty()) {
                linkedHashMap7.put(entry8.getKey(), entry8.getValue());
            }
        }
        new a.d(size, size2, linkedHashMap7.size()).q();
        i().K(userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(UserId userId) {
        UserId userId2;
        Throwable a2;
        Object failure;
        Object failure2;
        Throwable a3;
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.o;
        Boolean bool = concurrentHashMap.get(C4217a2.f);
        Boolean bool2 = Boolean.TRUE;
        if (epx.f(bool, bool2)) {
            return;
        }
        concurrentHashMap.put(C4217a2.f, bool2);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.i, new Object[]{"VkMusicMigration Start my tracks migration"});
        }
        MusicOfflineSyncServiceHelper musicOfflineSyncServiceHelper = this.f;
        List arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i >= 10) {
                userId2 = userId;
                break;
            }
            try {
                userId2 = userId;
                try {
                    failure2 = (List) rsg0.T(yfb.x(hx4.C(musicOfflineSyncServiceHelper.a, userId2, null, null, Integer.valueOf(i * 1000), 1000, null, null, 16190))).U(new ga40(new c3v(5), 1)).a();
                } catch (Throwable th) {
                    th = th;
                    failure2 = new Result.Failure(th);
                    a3 = Result.a(failure2);
                    if (a3 == null) {
                    }
                    if (!(arrayList instanceof Result.Failure)) {
                    }
                    a2 = Result.a(arrayList);
                    if (a2 != null) {
                    }
                    concurrentHashMap.put(C4217a2.f, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                th = th2;
                userId2 = userId;
            }
            a3 = Result.a(failure2);
            if (a3 == null) {
                MusicOfflineSyncServiceHelper.h("audio.get", a3);
                arrayList = new Result.Failure(a3);
                break;
            } else {
                List list = (List) failure2;
                if (list.isEmpty()) {
                    break;
                }
                arrayList.addAll(list);
                i++;
            }
        }
        if (!(arrayList instanceof Result.Failure)) {
            List list2 = arrayList;
            try {
                if (!list2.isEmpty()) {
                    new a.g(this.c.w(userId2, null, list2)).q();
                }
                i().r(userId2);
                failure = s3q0.a;
            } catch (Throwable th3) {
                failure = new Result.Failure(th3);
            }
            Throwable a4 = Result.a(failure);
            if (a4 != null) {
                new a.f("my_tracks_map_err", a4, true).q();
                i().r(userId2);
            }
        }
        a2 = Result.a(arrayList);
        if (a2 != null) {
            boolean a5 = h03.a(a2);
            boolean z = !a5;
            if (!a5) {
                i().r(userId2);
            }
            new a.f("my_tracks_sync_err", a2, z).q();
        }
        concurrentHashMap.put(C4217a2.f, Boolean.FALSE);
    }
}
