package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h7l extends sq3 {
    public Context r;
    public Function1 s;
    public List t;
    public Iterator u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ i7l x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7l(i7l i7lVar, sq3 sq3Var) {
        super(sq3Var);
        this.x = i7lVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.d(null, null, this);
    }
}
