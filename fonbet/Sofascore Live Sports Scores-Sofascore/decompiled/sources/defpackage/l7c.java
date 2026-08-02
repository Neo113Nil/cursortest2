package defpackage;

import com.sofascore.model.database.MediaReactionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l7c extends sq3 {
    public int r;
    public MediaReactionType s;
    public MediaReactionType t;
    public /* synthetic */ Object u;
    public final /* synthetic */ m7c v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7c(m7c m7cVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = m7cVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(0, null, null, this);
    }
}
