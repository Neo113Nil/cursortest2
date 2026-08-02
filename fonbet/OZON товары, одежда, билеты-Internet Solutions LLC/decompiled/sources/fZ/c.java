package fZ;

import Jb.j;
import bZ.InterfaceC5607a;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.cdn.chooser.internal.data.NewCdnChooserApi;
import ru.ozon.cdn.chooser.internal.data.OldCdnChooserApi;

/* loaded from: classes7.dex */
public final class c implements Jb.e<InterfaceC5607a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Retrofit> f63039a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Boolean> f63040b;

    public c(b bVar, Pc.a<Retrofit> aVar, Pc.a<Boolean> aVar2) {
        this.f63039a = aVar;
        this.f63040b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        Retrofit retrofit = this.f63039a.get();
        boolean booleanValue = this.f63040b.get().booleanValue();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(booleanValue ? NewCdnChooserApi.class : OldCdnChooserApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        InterfaceC5607a interfaceC5607a = (InterfaceC5607a) create;
        j.d(interfaceC5607a);
        return interfaceC5607a;
    }
}
