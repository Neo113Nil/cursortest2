package com.vk.photo.editor.features.colorgrading;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import xsna.an10;
import xsna.c5g;
import xsna.e43;
import xsna.f0g;
import xsna.g5p;
import xsna.hy0;
import xsna.k0g;
import xsna.k6g;
import xsna.k9x;
import xsna.mcc0;
import xsna.mmf;
import xsna.pi6;
import xsna.sa30;
import xsna.v3p;
import xsna.x8g0;

/* compiled from: ToneController.kt */
/* loaded from: classes4.dex */
public final class h {
    public final v3p a;
    public final ViewGroup b;
    public mmf c;
    public boolean d = true;
    public final List<f0g> e;
    public final List<f0g> f;
    public boolean g;
    public List<f0g> h;
    public final View i;
    public final TextView j;
    public final TextView k;
    public final Button l;
    public final Button m;
    public final ViewGroup n;
    public final DashedSeekBar o;
    public final k0g p;

    public h(v3p v3pVar, FrameLayout frameLayout) {
        this.a = v3pVar;
        this.b = frameLayout;
        List<f0g> l = e43.l(new f0g("Red", Color.argb(255, 255, 51, 71), new x8g0(R.string.editor_collage_color_title_red), false), new f0g("Orange", Color.argb(255, PsExtractor.VIDEO_STREAM_MASK, 92, 68), new x8g0(R.string.editor_collage_color_title_orange), false), new f0g("Yellow", Color.argb(255, 255, 160, 0), new x8g0(R.string.editor_collage_color_title_yellow), false), new f0g("Green", Color.argb(255, 75, 179, 75), new x8g0(R.string.editor_collage_color_title_green), false), new f0g("Blue", Color.argb(255, 113, 170, 235), new x8g0(R.string.editor_collage_color_title_blue), false), new f0g("Violet", Color.argb(255, 169, 79, 255), new x8g0(R.string.editor_collage_color_title_violet), false));
        this.e = l;
        this.f = e43.l(new f0g("Pink", Color.argb(255, 255, 112, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), new x8g0(R.string.editor_collage_color_title_red), false), new f0g("Beige", Color.argb(255, 244, VersionConstants.PRODUCT_MAJOR_VERSION, 123), new x8g0(R.string.editor_collage_color_title_orange), false), new f0g("LightBeige", Color.argb(255, 255, 183, 61), new x8g0(R.string.editor_collage_color_title_yellow), false), new f0g("LightGreen", Color.argb(255, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 198, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), new x8g0(R.string.editor_collage_color_title_green), false), new f0g("Cyan", Color.argb(255, 166, 201, 242), new x8g0(R.string.editor_collage_color_title_blue), false), new f0g("Violet", Color.argb(255, 198, 138, 255), new x8g0(R.string.editor_collage_color_title_violet), false));
        this.g = true;
        this.h = l;
        View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.tone, (ViewGroup) frameLayout, false);
        this.i = inflate;
        this.j = (TextView) inflate.findViewById(R.id.tvToneSeekbarValue);
        this.k = (TextView) inflate.findViewById(R.id.tvToneColorTitle);
        Button button = (Button) inflate.findViewById(R.id.btnShadows);
        button.setSelected(true);
        button.setOnClickListener(new com.vk.im.video.d(this, 14));
        this.l = button;
        Button button2 = (Button) inflate.findViewById(R.id.btnLights);
        button2.setOnClickListener(new pi6(this, 6));
        this.m = button2;
        this.n = (ViewGroup) inflate.findViewById(R.id.toneSeekbarWrapper);
        DashedSeekBar dashedSeekBar = (DashedSeekBar) inflate.findViewById(R.id.toneSeekbar);
        dashedSeekBar.setOnSeekBarChangeListener(new mcc0(this));
        this.o = dashedSeekBar;
        k0g k0gVar = new k0g(R.layout.item_editor_hsl_color);
        this.p = k0gVar;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rvColors);
        k0gVar.submitList(l);
        k0gVar.d = new hy0(1, this, h.class, "selectColor", "selectColor(I)V", 0, 10);
        recyclerView.setAdapter(k0gVar);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        c(true);
    }

    public static a b(com.vk.photo.editor.ivm.d dVar) {
        g5p g5pVar = ((EditorState) dVar.b.b.getValue()).b.get(k6g.a);
        if (g5pVar instanceof a) {
            return (a) g5pVar;
        }
        return null;
    }

    public final void a() {
        boolean b;
        a b2 = b(this.a.d());
        if (b2 == null || this.d == (b = b2.k.b())) {
            return;
        }
        this.d = b;
        mmf mmfVar = this.c;
        if (mmfVar != null) {
            mmfVar.invoke(Boolean.valueOf(b));
        }
    }

    public final void c(boolean z) {
        f0g a;
        this.g = z;
        this.l.setSelected(z);
        this.m.setSelected(!z);
        a b = b(this.a.d());
        if (b == null) {
            b = new a(0);
        }
        a.b bVar = b.k;
        List<f0g> list = z ? this.e : this.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                this.h = arrayList;
                this.p.submitList(arrayList);
                boolean z2 = !z ? bVar.b == 0 : bVar.a == 0;
                if (z2) {
                    str = this.b.getContext().getString(this.h.get((z ? bVar.a : bVar.b) - 1).c.a);
                }
                String valueOf = String.valueOf(an10.b(sa30.E(z ? bVar.c : bVar.d, new k9x(0, 1, 1), new k9x(0, 100, 1))));
                this.k.setText(str);
                this.j.setText(valueOf);
                this.n.setAlpha(z2 ? 1.0f : 0.4f);
                DashedSeekBar dashedSeekBar = this.o;
                dashedSeekBar.setEnabled(z2);
                dashedSeekBar.a(z ? sa30.E(bVar.c, new k9x(0, 1, 1), new k9x(0, 100, 1)) : sa30.E(bVar.d, new k9x(0, 1, 1), new k9x(0, 100, 1)), true);
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            f0g f0gVar = (f0g) next;
            if (z) {
                a = f0g.a(f0gVar, bVar.a == i2);
            } else {
                a = f0g.a(f0gVar, bVar.b == i2);
            }
            arrayList.add(a);
            i = i2;
        }
    }
}
