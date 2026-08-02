package com.vk.photo.editor.features.colorgrading;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9b;
import xsna.aki;
import xsna.an10;
import xsna.azt;
import xsna.b76;
import xsna.c5g;
import xsna.cc5;
import xsna.dam;
import xsna.dq;
import xsna.e43;
import xsna.e55;
import xsna.epx;
import xsna.f0g;
import xsna.f1s;
import xsna.g5p;
import xsna.g8;
import xsna.gqg;
import xsna.h6g;
import xsna.hne;
import xsna.izs;
import xsna.k0g;
import xsna.k6g;
import xsna.k9x;
import xsna.kli;
import xsna.mw0;
import xsna.n82;
import xsna.nde;
import xsna.nfi;
import xsna.od1;
import xsna.p60;
import xsna.pwk;
import xsna.rd1;
import xsna.rei;
import xsna.sa30;
import xsna.sc;
import xsna.sd4;
import xsna.t3v;
import xsna.tcu;
import xsna.tg4;
import xsna.tji;
import xsna.ug4;
import xsna.ur0;
import xsna.v3p;
import xsna.vsq;
import xsna.wcg;
import xsna.wni;
import xsna.wr0;
import xsna.wzs;
import xsna.x8g0;
import xsna.xsq;
import xsna.y8;
import xsna.y8m;
import xsna.z6u;
import xsna.zji;
import xsna.zxo;

/* compiled from: Hsl1ViewController.kt */
/* loaded from: classes4.dex */
public final class g {
    public final v3p a;
    public h6g b;
    public boolean c = true;
    public final View d;
    public final List<a> e;
    public a f;
    public final k0g g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final DashedSeekBar k;
    public final DashedSeekBar l;
    public final DashedSeekBar m;

    /* compiled from: Hsl1ViewController.kt */
    public static final class a {
        public final f0g a;
        public final izs<com.vk.photo.editor.features.colorgrading.a, Float> b;
        public final izs<com.vk.photo.editor.features.colorgrading.a, Float> c;
        public final izs<com.vk.photo.editor.features.colorgrading.a, Float> d;
        public final wzs<com.vk.photo.editor.features.colorgrading.a, Float, com.vk.photo.editor.features.colorgrading.a> e;
        public final wzs<com.vk.photo.editor.features.colorgrading.a, Float, com.vk.photo.editor.features.colorgrading.a> f;
        public final wzs<com.vk.photo.editor.features.colorgrading.a, Float, com.vk.photo.editor.features.colorgrading.a> g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(f0g f0gVar, izs<? super com.vk.photo.editor.features.colorgrading.a, Float> izsVar, izs<? super com.vk.photo.editor.features.colorgrading.a, Float> izsVar2, izs<? super com.vk.photo.editor.features.colorgrading.a, Float> izsVar3, wzs<? super com.vk.photo.editor.features.colorgrading.a, ? super Float, com.vk.photo.editor.features.colorgrading.a> wzsVar, wzs<? super com.vk.photo.editor.features.colorgrading.a, ? super Float, com.vk.photo.editor.features.colorgrading.a> wzsVar2, wzs<? super com.vk.photo.editor.features.colorgrading.a, ? super Float, com.vk.photo.editor.features.colorgrading.a> wzsVar3) {
            this.a = f0gVar;
            this.b = izsVar;
            this.c = izsVar2;
            this.d = izsVar3;
            this.e = wzsVar;
            this.f = wzsVar2;
            this.g = wzsVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + dq.c(dq.c(dq.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31);
        }

        public final String toString() {
            return "CgParam(color=" + this.a + ", getHueValue=" + this.b + ", getSaturationValue=" + this.c + ", getLightnessValue=" + this.d + ", setHueValue=" + this.e + ", setSaturationValue=" + this.f + ", setLightnessValue=" + this.g + ")";
        }
    }

