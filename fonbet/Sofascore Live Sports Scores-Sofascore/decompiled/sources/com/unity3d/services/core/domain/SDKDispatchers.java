package com.unity3d.services.core.domain;

import com.ironsource.U3;
import com.unity3d.ads.BuildConfig;
import defpackage.au3;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.rob;
import defpackage.z45;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/domain/SDKDispatchers;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "<init>", "()V", "Lau3;", "io", "Lau3;", "getIo", "()Lau3;", BuildConfig.FLAVOR, "getDefault", U3.i.Z, "getMain", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SDKDispatchers implements ISDKDispatchers {

    @NotNull
    private final au3 default;

    @NotNull
    private final au3 io;

    @NotNull
    private final au3 main;

    public SDKDispatchers() {
        hs4 hs4Var = z45.a;
        this.io = hq4.c;
        this.default = z45.a;
        this.main = rob.a;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public au3 getDefault() {
        return this.default;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public au3 getIo() {
        return this.io;
    }

    @Override // com.unity3d.services.core.domain.ISDKDispatchers
    @NotNull
    public au3 getMain() {
        return this.main;
    }
}
