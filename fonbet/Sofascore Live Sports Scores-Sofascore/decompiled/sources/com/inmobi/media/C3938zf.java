package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.sq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3938zf extends sq3 {
    public AdConfig.OmidConfig a;
    public Context b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Df d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3938zf(Df df, sq3 sq3Var) {
        super(sq3Var);
        this.d = df;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
