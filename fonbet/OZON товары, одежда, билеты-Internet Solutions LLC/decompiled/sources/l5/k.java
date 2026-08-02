package l5;

import Sc.s;
import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import v5.AbstractC10235i;
import v5.C10234h;
import w5.C10435g;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "coil.RealImageLoader$executeMain$result$1", f = "RealImageLoader.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super AbstractC10235i>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f72844d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10234h f72845e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f72846f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10435g f72847g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC7874c f72848h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Bitmap f72849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(C10234h c10234h, i iVar, C10435g c10435g, InterfaceC7874c interfaceC7874c, Bitmap bitmap, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f72845e = c10234h;
        this.f72846f = iVar;
        this.f72847g = c10435g;
        this.f72848h = interfaceC7874c;
        this.f72849i = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new k(this.f72845e, this.f72846f, this.f72847g, this.f72848h, this.f72849i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super AbstractC10235i> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        ArrayList arrayList;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f72844d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        arrayList = this.f72846f.f72825h;
        boolean z11 = this.f72849i != null;
        C10234h c10234h = this.f72845e;
        q5.k kVar = new q5.k(c10234h, arrayList, 0, c10234h, this.f72847g, this.f72848h, z11);
        this.f72844d = 1;
        Object e11 = kVar.e(c10234h, this);
        return e11 == aVar ? aVar : e11;
    }
}
