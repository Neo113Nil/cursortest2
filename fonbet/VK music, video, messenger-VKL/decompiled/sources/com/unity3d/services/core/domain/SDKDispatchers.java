package com.unity3d.services.core.domain;

import xsna.bdn;
import xsna.ie00;
import xsna.ovj;
import xsna.wgl;

/* compiled from: SDKDispatchers.kt */
/* loaded from: classes14.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    /* renamed from: default, reason: not valid java name */
    private final ovj f0default;

    /* renamed from: io, reason: collision with root package name */
    private final ovj f58io;
    private final ovj main;

    public SDKDispatchers() {
        bdn bdnVar = bdn.a;
        this.f58io = wgl.c;
        this.f0default = bdn.b;
        this.main = ie00.a;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public ovj getDefault() {
        return this.f0default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public ovj getIo() {
        return this.f58io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    public ovj getMain() {
        return this.main;
    }
}
