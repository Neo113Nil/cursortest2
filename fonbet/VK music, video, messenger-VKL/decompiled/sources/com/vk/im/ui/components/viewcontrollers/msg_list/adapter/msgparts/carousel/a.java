package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel;

import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.messages.Msg;
import xsna.bh10;
import xsna.bwt0;
import xsna.epx;
import xsna.fqj0;
import xsna.hfz;
import xsna.iah0;
import xsna.iu9;
import xsna.pk30;
import xsna.qoy;
import xsna.qul;
import xsna.shy;
import xsna.tv4;
import xsna.vfz;
import xsna.vu5;

/* compiled from: CarouselAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends qul {
    public pk30 h;
    public int i;

    /* compiled from: CarouselAdapter.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a$a, reason: collision with other inner class name */
    public static final class C1167a implements hfz {
        public final CarouselItem b;
        public final boolean c;
        public final int d;
        public final long e;
        public final int f;
        public Msg g;

        public C1167a(CarouselItem carouselItem, boolean z, int i, long j, int i2) {
            this.b = carouselItem;
            this.c = z;
            this.d = i;
            this.e = j;
            this.f = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1167a)) {
                return false;
            }
            C1167a c1167a = (C1167a) obj;
            return epx.f(this.b, c1167a.b) && this.c == c1167a.c && this.d == c1167a.d && this.e == c1167a.e && this.f == c1167a.f;
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf((this.d * 31) + this.b.hashCode());
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + bh10.a(shy.a(this.d, qoy.b(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CarouselListItem(item=");
            sb.append(this.b);
            sb.append(", isOutgoing=");
            sb.append(this.c);
            sb.append(", index=");
            sb.append(this.d);
            sb.append(", msgDialogId=");
            sb.append(this.e);
            sb.append(", cnvMsgId=");
            return vu5.b(sb, this.f, ')');
        }
    }

    public a(LayoutInflater layoutInflater, RecyclerView.u uVar) {
        super(false);
        this.i = iah0.f().widthPixels;
        this.e.put(0, new fqj0(C1167a.class, new iu9(layoutInflater, uVar, this, 0)));
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: B0 */
    public final void onBindViewHolder(vfz<hfz> vfzVar, int i) {
        D0(vfzVar, i, null);
        ((b) vfzVar).l = this.h;
        bwt0.r0(this.i, vfzVar.itemView);
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: G0 */
    public final void onViewRecycled(vfz<hfz> vfzVar) {
        vfzVar.g6();
        ((b) vfzVar).l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(vfz<hfz> vfzVar) {
        tv4.b("Failed to recycle carousel view", com.vk.metrics.eventtracking.b.a);
        return true;
    }
}
