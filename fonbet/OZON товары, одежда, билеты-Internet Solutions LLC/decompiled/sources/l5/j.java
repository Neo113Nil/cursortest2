package l5;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import v5.C10234h;
import v5.InterfaceC10241o;

@kotlin.coroutines.jvm.internal.e(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {166, 178, 182}, m = "executeMain")
/* loaded from: classes8.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f72836d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC10241o f72837e;

    /* renamed from: f, reason: collision with root package name */
    C10234h f72838f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC7874c f72839g;

    /* renamed from: h, reason: collision with root package name */
    Bitmap f72840h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f72841i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ i f72842j;

    /* renamed from: k, reason: collision with root package name */
    int f72843k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f72842j = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f72841i = obj;
        this.f72843k |= LinearLayoutManager.INVALID_OFFSET;
        return i.d(this.f72842j, null, 0, this);
    }
}
