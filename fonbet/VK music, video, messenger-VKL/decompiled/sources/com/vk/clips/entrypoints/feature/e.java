package com.vk.clips.entrypoints.feature;

import com.vk.clips.entrypoints.feature.ClipsEntryPointsState;
import com.vk.clips.entrypoints.feature.c;
import com.vk.clips.entrypoints.params.ClipsMediaPickerTab;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsViewState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.d37;
import xsna.dm50;
import xsna.ol;
import xsna.t1e;

/* compiled from: ClipsEntryPointsReducer.kt */
/* loaded from: classes16.dex */
public final class e extends dm50<ClipsEntryPointsViewState, c, ClipsEntryPointsState> {
    public final com.vk.clips.entrypoints.ui.c d;

    public e(ClipsEntryPointsState.b bVar) {
        super(bVar);
        this.d = new com.vk.clips.entrypoints.ui.c();
    }

    @Override // xsna.dm50
    public final ClipsEntryPointsState c(ClipsEntryPointsState clipsEntryPointsState, c cVar) {
        ClipsEntryPointsState clipsEntryPointsState2 = clipsEntryPointsState;
        c cVar2 = cVar;
        if (cVar2 instanceof c.d) {
            c.d dVar = (c.d) cVar2;
            boolean z = dVar.b;
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.b) {
                ClipsEntryPointsState.b bVar = (ClipsEntryPointsState.b) clipsEntryPointsState2;
                boolean z2 = bVar.d;
                return new ClipsEntryPointsState.a((z2 && z && bVar.b == ClipsMediaPickerTab.Drafts) ? ClipsEntryPointsState.ScreenMode.DRAFTS : ClipsEntryPointsState.ScreenMode.PHOTO_PICKER, bVar.c, z2, z2 && z, dVar.c, EmptyList.b);
            }
        } else if (cVar2 instanceof c.f) {
            c.f fVar = (c.f) cVar2;
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                ClipsEntryPointsState.a aVar = (ClipsEntryPointsState.a) clipsEntryPointsState2;
                ClipsEntryPointsState.ScreenMode screenMode = aVar.b;
                boolean z3 = fVar.b;
                if (!z3 && screenMode == ClipsEntryPointsState.ScreenMode.DRAFTS) {
                    screenMode = ClipsEntryPointsState.ScreenMode.PHOTO_PICKER;
                }
                boolean z4 = aVar.c;
                boolean z5 = aVar.d;
                return new ClipsEntryPointsState.a(screenMode, z4, z5, z3 && z5, fVar.c, aVar.g);
            }
        } else if (cVar2 instanceof c.g) {
            c.g gVar = (c.g) cVar2;
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                return ClipsEntryPointsState.a.a((ClipsEntryPointsState.a) clipsEntryPointsState2, null, gVar.b, 31);
            }
        } else if (cVar2 instanceof c.b) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                return ClipsEntryPointsState.a.a((ClipsEntryPointsState.a) clipsEntryPointsState2, ClipsEntryPointsState.ScreenMode.PHOTO_PICKER, null, 62);
            }
        } else if (cVar2 instanceof c.a) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                return ClipsEntryPointsState.a.a((ClipsEntryPointsState.a) clipsEntryPointsState2, ClipsEntryPointsState.ScreenMode.DRAFTS, null, 62);
            }
        } else if (cVar2 instanceof c.C0583c) {
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                return ClipsEntryPointsState.a.a((ClipsEntryPointsState.a) clipsEntryPointsState2, ClipsEntryPointsState.ScreenMode.TEMPLATES, null, 62);
            }
        } else {
            if (!(cVar2 instanceof c.e)) {
                throw new NoWhenBranchMatchedException();
            }
            if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.a) {
                return ClipsEntryPointsState.a.a((ClipsEntryPointsState.a) clipsEntryPointsState2, ClipsEntryPointsState.ScreenMode.TRENDS, null, 62);
            }
        }
        return clipsEntryPointsState2;
    }

    @Override // xsna.dm50
    public final ClipsEntryPointsViewState d() {
        return new ClipsEntryPointsViewState(e(new ol(10)), e(new t1e(this, 0)), e(new d37(7)));
    }

    @Override // xsna.dm50
    public final void h(ClipsEntryPointsState clipsEntryPointsState, ClipsEntryPointsViewState clipsEntryPointsViewState) {
        ClipsEntryPointsState clipsEntryPointsState2 = clipsEntryPointsState;
        ClipsEntryPointsViewState clipsEntryPointsViewState2 = clipsEntryPointsViewState;
        if (clipsEntryPointsState2 instanceof ClipsEntryPointsState.b) {
            f(clipsEntryPointsViewState2.a, clipsEntryPointsState2);
        } else {
            if (!(clipsEntryPointsState2 instanceof ClipsEntryPointsState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(clipsEntryPointsViewState2.b, clipsEntryPointsState2);
        }
    }
}
