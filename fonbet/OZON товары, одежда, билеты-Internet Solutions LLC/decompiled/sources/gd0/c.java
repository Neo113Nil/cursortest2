package gd0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import Jb0.s;
import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.nativeauth.data.models.RestoreAccesVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import td0.C9861a;
import xe.M;
import zc0.C11092g;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.restoreAccess.CantLoginInAccountActionsFragment$observeViewModel$lambda$4$lambda$3$$inlined$collectFlow$1", f = "CantLoginInAccountActionsFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f64265d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f64266e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f64267f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ s f64268g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f64269a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f64270b;

        public a(e eVar, s sVar) {
            this.f64269a = eVar;
            this.f64270b = sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            RestoreAccesVO restoreAccesVO = (RestoreAccesVO) t2;
            e eVar = this.f64269a;
            s sVar = this.f64270b;
            LinearLayout contentContainer = sVar.f14543b;
            Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
            contentContainer.setVisibility(0);
            TextAtomV2View titleTextAtomV2 = sVar.f14545d;
            Intrinsics.checkNotNullExpressionValue(titleTextAtomV2, "titleTextAtomV2");
            cc0.c.b(titleTextAtomV2, restoreAccesVO.getTitle());
            LinearLayout reasonCells = sVar.f14544c;
            Intrinsics.checkNotNullExpressionValue(reasonCells, "reasonCells");
            List<C11092g.a> cells = restoreAccesVO.getCells();
            C6717a onClick = new C6717a(eVar);
            Intrinsics.checkNotNullParameter(reasonCells, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            reasonCells.removeAllViewsInLayout();
            float pxF = UiExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
            float[] fArr = {pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f};
            float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, pxF, pxF, pxF, pxF};
            Integer valueOf = cells != null ? Integer.valueOf(C7714v.P(cells)) : null;
            if (cells != null) {
                int i11 = 0;
                for (T t11 : cells) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    C11092g.a aVar = (C11092g.a) t11;
                    Context context = reasonCells.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    CellView cellView = new CellView(context, null, 0, 0, null, 30, null);
                    CellHolderKt.bind$default(cellView, aVar.a(), null, 2, null);
                    cellView.setHasSeparator(valueOf == null || valueOf.intValue() != i11);
                    C9861a.a(cellView, String.valueOf(i11));
                    if (i11 == 0) {
                        cellView.setCellCornerRadii(fArr);
                    } else if (valueOf != null && i11 == valueOf.intValue()) {
                        cellView.setCellCornerRadii(fArr2);
                    }
                    cellView.getCenterBlock().setOnClickListener(new AE.a(4, onClick, aVar));
                    reasonCells.addView(cellView);
                    i11 = i12;
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C2406m0 c2406m0, kotlin.coroutines.d dVar, e eVar, s sVar) {
        super(2, dVar);
        this.f64266e = c2406m0;
        this.f64267f = eVar;
        this.f64268g = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f64266e, dVar, this.f64267f, this.f64268g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f64265d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f64267f, this.f64268g);
            this.f64265d = 1;
            if (this.f64266e.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
