package ru.ozon.app.android.action.v2;

import Sc.r;
import Sc.s;
import Wc.a;
import Wc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import xe.M;

/* JADX INFO: Add missing generic type declarations: [D] */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "Lxe/M;", "LSc/r;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "<anonymous>", "(Lxe/M;)LSc/r;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.action.v2.ActionV2RepositoryImpl$requestActionResult$2", f = "ActionV2Repository.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ActionV2RepositoryImpl$requestActionResult$2<D> extends j implements Function2<M, d<? super r<? extends ActionV2Response<D>>>, Object> {
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ Class<D> $type;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ActionV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionV2RepositoryImpl$requestActionResult$2(ActionV2RepositoryImpl actionV2RepositoryImpl, ActionV2Request actionV2Request, Class<D> cls, d<? super ActionV2RepositoryImpl$requestActionResult$2> dVar) {
        super(2, dVar);
        this.this$0 = actionV2RepositoryImpl;
        this.$request = actionV2Request;
        this.$type = cls;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActionV2RepositoryImpl$requestActionResult$2(this.this$0, this.$request, this.$type, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object m482callActionInternalgIAlus;
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
        ActionV2RepositoryImpl actionV2RepositoryImpl = this.this$0;
        ActionV2Request actionV2Request = this.$request;
        Class<D> cls = this.$type;
        this.L$0 = actionV2RepositoryImpl;
        this.L$1 = actionV2Request;
        this.L$2 = cls;
        this.label = 1;
        h hVar = new h(b.b(this));
        r.Companion companion = r.INSTANCE;
        m482callActionInternalgIAlus = actionV2RepositoryImpl.m482callActionInternalgIAlus(actionV2Request, cls);
        hVar.resumeWith(r.a(m482callActionInternalgIAlus));
        Object a11 = hVar.a();
        if (a11 == aVar) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return a11 == aVar ? aVar : a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super r<ActionV2Response<D>>> dVar) {
        return ((ActionV2RepositoryImpl$requestActionResult$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
