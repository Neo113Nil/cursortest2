package ru.ozon.app.android.returns.creation.widgets.selectedItems.di;

import DR.a;
import Vg.d;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewMapper.ReturnCreationSelectedItemMapper;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u000f\u001a\u00060\u000bj\u0002`\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/di/ReturnCreationSelectedItemsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewMapper/ReturnCreationSelectedItemMapper;", "getMapper", "()Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewMapper/ReturnCreationSelectedItemMapper;", "mapper", "Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "getPostRefreshHandlerFactory", "()Lru/ozon/app/android/returns/ui/domain/PostRefreshHandlerFactory;", "postRefreshHandlerFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "getReturnCreationEventManager", "()Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ReturnCreationSelectedItemsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/di/ReturnCreationSelectedItemsComponent$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lk20/e;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/di/ReturnCreationSelectedItemsComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Landroid/content/Context;)Lk20/e;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReturnCreationSelectedItemsComponent create$lambda$0(Context context) {
            return new ReturnCreationSelectedItemsComponent$Companion$create$1$1(context);
        }

        @NotNull
        public final C7473e<ReturnCreationSelectedItemsComponent> create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C7473e<>(N.b(ReturnCreationSelectedItemsComponent.class), new a(context, 17));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ReturnCreationSelectedItemMapper getMapper();

    @NotNull
    PostRefreshHandlerFactory getPostRefreshHandlerFactory();

    @NotNull
    ReturnCreationEventManager getReturnCreationEventManager();
}
