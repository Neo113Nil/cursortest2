package i6;

import android.content.Context;
import androidx.annotation.NonNull;
import i6.InterfaceC7015b;

/* loaded from: classes.dex */
final class d implements InterfaceC7015b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f65875a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC7015b.a f65876b;

    d(@NonNull Context context, @NonNull InterfaceC7015b.a aVar) {
        this.f65875a = context.getApplicationContext();
        this.f65876b = aVar;
    }

    @Override // i6.m
    public final void onDestroy() {
    }

    @Override // i6.m
    public final void onStart() {
        s.a(this.f65875a).b(this.f65876b);
    }

    @Override // i6.m
    public final void onStop() {
        s.a(this.f65875a).c(this.f65876b);
    }
}
