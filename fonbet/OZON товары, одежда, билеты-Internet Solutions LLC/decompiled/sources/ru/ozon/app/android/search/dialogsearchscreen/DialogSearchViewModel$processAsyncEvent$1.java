package ru.ozon.app.android.search.dialogsearchscreen;

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
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarDTO;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarMapper;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$processAsyncEvent$1", f = "DialogSearchViewModel.kt", l = {345, 357}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$processAsyncEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $asyncData;
    final /* synthetic */ String $formattedText;
    final /* synthetic */ Map<String, String> $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$processAsyncEvent$1(DialogSearchViewModel dialogSearchViewModel, String str, Map<String, String> map, String str2, d<? super DialogSearchViewModel$processAsyncEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchViewModel;
        this.$asyncData = str;
        this.$params = map;
        this.$formattedText = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchViewModel$processAsyncEvent$1 dialogSearchViewModel$processAsyncEvent$1 = new DialogSearchViewModel$processAsyncEvent$1(this.this$0, this.$asyncData, this.$params, this.$formattedText, dVar);
        dialogSearchViewModel$processAsyncEvent$1.L$0 = obj;
        return dialogSearchViewModel$processAsyncEvent$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DialogSearchViewModel$processAsyncEvent$1 dialogSearchViewModel$processAsyncEvent$1;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        Throwable th2;
        Object a11;
        Object obj2;
        String str;
        DialogSearchBarVO dialogSearchBarVO;
        DialogSearchBarMapper dialogSearchBarMapper;
        w0 w0Var;
        String str2;
        DialogSearchViewModel dialogSearchViewModel;
        DialogSearchBarVO dialogSearchBarVO2;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            DialogSearchViewModel dialogSearchViewModel2 = this.this$0;
            String str3 = this.$asyncData;
            Map<String, String> map = this.$params;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = dialogSearchViewModel2.asyncWidgetRepository;
                this.label = 1;
                dialogSearchViewModel$processAsyncEvent$1 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str3, map, DialogSearchBarDTO.class, null, dialogSearchViewModel$processAsyncEvent$1, 8, null);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    obj2 = a11;
                    String str4 = dialogSearchViewModel$processAsyncEvent$1.$formattedText;
                    DialogSearchViewModel dialogSearchViewModel3 = dialogSearchViewModel$processAsyncEvent$1.this$0;
                    if (!(obj2 instanceof r.b)) {
                    }
                    a.b bVar = Lm0.a.f17149a;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th4) {
                th = th4;
                dialogSearchViewModel$processAsyncEvent$1 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                String str42 = dialogSearchViewModel$processAsyncEvent$1.$formattedText;
                DialogSearchViewModel dialogSearchViewModel32 = dialogSearchViewModel$processAsyncEvent$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar2 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dialogSearchBarVO2 = (DialogSearchBarVO) this.L$3;
                dialogSearchViewModel = (DialogSearchViewModel) this.L$2;
                str2 = (String) this.L$1;
                obj2 = this.L$0;
                s.b(obj);
                dialogSearchViewModel.handlePageRefresh(dialogSearchBarVO2);
                dialogSearchViewModel.localSearchBarModel = dialogSearchBarVO2;
                dialogSearchViewModel.prevSearchValue = str2;
                a.b bVar22 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                    bVar22.e(b11);
                }
                return Unit.f71690a;
            }
            try {
                s.b(obj);
                dialogSearchViewModel$processAsyncEvent$1 = this;
            } catch (Throwable th5) {
                th2 = th5;
                dialogSearchViewModel$processAsyncEvent$1 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                String str422 = dialogSearchViewModel$processAsyncEvent$1.$formattedText;
                DialogSearchViewModel dialogSearchViewModel322 = dialogSearchViewModel$processAsyncEvent$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                a.b bVar222 = Lm0.a.f17149a;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        String str4222 = dialogSearchViewModel$processAsyncEvent$1.$formattedText;
        DialogSearchViewModel dialogSearchViewModel3222 = dialogSearchViewModel$processAsyncEvent$1.this$0;
        if (!(obj2 instanceof r.b)) {
            ComposerAsyncWidgetResponse composerAsyncWidgetResponse = (ComposerAsyncWidgetResponse) obj2;
            str = dialogSearchViewModel3222.currentSearchQuery;
            if (Intrinsics.d(str4222, str)) {
                dialogSearchBarVO = dialogSearchViewModel3222.localSearchBarModel;
                if (dialogSearchBarVO == null) {
                    return Unit.f71690a;
                }
                long id2 = dialogSearchBarVO.getId();
                dialogSearchBarMapper = dialogSearchViewModel3222.mapper;
                DialogSearchBarVO mapDTOToVO = dialogSearchBarMapper.mapDTOToVO((DialogSearchBarDTO) composerAsyncWidgetResponse.getState(), null, id2);
                w0Var = dialogSearchViewModel3222._searchBarModel;
                dialogSearchViewModel$processAsyncEvent$1.L$0 = obj2;
                dialogSearchViewModel$processAsyncEvent$1.L$1 = str4222;
                dialogSearchViewModel$processAsyncEvent$1.L$2 = dialogSearchViewModel3222;
                dialogSearchViewModel$processAsyncEvent$1.L$3 = mapDTOToVO;
                dialogSearchViewModel$processAsyncEvent$1.label = 2;
                if (w0Var.emit(mapDTOToVO, this) != aVar) {
                    str2 = str4222;
                    dialogSearchViewModel = dialogSearchViewModel3222;
                    dialogSearchBarVO2 = mapDTOToVO;
                    dialogSearchViewModel.handlePageRefresh(dialogSearchBarVO2);
                    dialogSearchViewModel.localSearchBarModel = dialogSearchBarVO2;
                    dialogSearchViewModel.prevSearchValue = str2;
                }
                return aVar;
            }
        }
        a.b bVar2222 = Lm0.a.f17149a;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DialogSearchViewModel$processAsyncEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
