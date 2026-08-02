package com.vk.clips.external.nps.impl.di;

import com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent;
import com.vk.di.component.DiScopedComponent;
import defpackage.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bfq;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hfq;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.vv0;

/* compiled from: ClipsExternalNpsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsExternalNpsComponentImpl implements ClipsExternalNpsComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsExternalNpsComponentImpl.class, "conditionManager", "getConditionManager()Lcom/vk/clips/external/nps/api/condition/ExternalNpsConditionManager;", 0), fp.c(0, ClipsExternalNpsComponentImpl.class, "pollLauncher", "getPollLauncher()Lcom/vk/clips/external/nps/api/poll/ExternalNpsPollLauncher;", fpf0.a)};
    public final nwy a = new nwy(new vv0(10));
    public final nwy b = new nwy(new i(this, 25));

    /* compiled from: ClipsExternalNpsComponentImpl.kt */
    public static final class a implements c8m<ClipsExternalNpsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsExternalNpsComponentImpl();
        }
    }

    @Override // com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent
    public final hfq Id() {
        qcy<Object> qcyVar = c[1];
        return (hfq) this.b.c();
    }

    @Override // com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent
    public final bfq Q1() {
        qcy<Object> qcyVar = c[0];
        return (bfq) this.a.c();
    }
}
