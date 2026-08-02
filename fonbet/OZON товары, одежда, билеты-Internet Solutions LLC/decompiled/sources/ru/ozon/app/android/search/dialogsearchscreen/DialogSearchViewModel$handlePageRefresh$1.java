package ru.ozon.app.android.search.dialogsearchscreen;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$handlePageRefresh$1", f = "DialogSearchViewModel.kt", l = {373, 375}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$handlePageRefresh$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $inputText;
    final /* synthetic */ String $refreshUrl;
    final /* synthetic */ String $refreshedSText;
    final /* synthetic */ DialogSearchBarVO $vo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$handlePageRefresh$1(DialogSearchBarVO dialogSearchBarVO, String str, DialogSearchViewModel dialogSearchViewModel, String str2, String str3, d<? super DialogSearchViewModel$handlePageRefresh$1> dVar) {
        super(2, dVar);
        this.$vo = dialogSearchBarVO;
        this.$inputText = str;
        this.this$0 = dialogSearchViewModel;
        this.$refreshedSText = str2;
        this.$refreshUrl = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchViewModel$handlePageRefresh$1 dialogSearchViewModel$handlePageRefresh$1 = new DialogSearchViewModel$handlePageRefresh$1(this.$vo, this.$inputText, this.this$0, this.$refreshedSText, this.$refreshUrl, dVar);
        dialogSearchViewModel$handlePageRefresh$1.L$0 = obj;
        return dialogSearchViewModel$handlePageRefresh$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel.refreshPage$default(r3, r4, false, r6, 2, null) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Long debounceMs;
        String str;
        String str2;
        DialogSearchViewModel$handlePageRefresh$1 dialogSearchViewModel$handlePageRefresh$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            DialogSearchBarVO.RefreshInfoVO pageRefresh = this.$vo.getPageRefresh();
            long longValue = (pageRefresh == null || (debounceMs = pageRefresh.getDebounceMs()) == null) ? 500L : debounceMs.longValue();
            this.L$0 = m11;
            this.label = 1;
            if (Y.b(longValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                dialogSearchViewModel$handlePageRefresh$1 = this;
                dialogSearchViewModel$handlePageRefresh$1.this$0.lastRefreshedSText = dialogSearchViewModel$handlePageRefresh$1.$refreshedSText;
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        if (N.f(m11)) {
            String str3 = this.$inputText;
            str = this.this$0.currentSearchQuery;
            if (Intrinsics.d(str3, str)) {
                String str4 = this.$refreshedSText;
                str2 = this.this$0.lastRefreshedSText;
                if (!Intrinsics.d(str4, str2)) {
                    DialogSearchViewModel dialogSearchViewModel = this.this$0;
                    String str5 = this.$refreshUrl;
                    this.L$0 = null;
                    this.label = 2;
                    dialogSearchViewModel$handlePageRefresh$1 = this;
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DialogSearchViewModel$handlePageRefresh$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
