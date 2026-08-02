package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dbm extends sq3 {
    public odm r;
    public Map s;
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ odm v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbm(odm odmVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = odmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, null, false, null, this);
    }
}
