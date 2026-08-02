package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel;

import android.content.Context;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.c5g;
import xsna.e3m;
import xsna.e43;
import xsna.hr30;
import xsna.iah0;
import xsna.nu9;
import xsna.pk30;
import xsna.q0w0;
import xsna.qo0;
import xsna.qo30;
import xsna.rqi;
import xsna.ub80;
import xsna.vb80;

/* compiled from: MsgPartCarouselHolder.kt */
/* loaded from: classes2.dex */
public final class c extends hr30<Attach, qo30> {
    public final q0w0 d;
    public final q0w0 e;
    public Context f;
    public RecyclerView g;
    public w h;
    public a i;
    public nu9 j;
    public final bpn0 k = new bpn0(new qo0(24));
    public int l;

    public c(q0w0 q0w0Var, q0w0 q0w0Var2) {
        this.d = q0w0Var;
        this.e = q0w0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [xsna.qul] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    @Override // xsna.hr30
    public final void p(qo30 qo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ?? r1;
        qo30 qo30Var2 = qo30Var;
        Context context = this.f;
        if (context == null) {
            context = null;
        }
        this.l = qo30Var2.Y(context);
        nu9 nu9Var = this.j;
        (nu9Var == null ? null : nu9Var).e = qo30Var2.c;
        if (nu9Var == null) {
            nu9Var = null;
        }
        Context context2 = this.f;
        if (context2 == null) {
            context2 = null;
        }
        nu9Var.b = qo30Var2.G0(context2);
        nu9 nu9Var2 = this.j;
        if (nu9Var2 == null) {
            nu9Var2 = null;
        }
        Context context3 = this.f;
        if (context3 == null) {
            context3 = null;
        }
        nu9Var2.c = qo30Var2.h(context3);
        List<CarouselItem> list = qo30Var2.d;
        int i = 0;
        if (list != null) {
            List<CarouselItem> list2 = list;
            r1 = new ArrayList(c5g.u(list2, 10));
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                a.C1167a c1167a = new a.C1167a((CarouselItem) obj, qo30Var2.c, i2, qo30Var2.e, qo30Var2.f);
                c1167a.g = qo30Var2.i;
                r1.add(c1167a);
                i2 = i3;
            }
        } else {
            r1 = 0;
        }
        if (r1 == 0) {
            r1 = EmptyList.b;
        }
        a aVar = this.i;
        (aVar == null ? null : aVar).h = pk30Var;
        ?? r13 = aVar;
        if (aVar == null) {
            r13 = 0;
        }
        r13.setItems(r1);
        a aVar2 = this.i;
        if (aVar2 == null) {
            aVar2 = null;
        }
        Context context4 = this.f;
        if (context4 == null) {
            context4 = null;
        }
        aVar2.i = qo30Var2.Y(context4) - iah0.a(20);
        a aVar3 = this.i;
        if (aVar3 == null) {
            aVar3 = null;
        }
        aVar3.notifyDataSetChanged();
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.invalidateItemDecorations();
        if (!r1.isEmpty()) {
            Iterator it = ((Iterable) r1).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int s = s(((a.C1167a) it.next()).b);
            loop1: while (true) {
                i = s;
                while (it.hasNext()) {
                    s = s(((a.C1167a) it.next()).b);
                    if (i < s) {
                        break;
                    }
                }
            }
        }
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        if (recyclerView2.getMinimumHeight() != i) {
            RecyclerView recyclerView3 = this.g;
            (recyclerView3 != null ? recyclerView3 : null).setMinimumHeight(i);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f = layoutInflater.getContext();
        this.h = new w();
        int a = iah0.a(4);
        nu9 nu9Var = new nu9();
        nu9Var.b = 0;
        nu9Var.c = 0;
        nu9Var.d = a;
        this.j = nu9Var;
        this.i = new a(layoutInflater, this.d.d.o());
        Context context = this.f;
        if (context == null) {
            context = null;
        }
        RecyclerView recyclerView = new RecyclerView(context);
        this.g = recyclerView;
        recyclerView.setId(R.id.carousel_rv);
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.g;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setOverScrollMode(2);
        RecyclerView recyclerView4 = this.g;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(0, false);
        carouselLayoutManager.l = true;
        recyclerView4.setLayoutManager(carouselLayoutManager);
        RecyclerView recyclerView5 = this.g;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        nu9 nu9Var2 = this.j;
        if (nu9Var2 == null) {
            nu9Var2 = null;
        }
        recyclerView5.addItemDecoration(nu9Var2);
        RecyclerView recyclerView6 = this.g;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        recyclerView6.setRecycledViewPool(this.e.d.o());
        RecyclerView recyclerView7 = this.g;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        a aVar = this.i;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView7.setAdapter(aVar);
        w wVar = this.h;
        if (wVar == null) {
            wVar = null;
        }
        RecyclerView recyclerView8 = this.g;
        if (recyclerView8 == null) {
            recyclerView8 = null;
        }
        wVar.attachToRecyclerView(recyclerView8);
        RecyclerView recyclerView9 = this.g;
        if (recyclerView9 == null) {
            return null;
        }
        return recyclerView9;
    }

    public final int s(CarouselItem carouselItem) {
        ImageList imageList = carouselItem.f;
        String str = carouselItem.c;
        String str2 = carouselItem.b;
        boolean Jb = imageList.Jb();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (Jb) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + (this.l / 1.625f);
        }
        if (str2.length() > 0 || str.length() > 0) {
            f += iah0.a(8);
        }
        if (str2.length() > 0 && str.length() > 0) {
            f += iah0.a(2);
        }
        if (str2.length() > 0) {
            f += t(this.l, 15, 18, str2);
        }
        if (str.length() > 0) {
            f += t(this.l, 14, 17, str);
        }
        BotKeyboard botKeyboard = carouselItem.g;
        if (botKeyboard != null) {
            List<List<BotButton>> list = botKeyboard.f;
            Context context = this.f;
            if (context == null) {
                context = null;
            }
            int a = e3m.a(R.dimen.vkim_bot_button_min_height, context);
            Context context2 = this.f;
            if (context2 == null) {
                context2 = null;
            }
            int a2 = e3m.a(R.dimen.vkim_bot_button_margin, context2);
            f = f + rqi.a(e3m.a(R.dimen.vkim_bot_keyboard_margin, this.f != null ? r5 : null), 2, list.size() * a, (list.size() + 1) * a2) + iah0.a(4);
        }
        return (int) f;
    }

    public final int t(int i, int i2, int i3, String str) {
        bpn0 bpn0Var = this.k;
        ((TextPaint) bpn0Var.getValue()).setTextSize((int) iah0.y(i2));
        float measureText = ((TextPaint) bpn0Var.getValue()).measureText(str);
        return (int) (Math.min((float) Math.ceil(measureText / i), 4.0f) * ((int) iah0.y(i3)));
    }
}
