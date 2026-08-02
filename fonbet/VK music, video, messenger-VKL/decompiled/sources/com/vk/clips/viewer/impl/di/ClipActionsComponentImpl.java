package com.vk.clips.viewer.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.g5;
import xsna.nwy;
import xsna.qcy;
import xsna.xlc;

/* compiled from: ClipActionsComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipActionsComponentImpl implements ClipActionsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final ClipEditComponent a;
    public final BridgeComponent b;
    public final ClipViewerEditSdkComponent c;
    public final ClipsPlaylistsComponent d;
    public final UserProfileComponent e;
    public final nwy f = new nwy(new g5(this, 13));

    /* compiled from: ClipActionsComponentImpl.kt */
    public static final class a implements b7m<ClipActionsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipActionsComponentImpl((ClipEditComponent) e7mVar.a(fpf0.a(ClipEditComponent.class)), (BridgeComponent) e7mVar.a(fpf0.a(BridgeComponent.class)), (ClipViewerEditSdkComponent) e7mVar.b(fpf0.a(ClipViewerEditSdkComponent.class)), (ClipsPlaylistsComponent) e7mVar.b(fpf0.a(ClipsPlaylistsComponent.class)), (UserProfileComponent) e7mVar.b(fpf0.a(UserProfileComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipActionsComponentImpl.class, "clipActionsHandler", "getClipActionsHandler()Lcom/vk/clips/viewer/api/feed/helper/ClipActionsHandler;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public ClipActionsComponentImpl(ClipEditComponent clipEditComponent, BridgeComponent bridgeComponent, ClipViewerEditSdkComponent clipViewerEditSdkComponent, ClipsPlaylistsComponent clipsPlaylistsComponent, UserProfileComponent userProfileComponent) {
        this.a = clipEditComponent;
        this.b = bridgeComponent;
        this.c = clipViewerEditSdkComponent;
        this.d = clipsPlaylistsComponent;
        this.e = userProfileComponent;
    }

    @Override // com.vk.clips.viewer.api.di.ClipActionsComponent
    public final xlc q5() {
        qcy<Object> qcyVar = g[0];
        return (xlc) this.f.c();
    }
}
