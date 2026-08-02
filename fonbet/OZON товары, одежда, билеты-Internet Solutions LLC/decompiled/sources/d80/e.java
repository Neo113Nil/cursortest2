package d80;

import android.app.Application;
import d30.InterfaceC6070a;
import g30.InterfaceC6618a;
import i30.C7004a;
import kotlin.jvm.internal.Intrinsics;
import q30.C8982b;

/* loaded from: classes3.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61324a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f61325b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f61326c;

    public /* synthetic */ e(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f61324a = i11;
        this.f61325b = aVar;
        this.f61326c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f61324a) {
            case 0:
                return new d((Application) this.f61325b.get(), (InterfaceC6618a) this.f61326c.get());
            default:
                InterfaceC6070a dao = (InterfaceC6070a) this.f61325b.get();
                C7004a graylogConfig = (C7004a) ((Jb.f) this.f61326c).get();
                Intrinsics.checkNotNullParameter(dao, "dao");
                Intrinsics.checkNotNullParameter(graylogConfig, "graylogConfig");
                return new C8982b(dao, graylogConfig);
        }
    }
}
