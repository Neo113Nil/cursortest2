package ru.ozon.app.android.ugc.core.widgets.selectionReactions.di;

import Av.C2447a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \b2\u00060\u0001j\u0002`\u0002:\u0001\bR\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/di/SelectionReactionsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SelectionReactionsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/di/SelectionReactionsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/di/SelectionReactionsComponent;", "getInstance", "(Lk20/g;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SelectionReactionsComponent getInstance$lambda$0(final C7475g c7475g) {
            return new SelectionReactionsComponent(c7475g) { // from class: ru.ozon.app.android.ugc.core.widgets.selectionReactions.di.SelectionReactionsComponent$Companion$getInstance$1$1

                /* renamed from: customActionHandlersStoreFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j customActionHandlersStoreFactory;

                {
                    this.customActionHandlersStoreFactory = k.b(new SelectionReactionsComponent$Companion$getInstance$1$1$customActionHandlersStoreFactory$2(c7475g));
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.selectionReactions.di.SelectionReactionsComponent
                public d getCustomActionHandlersStoreFactory() {
                    return (d) this.customActionHandlersStoreFactory.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<SelectionReactionsComponent> getInstance(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SelectionReactionsComponent.class), new C2447a(storage, 12));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();
}
