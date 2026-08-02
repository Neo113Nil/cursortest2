package ie0;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.geoproxy.GeoProviderFactory", f = "GeoProviderFactory.kt", l = {251, 253}, m = "fallbackToDefaultProvider")
/* renamed from: ie0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7065b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f66287d;

    /* renamed from: e, reason: collision with root package name */
    Context f66288e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f66289f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7064a f66290g;

    /* renamed from: h, reason: collision with root package name */
    int f66291h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7065b(C7064a c7064a, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f66290g = c7064a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object d11;
        this.f66289f = obj;
        this.f66291h |= LinearLayoutManager.INVALID_OFFSET;
        d11 = this.f66290g.d(null, this);
        return d11;
    }
}
