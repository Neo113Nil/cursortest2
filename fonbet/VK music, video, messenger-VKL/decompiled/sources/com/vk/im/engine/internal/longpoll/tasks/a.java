package com.vk.im.engine.internal.longpoll.tasks;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import defpackage.k0;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import xsna.bmm;
import xsna.bsj;
import xsna.c400;
import xsna.c5g;
import xsna.cam;
import xsna.e500;
import xsna.epx;
import xsna.f9t;
import xsna.fcm;
import xsna.fw3;
import xsna.fxf;
import xsna.gcm;
import xsna.h1e0;
import xsna.hxf;
import xsna.j5g;
import xsna.lqm;
import xsna.mrm;
import xsna.nd3;
import xsna.pum;
import xsna.pzv;
import xsna.qoy;
import xsna.rdi;
import xsna.s3q0;
import xsna.sn;
import xsna.vhm;
import xsna.vjm;
import xsna.w2w;
import xsna.wfm;
import xsna.xhm;
import xsna.yjm;
import xsna.z300;

/* compiled from: ApplyDiffLpTask.kt */
/* loaded from: classes2.dex */
public final class a extends e500 {
    public final w2w c;
    public final List<bsj> d;
    public final MessagesFoldersInfoDto e;
    public final ProfilesSimpleInfo f;
    public final boolean g;
    public final boolean h;
    public final ArrayList i;
    public boolean j;
    public final LinkedHashSet k;
    public final StringBuilder l;

    public a(w2w w2wVar, List<bsj> list, MessagesFoldersInfoDto messagesFoldersInfoDto, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2) {
        super("ApplyDiffLpTask");
        this.c = w2wVar;
        this.d = list;
        this.e = messagesFoldersInfoDto;
        this.f = profilesSimpleInfo;
        this.g = z;
        this.h = z2;
        this.i = new ArrayList();
        this.k = new LinkedHashSet();
        this.l = new StringBuilder();
    }

