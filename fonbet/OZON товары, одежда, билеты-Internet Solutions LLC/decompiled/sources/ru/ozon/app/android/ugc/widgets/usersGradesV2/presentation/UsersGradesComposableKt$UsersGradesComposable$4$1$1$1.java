package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import B1.U;
import B1.W;
import B1.m0;
import B1.z0;
import Vc.a;
import Z1.b;
import Z1.c;
import Z1.h;
import a1.C4912a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.J;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/z0;", "LZ1/b;", "constraints", "LB1/W;", "invoke-0kLqBqw", "(LB1/z0;J)LB1/W;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class UsersGradesComposableKt$UsersGradesComposable$4$1$1$1 extends AbstractC7737t implements Function2<z0, b, W> {
    final /* synthetic */ List<ContextQuestionItemVO.ContextAnswerItem> $contextAnswers;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.UsersGradesComposableKt$UsersGradesComposable$4$1$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<m0.a, Unit> {
        final /* synthetic */ List<m0> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(List<? extends m0> list) {
            super(1);
            this.$placeables = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            invoke2(aVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<m0> list = this.$placeables;
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                m0 m0Var = list.get(i12);
                layout.h(m0Var, 0, i11, 0.0f);
                i11 += m0Var.l0();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsersGradesComposableKt$UsersGradesComposable$4$1$1$1(List<ContextQuestionItemVO.ContextAnswerItem> list) {
        super(2);
        this.$contextAnswers = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ W invoke(z0 z0Var, b bVar) {
        return m1540invoke0kLqBqw(z0Var, bVar.p());
    }

    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
    public final W m1540invoke0kLqBqw(z0 SubcomposeLayout, long j11) {
        W z02;
        h a11;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        float f7 = 0;
        J j12 = new J();
        j12.f71784a = f7;
        List<ContextQuestionItemVO.ContextAnswerItem> list = this.$contextAnswers;
        int size = list.size();
        int i11 = 0;
        float f11 = f7;
        while (i11 < size) {
            ContextQuestionItemVO.ContextAnswerItem contextAnswerItem = list.get(i11);
            float f12 = f7;
            Iterator<T> it = SubcomposeLayout.L0(contextAnswerItem.getTitle() + "." + i11, new C4912a(true, 2027292633, new UsersGradesComposableKt$UsersGradesComposable$4$1$1$1$1$titleWidth$1(contextAnswerItem))).iterator();
            h hVar = null;
            if (it.hasNext()) {
                a11 = h.a(SubcomposeLayout.B(((U) it.next()).a0(j11).u0()));
                while (it.hasNext()) {
                    h a12 = h.a(SubcomposeLayout.B(((U) it.next()).a0(j11).u0()));
                    if (a11.compareTo(a12) < 0) {
                        a11 = a12;
                    }
                }
            } else {
                a11 = null;
            }
            float d11 = a11 != null ? a11.d() : f12;
            if (Float.compare(d11, f11) > 0) {
                f11 = d11;
            }
            Iterator<T> it2 = SubcomposeLayout.L0(contextAnswerItem.getTextValue() + "." + i11, new C4912a(true, 679598719, new UsersGradesComposableKt$UsersGradesComposable$4$1$1$1$1$valueWidth$1(contextAnswerItem))).iterator();
            if (it2.hasNext()) {
                h a13 = h.a(SubcomposeLayout.B(((U) it2.next()).a0(j11).u0()));
                while (true) {
                    hVar = a13;
                    while (it2.hasNext()) {
                        a13 = h.a(SubcomposeLayout.B(((U) it2.next()).a0(j11).u0()));
                        if (hVar.compareTo(a13) < 0) {
                            break;
                        }
                    }
                }
            }
            float d12 = hVar != null ? hVar.d() : f12;
            if (Float.compare(d12, j12.f71784a) > 0) {
                j12.f71784a = d12;
            }
            i11++;
            f7 = f12;
        }
        List<U> L02 = SubcomposeLayout.L0("dependentSlotId", new C4912a(true, -1812884630, new UsersGradesComposableKt$UsersGradesComposable$4$1$1$1$measurables$1(this.$contextAnswers, ((h) a.d(h.a(f11), h.a(((h) kotlin.ranges.h.b(h.a(((SubcomposeLayout.B(b.k(j11)) - j12.f71784a) - 12) / 2), h.a(f7))).d()))).d(), j12)));
        ArrayList arrayList = new ArrayList(L02.size());
        int size2 = L02.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList.add(L02.get(i12).a0(j11));
        }
        int k11 = b.k(j11);
        Iterator it3 = arrayList.iterator();
        int i13 = 0;
        while (it3.hasNext()) {
            i13 += ((m0) it3.next()).l0();
        }
        z02 = SubcomposeLayout.z0(k11, c.g(i13, j11), kotlin.collections.U.c(), new AnonymousClass3(arrayList));
        return z02;
    }
}
