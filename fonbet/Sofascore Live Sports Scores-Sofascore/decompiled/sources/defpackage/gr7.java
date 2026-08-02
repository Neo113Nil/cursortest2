package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gr7 extends sq3 {
    public String r;
    public av4 s;
    public HashSet t;
    public HashSet u;
    public ArrayList v;
    public rr7 w;
    public /* synthetic */ Object x;
    public final /* synthetic */ rr7 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr7(rr7 rr7Var, sq3 sq3Var) {
        super(sq3Var);
        this.y = rr7Var;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.m(null, null, null, this);
    }
}
