package ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di;

import HT.a;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/di/ColoredLifecycleComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "getStorage", "()Lk20/g;", "storage", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ColoredLifecycleComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/di/ColoredLifecycleComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/widgets/debug/coloredlifecyclewidget/di/ColoredLifecycleComponent;", "invoke", "(Lk20/g;)Lk20/e;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ColoredLifecycleComponent invoke$lambda$0(final C7475g c7475g) {
            return new ColoredLifecycleComponent() { // from class: ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di.ColoredLifecycleComponent$Companion$invoke$1$1
                private final C7475g storage;

                {
                    this.storage = C7475g.this;
                }

                @Override // ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di.ColoredLifecycleComponent
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di.ColoredLifecycleComponent
                public C7475g getStorage() {
                    return this.storage;
                }
            };
        }

        @NotNull
        public final C7473e<ColoredLifecycleComponent> invoke(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ColoredLifecycleComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    C7475g getStorage();
}
