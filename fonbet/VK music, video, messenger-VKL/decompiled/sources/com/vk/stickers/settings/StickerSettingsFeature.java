package com.vk.stickers.settings;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.movika.sdk.base.ui.z;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.settings.StickerSettingsRouter;
import com.vk.stickers.settings.b;
import com.vk.stickers.settings.c;
import com.vk.stickers.settings.popup.PopupSettingsFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import xsna.anj;
import xsna.b6m;
import xsna.bbw0;
import xsna.brj0;
import xsna.d5l0;
import xsna.d6w0;
import xsna.djl0;
import xsna.dq1;
import xsna.dw20;
import xsna.e3m;
import xsna.f5y;
import xsna.g2v;
import xsna.hg1;
import xsna.i0q0;
import xsna.j6l0;
import xsna.kcl0;
import xsna.ljs;
import xsna.mh4;
import xsna.na7;
import xsna.nex;
import xsna.nt10;
import xsna.nyh0;
import xsna.p6l0;
import xsna.qao;
import xsna.rs0;
import xsna.rsg0;
import xsna.tfx;
import xsna.wd10;
import xsna.wk50;
import xsna.wmz;
import xsna.yfb;
import xsna.zal0;
import xsna.zq70;

/* compiled from: StickerSettingsFeature.kt */
/* loaded from: classes6.dex */
public final class StickerSettingsFeature extends wk50<j, f, b, c> {
    public final Context f;
    public final com.vk.stickers.settings.a g;
    public final StickerSettingsRouter h;
    public final StickerSettingsFeature$reloadStickersReceiver$1 i;