    public g(v3p v3pVar, FrameLayout frameLayout) {
        this.a = v3pVar;
        List<a> l = e43.l(new a(new f0g("Red", Color.argb(255, 255, 51, 71), new x8g0(R.string.editor_collage_color_title_red), false), new g8(28), new y8m(4), new p60(28), new mw0((byte) 0, 4), new zji(2), new aki((byte) 0, 4)), new a(new f0g("Orange", Color.argb(255, PsExtractor.VIDEO_STREAM_MASK, 92, 68), new x8g0(R.string.editor_collage_color_title_orange), false), new ur0(28), new dam(11), new sc(28), new gqg((byte) 0, 3), new od1(3), new wni(2)), new a(new f0g("Yellow", Color.argb(255, 255, 160, 0), new x8g0(R.string.editor_collage_color_title_yellow), false), new wr0(22), new z6u(2), new sd4(28), new b76((byte) 0, 2), new nfi((byte) 0, 2), new hne(5)), new a(new f0g("Green", Color.argb(255, 75, 179, 75), new x8g0(R.string.editor_collage_color_title_green), false), new tcu(4), new azt(4), new vsq(8), new a9b(3), new nde((byte) 0, 5), new kli((byte) 0, 4)), new a(new f0g("Cyan", Color.argb(255, 113, 170, 235), new x8g0(R.string.editor_collage_color_title_blue), false), new n82(22), new t3v(1), new xsq(8), new cc5(5), new e55((byte) 0, 4), new tji(4)), new a(new f0g("Magenta", Color.argb(255, 169, 79, 255), new x8g0(R.string.editor_collage_color_title_purple), false), new f1s(2), new rd1(24), new y8(23), new rei(3), new tg4((byte) 0, 3), new ug4((byte) 0, 6)));
        this.e = l;
        this.g = new k0g(R.layout.item_editor_hsl_color);
        View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.hsl, (ViewGroup) frameLayout, false);
        this.d = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rvColors);
        List<a> list = l;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).a);
        }
        this.g.submitList(arrayList);
        this.g.d = new com.vk.repository.internal.repos.stickers.suggests.a(1, this, g.class, "selectColor", "selectColor(I)V", 0, 7);
        recyclerView.setAdapter(this.g);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.h = (TextView) this.d.findViewById(R.id.colorHueValue);
        this.i = (TextView) this.d.findViewById(R.id.colorSaturationValue);
        this.j = (TextView) this.d.findViewById(R.id.colorLightnessValue);
        DashedSeekBar dashedSeekBar = (DashedSeekBar) this.d.findViewById(R.id.colorHueSeekbar);
        dashedSeekBar.setCustomContentDescriptionProvider(new pwk(dashedSeekBar, 20));
        dashedSeekBar.setZeroEffectValue(50);
        this.k = dashedSeekBar;
        DashedSeekBar dashedSeekBar2 = (DashedSeekBar) this.d.findViewById(R.id.colorSaturationSeekbar);
        dashedSeekBar2.setCustomContentDescriptionProvider(new wcg(dashedSeekBar2, 25));
        dashedSeekBar2.setZeroEffectValue(50);
        this.l = dashedSeekBar2;
        DashedSeekBar dashedSeekBar3 = (DashedSeekBar) this.d.findViewById(R.id.colorLightnessSeekbar);
        dashedSeekBar3.setCustomContentDescriptionProvider(new zxo(dashedSeekBar3, 17));
        dashedSeekBar3.setZeroEffectValue(50);
        this.m = dashedSeekBar3;
        dashedSeekBar.setOnSeekBarChangeListener(new d(this));
        dashedSeekBar2.setOnSeekBarChangeListener(new e(this));
        dashedSeekBar3.setOnSeekBarChangeListener(new f(this));
        c(0);
    }

    public static com.vk.photo.editor.features.colorgrading.a b(com.vk.photo.editor.ivm.d dVar) {
        g5p g5pVar = ((EditorState) dVar.b.b.getValue()).b.get(k6g.a);
        if (g5pVar instanceof com.vk.photo.editor.features.colorgrading.a) {
            return (com.vk.photo.editor.features.colorgrading.a) g5pVar;
        }
        return null;
    }

    public final void a() {
        boolean z;
        com.vk.photo.editor.features.colorgrading.a b = b(this.a.d());
        if (b == null) {
            return;
        }
        for (a aVar : this.e) {
            if (aVar.b.invoke(b).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || aVar.c.invoke(b).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || aVar.d.invoke(b).floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                z = false;
                break;
            }
        }
        z = true;
        if (this.c != z) {
            this.c = z;
            h6g h6gVar = this.b;
            if (h6gVar != null) {
                h6gVar.invoke(Boolean.valueOf(z));
            }
        }
    }

    public final void c(int i) {
        com.vk.photo.editor.features.colorgrading.a b = b(this.a.d());
        if (b == null) {
            b = new com.vk.photo.editor.features.colorgrading.a(0);
        }
        List<a> list = this.e;
        a aVar = list.get(i);
        this.f = aVar;
        List<a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (a aVar2 : list2) {
            arrayList.add(f0g.a(aVar2.a, aVar2.equals(aVar)));
        }
        this.g.submitList(arrayList);
        izs<com.vk.photo.editor.features.colorgrading.a, Float> izsVar = aVar.b;
        izs<com.vk.photo.editor.features.colorgrading.a, Float> izsVar2 = aVar.d;
        izs<com.vk.photo.editor.features.colorgrading.a, Float> izsVar3 = aVar.c;
        this.h.setText(String.valueOf(an10.b(sa30.E(izsVar.invoke(b).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1)))));
        this.i.setText(String.valueOf(an10.b(sa30.E(izsVar3.invoke(b).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1)))));
        this.j.setText(String.valueOf(an10.b(sa30.E(izsVar2.invoke(b).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1)))));
        this.k.a(((aVar.b.invoke(b).floatValue() + 1.0f) / 2.0f) * 100.0f, false);
        this.l.a(((izsVar3.invoke(b).floatValue() + 1.0f) / 2.0f) * 100.0f, false);
        this.m.a(((izsVar2.invoke(b).floatValue() + 1.0f) / 2.0f) * 100.0f, false);
    }
}
