package gZ;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.domain.CdnChooserUpdater", f = "CdnChooserUpdater.kt", l = {106}, m = "getAndEmitNewCdnChooserConfig")
/* renamed from: gZ.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6702j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C6701i f64204d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f64205e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6701i f64206f;

    /* renamed from: g, reason: collision with root package name */
    int f64207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6702j(C6701i c6701i, kotlin.coroutines.d<? super C6702j> dVar) {
        super(dVar);
        this.f64206f = c6701i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f64205e = obj;
        this.f64207g |= LinearLayoutManager.INVALID_OFFSET;
        return C6701i.a(this.f64206f, this);
    }
}
