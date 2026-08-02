package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import Ae.w0;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.pdp.widgets.translateButton.data.TranslateAttributesRepository;
import ru.ozon.app.android.pdp.widgets.translateButton.data.TranslateAttributesRequest;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.utils.Result;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel$translateProductAttributes$1", f = "TranslateViewModel.kt", l = {46, 50, 53, 56, 59}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TranslateViewModel$translateProductAttributes$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    final /* synthetic */ List<String> $attributeKeys;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TranslateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TranslateViewModel$translateProductAttributes$1(AtomAction.Click click, TranslateViewModel translateViewModel, List<String> list, d<? super TranslateViewModel$translateProductAttributes$1> dVar) {
        super(2, dVar);
        this.$action = click;
        this.this$0 = translateViewModel;
        this.$attributeKeys = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TranslateViewModel$translateProductAttributes$1(this.$action, this.this$0, this.$attributeKeys, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e9, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fe, code lost:
    
        if (r14 == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r14.emit(r1, r13) == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Long y02;
        w0 w0Var;
        String str2;
        TranslateViewModel translateViewModel;
        List<String> list;
        long j11;
        Set set;
        TranslateAttributesRepository translateAttributesRepository;
        long j12;
        w0 w0Var2;
        Result result;
        Object handleError;
        Set set2;
        w0 w0Var3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            String link = this.$action.getLink();
            if (link != null) {
                AtomAction.Click click = this.$action;
                TranslateViewModel translateViewModel2 = this.this$0;
                List<String> list2 = this.$attributeKeys;
                Map<String, String> params = click.getParams();
                if (params != null && (str = params.get("sku")) != null && (y02 = h.y0(str)) != null) {
                    long longValue = y02.longValue();
                    w0Var = translateViewModel2._translateState;
                    TranslateViewModel.TranslateState.Loading loading = TranslateViewModel.TranslateState.Loading.INSTANCE;
                    this.L$0 = translateViewModel2;
                    this.L$1 = list2;
                    this.L$2 = link;
                    this.J$0 = longValue;
                    this.label = 1;
                    if (w0Var.emit(loading, this) != aVar) {
                        str2 = link;
                        translateViewModel = translateViewModel2;
                        list = list2;
                        j11 = longValue;
                        set = translateViewModel.translatedWidgets;
                        if (set.contains(new Long(j11))) {
                        }
                    }
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    j12 = this.J$0;
                    translateViewModel = (TranslateViewModel) this.L$0;
                    s.b(obj);
                    result = (Result) obj;
                    if (!(result instanceof Result.Success)) {
                        set2 = translateViewModel.translatedWidgets;
                        set2.add(new Long(j12));
                        w0Var3 = translateViewModel._translateState;
                        TranslateViewModel.TranslateState.Translated translated = TranslateViewModel.TranslateState.Translated.INSTANCE;
                        this.L$0 = null;
                        this.label = 4;
                    } else {
                        if (!(result instanceof Result.Failure)) {
                            throw new o();
                        }
                        Throwable throwable = ((Result.Failure) result).getThrowable();
                        this.L$0 = null;
                        this.label = 5;
                        handleError = translateViewModel.handleError(throwable, this);
                    }
                } else if (i11 != 4 && i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            s.b(obj);
            return Unit.f71690a;
        }
        j11 = this.J$0;
        String str3 = (String) this.L$2;
        list = (List) this.L$1;
        TranslateViewModel translateViewModel3 = (TranslateViewModel) this.L$0;
        s.b(obj);
        str2 = str3;
        translateViewModel = translateViewModel3;
        set = translateViewModel.translatedWidgets;
        if (set.contains(new Long(j11))) {
            TranslateAttributesRequest translateAttributesRequest = new TranslateAttributesRequest(j11, list);
            translateAttributesRepository = translateViewModel.translateAttributesRepository;
            this.L$0 = translateViewModel;
            this.L$1 = null;
            this.L$2 = null;
            this.J$0 = j11;
            this.label = 3;
            obj = translateAttributesRepository.translateAttributes(str2, translateAttributesRequest, this);
            if (obj != aVar) {
                j12 = j11;
                result = (Result) obj;
                if (!(result instanceof Result.Success)) {
                }
            }
        } else {
            w0Var2 = translateViewModel._translateState;
            TranslateViewModel.TranslateState.Translated translated2 = TranslateViewModel.TranslateState.Translated.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TranslateViewModel$translateProductAttributes$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
