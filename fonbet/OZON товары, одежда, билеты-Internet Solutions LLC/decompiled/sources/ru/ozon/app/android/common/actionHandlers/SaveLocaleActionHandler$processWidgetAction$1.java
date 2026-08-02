package ru.ozon.app.android.common.actionHandlers;

import Sc.s;
import Vg.f;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.locale.app.data.AppLocaleRepository;
import ru.ozon.app.android.composer.ComposerReferences;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.SaveLocaleActionHandler$processWidgetAction$1", f = "SaveLocaleActionHandler.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SaveLocaleActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $languageCode;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ SaveLocaleActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveLocaleActionHandler$processWidgetAction$1(SaveLocaleActionHandler saveLocaleActionHandler, String str, ComposerReferences composerReferences, f.a aVar, d<? super SaveLocaleActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = saveLocaleActionHandler;
        this.$languageCode = str;
        this.$refs = composerReferences;
        this.$widgetInfo = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaveLocaleActionHandler$processWidgetAction$1(this.this$0, this.$languageCode, this.$refs, this.$widgetInfo, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AppLocaleRepository appLocaleRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
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
            this.$refs.getController().update(new UpdateCellRadioSelectionKey(this.$widgetInfo.c().f()));
        } finally {
            try {
                return Unit.f71690a;
            } finally {
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaveLocaleActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
