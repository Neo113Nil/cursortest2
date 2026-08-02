package ru.ozon.app.android.ugc.widgets.newquestionform.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.ugc.widgets.newquestionform.core.NewQuestionFormMapper;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewModelImpl;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/di/NewQuestionFormComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/ugc/widgets/newquestionform/core/NewQuestionFormMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/newquestionform/core/NewQuestionFormMapper;", "mapper", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NewQuestionFormComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/di/NewQuestionFormComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/widgets/newquestionform/di/NewQuestionFormComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NewQuestionFormComponent getInstance$lambda$0(final C7475g c7475g) {
            return new NewQuestionFormComponent(c7475g) { // from class: ru.ozon.app.android.ugc.widgets.newquestionform.di.NewQuestionFormComponent$Companion$getInstance$1$1

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(NewQuestionFormComponent$Companion$getInstance$1$1$handlersInhibitor$2.INSTANCE);

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(NewQuestionFormComponent$Companion$getInstance$1$1$mapper$2.INSTANCE);

                /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModelProvider;

                {
                    this.viewModelProvider = k.b(new NewQuestionFormComponent$Companion$getInstance$1$1$viewModelProvider$2(c7475g));
                }

                @Override // ru.ozon.app.android.ugc.widgets.newquestionform.di.NewQuestionFormComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.newquestionform.di.NewQuestionFormComponent
                public NewQuestionFormMapper getMapper() {
                    return (NewQuestionFormMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.widgets.newquestionform.di.NewQuestionFormComponent
                public Pc.a<NewQuestionFormViewModelImpl> getViewModelProvider() {
                    return (Pc.a) this.viewModelProvider.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<NewQuestionFormComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(NewQuestionFormComponent.class), new DR.a(storage, 10));
        }
    }

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    NewQuestionFormMapper getMapper();

    @NotNull
    Pc.a<NewQuestionFormViewModelImpl> getViewModelProvider();
}
