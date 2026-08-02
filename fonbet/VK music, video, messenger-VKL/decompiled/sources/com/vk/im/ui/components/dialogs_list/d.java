package com.vk.im.ui.components.dialogs_list;

import android.os.SystemClock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.asi;
import xsna.brm;
import xsna.c5g;
import xsna.cbm;
import xsna.cfj;
import xsna.crm;
import xsna.dfj;
import xsna.drm;
import xsna.eb20;
import xsna.el3;
import xsna.epx;
import xsna.gkx0;
import xsna.gnm;
import xsna.h5s;
import xsna.ih30;
import xsna.it80;
import xsna.le6;
import xsna.mq9;
import xsna.peb;
import xsna.qcy;
import xsna.qpm;
import xsna.rts;
import xsna.tq;
import xsna.trm;
import xsna.tsm;
import xsna.uf3;
import xsna.ur;
import xsna.v11;
import xsna.vh30;
import xsna.w2w;
import xsna.xpp;
import xsna.zrs;

/* compiled from: LoadInitCmd.kt */
/* loaded from: classes2.dex */
public final class d extends le6<a> {
    public final DialogsFilter b;
    public final int c = 10;
    public final String d = "DialogsListPresenter";

    /* compiled from: LoadInitCmd.kt */
    public static final class a {
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
        public final rts m;
        public final cbm.a n;
        public final eb20.a o;

        public a(Peer peer, DialogsHistory dialogsHistory, ProfilesInfo profilesInfo, LinkedHashMap linkedHashMap, Map map, Map map2, Map map3, xpp xppVar, xpp xppVar2, xpp xppVar3, xpp xppVar4, InfoBar infoBar, rts rtsVar, cbm.a aVar, eb20.a aVar2) {
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
            this.m = rtsVar;
            this.n = aVar;
            this.o = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i.equals(aVar.i) && this.j.equals(aVar.j) && this.k.equals(aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o);
        }

        public final int hashCode() {
            int hashCode = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + v11.a(v11.a(v11.a(uf3.b(this.d, ur.b(this.c, (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31)) * 31;
            InfoBar infoBar = this.l;
            return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((hashCode + (infoBar == null ? 0 : infoBar.hashCode())) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Result(currentMember=" + this.a + ", history=" + this.b + ", profilesInfo=" + this.c + ", msgBodies=" + this.d + ", typing=" + this.e + ", hasSendingMsg=" + this.f + ", hasFailedMsg=" + this.g + ", hasArchivedDialogs=" + this.h + ", hasArchivedChannels=" + this.i + ", archiveUnreadCount=" + this.j + ", archiveMentionsCount=" + this.k + ", infoBar=" + this.l + ", friendsSuggestions=" + this.m + ", businessNotificationMeta=" + this.n + ", requestsMeta=" + this.o + ')';
        }
    }

    public d(DialogsFilter dialogsFilter) {
        this.b = dialogsFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Peer H0 = w2wVar.H0();
        trm.a = SystemClock.uptimeMillis();
        gkx0 gkx0Var = gkx0.e;
        DialogsFilter dialogsFilter = this.b;
        int i = this.c;
        Source source = Source.CACHE;
        brm brmVar = (brm) w2wVar.J0(this, new crm(new drm(gkx0Var, dialogsFilter, i, source, false, (Object) this.d, "LoadInitCmd Source.CACHE sinceWeight= " + gkx0Var))).await();
        DialogsHistory dialogsHistory = brmVar.a;
        ProfilesInfo profilesInfo = brmVar.b;
        long uptimeMillis = SystemClock.uptimeMillis() - trm.a;
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("CRUCIAL.IM.DIALOGS_INIT_LOAD_BY_CACHE");
        b.b("duration", Long.valueOf(uptimeMillis));
        bVar.k(b.e());
        if (dialogsHistory.k().isEmpty() && dialogsHistory.i()) {
            trm.b = SystemClock.uptimeMillis();
            DialogsFilter dialogsFilter2 = this.b;
            w2wVar.getConfig().getClass();
            brm brmVar2 = (brm) w2wVar.J0(this, new crm(new drm(gkx0Var, dialogsFilter2, 10, Source.NETWORK, true, (Object) this.d, "LoadInitCmd Source.NETWORK sinceWeight= " + gkx0Var))).await();
            dialogsHistory = brmVar2.a;
            profilesInfo = brmVar2.b;
            long uptimeMillis2 = SystemClock.uptimeMillis() - trm.b;
            Event.a b2 = h5s.b("CRUCIAL.IM.DIALOGS_INIT_LOAD_BY_ACTUAL");
            b2.b("duration", Long.valueOf(uptimeMillis2));
            bVar.k(b2.e());
        }
        ArrayList r = dialogsHistory.r();
        DialogsCounters dialogsCounters = (DialogsCounters) w2wVar.J0(this, new gnm(source, false)).await();
        Map map = (Map) w2wVar.L0(this, new asi());
        ArrayList arrayList = new ArrayList(c5g.u(r, 10));
        Iterator it = r.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        Map map2 = (Map) w2wVar.L0(this, new dfj(arrayList));
        ArrayList arrayList2 = new ArrayList(c5g.u(r, 10));
        Iterator it2 = r.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add(Peer.a.b(longValue2));
        }
        Map map3 = (Map) w2wVar.L0(this, new cfj(arrayList2));
        DialogsFilter dialogsFilter3 = DialogsFilter.ARCHIVE;
        Source source2 = Source.CACHE;
        xpp xppVar = (xpp) w2wVar.L0(this, new qpm(dialogsFilter3, source2, 12));
        ChannelsCounters.b bVar2 = ((ChannelsCounters) w2wVar.J0(this, new peb(2, source2)).await()).c;
        qcy<Object> qcyVar = ChannelsCounters.g[2];
        Integer num = (Integer) bVar2.a().a();
        xpp xppVar2 = new xpp(Boolean.valueOf((num != null ? num.intValue() : 0) > 0), false);
        InfoBar infoBar = (InfoBar) ((it80) w2wVar.L0(this, new tsm())).a;
        List singletonList = Collections.singletonList(Source.ACTUAL);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM;
        w2wVar.J0(this, new zrs(mobileOfficialAppsCoreNavStat$EventScreen, singletonList, true));
        rts rtsVar = (rts) w2wVar.L0(this, new zrs(mobileOfficialAppsCoreNavStat$EventScreen, Collections.singletonList(source2), true));
        cbm.a aVar = (cbm.a) w2wVar.J0(this, new cbm()).await();
        eb20.a aVar2 = (eb20.a) w2wVar.J0(this, new eb20()).await();
        ih30.a aVar3 = ih30.a;
        return new a(H0, dialogsHistory, profilesInfo, ih30.a(dialogsHistory, profilesInfo.Ob(), mq9.a(w2wVar)), map, map2, map3, xppVar, xppVar2, dialogsCounters.c(), dialogsCounters.b(), infoBar, rtsVar, aVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !d.class.equals(obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        return this.c == dVar.c && this.b == dVar.b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return (this.c * 31) + this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadInitCmd(mFilter=");
        sb.append(this.b);
        sb.append(", mLimit=");
        sb.append(this.c);
        sb.append(", mChangerTag=");
        return tq.f(sb, this.d, ')');
    }
}
