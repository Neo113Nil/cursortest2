package ru.ozon.app.android.marketing.widgets.promoStickyBubble.di;

import EN.a;
import Vg.c;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/di/PromoStickyBubbleComponent;", "Lhi/a;", "Lkotlin/Function0;", "LVg/c;", "getCustomActionHandlersProvider", "()Lkotlin/jvm/functions/Function0;", "customActionHandlersProvider", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PromoStickyBubbleComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/di/PromoStickyBubbleComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/di/PromoStickyBubbleComponent;", "create", "(Lk20/g;)Lk20/e;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromoStickyBubbleComponent create$lambda$0(final C7475g c7475g) {
            return new PromoStickyBubbleComponent(c7475g) { // from class: ru.ozon.app.android.marketing.widgets.promoStickyBubble.di.PromoStickyBubbleComponent$Companion$create$1$1
                private final Function0<c> customActionHandlersProvider;

                {
                    this.customActionHandlersProvider = new PromoStickyBubbleComponent$Companion$create$1$1$customActionHandlersProvider$1(c7475g);
                }

                @Override // ru.ozon.app.android.marketing.widgets.promoStickyBubble.di.PromoStickyBubbleComponent
                public Function0<c> getCustomActionHandlersProvider() {
                    return this.customActionHandlersProvider;
                }
            };
        }

        @NotNull
        public final C7473e<PromoStickyBubbleComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PromoStickyBubbleComponent.class), new a(storage, 6));
        }
    }

    @NotNull
    Function0<c> getCustomActionHandlersProvider();
}
