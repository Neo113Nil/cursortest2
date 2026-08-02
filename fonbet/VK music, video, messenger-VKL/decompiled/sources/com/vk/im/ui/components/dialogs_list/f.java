package com.vk.im.ui.components.dialogs_list;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialogs_list.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.asi;
import xsna.asu0;
import xsna.brm;
import xsna.c5g;
import xsna.cbm;
import xsna.cfj;
import xsna.crm;
import xsna.dfj;
import xsna.drm;
import xsna.e9w;
import xsna.eb20;
import xsna.epx;
import xsna.f9w;
import xsna.g2v;
import xsna.gkx0;
import xsna.gnm;
import xsna.hkc0;
import xsna.ih30;
import xsna.it80;
import xsna.le6;
import xsna.mq9;
import xsna.peb;
import xsna.qcy;
import xsna.qpm;
import xsna.s3q0;
import xsna.tsm;
import xsna.uf3;
import xsna.ur;
import xsna.v11;
import xsna.vh30;
import xsna.vu5;
import xsna.w2w;
import xsna.xpp;
import xsna.zk70;
import xsna.zzp0;

/* compiled from: TaskInvalidateAllViaCache.kt */
/* loaded from: classes2.dex */
public final class f extends zzp0<b> {
    public static final f9w g = e9w.a(f.class);
    public final c d;
    public final boolean e;
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: TaskInvalidateAllViaCache.kt */
    public static final class a extends le6<b> {
        public final DialogsFilter b;
        public final int c;

