package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import Bc.f;
import Bc.i;
import Bc.t;
import Bc.u;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.C;
import io.reactivex.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;
import qc.g;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data.SearchSheetRepository;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", SearchIntents.EXTRA_QUERY, "Lio/reactivex/C;", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SearchSheetViewModelImpl$bindInitial$2 extends AbstractC7737t implements Function1<String, C<? extends List<? extends SuggestVO>>> {
    final /* synthetic */ SearchSheetFragment.Data $data;
    final /* synthetic */ SearchSheetViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnc/b;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lnc/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModelImpl$bindInitial$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InterfaceC8487b, Unit> {
        final /* synthetic */ SearchSheetViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SearchSheetViewModelImpl searchSheetViewModelImpl) {
            super(1);
            this.this$0 = searchSheetViewModelImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8487b interfaceC8487b) {
            invoke2(interfaceC8487b);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC8487b interfaceC8487b) {
            if (this.this$0.getLoader().getValue() == null) {
                this.this$0.getLoader().postValue(Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSheetViewModelImpl$bindInitial$2(SearchSheetViewModelImpl searchSheetViewModelImpl, SearchSheetFragment.Data data) {
        super(1);
        this.this$0 = searchSheetViewModelImpl;
        this.$data = data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invoke$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return K.f71697a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(SearchSheetViewModelImpl searchSheetViewModelImpl) {
        searchSheetViewModelImpl.getLoader().postValue(Boolean.FALSE);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends List<SuggestVO>> invoke(String query) {
        SearchSheetRepository searchSheetRepository;
        String makeLink;
        Intrinsics.checkNotNullParameter(query, "query");
        searchSheetRepository = this.this$0.repository;
        makeLink = this.this$0.makeLink(query, this.$data.getSearchOptions().getLink());
        y<List<SuggestVO>> suggests = searchSheetRepository.getSuggests(makeLink);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        g gVar = new g() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.a
            @Override // qc.g
            public final void accept(Object obj) {
                Function1.this.invoke(obj);
            }
        };
        suggests.getClass();
        t g10 = new u(new i(suggests, gVar).j(C8125a.a()), new b()).g(C8125a.a());
        final SearchSheetViewModelImpl searchSheetViewModelImpl = this.this$0;
        return new f(g10, new InterfaceC9019a() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                SearchSheetViewModelImpl$bindInitial$2.invoke$lambda$2(SearchSheetViewModelImpl.this);
            }
        });
    }
}
