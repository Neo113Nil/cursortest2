package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation;

import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
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
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10721f;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)I"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer$measure$1", f = "SmallTileAsyncStateMeasurer.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SmallTileAsyncStateMeasurer$measure$1 extends j implements Function2<M, d<? super Integer>, Object> {
    final /* synthetic */ List<List<TileContentItem>> $states;
    final /* synthetic */ int $widthImage;
    int label;
    final /* synthetic */ SmallTileAsyncStateMeasurer this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)I"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer$measure$1$1", f = "SmallTileAsyncStateMeasurer.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileAsyncStateMeasurer$measure$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Integer>, Object> {
        final /* synthetic */ List<List<TileContentItem>> $states;
        final /* synthetic */ int $widthImage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SmallTileAsyncStateMeasurer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(int i11, List<? extends List<? extends TileContentItem>> list, SmallTileAsyncStateMeasurer smallTileAsyncStateMeasurer, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$widthImage = i11;
            this.$states = list;
            this.this$0 = smallTileAsyncStateMeasurer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$widthImage, this.$states, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineDispatcherProvider coroutineDispatcherProvider;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.L$0;
                int productInfoHorizontalPadding = this.$widthImage - (SmallTileViewBuilder.INSTANCE.getProductInfoHorizontalPadding() * 2);
                List<List<TileContentItem>> list = this.$states;
                SmallTileAsyncStateMeasurer smallTileAsyncStateMeasurer = this.this$0;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) it.next();
                    coroutineDispatcherProvider = smallTileAsyncStateMeasurer.coroutineDispatcherProvider;
                    arrayList.add(C10727i.a(m11, coroutineDispatcherProvider.getDefault(), null, new SmallTileAsyncStateMeasurer$measure$1$1$deferredResults$1$1(smallTileAsyncStateMeasurer, list2, productInfoHorizontalPadding, null), 2));
                }
                this.label = 1;
                obj = C10721f.a(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            Integer num = (Integer) C7714v.d0((Iterable) obj);
            return num != null ? new Integer(num.intValue()) : new Integer(-1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Integer> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SmallTileAsyncStateMeasurer$measure$1(int i11, List<? extends List<? extends TileContentItem>> list, SmallTileAsyncStateMeasurer smallTileAsyncStateMeasurer, d<? super SmallTileAsyncStateMeasurer$measure$1> dVar) {
        super(2, dVar);
        this.$widthImage = i11;
        this.$states = list;
        this.this$0 = smallTileAsyncStateMeasurer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SmallTileAsyncStateMeasurer$measure$1(this.$widthImage, this.$states, this.this$0, dVar);
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$widthImage, this.$states, this.this$0, null);
        this.label = 1;
        Object d11 = N.d(anonymousClass1, this);
        return d11 == aVar ? aVar : d11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Integer> dVar) {
        return ((SmallTileAsyncStateMeasurer$measure$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