    /* compiled from: StickerSettingsFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerSettingsRouter.VmojiMenuButton.values().length];
            try {
                iArr[StickerSettingsRouter.VmojiMenuButton.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerSettingsRouter.VmojiMenuButton.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerSettingsRouter.VmojiMenuButton.HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.stickers.settings.StickerSettingsFeature$reloadStickersReceiver$1] */
    public StickerSettingsFeature(Context context, e eVar, com.vk.stickers.settings.a aVar, StickerSettingsRouter stickerSettingsRouter) {
        super(b.f.b, eVar);
        this.f = context;
        this.g = aVar;
        this.h = stickerSettingsRouter;
        this.i = new BroadcastReceiver() { // from class: com.vk.stickers.settings.StickerSettingsFeature$reloadStickersReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                StickerSettingsFeature.this.C(b.j.b);
            }
        };
    }

    @Override // xsna.wk50
    public final void N(f fVar, b bVar) {
        dw20 dw20Var;
        q qVar;
        StickerStockItem Q0;
        StickerStockItem Q02;
        b bVar2 = bVar;
        boolean equals = bVar2.equals(b.f.b);
        com.vk.stickers.settings.a aVar = this.g;
        if (equals) {
            anj.d(this.f, this.i, new IntentFilter("com.vkontakte.android.STICKERS_RELOADED"), null, 4);
            aVar.c.A();
            T(c.b.b);
            return;
        }
        if (bVar2.equals(b.C1802b.b)) {
            aVar.c.A();
            return;
        }
        if (bVar2.equals(b.j.b)) {
            T(new c.C1803c(U()));
            return;
        }
        boolean z = bVar2 instanceof b.g;
        StickerSettingsRouter stickerSettingsRouter = this.h;
        if (z) {
            StickerStockItem stickerStockItem = ((b.g) bVar2).b;
            stickerSettingsRouter.getClass();
            zal0.m(g2v.d().a(), stickerSettingsRouter.a, stickerStockItem, GiftData.d, null, 32);
            return;
        }
        if (bVar2 instanceof b.m) {
            StickerStockItem stickerStockItem2 = ((b.m) bVar2).b;
            StickerStockItem Q03 = aVar.c.Q0(stickerStockItem2);
            if (!stickerStockItem2.k && Q03 == null) {
                V(stickerStockItem2, true);
                return;
            } else {
                if (Q03 != null) {
                    rs0 rs0Var = new rs0(23, this, Q03);
                    stickerSettingsRouter.getClass();
                    i0q0.f(new z(14, stickerSettingsRouter, rs0Var));
                    return;
                }
                return;
            }
        }
        if (bVar2 instanceof b.e) {
            boolean z2 = ((b.e) bVar2).b;
            aVar.c.m0(z2);
            T(new c.f(z2));
            return;
        }
        if (bVar2 instanceof b.d) {
            boolean z3 = ((b.d) bVar2).b;
            aVar.c.e0(z3);
            T(new c.a(z3));
            return;
        }
        if (bVar2 instanceof b.l) {
            b.l lVar = (b.l) bVar2;
            int i = lVar.b;
            int i2 = lVar.c;
            kcl0 kcl0Var = aVar.c;
            ArrayList arrayList = new ArrayList(kcl0Var.F());
            if (i2 < 0 || i2 >= arrayList.size()) {
                qVar = g0.b;
            } else {
                arrayList.add(i2, (StickerStockItem) arrayList.remove(i));
                StickerStockItem Q04 = kcl0Var.Q0((StickerStockItem) arrayList.get(i2));
                if (Q04 == null) {
                    qVar = g0.b;
                } else {
                    int i3 = i2 + 1;
                    Integer valueOf = (i3 >= arrayList.size() || (Q02 = kcl0Var.Q0((StickerStockItem) arrayList.get(i3))) == null) ? null : Integer.valueOf(Q02.b);
                    int i4 = i2 - 1;
                    Integer valueOf2 = (i4 < 0 || i4 >= arrayList.size() || (Q0 = kcl0Var.Q0((StickerStockItem) arrayList.get(i4))) == null) ? null : Integer.valueOf(Q0.b);
                    zq70 zq70Var = aVar.a;
                    int i5 = Q04.b;
                    zq70Var.getClass();
                    tfx tfxVar = new tfx("store.reorderProducts", new wd10(14), new nyh0(3));
                    tfx.o(tfxVar, "type", "stickers", 0, 0, 12);
                    tfx.l(tfxVar, "product_id", i5, 0, 0, 8);
                    if (valueOf2 != null) {
                        tfx.l(tfxVar, "after", valueOf2.intValue(), 0, 0, 8);
                    }
                    if (valueOf != null) {
                        tfx.l(tfxVar, "before", valueOf.intValue(), 0, 0, 8);
                    }
                    m1 y0 = rsg0.y0(yfb.x(tfxVar), null, null, 3);
                    f5y f5yVar = new f5y(new d5l0(aVar, i2, i), 21);
                    a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    qVar = y0.E(f5yVar, lVar2, kVar, kVar);
                }
            }
            qVar.subscribe(new qao(1), new wmz(new nt10(this, 27), 22));
            return;
        }
        if (bVar2.equals(b.c.b)) {
            stickerSettingsRouter.getClass();
            d6w0.a(b6m.e(), stickerSettingsRouter.a, "stickers_settings", null, 12);
            return;
        }
        if (bVar2 instanceof b.i) {
            VmojiAvatar vmojiAvatar = ((b.i) bVar2).b;
            stickerSettingsRouter.getClass();
            b6m.e().c(stickerSettingsRouter.a, vmojiAvatar);
            return;
        }
        if (!(bVar2 instanceof b.n)) {
            if (bVar2 instanceof b.h) {
                stickerSettingsRouter.getClass();
                new PopupSettingsFragment.a(PopupSettingsFragment.class, null, null).k(stickerSettingsRouter.a);
                return;
            } else {
                if (bVar2 instanceof b.k) {
                    aVar.c.Q();
                    return;
                }
                return;
            }
        }
        boolean z4 = ((b.n) bVar2).b;
        mh4 mh4Var = new mh4(27, bVar2, this);
        Context context = stickerSettingsRouter.a;
        ArrayList arrayList2 = new ArrayList();
        if (!z4) {
            arrayList2.add(new brj0(1, 0, null, R.string.sticker_settings_vmoji_show, null, false, false, null, 0, null, null, null, null, null, 131062));
        }
        arrayList2.add(new brj0(0, 0, null, R.string.sticker_settings_vmoji_edit, null, false, false, null, 0, null, null, null, null, null, 131062));
        if (z4) {
            arrayList2.add(new brj0(2, 0, null, R.string.sticker_settings_vmoji_hide, null, false, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126966));
        }
        stickerSettingsRouter.b = new dw20.b(context, null).P(arrayList2, new na7(26, stickerSettingsRouter, mh4Var)).a();
        Activity h = e3m.h(context);
        AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
        if (appCompatActivity == null || (dw20Var = stickerSettingsRouter.b) == null) {
            return;
        }
        dw20Var.Td(appCompatActivity.getSupportFragmentManager(), "StickerSettingsBottomSheet");
    }

    public final p6l0 U() {
        com.vk.stickers.settings.a aVar = this.g;
        ArrayList F = aVar.c.F();
        kcl0 kcl0Var = aVar.c;
        return new p6l0(F, kcl0Var.R(), new bbw0(kcl0Var.p()), kcl0Var.A0(), kcl0Var.v0(), kcl0Var.K0());
    }

    public final void V(StickerStockItem stickerStockItem, boolean z) {
        com.vk.stickers.settings.a aVar = this.g;
        aVar.getClass();
        m1 y0 = rsg0.y0(new djl0(stickerStockItem.b, z), null, null, 3);
        nex nexVar = new nex(new dq1(aVar, stickerStockItem, z, 4), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.e.b(hg1.m(y0.E(nexVar, lVar, kVar, kVar), this.f, 0L, false, 62).subscribe(new ljs(new j6l0(this, 0), 26)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.g.c.h();
        this.f.unregisterReceiver(this.i);
    }
}
