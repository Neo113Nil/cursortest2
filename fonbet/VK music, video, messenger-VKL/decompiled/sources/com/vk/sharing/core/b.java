package com.vk.sharing.core;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.network.kbh.state.NetworkState;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.sharing.core.a;
import com.vk.sharing.core.target.Targets;
import com.vk.sharing.core.view.l;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import xsna.bcj0;
import xsna.cvk;
import xsna.d6q0;
import xsna.e43;
import xsna.ez;
import xsna.gbj0;
import xsna.i4o0;
import xsna.j6i;
import xsna.kbj0;
import xsna.m7m;
import xsna.mk5;
import xsna.nr4;
import xsna.plg;
import xsna.qdz;
import xsna.qfq;
import xsna.r9l;
import xsna.s3q0;
import xsna.xhr0;
import xsna.zmp0;

/* compiled from: CommonPresenter.java */
/* loaded from: classes5.dex */
public final class b extends com.vk.sharing.core.a {
    public AbstractC1779b l;
    public final List<Peer> m;
    public boolean n;
    public Integer o;
    public io.reactivex.rxjava3.disposables.c p;

    /* compiled from: CommonPresenter.java */
    public final class a extends AbstractC1779b {
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b bVar, boolean z) {
            super();
            l lVar = bVar.i;
            this.b = bVar;
            if (z) {
                mk5 mk5Var = new mk5();
                mk5Var.e(100L);
                mk5Var.excludeTarget(R.id.content_animator, true);
                zmp0.a((ViewGroup) lVar, mk5Var.excludeTarget(R.id.targets_recycler, true));
            }
            if (com.vk.sharing.core.a.j) {
                b.k(bVar.f, bVar.g, lVar);
            } else {
                lVar.setPostForFriendsOnlyHint(false);
                lVar.b6();
            }
        }

