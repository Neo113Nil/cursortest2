package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jfm extends sq3 {
    public int A;
    public gum r;
    public BlazeDataSourceType s;
    public String t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ gum z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfm(gum gumVar, rq3 rq3Var) {
        super(rq3Var);
        this.z = gumVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, null, false, false, null, null, null, false, this);
    }
}
