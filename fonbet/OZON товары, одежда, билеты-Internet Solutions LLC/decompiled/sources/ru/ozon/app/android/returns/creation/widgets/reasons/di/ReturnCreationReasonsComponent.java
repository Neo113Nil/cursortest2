package ru.ozon.app.android.returns.creation.widgets.reasons.di;

import Gr.C3127b;
import Pc.a;
import Vg.d;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.button.viewMapper.AddMoreButtonMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewMapper.HeaderMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper.ReasonMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001d2\u00060\u0001j\u0002`\u0002:\u0001\u001dR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewMapper/HeaderMapper;", "getHeaderMapper", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewMapper/HeaderMapper;", "headerMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonMapper;", "getReasonMapper", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonMapper;", "reasonMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/button/viewMapper/AddMoreButtonMapper;", "getAddMoreButtonMapper", "()Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/button/viewMapper/AddMoreButtonMapper;", "addMoreButtonMapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "getInputViewModelProvider", "()LPc/a;", "inputViewModelProvider", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnCreationReasonsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsComponent$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lk20/e;", "Lru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Landroid/content/Context;)Lk20/e;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReturnCreationReasonsComponent create$lambda$0(Context context) {
            return new ReturnCreationReasonsComponent$Companion$create$1$1(context);
        }

        @NotNull
        public final C7473e<ReturnCreationReasonsComponent> create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C7473e<>(N.b(ReturnCreationReasonsComponent.class), new C3127b(context, 1));
        }
    }

    @NotNull
    AddMoreButtonMapper getAddMoreButtonMapper();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HeaderMapper getHeaderMapper();

    @NotNull
    a<InputViewModel> getInputViewModelProvider();

    @NotNull
    PostRefreshHandlerFactory getPostRefreshHandlerFactory();

    @NotNull
    ReasonMapper getReasonMapper();
}
