package com.vk.profile.user.impl.ui.viewdelegates;

import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import java.util.List;
import xsna.izs;

/* compiled from: SnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public final class b implements izs<List<? extends SnowballsCoverView.b>, t<? extends SnowballsCoverView.a>> {
    public final /* synthetic */ SnowballsCoverHolder b;

    public b(SnowballsCoverHolder snowballsCoverHolder) {
        this.b = snowballsCoverHolder;
    }

    @Override // xsna.izs
    public final t<? extends SnowballsCoverView.a> invoke(List<? extends SnowballsCoverView.b> list) {
        return q.O(list).L(new SnowballsCoverHolder.c(new a(this.b)), false);
    }
}
