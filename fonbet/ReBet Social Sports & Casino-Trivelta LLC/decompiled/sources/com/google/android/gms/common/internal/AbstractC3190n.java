package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.internal.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3190n {

    /* renamed from: a, reason: collision with root package name */
    public static final N f32735a = new K();

    /* renamed from: com.google.android.gms.common.internal.n$a */
    public interface a {
        Object convert(com.google.android.gms.common.api.l lVar);
    }

    public static Task a(com.google.android.gms.common.api.h hVar, a aVar) {
        N n10 = f32735a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.addStatusListener(new L(hVar, taskCompletionSource, aVar, n10));
        return taskCompletionSource.getTask();
    }

    public static Task b(com.google.android.gms.common.api.h hVar) {
        return a(hVar, new M());
    }
}
