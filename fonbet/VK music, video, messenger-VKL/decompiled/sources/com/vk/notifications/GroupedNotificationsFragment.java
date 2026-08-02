package com.vk.notifications;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.ImageScreenSize;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.voip.stereo.api.notifications.di.interactor.VoipStereoSpeakerNotifications;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import xsna.asu0;
import xsna.bd70;
import xsna.bg1;
import xsna.bpn0;
import xsna.ce60;
import xsna.eu0;
import xsna.f3p0;
import xsna.g4g;
import xsna.gn0;
import xsna.gpu0;
import xsna.hou;
import xsna.ij70;
import xsna.iou;
import xsna.izs;
import xsna.j60;
import xsna.jcg;
import xsna.jjv0;
import xsna.kou;
import xsna.li70;
import xsna.ll1;
import xsna.m4w;
import xsna.mu0;
import xsna.n5i;
import xsna.os8;
import xsna.oz50;
import xsna.p870;
import xsna.phh0;
import xsna.pv2;
import xsna.qcl;
import xsna.qi70;
import xsna.rj70;
import xsna.rsg0;
import xsna.s0d0;
import xsna.t72;
import xsna.ugm;
import xsna.uoh;
import xsna.w8i;
import xsna.zkh;

/* compiled from: GroupedNotificationsFragment.kt */
/* loaded from: classes4.dex */
public class GroupedNotificationsFragment extends BaseFragment implements c.m<com.vk.dto.notifications.a>, w8i {
    public static final /* synthetic */ int f0 = 0;
    public String V;
    public Toolbar W;
    public com.vk.lists.c X;
    public RecyclerPaginatedView Y;
    public hou Z;
    public final bpn0 S = new bpn0(new n5i(this, 21));
    public final bpn0 T = new bpn0(new jcg(this, 23));
    public final bpn0 U = new bpn0(new g4g(this, 23));
    public final qi70 a0 = new qi70();
    public final io.reactivex.rxjava3.disposables.b b0 = new io.reactivex.rxjava3.disposables.b();
    public int c0 = -1;
    public final ArrayList<WeakReference<phh0>> d0 = new ArrayList<>();
    public final b e0 = new b();

    /* compiled from: GroupedNotificationsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: GroupedNotificationsFragment.kt */
    public final class b implements bd70<Photo> {
        public b() {
        }

        public final void a(izs<? super Photo, Boolean> izsVar) {
            s0 s0Var = new s0(new t72(4, this, izsVar));
            asu0.a.getClass();
            m1 a0 = s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            GroupedNotificationsFragment groupedNotificationsFragment = GroupedNotificationsFragment.this;
            int i = 26;
            groupedNotificationsFragment.eo(a0.subscribe(new gn0(new qcl(groupedNotificationsFragment, 20), i), new bg1(new j60(i), 29)));
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Photo photo) {
            Photo photo2 = photo;
            if (i == 130) {
                a(new uoh(photo2, 23));
            } else {
                if (i != 131) {
                    return;
                }
                a(new zkh(photo2, 22));
            }
        }
    }

    /* compiled from: GroupedNotificationsFragment.kt */
    public static final class c {
        public c() {
        }
    }

