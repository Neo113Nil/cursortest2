package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActViewModel;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.data.B2bAcceptActParams;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.data.B2bAcceptActResponseDTO;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActViewModel$acceptAct$1", f = "B2bAcceptActViewModel.kt", l = {40, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bAcceptActViewModel$acceptAct$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ B2bAcceptActParams $acceptActParams;
    final /* synthetic */ String $actionName;
    final /* synthetic */ JsonParser $jsonDeserializer;
    int label;
    final /* synthetic */ B2bAcceptActViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bAcceptActViewModel$acceptAct$1(B2bAcceptActViewModel b2bAcceptActViewModel, B2bAcceptActParams b2bAcceptActParams, JsonParser jsonParser, String str, d<? super B2bAcceptActViewModel$acceptAct$1> dVar) {
        super(2, dVar);
        this.this$0 = b2bAcceptActViewModel;
        this.$acceptActParams = b2bAcceptActParams;
        this.$jsonDeserializer = jsonParser;
        this.$actionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bAcceptActViewModel$acceptAct$1(this.this$0, this.$acceptActParams, this.$jsonDeserializer, this.$actionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003a, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        B2bAcceptActRepository b2bAcceptActRepository;
        x0 x0Var2;
        x0 x0Var3;
        x0 x0Var4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._screenState;
            x0Var.setValue(B2bAcceptActViewModel.ScreenState.Loading.INSTANCE);
            B2bAcceptActViewModel b2bAcceptActViewModel = this.this$0;
            String postData = this.$acceptActParams.getPostData();
            JsonParser jsonParser = this.$jsonDeserializer;
            this.label = 1;
            obj = b2bAcceptActViewModel.getDocumentId(postData, jsonParser, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Result result = (Result) obj;
                if (result instanceof Result.Failure) {
                    x0Var4 = this.this$0._screenState;
                    x0Var4.setValue(B2bAcceptActViewModel.ScreenState.Error.INSTANCE);
                } else {
                    if (!(result instanceof Result.Success)) {
                        throw new o();
                    }
                    x0Var3 = this.this$0._screenState;
                    x0Var3.setValue(((B2bAcceptActResponseDTO) ((Result.Success) result).getValue()).isSuccess() ? new B2bAcceptActViewModel.ScreenState.Success(this.$acceptActParams) : B2bAcceptActViewModel.ScreenState.Error.INSTANCE);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        String str = (String) obj;
        if (str == null) {
            x0Var2 = this.this$0._screenState;
            x0Var2.setValue(B2bAcceptActViewModel.ScreenState.Error.INSTANCE);
            return Unit.f71690a;
        }
        b2bAcceptActRepository = this.this$0.repository;
        String str2 = this.$actionName;
        this.label = 2;
        obj = b2bAcceptActRepository.acceptAct(str2, str, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((B2bAcceptActViewModel$acceptAct$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
