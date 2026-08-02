package com.vk.clips.precache.impl.di;

import com.vk.clips.precache.api.di.ClipsPrecacheComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ca;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hwe;
import xsna.nwy;
import xsna.oie;
import xsna.pwj0;
import xsna.qcy;
import xsna.w40;
import xsna.wie;

/* compiled from: ClipsPrecacheComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsPrecacheComponentImpl implements ClipsPrecacheComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(ClipsPrecacheComponentImpl.class, "clipsFeedItemsCache", "getClipsFeedItemsCache()Lcom/vk/clips/precache/api/ClipsItemsCache;", 0), fp.c(0, ClipsPrecacheComponentImpl.class, "clipItemsPrefetcherDefault", "getClipItemsPrefetcherDefault()Lcom/vk/clips/precache/api/di/ClipsItemsPrefetcher;", fpf0.a)};
    public final hwe a;
    public final AppContextDiComponent b;
    public final nwy c = new nwy(new w40(this, 21));
    public final nwy d = new nwy(new ca(this, 23));

    /* compiled from: ClipsPrecacheComponentImpl.kt */
    public static abstract class a implements c8m<ClipsPrecacheComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsPrecacheComponentImpl(new hwe(g8mVar), (AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    public ClipsPrecacheComponentImpl(hwe hweVar, AppContextDiComponent appContextDiComponent) {
        this.a = hweVar;
        this.b = appContextDiComponent;
    }

    @Override // com.vk.clips.precache.api.di.ClipsPrecacheComponent
    public final oie A2() {
        qcy<Object> qcyVar = e[0];
        return (oie) this.c.c();
    }

    @Override // com.vk.clips.precache.api.di.ClipsPrecacheComponent
    public final wie W1() {
        qcy<Object> qcyVar = e[1];
        return (wie) this.d.c();
    }
}
