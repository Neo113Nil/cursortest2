package je0;

import Sc.InterfaceC4008j;
import Sc.k;
import We.E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient;
import te0.C9866a;

/* renamed from: je0.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7413h extends AbstractC7412g {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69974d;

    /* renamed from: je0.h$a */
    static final class a extends AbstractC7737t implements Function0<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GeoProxyConfigClient f69975b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(GeoProxyConfigClient geoProxyConfigClient) {
            super(0);
            this.f69975b = geoProxyConfigClient;
        }

        @Override // kotlin.jvm.functions.Function0
        public final E invoke() {
            E okHttpClient = this.f69975b.getOkHttpClient();
            okHttpClient.getClass();
            E.a aVar = new E.a(okHttpClient);
            aVar.a(new C9866a());
            return new E(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7413h(@NotNull GeoProxyConfigClient config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.f69974d = k.b(new a(config));
    }

    @Override // je0.AbstractC7412g
    @NotNull
    public final E d() {
        return (E) this.f69974d.getValue();
    }
}
