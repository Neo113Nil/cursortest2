package ie0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProviderFactory", f = "GeoProviderFactory.kt", l = {150, 167, 169, 176, 177, 178, 180, 181}, m = "getProvider")
/* renamed from: ie0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7066c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    String f66292d;

    /* renamed from: e, reason: collision with root package name */
    Object f66293e;

    /* renamed from: f, reason: collision with root package name */
    Object f66294f;

    /* renamed from: g, reason: collision with root package name */
    Object f66295g;

    /* renamed from: h, reason: collision with root package name */
    List f66296h;

    /* renamed from: i, reason: collision with root package name */
    ArrayList f66297i;

    /* renamed from: j, reason: collision with root package name */
    long f66298j;

    /* renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f66299k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C7064a f66300l;

    /* renamed from: m, reason: collision with root package name */
    int f66301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7066c(C7064a c7064a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66300l = c7064a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f66299k = obj;
        this.f66301m |= LinearLayoutManager.INVALID_OFFSET;
        return this.f66300l.k(null, null, null, null, null, null, this);
    }
}
