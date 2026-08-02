package com.vk.im.reactions.impl.set_reaction.list;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgReaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.aux0;
import xsna.bpn0;
import xsna.c5g;
import xsna.dp0;
import xsna.epx;
import xsna.f1f0;
import xsna.fbw;
import xsna.g1f0;
import xsna.gzs;
import xsna.hbw;
import xsna.izs;
import xsna.j5g;
import xsna.paw;
import xsna.s3q0;
import xsna.sf3;
import xsna.tju;
import xsna.up;
import xsna.vv20;
import xsna.wzs;
import xsna.x750;
import xsna.yaw;
import xsna.zaw;
import xsna.zrp;

/* compiled from: ReactionListController.kt */
/* loaded from: classes2.dex */
public final class ReactionListController {
    public final RecyclerView a;
    public final fbw b;
    public final zaw c;
    public final paw d;
    public final Msg e;
    public final b f;
    public final a g;
    public final String h;
    public final dp0 i;
    public final List<yaw> j;
    public final f1f0 k;
    public int l;
    public final bpn0 m = new bpn0(new x750(this, 14));
    public final bpn0 n = new bpn0(new tju(this, 23));
    public final bpn0 o = new bpn0(new vv20(this, 19));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ReactionListController.kt */
    public static final class StaticSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StaticSize[] $VALUES;
        public static final StaticSize AlwaysCollapsed;
        public static final StaticSize AlwaysExpanded;

        static {
            StaticSize staticSize = new StaticSize("AlwaysCollapsed", 0);
            AlwaysCollapsed = staticSize;
            StaticSize staticSize2 = new StaticSize("AlwaysExpanded", 1);
            AlwaysExpanded = staticSize2;
            StaticSize[] staticSizeArr = {staticSize, staticSize2};
            $VALUES = staticSizeArr;
            $ENTRIES = new asp(staticSizeArr);
        }

        public StaticSize() {
            throw null;
        }

        public static StaticSize valueOf(String str) {
            return (StaticSize) Enum.valueOf(StaticSize.class, str);
        }

        public static StaticSize[] values() {
            return (StaticSize[]) $VALUES.clone();
        }
    }

    /* compiled from: ReactionListController.kt */
    public static final class a {
        public final wzs<Integer, Integer, s3q0> a;
        public final gzs<s3q0> b;
        public final izs<Integer, s3q0> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super Integer, ? super Integer, s3q0> wzsVar, gzs<s3q0> gzsVar, izs<? super Integer, s3q0> izsVar) {
            this.a = wzsVar;
            this.b = gzsVar;
            this.c = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sf3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LambdaArgs(onActionListener=");
            sb.append(this.a);
            sb.append(", onMoreClicked=");
            sb.append(this.b);
            sb.append(", onPickerHeightChanged=");
            return up.c(sb, this.c, ')');
        }
    }

    /* compiled from: ReactionListController.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final Integer d;
        public final Integer e;
        public final Integer f;
        public final StaticSize g;

        public b(boolean z, boolean z2, boolean z3, Integer num, Integer num2, Integer num3, StaticSize staticSize) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = num;
            this.e = num2;
            this.f = num3;
            this.g = staticSize;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactionListController(RecyclerView recyclerView, hbw hbwVar, zaw zawVar, paw pawVar, Msg msg, b bVar, a aVar, String str, dp0 dp0Var) {
        List<yaw> f;
        this.a = recyclerView;
        this.b = hbwVar;
        this.c = zawVar;
        this.d = pawVar;
        this.e = msg;
        this.f = bVar;
        this.g = aVar;
        this.h = str;
        this.i = dp0Var;
        aux0 aux0Var = msg instanceof aux0 ? (aux0) msg : null;
        if (msg instanceof MsgFromUser) {
            f = zawVar.i();
        } else {
            if (!(msg instanceof MsgFromChannel)) {
                throw new IllegalArgumentException("Msg with type " + msg.getClass() + " is not supported");
            }
            f = zawVar.f();
            if (!bVar.b) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : f) {
                    if (((yaw) obj).a > 0) {
                        arrayList.add(obj);
                    }
                }
                f = arrayList;
            }
        }
        List<MsgReaction> K = aux0Var != null ? aux0Var.K() : null;
        if (K != null && K.size() >= 16 && (aux0Var instanceof MsgFromUser)) {
            List<MsgReaction> list = K;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((MsgReaction) it.next()).getId()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : f) {
                if (arrayList2.contains(Integer.valueOf(((yaw) obj2).a))) {
                    arrayList3.add(obj2);
                }
            }
            f = arrayList3.size() <= 16 ? arrayList3 : j5g.H0(arrayList3, 16);
        }
        this.j = f;
        f1f0 f1f0Var = new f1f0(this.a, this.c, f, this.f.c, d(), f(), new com.vk.im.reactions.impl.set_reaction.list.a(1, this, ReactionListController.class, "onItemClickListener", "onItemClickListener(Lcom/vk/im/reactions/api/ImReactionAsset;)V", 0));
        this.k = f1f0Var;
        this.l = f.size();
        f1f0Var.Ve(aux0Var != null ? aux0Var.R5() : null);
        this.a.setAdapter(f1f0Var);
        if (f()) {
            this.a.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        RecyclerView recyclerView2 = this.a;
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager() { // from class: com.vk.im.reactions.impl.set_reaction.list.ReactionListController.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public final boolean canScrollVertically() {
                return !ReactionListController.this.f() && super.canScrollVertically();
            }
        });
        b(true);
    }

    public final int a() {
        int c;
        int e;
        List<yaw> list = this.j;
        if (list.size() <= this.l * 2) {
            c = c() + (d() * 2);
            e = e();
        } else {
            if (list.size() > this.l * 3) {
                return (e() * 2) + (d() / 2) + (c() * 2) + (d() * 3);
            }
            c = (c() * 2) + (d() * 3);
            e = e();
        }
        return (e * 2) + c;
    }

    public final void b(boolean z) {
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new g1f0(this, z));
    }

    public final int c() {
        return ((Number) this.n.getValue()).intValue();
    }

    public final int d() {
        return ((Number) this.m.getValue()).intValue();
    }

    public final int e() {
        return ((Number) this.o.getValue()).intValue();
    }

    public final boolean f() {
        return this.f.g == StaticSize.AlwaysCollapsed;
    }
}
