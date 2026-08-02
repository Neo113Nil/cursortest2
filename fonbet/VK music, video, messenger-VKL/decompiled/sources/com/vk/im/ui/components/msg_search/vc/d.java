package com.vk.im.ui.components.msg_search.vc;

import android.content.Context;
import com.vk.channels.api.Channel;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalItemLoggingInfo;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.im.ui.components.msg_search.vc.a;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.baz;
import xsna.c5g;
import xsna.dcf0;
import xsna.drm0;
import xsna.e43;
import xsna.g2v;
import xsna.g5g;
import xsna.gk30;
import xsna.gon0;
import xsna.gu70;
import xsna.gyh0;
import xsna.hfz;
import xsna.hy30;
import xsna.j5g;
import xsna.k9q0;
import xsna.k9u0;
import xsna.ko60;
import xsna.kud0;
import xsna.l4a0;
import xsna.lcf0;
import xsna.ljq;
import xsna.mib;
import xsna.msy;
import xsna.n1u;
import xsna.nx30;
import xsna.p4b;
import xsna.p7k;
import xsna.pbb;
import xsna.qoy;
import xsna.r6q0;
import xsna.rvh0;
import xsna.t9f0;
import xsna.u8j;
import xsna.uwm0;
import xsna.vlm;
import xsna.vt90;
import xsna.w6v;
import xsna.x1e0;
import xsna.xuo0;

