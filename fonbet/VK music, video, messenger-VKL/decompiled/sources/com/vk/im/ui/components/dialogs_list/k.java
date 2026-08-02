package com.vk.im.ui.components.dialogs_list;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.ui.components.dialogs_list.e;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.a1w;
import xsna.asu0;
import xsna.bh10;
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
import xsna.gkx0;
import xsna.ih30;
import xsna.le6;
import xsna.mq9;
import xsna.s3q0;
import xsna.t0w;
import xsna.ur;
import xsna.vtm;
import xsna.vu5;
import xsna.w2w;
import xsna.xpp;
import xsna.xq70;
import xsna.zk70;
import xsna.zzp0;

/* compiled from: TaskInvalidateHistoryViaCache.kt */
/* loaded from: classes2.dex */
public final class k extends zzp0<b> {
    public static final f9w i = e9w.a(k.class);
    public final c d;
    public final gkx0 e;
    public final int f;
    public final boolean g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: TaskInvalidateHistoryViaCache.kt */
    public static final class a extends le6<b> {
        public final DialogsHistory b;
        public final ProfilesInfo c;
        public final gkx0 d;
        public final DialogsFilter e;
        public final int f;

        public a(DialogsHistory dialogsHistory, ProfilesInfo profilesInfo, gkx0 gkx0Var, DialogsFilter dialogsFilter, int i) {
            this.b = dialogsHistory;
            this.c = profilesInfo;
            this.d = gkx0Var;
            this.e = dialogsFilter;
            this.f = i;
        }

        @Override // xsna.le6
        public final b e(w2w w2wVar) {
            brm brmVar = (brm) w2wVar.J0(this, new crm(new drm(this.d, this.e, this.f, Source.CACHE, false, (Object) this, "InvalidateHistoryViaCacheCmd " + this))).await();
            DialogsHistory a = t0w.a(this.b, brmVar.a, this.d);
            cbm.a aVar = (cbm.a) w2wVar.J0(this, new cbm()).await();
            eb20.a aVar2 = (eb20.a) w2wVar.J0(this, new eb20()).await();
            ProfilesInfo profilesInfo = brmVar.b;
            ProfilesInfo profilesInfo2 = this.c;
            profilesInfo2.Hb(profilesInfo);
            ArrayList r = brmVar.a.r();
            ih30.a aVar3 = ih30.a;
            LinkedHashMap a2 = ih30.a(a, profilesInfo2.Ob(), mq9.a(w2wVar));
            ArrayList arrayList = new ArrayList(c5g.u(r, 10));
            Iterator it = r.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.b(longValue));
            }
            Map map = (Map) w2wVar.L0(this, new dfj(arrayList));
            ArrayList arrayList2 = new ArrayList(c5g.u(r, 10));
            Iterator it2 = r.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                arrayList2.add(Peer.a.b(longValue2));
            }
            return new b(a, a2, profilesInfo2, r, map, (Map) w2wVar.L0(this, new cfj(arrayList2)), aVar, aVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f;
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            return Integer.hashCode(this.f) + ((this.e.hashCode() + bh10.a(ur.b(this.c, this.b.hashCode() * 31, 31), 31, this.d.b)) * 31);
        }

        @Override // xsna.e1w
        public final String toString() {
            StringBuilder sb = new StringBuilder("InvalidateHistoryViaCacheCmd(historyExists=");
            sb.append(this.b);
            sb.append(", members=");
            sb.append(this.c);
            sb.append(", sinceWeight=");
            sb.append(this.d);
            sb.append(", filter=");
            sb.append(this.e);
            sb.append(", limit=");
            return vu5.b(sb, this.f, ')');
        }
    }

    /* compiled from: TaskInvalidateHistoryViaCache.kt */
    public static final class b {
        public final DialogsHistory a;
        public final LinkedHashMap b;
        public final ProfilesInfo c;
        public final ArrayList d;
        public final Map<Long, Boolean> e;
        public final Map<Long, Boolean> f;
        public final cbm.a g;
        public final eb20.a h;

        public b(DialogsHistory dialogsHistory, LinkedHashMap linkedHashMap, ProfilesInfo profilesInfo, ArrayList arrayList, Map map, Map map2, cbm.a aVar, eb20.a aVar2) {
            this.a = dialogsHistory;
            this.b = linkedHashMap;
            this.c = profilesInfo;
            this.d = arrayList;
            this.e = map;
            this.f = map2;
            this.g = aVar;
            this.h = aVar2;
        }
    }

    public k(c cVar, gkx0 gkx0Var, int i2, boolean z) {
        this.d = cVar;
        this.e = gkx0Var;
        this.f = i2;
        this.g = z;
    }

    @Override // xsna.zzp0
    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.zzp0
    public final void c(Throwable th) {
        i.a(th);
        if (this.d.f() != null) {
            zk70.e(th);
        }
    }

    @Override // xsna.zzp0
    public final void d() {
        c cVar = this.d;
        a1w a1wVar = cVar.d;
        DialogsFilter dialogsFilter = cVar.i;
        e eVar = cVar.h;
        this.h = a1wVar.C(this, new a(new DialogsHistory(eVar.g), eVar.h, this.e, dialogsFilter, this.f)).q(asu0.a.c()).subscribe(new xq70(this, 18));
    }

    @Override // xsna.zzp0
    public final void e(b bVar) {
        b bVar2 = bVar;
        c cVar = this.d;
        e eVar = cVar.h;
        vtm f = cVar.f();
        eVar.i.putAll(bVar2.b);
        eVar.g.v(bVar2.a);
        eVar.h.Hb(bVar2.c);
        LinkedHashMap linkedHashMap = eVar.j;
        ArrayList arrayList = bVar2.d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove(Long.valueOf(((Number) it.next()).longValue()));
        }
        eVar.j.putAll(bVar2.e);
        LinkedHashMap linkedHashMap2 = eVar.k;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.remove(Long.valueOf(((Number) it2.next()).longValue()));
        }
        eVar.k.putAll(bVar2.f);
        e.a aVar = eVar.F;
        boolean z = aVar.a;
        xpp<Boolean> xppVar = aVar.b;
        cbm.a aVar2 = bVar2.g;
        eVar.F = new e.a(z, xppVar, aVar2.b, aVar2.c, aVar2.d, aVar2.e);
        boolean z2 = eVar.E.a;
        eb20.a aVar3 = bVar2.h;
        eVar.E = new e.d(z2, aVar3.a, aVar3.b, aVar3.c, aVar3.d, aVar3.e);
        if (this.g) {
            eVar.B = false;
            eVar.C = false;
            com.vk.im.ui.components.dialogs_list.a aVar4 = cVar.u;
            if (aVar4 != null) {
                aVar4.h(false);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (f != null) {
            cVar.B(this);
        }
        cVar.r(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskInvalidateHistoryViaCache{mSinceWeight=");
        sb.append(this.e);
        sb.append(", mLimit=");
        sb.append(this.f);
        sb.append(", mIsFromUpdate=");
        return q0.a(sb, this.g, '}');
    }
}
