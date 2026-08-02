package defpackage;

import com.sofascore.model.database.DbNatsEvent;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q5d extends sq3 {
    public /* synthetic */ Object A;
    public final /* synthetic */ s5d B;
    public int C;
    public DbNatsEvent r;
    public h2d s;
    public p4d t;
    public Iterator u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5d(s5d s5dVar, sq3 sq3Var) {
        super(sq3Var);
        this.B = s5dVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, false, this);
    }
}
