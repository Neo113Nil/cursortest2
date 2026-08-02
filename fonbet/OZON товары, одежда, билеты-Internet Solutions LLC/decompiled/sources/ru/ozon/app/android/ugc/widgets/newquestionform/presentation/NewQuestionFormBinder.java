package ru.ozon.app.android.ugc.widgets.newquestionform.presentation;

import Sc.o;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.Action;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormBinder;", "", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormView;", "view", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModel;", "viewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormView;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModel;Landroidx/lifecycle/J;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewQuestionFormBinder {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Action, Unit> {
        final /* synthetic */ NewQuestionFormView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewQuestionFormView newQuestionFormView) {
            super(1);
            this.$view = newQuestionFormView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Action action) {
            if (action instanceof Action.Item) {
                this.$view.bind(((Action.Item) action).getVo());
            } else if (Intrinsics.d(action, Action.ShowProgress.INSTANCE)) {
                this.$view.onShowProgress();
            } else if (Intrinsics.d(action, Action.HideProgress.INSTANCE)) {
                this.$view.onHideProgress();
            } else if (action instanceof Action.Success) {
                this.$view.onSuccess();
            } else if (action instanceof Action.InputError) {
                this.$view.onInputError(((Action.InputError) action).getMessage());
            } else if (action instanceof Action.NetworkError) {
                this.$view.onNetworkError();
            } else {
                if (!(action instanceof Action.UnknownError)) {
                    throw new o();
                }
                this.$view.onUnknownError();
            }
            WhenExtKt.getExhaustive(Unit.f71690a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormBinder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<String, Boolean, Unit> {
        AnonymousClass2(Object obj) {
            super(2, obj, NewQuestionFormViewModel.class, "submit", "submit(Ljava/lang/String;Ljava/lang/Boolean;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
            invoke2(str, bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p02, Boolean bool) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((NewQuestionFormViewModel) this.receiver).submit(p02, bool);
        }
    }

    public NewQuestionFormBinder(@NotNull NewQuestionFormView view, @NotNull NewQuestionFormViewModel viewModel, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        viewModel.getActionLiveData().observe(lifecycleOwner, new NewQuestionFormBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(view)));
        view.setOnSubmit(new AnonymousClass2(viewModel));
    }
}
