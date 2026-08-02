package com.vk.im.ui.components.contacts;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.m;
import com.facebook.soloader.MinElf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.contacts.ContactSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.movika.sdk.base.observable.s;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asu0;
import xsna.c5g;
import xsna.cau0;
import xsna.cn;
import xsna.cq8;
import xsna.dwg;
import xsna.e43;
import xsna.epx;
import xsna.f8g0;
import xsna.f960;
import xsna.fw3;
import xsna.g2v;
import xsna.gdj;
import xsna.gzs;
import xsna.hdp;
import xsna.hei0;
import xsna.hfz;
import xsna.iw3;
import xsna.izs;
import xsna.jgq;
import xsna.k7f;
import xsna.m270;
import xsna.o25;
import xsna.p46;
import xsna.p4g;
import xsna.ph3;
import xsna.qtd0;
import xsna.qv20;
import xsna.s3q0;
import xsna.sbj;
import xsna.t8j;
import xsna.xcd;
import xsna.yh1;
import xsna.zwi;

/* compiled from: ContactsModel.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes2.dex */
public final class b {
    public final zwi a;
    public final com.vk.im.engine.models.c b;
    public final boolean c;
    public final String d;
    public final Set<Long> e;
    public final xcd f;
    public final k7f g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final d<gdj> o;
    public final d<a> p;
    public final d<s3q0> q;
    public Object r;
    public int s;
    public int t;

    /* compiled from: ContactsModel.kt */
    public static final class a {
        public final boolean a;
        public final SortOrder b;
        public final List<hfz> c;
        public final m.d d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, SortOrder sortOrder, List<? extends hfz> list, m.d dVar) {
            this.a = z;
            this.b = sortOrder;
            this.c = list;
            this.d = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = fw3.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
            m.d dVar = this.d;
            return a + (dVar == null ? 0 : dVar.hashCode());
        }

