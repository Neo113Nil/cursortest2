package defpackage;

import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vrm extends sq3 {
    public BlazeLiveStreamEdgeState r;
    public /* synthetic */ Object s;
    public final /* synthetic */ lzm t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrm(lzm lzmVar, sq3 sq3Var) {
        super(sq3Var);
        this.t = lzmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.w(0, null, this);
    }
}
