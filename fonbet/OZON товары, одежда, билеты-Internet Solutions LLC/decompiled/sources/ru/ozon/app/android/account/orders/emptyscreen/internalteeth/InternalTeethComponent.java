package ru.ozon.app.android.account.orders.emptyscreen.internalteeth;

import CS.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import j10.h;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.core.IslandSeparatorMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/IslandSeparatorMapper;", "getMapper", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/core/IslandSeparatorMapper;", "mapper", "Lj10/h$a;", "Lru/ozon/composer/ui/widget/l;", "getOverlayItemsHelper", "()Lj10/h$a;", "overlayItemsHelper", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InternalTeethComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InternalTeethComponent create$lambda$0(final C7475g c7475g) {
            return new InternalTeethComponent(c7475g) { // from class: ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(InternalTeethComponent$Companion$create$1$1$mapper$2.INSTANCE);
                private final RetainComposerComponentApi retainComposerComponentApi;

                {
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                }

                @Override // ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethComponent
                public IslandSeparatorMapper getMapper() {
                    return (IslandSeparatorMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethComponent
                public h.a<l> getOverlayItemsHelper() {
                    return this.retainComposerComponentApi.getComposerOverlayItemsHelper();
                }
            };
        }

        @NotNull
        public final C7473e<InternalTeethComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(InternalTeethComponent.class), new a(storage, 5));
        }
    }

    @NotNull
    IslandSeparatorMapper getMapper();

    @NotNull
    h.a<l> getOverlayItemsHelper();
}
