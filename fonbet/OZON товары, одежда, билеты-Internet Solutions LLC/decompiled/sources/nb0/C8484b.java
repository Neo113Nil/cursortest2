package nb0;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;

/* renamed from: nb0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C8484b extends AbstractC7737t implements Function0<C9067a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f76722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8484b(Application application) {
        super(0);
        this.f76722b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9067a invoke() {
        C9067a c9067a;
        Object obj;
        C9067a c9067a2;
        Application context = this.f76722b;
        Intrinsics.checkNotNullParameter(context, "context");
        c9067a = C9067a.f82186h;
        if (c9067a != null) {
            return c9067a;
        }
        obj = C9067a.f82185g;
        synchronized (obj) {
            c9067a2 = C9067a.f82186h;
            if (c9067a2 == null) {
                c9067a2 = new C9067a(context);
                C9067a.f82186h = c9067a2;
            }
        }
        return c9067a2;
    }
}
