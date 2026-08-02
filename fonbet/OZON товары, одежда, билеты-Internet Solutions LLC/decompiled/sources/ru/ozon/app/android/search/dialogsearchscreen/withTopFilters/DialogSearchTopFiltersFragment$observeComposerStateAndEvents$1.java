package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import Sc.s;
import Wc.a;
import i10.C6997c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li10/c;", "Lru/ozon/composer/ui/widget/l;", "state", "", "<anonymous>", "(Li10/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1", f = "DialogSearchTopFiltersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1 extends j implements Function2<C6997c<l>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, DialogSearchTopFiltersFragment.class, "showShimmer", "showShimmer()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((DialogSearchTopFiltersFragment) this.receiver).showShimmer();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ DialogSearchTopFiltersFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment) {
            super(1);
            this.this$0 = dialogSearchTopFiltersFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.this$0.hideShimmer();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, d<? super DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1 dialogSearchTopFiltersFragment$observeComposerStateAndEvents$1 = new DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1(this.this$0, dVar);
        dialogSearchTopFiltersFragment$observeComposerStateAndEvents$1.L$0 = obj;
        return dialogSearchTopFiltersFragment$observeComposerStateAndEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C6997c<l> c6997c, d<? super Unit> dVar) {
        return ((DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1) create(c6997c, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DialogSearchBarVO updatedSearchBarVO;
        DialogSearchBarVO.RefreshInfoVO pageRefresh;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C6997c c6997c = (C6997c) this.L$0;
        if (!c6997c.o().b().c()) {
            updatedSearchBarVO = this.this$0.getUpdatedSearchBarVO(c6997c);
            String url = (updatedSearchBarVO == null || (pageRefresh = updatedSearchBarVO.getPageRefresh()) == null) ? null : pageRefresh.getUrl();
            if (url == null || url.length() == 0) {
                this.this$0.hideShimmer();
            } else {
                this.this$0.observePrefetchLoad(url, new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0));
            }
        }
        return Unit.f71690a;
    }
}
