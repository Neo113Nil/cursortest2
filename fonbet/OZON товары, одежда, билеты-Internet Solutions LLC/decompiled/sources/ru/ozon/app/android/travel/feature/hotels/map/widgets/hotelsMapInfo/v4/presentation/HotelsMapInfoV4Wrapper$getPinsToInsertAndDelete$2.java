package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;
import we0.u;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2", f = "HotelsMapInfoV4Wrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2 extends j implements Function2<M, d<? super List<? extends String>>, Object> {
    final /* synthetic */ Map<String, HotelsMapInfoV4VO.Pin> $newPins;
    final /* synthetic */ HashMap<String, u> $toDelete;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u00012\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "<unused var>", "", "Lwe0/u;", "pins", "", "invoke", "(Ljava/lang/Float;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<Float, List<u>, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f7, List<u> list) {
            invoke2(f7, list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Float f7, List<u> pins) {
            Intrinsics.checkNotNullParameter(f7, "<unused var>");
            Intrinsics.checkNotNullParameter(pins, "pins");
            pins.clear();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper, Map<String, HotelsMapInfoV4VO.Pin> map, HashMap<String, u> hashMap, d<? super HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4Wrapper;
        this.$newPins = map;
        this.$toDelete = hashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2 hotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2 = new HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2(this.this$0, this.$newPins, this.$toDelete, dVar);
        hotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2.L$0 = obj;
        return hotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super List<? extends String>> dVar) {
        return invoke2(m11, (d<? super List<String>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        hashMap = this.this$0.pinsToDrawing;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        hashMap.forEach(new BiConsumer() { // from class: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj2, Object obj3) {
                Function2.this.invoke(obj2, obj3);
            }
        });
        for (Map.Entry<String, HotelsMapInfoV4VO.Pin> entry : this.$newPins.entrySet()) {
            String key = entry.getKey();
            HotelsMapInfoV4VO.Pin value = entry.getValue();
            N.e(m11);
            u uVar = this.$toDelete.get(key);
            if (uVar == null) {
                this.this$0.addPin(value);
            } else if (Intrinsics.b(uVar.getZIndex(), value.getZIndex())) {
                Object k11 = uVar.k();
                Integer num = k11 instanceof Integer ? (Integer) k11 : null;
                int cacheHash = value.getCacheHash();
                if (num != null && num.intValue() == cacheHash) {
                    this.$toDelete.remove(key);
                } else {
                    this.this$0.addPin(value);
                    this.$toDelete.remove(uVar.e());
                }
            } else {
                this.this$0.addPin(value);
            }
        }
        Set<String> keySet = this.$toDelete.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        return C7714v.U0(keySet);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super List<String>> dVar) {
        return ((HotelsMapInfoV4Wrapper$getPinsToInsertAndDelete$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
