package defpackage;

import com.sofascore.model.newNetwork.TvChannelVoteBody;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s3k extends sq3 {
    public int r;
    public int s;
    public TvChannelData t;
    public TvChannelVoteBody u;
    public /* synthetic */ Object v;
    public final /* synthetic */ vng w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3k(vng vngVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = vngVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.Z(0, null, null, this);
    }
}
