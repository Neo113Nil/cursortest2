package ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes;

import Cs.d;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesMapper;", "getUserLikesMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesMapper;", "userLikesMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UserLikesComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/userLikes/UserLikesComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "()Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UserLikesComponent create$lambda$0() {
            return new UserLikesComponent() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes.UserLikesComponent$Companion$create$1$1

                /* renamed from: userLikesMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j userLikesMapper = k.b(UserLikesComponent$Companion$create$1$1$userLikesMapper$2.INSTANCE);

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(UserLikesComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes.UserLikesComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes.UserLikesComponent
                public UserLikesMapper getUserLikesMapper() {
                    return (UserLikesMapper) this.userLikesMapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<UserLikesComponent> create() {
            return new C7473e<>(N.b(UserLikesComponent.class), new d(1));
        }
    }

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    UserLikesMapper getUserLikesMapper();
}
