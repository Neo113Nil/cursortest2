package com.vk.im.ui.components.dialogs_list;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.dialogs.MsgReadAsLastData;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.agm;
import xsna.aw30;
import xsna.b7k;
import xsna.cew;
import xsna.e43;
import xsna.epx;
import xsna.f1e0;
import xsna.hcm;
import xsna.i5e0;
import xsna.ih3;
import xsna.ixu;
import xsna.jgp;
import xsna.jvw;
import xsna.k5e0;
import xsna.krl0;
import xsna.ogm;
import xsna.qoy;
import xsna.qsm;
import xsna.qtd0;
import xsna.ro8;
import xsna.rts;
import xsna.shy;
import xsna.so8;
import xsna.tv30;
import xsna.u5p;
import xsna.uv30;
import xsna.vpz;
import xsna.wd80;
import xsna.wpp;
import xsna.wvh0;
import xsna.xpp;
import xsna.y3i;

/* compiled from: State.kt */
/* loaded from: classes2.dex */
public final class e {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public d E;
    public a F;
    public final DisplayNameFormatter a;
    public final krl0 b;
    public final c c;
    public boolean d;
    public DialogsFilter e = DialogsFilter.MAIN;
    public Peer f = Peer.Unknown.e;
    public final DialogsHistory g = new DialogsHistory(0, 31);
    public final ProfilesInfo h = new ProfilesInfo();
    public final LinkedHashMap i = new LinkedHashMap();
    public LinkedHashMap j = new LinkedHashMap();
    public LinkedHashMap k = new LinkedHashMap();
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public xpp<Boolean> p;
    public xpp<Boolean> q;
    public xpp<Integer> r;
    public xpp<Integer> s;
    public final HashMap t;
    public InfoBar u;
    public rts v;
    public Object w;
    public i5e0 x;
    public boolean y;
    public boolean z;

    /* compiled from: State.kt */
    public static final class a {
        public final boolean a;
        public final xpp<Boolean> b;
        public final xpp<Integer> c;
        public final Dialog d;
        public final Msg e;
        public final ProfilesInfo f;

        public a() {
            this(false, 63);
        }

        public static a a(a aVar, boolean z, xpp xppVar, xpp xppVar2, Dialog dialog, Msg msg, ProfilesInfo profilesInfo, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            boolean z2 = z;
            if ((i & 2) != 0) {
                xppVar = aVar.b;
            }
            xpp xppVar3 = xppVar;
            if ((i & 4) != 0) {
                xppVar2 = aVar.c;
            }
            xpp xppVar4 = xppVar2;
            if ((i & 8) != 0) {
                dialog = aVar.d;
            }
            Dialog dialog2 = dialog;
            if ((i & 16) != 0) {
                msg = aVar.e;
            }
            Msg msg2 = msg;
            if ((i & 32) != 0) {
                profilesInfo = aVar.f;
            }
            aVar.getClass();
            return new a(z2, xppVar3, xppVar4, dialog2, msg2, profilesInfo);
        }

