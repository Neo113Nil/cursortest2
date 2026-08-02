package com.vk.donut.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Size;
import com.vk.api.generated.orders.dto.OrdersGetAllUserSubscriptionsResponseDto;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0j0;
import xsna.a8t;
import xsna.acc0;
import xsna.anj;
import xsna.bg90;
import xsna.c220;
import xsna.cl30;
import xsna.cvg;
import xsna.dnz;
import xsna.e43;
import xsna.eg90;
import xsna.enj;
import xsna.f3o;
import xsna.h0n0;
import xsna.hf8;
import xsna.hg6;
import xsna.iah0;
import xsna.ikv0;
import xsna.kyn;
import xsna.n8c0;
import xsna.nyn;
import xsna.or;
import xsna.pr;
import xsna.q5o;
import xsna.q890;
import xsna.qr;
import xsna.rr;
import xsna.rsg0;
import xsna.skz;
import xsna.tfx;
import xsna.v2o;
import xsna.vt30;
import xsna.whd;
import xsna.xzi0;
import xsna.yfb;
import xsna.z23;

/* compiled from: PaidSubscriptionsPresenter.kt */
/* loaded from: classes18.dex */
public final class a implements bg90, c.l<h0n0> {
    public final PaidSubscriptionsFragment b;
    public c d;
    public final ListDataSet c = new ListDataSet();
    public final PaidSubscriptionsPresenter$broadcastReceiver$1 e = new BroadcastReceiver() { // from class: com.vk.donut.impl.PaidSubscriptionsPresenter$broadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c cVar;
            if (!"com.vkontakte.android.DONUT_SUBSCRIPTION_PAID".equals(intent.getAction()) || (cVar = a.this.d) == null) {
                return;
            }
            cVar.p(false);
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.donut.impl.PaidSubscriptionsPresenter$broadcastReceiver$1] */
    public a(PaidSubscriptionsFragment paidSubscriptionsFragment) {
        this.b = paidSubscriptionsFragment;
    }

    public static ArrayList x(a0j0 a0j0Var) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a0j0Var);
        a0j0Var.a = 2;
        return arrayList;
    }

    public static ArrayList z(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a8t a8tVar = new a8t((GameSubscription) arrayList.get(i));
            a8tVar.a = 1;
            arrayList2.add(a8tVar);
        }
        q890 q890Var = new q890(iah0.a(8));
        q890Var.a = 4;
        arrayList2.add(q890Var);
        return arrayList2;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b(h0n0.a aVar, boolean z, c cVar, ArrayList arrayList) {
        if (z && !((List) aVar.a.b).isEmpty()) {
            arrayList.addAll(x(new a0j0(R.string.subscriptions_donut_category_authors)));
        }
        q5o q5oVar = aVar.a;
        if (!((List) q5oVar.b).isEmpty()) {
            kyn kynVar = (kyn) q5oVar.c;
            List list = (List) q5oVar.b;
            int size = list.size();
            int i = size + 1;
            if (kynVar != null) {
                i = size + 2;
            }
            ArrayList arrayList2 = new ArrayList(i);
            if (kynVar != null) {
                nyn nynVar = new nyn(kynVar);
                nynVar.a = 1;
                arrayList2.add(nynVar);
            }
            List list2 = list;
            if ((list2 instanceof List) && (list2 instanceof RandomAccess)) {
                List list3 = list2;
                int size2 = list3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    f3o f3oVar = new f3o((v2o) list3.get(i2));
                    f3oVar.a = 1;
                    arrayList2.add(f3oVar);
                }
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    f3o f3oVar2 = new f3o((v2o) it.next());
                    f3oVar2.a = 1;
                    arrayList2.add(f3oVar2);
                }
            }
            q890 q890Var = new q890(iah0.a(8));
            q890Var.a = 4;
            arrayList2.add(q890Var);
            arrayList.addAll(arrayList2);
        }
        ListDataSet listDataSet = this.c;
        if (z) {
            listDataSet.setItems(arrayList);
        } else {
            listDataSet.n0(arrayList);
        }
        cVar.q(cVar.k() + cVar.i());
        cVar.r(((List) q5oVar.b).size() >= cVar.k());
    }

    @Override // xsna.gm6
    public final void d() {
        this.d = f.a(new c.h(this), this.b.T);
        IntentFilter a = z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.e, a, hf8.a, 4);
    }

    public final ArrayList g(Integer num) {
        ArrayList arrayList = new ArrayList(2);
        xzi0 xzi0Var = new xzi0(num, new vt30(this, 9));
        xzi0Var.a = 1;
        arrayList.add(xzi0Var);
        arrayList.add(new q890(iah0.a(6)));
        return arrayList;
    }

    @Override // com.vk.lists.c.k
    public final q<h0n0> hj(c cVar, boolean z) {
        cVar.r(true);
        return ui(0, cVar);
    }

    @Override // xsna.bg90
    public final void l4() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.p(false);
        }
        PaidSubscriptionsFragment paidSubscriptionsFragment = this.b;
        ikv0.a aVar = new ikv0.a(paidSubscriptionsFragment.requireContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.u = new ikv0.d(paidSubscriptionsFragment.getString(R.string.vk_subscription_canceled), (String) null, (ikv0.d.a) null, 6);
        aVar.f = paidSubscriptionsFragment.getView();
        aVar.n();
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.e);
    }

    @Override // xsna.bg90
    public final void q2() {
        c cVar = this.d;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // xsna.bg90
    public final hg6<eg90> r0() {
        return this.c;
    }

    @Override // com.vk.lists.c.l
    public final q<h0n0> ui(int i, c cVar) {
        int k = cVar.k();
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(k);
        tfx tfxVar = new tfx("donut.getSubscriptions", new or(11), new pr(15));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        tfxVar.f(valueOf2.intValue(), 0, 100, "count");
        HashMap<String, String> hashMap = tfxVar.d;
        if (hashMap == null) {
            hashMap = null;
        }
        if (hashMap != null) {
            hashMap.put("fields", "verified,trending,info");
        }
        return x.B(rsg0.w0(yfb.x(tfxVar)), i == 0 ? rsg0.w0(yfb.x(new tfx("orders.getAllUserSubscriptions", new qr(24), new rr(25)))) : x.k(new OrdersGetAllUserSubscriptionsResponseDto(0, EmptyList.b)), new dnz(new whd(6), 16)).l(new n8c0(new acc0(12), 10)).w();
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<h0n0> qVar, boolean z, c cVar) {
        this.b.eo(qVar.subscribe(new cl30(new cvg(this, z, cVar), 4), new skz(new c220(9), 12)));
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
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
