package jc;

import Cf.f;
import If.c;
import Zb.C4899b;
import androidx.annotation.NonNull;
import java.util.Collections;

/* renamed from: jc.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7336c extends Ub.a {

    /* renamed from: a, reason: collision with root package name */
    private final C7337d f69670a;

    C7336c(@NonNull C7337d c7337d) {
        this.f69670a = c7337d;
    }

    @NonNull
    public static C7336c a(@NonNull ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.b bVar) {
        C4899b.a aVar = new C4899b.a();
        bVar.a(aVar);
        return new C7336c(new C7337d(aVar));
    }

    @NonNull
    public final C7337d b() {
        return this.f69670a;
    }

    @Override // Ub.a, Ub.h
    public final void configureParser(@NonNull c.a aVar) {
        aVar.h(Collections.singleton(new f()));
    }
}
