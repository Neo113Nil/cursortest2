package com.vk.repository.internal.repos.stickers.database;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.cmg0;
import xsna.dbj0;
import xsna.dcy;
import xsna.dei0;
import xsna.dyi;
import xsna.eyb0;
import xsna.fpf0;
import xsna.ftq;
import xsna.hbj0;
import xsna.hj60;
import xsna.i6e0;
import xsna.iaw0;
import xsna.iia0;
import xsna.k8w0;
import xsna.kyp0;
import xsna.lbc0;
import xsna.mlf0;
import xsna.myd0;
import xsna.n9l0;
import xsna.pwh0;
import xsna.q6n0;
import xsna.q9l0;
import xsna.qkd0;
import xsna.rfc;
import xsna.rka0;
import xsna.s2q;
import xsna.tsk0;
import xsna.u9f0;
import xsna.vpj0;
import xsna.wzb0;
import xsna.ybl0;
import xsna.z4e0;
import xsna.zvp0;

/* compiled from: StickersDatabase_Impl.kt */
/* loaded from: classes5.dex */
public final class StickersDatabase_Impl extends StickersDatabase {
    public static final /* synthetic */ int B = 0;
    public final bpn0 n = new bpn0(new dbj0(this, 4));
    public final bpn0 o = new bpn0(new pwh0(this, 8));
    public final bpn0 p = new bpn0(new hj60(this, 27));
    public final bpn0 q = new bpn0(new tsk0(this, 3));
    public final bpn0 r = new bpn0(new wzb0(this, 11));
    public final bpn0 s = new bpn0(new dei0(this, 8));
    public final bpn0 t = new bpn0(new vpj0(this, 2));
    public final bpn0 u = new bpn0(new mlf0(this, 5));
    public final bpn0 v = new bpn0(new rka0(this, 20));
    public final bpn0 w = new bpn0(new iia0(this, 22));
    public final bpn0 x = new bpn0(new lbc0(this, 19));
    public final bpn0 y = new bpn0(new myd0(this, 13));
    public final bpn0 z = new bpn0(new qkd0(this, 12));
    public final bpn0 A = new bpn0(new hbj0(this, 5));

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final ftq A() {
        return (ftq) this.p.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final eyb0 B() {
        return (eyb0) this.y.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final z4e0 C() {
        return (z4e0) this.v.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final i6e0 D() {
        return (i6e0) this.A.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final u9f0 E() {
        return (u9f0) this.q.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final n9l0 F() {
        return (n9l0) this.n.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final ybl0 G() {
        return (ybl0) this.z.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final q6n0 H() {
        return (q6n0) this.s.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final zvp0 I() {
        return (zvp0) this.w.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final kyp0 J() {
        return (kyp0) this.o.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final k8w0 K() {
        return (k8w0) this.t.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final iaw0 L() {
        return (iaw0) this.x.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "store_packs", "recents_stickers", "favorites_stickers", "stickers_suggests", "vmoji_avatar", "stickers_image_configs", "excluded_packs_stickers", "stickers_promo", "ugc_packs", "ugc_chat_settings", "vmoji_promo_in_suggests", "popup_stickers_chat_settings", "stickers_recommendations", "promoted_stickers");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new q9l0(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rfc a = fpf0.a(n9l0.class);
        EmptyList emptyList = EmptyList.b;
        linkedHashMap.put(a, emptyList);
        linkedHashMap.put(fpf0.a(kyp0.class), emptyList);
        linkedHashMap.put(fpf0.a(ftq.class), emptyList);
        linkedHashMap.put(fpf0.a(u9f0.class), emptyList);
        linkedHashMap.put(fpf0.a(s2q.class), emptyList);
        linkedHashMap.put(fpf0.a(q6n0.class), emptyList);
        linkedHashMap.put(fpf0.a(k8w0.class), emptyList);
        linkedHashMap.put(fpf0.a(dyi.class), emptyList);
        linkedHashMap.put(fpf0.a(z4e0.class), emptyList);
        linkedHashMap.put(fpf0.a(zvp0.class), emptyList);
        linkedHashMap.put(fpf0.a(iaw0.class), emptyList);
        linkedHashMap.put(fpf0.a(eyb0.class), emptyList);
        linkedHashMap.put(fpf0.a(ybl0.class), emptyList);
        linkedHashMap.put(fpf0.a(i6e0.class), emptyList);
        return linkedHashMap;
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final dyi y() {
        return (dyi) this.u.getValue();
    }

    @Override // com.vk.repository.internal.repos.stickers.database.StickersDatabase
    public final s2q z() {
        return (s2q) this.r.getValue();
    }
}
