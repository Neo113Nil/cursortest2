package ru.ozon.app.android.travel.utils.compose;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import S0.InterfaceC3967k;
import Z1.b;
import Z1.h;
import a1.C4912a;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/z0;", "LZ1/b;", "parentConstraints", "LB1/W;", "invoke-0kLqBqw", "(LB1/z0;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class MeasureMaxItemHeightKt$WithMaxItemHeight$1$1 extends AbstractC7737t implements Function2<z0, b, W> {
    final /* synthetic */ InterfaceC6511n<h, InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ InterfaceC6511n<T, InterfaceC3967k, Integer, Unit> $itemContent;
    final /* synthetic */ Function0<h> $itemWidthProvider;
    final /* synthetic */ List<T> $items;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.utils.compose.MeasureMaxItemHeightKt$WithMaxItemHeight$1$1$1, reason: invalid class name */
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
    MeasureMaxItemHeightKt$WithMaxItemHeight$1$1(Function0<h> function0, List<? extends T> list, InterfaceC6511n<? super T, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super h, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2) {
        super(2);
        this.$itemWidthProvider = function0;
        this.$items = list;
        this.$itemContent = interfaceC6511n;
        this.$content = interfaceC6511n2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ W invoke(z0 z0Var, b bVar) {
        return m1448invoke0kLqBqw(z0Var, bVar.p());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final W m1448invoke0kLqBqw(z0 SubcomposeLayout, long j11) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        W z02;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int Y02 = SubcomposeLayout.Y0(this.$itemWidthProvider.invoke().d());
        int i11 = Y02 < 0 ? 0 : Y02;
        long c11 = b.c(i11, i11, 0, 0, 8, j11);
        IntRange O11 = C7714v.O(this.$items);
        InterfaceC6511n<T, InterfaceC3967k, Integer, Unit> interfaceC6511n = this.$itemContent;
        List<T> list = this.$items;
        C7665d it = O11.iterator();
        Integer num = null;
        if (it.hasNext()) {
            int b11 = it.b();
            Iterator<T> it2 = SubcomposeLayout.L0(Integer.valueOf(b11), new C4912a(true, 280996679, new MeasureMaxItemHeightKt$WithMaxItemHeight$1$1$maxItemHeightPx$1$1(interfaceC6511n, list, b11))).iterator();
            if (it2.hasNext()) {
                valueOf = Integer.valueOf(((U) it2.next()).a0(c11).l0());
                while (it2.hasNext()) {
                    Integer valueOf5 = Integer.valueOf(((U) it2.next()).a0(c11).l0());
                    if (valueOf.compareTo(valueOf5) < 0) {
                        valueOf = valueOf5;
                    }
                }
            } else {
                valueOf = null;
            }
            valueOf2 = Integer.valueOf(valueOf != null ? valueOf.intValue() : 0);
            while (it.hasNext()) {
                int b12 = it.b();
                Iterator<T> it3 = SubcomposeLayout.L0(Integer.valueOf(b12), new C4912a(true, 280996679, new MeasureMaxItemHeightKt$WithMaxItemHeight$1$1$maxItemHeightPx$1$1(interfaceC6511n, list, b12))).iterator();
                if (it3.hasNext()) {
                    valueOf3 = Integer.valueOf(((U) it3.next()).a0(c11).l0());
                    while (it3.hasNext()) {
                        Integer valueOf6 = Integer.valueOf(((U) it3.next()).a0(c11).l0());
                        if (valueOf3.compareTo(valueOf6) < 0) {
                            valueOf3 = valueOf6;
                        }
                    }
                } else {
                    valueOf3 = null;
                }
                Integer valueOf7 = Integer.valueOf(valueOf3 != null ? valueOf3.intValue() : 0);
                if (valueOf2.compareTo(valueOf7) < 0) {
                    valueOf2 = valueOf7;
                }
            }
        } else {
            valueOf2 = null;
        }
        List<U> L02 = SubcomposeLayout.L0("content", new C4912a(true, 628147573, new MeasureMaxItemHeightKt$WithMaxItemHeight$1$1$contentPlaceables$1(this.$content, SubcomposeLayout.B(valueOf2 != null ? valueOf2.intValue() : 0))));
        ArrayList arrayList = new ArrayList(C7714v.z(L02, 10));
        Iterator<T> it4 = L02.iterator();
        while (it4.hasNext()) {
            arrayList.add(((U) it4.next()).a0(j11));
        }
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            valueOf4 = Integer.valueOf(((m0) it5.next()).u0());
            while (it5.hasNext()) {
                Integer valueOf8 = Integer.valueOf(((m0) it5.next()).u0());
                if (valueOf4.compareTo(valueOf8) < 0) {
                    valueOf4 = valueOf8;
                }
            }
        } else {
            valueOf4 = null;
        }
        int intValue = valueOf4 != null ? valueOf4.intValue() : b.m(j11);
        Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            Integer valueOf9 = Integer.valueOf(((m0) it6.next()).l0());
            loop1: while (true) {
                num = valueOf9;
                while (it6.hasNext()) {
                    valueOf9 = Integer.valueOf(((m0) it6.next()).l0());
                    if (num.compareTo(valueOf9) < 0) {
                        break;
                    }
                }
            }
        }
        z02 = SubcomposeLayout.z0(intValue, num != null ? num.intValue() : b.l(j11), kotlin.collections.U.c(), new AnonymousClass1(arrayList));
        return z02;
    }
}
