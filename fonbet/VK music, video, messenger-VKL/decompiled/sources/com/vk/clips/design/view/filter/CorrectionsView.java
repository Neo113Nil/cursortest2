package com.vk.clips.design.view.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.clips.design.view.seek.WheelSeekView;
import com.vk.editor.filters.correction.entity.CorrectionType;
import com.vkontakte.android.R;
import java.util.List;
import xsna.izs;
import xsna.j5g;
import xsna.jl4;
import xsna.lwj;
import xsna.ma;
import xsna.okx0;
import xsna.pkx0;
import xsna.qpj;
import xsna.s3q0;
import xsna.y9k0;

/* compiled from: CorrectionsView.kt */
/* loaded from: classes16.dex */
public class CorrectionsView extends ConstraintLayout {
    public final CorrectionsRecyclerView t;
    public final WheelSeekView u;
    public final okx0 v;
    public izs<? super lwj, s3q0> w;

    /* compiled from: CorrectionsView.kt */
    public final class a implements y9k0.d {
        public a() {
        }

        @Override // xsna.y9k0.d
        public final void a() {
            CorrectionsView.this.u.setEnabled(true);
        }

        @Override // xsna.y9k0.d
        public final void b() {
            WheelSeekView wheelSeekView = CorrectionsView.this.u;
            pkx0 pkx0Var = wheelSeekView.w;
            pkx0Var.b.forceFinished(true);
            pkx0Var.b(pkx0.a.IDLE);
            wheelSeekView.setEnabled(false);
        }
    }

    public CorrectionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = new okx0();
        LayoutInflater.from(context).inflate(R.layout.layout_corrections, this);
        CorrectionsRecyclerView correctionsRecyclerView = (CorrectionsRecyclerView) findViewById(R.id.correction_recycler);
        this.t = correctionsRecyclerView;
        correctionsRecyclerView.setSelectedListener(new qpj(this, 1));
        this.u = (WheelSeekView) findViewById(R.id.intensity);
        correctionsRecyclerView.setSnapStateScrollListener(new a());
    }

    public static s3q0 P4(CorrectionsView correctionsView, lwj lwjVar) {
        correctionsView.setCurrentCorrection(lwjVar);
        return s3q0.a;
    }

    private final void setCurrentCorrection(lwj lwjVar) {
        String string = getContext().getString(lwjVar.a.m());
        WheelSeekView wheelSeekView = this.u;
        wheelSeekView.setLabel(string);
        pkx0 pkx0Var = wheelSeekView.w;
        pkx0Var.b.forceFinished(true);
        pkx0Var.b(pkx0.a.IDLE);
        wheelSeekView.setValue(lwjVar.b);
        if (lwjVar.a.l() == CorrectionType.IntensityMode.FromCenter) {
            wheelSeekView.setValueMapper(this.v);
        } else {
            wheelSeekView.setValueMapper(null);
        }
        wheelSeekView.setOnSeekListener(new ma(8, this, lwjVar));
        wheelSeekView.setOnStartSeekListener(new jl4(6, this, lwjVar));
    }

    public final izs<lwj, s3q0> getListener() {
        return this.w;
    }

    public final void setCorrectionItems(List<lwj> list) {
        this.t.setCorrectionItems(list);
        setCurrentCorrection((lwj) j5g.Y(list));
    }

    public final void setCursorScrollingColor(int i) {
        this.u.setCursorScrollingColor(i);
    }

    public final void setListener(izs<? super lwj, s3q0> izsVar) {
        this.w = izsVar;
    }
}
