package ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import qP.C9006a;
import ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.data.ScrollAnchorMapper;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollAnchorViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/di/ScrollAnchorComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/data/ScrollAnchorMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/data/ScrollAnchorMapper;", "mapper", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "getScrollAnchorViewModel", "()Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollAnchorViewModel;", "scrollAnchorViewModel", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ScrollAnchorComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/di/ScrollAnchorComponent$Companion;", "", "<init>", "()V", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/scrollAnchor/v1/di/ScrollAnchorComponent;", "create", "()Lk20/e;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ScrollAnchorComponent create$lambda$0() {
            return new ScrollAnchorComponent() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.di.ScrollAnchorComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ScrollAnchorComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.di.ScrollAnchorComponent
                public ScrollAnchorMapper getMapper() {
                    return (ScrollAnchorMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.scrollAnchor.v1.di.ScrollAnchorComponent
                public ScrollAnchorViewModel getScrollAnchorViewModel() {
                    return new ScrollAnchorViewModel();
                }
            };
        }

        @NotNull
        public final C7473e<ScrollAnchorComponent> create() {
            return new C7473e<>(N.b(ScrollAnchorComponent.class), new C9006a());
        }
    }

    @NotNull
    ScrollAnchorMapper getMapper();

    @NotNull
    ScrollAnchorViewModel getScrollAnchorViewModel();
}
