package k30;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70433a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f70434b;

    public /* synthetic */ c(Pc.a aVar, int i11) {
        this.f70433a = i11;
        this.f70434b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f70433a) {
            case 0:
                Context context = (Context) this.f70434b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                return new b();
            default:
                return new ru.ozon.android.messenger.framework.navigation.d((ru.ozon.android.messenger.framework.composer.navigation.router.a) ((ru.ozon.android.messenger.framework.composer.navigation.router.b) this.f70434b).get());
        }
    }
}
