package ru.ozon.app.android.ugc.widgets.newquestionform.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewModelImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPc/a;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "kotlin.jvm.PlatformType", "invoke", "()LPc/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NewQuestionFormComponent$Companion$getInstance$1$1$viewModelProvider$2 extends AbstractC7737t implements Function0<Pc.a<NewQuestionFormViewModelImpl>> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewQuestionFormComponent$Companion$getInstance$1$1$viewModelProvider$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewQuestionFormViewModelImpl invoke$lambda$0(C7475g c7475g) {
        return new NewQuestionFormViewModelImpl(((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class)).getActionRepository());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Pc.a<NewQuestionFormViewModelImpl> invoke() {
        final C7475g c7475g = this.$storage;
        return new Pc.a() { // from class: ru.ozon.app.android.ugc.widgets.newquestionform.di.a
            @Override // Pc.a
            public final Object get() {
                NewQuestionFormViewModelImpl invoke$lambda$0;
                invoke$lambda$0 = NewQuestionFormComponent$Companion$getInstance$1$1$viewModelProvider$2.invoke$lambda$0(C7475g.this);
                return invoke$lambda$0;
            }
        };
    }
}
