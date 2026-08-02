package com.vk.ecomm.market.good.ui;

import android.content.Context;
import android.text.TextUtils;
import com.vk.dto.common.Good;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.dto.OwnerResponseTime;
import com.vk.ecomm.market.good.ui.ProductActionButton;
import com.vk.ecomm.market.good.ui.a;
import com.vk.ecomm.market.good.ui.d;
import com.vk.toggle.b;
import com.vk.toggle.features.SmbFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import xsna.b210;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.f370;
import xsna.hid0;
import xsna.j5g;
import xsna.p1p0;
import xsna.qoy;
import xsna.rbg0;
import xsna.rdi;
import xsna.rl3;
import xsna.s0i0;
import xsna.yjk;
import xsna.zv9;

/* compiled from: ProductActionButtonsItem.kt */
/* loaded from: classes18.dex */
public final class c {
    public final int a;
    public final boolean b;
    public final Integer c;
    public final String d;
    public final ProductActionButton e;
    public final ProductActionButton f;
    public final CallProducerButton g;
    public final CallProducerButton h;
    public final d.a i;
    public final UserId j;
    public final OwnerResponseTime k;
    public final String l;
    public final hid0 m;

    /* compiled from: ProductActionButtonsItem.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:75:0x018a, code lost:
        
            if (r7.intValue() != 1) goto L84;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static c a(Context context, b bVar) {
            Object obj;
            Object obj2;
            JSONObject g;
            yjk s0i0Var;
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_link_24);
            Good good = bVar.a;
            SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUTTONS_REFACH;
            smbFeatures.getClass();
            if (!com.vk.toggle.b.A.a(smbFeatures)) {
                c d = d(bVar);
                return d == null ? b(context, bVar) : d;
            }
            c d2 = d(bVar);
            Integer num = null;
            if (d2 == null) {
                d2 = null;
            } else {
                ProductActionButton productActionButton = d2.e;
                a.b bVar2 = productActionButton != null ? new a.b(productActionButton.a.toString(), null) : null;
                ProductActionButton productActionButton2 = d2.f;
                s0i0 s0i0Var2 = productActionButton2 != null ? new s0i0(productActionButton2.a.toString(), null) : null;
                ListBuilder e = e43.e();
                if (bVar2 != null) {
                    e.add(bVar2);
                }
                if (s0i0Var2 != null) {
                    e.add(s0i0Var2);
                }
                ListBuilder g2 = e.g();
                if (!g2.isEmpty()) {
                    d2 = c.a(d2, new hid0(g2, c(bVar), null, false));
                }
            }
            if (d2 != null) {
                return d2;
            }
            List list = bVar.e;
            if (list == null) {
                list = EmptyList.b;
            }
            if (list.isEmpty()) {
                return b(context, bVar);
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    List H0 = j5g.H0(arrayList, 2);
                    rbg0 c = c(bVar);
                    String str = good.T;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (rl3.y0(new Integer[]{3, 4}).contains(Integer.valueOf(((CallProducerButton) obj).b))) {
                            break;
                        }
                    }
                    CallProducerButton callProducerButton = (CallProducerButton) obj;
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (!epx.f((CallProducerButton) obj2, callProducerButton)) {
                            break;
                        }
                    }
                    CallProducerButton callProducerButton2 = (CallProducerButton) obj2;
                    if (callProducerButton2 != null && callProducerButton != null && callProducerButton2.b == 7) {
                        b.d i2 = com.vk.toggle.b.A.i(SmbFeatures.PRODUCT_BUY_NOW);
                        if (p1p0.a(i2)) {
                            if (i2 != null && (g = i2.g()) != null) {
                                num = f370.x(g, "buttons");
                            }
                            if (num != null) {
                            }
                        }
                    }
                    z = false;
                    return c.a(b(context, bVar), new hid0(H0, c, str, z));
                }
                Object next = it.next();
                int i3 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                CallProducerButton callProducerButton3 = (CallProducerButton) next;
                Set y0 = rl3.y0(new Integer[]{3, 4});
                int i4 = callProducerButton3.b;
                int i5 = callProducerButton3.b;
                boolean contains = y0.contains(Integer.valueOf(i4));
                String str2 = callProducerButton3.c;
                if (contains) {
                    int i6 = good.x;
                    int i7 = good.y;
                    if (i7 != -1 && i7 - i6 <= 0) {
                        z = false;
                    }
                    s0i0Var = new zv9(i6, z);
                } else if (i == 0) {
                    SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                    soccomFeatures.getClass();
                    boolean a = com.vk.toggle.b.A.a(soccomFeatures);
                    if (!b210.a(good, a) || a) {
                        s0i0Var = new a.b(str2, i5 == 1 ? valueOf : null);
                    } else {
                        s0i0Var = a.C0947a.a;
                    }
                } else {
                    s0i0Var = new s0i0(str2, i5 == 1 ? valueOf : null);
                }
                arrayList.add(s0i0Var);
                i = i3;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static c b(Context context, b bVar) {
            String string;
            CallProducerButton callProducerButton;
            CallProducerButton callProducerButton2;
            UserId userId;
            Object obj;
            ProductActionButton.Type type = ProductActionButton.Type.UNDEFINED;
            boolean z = bVar.b;
            List<CallProducerButton> list = bVar.e;
            Good good = bVar.a;
            if (z) {
                if (list != null) {
                    List<CallProducerButton> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (((CallProducerButton) it.next()).b == 6) {
                            }
                        }
                    }
                }
                type = ProductActionButton.Type.NATIVE_CART;
                string = good.x > 0 ? context.getResources().getString(R.string.product_card_go_to_cart) : context.getString(R.string.market_cart_add);
                callProducerButton2 = list != null ? (CallProducerButton) j5g.a0(list) : null;
                callProducerButton = null;
                if (!TextUtils.isEmpty(good.L)) {
                    string = good.L;
                }
                ProductActionButton productActionButton = string == null ? new ProductActionButton(string, type, ProductActionButton.Style.PRIMARY, null) : null;
                if (list != null) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((CallProducerButton) obj).b == 0) {
                            break;
                        }
                    }
                    CallProducerButton callProducerButton3 = (CallProducerButton) obj;
                    if (callProducerButton3 != null) {
                        userId = callProducerButton3.i;
                        int i = good.x;
                        boolean Bb = good.Bb();
                        int i2 = good.y;
                        return new c(i, Bb, i2 != -1 ? Integer.valueOf(i2) : null, good.T, productActionButton, null, callProducerButton, callProducerButton2, bVar.d, userId, bVar.f, bVar.g, null);
                    }
                }
                userId = null;
                int i3 = good.x;
                boolean Bb2 = good.Bb();
                int i22 = good.y;
                return new c(i3, Bb2, i22 != -1 ? Integer.valueOf(i22) : null, good.T, productActionButton, null, callProducerButton, callProducerButton2, bVar.d, userId, bVar.f, bVar.g, null);
            }
            List<CallProducerButton> list3 = list;
            if (list3 == null || list3.isEmpty()) {
                if (TextUtils.isEmpty(good.K)) {
                    type = ProductActionButton.Type.CONTACT;
                    string = context.getString(R.string.write_to_the_good_owner);
                } else {
                    type = ProductActionButton.Type.LINK;
                    string = context.getString(R.string.product_open_external);
                }
                callProducerButton = null;
                callProducerButton2 = null;
            } else {
                CallProducerButton callProducerButton4 = (CallProducerButton) j5g.b0(0, list);
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                boolean a = com.vk.toggle.b.A.a(soccomFeatures);
                if (b210.a(good, a) && !a) {
                    callProducerButton4 = callProducerButton4 != null ? CallProducerButton.a(callProducerButton4, 0, context.getResources().getString(R.string.market_card_ozon_cta_button_title), 2045) : null;
                }
                callProducerButton2 = (CallProducerButton) j5g.b0(1, list);
                string = null;
                callProducerButton = callProducerButton4;
            }
            if (!TextUtils.isEmpty(good.L)) {
            }
            if (string == null) {
            }
            if (list != null) {
            }
            userId = null;
            int i32 = good.x;
            boolean Bb22 = good.Bb();
            int i222 = good.y;
            return new c(i32, Bb22, i222 != -1 ? Integer.valueOf(i222) : null, good.T, productActionButton, null, callProducerButton, callProducerButton2, bVar.d, userId, bVar.f, bVar.g, null);
        }

        public static rbg0 c(b bVar) {
            OwnerResponseTime ownerResponseTime;
            Iterable iterable = bVar.e;
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterable iterable2 = iterable;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    if (((CallProducerButton) it.next()).b == 0) {
                        ownerResponseTime = bVar.f;
                        break;
                    }
                }
            }
            ownerResponseTime = null;
            if (ownerResponseTime != null) {
                return new rbg0(ownerResponseTime.c, ownerResponseTime.d);
            }
            return null;
        }

        public static c d(b bVar) {
            List x;
            Good good = bVar.a;
            List<LinkButton> list = good.W;
            if (list == null || (x = rdi.x(list)) == null) {
                return null;
            }
            ProductActionButton a = ProductActionButton.a.a((LinkButton) j5g.b0(0, x));
            ProductActionButton a2 = ProductActionButton.a.a((LinkButton) j5g.b0(1, x));
            int i = good.x;
            boolean Bb = good.Bb();
            int i2 = good.y;
            return new c(i, Bb, i2 != -1 ? Integer.valueOf(i2) : null, good.T, a, a2, null, null, bVar.d, null, bVar.f, bVar.g, null);
        }
    }

    public c(int i, boolean z, Integer num, String str, ProductActionButton productActionButton, ProductActionButton productActionButton2, CallProducerButton callProducerButton, CallProducerButton callProducerButton2, d.a aVar, UserId userId, OwnerResponseTime ownerResponseTime, String str2, hid0 hid0Var) {
        this.a = i;
        this.b = z;
        this.c = num;
        this.d = str;
        this.e = productActionButton;
        this.f = productActionButton2;
        this.g = callProducerButton;
        this.h = callProducerButton2;
        this.i = aVar;
        this.j = userId;
        this.k = ownerResponseTime;
        this.l = str2;
        this.m = hid0Var;
    }

    public static c a(c cVar, hid0 hid0Var) {
        return new c(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, hid0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i) && epx.f(this.j, cVar.j) && epx.f(this.k, cVar.k) && epx.f(this.l, cVar.l) && epx.f(this.m, cVar.m);
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ProductActionButton productActionButton = this.e;
        int hashCode3 = (hashCode2 + (productActionButton == null ? 0 : productActionButton.hashCode())) * 31;
        ProductActionButton productActionButton2 = this.f;
        int hashCode4 = (hashCode3 + (productActionButton2 == null ? 0 : productActionButton2.hashCode())) * 31;
        CallProducerButton callProducerButton = this.g;
        int hashCode5 = (hashCode4 + (callProducerButton == null ? 0 : callProducerButton.hashCode())) * 31;
        CallProducerButton callProducerButton2 = this.h;
        int hashCode6 = (hashCode5 + (callProducerButton2 == null ? 0 : callProducerButton2.hashCode())) * 31;
        d.a aVar = this.i;
        int hashCode7 = (hashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        UserId userId = this.j;
        int hashCode8 = (hashCode7 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        OwnerResponseTime ownerResponseTime = this.k;
        int hashCode9 = (hashCode8 + (ownerResponseTime == null ? 0 : ownerResponseTime.hashCode())) * 31;
        String str2 = this.l;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        hid0 hid0Var = this.m;
        return hashCode10 + (hid0Var != null ? hid0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ProductActionButtonsItem(cartQuantity=" + this.a + ", goodAvailable=" + this.b + ", stockAmount=" + this.c + ", legalDisclaimer=" + this.d + ", primaryButton=" + this.e + ", secondaryButton=" + this.f + ", primaryCallButton=" + this.g + ", secondaryCallButton=" + this.h + ", callback=" + this.i + ", contactId=" + this.j + ", ownerResponseTime=" + this.k + ", adsLabel=" + this.l + ", productActionButtonsState=" + this.m + ')';
    }
}
