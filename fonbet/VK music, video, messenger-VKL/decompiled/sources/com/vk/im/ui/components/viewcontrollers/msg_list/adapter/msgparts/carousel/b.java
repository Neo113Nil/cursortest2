package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a;
import com.vkontakte.android.R;
import xsna.a38;
import xsna.b38;
import xsna.bwt0;
import xsna.e3m;
import xsna.ek30;
import xsna.h38;
import xsna.hdp;
import xsna.n40;
import xsna.pk30;
import xsna.pq8;
import xsna.qm1;
import xsna.vfz;

/* compiled from: CarouselVh.kt */
/* loaded from: classes2.dex */
public final class b extends vfz<a.C1167a> {
    public pk30 l;
    public final hdp m;
    public final TextView n;
    public final TextView o;
    public final FrescoImageView p;
    public final FrameLayout q;
    public final h38 r;
    public final int s;
    public final ek30 t;
    public final Drawable u;
    public final Drawable v;
    public a.C1167a w;

    /* compiled from: CarouselVh.kt */
    public static final class a implements b38 {
        public a() {
        }

        @Override // xsna.b38
        public final void a(BotButton botButton, int i) {
            b bVar = b.this;
            pk30 pk30Var = bVar.l;
            if (pk30Var != null) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                a.C1167a c1167a = bVar.w;
                if (c1167a == null) {
                    c1167a = null;
                }
                Peer b = Peer.a.b(c1167a.e);
                a.C1167a c1167a2 = bVar.w;
                pk30Var.a(new MsgSendSource.c(botButton, new pq8.a((c1167a2 != null ? c1167a2 : null).f, bVar.getAdapterPosition(), i, b)));
            }
        }
    }

    public b(View view, LayoutInflater layoutInflater, RecyclerView.u uVar, pk30 pk30Var) {
        super(view);
        this.l = pk30Var;
        this.m = hdp.a;
        this.n = (TextView) view.findViewById(R.id.vkim_carousel_title);
        this.o = (TextView) view.findViewById(R.id.vkim_carousel_description);
        FrescoImageView frescoImageView = (FrescoImageView) view.findViewById(R.id.vkim_carousel_photo);
        this.p = frescoImageView;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.vkim_carousel_kbd_container);
        this.q = frameLayout;
        h38 h38Var = new h38(layoutInflater, uVar);
        h38Var.b();
        this.r = h38Var;
        this.s = e3m.d(R.attr.im_msg_part_corner_radius_big, this.itemView.getContext());
        ek30 ek30Var = new ek30(this.itemView.getContext(), 0);
        this.t = ek30Var;
        a aVar = new a();
        h38Var.e = aVar;
        if (h38Var.f != null) {
            a38 a38Var = h38Var.h;
            a38Var = a38Var == null ? null : a38Var;
            a38Var.f = aVar;
            a38Var.notifyDataSetChanged();
        }
        frescoImageView.setPlaceholder(ek30Var);
        this.v = e3m.e(R.attr.vkim_carousel_in, this.itemView.getContext());
        this.u = e3m.e(R.attr.vkim_carousel_out, this.itemView.getContext());
        frameLayout.addView(h38Var.f, new FrameLayout.LayoutParams(-1, -2, 80));
        bwt0.i0(frescoImageView, new n40(this, 12));
        bwt0.i0(this.itemView, new qm1(this, 12));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(a.C1167a c1167a) {
        a.C1167a c1167a2 = c1167a;
        this.w = c1167a2;
        CarouselItem carouselItem = c1167a2.b;
        this.itemView.setBackground(c1167a2.c ? this.u : this.v);
        String str = carouselItem.b;
        ImageList imageList = carouselItem.f;
        BotKeyboard botKeyboard = carouselItem.g;
        String str2 = carouselItem.c;
        boolean z = str.length() > 0;
        TextView textView = this.n;
        bwt0.p0(textView, z);
        boolean K = bwt0.K(textView);
        hdp hdpVar = this.m;
        if (K) {
            textView.setText(hdpVar.a(carouselItem.b));
        }
        boolean z2 = str2.length() > 0;
        TextView textView2 = this.o;
        bwt0.p0(textView2, z2);
        if (bwt0.K(textView2)) {
            textView2.setText(hdpVar.a(str2));
        }
        boolean z3 = botKeyboard != null;
        FrameLayout frameLayout = this.q;
        bwt0.p0(frameLayout, z3);
        if (bwt0.K(frameLayout)) {
            this.r.c(botKeyboard);
        }
        a.C1167a c1167a3 = this.w;
        if (c1167a3 == null) {
            c1167a3 = null;
        }
        CarouselItem carouselItem2 = c1167a3.b;
        int length = carouselItem2.b.length();
        ek30 ek30Var = this.t;
        int i = this.s;
        FrescoImageView frescoImageView = this.p;
        if (length == 0 && carouselItem2.c.length() == 0 && carouselItem2.g == null && carouselItem2.f.Jb()) {
            frescoImageView.setVisible(true);
            frescoImageView.setRemoteImage(imageList);
            frescoImageView.m(i, i, i, i);
            ek30Var.c(i, i, i, i);
            return;
        }
        a.C1167a c1167a4 = this.w;
        if (!(c1167a4 != null ? c1167a4 : null).b.f.Jb()) {
            frescoImageView.setVisible(false);
            return;
        }
        frescoImageView.setVisible(true);
        frescoImageView.setRemoteImage(imageList);
        frescoImageView.m(i, i, 0, 0);
        ek30Var.c(i, i, 0, 0);
    }
}
