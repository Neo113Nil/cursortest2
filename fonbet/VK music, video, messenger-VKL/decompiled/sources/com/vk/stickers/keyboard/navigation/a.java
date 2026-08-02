package com.vk.stickers.keyboard.navigation;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cws;
import xsna.d4r;
import xsna.d9j;
import xsna.epx;
import xsna.g5g;
import xsna.hfz;
import xsna.igy;
import xsna.j5g;
import xsna.jge0;
import xsna.jgy;
import xsna.kcl0;
import xsna.kgy;
import xsna.l6u;
import xsna.mgy;
import xsna.ogy;
import xsna.pf6;
import xsna.pwk;
import xsna.s3q0;
import xsna.t6g0;
import xsna.tr0;
import xsna.wcg;
import xsna.zgy;
import xsna.zxo;

/* compiled from: KeyboardNavigationAdapter.kt */
/* loaded from: classes6.dex */
public final class a extends pf6<jgy> {
    public final RecyclerView i;
    public final jge0 j;
    public final com.vk.stickers.keyboard.c k;
    public boolean m;
    public boolean n;
    public boolean p;
    public final b q;
    public int l = -1;
    public List<StickerStockItem> o = EmptyList.b;

    /* compiled from: KeyboardNavigationAdapter.kt */
    /* renamed from: com.vk.stickers.keyboard.navigation.a$a, reason: collision with other inner class name */
    public interface InterfaceC1801a {
        void a(int i);

        void b(KeyboardNavigationButton keyboardNavigationButton);

        void c();

        void d(long j, UserId userId);
    }

    public a(Context context, RecyclerView recyclerView, jge0 jge0Var, com.vk.stickers.keyboard.c cVar) {
        this.i = recyclerView;
        this.j = jge0Var;
        this.k = cVar;
        this.q = new b(context);
        x0(igy.class, new l6u(this, 6));
        x0(kgy.class, new pwk(this, 25));
        x0(KeyboardNavigationVmojiPackItem.class, new cws(this, 15));
        x0(mgy.class, new wcg(this, 28));
        x0(ogy.class, new zxo(this, 21));
        x0(zgy.class, new d9j(this, 20));
    }

    public static void O0(a aVar, int i) {
        aVar.L0(i, false);
        aVar.P0(i);
    }

