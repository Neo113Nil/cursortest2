package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zat;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.common.api.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3133h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f32521a = zat.zaa().zac(2, new L9.c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f32521a;
    }
}
