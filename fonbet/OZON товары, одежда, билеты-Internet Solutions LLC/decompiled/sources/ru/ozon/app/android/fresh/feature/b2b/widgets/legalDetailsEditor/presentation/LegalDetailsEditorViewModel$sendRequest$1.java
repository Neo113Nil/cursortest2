package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.ResponseMessage;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FlashBarErrorWrapper;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewModel$sendRequest$1", f = "LegalDetailsEditorViewModel.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewModel$sendRequest$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ LegalDetailsEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewModel$sendRequest$1(LegalDetailsEditorViewModel legalDetailsEditorViewModel, d<? super LegalDetailsEditorViewModel$sendRequest$1> dVar) {
        super(2, dVar);
        this.this$0 = legalDetailsEditorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LegalDetailsEditorViewModel$sendRequest$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        r0 = r4.this$0.deeplinkActionHandler;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        LegalDetailsEditorRepository legalDetailsEditorRepository;
        x0 x0Var2;
        String str;
        Map<String, String> map;
        x0 x0Var3;
        String deeplink;
        Function1 function1;
        x0 x0Var4;
        x0 x0Var5;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._showGeneralLoader;
            x0Var.setValue(Boolean.TRUE);
            legalDetailsEditorRepository = this.this$0.repository;
            x0Var2 = this.this$0._addressQuery;
            LegalDetailsEditorVO.TextFieldVO textFieldVO = (LegalDetailsEditorVO.TextFieldVO) x0Var2.getValue();
            if (textFieldVO == null || (str = textFieldVO.getValue()) == null) {
                str = "";
            }
            map = this.this$0.fileNameToKeyMap;
            this.label = 1;
            obj = legalDetailsEditorRepository.sendAllEdit(str, map, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Result result = (Result) obj;
        x0Var3 = this.this$0._showGeneralLoader;
        x0Var3.setValue(Boolean.FALSE);
        if (result instanceof Result.Failure) {
            x0Var5 = this.this$0._flashbarErrorMessage;
            x0Var5.setValue(new FlashBarErrorWrapper(StringProvider.getString(R$string.error_common_message_service_error)));
        } else {
            if (!(result instanceof Result.Success)) {
                throw new o();
            }
            Result.Success success = (Result.Success) result;
            ResponseMessage message = ((LegalDetailsEditorResponseDTO) success.getValue()).getMessage();
            String text = message != null ? message.getText() : null;
            if (text != null) {
                x0Var4 = this.this$0._flashbarErrorMessage;
                x0Var4.setValue(new FlashBarErrorWrapper(text));
            } else if (Intrinsics.d(((LegalDetailsEditorResponseDTO) success.getValue()).isSuccess(), Boolean.TRUE) && (deeplink = ((LegalDetailsEditorResponseDTO) success.getValue()).getDeeplink()) != null && function1 != null) {
                function1.invoke(deeplink);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LegalDetailsEditorViewModel$sendRequest$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
