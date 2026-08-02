package ru.ozon.app.android.pdp.compose.layout;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import S0.InterfaceC3967k;
import Z1.b;
import Z1.c;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/z0;", "LZ1/b;", "constraints", "LB1/W;", "invoke-0kLqBqw", "(LB1/z0;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class RowComponentsKt$AdaptiveScrollRow$1$1 extends AbstractC7737t implements Function2<z0, b, W> {
    final /* synthetic */ C5179b.e $contentArrangement;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $endContent;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $startContent;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.compose.layout.RowComponentsKt$AdaptiveScrollRow$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ List<m0> $contentPlaceables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends m0> list) {
            super(1);
            this.$contentPlaceables = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Iterator<T> it = this.$contentPlaceables.iterator();
            while (it.hasNext()) {
                layout.h((m0) it.next(), 0, 0, 0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RowComponentsKt$AdaptiveScrollRow$1$1(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, C5179b.e eVar) {
        super(2);
        this.$startContent = function2;
        this.$endContent = function22;
        this.$contentArrangement = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ W invoke(z0 z0Var, b bVar) {
        return m873invoke0kLqBqw(z0Var, bVar.p());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final W m873invoke0kLqBqw(z0 SubcomposeLayout, long j11) {
        Integer valueOf;
        Integer valueOf2;
        W z02;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<U> L02 = SubcomposeLayout.L0("start_measure", this.$startContent);
        ArrayList arrayList = new ArrayList(C7714v.z(L02, 10));
        Iterator<T> it = L02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(((U) it.next()).a0(c.b(0, 0, 15)));
        }
        List<U> L03 = SubcomposeLayout.L0("end_measure", this.$endContent);
        ArrayList arrayList2 = new ArrayList(C7714v.z(L03, 10));
        Iterator<T> it2 = L03.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((U) it2.next()).a0(c.b(0, 0, 15)));
        }
        Iterator it3 = arrayList.iterator();
        Integer num = null;
        if (it3.hasNext()) {
            valueOf = Integer.valueOf(((m0) it3.next()).u0());
            while (it3.hasNext()) {
                Integer valueOf3 = Integer.valueOf(((m0) it3.next()).u0());
                if (valueOf.compareTo(valueOf3) < 0) {
                    valueOf = valueOf3;
                }
            }
        } else {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            valueOf2 = Integer.valueOf(((m0) it4.next()).u0());
            while (it4.hasNext()) {
                Integer valueOf4 = Integer.valueOf(((m0) it4.next()).u0());
                if (valueOf2.compareTo(valueOf4) < 0) {
                    valueOf2 = valueOf4;
                }
            }
        } else {
            valueOf2 = null;
        }
        List<U> L04 = SubcomposeLayout.L0("content", new C4912a(true, 958858877, new RowComponentsKt$AdaptiveScrollRow$1$1$contentPlaceables$1(intValue + (valueOf2 != null ? valueOf2.intValue() : 0) <= b.k(j11), this.$contentArrangement, this.$startContent, this.$endContent)));
        ArrayList arrayList3 = new ArrayList(C7714v.z(L04, 10));
        Iterator<T> it5 = L04.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((U) it5.next()).a0(j11));
        }
        Iterator it6 = arrayList3.iterator();
        if (it6.hasNext()) {
            Integer valueOf5 = Integer.valueOf(((m0) it6.next()).l0());
            loop3: while (true) {
                num = valueOf5;
                while (it6.hasNext()) {
                    valueOf5 = Integer.valueOf(((m0) it6.next()).l0());
                    if (num.compareTo(valueOf5) < 0) {
                        break;
                    }
                }
            }
        }
        z02 = SubcomposeLayout.z0(b.k(j11), num != null ? num.intValue() : 0, kotlin.collections.U.c(), new AnonymousClass1(arrayList3));
        return z02;
    }
}
