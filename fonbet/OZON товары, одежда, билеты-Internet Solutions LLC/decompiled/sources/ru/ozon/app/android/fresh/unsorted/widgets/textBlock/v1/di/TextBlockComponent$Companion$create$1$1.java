package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Yx.b;
import kotlin.Metadata;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation.TextBlockMapper;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/di/TextBlockComponent$Companion$create$1$1", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/di/TextBlockComponent;", "LPc/a;", "Lru/ozon/app/android/fresh/navigation/CatalogTabsSharedViewModel;", "kotlin.jvm.PlatformType", "catalogTabsSharedViewModel", "LPc/a;", "getCatalogTabsSharedViewModel", "()LPc/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockMapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextBlockComponent$Companion$create$1$1 implements TextBlockComponent {
    private final a<CatalogTabsSharedViewModel> catalogTabsSharedViewModel = new b(0);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(TextBlockComponent$Companion$create$1$1$mapper$2.INSTANCE);

    TextBlockComponent$Companion$create$1$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CatalogTabsSharedViewModel catalogTabsSharedViewModel$lambda$0() {
        return new CatalogTabsSharedViewModel();
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.di.TextBlockComponent
    public a<CatalogTabsSharedViewModel> getCatalogTabsSharedViewModel() {
        return this.catalogTabsSharedViewModel;
    }

    @Override // ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.di.TextBlockComponent
    public TextBlockMapper getMapper() {
        return (TextBlockMapper) this.mapper.getValue();
    }
}
