package com.vk.managed_groups.impl.list;

import com.vk.managed_groups.impl.list.a;
import com.vk.managed_groups.impl.list.b;
import com.vk.managed_groups.impl.list.e;
import com.vk.managed_groups.impl.list.h;
import com.vk.managed_groups.impl.list.popup.ManagedGroupAction;
import com.vk.network.kbh.state.NetworkState;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.cvk;
import xsna.d6q0;
import xsna.e43;
import xsna.f4z;
import xsna.qi00;
import xsna.qpj;
import xsna.s3q0;
import xsna.si00;
import xsna.ti00;
import xsna.uh00;
import xsna.wk50;
import xsna.xh00;

/* compiled from: ManagedGroupsListFeature.kt */
/* loaded from: classes3.dex */
public final class c extends wk50<g, si00, com.vk.managed_groups.impl.list.a, e> {
    public final ti00 f;
    public final uh00 g;
    public final f4z h;
    public final f4z i;

    /* compiled from: ManagedGroupsListFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManagedGroupAction.values().length];
            try {
                iArr[ManagedGroupAction.NOTIFICATIONS_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagedGroupAction.NOTIFICATIONS_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(ti00 ti00Var, uh00 uh00Var) {
        super(a.d.b, new f(new si00(EmptyList.b)));
        this.f = ti00Var;
        this.g = uh00Var;
        this.h = new f4z();
        this.i = new f4z();
    }

    @Override // xsna.wk50
    public final void N(si00 si00Var, com.vk.managed_groups.impl.list.a aVar) {
        si00 si00Var2 = si00Var;
        com.vk.managed_groups.impl.list.a aVar2 = aVar;
        if (aVar2.equals(a.d.b)) {
            T(e.b.b);
            return;
        }
        if (aVar2 instanceof a.c) {
            T(new e.a(((a.c) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.b) {
            if (d6q0.t == NetworkState.UNSTABLE) {
                cvk.t();
                return;
            } else {
                this.h.b(new b.a(((a.b) aVar2).b));
                s3q0 s3q0Var = s3q0.a;
                return;
            }
        }
        Object obj = null;
        if (!(aVar2 instanceof a.e)) {
            if (!(aVar2 instanceof a.C1260a)) {
                throw new NoWhenBranchMatchedException();
            }
            ManagedGroupAction managedGroupAction = ((a.C1260a) aVar2).b;
            io.reactivex.rxjava3.disposables.b bVar = this.e;
            uh00 uh00Var = this.g;
            int i = a.$EnumSwitchMapping$0[managedGroupAction.ordinal()];
            if (i == 1) {
                bVar.b(io.reactivex.rxjava3.kotlin.c.g(uh00Var.a(true), new qpj(this, 25), null, 2));
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.b(io.reactivex.rxjava3.kotlin.c.g(uh00Var.a(false), new qi00(this, 0), null, 2));
                return;
            }
        }
        Iterator<T> it = si00Var2.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((xh00) next).b.equals(null)) {
                obj = next;
                break;
            }
        }
        xh00 xh00Var = (xh00) obj;
        if (xh00Var == null) {
            return;
        }
        ListBuilder e = e43.e();
        e.add(xh00Var.h ? ManagedGroupAction.NOTIFICATIONS_ON : ManagedGroupAction.NOTIFICATIONS_OFF);
        this.i.b(new h.b(e.g()));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.f.onDestroy();
    }
}
