package com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.QualityChooserViewState;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.kar;
import xsna.rju0;
import xsna.tlo0;

/* compiled from: QualityViewHolderAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends RecyclerView.Adapter<a> {
    public final kar c;
    public final ArrayList d;
    public int e;

    /* compiled from: QualityViewHolderAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final rju0 l;

        public a(rju0 rju0Var) {
            super(rju0Var);
            this.l = rju0Var;
        }
    }

    public b(kar karVar, ArrayList arrayList) {
        this.c = karVar;
        this.d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, final int i) {
        int i2;
        final a aVar2 = aVar;
        rju0 rju0Var = aVar2.l;
        rju0Var.setListener(new rju0.a() { // from class: xsna.ipe0
            @Override // xsna.rju0.a
            public final void b(boolean z) {
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.b bVar;
                int i3;
                b.a aVar3 = b.a.this;
                aVar3.l.setClickable(!z);
                if (!z || i == (i3 = (bVar = this).e)) {
                    return;
                }
                bVar.e = aVar3.getBindingAdapterPosition();
                bVar.notifyItemChanged(i3);
            }
        });
        rju0Var.setChecked(this.e == i);
        QualityChooserViewState.QualityOption qualityOption = (QualityChooserViewState.QualityOption) this.d.get(i);
        tlo0.a aVar3 = tlo0.Companion;
        Context context = rju0Var.getContext();
        QualityChooserViewState.QualityOption.QualityOptionType qualityOptionType = qualityOption.a;
        long j = qualityOption.b;
        qualityOptionType.getClass();
        int i3 = QualityChooserViewState.QualityOption.QualityOptionType.a.$EnumSwitchMapping$0[qualityOptionType.ordinal()];
        if (i3 == 1) {
            i2 = R.string.quality_high;
        } else if (i3 == 2) {
            i2 = R.string.quality_avg;
        } else if (i3 == 3) {
            i2 = R.string.quality_low;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.quality_audio_only;
        }
        String string = context.getString(i2);
        aVar3.getClass();
        rju0Var.setTitle(new tlo0.h(string));
        long j2 = qualityOption.c;
        kar karVar = this.c;
        if (j2 > 0) {
            rju0Var.setSubtitle(new tlo0.h(karVar.a(j2).a));
        } else if (j > 0) {
            rju0Var.setSubtitle(new tlo0.h(rju0Var.getContext().getString(R.string.size_approximate, karVar.a(j).a)));
        } else {
            rju0Var.setSubtitle(new tlo0.h(""));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        rju0 rju0Var = new rju0(viewGroup.getContext());
        rju0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(rju0Var);
    }
}
