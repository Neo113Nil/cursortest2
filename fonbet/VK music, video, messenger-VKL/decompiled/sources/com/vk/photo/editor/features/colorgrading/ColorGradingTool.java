package com.vk.photo.editor.features.colorgrading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.photo.editor.features.colorgrading.b;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.a54;
import xsna.ak;
import xsna.am0;
import xsna.asp;
import xsna.biq;
import xsna.c2;
import xsna.c5p;
import xsna.ci3;
import xsna.ci7;
import xsna.d40;
import xsna.d5p;
import xsna.dh5;
import xsna.dj1;
import xsna.dnp0;
import xsna.dq;
import xsna.e15;
import xsna.e43;
import xsna.e60;
import xsna.e6g;
import xsna.ef2;
import xsna.f07;
import xsna.f5p;
import xsna.f6g;
import xsna.fj1;
import xsna.fyt0;
import xsna.g5p;
import xsna.g6g;
import xsna.gt;
import xsna.gv3;
import xsna.gzs;
import xsna.h5p;
import xsna.h6g;
import xsna.i4p;
import xsna.i6g;
import xsna.imp0;
import xsna.izs;
import xsna.j5g;
import xsna.j89;
import xsna.k3g;
import xsna.k6g;
import xsna.lt0;
import xsna.m3p;
import xsna.md;
import xsna.md8;
import xsna.mmf;
import xsna.n2k0;
import xsna.nj;
import xsna.nk;
import xsna.nrb;
import xsna.od3;
import xsna.odj;
import xsna.ol;
import xsna.on00;
import xsna.pe1;
import xsna.pf;
import xsna.pl2;
import xsna.pt;
import xsna.q0g;
import xsna.qm0;
import xsna.qt;
import xsna.qt0;
import xsna.r0g;
import xsna.rf;
import xsna.rl2;
import xsna.s3q0;
import xsna.sc;
import xsna.sd4;
import xsna.shy;
import xsna.spj;
import xsna.tb4;
import xsna.tc;
import xsna.uhd;
import xsna.ur0;
import xsna.v0g;
import xsna.v3p;
import xsna.v40;
import xsna.vr0;
import xsna.vt1;
import xsna.wh6;
import xsna.wq3;
import xsna.wra;
import xsna.wzs;
import xsna.x2g;
import xsna.x50;
import xsna.x90;
import xsna.xpd;
import xsna.xr0;
import xsna.y2g;
import xsna.y90;
import xsna.ya;
import xsna.z13;
import xsna.z90;
import xsna.zh6;
import xsna.zj;
import xsna.zmp0;
import xsna.zrp;

/* compiled from: ColorGradingTool.kt */
/* loaded from: classes4.dex */
public final class ColorGradingTool extends m3p<com.vk.photo.editor.features.colorgrading.a> implements v0g {
    public final v3p c;
    public final Map<f5p, d5p.a<?>> d;
    public View e;
    public boolean f;
    public a g;
    public g h;
    public h i;
    public HashMap<Integer, ToolButton> j;
    public HashMap<WrapperId, View> k;
    public DashedSeekBar l;
    public TextView m;
    public final c5p n;
    public final List<a> o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ColorGradingTool.kt */
    public static final class WrapperId {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WrapperId[] $VALUES;
        public static final WrapperId DefaultSeekbar;
        public static final WrapperId HSL1;
        public static final WrapperId HSL2;
        public static final WrapperId Tone;

        static {
            WrapperId wrapperId = new WrapperId("HSL1", 0);
            HSL1 = wrapperId;
            WrapperId wrapperId2 = new WrapperId("HSL2", 1);
            HSL2 = wrapperId2;
            WrapperId wrapperId3 = new WrapperId("Tone", 2);
            Tone = wrapperId3;
            WrapperId wrapperId4 = new WrapperId("DefaultSeekbar", 3);
            DefaultSeekbar = wrapperId4;
            WrapperId[] wrapperIdArr = {wrapperId, wrapperId2, wrapperId3, wrapperId4};
            $VALUES = wrapperIdArr;
            $ENTRIES = new asp(wrapperIdArr);
        }

        public WrapperId() {
            throw null;
        }

        public static WrapperId valueOf(String str) {
            return (WrapperId) Enum.valueOf(WrapperId.class, str);
        }

