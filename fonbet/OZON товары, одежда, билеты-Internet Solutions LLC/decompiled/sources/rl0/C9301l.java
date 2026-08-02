package rl0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import vl0.C10327a;

/* renamed from: rl0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9301l extends AbstractC7737t implements Function0<Map<String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C9300k f83695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9301l(C9300k c9300k) {
        super(0);
        this.f83695b = c9300k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        bk0.c cVar = this.f83695b.f83687b.f83674a;
        String type = C10327a.C2235a.a().a().a();
        Intrinsics.checkNotNullParameter("ru.rustore.sdk:appupdate", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(type, "value");
        Intrinsics.checkNotNullParameter("10.2.0", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter("ru.rustore.sdk:appupdate", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter("10.2.0", "version");
        return kotlin.collections.U.j(new Pair("sdkName", "ru.rustore.sdk:appupdate"), new Pair("sdkType", type), new Pair("sdkVersion", "10.2.0"));
    }
}
