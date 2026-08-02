package ru.ozon.app.android.session.userAdultModalMobileV2.di;

import AT.a;
import Vg.c;
import hi.InterfaceC6958a;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithRefresh.ComposerActionWithRefreshCustomActionHandler;
import ru.ozon.app.android.session.userAdultModalMobileV2.handlers.ComposerActionWithActionHandlerV2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00032\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/di/UserAdultComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAdultComponent implements InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<Class<? extends CustomActionHandler>> customActionHandlers;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR%\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/di/UserAdultComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/session/userAdultModalMobileV2/di/IUserAdultContentComponent;", "create", "(Lk20/g;)Lk20/e;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "customActionHandlers", "Ljava/util/Set;", "getCustomActionHandlers", "()Ljava/util/Set;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IUserAdultContentComponent create$lambda$0(final C7475g c7475g) {
            return new IUserAdultContentComponent() { // from class: ru.ozon.app.android.session.userAdultModalMobileV2.di.UserAdultComponent$Companion$create$1$1
                @Override // ru.ozon.app.android.session.userAdultModalMobileV2.di.IUserAdultContentComponent
                public c getDefaultActionHandlers() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory().create(UserAdultComponent.INSTANCE.getCustomActionHandlers());
                }
            };
        }

        @NotNull
        public final C7473e<IUserAdultContentComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(IUserAdultContentComponent.class), new a(storage, 4));
        }

        @NotNull
        public final Set<Class<? extends CustomActionHandler>> getCustomActionHandlers() {
            return UserAdultComponent.customActionHandlers;
        }

        private Companion() {
        }
    }

    static {
        Class[] elements = {ComposerActionWithActionHandlerV2.class, ComposerActionAndRedirectActionHandler.class, ComposerActionWithRefreshCustomActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        customActionHandlers = C7705l.j0(elements);
    }
}
