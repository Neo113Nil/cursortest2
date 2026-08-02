package com.vk.friends.discover;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vkontakte.android.data.FriendsUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.anj;
import xsna.asu0;
import xsna.bj50;
import xsna.bl30;
import xsna.ble;
import xsna.bpn0;
import xsna.bps;
import xsna.buc0;
import xsna.cj50;
import xsna.dnz;
import xsna.e1r0;
import xsna.e43;
import xsna.eiy;
import xsna.emh0;
import xsna.enj;
import xsna.epj0;
import xsna.epx;
import xsna.f0o0;
import xsna.fps;
import xsna.gm6;
import xsna.gps;
import xsna.h8n0;
import xsna.hxm0;
import xsna.im80;
import xsna.izs;
import xsna.m0m0;
import xsna.nit;
import xsna.qw30;
import xsna.r2v;
import xsna.rj70;
import xsna.rsg0;
import xsna.s0d0;
import xsna.s170;
import xsna.s3q0;
import xsna.ta50;
import xsna.uu60;
import xsna.v1d0;
import xsna.vos;
import xsna.x310;
import xsna.xvq0;
import xsna.yjs;
import xsna.z23;
import xsna.z7i;
import xsna.zi50;
import xsna.zm3;

/* compiled from: UsersDiscoverPresenter.kt */
/* loaded from: classes13.dex */
public final class UsersDiscoverPresenter implements gm6, c.m<a> {
    public final UsersDiscoverFragment b;
    public int e;
    public String i;
    public String j;
    public z7i k;
    public UserId l;
    public boolean m;
    public int n;
    public final ListDataSet<Object> c = new ListDataSet<>();
    public final String d = "swipe_friends";
    public final s170 f = new s170();
    public final s170 g = new s170();
    public final ArrayList<UserDiscoverItem> h = new ArrayList<>();
    public final HashMap<UserId, Integer> o = new HashMap<>();
    public final bpn0 p = new bpn0(new im80(9));
    public final UsersDiscoverPresenter$receiver$1 q = new BroadcastReceiver() { // from class: com.vk.friends.discover.UsersDiscoverPresenter$receiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            UserId userId;
            String action = intent != null ? intent.getAction() : null;
            if (action == null || action.hashCode() != -611648706 || !action.equals("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED") || (extras = intent.getExtras()) == null || (userId = (UserId) intent.getParcelableExtra("id")) == null) {
                return;
            }
            UsersDiscoverPresenter.this.o.put(userId, Integer.valueOf(extras.getInt("status")));
        }
    };
    public final bpn0 r = new bpn0(new buc0(13));
    public final bpn0 s = new bpn0(new ta50(13));
    public final bpn0 t = new bpn0(new h8n0(this, 8));

    /* compiled from: UsersDiscoverPresenter.kt */
    public static final class a {
        public final gps a;
        public final List<RequestUserProfile> b;
        public final boolean c;
        public final VKFromList<RequestUserProfile> d;
        public final String e;

        public a() {
            this(null, null, false, null, null, 31);
        }

        public a(gps gpsVar, List list, boolean z, VKFromList vKFromList, String str, int i) {
            gpsVar = (i & 1) != 0 ? null : gpsVar;
            list = (i & 2) != 0 ? null : list;
            z = (i & 4) != 0 ? false : z;
            vKFromList = (i & 8) != 0 ? null : vKFromList;
            str = (i & 16) != 0 ? null : str;
            this.a = gpsVar;
            this.b = list;
            this.c = z;
            this.d = vKFromList;
            this.e = str;
        }
    }

    /* compiled from: UsersDiscoverPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: UsersDiscoverPresenter.kt */
    public static final class c implements izs {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ UsersDiscoverPresenter c;
        public final /* synthetic */ UserDiscoverItem d;
        public final /* synthetic */ boolean e;

        public c(boolean z, UsersDiscoverPresenter usersDiscoverPresenter, UserDiscoverItem userDiscoverItem, boolean z2) {
            this.b = z;
            this.c = usersDiscoverPresenter;
            this.d = userDiscoverItem;
            this.e = z2;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            if (this.b) {
                this.c.n++;
            }
            if (!epx.f(obj, 0)) {
                this.d.i0 = Boolean.valueOf(this.e);
            }
            return s3q0.a;
        }
    }

    /* compiled from: UsersDiscoverPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.vk.friends.discover.UsersDiscoverPresenter$receiver$1] */
    public UsersDiscoverPresenter(UsersDiscoverFragment usersDiscoverFragment) {
        this.b = usersDiscoverFragment;
    }

    @Override // com.vk.lists.c.m
    public final q<a> O9(String str, com.vk.lists.c cVar) {
        s170 s170Var = this.f;
        String b2 = s170Var.b();
        bpn0 bpn0Var = this.p;
        String str2 = this.d;
        if (b2 != null) {
            int i = 4;
            return new o0(rsg0.T(new fps(cVar.k(), this.l, s170Var.a(), str2)), new dnz(new qw30((zi50) bpn0Var.getValue(), i), i)).a0(asu0.a.d()).U(new bj50(new m0m0(5), 15));
        }
        vos vosVar = new vos(str, cVar.k(), UserDiscoverItem.B0);
        vosVar.H0(this.j);
        vosVar.F0(str2);
        vosVar.t = "user_discover_item";
        vosVar.s = "swipe_friends";
        vosVar.K("block_type", "swipe_friends");
        return cj50.b(rsg0.T(vosVar), (zi50) bpn0Var.getValue()).a0(asu0.a.d()).U(new dnz(new emh0(this, 11), 21));
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b(ArrayList<UserDiscoverItem> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<UserDiscoverItem> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ListDataSet<Object> listDataSet = this.c;
            if (!hasNext) {
                listDataSet.n0(arrayList2);
                return;
            } else {
                UserDiscoverItem next = it.next();
                if (!listDataSet.d.contains(next)) {
                    arrayList2.add(next);
                }
            }
        }
    }

    @Override // xsna.gm6
    public final void d() {
        s0d0 s0d0Var = new s0d0() { // from class: xsna.x0r0
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                String t;
                UsersDiscoverPresenter usersDiscoverPresenter = UsersDiscoverPresenter.this;
                Object c2 = usersDiscoverPresenter.c.c(i);
                UserDiscoverItem userDiscoverItem = c2 instanceof UserDiscoverItem ? (UserDiscoverItem) c2 : null;
                if (userDiscoverItem == null || (t = q6x.t(userDiscoverItem, null)) == null) {
                    return u0d0.a;
                }
                io.reactivex.rxjava3.disposables.c subscribe = mcr0.s(t).subscribe();
                usersDiscoverPresenter.b.eo(subscribe);
                return new v0d0(subscribe);
            }
        };
        UsersDiscoverFragment usersDiscoverFragment = this.b;
        new com.vk.lists.c(null, this, usersDiscoverFragment.k0, new v1d0(4, s0d0Var), true, 2, true, 10, 1073741823, null, "0", null, null, null, false, false, true, true, true).b(usersDiscoverFragment, true, true, 0L, null);
        IntentFilter a2 = z23.a("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.q, a2, null, 4);
    }

    public final boolean g() {
        return ((Boolean) this.s.getValue()).booleanValue();
    }

    @Override // com.vk.lists.c.k
    public final q<a> hj(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        boolean z2 = this.m;
        bpn0 bpn0Var = this.p;
        String str = this.d;
        if (!z2) {
            return new o0(rsg0.T(new bps(cVar.k(), this.l, str)), new nit(new bl30((zi50) bpn0Var.getValue(), 4), 7)).a0(asu0.a.d()).U(new r2v(new epj0(9), 19));
        }
        this.f.f(null);
        vos vosVar = new vos(null, cVar.k(), UserDiscoverItem.B0);
        vosVar.H0(this.j);
        vosVar.F0(str);
        vosVar.t = "user_discover_item";
        vosVar.s = "swipe_friends";
        vosVar.K("block_type", "swipe_friends");
        return cj50.b(rsg0.T(vosVar), (zi50) bpn0Var.getValue()).a0(asu0.a.d()).U(new x310(new hxm0(7), 16));
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.q);
    }

    @Override // xsna.cc6
    public final void onPause() {
        if (this.n > 0) {
            ((rj70) this.t.getValue()).a(false);
            FriendsUtils.a(this.n);
            this.n = 0;
        }
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<a> qVar, boolean z, com.vk.lists.c cVar) {
        this.b.eo(qVar.subscribe(new eiy(new zm3(this, z, cVar), 25), new uu60(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 28)));
    }

    @SuppressLint({"CheckResult"})
    public final void x(UserDiscoverItem userDiscoverItem, boolean z) {
        rsg0 yjsVar;
        if (((Boolean) this.r.getValue()).booleanValue()) {
            return;
        }
        boolean z2 = userDiscoverItem.n0;
        boolean z3 = !z2;
        if (!z && z2) {
            UserId userId = userDiscoverItem.c;
            yjsVar = new ble("friends.skip");
            yjsVar.F(userId, "user_id");
        } else if (z || z2) {
            yjsVar = new yjs(userDiscoverItem.c);
        } else {
            UserId userId2 = userDiscoverItem.c;
            yjsVar = new e1r0("friends.ignoreInterestingRequest", 1);
            yjsVar.F(userId2, CommonUrlParts.REQUEST_ID);
        }
        String str = userDiscoverItem.J;
        if (str != null && str.length() != 0) {
            yjsVar.K("track_code", userDiscoverItem.J);
        }
        if (!z2) {
            s170 s170Var = this.f;
            int a2 = s170Var.a() - 1;
            if (a2 < 0) {
                a2 = 0;
            }
            s170Var.e(a2);
        }
        yjsVar.k = true;
        rsg0.y0(yjsVar, null, null, 3).subscribe(new xvq0(new c(z3, this, userDiscoverItem, z), 1), new f0o0(new d(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList<UserDiscoverItem> z(List<? extends RequestUserProfile> list) {
        ArrayList<UserDiscoverItem> arrayList = new ArrayList<>();
        for (RequestUserProfile requestUserProfile : list) {
            if (requestUserProfile instanceof UserDiscoverItem) {
                UserDiscoverItem userDiscoverItem = (UserDiscoverItem) requestUserProfile;
                UserId userId = this.l;
                if (userId != null && epx.f(userDiscoverItem.c, userId)) {
                    this.l = null;
                    Bundle arguments = this.b.getArguments();
                    if (arguments != null) {
                        arguments.remove("pinned_request_id");
                    }
                }
                arrayList.add(requestUserProfile);
            }
        }
        return arrayList;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
