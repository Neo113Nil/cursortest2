package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di;

import DP.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonDIComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonViewModelFactory;", "getViewModelFactory", "()Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonViewModelFactory;", "viewModelFactory", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FloatCartButtonDIComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonDIComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonDIComponent;", "create", "(Lk20/g;)Lk20/e;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FloatCartButtonDIComponent create$lambda$0(final C7475g c7475g) {
            return new FloatCartButtonDIComponent() { // from class: ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent$Companion$create$1$1

                /* renamed from: viewModelFactory$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModelFactory;

                {
                    this.viewModelFactory = k.b(new FloatCartButtonDIComponent$Companion$create$1$1$viewModelFactory$2(C7475g.this));
                }

                @Override // ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }

                @Override // ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent
                public FloatCartButtonViewModelFactory getViewModelFactory() {
                    return (FloatCartButtonViewModelFactory) this.viewModelFactory.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<FloatCartButtonDIComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(FloatCartButtonDIComponent.class), new a(storage, 3));
        }
    }

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    FloatCartButtonViewModelFactory getViewModelFactory();
}
