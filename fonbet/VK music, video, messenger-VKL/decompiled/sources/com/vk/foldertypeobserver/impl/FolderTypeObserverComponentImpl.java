package com.vk.foldertypeobserver.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.foldertypeobserver.api.FolderTypeObserverComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g0s;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.sk4;

/* compiled from: FolderTypeObserverComponentImpl.kt */
/* loaded from: classes18.dex */
public final class FolderTypeObserverComponentImpl implements FolderTypeObserverComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final ewy a = new ewy(new sk4(12));

    /* compiled from: FolderTypeObserverComponentImpl.kt */
    public static final class a implements c8m<FolderTypeObserverComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new FolderTypeObserverComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FolderTypeObserverComponentImpl.class, "folderTypeObserver", "getFolderTypeObserver()Lcom/vk/foldertypeobserver/api/FolderTypeObserver;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.foldertypeobserver.api.FolderTypeObserverComponent
    public final g0s He() {
        qcy<Object> qcyVar = b[0];
        return (g0s) this.a.c();
    }
}
