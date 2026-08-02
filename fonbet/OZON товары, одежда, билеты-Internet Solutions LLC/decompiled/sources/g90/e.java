package g90;

import android.content.Context;
import g90.C6680a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.base.shared.FintechExportedContentProviderInteractor;

/* loaded from: classes3.dex */
public final class e implements Jb.e<FintechExportedContentProviderInteractor> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f64140a;

    public e(Pc.a<Context> aVar) {
        this.f64140a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C6680a.h) this.f64140a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new FintechExportedContentProviderInteractor(context);
    }
}