        public a(int i, DialogsFilter dialogsFilter) {
            this.b = dialogsFilter;
            this.c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.le6
        public final b e(w2w w2wVar) {
            Peer H0 = w2wVar.H0();
            brm brmVar = (brm) w2wVar.J0(this, new crm(new drm(gkx0.e, this.b, this.c, Source.CACHE, false, (Object) this, "InvalidateAllViaCacheCmd "))).await();
            DialogsHistory dialogsHistory = brmVar.a;
            ProfilesInfo profilesInfo = brmVar.b;
            ArrayList r = dialogsHistory.r();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            ArrayList arrayList = new ArrayList(c5g.u(r, 10));
            Iterator it = r.iterator();
            while (it.hasNext()) {
                arrayList.add(Peer.a.b(((Number) it.next()).longValue()));
            }
            Map map = (Map) w2wVar.L0(this, new asi());
            Map map2 = (Map) w2wVar.L0(this, new dfj(arrayList));
            Map map3 = (Map) w2wVar.L0(this, new cfj(arrayList));
            Source source = Source.CACHE;
            DialogsCounters dialogsCounters = (DialogsCounters) w2wVar.J0(this, new gnm(source, false)).await();
            xpp xppVar = (xpp) w2wVar.L0(this, new qpm(DialogsFilter.ARCHIVE, null, 14));
            ChannelsCounters.b bVar = ((ChannelsCounters) w2wVar.J0(this, new peb(2, source)).await()).c;
            qcy<Object> qcyVar = ChannelsCounters.g[2];
            Integer num = (Integer) bVar.a().a();
            xpp xppVar2 = new xpp(Boolean.valueOf((num != null ? num.intValue() : 0) > 0), false);
            InfoBar infoBar = (InfoBar) ((it80) w2wVar.L0(this, new tsm())).a;
            cbm.a aVar = (cbm.a) w2wVar.J0(this, new cbm()).await();
            eb20.a aVar2 = (eb20.a) w2wVar.J0(this, new eb20()).await();
            ih30.a aVar3 = ih30.a;
            return new b(H0, dialogsHistory, profilesInfo, ih30.a(dialogsHistory, profilesInfo.Ob(), mq9.a(w2wVar)), map, map2, map3, xppVar, xppVar2, dialogsCounters.c(), dialogsCounters.b(), infoBar, aVar, aVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        @Override // xsna.e1w
        public final String toString() {
            StringBuilder sb = new StringBuilder("InvalidateAllViaCacheCmd(filter=");
            sb.append(this.b);
            sb.append(", limit=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: TaskInvalidateAllViaCache.kt */
    public static final class b {
        public final Peer a;
        public final DialogsHistory b;
        public final ProfilesInfo c;
        public final LinkedHashMap d;
        public final Map<Long, List<vh30>> e;
        public final Map<Long, Boolean> f;
        public final Map<Long, Boolean> g;
        public final xpp<Boolean> h;
        public final xpp<Boolean> i;
        public final xpp<Integer> j;
        public final xpp<Integer> k;
        public final InfoBar l;
        public final cbm.a m;
        public final eb20.a n;

        public b(Peer peer, DialogsHistory dialogsHistory, ProfilesInfo profilesInfo, LinkedHashMap linkedHashMap, Map map, Map map2, Map map3, xpp xppVar, xpp xppVar2, xpp xppVar3, xpp xppVar4, InfoBar infoBar, cbm.a aVar, eb20.a aVar2) {
            this.a = peer;
            this.b = dialogsHistory;
            this.c = profilesInfo;
            this.d = linkedHashMap;
            this.e = map;
            this.f = map2;
            this.g = map3;
            this.h = xppVar;
            this.i = xppVar2;
            this.j = xppVar3;
            this.k = xppVar4;
            this.l = infoBar;
            this.m = aVar;
            this.n = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && this.d.equals(bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && this.i.equals(bVar.i) && this.j.equals(bVar.j) && this.k.equals(bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n);
        }

        public final int hashCode() {
            int hashCode = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + v11.a(v11.a(v11.a(uf3.b(this.d, ur.b(this.c, (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31)) * 31;
            InfoBar infoBar = this.l;
            return this.n.hashCode() + ((this.m.hashCode() + ((hashCode + (infoBar == null ? 0 : infoBar.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Result(currentMember=" + this.a + ", history=" + this.b + ", profilesInfo=" + this.c + ", msgBodies=" + this.d + ", typing=" + this.e + ", hasSendingMsg=" + this.f + ", hasFailedMsg=" + this.g + ", hasArchivedDialogs=" + this.h + ", hasArchivedChannels=" + this.i + ", archiveUnreadCount=" + this.j + ", archiveMentionsCount=" + this.k + ", infoBar=" + this.l + ", businessNotificationMeta=" + this.m + ", requestsMeta=" + this.n + ')';
        }
    }

    public f(c cVar, boolean z) {
        this.d = cVar;
        this.e = z;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        g.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        c cVar = this.d;
        this.f = cVar.d.C(this, new a(Math.max(cVar.h.g.k().size(), 30), cVar.i)).q(asu0.a.c()).subscribe(new hkc0(this, 4));
    }

    @Override // xsna.zzp0
    public final void e(b bVar) {
        b bVar2 = bVar;
        c cVar = this.d;
        e eVar = cVar.h;
        cVar.f();
        eVar.f = bVar2.a;
        eVar.g.v(bVar2.b);
        eVar.h.Mb(bVar2.c);
        HashMap hashMap = eVar.t;
        hashMap.clear();
        hashMap.putAll(bVar2.e);
        LinkedHashMap linkedHashMap = eVar.i;
        linkedHashMap.clear();
        linkedHashMap.putAll(bVar2.d);
        eVar.j = new LinkedHashMap(bVar2.f);
        eVar.k = new LinkedHashMap(bVar2.g);
        eVar.p = bVar2.h;
        eVar.q = bVar2.i;
        eVar.r = bVar2.j;
        eVar.s = bVar2.k;
        eVar.u = bVar2.l;
        g2v.c().getClass();
        eVar.n = false;
        g2v.c().getClass();
        eVar.o = false;
        e.a aVar = eVar.F;
        cbm.a aVar2 = bVar2.m;
        xpp<Boolean> xppVar = aVar2.a;
        xpp<Integer> xppVar2 = aVar2.b;
        Dialog dialog = aVar2.c;
        if (dialog == null) {
            dialog = aVar.d;
        }
        Dialog dialog2 = dialog;
        Msg msg = aVar2.d;
        if (msg == null) {
            msg = aVar.e;
        }
        Msg msg2 = msg;
        ProfilesInfo profilesInfo = aVar2.e;
        if (profilesInfo == null) {
            profilesInfo = aVar.f;
        }
        eVar.F = e.a.a(aVar, false, xppVar, xppVar2, dialog2, msg2, profilesInfo, 1);
        e.d dVar = eVar.E;
        eb20.a aVar3 = bVar2.n;
        xpp<Integer> xppVar3 = aVar3.a;
        int i = aVar3.b;
        Dialog dialog3 = aVar3.c;
        if (dialog3 == null) {
            dialog3 = dVar.d;
        }
        Dialog dialog4 = dialog3;
        Msg msg3 = aVar3.d;
        if (msg3 == null) {
            msg3 = dVar.e;
        }
        Msg msg4 = msg3;
        ProfilesInfo profilesInfo2 = aVar3.e;
        if (profilesInfo2 == null) {
            profilesInfo2 = dVar.f;
        }
        eVar.E = e.d.a(dVar, false, xppVar3, i, dialog4, msg4, profilesInfo2, 1);
        cVar.B(this);
        if (this.e) {
            DialogsFilter dialogsFilter = cVar.i;
            com.vk.im.ui.components.dialogs_list.a aVar4 = cVar.u;
            if (aVar4 != null) {
                aVar4.m(dialogsFilter);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        cVar.r(this);
    }

    public final String toString() {
        return "TaskInvalidateAllViaCache{}";
    }
}
