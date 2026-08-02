package com.vk.clips.interests.impl.feature;

import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import com.vk.clips.interests.impl.feature.b;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.dto.common.Image;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.jhe;
import xsna.khe;
import xsna.lhe;
import xsna.mhe;
import xsna.nhe;
import xsna.t1e;
import xsna.zt4;

/* compiled from: ClipsInterestsReducer.kt */
/* loaded from: classes16.dex */
public final class c extends dm50<ClipsInterestsViewState, b, ClipsInterestsState> {
    public final com.vk.clips.interests.impl.ui.c d;

    public c(com.vk.clips.interests.impl.ui.c cVar) {
        super(ClipsInterestsState.b.b);
        this.d = cVar;
    }

    @Override // xsna.dm50
    public final ClipsInterestsState c(ClipsInterestsState clipsInterestsState, b bVar) {
        ClipsInterestsState clipsInterestsState2 = clipsInterestsState;
        b bVar2 = bVar;
        if (bVar2 instanceof b.C0620b) {
            b.C0620b c0620b = (b.C0620b) bVar2;
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, null, null, null, null, null, c0620b.b ? ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_HIDDEN : ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_VISIBLE, 31);
            }
        } else if (bVar2 instanceof b.d) {
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, null, null, null, null, null, ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS, 31);
            }
        } else if (bVar2 instanceof b.e) {
            b.e eVar = (b.e) bVar2;
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, null, null, null, eVar.b, eVar.c, null, 39);
            }
        } else if (bVar2 instanceof b.c) {
            b.c cVar = (b.c) bVar2;
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, null, ClipsInterestsState.Content.Step.SUB_CATEGORIES_CHOICE, null, cVar.b, null, null, 53);
            }
        } else if (bVar2 instanceof b.a) {
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, null, ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE, null, null, null, ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS, 29);
            }
        } else {
            if (bVar2 instanceof jhe) {
                Image image = ((jhe) bVar2).b;
                if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                    return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, image, null, null, null, null, null, 62);
                }
                if (clipsInterestsState2 instanceof ClipsInterestsState.b) {
                    return new ClipsInterestsState.c(image);
                }
                if (clipsInterestsState2 instanceof ClipsInterestsState.c) {
                    return new ClipsInterestsState.c(image);
                }
                if (clipsInterestsState2 instanceof ClipsInterestsState.a) {
                    return new ClipsInterestsState.a(image);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(bVar2 instanceof khe)) {
                if (bVar2 instanceof lhe) {
                    if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                        return clipsInterestsState2;
                    }
                    if (clipsInterestsState2 instanceof ClipsInterestsState.b) {
                        return new ClipsInterestsState.a(null);
                    }
                    if (clipsInterestsState2 instanceof ClipsInterestsState.c) {
                        return new ClipsInterestsState.a(((ClipsInterestsState.c) clipsInterestsState2).b);
                    }
                    if (clipsInterestsState2 instanceof ClipsInterestsState.a) {
                        return clipsInterestsState2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (!(bVar2 instanceof mhe)) {
                    throw new NoWhenBranchMatchedException();
                }
                mhe mheVar = (mhe) bVar2;
                if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                    return ClipsInterestsState.Content.a((ClipsInterestsState.Content) clipsInterestsState2, null, ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE, mheVar.b, mheVar.c, mheVar.d, null, 33);
                }
                if (clipsInterestsState2 instanceof ClipsInterestsState.b) {
                    return new ClipsInterestsState.Content(null, ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE, mheVar.b, mheVar.c, mheVar.d, ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS);
                }
                if (clipsInterestsState2 instanceof ClipsInterestsState.c) {
                    return new ClipsInterestsState.Content(((ClipsInterestsState.c) clipsInterestsState2).b, ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE, mheVar.b, mheVar.c, mheVar.d, ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS);
                }
                if (clipsInterestsState2 instanceof ClipsInterestsState.a) {
                    return new ClipsInterestsState.Content(((ClipsInterestsState.a) clipsInterestsState2).b, ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE, mheVar.b, mheVar.c, mheVar.d, ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (clipsInterestsState2 instanceof ClipsInterestsState.b) {
                return new ClipsInterestsState.c(null);
            }
            if (clipsInterestsState2 instanceof ClipsInterestsState.a) {
                return new ClipsInterestsState.c(((ClipsInterestsState.a) clipsInterestsState2).b);
            }
        }
        return clipsInterestsState2;
    }

    @Override // xsna.dm50
    public final ClipsInterestsViewState d() {
        return new ClipsInterestsViewState(e(new nhe(this, 0)), e(new zt4(this, 17)), e(new t1e(this, 2)));
    }

    @Override // xsna.dm50
    public final void h(ClipsInterestsState clipsInterestsState, ClipsInterestsViewState clipsInterestsViewState) {
        ClipsInterestsState clipsInterestsState2 = clipsInterestsState;
        ClipsInterestsViewState clipsInterestsViewState2 = clipsInterestsViewState;
        if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
            f(clipsInterestsViewState2.a, clipsInterestsState2);
            return;
        }
        if (clipsInterestsState2 instanceof ClipsInterestsState.c) {
            f(clipsInterestsViewState2.b, clipsInterestsState2);
        } else if (clipsInterestsState2 instanceof ClipsInterestsState.a) {
            f(clipsInterestsViewState2.c, clipsInterestsState2);
        } else if (!(clipsInterestsState2 instanceof ClipsInterestsState.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
