package com.vk.camera.editor.stories.impl.di;

import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b2m0;
import xsna.c8m;
import xsna.dei0;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.g9m0;
import xsna.hpf0;
import xsna.iml0;
import xsna.nh3;
import xsna.nwy;
import xsna.ofc0;
import xsna.pwj0;
import xsna.q1m0;
import xsna.qcy;
import xsna.rjg0;
import xsna.tj2;
import xsna.tsk0;
import xsna.u1m0;
import xsna.x750;
import xsna.y1m0;

/* compiled from: StoryEditorComponentImpl.kt */
/* loaded from: classes16.dex */
public final class StoryEditorComponentImpl implements StoryEditorComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final nwy a;
    public final nwy c;
    public final nwy e;
    public final ewy f;
    public final nwy g;
    public final nwy b = new nwy(new tj2(23));
    public final nwy d = new nwy(new iml0(this, 1));

    /* compiled from: StoryEditorComponentImpl.kt */
    public static final class a implements c8m<StoryEditorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoryEditorComponentImpl((CommonEditorComponent) g8mVar.a(fpf0.a(CommonEditorComponent.class)), (StoryEditorExtDepsComponent) g8mVar.a(fpf0.a(StoryEditorExtDepsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StoryEditorComponentImpl.class, "authBridge", "getAuthBridge()Lcom/vk/editor/domain/SimpleAuthBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, StoryEditorComponentImpl.class, "storyEditorStateStore", "getStoryEditorStateStore()Lcom/vk/camera/editor/stories/api/base/StoryEditorStateStore;", hpf0Var), ep.a(0, StoryEditorComponentImpl.class, "cameraEditorDeps", "getCameraEditorDeps()Lcom/vk/camera/editor/stories/api/base/CameraEditorDeps;", hpf0Var), ep.a(0, StoryEditorComponentImpl.class, "storyEditorProvider", "getStoryEditorProvider()Lcom/vk/camera/editor/stories/api/base/StoryEditorProvider;", hpf0Var), ep.a(0, StoryEditorComponentImpl.class, "storyMusicDialogProvider", "getStoryMusicDialogProvider()Lcom/vk/camera/editor/stories/api/clickable/dialogs/music/StoryMusicDialogProvider;", hpf0Var), ep.a(0, StoryEditorComponentImpl.class, "storyEditorUtils", "getStoryEditorUtils()Lcom/vk/camera/editor/stories/api/util/StoryEditorUtils;", hpf0Var), ep.a(0, StoryEditorComponentImpl.class, "storyEditorRouter", "getStoryEditorRouter()Lcom/vk/camera/editor/stories/api/util/StoryEditorRouter;", hpf0Var), ep.a(0, StoryEditorComponentImpl.class, "storyPrivacyController", "getStoryPrivacyController()Lcom/vk/camera/editor/stories/api/base/privacy/StoryPrivacyController;", hpf0Var)};
    }

    public StoryEditorComponentImpl(CommonEditorComponent commonEditorComponent, StoryEditorExtDepsComponent storyEditorExtDepsComponent) {
        this.a = new nwy(new tsk0(storyEditorExtDepsComponent, 5));
        this.c = new nwy(new dei0(commonEditorComponent, 10));
        new nwy(new ofc0(commonEditorComponent, 12));
        this.e = new nwy(new x750(this, 28));
        this.f = new ewy(new rjg0(3));
        this.g = new nwy(new nh3(29, this, storyEditorExtDepsComponent));
    }

    @Override // com.vk.camera.editor.stories.api.di.StoryEditorComponent
    public final u1m0 G3() {
        qcy<Object> qcyVar = h[6];
        return (u1m0) this.f.c();
    }

    @Override // com.vk.camera.editor.stories.api.di.StoryEditorComponent
    public final b2m0 H8() {
        qcy<Object> qcyVar = h[5];
        return (b2m0) this.e.c();
    }

    @Override // com.vk.camera.editor.stories.api.di.StoryEditorComponent
    public final q1m0 Sb() {
        qcy<Object> qcyVar = h[3];
        return (q1m0) this.d.c();
    }

    @Override // com.vk.camera.editor.stories.api.di.StoryEditorComponent
    public final g9m0 ff() {
        qcy<Object> qcyVar = h[7];
        return (g9m0) this.g.c();
    }

    @Override // com.vk.camera.editor.stories.api.di.StoryEditorComponent
    public final y1m0 n3() {
        qcy<Object> qcyVar = h[1];
        return (y1m0) this.b.c();
    }
}
