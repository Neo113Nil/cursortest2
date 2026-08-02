package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;
import java.util.List;
import xsna.alb0;
import xsna.ame;
import xsna.ao50;
import xsna.ax;
import xsna.cja0;
import xsna.epx;
import xsna.g74;
import xsna.gzs;
import xsna.hja0;
import xsna.ija0;
import xsna.izs;
import xsna.jk50;
import xsna.k3k0;
import xsna.ksy;
import xsna.lqy;
import xsna.na7;
import xsna.q630;
import xsna.rlu;
import xsna.s3q0;
import xsna.txj0;
import xsna.ulu;
import xsna.vq;
import xsna.w2k;
import xsna.xow;
import xsna.xqi;
import xsna.zak0;
import xsna.zzs;

/* compiled from: GroupPickerBottomSheetContent.kt */
/* loaded from: classes17.dex */
public final class a extends ame<ija0, cja0> {
    public final xqi<ija0.a<hja0>> f;

    /* compiled from: GroupPickerBottomSheetContent.kt */
    /* renamed from: com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.a$a, reason: collision with other inner class name */
    public static final class C0713a implements gzs<s3q0> {
        public final /* synthetic */ izs<Integer, s3q0> b;
        public final /* synthetic */ int c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0713a(izs<? super Integer, s3q0> izsVar, int i) {
            this.b = izsVar;
            this.c = i;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(Integer.valueOf(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: GroupPickerBottomSheetContent.kt */
    public static final class b implements gzs<s3q0> {
        public final /* synthetic */ izs<Integer, s3q0> b;
        public final /* synthetic */ int c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super Integer, s3q0> izsVar, int i) {
            this.b = izsVar;
            this.c = i;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(Integer.valueOf(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public c(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;

        public d(List list, izs izsVar) {
            this.b = list;
            this.c = izsVar;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            boolean z = true;
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                PickerItem pickerItem = (PickerItem) this.b.get(intValue);
                aVar2.K(1986916767);
                boolean f = epx.f(pickerItem, PickerItem.Add.b);
                Object obj = a.C0011a.a;
                izs izsVar = this.c;
                if (f) {
                    aVar2.K(1986954958);
                    boolean J = aVar2.J(izsVar);
                    if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = J | z;
                    Object x = aVar2.x();
                    if (z2 || x == obj) {
                        x = new C0713a(izsVar, intValue);
                        aVar2.R(x);
                    }
                    rlu.a((gzs) x, aVar2, 0);
                    aVar2.j();
                } else {
                    if (!(pickerItem instanceof PickerItem.User)) {
                        throw alb0.c(-1182831900, aVar2);
                    }
                    aVar2.K(1987165107);
                    PickerItem.User user = (PickerItem.User) pickerItem;
                    String str = user.b;
                    String str2 = user.c;
                    boolean z3 = user.d;
                    boolean J2 = aVar2.J(izsVar);
                    if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                        z = false;
                    }
                    boolean z4 = J2 | z;
                    Object x2 = aVar2.x();
                    if (z4 || x2 == obj) {
                        x2 = new b(izsVar, intValue);
                        aVar2.R(x2);
                    }
                    ulu.a(str, str2, z3, (gzs) x2, aVar2, 0);
                    aVar2.j();
                }
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public a(xqi xqiVar, boolean z, Context context, com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.b bVar) {
        super(context, bVar, z);
        this.f = xqiVar;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((ija0) ao50Var, izsVar, aVar, 512);
    }

    public final void g(xow<? extends PickerItem> xowVar, izs<? super Integer, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-799182348);
        int i2 = i | (M.J(xowVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-799182348, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.GroupPickerBottomSheetContent.ItemsView (GroupPickerBottomSheetContent.kt:65)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new na7(17, xowVar, izsVar);
                M.R(x);
            }
            lqy.b(f, null, null, lVar, null, null, false, null, (izs) x, M, 24582, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new w2k(this, xowVar, izsVar, i, 1);
        }
    }

    public final void h(ija0 ija0Var, izs<? super cja0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1841229464);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1841229464, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.GroupPickerBottomSheetContent.ThemedContent (GroupPickerBottomSheetContent.kt:44)");
            }
            ija0.a aVar2 = (ija0.a) ((zak0) this.f.e).getValue();
            if (epx.f(aVar2, ija0.a.C3056a.a)) {
                M.K(-1039365801);
                M.j();
                izsVar.invoke(cja0.b.b);
            } else {
                if (!(aVar2 instanceof ija0.a.b)) {
                    throw alb0.c(105017319, M);
                }
                M.K(-1039242359);
                xow<? extends PickerItem> xowVar = (xow) jk50.d(((ija0.a.b) aVar2).a, k3k0.c, M, 48).getValue();
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new g74(izsVar, 3);
                    M.R(x);
                }
                g(xowVar, (izs) x, M, (i2 & 896) | 512);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ax(i, 4, this, ija0Var, izsVar);
        }
    }
}
