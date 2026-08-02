package com.vk.music.offline.core.database;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bia;
import xsna.bpn0;
import xsna.cb50;
import xsna.cia;
import xsna.cmg0;
import xsna.dcy;
import xsna.dia;
import xsna.eia;
import xsna.fpf0;
import xsna.gw4;
import xsna.it70;
import xsna.j8b0;
import xsna.jf5;
import xsna.m15;
import xsna.of4;
import xsna.qgb0;
import xsna.rb8;
import xsna.rfc;
import xsna.sb8;
import xsna.sz2;
import xsna.tb8;
import xsna.ukb;
import xsna.usp;
import xsna.xt4;

/* compiled from: OfflineAudioDatabase_Impl.kt */
/* loaded from: classes.dex */
public final class OfflineAudioDatabase_Impl extends OfflineAudioDatabase {
    public final bpn0 x = new bpn0(new sz2(this, 5));
    public final bpn0 y = new bpn0(new bia(this, 7));
    public final bpn0 z = new bpn0(new m15(this, 7));
    public final bpn0 A = new bpn0(new cia(this, 6));
    public final bpn0 B = new bpn0(new dia(this, 5));
    public final bpn0 C = new bpn0(new eia(this, 4));
    public final bpn0 D = new bpn0(new rb8(this, 3));
    public final bpn0 E = new bpn0(new sb8(this, 5));
    public final bpn0 F = new bpn0(new tb8(this, 5));

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final gw4 A() {
        return (gw4) this.x.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final jf5 B() {
        return (jf5) this.F.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final ukb C() {
        return (ukb) this.C.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final usp D() {
        return (usp) this.E.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final cb50 E() {
        return (cb50) this.z.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final j8b0 F() {
        return (j8b0) this.A.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final qgb0 G() {
        return (qgb0) this.D.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "audio_restriction", "audio_reaction", "audio_track", "playlist", "playlists_to_tracks", "audio_book", "audio_book_chapter", "audio_book_to_chapters", "podcast", "episode", "podcast_to_episodes", "auto_download_track");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new it70(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rfc a = fpf0.a(gw4.class);
        EmptyList emptyList = EmptyList.b;
        linkedHashMap.put(a, emptyList);
        linkedHashMap.put(fpf0.a(xt4.class), emptyList);
        linkedHashMap.put(fpf0.a(cb50.class), emptyList);
        linkedHashMap.put(fpf0.a(j8b0.class), emptyList);
        linkedHashMap.put(fpf0.a(of4.class), emptyList);
        linkedHashMap.put(fpf0.a(ukb.class), emptyList);
        linkedHashMap.put(fpf0.a(qgb0.class), emptyList);
        linkedHashMap.put(fpf0.a(usp.class), emptyList);
        linkedHashMap.put(fpf0.a(jf5.class), emptyList);
        return linkedHashMap;
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final of4 y() {
        return (of4) this.B.getValue();
    }

    @Override // com.vk.music.offline.core.database.OfflineAudioDatabase
    public final xt4 z() {
        return (xt4) this.y.getValue();
    }
}
