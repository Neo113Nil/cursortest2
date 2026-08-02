package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes2.dex */
public final class C implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f32333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f32334b;

    public C(D d10, TaskCompletionSource taskCompletionSource) {
        this.f32334b = d10;
        this.f32333a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Map map;
        map = this.f32334b.f32341b;
        map.remove(this.f32333a);
    }
}
