package com.vk.clips.design.view.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.seek.WheelSeekView;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.movika.sdk.android.defaultplayer.interactive.b;
import com.vkontakte.android.R;
import defpackage.o;
import xsna.frg;
import xsna.g53;
import xsna.i5;
import xsna.km1;
import xsna.pkx0;
import xsna.s3q0;
import xsna.tcr;
import xsna.vi0;
import xsna.wzs;
import xsna.y9k0;

/* compiled from: FiltersView.kt */
/* loaded from: classes16.dex */
public class FiltersView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public final FiltersRecyclerView t;
    public final WheelSeekView u;
    public tcr v;
    public wzs<? super FilterType, ? super Float, s3q0> w;

    /* compiled from: FiltersView.kt */
    public final class a implements y9k0.d {
        public a() {
        }

        @Override // xsna.y9k0.d
        public final void a() {
            FiltersView filtersView = FiltersView.this;
            tcr tcrVar = filtersView.v;
            if ((tcrVar != null ? tcrVar.a : null) != FilterType.NONE) {
                filtersView.u.setEnabled(true);
            }
        }

        @Override // xsna.y9k0.d
        public final void b() {
            WheelSeekView wheelSeekView = FiltersView.this.u;
            pkx0 pkx0Var = wheelSeekView.w;
            pkx0Var.b.forceFinished(true);
            pkx0Var.b(pkx0.a.IDLE);
            wheelSeekView.setEnabled(false);
        }
    }

    public FiltersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.layout_filters, this);
        this.u = (WheelSeekView) findViewById(R.id.intensity);
        FiltersRecyclerView filtersRecyclerView = (FiltersRecyclerView) findViewById(R.id.filters_recycler);
        this.t = filtersRecyclerView;
        filtersRecyclerView.setSelectedListener(new frg(this, 11));
        filtersRecyclerView.setSnapStateScrollListener(new a());
    }

    public final void P4(tcr tcrVar) {
        this.v = tcrVar;
        String str = tcrVar.c;
        WheelSeekView wheelSeekView = this.u;
        wheelSeekView.setLabel(str);
        pkx0 pkx0Var = wheelSeekView.w;
        pkx0Var.b.forceFinished(true);
        pkx0Var.b(pkx0.a.IDLE);
        if (tcrVar.a == FilterType.NONE) {
            wheelSeekView.setValue(1.0f);
            wheelSeekView.setEnabled(false);
            wheelSeekView.setOnStartSeekListener(new vi0(19));
            wheelSeekView.setOnEndSeekListener(new b(15));
            wheelSeekView.setOnSeekListener(new g53(19));
            return;
        }
        wheelSeekView.setValue(tcrVar.f);
        wheelSeekView.setEnabled(true);
        wheelSeekView.setOnSeekListener(new o(18, this, tcrVar));
        wheelSeekView.setOnStartSeekListener(new km1(10, this, tcrVar));
        wheelSeekView.setOnEndSeekListener(new i5(13, this, tcrVar));
        wheelSeekView.setEnabled(true);
    }

    public final wzs<FilterType, Float, s3q0> getListener() {
        return this.w;
    }

    public final void setCursorScrollingColor(int i) {
        this.u.setCursorScrollingColor(i);
    }

    public final void setListener(wzs<? super FilterType, ? super Float, s3q0> wzsVar) {
        this.w = wzsVar;
    }
}
