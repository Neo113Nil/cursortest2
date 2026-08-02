package com.vk.im.ui.components.attaches_history.attaches.model.audio;

import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.db;
import xsna.fq;
import xsna.izs;
import xsna.kc4;
import xsna.l56;
import xsna.ot;
import xsna.v20;

/* compiled from: AudioAttachesModel.kt */
/* loaded from: classes2.dex */
public final class a extends l56<AudioAttachListItem> {
    public final y a;
    public final d<PageLoadingState<AudioAttachListItem>> b = d.O0(new AudioAttachesState(EmptyList.b, false, false, false));
    public final db c = new db(8);

    public a(y yVar) {
        this.a = yVar;
    }

    @Override // xsna.t990
    public final q<List<AudioAttachListItem>> a() {
        return q.m(this.b.U(new fq(2, new ot(5))), this.a, new v20(new kc4(this, 0), 4));
    }

    @Override // xsna.l56
    public final izs<HistoryAttach, AudioAttachListItem> b() {
        return this.c;
    }

    @Override // xsna.l56
    public final d<PageLoadingState<AudioAttachListItem>> c() {
        return this.b;
    }

    @Override // xsna.t990
    public final PageLoadingState getState() {
        return (AudioAttachesState) this.b.P0();
    }
}
