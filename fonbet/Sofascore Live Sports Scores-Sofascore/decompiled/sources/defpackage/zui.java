package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zui extends sq3 {
    public fvi r;
    public Collection s;
    public Iterator t;
    public Collection u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ fvi y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zui(fvi fviVar, sq3 sq3Var) {
        super(sq3Var);
        this.y = fviVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return fvi.b(this.y, null, this);
    }
}
