package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import Ae.w0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel$fetchAsyncWidget$1", f = "TranslateViewModel.kt", l = {69, 71, 72, 75}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TranslateViewModel$fetchAsyncWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ Class<DTO> $stateType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TranslateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateViewModel$fetchAsyncWidget$1(TranslateViewModel translateViewModel, String str, Class<DTO> cls, d<? super TranslateViewModel$fetchAsyncWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = translateViewModel;
        this.$asyncData = str;
        this.$stateType = cls;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TranslateViewModel$fetchAsyncWidget$1 translateViewModel$fetchAsyncWidget$1 = new TranslateViewModel$fetchAsyncWidget$1(this.this$0, this.$asyncData, this.$stateType, dVar);
        translateViewModel$fetchAsyncWidget$1.L$0 = obj;
        return translateViewModel$fetchAsyncWidget$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        if (r0 == r8) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        TranslateViewModel translateViewModel;
        w0 w0Var;
        Object obj2;
        ComposerAsyncWidgetResponse composerAsyncWidgetResponse;
        w0 w0Var2;
        Object state;
        Throwable b11;
        Throwable b12;
        Object handleError;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        TranslateViewModel.Companion companion;
        Object fetchWidget$default;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            TranslateViewModel translateViewModel2 = this.this$0;
            String str = this.$asyncData;
            Class<DTO> cls = this.$stateType;
            r.Companion companion3 = r.INSTANCE;
            composerAsyncWidgetRepository = translateViewModel2.repository;
            companion = TranslateViewModel.Companion;
            Map<String, Map<String, String>> params = companion.getParams();
            this.label = 1;
            fetchWidget$default = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, params, cls, null, this, 8, null);
            if (fetchWidget$default == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    a11 = this.L$0;
                    s.b(obj);
                    a.b bVar = Lm0.a.f17149a;
                    b11 = r.b(a11);
                    if (b11 != null) {
                        bVar.e(b11);
                    }
                    TranslateViewModel translateViewModel3 = this.this$0;
                    b12 = r.b(a11);
                    if (b12 != null) {
                        this.L$0 = null;
                        this.label = 4;
                        handleError = translateViewModel3.handleError(b12, this);
                    }
                    return Unit.f71690a;
                }
                composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) this.L$2;
                translateViewModel = (TranslateViewModel) this.L$1;
                obj2 = this.L$0;
                s.b(obj);
                w0Var2 = translateViewModel._widgetUpdate;
                state = composerAsyncWidgetResponse.getState();
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (w0Var2.emit(state, this) != aVar) {
                    a11 = obj2;
                    a.b bVar2 = Lm0.a.f17149a;
                    b11 = r.b(a11);
                    if (b11 != null) {
                    }
                    TranslateViewModel translateViewModel32 = this.this$0;
                    b12 = r.b(a11);
                    if (b12 != null) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
            s.b(obj);
            fetchWidget$default = obj;
        }
        a11 = (ComposerAsyncWidgetResponse) fetchWidget$default;
        r.Companion companion4 = r.INSTANCE;
        translateViewModel = this.this$0;
        if (!(a11 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse2 = (ComposerAsyncWidgetResponse) a11;
            w0Var = translateViewModel._translateState;
            TranslateViewModel.TranslateState.Success success = TranslateViewModel.TranslateState.Success.INSTANCE;
            this.L$0 = a11;
            this.L$1 = translateViewModel;
            this.L$2 = composerAsyncWidgetResponse2;
            this.label = 2;
            if (w0Var.emit(success, this) != aVar) {
                obj2 = a11;
                composerAsyncWidgetResponse = composerAsyncWidgetResponse2;
                w0Var2 = translateViewModel._widgetUpdate;
                state = composerAsyncWidgetResponse.getState();
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (w0Var2.emit(state, this) != aVar) {
                }
            }
            return aVar;
        }
        a.b bVar22 = Lm0.a.f17149a;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        TranslateViewModel translateViewModel322 = this.this$0;
        b12 = r.b(a11);
        if (b12 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TranslateViewModel$fetchAsyncWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
