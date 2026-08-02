package com.vk.dialogslist.impl.list.adapter;

import androidx.recyclerview.widget.m;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import xsna.epx;
import xsna.hfz;
import xsna.jmm;
import xsna.pgm;
import xsna.zfm;

/* compiled from: DialogsListAdapter.kt */
/* loaded from: classes18.dex */
public final class a extends m.e<hfz> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
        return hfzVar.equals(hfzVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        pgm pgmVar = hfzVar3 instanceof pgm ? (pgm) hfzVar3 : null;
        DialogsListAdapter.ViewType l = pgmVar != null ? pgmVar.l() : null;
        pgm pgmVar2 = hfzVar4 instanceof pgm ? (pgm) hfzVar4 : null;
        return l == (pgmVar2 != null ? pgmVar2.l() : null) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        return ((hfzVar3 instanceof zfm) && (hfzVar4 instanceof zfm)) ? jmm.b.d.a((zfm) hfzVar3, (zfm) hfzVar4) : super.getChangePayload(hfzVar3, hfzVar4);
    }
}
