package com.vk.sharing.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.sharing.api.dto.Target;
import com.vk.sharing.api.dto.WallRepostSettings;
import com.vk.sharing.core.target.Targets;
import com.vk.sharing.core.view.l;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.ImFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bcj0;
import xsna.gbj0;
import xsna.ho1;
import xsna.ibj0;
import xsna.l4o0;
import xsna.nk6;
import xsna.pq9;
import xsna.qfq;

/* compiled from: BasePresenter.java */
/* loaded from: classes5.dex */
public abstract class a implements l.a, l4o0.b {
    public static boolean j = false;
    public static boolean k = false;

    @NonNull
    public final pq9 b;

    @Nullable
    public gbj0 c;
    public final io.reactivex.rxjava3.disposables.b d;
    public boolean e;

    @NonNull
    public final InterfaceC1778a f;

    @NonNull
    public final Targets g;

    @NonNull
    public final l4o0 h;

    @NonNull
    public final l i;

    /* compiled from: BasePresenter.java */
    /* renamed from: com.vk.sharing.core.a$a, reason: collision with other inner class name */
    public interface InterfaceC1778a {
        void A3();

        void B3(Target target, pq9 pq9Var);

        boolean C3();

        boolean D3();

        boolean E3();

        void Z2(@Nullable String str);

        void a3();

        void b3(@NonNull String str, @NonNull List<Target> list, boolean z);

        void c3(@NonNull String str, @NonNull List<Target> list);

        @NonNull
        ActionsInfo d3();

        void destroy();

        boolean e3();

        void f3(@NonNull a aVar);

        void g3();

        @NonNull
        String getString(int i, @Nullable Object... objArr);

        @NonNull
        Targets getTargets();

        @NonNull
        l getView();

        boolean h(Target target);

        @Nullable
        AttachmentInfo i3();

        @Nullable
        default Integer j3() {
            return null;
        }

        int l3();

        void m3();

        void n3();

        @NonNull
        l4o0 o3();

        void q3();

        void r3();

        void u3();

        void v3(@NonNull String str, @NonNull WallRepostSettings wallRepostSettings);

        @Nullable
        default MobileOfficialAppsSharingStat$TypeEventSource w3() {
            return null;
        }

        void x3(@NonNull Target target);

        boolean y3();

        void z3(@NonNull bcj0 bcj0Var);
    }

    public a(@NonNull InterfaceC1778a interfaceC1778a, @Nullable Boolean bool) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.d = bVar;
        this.e = false;
        this.f = interfaceC1778a;
        this.g = interfaceC1778a.getTargets();
        this.h = interfaceC1778a.o3();
        l view = interfaceC1778a.getView();
        this.i = view;
        pq9 pq9Var = ((BaseSharingActivity) interfaceC1778a).x;
        this.b = pq9Var;
        if (bool != null) {
            j = bool.booleanValue();
        } else {
            j = com.vk.toggle.b.A.a(CoreFeatures.SHARING_REDESIGN);
        }
        k = com.vk.toggle.b.A.a(ImFeatures.GRID_SHARING_ENABLED);
        if (!(this instanceof b) && interfaceC1778a.e3()) {
            view.i0();
            view.x4();
            view.uk();
        }
        bVar.b(pq9Var.d.subscribe(new ho1(this, 4)));
    }

    @Override // com.vk.sharing.core.view.l.a
    public boolean I2() {
        return this instanceof b;
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void M2() {
        this.i.hide();
    }

    @Override // xsna.l4o0.b
    public void P(@NonNull ArrayList<Target> arrayList) {
        a(arrayList);
        Targets targets = this.g;
        targets.e = arrayList;
        if (arrayList != null) {
            Iterator<Target> it = arrayList.iterator();
            while (it.hasNext()) {
                Target next = it.next();
                if (targets.b.contains(next)) {
                    next.g = true;
                }
            }
        }
    }

    @Override // xsna.l4o0.b
    public void Z(@NonNull ArrayList<Target> arrayList) {
        a(arrayList);
        this.g.a(arrayList);
    }

    public final void a(@NonNull ArrayList<Target> arrayList) {
        NewsfeedCoowners newsfeedCoowners;
        AttachmentInfo i3 = this.f.i3();
        if (i3 == null || i3.b != 31) {
            return;
        }
        Iterator<Target> it = arrayList.iterator();
        while (it.hasNext()) {
            Target next = it.next();
            Post post = (Post) i3.f.getParcelable("post");
            long j2 = i3.c;
            if (j2 >= 0 || j2 != next.c.b) {
                UserId userId = next.c;
                if (post != null && (newsfeedCoowners = post.f0) != null && newsfeedCoowners.f.stream().anyMatch(new nk6(userId, 0))) {
                }
            }
            it.remove();
            return;
        }
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void c() {
        this.d.e();
        this.f.destroy();
    }

    @Override // xsna.l4o0.b
    public final void c0() {
        if (this.g.i()) {
            return;
        }
        this.i.g0();
    }

    @Nullable
    public final gbj0 d() {
        InterfaceC1778a interfaceC1778a = this.f;
        if (interfaceC1778a.i3() != null && this.c == null) {
            this.c = new ibj0(false, interfaceC1778a.C3(), interfaceC1778a.i3(), interfaceC1778a.l3(), interfaceC1778a.j3(), interfaceC1778a.w3());
        }
        return this.c;
    }

    @Override // com.vk.sharing.core.view.l.a
    @Nullable
    public final boolean h(Target target) {
        return this.f.h(target);
    }

    @Override // com.vk.sharing.core.view.l.a
    public abstract void h2();

    @Override // com.vk.sharing.core.view.l.a
    public void i2() {
        if (d() != null) {
            d().reset();
        }
        this.i.hide();
    }

    @Override // xsna.l4o0.b
    public final void o0() {
        if (this.g.c != null) {
            return;
        }
        this.i.g0();
    }

    @Override // com.vk.sharing.core.view.l.a
    public void p2(@NonNull String str) {
        this.g.g = str;
    }

    @Override // com.vk.sharing.core.view.l.a
    public boolean q2() {
        return this instanceof c;
    }

    @Override // com.vk.sharing.core.view.l.a
    @Nullable
    public final pq9 t2() {
        return this.b;
    }

    @Override // xsna.l4o0.b
    public void v(@NonNull ArrayList<Target> arrayList, boolean z) {
        Targets targets = this.g;
        if (targets.c == null) {
            targets.c = new ArrayList<>();
        }
        targets.c.addAll(arrayList);
        Targets.e(targets.c);
        targets.f = z;
    }

    @Override // com.vk.sharing.core.view.l.a
    public boolean w2() {
        return !(this instanceof h);
    }

    @Override // com.vk.sharing.core.view.l.a
    public void B2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void D2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void F2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void b() {
    }

    @Override // xsna.l4o0.b
    public final void b1() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void g2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public final void o2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void s2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void z2() {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void E2(boolean z) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void H2(int i) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void O2(boolean z) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void k2(@NonNull qfq qfqVar) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void m2(boolean z) {
    }

    @Override // xsna.l4o0.b
    public void n1(@NonNull ArrayList<Target> arrayList) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void x2(boolean z) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void K2(@NonNull Target target, int i) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void e(@NonNull Target target, int i) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void l2(@NonNull Target target, int i, boolean z) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void u2(@NonNull Target target, int i, @Nullable String str) {
    }

    @Override // com.vk.sharing.core.view.l.a
    public void y2(@NonNull Target target, int i, @Nullable String str) {
    }
}
