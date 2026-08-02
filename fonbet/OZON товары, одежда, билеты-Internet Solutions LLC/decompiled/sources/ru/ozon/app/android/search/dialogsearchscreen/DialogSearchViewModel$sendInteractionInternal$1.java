package ru.ozon.app.android.search.dialogsearchscreen;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.DialogSearchInteractionsApi;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.DialogSearchInteractionsRequest;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$sendInteractionInternal$1", f = "DialogSearchViewModel.kt", l = {267}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$sendInteractionInternal$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ DialogSearchInteractionsRequest $request;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$sendInteractionInternal$1(DialogSearchViewModel dialogSearchViewModel, DialogSearchInteractionsRequest dialogSearchInteractionsRequest, Function0<Unit> function0, d<? super DialogSearchViewModel$sendInteractionInternal$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchViewModel;
        this.$request = dialogSearchInteractionsRequest;
        this.$onSuccess = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchViewModel$sendInteractionInternal$1 dialogSearchViewModel$sendInteractionInternal$1 = new DialogSearchViewModel$sendInteractionInternal$1(this.this$0, this.$request, this.$onSuccess, dVar);
        dialogSearchViewModel$sendInteractionInternal$1.L$0 = obj;
        return dialogSearchViewModel$sendInteractionInternal$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        DialogSearchInteractionsApi dialogSearchInteractionsApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                DialogSearchViewModel dialogSearchViewModel = this.this$0;
                DialogSearchInteractionsRequest dialogSearchInteractionsRequest = this.$request;
                r.Companion companion = r.INSTANCE;
                dialogSearchInteractionsApi = dialogSearchViewModel.dialogSearchInteractionsApi;
                this.label = 1;
                if (dialogSearchInteractionsApi.sendDialogSearchInteractions("sendDialogSearchInteractions", dialogSearchInteractionsRequest, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Function0<Unit> function0 = this.$onSuccess;
        if (!(a11 instanceof r.b)) {
            if (function0 != null) {
                function0.invoke();
            }
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Lm0.a.f17149a.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DialogSearchViewModel$sendInteractionInternal$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
