package com.vk.ecomm.catalog.impl.catalog.simple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import java.util.ArrayList;
import java.util.List;
import xsna.b1a;
import xsna.bqs;
import xsna.bwt0;
import xsna.c98;
import xsna.dw20;
import xsna.e3m;
import xsna.e520;
import xsna.fpf0;
import xsna.fy00;
import xsna.jh;
import xsna.k6k;
import xsna.k7m;
import xsna.m7m;
import xsna.q9h;
import xsna.rbe;
import xsna.rkz;
import xsna.rsg0;
import xsna.tfx;
import xsna.tzp0;
import xsna.w8i;
import xsna.wik;
import xsna.wx20;
import xsna.yfb;

/* compiled from: MarketAlbumEditMenu.kt */
/* loaded from: classes18.dex */
public final class a extends wx20 implements w8i {
    public static final C0928a m = new C0928a();
    public final Context c;
    public final UserId d;
    public final int e;
    public final String f;
    public final boolean g;
    public final MarketComponent h;
    public final q9h i;
    public final fy00 j;
    public final io.reactivex.rxjava3.disposables.b k;
    public dw20 l;

    /* compiled from: MarketAlbumEditMenu.kt */
    /* renamed from: com.vk.ecomm.catalog.impl.catalog.simple.a$a, reason: collision with other inner class name */
    public static final class C0928a {
    }

    public a(Context context, UserId userId, int i, String str, boolean z) {
        this.c = context;
        this.d = userId;
        this.e = i;
        this.f = str;
        this.g = z;
        MarketComponent marketComponent = (MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class));
        this.h = marketComponent;
        this.i = marketComponent.C3();
        this.j = marketComponent.U1();
        this.k = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.wx20
    public final List<e520> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e520(1, R.drawable.vk_icon_pen_outline_24, R.string.community_market_album_edit_album, 1, false, 0, 0, false, null, 0, null, false, 8176));
        arrayList.add(new e520(2, R.drawable.vk_icon_delete_outline_28, R.string.community_market_album_delete_album, 2, true, R.color.vk_red, 0, false, null, 0, null, false, 8128));
        return arrayList;
    }

    @Override // xsna.wx20
    public final void f(Context context, e520 e520Var) {
        int i = e520Var.a;
        if (i == 1) {
            UserId userId = this.d;
            this.i.a(this.e, context, userId);
        } else {
            if (i != 2) {
                return;
            }
            Context context2 = this.c;
            View inflate = e3m.b(context2).inflate(R.layout.community_market_album_delete_dialog, (ViewGroup) null);
            this.l = new dw20.b(context2, new tzp0.c(null, false)).m(R.attr.vk_ui_background_content).D0(inflate, false).a0(new k6k(this, 28)).I0(null);
            ((TextView) inflate.findViewById(R.id.title_text_view)).setText(context2.getString(R.string.community_market_album_delete_dialog, this.f));
            inflate.findViewById(R.id.delete_text_view).setOnClickListener(new c98(this, 5));
            TextView textView = (TextView) inflate.findViewById(R.id.delete_with_goods_text_view);
            bwt0.p0(textView, this.g);
            textView.setOnClickListener(new rbe(this, 2));
        }
    }

    public final void h(int i, UserId userId, boolean z) {
        tfx tfxVar = new tfx("market.deleteAlbum", new jh(16), new k(21));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "album_id", i, 0, 0, 8);
        tfxVar.j("delete_items", z);
        this.k.b(rsg0.w0(yfb.x(tfxVar)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new rkz(new b1a(this, i, userId), 1), new bqs(new wik(this, 19), 5)));
    }
}
