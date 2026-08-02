package com.vk.video.ui.upload.impl.attachedclips.presentation.fragment;

import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.model.props.c;
import com.vk.movika.sdk.base.model.props.d;
import com.vk.movika.tools.controls.seekbar.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c54;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: AttachedClipsFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class AttachedClipsFragmentInternalComponent implements DiScopedComponent<c54> {
    public static final a e;
    public static final /* synthetic */ qcy<Object>[] f;
    public final c54 a;
    public final nwy b = new nwy(new c(5));
    public final nwy c = new nwy(new d(4));
    public final nwy d = new nwy(new n(4));

    /* compiled from: AttachedClipsFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AttachedClipsFragmentInternalComponent.class, "attachedClipsNetworkApi", "getAttachedClipsNetworkApi()Lcom/vk/video/ui/upload/impl/attachedclips/domain/repository/AttachedClipsNetworkApi;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, AttachedClipsFragmentInternalComponent.class, "networkManager", "getNetworkManager()Lcom/vk/core/utils/newtork/NetworkManager;", hpf0Var), ep.a(0, AttachedClipsFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/upload/impl/attachedclips/presentation/feature/store/AttachedClipsViewStateMapper;", hpf0Var)};
        e = new a();
    }

    public AttachedClipsFragmentInternalComponent(c54 c54Var) {
        this.a = c54Var;
    }
}
