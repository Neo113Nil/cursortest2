package ru.ozon.app.android.pdp.view.photo360.data;

import Sc.s;
import Wc.a;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet$loadImages$2$1", f = "Photo360ImagesDataSet.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class Photo360ImagesDataSet$loadImages$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ Photo360ImagesDataSet $this_runCatching;
    final /* synthetic */ List<String> $urls;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ImagesDataSet$loadImages$2$1(List<String> list, Photo360ImagesDataSet photo360ImagesDataSet, int i11, int i12, d<? super Photo360ImagesDataSet$loadImages$2$1> dVar) {
        super(2, dVar);
        this.$urls = list;
        this.$this_runCatching = photo360ImagesDataSet;
        this.$width = i11;
        this.$height = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        Photo360ImagesDataSet$loadImages$2$1 photo360ImagesDataSet$loadImages$2$1 = new Photo360ImagesDataSet$loadImages$2$1(this.$urls, this.$this_runCatching, this.$width, this.$height, dVar);
        photo360ImagesDataSet$loadImages$2$1.L$0 = obj;
        return photo360ImagesDataSet$loadImages$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        int i12 = 0;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            List<String> list = this.$urls;
            List<String> list2 = list;
            Photo360ImagesDataSet photo360ImagesDataSet = this.$this_runCatching;
            int i13 = this.$width;
            int i14 = this.$height;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            int i15 = 0;
            for (Object obj2 : list2) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(C10727i.a(m11, null, null, new Photo360ImagesDataSet$loadImages$2$1$1$1((String) obj2, photo360ImagesDataSet, list, i15, i13, i14, null), 3));
                i15 = i16;
            }
            this.label = 1;
            a11 = C10721f.a(arrayList, this);
            if (a11 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a11 = obj;
        }
        Photo360ImagesDataSet photo360ImagesDataSet2 = this.$this_runCatching;
        List<String> list3 = this.$urls;
        for (Object obj3 : (Iterable) a11) {
            int i17 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            Pair pair = (Pair) obj3;
            photo360ImagesDataSet2.getCachedImages().add(new Photo360ImagesDataSet.PhotoData(list3.get(i12), (String) pair.e(), (Drawable) pair.f(), false, 8, null));
            i12 = i17;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((Photo360ImagesDataSet$loadImages$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
