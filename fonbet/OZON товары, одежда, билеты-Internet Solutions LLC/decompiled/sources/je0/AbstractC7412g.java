package je0;

import Sc.InterfaceC4008j;
import Sc.k;
import We.E;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfigClient;

/* renamed from: je0.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC7412g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final GeoProxyConfigClient f69971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69972b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f69973c;

    public AbstractC7412g(@NotNull GeoProxyConfigClient config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f69971a = config;
        this.f69972b = k.b(C7411f.f69970b);
        this.f69973c = k.b(new C7410e(this));
    }

    @NotNull
    public final C7408c a() {
        return (C7408c) this.f69973c.getValue();
    }

    @NotNull
    public final GeoProxyConfig b() {
        return this.f69971a;
    }

    @NotNull
    public final Gson c() {
        return (Gson) this.f69972b.getValue();
    }

    @NotNull
    public abstract E d();
}
