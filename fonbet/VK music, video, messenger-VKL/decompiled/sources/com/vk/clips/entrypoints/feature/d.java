package com.vk.clips.entrypoints.feature;

import com.vk.clips.entrypoints.feature.ClipsEntryPointsState;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import com.vk.clips.entrypoints.ui.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: ClipsEntryPointsReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements izs<ClipsEntryPointsState.a, ClipsEntryPointsViewState.b> {
    @Override // xsna.izs
    public final ClipsEntryPointsViewState.b invoke(ClipsEntryPointsState.a aVar) {
        ClipsEntryPointsViewState.UIScreenMode uIScreenMode;
        ClipsEntryPointsState.a aVar2 = aVar;
        ((com.vk.clips.entrypoints.ui.c) this.receiver).getClass();
        int i = c.a.$EnumSwitchMapping$0[aVar2.b.ordinal()];
        if (i == 1) {
            uIScreenMode = ClipsEntryPointsViewState.UIScreenMode.PHOTO_PICKER;
        } else if (i == 2) {
            uIScreenMode = ClipsEntryPointsViewState.UIScreenMode.DRAFTS;
        } else if (i == 3) {
            uIScreenMode = ClipsEntryPointsViewState.UIScreenMode.TEMPLATES;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            uIScreenMode = ClipsEntryPointsViewState.UIScreenMode.TRENDS;
        }
        return new ClipsEntryPointsViewState.b(uIScreenMode, aVar2.c, aVar2.e, aVar2.f, aVar2.g);
    }
}
