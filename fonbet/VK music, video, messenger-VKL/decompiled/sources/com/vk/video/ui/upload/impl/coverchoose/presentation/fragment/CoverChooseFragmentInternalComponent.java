package com.vk.video.ui.upload.impl.coverchoose.presentation.fragment;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.i21;
import xsna.kk1;
import xsna.nwy;
import xsna.qcy;
import xsna.v0k;
import xsna.wnh;

/* compiled from: CoverChooseFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class CoverChooseFragmentInternalComponent implements DiScopedComponent<v0k> {
    public static final a e;
    public static final /* synthetic */ qcy<Object>[] f;
    public final v0k a;
    public final nwy b = new nwy(new kk1(5));
    public final nwy c = new nwy(new wnh(this, 2));
    public final nwy d = new nwy(new i21(7));

    /* compiled from: CoverChooseFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CoverChooseFragmentInternalComponent.class, "fileStorage", "getFileStorage()Lcom/vk/video/ui/upload/impl/coverchoose/domain/repository/CoverChooseFileStorage;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, CoverChooseFragmentInternalComponent.class, "interactor", "getInteractor()Lcom/vk/video/ui/upload/impl/coverchoose/domain/interactor/CoverChooseInteractor;", hpf0Var), ep.a(0, CoverChooseFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/upload/impl/coverchoose/presentation/feature/store/CoverChooseViewStateMapper;", hpf0Var)};
        e = new a();
    }

    public CoverChooseFragmentInternalComponent(v0k v0kVar) {
        this.a = v0kVar;
    }
}
