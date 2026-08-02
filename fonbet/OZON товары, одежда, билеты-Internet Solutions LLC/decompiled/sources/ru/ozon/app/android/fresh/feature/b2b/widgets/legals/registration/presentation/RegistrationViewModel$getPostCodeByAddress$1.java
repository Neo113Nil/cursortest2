package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Ae.w0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.GetPostResponse;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationViewModel$getPostCodeByAddress$1", f = "RegistrationViewModel.kt", l = {67, 68, 70, 71, 74, 75}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RegistrationViewModel$getPostCodeByAddress$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $address;
    int label;
    final /* synthetic */ RegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RegistrationViewModel$getPostCodeByAddress$1(RegistrationViewModel registrationViewModel, String str, d<? super RegistrationViewModel$getPostCodeByAddress$1> dVar) {
        super(2, dVar);
        this.this$0 = registrationViewModel;
        this.$address = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RegistrationViewModel$getPostCodeByAddress$1(this.this$0, this.$address, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r1.emit(r2, r3) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        if (r4 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0037, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b8, code lost:
    
        if (r4.emit(r1, r3) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        AddLegalRepository addLegalRepository;
        x0 x0Var2;
        w0 w0Var;
        String str;
        x0 x0Var3;
        w0 w0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                s.b(obj);
                x0Var = this.this$0._state;
                RegistrationViewModel.State.Loading loading = RegistrationViewModel.State.Loading.INSTANCE;
                this.label = 1;
                break;
            case 1:
                s.b(obj);
                addLegalRepository = this.this$0.repository;
                String str2 = this.$address;
                this.label = 2;
                obj = addLegalRepository.getPostByAddress(str2, this);
                break;
            case 2:
                s.b(obj);
                Result result = (Result) obj;
                if (result instanceof Result.Success) {
                    w0Var = this.this$0._events;
                    GetPostResponse getPostResponse = (GetPostResponse) ((Result.Success) result).getValue();
                    if (getPostResponse == null || (str = getPostResponse.getPostCode()) == null) {
                        str = "";
                    }
                    RegistrationViewModel.UIEvent.PostCodeUpdate postCodeUpdate = new RegistrationViewModel.UIEvent.PostCodeUpdate(str);
                    this.label = 3;
                    break;
                } else {
                    if (!(result instanceof Result.Failure)) {
                        throw new o();
                    }
                    x0Var2 = this.this$0._state;
                    RegistrationViewModel.State.Idle idle = RegistrationViewModel.State.Idle.INSTANCE;
                    this.label = 5;
                    break;
                }
                return aVar;
            case 3:
                s.b(obj);
                x0Var3 = this.this$0._state;
                RegistrationViewModel.State.Idle idle2 = RegistrationViewModel.State.Idle.INSTANCE;
                this.label = 4;
                break;
            case 4:
            case 6:
                s.b(obj);
                return Unit.f71690a;
            case 5:
                s.b(obj);
                w0Var2 = this.this$0._events;
                RegistrationViewModel.UIEvent.InputsError inputsError = new RegistrationViewModel.UIEvent.InputsError(U.c());
                this.label = 6;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RegistrationViewModel$getPostCodeByAddress$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
