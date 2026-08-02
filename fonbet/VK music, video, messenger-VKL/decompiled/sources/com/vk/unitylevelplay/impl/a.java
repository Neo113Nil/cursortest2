package com.vk.unitylevelplay.impl;

import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.vk.unitylevelplay.impl.UnityLevelPlayFeatureImpl;
import xsna.f7c;

/* compiled from: UnityLevelPlayFeatureImpl.kt */
/* loaded from: classes6.dex */
public final class a implements LevelPlayInitListener {
    public final /* synthetic */ UnityLevelPlayFeatureImpl a;
    public final /* synthetic */ f7c b;

    public a(UnityLevelPlayFeatureImpl unityLevelPlayFeatureImpl, f7c f7cVar) {
        this.a = unityLevelPlayFeatureImpl;
        this.b = f7cVar;
    }

    @Override // com.unity3d.mediation.LevelPlayInitListener
    public final void onInitFailed(LevelPlayInitError levelPlayInitError) {
        this.a.d = UnityLevelPlayFeatureImpl.InitializationState.NOT_INITIALIZED;
        this.b.invoke(Integer.valueOf(levelPlayInitError.getErrorCode()), "An error occurred during UnityLevelPlay initialization: " + levelPlayInitError.getErrorMessage());
        this.a.c.e("Code: " + levelPlayInitError.getErrorCode() + ", message: " + levelPlayInitError.getErrorMessage(), false, null, null);
    }

    @Override // com.unity3d.mediation.LevelPlayInitListener
    public final void onInitSuccess(LevelPlayConfiguration levelPlayConfiguration) {
        this.a.d = UnityLevelPlayFeatureImpl.InitializationState.INITIALIZED;
        this.a.c.e(null, true, null, null);
    }
}
