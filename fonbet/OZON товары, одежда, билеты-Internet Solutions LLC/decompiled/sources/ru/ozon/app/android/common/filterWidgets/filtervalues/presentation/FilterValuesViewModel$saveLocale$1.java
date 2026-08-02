package ru.ozon.app.android.common.filterWidgets.filtervalues.presentation;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.FilterValuesViewModel$saveLocale$1", f = "FilterValuesViewModel.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class FilterValuesViewModel$saveLocale$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ String $languageCode;
    int label;
    final /* synthetic */ FilterValuesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FilterValuesViewModel$saveLocale$1(FilterValuesViewModel filterValuesViewModel, String str, AtomAction.ComposerAction composerAction, d<? super FilterValuesViewModel$saveLocale$1> dVar) {
        super(2, dVar);
        this.this$0 = filterValuesViewModel;
        this.$languageCode = str;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FilterValuesViewModel$saveLocale$1(this.this$0, this.$languageCode, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AppLocaleRepository appLocaleRepository;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.getViewModelAction().setValue(FilterValuesViewModel.Action.ShowLoader.INSTANCE);
            appLocaleRepository = this.this$0.appLocaleRepository;
            String str = this.$languageCode;
            this.label = 1;
            if (appLocaleRepository.setApplicationLocale(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.getViewModelAction().setValue(new FilterValuesViewModel.Action.TrackChangeLocaleAction(this.$action));
        this.this$0.getViewModelAction().setValue(FilterValuesViewModel.Action.HideLoader.INSTANCE);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FilterValuesViewModel$saveLocale$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
