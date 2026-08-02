package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.publisher.nativead.n;
import defpackage.aq4;
import defpackage.sq3;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b extends sq3 {
    public n r;
    public File s;
    public aq4 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = nVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, null, this);
    }
}
