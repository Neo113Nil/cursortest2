package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r03 extends sq3 {
    public Context r;
    public Bitmap.Config s;
    public /* synthetic */ Object t;
    public final /* synthetic */ inb u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r03(inb inbVar, sq3 sq3Var) {
        super(sq3Var);
        this.u = inbVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.u(null, null, null, null, this);
    }
}
