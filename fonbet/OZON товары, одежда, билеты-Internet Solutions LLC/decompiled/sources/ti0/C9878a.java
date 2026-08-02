package ti0;

import Jb.e;
import Jb.f;
import Jb.j;
import S8.d;
import android.app.Application;
import android.content.Context;
import j00.C7234a;
import kotlin.jvm.internal.Intrinsics;
import v00.g;

/* renamed from: ti0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9878a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99554a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f99555b;

    public C9878a(Pc.a aVar) {
        this.f99555b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f99554a) {
            case 0:
                Application application = (Application) ((f) this.f99555b).get();
                Intrinsics.checkNotNullParameter(application, "application");
                Context applicationContext = application.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                j.d(applicationContext);
                return applicationContext;
            default:
                return new g((C7234a) this.f99555b.get());
        }
    }

    public C9878a(d dVar, f fVar) {
        this.f99555b = fVar;
    }
}