    public final void L0(int i, boolean z) {
        Iterator<? extends hfz> it = this.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            hfz next = it.next();
            if (next == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.navigation.KeyboardNavigationItem");
            }
            if (((jgy) next).getId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        Iterator<? extends hfz> it2 = this.h.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i3 = -1;
                break;
            }
            hfz next2 = it2.next();
            if (next2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.navigation.KeyboardNavigationItem");
            }
            if (((jgy) next2).getId() == this.l) {
                break;
            } else {
                i3++;
            }
        }
        if (i2 != i3 || z) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.i.getLayoutManager();
            int v = linearLayoutManager.v();
            int w = linearLayoutManager.w();
            int i4 = (w == -1 || v == -1) ? 4 : w - v;
            int max = i2 >= i4 + (-1) ? i2 >= i3 ? Math.max(0, i2 - 1) : Math.max(0, (i2 - i4) + 1) : 0;
            b bVar = this.q;
            bVar.setTargetPosition(max);
            linearLayoutManager.startSmoothScroll(bVar);
        }
    }

    public final void N0() {
        Object obj;
        Iterator<T> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            hfz hfzVar = (hfz) obj;
            if ((hfzVar instanceof jgy) && ((jgy) hfzVar).b()) {
                break;
            }
        }
        if (!(obj instanceof jgy)) {
            obj = null;
        }
        jgy jgyVar = (jgy) obj;
        if (jgyVar != null) {
            ArrayList arrayList = new ArrayList(this.h);
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                hfz hfzVar2 = (hfz) it2.next();
                if ((hfzVar2 instanceof jgy) && epx.f(hfzVar2, jgyVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                arrayList.set(i, jgyVar.a(false));
            }
            Q0(arrayList, false, null);
            setItems(arrayList);
        }
    }

    public final void P0(int i) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ArrayList arrayList = new ArrayList(this.h);
        Object obj6 = null;
        if (this.p) {
            Iterator<T> it = this.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                hfz hfzVar = (hfz) obj3;
                if (hfzVar instanceof jgy) {
                    jgy jgyVar = (jgy) hfzVar;
                    if (jgyVar.getId() == i && !(jgyVar instanceof mgy)) {
                        break;
                    }
                }
            }
            if (!(obj3 instanceof jgy)) {
                obj3 = null;
            }
            jgy jgyVar2 = (jgy) obj3;
            int i2 = -1;
            if (jgyVar2 != null) {
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (epx.f((hfz) it2.next(), jgyVar2)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                if (i2 >= 0) {
                    arrayList.set(i2, jgyVar2.a(true));
                }
                Q0(arrayList, false, null);
            } else {
                Iterator<T> it3 = this.h.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (((hfz) obj4) instanceof mgy) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                if (!(obj4 instanceof mgy)) {
                    obj4 = null;
                }
                mgy mgyVar = (mgy) obj4;
                if (mgyVar != null) {
                    List<StickerStockItem> list = mgyVar.e;
                    Iterator<T> it4 = list.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj5 = it4.next();
                            if (((StickerStockItem) obj5).b == this.l) {
                                break;
                            }
                        } else {
                            obj5 = null;
                            break;
                        }
                    }
                    StickerStockItem stickerStockItem = (StickerStockItem) obj5;
                    Iterator<T> it5 = list.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Object next = it5.next();
                        if (((StickerStockItem) next).b == i) {
                            obj6 = next;
                            break;
                        }
                    }
                    StickerStockItem stickerStockItem2 = (StickerStockItem) obj6;
                    if (stickerStockItem2 != null && (stickerStockItem == null || stickerStockItem.b != stickerStockItem2.b)) {
                        Iterator it6 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            hfz hfzVar2 = (hfz) it6.next();
                            if ((hfzVar2 instanceof mgy) && epx.f(hfzVar2, mgyVar)) {
                                i2 = i4;
                                break;
                            }
                            i4++;
                        }
                        if (i2 >= 0) {
                            arrayList.set(i2, mgy.f(mgyVar, false, false, stickerStockItem2, 15));
                        }
                    }
                }
            }
        } else {
            Iterator<T> it7 = this.h.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it7.next();
                hfz hfzVar3 = (hfz) obj;
                if ((hfzVar3 instanceof jgy) && ((jgy) hfzVar3).b()) {
                    break;
                }
            }
            if (!(obj instanceof jgy)) {
                obj = null;
            }
            jgy jgyVar3 = (jgy) obj;
            Iterator<T> it8 = this.h.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it8.next();
                hfz hfzVar4 = (hfz) obj2;
                if ((hfzVar4 instanceof jgy) && ((jgy) hfzVar4).getId() == i) {
                    break;
                }
            }
            if (!(obj2 instanceof jgy)) {
                obj2 = null;
            }
            jgy jgyVar4 = (jgy) obj2;
            if (!epx.f(jgyVar3 != null ? Integer.valueOf(jgyVar3.getId()) : null, jgyVar4 != null ? Integer.valueOf(jgyVar4.getId()) : null)) {
                synchronized (this) {
                    try {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            if (epx.f(arrayList.get(i5), jgyVar3)) {
                                arrayList.set(i5, jgyVar3.a(false));
                            }
                            if (epx.f(arrayList.get(i5), jgyVar4)) {
                                arrayList.set(i5, jgyVar4.a(true));
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Iterator<T> it9 = this.o.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                if (((StickerStockItem) next2).b == i) {
                    obj6 = next2;
                    break;
                }
            }
            StickerStockItem stickerStockItem3 = (StickerStockItem) obj6;
            if (this.o.size() > 1 && stickerStockItem3 != null) {
                Q0(arrayList, true, stickerStockItem3);
            }
        }
        setItems(arrayList);
        this.l = i;
        ((kcl0) ((com.vk.channels.impl.channel_screen.send_msg.c) this.j.c).b).H0(i, new d4r(8));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(ArrayList arrayList, boolean z, StickerStockItem stickerStockItem) {
        boolean z2;
        Iterator<T> it;
        Object obj;
        StickerStockItem stickerStockItem2;
        this.p = z;
        if (this.o.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (z) {
            StickerStockItem stickerStockItem3 = (StickerStockItem) j5g.Y(this.o);
            List<StickerStockItem> list = this.o;
            if (stickerStockItem == null) {
                stickerStockItem = (StickerStockItem) j5g.Y(list);
            }
            arrayList2.add(new mgy(stickerStockItem3, false, true, list, stickerStockItem));
        } else {
            t6g0 t6g0Var = t6g0.b;
            if (t6g0.d().s0() <= 0) {
                List<StickerStockItem> list2 = this.o;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((kcl0) this.j.b).T0((StickerStockItem) it2.next())) {
                        }
                    }
                }
                z2 = false;
                it = this.o.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((StickerStockItem) obj).k) {
                            break;
                        }
                    }
                }
                stickerStockItem2 = (StickerStockItem) obj;
                if (stickerStockItem2 != null) {
                    NotificationImage notificationImage = stickerStockItem2.v;
                    t6g0 t6g0Var2 = t6g0.b;
                    arrayList2.add(new KeyboardNavigationVmojiPackItem(stickerStockItem2, notificationImage, z2, t6g0.d().j0()));
                }
            }
            z2 = true;
            it = this.o.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            stickerStockItem2 = (StickerStockItem) obj;
            if (stickerStockItem2 != null) {
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            hfz hfzVar = (hfz) it3.next();
            if ((hfzVar instanceof KeyboardNavigationVmojiPackItem) || (hfzVar instanceof mgy)) {
                break;
            } else {
                i++;
            }
        }
        g5g.D(arrayList, true, new tr0(22));
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        arrayList.addAll(i, arrayList2);
    }
}
