package com.vk.clips.editor.templates.impl.di;

import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.d9f;
import xsna.e53;
import xsna.ep;
import xsna.f53;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.t03;
import xsna.v8f;

/* compiled from: ClipsTemplatesEditorComponentBase.kt */
/* loaded from: classes.dex */
public class ClipsTemplatesEditorComponentBase implements ClipsTemplatesEditorComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nwy a = new nwy(new t03(3));
    public final nwy b = new nwy(new e53(3));
    public final nwy c = new nwy(new f53(this, 5));

    /* compiled from: ClipsTemplatesEditorComponentBase.kt */
    public static final class a implements c8m<ClipsTemplatesEditorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsTemplatesEditorComponentBase();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsTemplatesEditorComponentBase.class, "enableDraftsInClips", "getEnableDraftsInClips()Z", 0);
        hpf0 hpf0Var = fpf0.a;
        d = new qcy[]{propertyReference1Impl, fp.c(0, ClipsTemplatesEditorComponentBase.class, "clipsTemplatesNavigator", "getClipsTemplatesNavigator()Lcom/vk/clips/editor/templates/api/main/ClipsTemplatesFlowNavigator;", hpf0Var), ep.a(0, ClipsTemplatesEditorComponentBase.class, "clipsTemplatesEditorProvider", "getClipsTemplatesEditorProvider()Lcom/vk/clips/editor/templates/api/main/ClipsTemplatesEditorProvider;", hpf0Var)};
    }

    @Override // com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent
    public final d9f l4() {
        qcy<Object> qcyVar = d[1];
        return (d9f) this.b.c();
    }

    @Override // com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent
    public final v8f l5() {
        qcy<Object> qcyVar = d[2];
        return (v8f) this.c.c();
    }
}
