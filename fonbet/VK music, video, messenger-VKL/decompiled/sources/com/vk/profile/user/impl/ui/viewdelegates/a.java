package com.vk.profile.user.impl.ui.viewdelegates;

import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import xsna.gdk0;
import xsna.hdk0;
import xsna.izs;
import xsna.jeq0;
import xsna.mcr0;

/* compiled from: SnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public final class a implements izs<SnowballsCoverView.b, t<? extends SnowballsCoverView.a>> {
    public final /* synthetic */ SnowballsCoverHolder b;

    public a(SnowballsCoverHolder snowballsCoverHolder) {
        this.b = snowballsCoverHolder;
    }

    @Override // xsna.izs
    public final t<? extends SnowballsCoverView.a> invoke(SnowballsCoverView.b bVar) {
        SnowballsCoverView.b bVar2 = bVar;
        return new c0(mcr0.h(jeq0.g(bVar2.b.a)).r0(io.reactivex.rxjava3.schedulers.a.b()).U(new SnowballsCoverHolder.c(new gdk0(bVar2))), new SnowballsCoverHolder.b(new hdk0(this.b)), io.reactivex.rxjava3.internal.functions.a.c);
    }
}