        public final String toString() {
            return "ViewModel(isLoading=" + this.a + ", sortOrder=" + this.b + ", items=" + this.c + ", diff=" + this.d + ')';
        }
    }

    /* compiled from: ContactsModel.kt */
    /* renamed from: com.vk.im.ui.components.contacts.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1147b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(zwi zwiVar, cau0 cau0Var, Set set, boolean z, boolean z2, String str, Set set2, xcd xcdVar, k7f k7fVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = zwiVar;
        this.b = cau0Var;
        this.c = z2;
        this.d = str;
        this.e = set2;
        this.f = xcdVar;
        this.g = k7fVar;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        EmptyList emptyList = EmptyList.b;
        sbj sbjVar = new sbj(null, 0L, 0L, null, null, null, null, null, false, false, false, 0, 0, null, MinElf.PN_XNUM);
        d<gdj> O0 = d.O0(new gdj(emptyList, set, z, cau0Var, sbjVar, null, emptyList, null, true, false, new jgq(false, false)));
        this.o = O0;
        this.p = d.O0(new a(true, sbjVar.p, emptyList, null));
        this.q = d.O0(s3q0.a);
        this.r = emptyList;
        asu0.a.getClass();
        O0.a0(asu0.k()).U(new iw3(new dwg(this, 6), 8)).b(2, 1).U(new yh1(new s(22), 12)).subscribe(new ph3(this, 23));
    }

    public static void c(gzs gzsVar) {
        asu0.a.getClass();
        asu0.j().submit(new p46(1, gzsVar));
    }

    public static boolean e(boolean z, sbj sbjVar) {
        return z && sbjVar.d.isEmpty() && sbjVar.f.isEmpty() && sbjVar.g.isEmpty() && sbjVar.h.isEmpty() && sbjVar.i.isEmpty();
    }

    public static int j(qtd0 qtd0Var) {
        int i = C1147b.$EnumSwitchMapping$0[qtd0Var.t8().ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 0;
        }
        throw new IllegalArgumentException("Unexpected profile " + qtd0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00da, code lost:
    
        if (r8.b == true) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        if (r12.b == true) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(gdj gdjVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList<hfz> arrayList = new ArrayList<>();
        boolean z6 = this.n;
        if (!z6) {
            b(gdjVar, arrayList, z);
        }
        sbj sbjVar = gdjVar.e;
        ArrayList arrayList2 = new ArrayList();
        p4g.a(cq8.f.h, arrayList2, f(ContactsViews.CREATE_CHAT));
        p4g.a(cq8.d.h, arrayList2, f(ContactsViews.CREATE_CASPER_CHAT));
        cq8.e eVar = new cq8.e(this.m);
        boolean z7 = false;
        if (f(ContactsViews.CREATE_CHANNEL)) {
            g2v.c().getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        p4g.a(eVar, arrayList2, z2);
        p4g.a(cq8.c.h, arrayList2, f(ContactsViews.CREATE_CALL));
        arrayList.addAll(arrayList2);
        boolean z8 = sbjVar.k;
        ContactSyncState contactSyncState = sbjVar.a;
        int size = sbjVar.f.size();
        ContactsViews contactsViews = ContactsViews.SHOW_CONTACT_LIST;
        p4g.a(new cq8.b(contactsViews, R.string.vkim_contact_list, R.drawable.vk_icon_user_square_outline_28, R.drawable.vk_icon_user_square_outline_28, size, false, 64), arrayList, f(contactsViews));
        p4g.a(cq8.g.h, arrayList, f(ContactsViews.INVITE) && e43.l(ContactSyncState.PERMITTED, ContactSyncState.DONE, ContactSyncState.HIDDEN).contains(contactSyncState));
        ArrayList arrayList3 = new ArrayList();
        cq8.h hVar = new cq8.h(!z6);
        if (f(ContactsViews.INVITE_BY_PHONE_NUMBER)) {
            if (o25.b(o25.a())) {
                cn o = o25.a().o();
                if (o25.b(o25.a())) {
                    VerifyInfo verifyInfo = o.l;
                    if (verifyInfo != null) {
                    }
                }
            }
            z3 = true;
            p4g.a(hVar, arrayList3, z3);
            cq8.i iVar = cq8.i.h;
            if (f(ContactsViews.WRITE_BY_PHONE_NUMBER)) {
                if (o25.b(o25.a())) {
                    cn o2 = o25.a().o();
                    if (o25.b(o25.a())) {
                        VerifyInfo verifyInfo2 = o2.l;
                        if (verifyInfo2 != null) {
                        }
                    }
                }
                z4 = true;
                p4g.a(iVar, arrayList3, z4);
                if (!this.j) {
                    arrayList.addAll(arrayList3);
                }
                p4g.a(cq8.a.h, arrayList, !f(ContactsViews.CREATE_CONTACT) && z8);
                p4g.a(new m270(contactSyncState), arrayList, !f(ContactsViews.EMPTY) && e(z, sbjVar));
                if (f(ContactsViews.REQUEST_PERMISSION)) {
                    sbj sbjVar2 = d().e;
                    ContactSyncState contactSyncState2 = sbjVar2.a;
                    ContactSyncState contactSyncState3 = d().e.a;
                    ContactSyncState contactSyncState4 = ContactSyncState.PERMITTED;
                    ContactSyncState contactSyncState5 = ContactSyncState.DONE;
                    if (!e43.l(contactSyncState4, contactSyncState5, ContactSyncState.HIDDEN, ContactSyncState.SYNCING).contains(contactSyncState2) && !Collections.singletonList(contactSyncState5).contains(contactSyncState3) && System.currentTimeMillis() - sbjVar2.b < sbjVar2.c) {
                        z5 = true;
                        p4g.a(new f8g0(contactSyncState), arrayList, z5);
                        f960 f960Var = new f960(sbjVar.f);
                        if (f(ContactsViews.NEW_USERS_BANNER) && !sbjVar.f.isEmpty() && !z5) {
                            z7 = true;
                        }
                        p4g.a(f960Var, arrayList, z7);
                        if (z6) {
                            b(gdjVar, arrayList, z);
                        }
                        return arrayList;
                    }
                }
                z5 = false;
                p4g.a(new f8g0(contactSyncState), arrayList, z5);
                f960 f960Var2 = new f960(sbjVar.f);
                if (f(ContactsViews.NEW_USERS_BANNER)) {
                    z7 = true;
                }
                p4g.a(f960Var2, arrayList, z7);
                if (z6) {
                }
                return arrayList;
            }
            z4 = false;
            p4g.a(iVar, arrayList3, z4);
            if (!this.j) {
            }
            p4g.a(cq8.a.h, arrayList, !f(ContactsViews.CREATE_CONTACT) && z8);
            p4g.a(new m270(contactSyncState), arrayList, !f(ContactsViews.EMPTY) && e(z, sbjVar));
            if (f(ContactsViews.REQUEST_PERMISSION)) {
            }
            z5 = false;
            p4g.a(new f8g0(contactSyncState), arrayList, z5);
            f960 f960Var22 = new f960(sbjVar.f);
            if (f(ContactsViews.NEW_USERS_BANNER)) {
            }
            p4g.a(f960Var22, arrayList, z7);
            if (z6) {
            }
            return arrayList;
        }
        z3 = false;
        p4g.a(hVar, arrayList3, z3);
        cq8.i iVar2 = cq8.i.h;
        if (f(ContactsViews.WRITE_BY_PHONE_NUMBER)) {
        }
        z4 = false;
        p4g.a(iVar2, arrayList3, z4);
        if (!this.j) {
        }
        p4g.a(cq8.a.h, arrayList, !f(ContactsViews.CREATE_CONTACT) && z8);
        p4g.a(new m270(contactSyncState), arrayList, !f(ContactsViews.EMPTY) && e(z, sbjVar));
        if (f(ContactsViews.REQUEST_PERMISSION)) {
        }
        z5 = false;
        p4g.a(new f8g0(contactSyncState), arrayList, z5);
        f960 f960Var222 = new f960(sbjVar.f);
        if (f(ContactsViews.NEW_USERS_BANNER)) {
        }
        p4g.a(f960Var222, arrayList, z7);
        if (z6) {
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void b(gdj gdjVar, ArrayList<hfz> arrayList, boolean z) {
        ?? r1 = this.r;
        boolean z2 = false;
        boolean z3 = this.j;
        hei0 hei0Var = new hei0(this.d, r1, z3 && d().k.b, z3 && d().k.a);
        if (f(ContactsViews.SELECTION_PREVIEW) && this.c && !e(z, gdjVar.e)) {
            z2 = true;
        }
        p4g.a(hei0Var, arrayList, z2);
    }

    public final gdj d() {
        return this.o.P0();
    }

    public final boolean f(ContactsViews contactsViews) {
        return d().b.contains(contactsViews);
    }

    public final boolean g(t8j t8jVar) {
        qtd0 qtd0Var = t8jVar.b;
        int i = t8jVar.c;
        if (this.e.contains(Long.valueOf(qtd0Var.G3()))) {
            return false;
        }
        qtd0 qtd0Var2 = t8jVar.b;
        if (i == 0) {
            return f(ContactsViews.USERS) || (f(ContactsViews.CONTACTS) && ((qtd0Var2 instanceof User) && ((User) qtd0Var2).c != null));
        }
        if (i == 1) {
            return f(ContactsViews.HINTS);
        }
        if (i == 2) {
            return f(ContactsViews.BIRTHDAYS);
        }
        if (i == 3) {
            return f(ContactsViews.CONTACTS);
        }
        if (i == 4) {
            return f(ContactsViews.RECENT_USERS);
        }
        if (i == 5) {
            return f(ContactsViews.CONTACTS);
        }
        if (i == 8) {
            return f(ContactsViews.USERS_FROM_ROOT_CONVERSATION);
        }
        if (i == 10) {
            return f(ContactsViews.CONTACTS);
        }
        if (i == 11) {
            return f(ContactsViews.EDU_CONTACTS);
        }
        throw new IllegalArgumentException("Unexpected type " + i);
    }

    public final boolean h(qtd0 qtd0Var) {
        Object obj;
        Iterator it = ((Iterable) this.r).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qtd0) obj).G3() == qtd0Var.G3()) {
                break;
            }
        }
        return obj != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final gdj i(gdj gdjVar) {
        if (!this.j) {
            return gdjVar;
        }
        int size = this.r.size();
        List<qtd0> list = gdjVar.a;
        jgq jgqVar = gdjVar.k;
        boolean z = size == list.size() && jgqVar.b;
        boolean z2 = jgqVar.b;
        jgqVar.getClass();
        return gdj.a(gdjVar, null, null, null, null, null, false, new jgq(z, z2), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final ArrayList k(List list, Map map, izs izsVar) {
        String name;
        List<qtd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (qtd0 qtd0Var : list2) {
            int intValue = ((Number) izsVar.invoke(qtd0Var)).intValue();
            boolean z = d().c;
            if (z) {
                name = qtd0Var.h8();
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                name = qtd0Var.name();
            }
            arrayList.add(new t8j(qtd0Var, intValue, hdp.a.a(name), map.containsKey(Long.valueOf(qtd0Var.G3())), ((Boolean) this.f.invoke(qtd0Var)).booleanValue(), ((Boolean) this.g.invoke(qtd0Var)).booleanValue(), this.h, false, qv20.k(qtd0Var), null, 31616));
        }
        return arrayList;
    }
}
