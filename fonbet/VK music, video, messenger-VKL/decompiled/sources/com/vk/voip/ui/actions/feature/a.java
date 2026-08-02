package com.vk.voip.ui.actions.feature;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: VoipActionsFeatureDataProvider.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Boolean, VoipActionsFeatureState.UserType> {
    @Override // xsna.izs
    public final VoipActionsFeatureState.UserType invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        ((b) this.receiver).getClass();
        return booleanValue ? VoipActionsFeatureState.UserType.AUTHORIZED : VoipActionsFeatureState.UserType.ANONYM;
    }
}
