package Oa;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class m extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f8587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f8588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, TaskCompletionSource taskCompletionSource, j jVar) {
        super(taskCompletionSource);
        this.f8588c = tVar;
        this.f8587b = jVar;
    }

    @Override // Oa.j
    public final void a() {
        t.m(this.f8588c, this.f8587b);
    }
}