/* compiled from: VcModelConverter.kt */
/* loaded from: classes2.dex */
public final class d {
    public final Context a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* compiled from: VcModelConverter.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a() {
            this(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListOptions(allowPeersEmptyItem=");
            sb.append(this.a);
            sb.append(", allowContactItems=");
            sb.append(this.b);
            sb.append(", allowFakeContactItem=");
            return q0.a(sb, this.c, ')');
        }

        public /* synthetic */ a(int i) {
            this((i & 1) != 0, false, (i & 4) == 0);
        }

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: VcModelConverter.kt */
    public static final class b {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 200225192;
        }

        public final String toString() {
            return "OpenContactsAction";
        }
    }

    /* compiled from: VcModelConverter.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.PEERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(Context context) {
        this.a = context;
        kud0 kud0Var = new kud0(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, kud0Var);
        this.c = msy.a(lazyThreadSafetyMode, new ko60(8));
        this.d = msy.a(lazyThreadSafetyMode, new x1e0(this, 21));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0267  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.vk.im.engine.models.messages.Msg] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v67, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v68, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(hy30 hy30Var, SearchMode searchMode, a aVar) {
        com.vk.im.engine.models.messages.a aVar2;
        Msg msg;
        ProfilesSimpleInfo profilesSimpleInfo;
        boolean z;
        boolean z2;
        EmptyList emptyList;
        EmptyList emptyList2;
        Iterable iterable;
        ArrayList arrayList;
        hfz vt90Var;
        t9f0 t9f0Var;
        ?? r5;
        Map<Long, Msg> map;
        VerifyInfo q9;
        String str;
        boolean z3 = aVar.b;
        int i = c.$EnumSwitchMapping$0[searchMode.ordinal()];
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<??> arrayList3 = hy30Var.a;
            Long l = hy30Var.e;
            if (!arrayList3.isEmpty() && hy30Var.d.length() > 0 && hy30Var.i == Source.CACHE) {
                arrayList2.add(new gu70(hy30Var.d, SearchMode.MESSAGES));
            }
            if (arrayList3.isEmpty() && hy30Var.d.length() == 0 && l != null) {
                arrayList2.add(new nx30(l.longValue()));
            }
            for (?? r52 : arrayList3) {
                CharSequence charSequence = (CharSequence) hy30Var.n.get(k9q0.n(r52));
                if (charSequence != null && (aVar2 = (com.vk.im.engine.models.messages.a) hy30Var.o.get(k9q0.n(r52))) != null) {
                    Object obj = hy30Var.b.get(Long.valueOf(r52.c));
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Dialog dialog = (Dialog) obj;
                    ProfilesSimpleInfo profilesSimpleInfo2 = hy30Var.c;
                    boolean z4 = l != null;
                    com.vk.im.engine.models.messages.a aVar3 = r52 instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) r52 : null;
                    if (aVar3 != null) {
                        msg = r52;
                        profilesSimpleInfo = profilesSimpleInfo2;
                        if (aVar3.da()) {
                            z = true;
                            arrayList2.add(new gk30(dialog, profilesSimpleInfo, msg, charSequence, aVar2, z4, z));
                        }
                    } else {
                        msg = r52;
                        profilesSimpleInfo = profilesSimpleInfo2;
                    }
                    z = false;
                    arrayList2.add(new gk30(dialog, profilesSimpleInfo, msg, charSequence, aVar2, z4, z));
                }
            }
            return arrayList2;
        }
        Context context = this.a;
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList4 = new ArrayList();
            mib mibVar = hy30Var.k;
            ProfilesSimpleInfo profilesSimpleInfo3 = mibVar.c;
            Map<Long, Channel> map2 = mibVar.a;
            Map<Long, Msg> map3 = mibVar.b;
            Set<Long> set = hy30Var.m;
            for (Map.Entry<Long, Channel> entry : map2.entrySet()) {
                long longValue = entry.getKey().longValue();
                Channel value = entry.getValue();
                Group group = (Group) profilesSimpleInfo3.e.get(Long.valueOf(Math.abs(value.b)));
                if (value.o) {
                    Msg msg2 = map3.get(Long.valueOf(longValue));
                    CharSequence a2 = msg2 != null ? p4b.a(msg2, profilesSimpleInfo3) : context.getString(R.string.vkim_search_channel_no_posts);
                    if (msg2 != null) {
                        long j = msg2.g;
                        g2v.c().getClass();
                        StringBuffer stringBuffer = ((vlm) this.d.getValue()).e;
                        vlm.b(j, stringBuffer);
                        str = stringBuffer.toString();
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    long j2 = value.b;
                    String str3 = value.d;
                    ImageList imageList = value.c;
                    int i2 = value.k;
                    xuo0.a.getClass();
                    arrayList4.add(new uwm0(j2, imageList, str3, value.f, value.I, a2, str2, i2, value.Db(xuo0.a())));
                    map = map3;
                } else {
                    boolean contains = set.contains(Long.valueOf(value.b));
                    map = map3;
                    arrayList4.add(new r6q0(group != null ? group.m : 0, value.b, (group == null || (q9 = group.q9()) == null) ? new VerifyInfo(false, false, false, false, false, false, 63, null) : q9, value.c, contains ? RightAction.JUST_SUBSCRIBED : RightAction.PLUS, value.d, value.I, value.f));
                }
                map3 = map;
            }
            if (!map2.isEmpty()) {
                int size = map2.size();
                int i3 = hy30Var.k.d;
                if (size < i3) {
                    int abs = Math.abs(i3 - map2.size());
                    com.vk.im.ui.components.msg_search.vc.a.a7.getClass();
                    int min = Math.min(abs, a.C1155a.b.size());
                    for (int i4 = 0; i4 < min; i4++) {
                        com.vk.im.ui.components.msg_search.vc.a.a7.getClass();
                        arrayList4.add(new pbb(a.C1155a.b.get(i4).longValue()));
                    }
                }
            }
            boolean z5 = map2.isEmpty() && hy30Var.d.length() == 0;
            boolean z6 = BuildInfo.t() && !map2.isEmpty() && map2.size() >= hy30Var.k.d;
            if (!z5 && !z6) {
                return arrayList4;
            }
            List<dcf0> list = hy30Var.l;
            if (list != null) {
                List<dcf0> list2 = list;
                r5 = new ArrayList(c5g.u(list2, 10));
                for (dcf0 dcf0Var : list2) {
                    r5.add(new lcf0(dcf0Var.e, dcf0Var.b, new VerifyInfo(dcf0Var.f, false, false, false, false, false, 62, null), dcf0Var.c, set.contains(Long.valueOf(dcf0Var.b)) ? RightAction.JUST_SUBSCRIBED : RightAction.PLUS, dcf0Var.d, dcf0Var.h, dcf0Var.f));
                }
            } else {
                r5 = 0;
            }
            if (r5 == 0) {
                r5 = EmptyList.b;
            }
            arrayList4.addAll((Collection) r5);
            return arrayList4;
        }
        ProfilesSimpleInfo profilesSimpleInfo4 = hy30Var.j.b;
        if (!drm0.N(hy30Var.d)) {
            List<PeersSearchBlock> list3 = hy30Var.j.a;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (PeersSearchBlock peersSearchBlock : list3) {
                    if (!(peersSearchBlock instanceof PeersSearchBlock.d) && !(peersSearchBlock instanceof PeersSearchBlock.e)) {
                    }
                }
            }
            z2 = true;
            if (z2) {
                emptyList = EmptyList.b;
            } else {
                ?? arrayList5 = new ArrayList();
                g2v.c().getClass();
                emptyList = arrayList5;
                emptyList = arrayList5;
                if (!k9u0.a.b(context) && z3) {
                    arrayList5.add(gon0.b);
                    emptyList = arrayList5;
                }
            }
            if (z2 || !emptyList.isEmpty()) {
                emptyList2 = EmptyList.b;
            } else {
                ?? arrayList6 = new ArrayList();
                if (z3 && ((baz) this.b.getValue()).a(hy30Var.d)) {
                    String obj2 = drm0.p0(hy30Var.d).toString();
                    if (aVar.c) {
                        arrayList6.add(new ljq(obj2));
                    }
                    arrayList6.add(new p7k(obj2));
                }
                emptyList2 = arrayList6;
                if (aVar.a) {
                    arrayList6.add(rvh0.b);
                    emptyList2 = arrayList6;
                }
            }
            ArrayList u0 = j5g.u0(emptyList2, emptyList);
            List<PeersSearchBlock> list4 = hy30Var.j.a;
            ArrayList arrayList7 = new ArrayList();
            for (PeersSearchBlock peersSearchBlock2 : list4) {
                if (peersSearchBlock2 instanceof PeersSearchBlock.b) {
                    PeersSearchBlock.b bVar = (PeersSearchBlock.b) peersSearchBlock2;
                    List<a.d> list5 = bVar.b;
                    HashMap hashMap = new HashMap(list5.size());
                    for (a.d dVar : list5) {
                        hashMap.put(dVar.a.a.Sb(), Boolean.valueOf(dVar.b));
                    }
                    List singletonList = Collections.singletonList(new gyh0(b.a, null));
                    List<a.d> list6 = bVar.b;
                    ArrayList arrayList8 = new ArrayList(c5g.u(list6, 10));
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList8.add(((a.d) it.next()).a);
                    }
                    iterable = Collections.singletonList(new w6v(j5g.u0(arrayList8, singletonList), hashMap, profilesSimpleInfo4));
                } else {
                    boolean z7 = peersSearchBlock2 instanceof PeersSearchBlock.c;
                    ?? r6 = this.c;
                    if (z7) {
                        List<a.b.C1154b> list7 = ((PeersSearchBlock.c) peersSearchBlock2).b;
                        if (list7.isEmpty()) {
                            t9f0Var = null;
                        } else {
                            ImSearchItemLoggingInfo imSearchItemLoggingInfo = ((a.b.C1154b) j5g.Y(list7)).a.b;
                            ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo = imSearchItemLoggingInfo instanceof ImSearchLocalItemLoggingInfo ? (ImSearchLocalItemLoggingInfo) imSearchItemLoggingInfo : null;
                            ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo = imSearchLocalItemLoggingInfo != null ? imSearchLocalItemLoggingInfo.b : null;
                            t9f0Var = new t9f0(imSearchLocalRequestLoggingInfo != null ? new ImSearchLocalItemLoggingInfo(imSearchLocalRequestLoggingInfo, 0, null, ImSearchItemLoggingInfo.ClickDocType.CLICK_ITEM, 4, null) : null);
                        }
                        List m = e43.m(t9f0Var);
                        List<a.b.C1154b> list8 = list7;
                        ArrayList arrayList9 = new ArrayList(c5g.u(list8, 10));
                        for (a.b.C1154b c1154b : list8) {
                            arrayList9.add(new vt90(c1154b.a, profilesSimpleInfo4, true, ((DisplayNameFormatter) r6.getValue()).d(c1154b.a.a, profilesSimpleInfo4), c1154b.b));
                        }
                        iterable = j5g.u0(arrayList9, m);
                    } else {
                        if (peersSearchBlock2 instanceof PeersSearchBlock.d) {
                            ArrayList<a.b> arrayList10 = ((PeersSearchBlock.d) peersSearchBlock2).b;
                            arrayList = new ArrayList(c5g.u(arrayList10, 10));
                            for (a.b bVar2 : arrayList10) {
                                if (bVar2 instanceof a.b.C1153a) {
                                    vt90Var = new u8j(((a.b.C1153a) bVar2).a);
                                } else {
                                    if (!(bVar2 instanceof a.b.C1154b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    a.b.C1154b c1154b2 = (a.b.C1154b) bVar2;
                                    vt90Var = new vt90(c1154b2.a, profilesSimpleInfo4, false, ((DisplayNameFormatter) r6.getValue()).d(c1154b2.a.a, profilesSimpleInfo4), c1154b2.b);
                                }
                                arrayList.add(vt90Var);
                            }
                        } else if (peersSearchBlock2 instanceof PeersSearchBlock.e) {
                            List<a.C1152a> list9 = ((PeersSearchBlock.e) peersSearchBlock2).b;
                            arrayList = new ArrayList(c5g.u(list9, 10));
                            Iterator it2 = list9.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new l4a0(((a.C1152a) it2.next()).a));
                            }
                        } else {
                            if (!(peersSearchBlock2 instanceof PeersSearchBlock.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List<a.c> list10 = ((PeersSearchBlock.a) peersSearchBlock2).b;
                            ArrayList arrayList11 = new ArrayList(c5g.u(list10, 10));
                            Iterator it3 = list10.iterator();
                            while (it3.hasNext()) {
                                arrayList11.add(new n1u(((a.c) it3.next()).a));
                            }
                            iterable = arrayList11;
                            g5g.y(iterable, arrayList7);
                        }
                        iterable = arrayList;
                    }
                }
                g5g.y(iterable, arrayList7);
            }
            return j5g.u0(arrayList7, u0);
        }
        z2 = false;
        if (z2) {
        }
        if (z2) {
        }
        emptyList2 = EmptyList.b;
        ArrayList u02 = j5g.u0(emptyList2, emptyList);
        List<PeersSearchBlock> list42 = hy30Var.j.a;
        ArrayList arrayList72 = new ArrayList();
        while (r1.hasNext()) {
        }
        return j5g.u0(arrayList72, u02);
    }
}
