package com.vk.catalog2.common.ui.holders.group;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.az;
import xsna.bg1;
import xsna.cz;
import xsna.d0;
import xsna.e4h;
import xsna.fkj;
import xsna.fkq0;
import xsna.gn0;
import xsna.i0q0;
import xsna.izs;
import xsna.kmu;
import xsna.lmu;
import xsna.m1k;
import xsna.mmu;
import xsna.o0r0;
import xsna.xwk;

/* compiled from: GroupSubscriptionDelegate.kt */
/* loaded from: classes16.dex */
public final class a {
    public final FunctionReferenceImpl a;
    public final BaseGroupVh b;
    public final b c = new b();
    public Group d;
    public UIBlockGroup e;
    public GroupSubscriptionState f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(izs<? super Group, Boolean> izsVar, InterfaceC0484a interfaceC0484a) {
        this.a = (FunctionReferenceImpl) izsVar;
        this.b = (BaseGroupVh) interfaceC0484a;
    }

    public static void c(a aVar, boolean z) {
        aVar.getClass();
        d(aVar, z, null, null, 6);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public static void d(a aVar, boolean z, AdminLeaveAction adminLeaveAction, FullSourceJoinApi fullSourceJoinApi, int i) {
        c subscribe;
        boolean z2 = (i & 2) == 0;
        AdminLeaveAction adminLeaveAction2 = (i & 4) != 0 ? null : adminLeaveAction;
        FullSourceJoinApi fullSourceJoinApi2 = (i & 8) != 0 ? null : fullSourceJoinApi;
        Group group = aVar.d;
        if (group == null) {
            return;
        }
        int i2 = group.C;
        boolean z3 = group.j;
        boolean booleanValue = ((Boolean) aVar.a.invoke(group)).booleanValue();
        if (z2) {
            o0r0 e = xwk.e();
            UserId e2 = fkq0.e(group.c);
            UIBlockGroup uIBlockGroup = aVar.e;
            subscribe = o0r0.e(e, e2, uIBlockGroup != null ? uIBlockGroup.r() : null, null, adminLeaveAction2, 4).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new gn0(new lmu(booleanValue, group, aVar, 0), 25), new bg1(new mmu(group, i2, z3, aVar), 28));
        } else {
            o0r0 e3 = xwk.e();
            UserId e4 = fkq0.e(group.c);
            UIBlockGroup uIBlockGroup2 = aVar.e;
            subscribe = o0r0.g(e3, e4, booleanValue, uIBlockGroup2 != null ? uIBlockGroup2.r() : null, z, fullSourceJoinApi2, 32).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new az(new fkj(booleanValue, group, aVar), 27), new cz(new kmu(group, i2, z3, aVar), 25));
        }
        aVar.c.b(subscribe);
    }

    public final void a(UIBlockGroup uIBlockGroup, Group group) {
        GroupSubscriptionState groupSubscriptionState;
        CatalogProfileLocalState catalogProfileLocalState;
        this.e = uIBlockGroup;
        this.d = group;
        boolean z = group.j || group.C == 4;
        if (z) {
            if (((uIBlockGroup == null || (catalogProfileLocalState = uIBlockGroup.A) == null) ? null : catalogProfileLocalState.b) == CatalogProfileLocalState.FollowSource.Internal) {
                groupSubscriptionState = GroupSubscriptionState.RecentlySubscribed;
                this.f = groupSubscriptionState;
                f();
            }
        }
        groupSubscriptionState = z ? GroupSubscriptionState.Subscribed : GroupSubscriptionState.NotSubscribed;
        this.f = groupSubscriptionState;
        f();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.group.a$a] */
    public final void b() {
        Group group;
        GroupSubscriptionState groupSubscriptionState = this.f;
        if (groupSubscriptionState == null || (group = this.d) == null) {
            return;
        }
        this.b.a(groupSubscriptionState, group);
    }

    public final void e(Context context) {
        Group group = this.d;
        if (group == null) {
            return;
        }
        e4h.l(xwk.e().h0(), context, fkq0.e(group.c), new m1k(this, 15), group, 16);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.group.a$a] */
    public final void f() {
        Group group;
        GroupSubscriptionState groupSubscriptionState = this.f;
        if (groupSubscriptionState == null || (group = this.d) == null) {
            return;
        }
        this.b.b(groupSubscriptionState, group);
    }

    /* compiled from: GroupSubscriptionDelegate.kt */
    /* renamed from: com.vk.catalog2.common.ui.holders.group.a$a, reason: collision with other inner class name */
    public interface InterfaceC0484a {
        void a(GroupSubscriptionState groupSubscriptionState, Group group);

        void b(GroupSubscriptionState groupSubscriptionState, Group group);

        default void e(Throwable th) {
            i0q0.d(500L, new d0(th, 6));
        }

        default void c() {
        }

        default void d() {
        }
    }
}
