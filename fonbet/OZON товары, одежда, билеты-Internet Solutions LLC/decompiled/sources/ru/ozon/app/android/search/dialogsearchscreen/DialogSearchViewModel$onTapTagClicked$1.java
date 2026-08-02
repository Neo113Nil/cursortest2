package ru.ozon.app.android.search.dialogsearchscreen;

import Ae.w0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$onTapTagClicked$1", f = "DialogSearchViewModel.kt", l = {326, 327}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$onTapTagClicked$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    final /* synthetic */ String $newQuery;
    int label;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$onTapTagClicked$1(String str, DialogSearchViewModel dialogSearchViewModel, AtomAction.Click click, d<? super DialogSearchViewModel$onTapTagClicked$1> dVar) {
        super(2, dVar);
        this.$newQuery = str;
        this.this$0 = dialogSearchViewModel;
        this.$action = click;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DialogSearchViewModel$onTapTagClicked$1(this.$newQuery, this.this$0, this.$action, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r5 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r5.emit(r1, r4) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        Object refreshPage;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            String str = this.$newQuery;
            if (str != null && str.length() != 0) {
                this.this$0.wasTextChangedByTapTag = true;
            }
            w0Var = this.this$0._tapTagQuery;
            String str2 = this.$newQuery;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        DialogSearchViewModel dialogSearchViewModel = this.this$0;
        String link = this.$action.getLink();
        this.label = 2;
        refreshPage = dialogSearchViewModel.refreshPage(link, false, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DialogSearchViewModel$onTapTagClicked$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