        public static WrapperId[] values() {
            return (WrapperId[]) $VALUES.clone();
        }
    }

    /* compiled from: ColorGradingTool.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final izs<com.vk.photo.editor.features.colorgrading.a, Boolean> c;
        public final izs<com.vk.photo.editor.features.colorgrading.a, Float> d;
        public final wzs<com.vk.photo.editor.features.colorgrading.a, Float, com.vk.photo.editor.features.colorgrading.a> e;
        public final izs<Float, Float> f;
        public final izs<Float, Float> g;
        public final izs<Float, Integer> h;
        public final int i;
        public final com.vk.photo.editor.features.colorgrading.b j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, izs<? super com.vk.photo.editor.features.colorgrading.a, Boolean> izsVar, izs<? super com.vk.photo.editor.features.colorgrading.a, Float> izsVar2, wzs<? super com.vk.photo.editor.features.colorgrading.a, ? super Float, com.vk.photo.editor.features.colorgrading.a> wzsVar, izs<? super Float, Float> izsVar3, izs<? super Float, Float> izsVar4, izs<? super Float, Integer> izsVar5, int i3, com.vk.photo.editor.features.colorgrading.b bVar) {
            this.a = i;
            this.b = i2;
            this.c = izsVar;
            this.d = izsVar2;
            this.e = wzsVar;
            this.f = izsVar3;
            this.g = izsVar4;
            this.h = izsVar5;
            this.i = i3;
            this.j = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.g.equals(aVar.g) && this.h.equals(aVar.h) && this.i == aVar.i && this.j.equals(aVar.j);
        }

        public final int hashCode() {
            return this.j.hashCode() + shy.a(this.i, dq.c(dq.c(dq.c((this.e.hashCode() + dq.c(dq.c(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31);
        }

        public final String toString() {
            StringBuilder a = odj.a(this.a, this.b, "CgParam(buttonResId=", ", contentDescriptionResId=", ", isDefault=");
            a.append(this.c);
            a.append(", getValue=");
            a.append(this.d);
            a.append(", setValue=");
            a.append(this.e);
            a.append(", toSeekbarValue=");
            a.append(this.f);
            a.append(", fromSeekbarValue=");
            a.append(this.g);
            a.append(", toUserValue=");
            a.append(this.h);
            a.append(", seekbarDefaultValue=");
            a.append(this.i);
            a.append(", statEvent=");
            a.append(this.j);
            a.append(")");
            return a.toString();
        }
    }

    /* compiled from: ColorGradingTool.kt */
    public static final class b implements d5p.a<com.vk.photo.editor.features.colorgrading.a> {
        @Override // xsna.d5p.a
        public final d5p<com.vk.photo.editor.features.colorgrading.a> a(v3p v3pVar) {
            return new ColorGradingTool(v3pVar);
        }
    }

    public ColorGradingTool(v3p v3pVar) {
        this.c = v3pVar;
        List<n2k0> list = r0g.a;
        this.d = on00.f(new Pair(y2g.a, new q0g()));
        this.n = v3pVar.b();
        int i = 19;
        int i2 = 13;
        int i3 = 15;
        int i4 = 12;
        int i5 = 14;
        int i6 = 20;
        byte b2 = 0;
        int i7 = 9;
        int i8 = 11;
        int i9 = 22;
        this.o = e43.l(new a(R.id.tabBrightness, R.string.editor_brightness, new z90(i), new tc(i2), new nrb(1), new ci7(i3), new gv3(11), new x50(10), 50, b.C1455b.a), new a(R.id.tabContrast, R.string.editor_contrast, new vt1(i2), new gt(i4), new j89(1), new qm0(i5), new qt0(i3), new e60(i3), 50, b.c.a), new a(R.id.tabTemperature, R.string.editor_temperature, new pt(i6), new qt(i5), new f07((byte) 0, 2), new ol(i4), new d40(i3), new ur0(13), 50, b.j.a), new a(R.id.tabSaturation, R.string.editor_saturation_full, new vr0(i), new sc(i4), new md8((byte) 0, 2), new xr0(i), new sd4(i5), new z13(8), 50, b.h.a), new a(R.id.tabSharpness, R.string.editor_sharpness, new od3(16), new dh5(i4), new e6g(b2), new dj1(18), new fj1(i2), new pe1(14), 0, b.i.a), new a(R.id.tabGrain, R.string.editor_grain, new nj(i7), new md(18), new f6g((byte) 0, 0), new pl2(i5), new zj(16), new ak(i4), 0, b.e.a), new a(R.id.tabVignette, R.string.editor_vignette, new c2(17), new wq3(i5), new g6g(b2), new rl2(i8), new x90(i7), new y90(i3), 0, b.l.a), new a(R.id.tabDarks, R.string.editor_darks, new com.vk.movika.sdk.base.logic.interactor.f(i8), new lt0(i6), new uhd(1), new am0(i9), new ci3(14), new pf(16), 50, b.d.a), new a(R.id.tabLights, R.string.editor_lights, new nk(i2), new rf(i9), new xpd(b2, 1), new com.vk.movika.sdk.base.utils.b(i3), new tb4(9), new wh6(i2), 50, b.g.a));
    }

