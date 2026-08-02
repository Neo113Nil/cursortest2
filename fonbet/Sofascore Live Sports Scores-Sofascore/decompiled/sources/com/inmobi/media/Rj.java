package com.inmobi.media;

import android.widget.ImageView;
import defpackage.asf;
import defpackage.sq3;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rj extends sq3 {
    public List a;
    public ImageView b;
    public asf c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Vj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rj(Vj vj, sq3 sq3Var) {
        super(sq3Var);
        this.e = vj;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((List) null, (ImageView) null, this);
    }
}
