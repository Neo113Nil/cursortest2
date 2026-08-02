package ru.ozon.app.android.geo.map.clusterization;

import Sc.s;
import Wc.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.clusterization.PinImageLoaderImpl$loadImages$2", f = "PinImageLoader.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PinImageLoaderImpl$loadImages$2 extends j implements Function2<M, d<? super List<? extends Unit>>, Object> {
    final /* synthetic */ List<String> $urls;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PinImageLoaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PinImageLoaderImpl$loadImages$2(List<String> list, PinImageLoaderImpl pinImageLoaderImpl, d<? super PinImageLoaderImpl$loadImages$2> dVar) {
        super(2, dVar);
        this.$urls = list;
        this.this$0 = pinImageLoaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PinImageLoaderImpl$loadImages$2 pinImageLoaderImpl$loadImages$2 = new PinImageLoaderImpl$loadImages$2(this.$urls, this.this$0, dVar);
        pinImageLoaderImpl$loadImages$2.L$0 = obj;
        return pinImageLoaderImpl$loadImages$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends Unit>> dVar) {
        return invoke2(m11, (d<? super List<Unit>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        List<String> list = this.$urls;
        PinImageLoaderImpl pinImageLoaderImpl = this.this$0;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C10727i.a(m11, null, null, new PinImageLoaderImpl$loadImages$2$1$1(pinImageLoaderImpl, (String) it.next(), null), 3));
        }
        this.label = 1;
        Object a11 = C10721f.a(arrayList, this);
        return a11 == aVar ? aVar : a11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<Unit>> dVar) {
        return ((PinImageLoaderImpl$loadImages$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
