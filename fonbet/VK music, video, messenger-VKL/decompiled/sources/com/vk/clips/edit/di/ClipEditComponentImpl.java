package com.vk.clips.edit.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.mb3;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qwe;
import xsna.rld;
import xsna.xu2;

/* compiled from: ClipEditComponentImpl.kt */
/* loaded from: classes.dex */
public final class ClipEditComponentImpl implements ClipEditComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipEditComponentImpl.class, "privacyProvider", "getPrivacyProvider()Lcom/vk/clips/edit/privacy/ClipsPrivacy;", 0), fp.c(0, ClipEditComponentImpl.class, "clipsChoosePreviewNavigator", "getClipsChoosePreviewNavigator()Lcom/vk/clips/edit/editor/ClipsChoosePreviewNavigator;", fpf0.a)};
    public final nwy a = new nwy(new xu2(3));
    public final nwy b = new nwy(new mb3(2));

    /* compiled from: ClipEditComponentImpl.kt */
    public static final class a implements c8m<ClipEditComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipEditComponentImpl();
        }
    }

    @Override // com.vk.clips.edit.di.ClipEditComponent
    public final qwe d6() {
        qcy<Object> qcyVar = c[0];
        return (qwe) this.a.c();
    }

    @Override // com.vk.clips.edit.di.ClipEditComponent
    public final rld u4() {
        qcy<Object> qcyVar = c[1];
        return (rld) this.b.c();
    }
}
