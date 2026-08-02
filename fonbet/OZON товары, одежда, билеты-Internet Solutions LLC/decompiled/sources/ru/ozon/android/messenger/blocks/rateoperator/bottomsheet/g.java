package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.RateOperatorBottomSheetViewModel$onSendButtonClicked$1", f = "RateOperatorBottomSheetViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f86204d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f86205e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f86206f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f86207g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ArrayList f86208h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ h f86209i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ String f86210j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(AtomActionDTO atomActionDTO, String str, int i11, ArrayList arrayList, h hVar, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f86205e = atomActionDTO;
        this.f86206f = str;
        this.f86207g = i11;
        this.f86208h = arrayList;
        this.f86209i = hVar;
        this.f86210j = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f86205e, this.f86206f, this.f86207g, this.f86208h, this.f86209i, this.f86210j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.repository.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f86204d;
        h hVar = this.f86209i;
        if (i11 == 0) {
            s.b(obj);
            ArrayList arrayList = this.f86208h;
            j jVar = new j(this.f86205e, this.f86206f, this.f86207g, arrayList);
            aVar = hVar.f86211b;
            this.f86204d = 1;
            obj = aVar.h(jVar, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
        if (iVar instanceof i.b) {
            ((i.b) iVar).getClass();
            h.h0(hVar, this.f86210j);
        }
        if (iVar instanceof i.a) {
            h.f0(hVar);
        }
        return Unit.f71690a;
    }
}
