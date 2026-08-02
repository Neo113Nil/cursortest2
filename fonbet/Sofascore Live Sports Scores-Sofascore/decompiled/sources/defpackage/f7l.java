package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f7l extends sq3 {
    public int A;
    public Context r;
    public ct8 s;
    public List t;
    public Iterator u;
    public re0 v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ i7l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7l(i7l i7lVar, sq3 sq3Var) {
        super(sq3Var);
        this.z = i7lVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.b(null, null, this);
    }
}
