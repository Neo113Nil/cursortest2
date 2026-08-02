package ru.ozon.app.android.commonwidgets.actionHandlersFactory.di;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.CommonActionHandlersStore;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/di/CommonActionHandlersFactoryModule;", "", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CommonActionHandlersFactoryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/commonwidgets/actionHandlersFactory/di/CommonActionHandlersFactoryModule$Companion;", "", "<init>", "()V", "provideCommonHandlersStore", "Lru/ozon/app/android/commonwidgets/actionHandlersFactory/CommonActionHandlersStore;", "context", "Landroid/content/Context;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CommonActionHandlersStore provideCommonHandlersStore(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CustomActionHandlersComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component CustomActionHandlersComponentDependencies is not DiComponent");
            }
            C6740b dependencyStorage = C6739a.a(context, CustomActionHandlersComponentDependencies.class).getDependencyStorage();
            if (CustomActionHandlersComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component CustomActionHandlersComponentDependencies is not DiComponent");
            }
            return new CommonActionHandlersStore(((CustomActionHandlersComponentDependencies) dependencyStorage.b(CustomActionHandlersComponentDependencies.class)).getCustomWidgetActionHandler());
        }

        private Companion() {
        }
    }
}