        @Override // com.vk.sharing.core.b.AbstractC1779b
        public final void a(@NonNull Target target) {
            this.b.f.x3(target);
        }
    }

    /* compiled from: CommonPresenter.java */
    /* renamed from: com.vk.sharing.core.b$b, reason: collision with other inner class name */
    public abstract class AbstractC1779b {
        public AbstractC1779b() {
        }

        public abstract void a(@NonNull Target target);
    }

    /* compiled from: CommonPresenter.java */
    public final class c extends AbstractC1779b {
        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super();
            a.InterfaceC1778a interfaceC1778a = b.this.f;
            Targets targets = b.this.g;
            l lVar = b.this.i;
            b.k(interfaceC1778a, targets, lVar);
            mk5 mk5Var = new mk5();
            mk5Var.e(100L);
            mk5Var.excludeTarget(R.id.content_animator, true);
            zmp0.a((ViewGroup) lVar, mk5Var.excludeTarget(R.id.targets_recycler, true));
        }

        @Override // com.vk.sharing.core.b.AbstractC1779b
        public final void a(@NonNull Target target) {
            b.this.f.x3(target);
        }
    }

    public b(@NonNull a.InterfaceC1778a interfaceC1778a) {
        this(interfaceC1778a, false, null, null);
    }

    public static boolean f(String str) {
        return e43.a.getPackageManager().resolveActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)), 0) != null;
    }

    public static void k(a.InterfaceC1778a interfaceC1778a, Targets targets, l lVar) {
        boolean s = BuildInfo.s();
        ActionsInfo d3 = interfaceC1778a.d3();
        if ((com.vk.sharing.core.a.j || com.vk.sharing.core.a.k) && targets.b.size() > 0) {
            lVar.ug(true);
            return;
        }
        if (!s || d3.a(com.vk.sharing.core.a.j)) {
            lVar.setPostForFriendsOnlyHint(false);
            lVar.b6();
            return;
        }
        String str = d3.f;
        String str2 = d3.g;
        if (str.isEmpty() && (str2 == null || str2.isEmpty())) {
            lVar.I1();
            return;
        }
        lVar.t3(str);
        lVar.z8(str2);
        lVar.Vm();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void B2() {
        Optional.ofNullable(d()).ifPresent(new plg());
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void D2() {
        this.i.se();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void E2(boolean z) {
        Targets targets = this.g;
        LinkedList<Target> linkedList = targets.b;
        LinkedList<Target> linkedList2 = targets.b;
        int size = linkedList.size();
        a.InterfaceC1778a interfaceC1778a = this.f;
        if (size == 0) {
            cvk.w(interfaceC1778a.getString(R.string.sharing_toast_choose_target, new Object[0]), false);
            return;
        }
        l lVar = this.i;
        interfaceC1778a.b3(lVar.getCommentText(), Collections.unmodifiableList(linkedList2), true);
        final HashMap hashMap = new HashMap();
        Collections.unmodifiableList(linkedList2).forEach(new Consumer() { // from class: xsna.qlg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Target target = (Target) obj;
                int S1 = com.vk.sharing.core.b.this.i.S1(target);
                if (S1 != -1) {
                    hashMap.put(Integer.valueOf(S1), target);
                }
            }
        });
        if (z) {
            lVar.hide();
        }
        Optional.ofNullable(d()).ifPresent(new Consumer() { // from class: xsna.rlg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((gbj0) obj).e(hashMap);
            }
        });
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void F2() {
        if (this.h.i) {
            this.i.e0();
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void H2(int i) {
        AttachmentInfo i3;
        r9l r9lVar = new r9l(i);
        r9l r9lVar2 = r9lVar;
        switch (i) {
            case 1:
                a.InterfaceC1778a interfaceC1778a = this.f;
                gbj0 d = d();
                h hVar = new h(this.f, (Boolean) null);
                hVar.l = WallRepostSettings.g;
                hVar.c = d;
                ViewGroup viewGroup = (ViewGroup) hVar.i;
                mk5 mk5Var = new mk5();
                mk5Var.e(100L);
                mk5Var.excludeTarget(R.id.content_animator, true);
                zmp0.a(viewGroup, mk5Var.excludeTarget(R.id.targets_recycler, true));
                hVar.f();
                interfaceC1778a.f3(hVar);
                r9lVar2 = r9lVar;
                break;
            case 2:
                a.InterfaceC1778a interfaceC1778a2 = this.f;
                gbj0 d2 = d();
                d dVar = new d(this.f, null);
                dVar.l = false;
                dVar.c = d2;
                dVar.i.setFullScreen(false);
                dVar.i.tg();
                dVar.f();
                interfaceC1778a2.f3(dVar);
                r9lVar2 = r9lVar;
                break;
            case 3:
                this.f.u3();
                r9lVar2 = r9lVar;
                break;
            case 4:
                ((BaseSharingActivity) this.f).T1();
                this.i.hide();
                r9lVar2 = r9lVar;
                break;
            case 5:
                bcj0 bcj0Var = new bcj0(i);
                bcj0Var.c = "NO_EXTRAS";
                this.f.z3(bcj0Var);
                this.i.hide();
                r9lVar2 = bcj0Var;
                break;
            case 6:
                this.f.r3();
                r9lVar2 = r9lVar;
                break;
            case 7:
                if (d6q0.t != NetworkState.UNSTABLE) {
                    this.f.n3();
                    s3q0 s3q0Var = s3q0.a;
                    r9lVar2 = r9lVar;
                    break;
                } else {
                    cvk.t();
                    r9lVar2 = r9lVar;
                    break;
                }
            case 11:
            case 12:
                this.f.g3();
                r9lVar2 = r9lVar;
                break;
            case 13:
                this.f.q3();
                r9lVar2 = r9lVar;
                break;
            case 14:
                this.f.Z2("org.telegram.messenger");
                r9lVar2 = r9lVar;
                break;
            case 15:
                this.f.Z2("com.whatsapp");
                r9lVar2 = r9lVar;
                break;
            case 16:
                this.f.m3();
                r9lVar2 = r9lVar;
                break;
            case 17:
                this.f.Z2("org.telegram.messenger.web");
                r9lVar2 = r9lVar;
                break;
            case 18:
                String a2 = (xhr0.b(e43.a, "ru.oneme.app") || (i3 = this.f.i3()) == null) ? null : qfq.a.C3560a.a(i3.b);
                if (!TextUtils.isEmpty(a2)) {
                    BaseSharingActivity baseSharingActivity = (BaseSharingActivity) this.f;
                    baseSharingActivity.getClass();
                    qdz p = ((BridgeComponent) j6i.b(m7m.f(baseSharingActivity), BridgeComponent.class)).p();
                    LaunchContext.a aVar = new LaunchContext.a();
                    aVar.h = a2;
                    aVar.b = true;
                    aVar.k = true;
                    p.getBrowser().f(baseSharingActivity, null, aVar.a(), a2);
                    r9lVar2 = r9lVar;
                    break;
                } else {
                    this.f.Z2("ru.oneme.app");
                    r9lVar2 = r9lVar;
                    break;
                }
                break;
        }
        if (d() != null) {
            d().c(r9lVar2);
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void K2(@NonNull Target target, int i) {
        AbstractC1779b abstractC1779b = this.l;
        if (abstractC1779b != null) {
            b bVar = b.this;
            l lVar = bVar.i;
            int S1 = lVar.S1(target);
            if (S1 >= 0) {
                lVar.D0(S1);
            }
            gbj0 d = bVar.d();
            if (d != null) {
                d.b(target, Integer.valueOf(i));
            }
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void O2(boolean z) {
        if (this.h.i) {
            return;
        }
        this.f.f3(new com.vk.sharing.core.c(this, z));
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void b() {
        if (this.h.i) {
            return;
        }
        this.h.b(this.g.f(), this.m, this.o);
        this.i.e0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void e(@NonNull Target target, int i) {
        AbstractC1779b abstractC1779b = this.l;
        if (abstractC1779b != null) {
            abstractC1779b.a(target);
        }
    }

    public final void g() {
        if (this.f.e3()) {
            l lVar = this.i;
            lVar.p3();
            lVar.Gg();
            lVar.ee();
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void h2() {
        Optional.ofNullable(d()).ifPresent(new plg());
        if (d() != null) {
            d().reset();
        }
        this.i.hide();
    }

    public final void i() {
        l lVar = this.i;
        lVar.tm();
        a.InterfaceC1778a interfaceC1778a = this.f;
        lVar.u0(interfaceC1778a.getString(R.string.sharing_title1, new Object[0]), true);
        lVar.showTitle();
        lVar.setEmptyText(interfaceC1778a.getString(R.string.sharing_empty_dialogs, new Object[0]));
        lVar.setErrorMessage(interfaceC1778a.getString(R.string.sharing_error_loading_dialogs, new Object[0]));
        lVar.setSearchHint(interfaceC1778a.getString(R.string.sharing_hint_search_by_dialogs, new Object[0]));
        lVar.setCommentHint(true);
        lVar.w7();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void i2() {
        Optional.ofNullable(d()).ifPresent(new plg());
        super.i2();
    }

    public final void j(boolean z) {
        ActionsInfo d3 = this.f.d3();
        if (d3 == null || !d3.a(com.vk.sharing.core.a.j)) {
            this.l = new c();
        } else {
            this.l = new a(this, z);
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void k2(@NonNull qfq qfqVar) {
        if (d() != null) {
            d().k2(qfqVar);
        }
        boolean z = qfqVar instanceof qfq.a;
        a.InterfaceC1778a interfaceC1778a = this.f;
        if (z) {
            interfaceC1778a.Z2(((qfq.a) qfqVar).g);
        } else if (qfqVar instanceof qfq.b) {
            ((BaseSharingActivity) interfaceC1778a).T1();
        } else if (qfqVar instanceof qfq.c) {
            interfaceC1778a.A3();
        } else if (qfqVar instanceof qfq.d) {
            interfaceC1778a.a3();
        } else if (qfqVar instanceof qfq.e) {
            interfaceC1778a.Z2(null);
        }
        this.i.hide();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void l2(@NonNull Target target, int i, boolean z) {
        AbstractC1779b abstractC1779b = this.l;
        if (abstractC1779b != null) {
            b bVar = b.this;
            Targets targets = bVar.g;
            Targets.j(targets.c, target);
            targets.k(target);
            a.InterfaceC1778a interfaceC1778a = bVar.f;
            l lVar = bVar.i;
            Targets targets2 = bVar.g;
            k(interfaceC1778a, targets2, lVar);
            if (targets2.b.size() == 0) {
                lVar.d0();
            }
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void m2(boolean z) {
        this.e = z;
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void s2() {
        if (this.h.i || this.g.f) {
            return;
        }
        this.i.xa();
        this.h.b(this.g.f(), null, null);
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void u2(@NonNull Target target, int i, @Nullable String str) {
        AbstractC1779b abstractC1779b = this.l;
        if (abstractC1779b != null) {
            b bVar = b.this;
            Targets targets = bVar.g;
            Targets.j(targets.c, target);
            targets.k(target);
            if (str == null) {
                str = bVar.i.getCommentText();
            }
            a.InterfaceC1778a interfaceC1778a = bVar.f;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, target);
            interfaceC1778a.b3(str, arrayList, false);
            bVar.d();
        }
    }

    @Override // com.vk.sharing.core.a, xsna.l4o0.b
    public final void v(@NonNull ArrayList<Target> arrayList, boolean z) {
        super.v(arrayList, z);
        List<Target> f = this.g.f();
        l lVar = this.i;
        lVar.Mh(f, true);
        lVar.f0();
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void x2(boolean z) {
        l lVar = this.i;
        if (z) {
            if (lVar.getFullScreen()) {
                return;
            }
            this.n = true;
            lVar.setFullScreen(true);
            return;
        }
        k(this.f, this.g, lVar);
        if (this.n) {
            lVar.setFullScreen(false);
            this.n = false;
        }
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void y2(@NonNull Target target, int i, @Nullable String str) {
        gbj0 d;
        AbstractC1779b abstractC1779b = this.l;
        if (abstractC1779b == null || (d = b.this.d()) == null) {
            return;
        }
        d.d(target, Integer.valueOf(i));
    }

    @Override // com.vk.sharing.core.a, com.vk.sharing.core.view.l.a
    public final void z2() {
        ((BaseSharingActivity) this.f).getClass();
        q<kbj0.a> o = nr4.b().o();
        l lVar = this.i;
        Objects.requireNonNull(lVar);
        this.p = o.subscribe(new ez(lVar, 14));
    }

    public b(@NonNull com.vk.sharing.core.c cVar) {
        super(cVar.f, Boolean.valueOf(com.vk.sharing.core.a.j));
        this.n = false;
        this.o = null;
        new io.reactivex.rxjava3.disposables.b();
        this.i.setFullScreen(cVar.m);
        i();
        ArrayList<Target> arrayList = this.g.c;
        if (arrayList != null) {
            Collections.sort(arrayList, new i4o0());
        }
        Targets targets = this.g;
        targets.e = null;
        targets.g = "";
        if (com.vk.sharing.core.a.j) {
            List unmodifiableList = Collections.unmodifiableList(targets.b);
            if (targets.c == null) {
                targets.c = new ArrayList<>();
            }
            targets.c.addAll(unmodifiableList);
            Targets.e(targets.c);
        }
        this.i.j7();
        this.i.Pk();
        this.i.uk();
        this.i.O8();
        this.i.n8();
        this.i.Mh(this.g.f(), true);
        this.i.f0();
        j(true);
        g();
    }

    public b(@NonNull a.InterfaceC1778a interfaceC1778a, boolean z, @Nullable ArrayList arrayList, @Nullable Integer num) {
        super(interfaceC1778a, null);
        boolean b;
        this.n = false;
        this.o = null;
        new io.reactivex.rxjava3.disposables.b();
        this.m = arrayList;
        this.o = num;
        if (interfaceC1778a.y3()) {
            this.i.setFullScreen(true);
        }
        i();
        Targets targets = this.g;
        if (targets.c != null) {
            this.i.Mh(targets.f(), true);
            this.i.f0();
        } else {
            if (!this.h.i) {
                this.h.b(Collections.EMPTY_LIST, arrayList, num);
            }
            this.i.e0();
        }
        this.i.Pk();
        this.i.nk();
        this.i.w7();
        this.i.i0();
        this.i.uk();
        if (!z) {
            this.i.f0();
            this.i.Mh(this.g.f(), true);
        }
        if (interfaceC1778a.E3()) {
            l lVar = this.i;
            List<qfq> l = e43.l(qfq.b.g, qfq.e, qfq.c, qfq.d, qfq.f, new qfq.a(R.string.sharing_external_app_telegram_x, R.drawable.vk_icon_logo_telegram_x_color_28, "org.thunderdog.challegram"), new qfq.a(R.string.sharing_external_app_viber, R.drawable.vk_icon_logo_viber_color_28, "com.viber.voip"), new qfq.a(R.string.sharing_external_app_skype, R.drawable.vk_icon_logo_skype_color_28, "com.skype.raider"), new qfq.a(R.string.sharing_external_app_tamtam, R.drawable.vk_icon_logo_tamtam_color_28, "ru.ok.messages"), qfq.c.g, qfq.d.g, new qfq.e(R.string.sharing_action_button_label4_new, R.drawable.vk_icon_share_external_outline_28));
            ArrayList arrayList2 = new ArrayList();
            for (qfq qfqVar : l) {
                if (qfqVar instanceof qfq.c) {
                    b = f("mailto:");
                } else if (qfqVar instanceof qfq.d) {
                    b = f("smsto:");
                } else {
                    b = qfqVar instanceof qfq.a ? xhr0.b(e43.a, ((qfq.a) qfqVar).g) : true;
                }
                qfqVar = b ? qfqVar : null;
                if (qfqVar != null) {
                    arrayList2.add(qfqVar);
                }
            }
            lVar.setExternalApps(arrayList2);
        }
        j(!z);
        if (z) {
            this.i.h0(interfaceC1778a.y3());
        }
        g();
        if (interfaceC1778a.D3()) {
            return;
        }
        this.i.Gg();
    }
}
