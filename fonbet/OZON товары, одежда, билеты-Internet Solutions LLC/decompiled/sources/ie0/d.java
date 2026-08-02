package ie0;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProviderFactory", f = "GeoProviderFactory.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT, ModuleDescriptor.MODULE_VERSION, 75, 79, 80, 81, 82, 83, 85, 86, 87, 89}, m = "getProvidersForTabs")
/* loaded from: classes7.dex */
final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f66302d;

    /* renamed from: e, reason: collision with root package name */
    String f66303e;

    /* renamed from: f, reason: collision with root package name */
    Context f66304f;

    /* renamed from: g, reason: collision with root package name */
    Object f66305g;

    /* renamed from: h, reason: collision with root package name */
    Object f66306h;

    /* renamed from: i, reason: collision with root package name */
    GeoProviderConfig f66307i;

    /* renamed from: j, reason: collision with root package name */
    Iterator f66308j;

    /* renamed from: k, reason: collision with root package name */
    long f66309k;

    /* renamed from: l, reason: collision with root package name */
    /* synthetic */ Object f66310l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ C7064a f66311m;

    /* renamed from: n, reason: collision with root package name */
    int f66312n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(C7064a c7064a, kotlin.coroutines.d<? super d> dVar) {
        super(dVar);
        this.f66311m = c7064a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f66310l = obj;
        this.f66312n |= LinearLayoutManager.INVALID_OFFSET;
        return this.f66311m.l(null, null, this);
    }
}