    public static boolean f(Collection collection, List list) {
        if (epx.f(list, collection)) {
            return true;
        }
        return list.size() == collection.size() && list.containsAll(collection) && collection.containsAll(list);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.j) {
            Boolean bool = Boolean.TRUE;
            z300Var.a = bool;
            z300Var.d = bool;
        }
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e500) it.next()).b(z300Var);
            }
        }
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            z300Var.g(((Number) it2.next()).longValue());
        }
        if (this.e != null) {
            z300Var.N = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0472  */
    @Override // xsna.e500
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(c400 c400Var) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        Long l;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List<Integer> list;
        bsj.b bVar;
        long j;
        e500 bmmVar;
        List<Integer> list2;
        List x;
        vjm vjmVar;
        List<bsj> list3;
        NestedMsg pa;
        w2w w2wVar = this.c;
        MessagesFoldersInfoDto messagesFoldersInfoDto = this.e;
        if (messagesFoldersInfoDto != null) {
            lqm.a.a(messagesFoldersInfoDto).o(w2wVar);
        }
        List<bsj> list4 = this.d;
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            bsj.a aVar = ((bsj) it.next()).b;
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add(Long.valueOf(((bsj.a) it2.next()).a));
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            com.vk.im.engine.models.dialogs.a aVar2 = ((bsj) it3.next()).a;
            if (aVar2 != null) {
                arrayList7.add(aVar2);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj : list4) {
            if (((bsj) obj).b != null) {
                arrayList8.add(obj);
            }
        }
        ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            arrayList9.add(f9t.K(((bsj) it4.next()).a()));
        }
        arrayList9.toString();
        ArrayList arrayList10 = new ArrayList();
        for (Object obj2 : list4) {
            if (((bsj) obj2).a != null) {
                arrayList10.add(obj2);
            }
        }
        ArrayList arrayList11 = new ArrayList(c5g.u(arrayList10, 10));
        Iterator it5 = arrayList10.iterator();
        while (it5.hasNext()) {
            arrayList11.add(f9t.K(((bsj) it5.next()).a()));
        }
        arrayList11.toString();
        Iterator<T> it6 = list4.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            i = 0;
            arrayList = this.i;
            if (!hasNext) {
                break;
            }
            bsj bsjVar = (bsj) it6.next();
            Msg msg = (Msg) j5g.k0(bsjVar.c);
            if (msg == null) {
                f9t.K(bsjVar.a());
            }
            if (msg == null) {
                list3 = list4;
            } else {
                List D0 = j5g.D0(new nd3(0), bsjVar.c);
                SparseArray sparseArray = new SparseArray();
                List<Msg> list5 = D0;
                for (Msg msg2 : list5) {
                    sparseArray.put(msg2.d, msg2);
                }
                long a = bsjVar.a();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(a);
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (Msg msg3 : list5) {
                    MsgFromUser msgFromUser = msg3 instanceof MsgFromUser ? (MsgFromUser) msg3 : null;
                    if (msgFromUser != null && (pa = msgFromUser.pa()) != null) {
                        sparseIntArray.put(msg3.d, pa.d);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (Msg msg4 : list5) {
                    sparseBooleanArray.put(msg4.d, msg4.x);
                }
                s3q0 s3q0Var2 = s3q0.a;
                SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
                for (Msg msg5 : list5) {
                    sparseBooleanArray2.put(msg5.d, bsjVar.d().contains(Integer.valueOf(msg5.d)));
                    list4 = list4;
                }
                list3 = list4;
                s3q0 s3q0Var3 = s3q0.a;
                int c = bsjVar.c();
                hxf hxfVar = new hxf(w2wVar, new fxf(b, sparseArray, sparseIntArray, sparseBooleanArray, sparseBooleanArray2, c != 0 ? Integer.valueOf(c) : null, null, 64));
                hxfVar.e(c400Var);
                arrayList.add(hxfVar);
            }
            list4 = list3;
        }
        List<bsj> list6 = list4;
        if (this.g) {
            pum.a aVar3 = new pum.a(DialogsFilter.MAIN);
            arrayList2 = arrayList;
            vjm vjmVar2 = vjm.m;
            Iterator it7 = arrayList7.iterator();
            if (it7.hasNext()) {
                vjmVar = ((com.vk.im.engine.models.dialogs.a) it7.next()).c;
                while (it7.hasNext()) {
                    vjm vjmVar3 = ((com.vk.im.engine.models.dialogs.a) it7.next()).c;
                    vjmVar.getClass();
                    if (vjmVar.compareTo(vjmVar3) > 0) {
                        vjmVar = vjmVar3;
                    }
                }
            } else {
                vjmVar = null;
            }
            if (vjmVar == null) {
                vjmVar = vjm.l;
            }
            new mrm(arrayList7, vjmVar2, vjmVar, true, this.h, aVar3).o(w2wVar);
            this.j = true;
            l = null;
        } else {
            arrayList2 = arrayList;
            ArrayList arrayList12 = new ArrayList();
            Iterator<T> it8 = list6.iterator();
            while (it8.hasNext()) {
                bsj.a aVar4 = ((bsj) it8.next()).b;
                if (aVar4 != null) {
                    arrayList12.add(aVar4);
                }
            }
            Iterator it9 = arrayList12.iterator();
            while (it9.hasNext()) {
                bsj.a aVar5 = (bsj.a) it9.next();
                long j2 = aVar5.a;
                Integer num = aVar5.f;
                Integer num2 = aVar5.e;
                bsj.b bVar2 = aVar5.b;
                com.vk.im.engine.models.dialogs.b c2 = w2wVar.I0().b().e().c(j2);
                StringBuilder sb = this.l;
                sb.setLength(i);
                Iterator it10 = it9;
                sb.append("partial ".concat(f9t.K(j2)));
                if (c2 != null) {
                    int i2 = c2.j;
                    List<Integer> list7 = c2.L;
                    arrayList4 = arrayList7;
                    long j3 = c2.b;
                    List<Integer> list8 = c2.J;
                    arrayList3 = arrayList6;
                    boolean z = c2.R;
                    int i3 = c2.h;
                    int i4 = c2.g;
                    if (bVar2 == null || (list2 = bVar2.a) == null || (x = rdi.x(list2)) == null) {
                        list = list8;
                    } else {
                        list = list8;
                        sb.append(" newmsgs=" + x);
                    }
                    Integer num3 = aVar5.c;
                    if (num3 == null || i4 == num3.intValue()) {
                        bVar = bVar2;
                    } else {
                        bVar = bVar2;
                        sb.append(" in_rd=" + i4 + "->" + num3);
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        fcm fcmVar = new fcm(w2wVar, Peer.a.b(j2), num3.intValue(), num2);
                        fcmVar.e(c400Var);
                        arrayList2.add(fcmVar);
                    }
                    Integer num4 = aVar5.d;
                    if (num4 != null && i3 != num4.intValue()) {
                        sb.append(" out_rd=" + i3 + "->" + num4);
                        Serializer.c<Peer> cVar3 = Peer.CREATOR;
                        gcm gcmVar = new gcm(w2wVar, Peer.a.b(j2), num4.intValue());
                        gcmVar.e(c400Var);
                        arrayList2.add(gcmVar);
                    }
                    Integer num5 = aVar5.g;
                    if (num != null || num5 != null) {
                        vjm vjmVar4 = c2.d;
                        int i5 = vjmVar4.b;
                        int i6 = vjmVar4.c;
                        if (num == null || i5 != num.intValue() || num5 == null || i6 != num5.intValue()) {
                            sb.append(" srt=" + vjmVar4.b + ':' + i6 + "->" + num + ':' + num5);
                            Serializer.c<Peer> cVar4 = Peer.CREATOR;
                            yjm yjmVar = new yjm(this.c, Peer.a.b(j2), aVar5.f, aVar5.g, aVar5.j);
                            yjmVar.e(c400Var);
                            arrayList2.add(yjmVar);
                        }
                    }
                    Boolean bool = aVar5.h;
                    if (bool != null && !Boolean.valueOf(z).equals(bool)) {
                        sb.append(" arch=" + z + "->" + bool);
                        if (bool.booleanValue()) {
                            Serializer.c<Peer> cVar5 = Peer.CREATOR;
                            bmmVar = new cam(w2wVar, Peer.a.b(j2));
                        } else {
                            Serializer.c<Peer> cVar6 = Peer.CREATOR;
                            bmmVar = new bmm(w2wVar, Peer.a.b(j2));
                        }
                        bmmVar.e(c400Var);
                        arrayList2.add(bmmVar);
                    }
                    bsj.b bVar3 = bVar;
                    if ((bVar != null ? bVar3.b : null) != null) {
                        List<Integer> list9 = bVar3.b;
                        if (!f(list9, list)) {
                            sb.append(" mnts=" + list + "->" + list9);
                            j = j3;
                            w2wVar.I0().b().e().m(j, list9);
                            if ((bVar3 == null ? bVar3.c : null) != null) {
                                List<Integer> list10 = bVar3.c;
                                if (!f(list10, list7)) {
                                    sb.append(" exps=" + list7 + "->" + list10);
                                    w2wVar.I0().b().e().j(j, list10);
                                }
                            }
                            if (num2 != null && i2 != num2.intValue()) {
                                sb.append(" unrd=" + i2 + "->" + num2);
                                sn.c(w2wVar).n(num2.intValue(), j2);
                            }
                        }
                    }
                    j = j3;
                    if ((bVar3 == null ? bVar3.c : null) != null) {
                    }
                    if (num2 != null) {
                        sb.append(" unrd=" + i2 + "->" + num2);
                        sn.c(w2wVar).n(num2.intValue(), j2);
                    }
                } else {
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList7;
                    w2wVar.I0().b().e().v(-1, j2);
                    String str = "ERROR: no cached dialog for " + aVar5;
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.e, new Object[]{"partialdiff", str});
                    }
                }
                it9 = it10;
                arrayList7 = arrayList4;
                arrayList6 = arrayList3;
                i = 0;
            }
            ArrayList arrayList13 = arrayList6;
            l = null;
            new wfm(arrayList7, null, 0, 6).o(w2wVar);
            ArrayList arrayList14 = new ArrayList(c5g.u(arrayList7, 10));
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                arrayList14.add(Long.valueOf(((com.vk.im.engine.models.dialogs.a) it11.next()).a));
            }
            LinkedHashSet linkedHashSet = this.k;
            linkedHashSet.addAll(arrayList14);
            linkedHashSet.addAll(arrayList13);
        }
        long longValue = ((pzv.b) w2wVar.getConfig().J.invoke()).b.invoke().longValue();
        Long valueOf = longValue != 0 ? Long.valueOf(longValue) : l;
        if (valueOf != null) {
            long longValue2 = valueOf.longValue();
            L l3 = L.a;
            l3.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l3, L.LogType.d, new Object[]{"getDiff", k0.a(longValue2, "Force apply space for chat ")});
            }
            vhm vhmVar = new vhm(w2wVar, longValue2);
            vhmVar.e(c400Var);
            arrayList2.add(vhmVar);
        }
        for (bsj bsjVar2 : list6) {
            Peer.Contact contact = bsjVar2.i;
            if (contact != null) {
                long a2 = bsjVar2.a();
                Serializer.c<Peer> cVar7 = Peer.CREATOR;
                xhm xhmVar = new xhm(w2wVar, contact, Peer.a.b(a2));
                xhmVar.e(c400Var);
                arrayList2.add(xhmVar);
            }
            if (bsjVar2.d) {
                vhm vhmVar2 = new vhm(w2wVar, bsjVar2.a());
                vhmVar2.e(c400Var);
                arrayList2.add(vhmVar2);
            }
        }
        ProfilesSimpleInfo profilesSimpleInfo = this.f;
        if (profilesSimpleInfo.Gb()) {
            new h1e0(profilesSimpleInfo, w2wVar.f1(), true).o(w2wVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h;
    }

    public final int hashCode() {
        int a = fw3.a(this.c.hashCode() * 31, 31, this.d);
        MessagesFoldersInfoDto messagesFoldersInfoDto = this.e;
        return Boolean.hashCode(this.h) + qoy.b(c.a(this.f, (a + (messagesFoldersInfoDto == null ? 0 : messagesFoldersInfoDto.hashCode())) * 31, 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplyDiffLpTask(env=");
        sb.append(this.c);
        sb.append(", conversationsInfos=");
        sb.append(this.d);
        sb.append(", folders=");
        sb.append(this.e);
        sb.append(", profiles=");
        sb.append(this.f);
        sb.append(", invalidateAll=");
        sb.append(this.g);
        sb.append(", isLastPage=");
        return q0.a(sb, this.h, ')');
    }
}
