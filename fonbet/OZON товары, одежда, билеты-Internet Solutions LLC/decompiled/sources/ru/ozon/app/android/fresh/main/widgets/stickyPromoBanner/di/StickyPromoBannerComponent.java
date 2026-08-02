package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di;

import AO.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.c;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.data.StickyPromoBannerMapper;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/di/StickyPromoBannerComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerMapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerMapper;", "mapper", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "getCustomActionHandlersProvider", "()Lkotlin/jvm/functions/Function0;", "customActionHandlersProvider", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StickyPromoBannerComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/di/StickyPromoBannerComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/di/StickyPromoBannerComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StickyPromoBannerComponent create$lambda$0(final C7475g c7475g) {
            return new StickyPromoBannerComponent(c7475g) { // from class: ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di.StickyPromoBannerComponent$Companion$create$1$1
                private final Function0<c> customActionHandlersProvider;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(StickyPromoBannerComponent$Companion$create$1$1$mapper$2.INSTANCE);

                {
                    this.customActionHandlersProvider = new StickyPromoBannerComponent$Companion$create$1$1$customActionHandlersProvider$1(c7475g);
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di.StickyPromoBannerComponent
                public Function0<c> getCustomActionHandlersProvider() {
                    return this.customActionHandlersProvider;
                }

                @Override // ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di.StickyPromoBannerComponent
                public StickyPromoBannerMapper getMapper() {
                    return (StickyPromoBannerMapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<StickyPromoBannerComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(StickyPromoBannerComponent.class), new a(storage, 4));
        }
    }

    @NotNull
    Function0<c> getCustomActionHandlersProvider();

    @NotNull
    StickyPromoBannerMapper getMapper();
}
