package ru.ozon.app.android.storefront.widgets.scrollAnchor.di;

import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.scrollAnchor.data.ScrollAnchorMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/scrollAnchor/di/ScrollAnchorComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi$delegate", "LSc/j;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/storefront/widgets/scrollAnchor/data/ScrollAnchorMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/storefront/widgets/scrollAnchor/data/ScrollAnchorMapper;", "mapper", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScrollAnchorComponent implements InterfaceC6958a {

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    /* renamed from: networkComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j networkComponentApi;

    public ScrollAnchorComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.networkComponentApi = k.b(new ScrollAnchorComponent$networkComponentApi$2(storage));
        this.mapper = k.b(ScrollAnchorComponent$mapper$2.INSTANCE);
    }

    @NotNull
    public final ScrollAnchorMapper getMapper() {
        return (ScrollAnchorMapper) this.mapper.getValue();
    }
}
