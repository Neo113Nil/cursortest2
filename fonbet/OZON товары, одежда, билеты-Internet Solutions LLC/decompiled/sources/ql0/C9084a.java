package ql0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pl0.AbstractC8941a;

/* renamed from: ql0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9084a extends AbstractC8941a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f82273b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f82274c;

    public C9084a(@NotNull String type) {
        Intrinsics.checkNotNullParameter("ru.rustore.sdk:appupdate", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter("10.2.0", "version");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f82273b = "sdkInfo";
        this.f82274c = U.j(new Pair("sdkName", "ru.rustore.sdk:appupdate"), new Pair("sdkVersion", "10.2.0"), new Pair("sdkType", type));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // pl0.AbstractC8941a
    @NotNull
    public final Map<String, String> a() {
        return this.f82274c;
    }

    @Override // pl0.AbstractC8941a
    @NotNull
    public final String b() {
        return this.f82273b;
    }
}
