package com.inmobi.media;

import defpackage.sq3;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rb extends sq3 {
    public Iterator a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Wb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rb(Wb wb, sq3 sq3Var) {
        super(sq3Var);
        this.d = wb;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Db) null, this);
    }
}
