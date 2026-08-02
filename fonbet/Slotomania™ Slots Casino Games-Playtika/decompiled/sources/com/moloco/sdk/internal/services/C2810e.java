package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.AbstractC2808c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2810e implements InterfaceC2809d {
    public static final int b = 8;
    public final Context a;

    public C2810e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC2809d
    public AbstractC2808c a() {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(AdvertisingIdClient.getAdvertisingIdInfo(this.a));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        AbstractC2808c abstractC2808c = null;
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) m11180constructorimpl;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                abstractC2808c = AbstractC2808c.b.b;
            } else {
                String id = info.getId();
                if (id != null) {
                    abstractC2808c = new AbstractC2808c.a(id);
                }
            }
            if (abstractC2808c != null) {
                return abstractC2808c;
            }
        }
        return AbstractC2808c.b.b;
    }
}
