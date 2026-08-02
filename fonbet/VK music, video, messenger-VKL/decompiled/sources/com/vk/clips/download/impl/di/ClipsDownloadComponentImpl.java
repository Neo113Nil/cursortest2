package com.vk.clips.download.impl.di;

import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hrc;
import xsna.nwy;
import xsna.pr0;
import xsna.pwj0;
import xsna.qcy;
import xsna.rrd;
import xsna.x0;

/* compiled from: ClipsDownloadComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsDownloadComponentImpl implements ClipsDownloadComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsDownloadComponentImpl.class, "downloadability", "getDownloadability()Lcom/vk/clips/download/api/job/ClipsDownloadability;", 0), fp.c(0, ClipsDownloadComponentImpl.class, "downloader", "getDownloader()Lcom/vk/clips/download/api/job/ClipDownloader;", fpf0.a)};
    public final nwy a = new nwy(new pr0(7));
    public final nwy b = new nwy(new x0(5));

    /* compiled from: ClipsDownloadComponentImpl.kt */
    public static final class a implements c8m<ClipsDownloadComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsDownloadComponentImpl();
        }
    }

    @Override // com.vk.clips.download.api.di.ClipsDownloadComponent
    public final hrc Gc() {
        qcy<Object> qcyVar = c[1];
        return (hrc) this.b.c();
    }

    @Override // com.vk.clips.download.api.di.ClipsDownloadComponent
    public final rrd Q5() {
        qcy<Object> qcyVar = c[0];
        return (rrd) this.a.c();
    }
}