    /* compiled from: GroupedNotificationsFragment.kt */
    public static final class d implements jjv0 {
        public d() {
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            if (i < 0) {
                int i2 = GroupedNotificationsFragment.f0;
                return 0;
            }
            GroupedNotificationsFragment groupedNotificationsFragment = GroupedNotificationsFragment.this;
            hou houVar = groupedNotificationsFragment.Z;
            if (i < (houVar != null ? houVar.E0() : 0)) {
                hou houVar2 = groupedNotificationsFragment.Z;
                if ((houVar2 != null ? (NotificationItem) houVar2.c.c(i) : null) == null && i != 0) {
                    return 1;
                }
            }
            return 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    @Override // com.vk.lists.c.m
    public final q<com.vk.dto.notifications.a> O9(String str, com.vk.lists.c cVar) {
        String str2 = this.V;
        int k = cVar.k();
        ij70 ij70Var = new ij70("notifications.getGrouped");
        ij70Var.s = -1;
        if (str2 != null) {
            ij70Var.K("query", str2);
        }
        ij70Var.K("start_from", str);
        ij70Var.C(k, "count");
        ij70Var.C(1, "photo_sizes");
        ij70Var.K("fields", "name,screen_name,sex,verified,can_write_private_message,photo_base");
        ij70Var.s = (str == null || !str.equals("0")) ? this.c0 : -1;
        return rsg0.y0(ij70Var, null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final q<com.vk.dto.notifications.a> hj(com.vk.lists.c cVar, boolean z) {
        q<com.vk.dto.notifications.a> O9 = O9("0", cVar);
        eu0 eu0Var = new eu0(new iou(this, 0), 28);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return O9.E(eu0Var, lVar, kVar, kVar);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.V = arguments != null ? arguments.getString("query") : null;
        ce60.b.getClass();
        p870 f = p870.f();
        b bVar = this.e0;
        f.b(130, bVar);
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        View inflate = layoutInflater.inflate(R.layout.layout_base_fragment, viewGroup, false);
        this.W = (Toolbar) inflate.findViewById(R.id.toolbar);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title", null) : null;
        if (string == null || string.length() == 0) {
            string = getString(R.string.not_notifications);
        }
        Toolbar toolbar = this.W;
        if (toolbar != null) {
            toolbar.setTitle(string);
        }
        Toolbar toolbar2 = this.W;
        if (toolbar2 != null) {
            f3p0.a(toolbar2, this, new ugm(this, 9));
        }
        Toolbar toolbar3 = this.W;
        Menu menu = toolbar3 != null ? toolbar3.getMenu() : null;
        FragmentActivity activity = getActivity();
        onCreateOptionsMenu(menu, activity != null ? activity.getMenuInflater() : null);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        this.Y = recyclerPaginatedView;
        if (recyclerPaginatedView != null) {
            new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        }
        hou houVar = new hou(kn(), this.b0);
        houVar.m = new c();
        this.Z = houVar;
        os8 os8Var = new os8(this.d0);
        RecyclerPaginatedView recyclerPaginatedView2 = this.Y;
        if (recyclerPaginatedView2 != null && (recyclerView3 = recyclerPaginatedView2.getRecyclerView()) != null) {
            recyclerView3.addOnScrollListener(os8Var);
        }
        hou houVar2 = this.Z;
        if (houVar2 != null) {
            houVar2.l = os8Var;
        }
        if (houVar2 != null) {
            houVar2.p = new NotificationClickHandlerImpl((rj70) this.S.getValue(), (VoipStereoSpeakerNotifications) this.T.getValue(), (ProfileFragmentProviderComponent) this.U.getValue());
        }
        RecyclerPaginatedView recyclerPaginatedView3 = this.Y;
        if (recyclerPaginatedView3 != null) {
            recyclerPaginatedView3.setAdapter(this.Z);
        }
        gpu0 gpu0Var = new gpu0(inflate.getContext());
        gpu0Var.j = new d();
        RecyclerPaginatedView recyclerPaginatedView4 = this.Y;
        if (recyclerPaginatedView4 != null && (recyclerView2 = recyclerPaginatedView4.getRecyclerView()) != null) {
            recyclerView2.addItemDecoration(gpu0Var);
        }
        RecyclerPaginatedView recyclerPaginatedView5 = this.Y;
        if (recyclerPaginatedView5 != null && (recyclerView = recyclerPaginatedView5.getRecyclerView()) != null) {
            recyclerView.addOnScrollListener(new kou(this));
        }
        Toolbar toolbar4 = this.W;
        if (toolbar4 != null) {
            RecyclerPaginatedView recyclerPaginatedView6 = this.Y;
            RecyclerView recyclerView4 = recyclerPaginatedView6 != null ? recyclerPaginatedView6.getRecyclerView() : null;
            if (recyclerView4 != null) {
                toolbar4.setOnClickListener(new m4w(new WeakReference(recyclerView4), 4));
            }
        }
        c.h hVar = new c.h(this);
        hVar.i = 30;
        hVar.s = 7;
        hVar.t = new s0d0() { // from class: xsna.jou
            @Override // xsna.s0d0
            public final u0d0 a(int i) {
                io.reactivex.rxjava3.disposables.c cVar;
                int i2 = GroupedNotificationsFragment.f0;
                li70.b bVar = li70.R;
                GroupedNotificationsFragment groupedNotificationsFragment = GroupedNotificationsFragment.this;
                hou houVar3 = groupedNotificationsFragment.Z;
                NotificationItem notificationItem = houVar3 != null ? (NotificationItem) houVar3.c.c(i) : null;
                if (notificationItem != null) {
                    ArrayList arrayList = new ArrayList();
                    NotificationEntity notificationEntity = notificationItem.d;
                    ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_48DP;
                    String b2 = li70.b.b(notificationEntity, imageScreenSize);
                    Field field = mcr0.a;
                    j5g.v0(b2 != null ? mcr0.r(Uri.parse(b2), imageScreenSize, null) : io.reactivex.rxjava3.internal.operators.completable.i.b, arrayList);
                    String b3 = li70.b.b(notificationItem.j, imageScreenSize);
                    j5g.v0(b3 != null ? mcr0.r(Uri.parse(b3), imageScreenSize, null) : io.reactivex.rxjava3.internal.operators.completable.i.b, arrayList);
                    String str = notificationItem.f;
                    j5g.v0(str != null ? mcr0.r(Uri.parse(str), ImageScreenSize.SIZE_16DP, null) : io.reactivex.rxjava3.internal.operators.completable.i.b, arrayList);
                    ArrayList<NotificationEntity> arrayList2 = notificationItem.k;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            NotificationEntity notificationEntity2 = arrayList2.get(i3);
                            ImageScreenSize imageScreenSize2 = ImageScreenSize.SIZE_36DP;
                            String b4 = li70.b.b(notificationEntity2, imageScreenSize2);
                            j5g.v0(b4 != null ? mcr0.r(Uri.parse(b4), imageScreenSize2, null) : io.reactivex.rxjava3.internal.operators.completable.i.b, arrayList);
                        }
                    }
                    cVar = io.reactivex.rxjava3.core.a.m(arrayList).subscribe();
                } else {
                    cVar = EmptyDisposable.INSTANCE;
                }
                groupedNotificationsFragment.fo(cVar);
                return new v0d0(cVar);
            }
        };
        this.X = f.a(hVar, this.Y);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ce60.b.getClass();
        p870.f().g(this.e0);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.W = null;
        this.Y = null;
        this.Z = null;
        com.vk.lists.c cVar = this.X;
        if (cVar != null) {
            cVar.v();
        }
        this.X = null;
        this.b0.dispose();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        LinkedHashSet<String> linkedHashSet = this.a0.a;
        if (!linkedHashSet.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            b.d dVar = new b.d("notify");
            dVar.b(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "action");
            dVar.b(jSONArray, "notify_ids");
            dVar.h();
            linkedHashSet.clear();
        }
        super.onPause();
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<com.vk.dto.notifications.a> qVar, boolean z, com.vk.lists.c cVar) {
        eo(qVar.subscribe(new pv2(new ll1(9, cVar, this), 19), new com.vk.im.ui.components.dialogs_list.b(new mu0(z, this, 2), 27)));
    }
}