        public final int b() {
            Integer a = this.c.a();
            if (a != null) {
                return a.intValue();
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
            Dialog dialog = this.d;
            int hashCode2 = (hashCode + (dialog == null ? 0 : dialog.hashCode())) * 31;
            Msg msg = this.e;
            int hashCode3 = (hashCode2 + (msg == null ? 0 : msg.hashCode())) * 31;
            ProfilesInfo profilesInfo = this.f;
            return hashCode3 + (profilesInfo != null ? profilesInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BusinessNotificationsInfo(enabledByConfig=");
            sb.append(this.a);
            sb.append(", enabledByEngine=");
            sb.append(this.b);
            sb.append(", unreadCount=");
            sb.append(this.c);
            sb.append(", lastDialog=");
            sb.append(this.d);
            sb.append(", lastMsg=");
            sb.append(this.e);
            sb.append(", profilesInfo=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.f, ')');
        }

        public a(boolean z, xpp<Boolean> xppVar, xpp<Integer> xppVar2, Dialog dialog, Msg msg, ProfilesInfo profilesInfo) {
            this.a = z;
            this.b = xppVar;
            this.c = xppVar2;
            this.d = dialog;
            this.e = msg;
            this.f = profilesInfo;
        }

        public a(boolean z, int i) {
            this((i & 1) != 0 ? false : z, new xpp(Boolean.FALSE, false), new xpp(0, false), null, null, null);
        }
    }

    /* compiled from: State.kt */
    public static final class b {
        public final Object a;
        public final f1e0 b;

        public b(Object obj, f1e0 f1e0Var) {
            this.a = obj;
            this.b = f1e0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "EntityUpdateArgs(caller=" + this.a + ", profilesIds=" + this.b + ')';
        }
    }

    /* compiled from: State.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final ChooseMode h;
        public final y3i i;

        public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ChooseMode chooseMode, y3i y3iVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
            this.g = z7;
            this.h = chooseMode;
            this.i = y3iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && epx.f(this.h, cVar.h) && this.i.equals(cVar.i);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            ChooseMode chooseMode = this.h;
            return this.i.hashCode() + ((b + (chooseMode == null ? 0 : chooseMode.hashCode())) * 31);
        }

        public final String toString() {
            return "ListConfig(isInfoBarEnabled=" + this.a + ", isEduBarEnabled=" + this.b + ", isPinEnabled=" + this.c + ", isPreviewEnabled=" + this.d + ", isBirthdayCakeEnabled=" + this.e + ", showSublistEntrypointsAsRegularDialog=" + this.f + ", isArchiveEnabled=" + this.g + ", mode=" + this.h + ", isEduOnboardingEnabled=" + this.i + ')';
        }
    }

    /* compiled from: State.kt */
    public static final class d {
        public final boolean a;
        public final xpp<Integer> b;
        public final int c;
        public final Dialog d;
        public final Msg e;
        public final ProfilesInfo f;

        public d() {
            this(false, 63);
        }

        public static d a(d dVar, boolean z, xpp xppVar, int i, Dialog dialog, Msg msg, ProfilesInfo profilesInfo, int i2) {
            if ((i2 & 1) != 0) {
                z = dVar.a;
            }
            boolean z2 = z;
            if ((i2 & 2) != 0) {
                xppVar = dVar.b;
            }
            xpp xppVar2 = xppVar;
            if ((i2 & 4) != 0) {
                i = dVar.c;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                dialog = dVar.d;
            }
            Dialog dialog2 = dialog;
            if ((i2 & 16) != 0) {
                msg = dVar.e;
            }
            Msg msg2 = msg;
            if ((i2 & 32) != 0) {
                profilesInfo = dVar.f;
            }
            dVar.getClass();
            return new d(z2, xppVar2, i3, dialog2, msg2, profilesInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
        }

        public final int hashCode() {
            int a = shy.a(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
            Dialog dialog = this.d;
            int hashCode = (a + (dialog == null ? 0 : dialog.hashCode())) * 31;
            Msg msg = this.e;
            int hashCode2 = (hashCode + (msg == null ? 0 : msg.hashCode())) * 31;
            ProfilesInfo profilesInfo = this.f;
            return hashCode2 + (profilesInfo != null ? profilesInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MessageRequestsInfo(isAvailable=");
            sb.append(this.a);
            sb.append(", requestsCount=");
            sb.append(this.b);
            sb.append(", unreadCount=");
            sb.append(this.c);
            sb.append(", lastDialog=");
            sb.append(this.d);
            sb.append(", lastMsg=");
            sb.append(this.e);
            sb.append(", profilesInfo=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.f, ')');
        }

        public d(boolean z, xpp<Integer> xppVar, int i, Dialog dialog, Msg msg, ProfilesInfo profilesInfo) {
            this.a = z;
            this.b = xppVar;
            this.c = i;
            this.d = dialog;
            this.e = msg;
            this.f = profilesInfo;
        }

        public d(boolean z, int i) {
            this((i & 1) != 0 ? false : z, new xpp(0, false), 0, null, null, null);
        }
    }

    public e(DisplayNameFormatter displayNameFormatter, krl0 krl0Var, c cVar) {
        this.a = displayNameFormatter;
        this.b = krl0Var;
        this.c = cVar;
        Boolean bool = Boolean.FALSE;
        this.p = new xpp<>(bool, false);
        this.q = new xpp<>(bool, false);
        this.r = new xpp<>(0, false);
        this.s = new xpp<>(0, false);
        this.t = new HashMap();
        this.w = jgp.b;
        this.x = i5e0.b.a;
        this.E = new d(false, 63);
        this.F = new a(false, 63);
    }

    public static int c(ArrayList arrayList) {
        int i;
        int i2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            i = -1;
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            }
            ogm ogmVar = (ogm) listIterator.previous();
            agm agmVar = ogmVar instanceof agm ? (agm) ogmVar : null;
            if (agmVar != null && agmVar.m) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((ogm) it.next()) instanceof agm) {
                i = i3;
                break;
            }
            i3++;
        }
        return (i2 >= 0 || i >= 0) ? Math.max(i2 + 1, i) : arrayList.size();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final void a() {
        this.f = Peer.Unknown.e;
        this.g.clear();
        Iterator it = this.h.g.entrySet().iterator();
        while (it.hasNext()) {
            wpp wppVar = (wpp) ((Map.Entry) it.next()).getValue();
            wppVar.c.clear();
            wppVar.a.clear();
            wppVar.b.clear();
        }
        this.i.clear();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.E = new d(this.E.a, 62);
        this.F = new a(this.F.a, 62);
        Boolean bool = Boolean.FALSE;
        this.p = new xpp<>(bool, false);
        this.q = new xpp<>(bool, false);
        this.r = new xpp<>(0, false);
        this.s = new xpp<>(0, false);
        this.u = null;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x007e, code lost:
    
        if (r33.D == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0084, code lost:
    
        if (r11 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r33.D != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        r11 = true;
        r24 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0367 A[EDGE_INSN: B:153:0x0367->B:154:0x0367 BREAK  A[LOOP:0: B:93:0x0216->B:134:0x033f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qsm b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ih3 ih3Var;
        boolean z6;
        ro8 ro8Var;
        i5e0.a aVar;
        Iterator<Dialog> it;
        boolean hasNext;
        DisplayNameFormatter displayNameFormatter;
        boolean z7;
        ArrayList arrayList;
        DialogsHistory dialogsHistory;
        List list;
        ?? r9;
        long j;
        hcm hcmVar;
        ProfilesSimpleInfo profilesSimpleInfo;
        Msg msg;
        boolean z8;
        ImStoryState imStoryState;
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        qtd0 Ab;
        Integer a2;
        c cVar = this.c;
        y3i y3iVar = cVar.i;
        boolean z12 = cVar.f;
        ProfilesSimpleInfo Ob = this.h.Ob();
        d dVar = this.E;
        xpp<Integer> xppVar = dVar.b;
        int i = 0;
        int intValue = (dVar.a && xppVar.b() && (a2 = xppVar.a()) != null) ? a2.intValue() : 0;
        boolean z13 = intValue > 0 && this.e != DialogsFilter.REQUESTS;
        DialogsHistory dialogsHistory2 = this.g;
        ArrayList arrayList2 = new ArrayList(dialogsHistory2.size() + 10);
        InfoBar infoBar = this.u;
        boolean z14 = cVar.a && infoBar != null;
        boolean z15 = this.v != null;
        DialogsFilter dialogsFilter = this.e;
        DialogsFilter dialogsFilter2 = DialogsFilter.MAIN;
        boolean z16 = dialogsFilter == dialogsFilter2;
        if (z16) {
            if (dialogsHistory2.size() <= 1 && !dialogsHistory2.t()) {
                if (z14) {
                }
                z = false;
                z2 = z15;
            }
            DialogsFilter dialogsFilter3 = this.e;
            z3 = dialogsFilter3 != dialogsFilter2;
            boolean z17 = dialogsFilter3 != DialogsFilter.UNREAD;
            if (!z3 || z17) {
                if (cVar.g) {
                    z4 = true;
                } else {
                    Boolean a3 = this.p.a();
                    Boolean bool = Boolean.TRUE;
                    boolean f = epx.f(a3, bool);
                    boolean f2 = epx.f(this.q.b, bool);
                    if (this.p.a || this.q.a) {
                        z6 = true;
                        z4 = true;
                    } else {
                        z4 = true;
                        z6 = false;
                    }
                    Boolean bool2 = (Boolean) new xpp(Boolean.valueOf((f || f2) ? z4 : false), z6).b;
                    if (bool2 != null ? bool2.booleanValue() : false) {
                        z5 = z4;
                        if (z5) {
                            if (z3) {
                                Integer a4 = this.r.a();
                                ih3Var = new ih3(a4 != null ? a4.intValue() : 0, d(), (!dialogsHistory2.p() || d()) ? false : z4);
                            } else {
                                Integer a5 = this.r.a();
                                if ((a5 != null ? a5.intValue() : 0) > 0) {
                                    Integer a6 = this.r.a();
                                    ih3Var = new ih3(a6 != null ? a6.intValue() : 0, d(), false);
                                }
                            }
                            boolean z18 = this.F.b() > 0 ? z4 : false;
                            if (dialogsHistory2.p() || !e() || z12) {
                                ro8Var = null;
                            } else {
                                ro8Var = new ro8(this.F.b(), !((z18 || (dialogsHistory2.size() <= 6 ? z4 : false)) ? z4 : false));
                            }
                            if (d()) {
                                if (!((ro8Var == null || ro8Var.c) ? false : z4)) {
                                    if (ro8Var != null) {
                                        arrayList2.add(ro8Var);
                                    }
                                    if (ih3Var != null) {
                                        arrayList2.add(ih3Var);
                                    }
                                    if (!z12 && dialogsHistory2.p() && z13) {
                                        arrayList2.add(new tv30(intValue));
                                    }
                                    if (!z) {
                                        arrayList2.add(new jvw(infoBar));
                                    } else if (cVar.b) {
                                        arrayList2.add(u5p.b);
                                    }
                                    if (this.e == DialogsFilter.CHATS && this.m) {
                                        arrayList2.add(b7k.b);
                                    }
                                    if (this.n) {
                                        arrayList2.add(ixu.b);
                                    }
                                    if (this.o) {
                                        arrayList2.add(wvh0.b);
                                    }
                                    i5e0 i5e0Var = this.x;
                                    aVar = !(i5e0Var instanceof i5e0.a) ? (i5e0.a) i5e0Var : null;
                                    if (aVar != null) {
                                        arrayList2.add(new k5e0(aVar));
                                    }
                                    it = dialogsHistory2.iterator();
                                    while (true) {
                                        hasNext = it.hasNext();
                                        displayNameFormatter = this.a;
                                        if (hasNext) {
                                            break;
                                        }
                                        Dialog next = it.next();
                                        Long Sb = next.Sb();
                                        long longValue = Sb.longValue();
                                        Msg msg2 = dialogsHistory2.s().get(Sb);
                                        ArrayList arrayList3 = arrayList2;
                                        String d2 = displayNameFormatter.d(next, Ob);
                                        CharSequence charSequence = (CharSequence) this.i.get(next.Sb());
                                        y3i y3iVar2 = y3iVar;
                                        List list2 = (List) this.t.get(Sb);
                                        if (list2 == null) {
                                            list2 = EmptyList.b;
                                        }
                                        hcm hcmVar2 = new hcm(longValue, list2);
                                        Object obj = this.k.get(Sb);
                                        if (obj == null) {
                                            obj = Boolean.FALSE;
                                        }
                                        boolean booleanValue = ((Boolean) obj).booleanValue();
                                        Object obj2 = this.j.get(Sb);
                                        if (obj2 == null) {
                                            obj2 = Boolean.FALSE;
                                        }
                                        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                        boolean z19 = z12;
                                        if (next.bc() == Peer.Type.USER && (Ab = Ob.Ab(next.Sb())) != null && Ab.mb().Bb()) {
                                            j = longValue;
                                            hcmVar = hcmVar2;
                                            profilesSimpleInfo = Ob;
                                            msg = msg2;
                                            z8 = z4;
                                        } else {
                                            j = longValue;
                                            hcmVar = hcmVar2;
                                            profilesSimpleInfo = Ob;
                                            msg = msg2;
                                            z8 = false;
                                        }
                                        ChooseMode chooseMode = cVar.h;
                                        boolean z20 = !((chooseMode == null || chooseMode.a(next)) ? false : z4);
                                        long j2 = j;
                                        boolean z21 = this.l;
                                        boolean z22 = (cVar.c && next.Bc()) ? z4 : false;
                                        boolean z23 = cVar.d;
                                        boolean z24 = cVar.e;
                                        c cVar2 = cVar;
                                        ImStoryState imStoryState2 = (ImStoryState) this.w.get(next.Zb());
                                        if (imStoryState2 == null) {
                                            imStoryState2 = ImStoryState.NONE;
                                        }
                                        if (next.Gb()) {
                                            Msg msg3 = dialogsHistory2.s().get(Sb);
                                            MsgFromUser msgFromUser = msg3 instanceof MsgFromUser ? (MsgFromUser) msg3 : null;
                                            if (msgFromUser != null) {
                                                cew.b.getClass();
                                                MsgReadAsLastData f3 = cew.f(j2);
                                                if (f3 != null) {
                                                    imStoryState = imStoryState2;
                                                    int i2 = msgFromUser.d;
                                                    z9 = z23;
                                                    if (i2 == f3.a || ((num = f3.d) != null && i2 == num.intValue())) {
                                                        z10 = z4;
                                                        if (f3.b == z10 && msgFromUser.T == null) {
                                                            z11 = z10;
                                                            DialogsHistory dialogsHistory3 = dialogsHistory2;
                                                            boolean z25 = z10;
                                                            agm agmVar = new agm(next, msg, d2, charSequence, profilesSimpleInfo, booleanValue2, booleanValue, hcmVar, z8, z20, z21, z22, z9, z24, imStoryState, z11);
                                                            Ob = profilesSimpleInfo;
                                                            arrayList3.add(agmVar);
                                                            i = 0;
                                                            arrayList2 = arrayList3;
                                                            dialogsHistory2 = dialogsHistory3;
                                                            y3iVar = y3iVar2;
                                                            z12 = z19;
                                                            z4 = z25;
                                                            cVar = cVar2;
                                                        }
                                                    }
                                                    z10 = z4;
                                                }
                                            }
                                            imStoryState = imStoryState2;
                                            z9 = z23;
                                            z10 = z4;
                                        } else {
                                            imStoryState = imStoryState2;
                                            z9 = z23;
                                            z10 = z4;
                                        }
                                        z11 = false;
                                        DialogsHistory dialogsHistory32 = dialogsHistory2;
                                        boolean z252 = z10;
                                        agm agmVar2 = new agm(next, msg, d2, charSequence, profilesSimpleInfo, booleanValue2, booleanValue, hcmVar, z8, z20, z21, z22, z9, z24, imStoryState, z11);
                                        Ob = profilesSimpleInfo;
                                        arrayList3.add(agmVar2);
                                        i = 0;
                                        arrayList2 = arrayList3;
                                        dialogsHistory2 = dialogsHistory32;
                                        y3iVar = y3iVar2;
                                        z12 = z19;
                                        z4 = z252;
                                        cVar = cVar2;
                                    }
                                    y3i y3iVar3 = y3iVar;
                                    z7 = z12;
                                    int i3 = i;
                                    arrayList = arrayList2;
                                    dialogsHistory = dialogsHistory2;
                                    boolean z26 = z4;
                                    if (z7) {
                                        d dVar2 = this.E;
                                        if (z13 && dVar2.c > 0) {
                                            int c2 = c(arrayList);
                                            int i4 = dVar2.c;
                                            String c3 = displayNameFormatter.c(dVar2.d, dVar2.f);
                                            Msg msg4 = dVar2.e;
                                            arrayList.add(c2, new uv30(i4, msg4 != null ? Long.valueOf(msg4.g) : null, c3));
                                        }
                                        a aVar2 = this.F;
                                        if (aVar2.b() > 0 && e()) {
                                            int c4 = c(arrayList);
                                            int b2 = aVar2.b();
                                            String c5 = displayNameFormatter.c(aVar2.d, aVar2.f);
                                            Msg msg5 = aVar2.e;
                                            arrayList.add(c4, new so8(b2, msg5 != null ? Long.valueOf(msg5.g) : null, c5));
                                        }
                                    }
                                    if (!z2 || (dialogsHistory.size() < 2 && !dialogsHistory.u() && z16)) {
                                        rts rtsVar = this.v;
                                        list = rtsVar != null ? rtsVar.a : null;
                                        if (list == null) {
                                            list = EmptyList.b;
                                        }
                                        List list3 = list;
                                        boolean z27 = !BuildInfo.t();
                                        if (!this.D) {
                                            y3iVar3.invoke();
                                            if (!Boolean.FALSE.booleanValue()) {
                                                r9 = i3;
                                                arrayList.add(new wd80(list3, z27, r9));
                                            }
                                        }
                                        r9 = z26;
                                        arrayList.add(new wd80(list3, z27, r9));
                                    }
                                    if (this.e == DialogsFilter.REQUESTS) {
                                        arrayList.add(i3, aw30.b);
                                    }
                                    if (dialogsHistory.u()) {
                                        arrayList.add(vpz.b);
                                    }
                                    DialogsFilter dialogsFilter4 = this.e;
                                    boolean e = e();
                                    int b3 = this.F.b();
                                    y3iVar3.invoke();
                                    return new qsm(arrayList, Ob, dialogsFilter4, intValue, e, b3, null, Boolean.FALSE.booleanValue(), 64);
                                }
                            }
                            if (ih3Var != null) {
                                arrayList2.add(ih3Var);
                            }
                            if (ro8Var != null) {
                                arrayList2.add(ro8Var);
                            }
                            if (!z12) {
                                arrayList2.add(new tv30(intValue));
                            }
                            if (!z) {
                            }
                            if (this.e == DialogsFilter.CHATS) {
                                arrayList2.add(b7k.b);
                            }
                            if (this.n) {
                            }
                            if (this.o) {
                            }
                            i5e0 i5e0Var2 = this.x;
                            if (!(i5e0Var2 instanceof i5e0.a)) {
                            }
                            if (aVar != null) {
                            }
                            it = dialogsHistory2.iterator();
                            while (true) {
                                hasNext = it.hasNext();
                                displayNameFormatter = this.a;
                                if (hasNext) {
                                }
                                boolean z2522 = z10;
                                agm agmVar22 = new agm(next, msg, d2, charSequence, profilesSimpleInfo, booleanValue2, booleanValue, hcmVar, z8, z20, z21, z22, z9, z24, imStoryState, z11);
                                Ob = profilesSimpleInfo;
                                arrayList3.add(agmVar22);
                                i = 0;
                                arrayList2 = arrayList3;
                                dialogsHistory2 = dialogsHistory32;
                                y3iVar = y3iVar2;
                                z12 = z19;
                                z4 = z2522;
                                cVar = cVar2;
                            }
                            y3i y3iVar32 = y3iVar;
                            z7 = z12;
                            int i32 = i;
                            arrayList = arrayList2;
                            dialogsHistory = dialogsHistory2;
                            boolean z262 = z4;
                            if (z7) {
                            }
                            if (!z2) {
                            }
                            rts rtsVar2 = this.v;
                            if (rtsVar2 != null) {
                            }
                            if (list == null) {
                            }
                            List list32 = list;
                            boolean z272 = !BuildInfo.t();
                            if (!this.D) {
                            }
                            r9 = z262;
                            arrayList.add(new wd80(list32, z272, r9));
                            if (this.e == DialogsFilter.REQUESTS) {
                            }
                            if (dialogsHistory.u()) {
                            }
                            DialogsFilter dialogsFilter42 = this.e;
                            boolean e2 = e();
                            int b32 = this.F.b();
                            y3iVar32.invoke();
                            return new qsm(arrayList, Ob, dialogsFilter42, intValue, e2, b32, null, Boolean.FALSE.booleanValue(), 64);
                        }
                    }
                }
                z5 = false;
                if (z5) {
                }
            } else {
                z4 = true;
            }
            ih3Var = null;
            if (this.F.b() > 0) {
            }
            if (dialogsHistory2.p()) {
            }
            ro8Var = null;
            if (d()) {
            }
            if (ih3Var != null) {
            }
            if (ro8Var != null) {
            }
            if (!z12) {
            }
            if (!z) {
            }
            if (this.e == DialogsFilter.CHATS) {
            }
            if (this.n) {
            }
            if (this.o) {
            }
            i5e0 i5e0Var22 = this.x;
            if (!(i5e0Var22 instanceof i5e0.a)) {
            }
            if (aVar != null) {
            }
            it = dialogsHistory2.iterator();
            while (true) {
                hasNext = it.hasNext();
                displayNameFormatter = this.a;
                if (hasNext) {
                }
                boolean z25222 = z10;
                agm agmVar222 = new agm(next, msg, d2, charSequence, profilesSimpleInfo, booleanValue2, booleanValue, hcmVar, z8, z20, z21, z22, z9, z24, imStoryState, z11);
                Ob = profilesSimpleInfo;
                arrayList3.add(agmVar222);
                i = 0;
                arrayList2 = arrayList3;
                dialogsHistory2 = dialogsHistory32;
                y3iVar = y3iVar2;
                z12 = z19;
                z4 = z25222;
                cVar = cVar2;
            }
            y3i y3iVar322 = y3iVar;
            z7 = z12;
            int i322 = i;
            arrayList = arrayList2;
            dialogsHistory = dialogsHistory2;
            boolean z2622 = z4;
            if (z7) {
            }
            if (!z2) {
            }
            rts rtsVar22 = this.v;
            if (rtsVar22 != null) {
            }
            if (list == null) {
            }
            List list322 = list;
            boolean z2722 = !BuildInfo.t();
            if (!this.D) {
            }
            r9 = z2622;
            arrayList.add(new wd80(list322, z2722, r9));
            if (this.e == DialogsFilter.REQUESTS) {
            }
            if (dialogsHistory.u()) {
            }
            DialogsFilter dialogsFilter422 = this.e;
            boolean e22 = e();
            int b322 = this.F.b();
            y3iVar322.invoke();
            return new qsm(arrayList, Ob, dialogsFilter422, intValue, e22, b322, null, Boolean.FALSE.booleanValue(), 64);
        }
        z = false;
        z2 = false;
        DialogsFilter dialogsFilter32 = this.e;
        if (dialogsFilter32 != dialogsFilter2) {
        }
        if (dialogsFilter32 != DialogsFilter.UNREAD) {
        }
        if (z3) {
        }
        if (cVar.g) {
        }
        z5 = false;
        if (z5) {
        }
        ih3Var = null;
        if (this.F.b() > 0) {
        }
        if (dialogsHistory2.p()) {
        }
        ro8Var = null;
        if (d()) {
        }
        if (ih3Var != null) {
        }
        if (ro8Var != null) {
        }
        if (!z12) {
        }
        if (!z) {
        }
        if (this.e == DialogsFilter.CHATS) {
        }
        if (this.n) {
        }
        if (this.o) {
        }
        i5e0 i5e0Var222 = this.x;
        if (!(i5e0Var222 instanceof i5e0.a)) {
        }
        if (aVar != null) {
        }
        it = dialogsHistory2.iterator();
        while (true) {
            hasNext = it.hasNext();
            displayNameFormatter = this.a;
            if (hasNext) {
            }
            boolean z252222 = z10;
            agm agmVar2222 = new agm(next, msg, d2, charSequence, profilesSimpleInfo, booleanValue2, booleanValue, hcmVar, z8, z20, z21, z22, z9, z24, imStoryState, z11);
            Ob = profilesSimpleInfo;
            arrayList3.add(agmVar2222);
            i = 0;
            arrayList2 = arrayList3;
            dialogsHistory2 = dialogsHistory32;
            y3iVar = y3iVar2;
            z12 = z19;
            z4 = z252222;
            cVar = cVar2;
        }
        y3i y3iVar3222 = y3iVar;
        z7 = z12;
        int i3222 = i;
        arrayList = arrayList2;
        dialogsHistory = dialogsHistory2;
        boolean z26222 = z4;
        if (z7) {
        }
        if (!z2) {
        }
        rts rtsVar222 = this.v;
        if (rtsVar222 != null) {
        }
        if (list == null) {
        }
        List list3222 = list;
        boolean z27222 = !BuildInfo.t();
        if (!this.D) {
        }
        r9 = z26222;
        arrayList.add(new wd80(list3222, z27222, r9));
        if (this.e == DialogsFilter.REQUESTS) {
        }
        if (dialogsHistory.u()) {
        }
        DialogsFilter dialogsFilter4222 = this.e;
        boolean e222 = e();
        int b3222 = this.F.b();
        y3iVar3222.invoke();
        return new qsm(arrayList, Ob, dialogsFilter4222, intValue, e222, b3222, null, Boolean.FALSE.booleanValue(), 64);
    }

    public final boolean d() {
        Integer a2 = this.s.a();
        return (a2 != null ? a2.intValue() : 0) > 0;
    }

    public final boolean e() {
        boolean z;
        int b2 = this.F.b();
        DialogsFilter dialogsFilter = this.e;
        boolean z2 = dialogsFilter == DialogsFilter.MAIN || (dialogsFilter == DialogsFilter.UNREAD && b2 > 0);
        a aVar = this.F;
        if (aVar.a) {
            Boolean a2 = aVar.b.a();
            if (a2 != null ? a2.booleanValue() : false) {
                z = true;
                return !z && z2;
            }
        }
        z = false;
        if (z) {
        }
    }

    public final boolean f() {
        if (!this.g.d().isEmpty()) {
            return true;
        }
        a aVar = this.F;
        if (aVar.b.d() || aVar.c.d()) {
            return true;
        }
        List l = e43.l(this.r, this.s, this.p);
        if ((l instanceof Collection) && l.isEmpty()) {
            return false;
        }
        Iterator it = l.iterator();
        while (it.hasNext()) {
            if (((xpp) it.next()).d()) {
                return true;
            }
        }
        return false;
    }
}
