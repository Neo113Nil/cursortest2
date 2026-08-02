package com.vk.clips.design.view.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.hsl.HslRecyclerView;
import com.vk.clips.design.view.hsl.HslSeekView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.b1a;
import xsna.bp7;
import xsna.hxl;
import xsna.izs;
import xsna.j5g;
import xsna.jp5;
import xsna.s3q0;
import xsna.wgv;

/* compiled from: HslView.kt */
/* loaded from: classes16.dex */
public class HslView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final HslRecyclerView t;
    public final HslSeekView u;
    public final HslSeekView v;
    public final HslSeekView w;
    public izs<? super wgv, s3q0> x;

    public HslView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_hsl, this);
        HslRecyclerView hslRecyclerView = (HslRecyclerView) findViewById(R.id.hsl_recycler);
        this.t = hslRecyclerView;
        hslRecyclerView.setSelectedListener(new hxl(this, 11));
        this.u = (HslSeekView) findViewById(R.id.hue);
        this.v = (HslSeekView) findViewById(R.id.saturation);
        this.w = (HslSeekView) findViewById(R.id.brightness);
    }

    public final void P4(wgv wgvVar) {
        float f = wgvVar.c;
        HslSeekView hslSeekView = this.u;
        hslSeekView.c(f);
        hslSeekView.setOnSeekListener(new bp7(16, this, wgvVar));
        float f2 = wgvVar.d;
        HslSeekView hslSeekView2 = this.v;
        hslSeekView2.c(f2);
        hslSeekView2.setOnSeekListener(new jp5(13, this, wgvVar));
        float f3 = wgvVar.e;
        HslSeekView hslSeekView3 = this.w;
        hslSeekView3.c(f3);
        hslSeekView3.setOnSeekListener(new b1a(19, this, wgvVar));
    }

    public final izs<wgv, s3q0> getListener() {
        return this.x;
    }

    public final void setHslItems(List<wgv> list) {
        this.t.setHslItems(list);
        P4((wgv) j5g.Y(list));
    }

    public final void setListener(izs<? super wgv, s3q0> izsVar) {
        this.x = izsVar;
    }
}
