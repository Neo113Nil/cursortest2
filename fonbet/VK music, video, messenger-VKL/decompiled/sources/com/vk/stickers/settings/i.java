package com.vk.stickers.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.core.ui.CircularProgressView;
import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vk.stickers.settings.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.d0w;
import xsna.dn20;
import xsna.ebx;
import xsna.emh0;
import xsna.f5z;
import xsna.f6l0;
import xsna.g2h0;
import xsna.gm50;
import xsna.gqe0;
import xsna.hfz;
import xsna.jjc;
import xsna.l6l0;
import xsna.n6l0;
import xsna.o6l0;
import xsna.r6l0;
import xsna.r820;
import xsna.sxm;
import xsna.t6c0;
import xsna.t6l0;
import xsna.u2k0;
import xsna.v6l0;
import xsna.vic;
import xsna.xc50;

/* compiled from: StickerSettingsView.kt */
/* loaded from: classes6.dex */
public final class i implements gm50 {
    public final f5z b;
    public final r820 c;
    public final View d;
    public final RecyclerView e;
    public final CircularProgressView f;
    public final a g;

    /* compiled from: StickerSettingsView.kt */
    public static final class a extends sxm implements vic {
        public boolean i;

        @Override // xsna.vic, com.vk.lists.c.i
        public final void clear() {
            setItems(EmptyList.b);
        }
    }

    /* compiled from: StickerSettingsView.kt */
    public interface b {
        void a(StickerSettingsCheckItem.Setting setting, boolean z);
    }

    public i(Context context, f5z f5zVar, r820 r820Var) {
        this.b = f5zVar;
        this.c = r820Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_settings_fragment, (ViewGroup) null);
        this.d = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.back_button);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.content_recycler);
        this.e = recyclerView;
        this.f = (CircularProgressView) inflate.findViewById(R.id.circular_progress);
        g gVar = new g(this);
        a aVar = new a();
        aVar.x0(r6l0.class, new t6c0(7));
        aVar.x0(f6l0.class, new g2h0(2));
        aVar.x0(StickerSettingsCheckItem.class, new d0w(gVar, 27));
        aVar.x0(l6l0.class, new emh0(gVar, 5));
        aVar.x0(n6l0.class, new ebx(gVar, 29));
        aVar.x0(t6l0.class, new dn20(gVar, 27));
        aVar.x0(v6l0.class, new gqe0(gVar, 6));
        aVar.x0(o6l0.class, new xc50(gVar, 22));
        this.g = aVar;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(aVar);
        new r(new c(aVar, r820Var)).l(recyclerView);
        jjc.g(imageView, new u2k0(this, 2));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }

    /* compiled from: StickerSettingsView.kt */
    public static final class c extends r.d {
        public final a e;
        public final r820 f;
        public boolean g;
        public Integer h;
        public Integer i;

        public c(a aVar, r820 r820Var) {
            this.e = aVar;
            this.f = r820Var;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            hfz hfzVar = this.e.h.get(e0Var2.getAbsoluteAdapterPosition());
            return (hfzVar instanceof l6l0) && ((l6l0) hfzVar).d;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
            a aVar = this.e;
            hfz hfzVar = aVar.h.get(absoluteAdapterPosition);
            if (aVar.i && (hfzVar instanceof l6l0) && ((l6l0) hfzVar).d) {
                return r.d.l(3, 0);
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean j() {
            return false;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean k() {
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = e0Var2.getAbsoluteAdapterPosition();
            this.i = Integer.valueOf(absoluteAdapterPosition2);
            a aVar = this.e;
            ArrayList arrayList = new ArrayList(aVar.h);
            if (!(arrayList.get(absoluteAdapterPosition) instanceof l6l0) || !(arrayList.get(absoluteAdapterPosition2) instanceof l6l0)) {
                return true;
            }
            arrayList.add(absoluteAdapterPosition2, (hfz) arrayList.remove(absoluteAdapterPosition));
            aVar.setItems(arrayList);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void o(RecyclerView.e0 e0Var, int i) {
            View view;
            if (i != 0) {
                if (i != 2) {
                    return;
                }
                this.g = true;
                this.h = e0Var != null ? Integer.valueOf(e0Var.getAbsoluteAdapterPosition()) : 0;
                this.i = null;
                if (e0Var == null || (view = e0Var.itemView) == null) {
                    return;
                }
                view.performHapticFeedback(0);
                return;
            }
            Integer num = this.h;
            Integer num2 = this.i;
            if (num != null && num2 != null) {
                int intValue = num2.intValue();
                int intValue2 = num.intValue();
                if (this.g && intValue2 != intValue) {
                    Iterator<? extends hfz> it = this.e.h.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        hfz next = it.next();
                        if ((next instanceof l6l0) && ((l6l0) next).d) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    this.f.invoke(new b.l(intValue2 - i2, intValue - i2));
                }
            }
            this.g = false;
            this.h = null;
            this.i = null;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
