package kc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel", f = "EntryCredentialsViewModel.kt", l = {529}, m = "callAction")
/* renamed from: kc0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7631E extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C7629C f71279d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f71280e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7629C f71281f;

    /* renamed from: g, reason: collision with root package name */
    int f71282g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7631E(C7629C c7629c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f71281f = c7629c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f71280e = obj;
        this.f71282g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f71281f.q1(null, null, this);
    }
}
