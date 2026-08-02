package com.vk.clips.coauthors.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.b7m;
import xsna.de4;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.ind;
import xsna.nwy;
import xsna.qcy;
import xsna.qmd;

/* compiled from: ClipsCoauthorsInternalComponent.kt */
/* loaded from: classes16.dex */
public final class ClipsCoauthorsInternalComponent implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsCoauthorsInternalComponent.class, "repository", "getRepository$impl_release()Lcom/vk/clips/coauthors/domain/repository/ClipsCoauthorsRepository;", 0), fp.c(0, ClipsCoauthorsInternalComponent.class, "snackbarLauncher", "getSnackbarLauncher$impl_release()Lcom/vk/clips/coauthors/uiutils/ClipsCoauthorsSnackbarLauncher;", fpf0.a)};
    public final nwy a = new nwy(new a44(6));
    public final nwy b = new nwy(new de4(6));

    /* compiled from: ClipsCoauthorsInternalComponent.kt */
    public static final class a implements b7m<ClipsCoauthorsInternalComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsCoauthorsInternalComponent();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qmd Df() {
        qcy<Object> qcyVar = c[0];
        return (qmd) this.a.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ind Ef() {
        qcy<Object> qcyVar = c[1];
        return (ind) this.b.c();
    }
}