    public static com.vk.photo.editor.features.colorgrading.a H(com.vk.photo.editor.ivm.d dVar) {
        g5p g5pVar = ((EditorState) dVar.b.b.getValue()).b.get(k6g.a);
        if (g5pVar instanceof com.vk.photo.editor.features.colorgrading.a) {
            return (com.vk.photo.editor.features.colorgrading.a) g5pVar;
        }
        return null;
    }

    @Override // xsna.m3p, xsna.d5p
    public final void C() {
        View view = this.e;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            fyt0.i(viewGroup);
        }
    }

    @Override // xsna.m3p, xsna.d5p
    public final void D(EditorState editorState) {
        x2g x2gVar;
        if (this.f || (x2gVar = (x2g) this.c.g(y2g.a).h()) == null) {
            return;
        }
        k3g c = x2gVar.c();
        if (c != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new ef2(c, 6), 500L);
        }
        this.f = true;
    }

    @Override // xsna.m3p, xsna.d5p
    public final Map<f5p, d5p.a<?>> E() {
        return this.d;
    }

    @Override // xsna.m3p
    public final /* bridge */ /* synthetic */ void G(com.vk.photo.editor.features.colorgrading.a aVar) {
    }

    public final void I(ToolButton toolButton, boolean z) {
        Object obj;
        HashMap<WrapperId, View> hashMap;
        Iterator<T> it = this.o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((a) obj).a == toolButton.getId()) {
                    break;
                }
            }
        }
        a aVar = (a) obj;
        if (aVar == null) {
            return;
        }
        izs<com.vk.photo.editor.features.colorgrading.a, Float> izsVar = aVar.d;
        v3p v3pVar = this.c;
        com.vk.photo.editor.features.colorgrading.a H = H(v3pVar.d());
        if (H == null) {
            H = new com.vk.photo.editor.features.colorgrading.a(0);
        }
        HashMap<Integer, ToolButton> hashMap2 = this.j;
        if (hashMap2 == null || (hashMap = this.k) == null) {
            return;
        }
        this.g = aVar;
        Iterator<T> it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            ((ToolButton) it2.next()).setSelected(false);
        }
        Iterator<T> it3 = hashMap.values().iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setVisibility(8);
        }
        toolButton.setSelected(true);
        View view = hashMap.get(WrapperId.DefaultSeekbar);
        if (view != null) {
            view.setVisibility(0);
        }
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(String.valueOf(aVar.h.invoke(izsVar.invoke(H)).intValue()));
        }
        DashedSeekBar dashedSeekBar = this.l;
        if (dashedSeekBar != null) {
            dashedSeekBar.a(aVar.f.invoke(izsVar.invoke(H)).floatValue(), false);
            dashedSeekBar.setContentDescription(v3pVar.x().getString(aVar.b));
            dashedSeekBar.setDefaultValue(aVar.i);
            dashedSeekBar.setZeroEffectValue(dashedSeekBar.getDefaultValue());
        }
        if (z) {
            return;
        }
        this.n.b(aVar.j);
    }

    public final void J(gzs<s3q0> gzsVar) {
        FrameLayout bottom = this.c.getBottom();
        dnp0 dnp0Var = new dnp0();
        dnp0Var.c(new wra());
        dnp0Var.c(new biq());
        dnp0Var.addListener(new imp0(new a54(1, gzsVar)));
        zmp0.a(bottom, dnp0Var);
    }

    @Override // xsna.d5p
    public final String e(g5p g5pVar, g5p g5pVar2) {
        int i;
        if (!(g5pVar == null ? true : g5pVar instanceof com.vk.photo.editor.features.colorgrading.a)) {
            return null;
        }
        if (!(g5pVar2 == null ? true : g5pVar2 instanceof com.vk.photo.editor.features.colorgrading.a)) {
            return null;
        }
        Context x = this.c.x();
        com.vk.photo.editor.features.colorgrading.a aVar = (com.vk.photo.editor.features.colorgrading.a) g5pVar2;
        if (aVar != null && aVar.I()) {
            i = R.string.editor_history_cg_undo;
        } else {
            com.vk.photo.editor.features.colorgrading.a aVar2 = (com.vk.photo.editor.features.colorgrading.a) g5pVar;
            i = aVar2 != null && aVar2.I() ? R.string.editor_history_cg_redo : R.string.editor_history_cg_changed;
        }
        return x.getString(i);
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ f5p getId() {
        return k6g.a;
    }

    @Override // xsna.d5p
    public final /* bridge */ /* synthetic */ h5p getRenderer() {
        return null;
    }

    @Override // xsna.d5p
    public final void k() {
        HashMap<Integer, ToolButton> hashMap;
        HashMap<WrapperId, View> hashMap2;
        ToolButton toolButton;
        HashMap<Integer, ToolButton> hashMap3;
        HashMap<WrapperId, View> hashMap4;
        HashMap<Integer, ToolButton> hashMap5;
        TextView textView;
        HashMap<Integer, ToolButton> hashMap6;
        ColorGradingTool colorGradingTool = this;
        v3p v3pVar = colorGradingTool.c;
        v3pVar.b().b(b.m.a);
        View inflate = LayoutInflater.from(v3pVar.getBottom().getContext()).inflate(R.layout.feature_cg_bottom, (ViewGroup) v3pVar.getBottom(), false);
        v3pVar.getBottom().addView(inflate);
        colorGradingTool.e = inflate;
        List<a> list = colorGradingTool.o;
        if (inflate != null) {
            ToolBottomView toolBottomView = (ToolBottomView) inflate.findViewById(R.id.tool_bottom_view);
            toolBottomView.setOnCancelClickListener(new com.vk.movika.sdk.base.ui.f(colorGradingTool, 25));
            toolBottomView.setOnDoneClickListener(new v40(colorGradingTool, 24));
            colorGradingTool.j = new HashMap<>();
            colorGradingTool.k = new HashMap<>();
            colorGradingTool.l = (DashedSeekBar) inflate.findViewById(R.id.seekbar);
            colorGradingTool.m = (TextView) inflate.findViewById(R.id.tvSeekbarValue);
            colorGradingTool.k.put(WrapperId.DefaultSeekbar, inflate.findViewById(R.id.seekbarWrapper));
            DashedSeekBar dashedSeekBar = colorGradingTool.l;
            if (dashedSeekBar != null && (textView = colorGradingTool.m) != null && (hashMap6 = colorGradingTool.j) != null) {
                dashedSeekBar.setCustomContentDescriptionProvider(new ya(12, colorGradingTool, dashedSeekBar));
                dashedSeekBar.setOnSeekBarChangeListener(new c(colorGradingTool, textView, hashMap6));
            }
            View view = colorGradingTool.e;
            if (view != null && (hashMap5 = colorGradingTool.j) != null) {
                for (a aVar : list) {
                    ToolButton toolButton2 = (ToolButton) view.findViewById(aVar.a);
                    hashMap5.put(Integer.valueOf(aVar.a), toolButton2);
                    colorGradingTool = this;
                    toolButton2.setOnClick(new e15(1, this, ColorGradingTool.class, "onRegularButtonClick", "onRegularButtonClick(Lcom/vk/photo/editor/views/ToolButton;)V", 0, 3));
                    com.vk.photo.editor.features.colorgrading.a H = H(v3pVar.d());
                    if (H == null) {
                        H = new com.vk.photo.editor.features.colorgrading.a(0);
                    }
                    toolButton2.setIndicatorActive(aVar.c.invoke(H).booleanValue());
                }
            }
            View view2 = colorGradingTool.e;
            if (view2 != null && (hashMap3 = colorGradingTool.j) != null && (hashMap4 = colorGradingTool.k) != null) {
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.hslWrapper);
                frameLayout.setVisibility(8);
                g gVar = new g(v3pVar, frameLayout);
                gVar.b = new h6g(hashMap3, 0);
                frameLayout.addView(gVar.d);
                colorGradingTool.h = gVar;
                hashMap4.put(WrapperId.HSL1, frameLayout);
                ToolButton toolButton3 = (ToolButton) view2.findViewById(R.id.tabHsl1);
                hashMap3.put(Integer.valueOf(R.id.tabHsl1), toolButton3);
                toolButton3.setOnClick(new i6g(colorGradingTool, hashMap3, hashMap4, toolButton3, frameLayout, 0));
                g gVar2 = colorGradingTool.h;
                if (gVar2 != null) {
                    gVar2.a();
                }
            }
            View view3 = colorGradingTool.e;
            if (view3 != null && (toolButton = (ToolButton) view3.findViewById(R.id.tabHsl2)) != null) {
                toolButton.setVisibility(8);
            }
            View view4 = colorGradingTool.e;
            if (view4 != null && (hashMap = colorGradingTool.j) != null && (hashMap2 = colorGradingTool.k) != null) {
                FrameLayout frameLayout2 = (FrameLayout) view4.findViewById(R.id.toneWrapper);
                frameLayout2.setVisibility(8);
                h hVar = new h(v3pVar, frameLayout2);
                hVar.c = new mmf(hashMap, 1);
                frameLayout2.addView(hVar.i);
                colorGradingTool.i = hVar;
                hashMap2.put(WrapperId.Tone, frameLayout2);
                ToolButton toolButton4 = (ToolButton) view4.findViewById(R.id.tabTone);
                hashMap.put(Integer.valueOf(R.id.tabTone), toolButton4);
                toolButton4.setOnClick(new zh6(colorGradingTool, hashMap, hashMap2, toolButton4, frameLayout2));
                h hVar2 = colorGradingTool.i;
                if (hVar2 != null) {
                    hVar2.a();
                }
            }
        }
        colorGradingTool.I((ToolButton) inflate.findViewById(((a) j5g.Y(list)).a), true);
        v3pVar.p(false);
    }

    @Override // xsna.d5p
    public final void p() {
        View view = this.e;
        v3p v3pVar = this.c;
        if (view != null) {
            v3pVar.getBottom().removeView(view);
            this.e = null;
        }
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        v3pVar.p(true);
    }

    @Override // xsna.d5p
    public final String r(g5p g5pVar, g5p g5pVar2) {
        int i;
        if (!(g5pVar == null ? true : g5pVar instanceof com.vk.photo.editor.features.colorgrading.a)) {
            return null;
        }
        if (!(g5pVar2 == null ? true : g5pVar2 instanceof com.vk.photo.editor.features.colorgrading.a)) {
            return null;
        }
        Context x = this.c.x();
        com.vk.photo.editor.features.colorgrading.a aVar = (com.vk.photo.editor.features.colorgrading.a) g5pVar2;
        if (aVar != null && aVar.I()) {
            i = R.string.editor_history_cg_undo;
        } else {
            com.vk.photo.editor.features.colorgrading.a aVar2 = (com.vk.photo.editor.features.colorgrading.a) g5pVar;
            i = aVar2 != null && aVar2.I() ? R.string.editor_history_cg_redo : R.string.editor_history_cg_changed;
        }
        return x.getString(i);
    }

    @Override // xsna.d5p
    public final ToolButton s(Context context) {
        ToolButton toolButton = new ToolButton(context, null, R.attr.editorToolButtonStyle_ColorGrading, R.style.EditorToolButton_ColorGrading, 2);
        toolButton.setImportantForAccessibility(1);
        toolButton.setContentDescription(toolButton.getResources().getString(R.string.editor_tool_button_color_grading));
        return toolButton;
    }

    @Override // xsna.d5p
    public final Object u(i4p i4pVar, spj<? super com.vk.photo.editor.features.colorgrading.a> spjVar) {
        return new com.vk.photo.editor.features.colorgrading.a(0);
    }
}
