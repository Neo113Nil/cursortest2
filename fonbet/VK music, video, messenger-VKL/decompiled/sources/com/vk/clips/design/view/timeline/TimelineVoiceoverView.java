package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import xsna.bpn0;
import xsna.ev60;
import xsna.gzs;
import xsna.l850;
import xsna.nid0;
import xsna.ow40;
import xsna.s3q0;
import xsna.tmz;

/* compiled from: TimelineVoiceoverView.kt */
/* loaded from: classes16.dex */
public final class TimelineVoiceoverView extends ConstraintLayout {
    public static final /* synthetic */ int v = 0;
    public final bpn0 t;
    public io.reactivex.rxjava3.disposables.c u;

    public TimelineVoiceoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new bpn0(new nid0(this, 14));
        LayoutInflater.from(context).inflate(R.layout.timeline_voiceover_view, this);
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(context.getColor(R.color.vk_black));
        getRecordButton().setState(ClipsEditorVoiceOverRecordButton.RecordState.IDLE);
    }

    public static s3q0 P4(TimelineVoiceoverView timelineVoiceoverView, Integer num) {
        timelineVoiceoverView.getRecordButton().T4(num.intValue());
        return s3q0.a;
    }

    private final ClipsEditorVoiceOverRecordButton getRecordButton() {
        return (ClipsEditorVoiceOverRecordButton) this.t.getValue();
    }

    public final void Q4(boolean z, boolean z2) {
        getRecordButton().setState(z ? ClipsEditorVoiceOverRecordButton.RecordState.RECORDING : ClipsEditorVoiceOverRecordButton.RecordState.IDLE);
        getRecordButton().setAlpha(z2 ? 1.0f : 0.64f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void setAmpsObservable(q<Integer> qVar) {
        io.reactivex.rxjava3.disposables.c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
        if (qVar == null) {
            return;
        }
        this.u = qVar.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tmz(new l850(this, 21), 20), new ow40(new ev60(14), 20));
    }

    public final void setOnRecordClickListener(gzs<s3q0> gzsVar) {
        getRecordButton().setOnRecordClickListener(gzsVar);
    }
}
