package q50;

import Jb.e;
import Jb.f;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81720a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f81721b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f81722c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f81723d;

    public b(Pc.a aVar, Pc.a aVar2, Pc.a aVar3) {
        this.f81721b = aVar;
        this.f81722c = aVar2;
        this.f81723d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f81720a) {
            case 0:
                return new C8989a((C10656a) this.f81721b.get(), (InterfaceC6618a) this.f81722c.get(), (InterfaceC6083a) this.f81723d.get());
            default:
                ru.ozon.android.messenger.framework.composer.screen.e config = (ru.ozon.android.messenger.framework.composer.screen.e) ((f) this.f81723d).get();
                Map configuratorProviders = (Map) this.f81721b.get();
                ru.ozon.android.messenger.framework.composer.configuration.a composerConfiguratorStorage = (ru.ozon.android.messenger.framework.composer.configuration.a) this.f81722c.get();
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(configuratorProviders, "configuratorProviders");
                Intrinsics.checkNotNullParameter(composerConfiguratorStorage, "composerConfiguratorStorage");
                Set<Class<? extends ru.ozon.android.messenger.framework.composer.configuration.f>> f7 = config.f();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = f7.iterator();
                while (it.hasNext()) {
                    Object obj = configuratorProviders.get((Class) it.next());
                    if (obj == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList.add((ru.ozon.android.messenger.framework.composer.configuration.f) ((Pc.a) obj).get());
                }
                arrayList.addAll(composerConfiguratorStorage.b(config));
                return arrayList;
        }
    }

    public b(ru.ozon.android.messenger.framework.composer.di.module.a aVar, f fVar, Pc.a aVar2, Pc.a aVar3) {
        this.f81723d = fVar;
        this.f81721b = aVar2;
        this.f81722c = aVar3;
    }
}
