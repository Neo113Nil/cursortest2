package ru.ozon.app.android.pdp.offline;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.emptyscreenfactory.DefaultEmptyScreenFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.GalleryV4WidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.PdpStatusWidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.PriceV4WidgetFactory;
import ru.ozon.app.android.pdp.offline.widgetfactory.TextProductNameWidgetFactory;
import z00.c;
import z00.d;
import z00.f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/offline/PdpOfflineScreenFactory;", "Lru/ozon/app/android/composer/emptyscreenfactory/DefaultEmptyScreenFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/GalleryV4WidgetFactory;", "galleryV4WidgetFactory", "Lru/ozon/app/android/pdp/offline/widgetfactory/PriceV4WidgetFactory;", "priceV4WidgetFactory", "Lru/ozon/app/android/pdp/offline/widgetfactory/TextProductNameWidgetFactory;", "textProductNameWidgetFactory", "Lru/ozon/app/android/pdp/offline/widgetfactory/PdpStatusWidgetFactory;", "pdpStatusWidgetFactory", "<init>", "(Lru/ozon/app/android/pdp/offline/widgetfactory/GalleryV4WidgetFactory;Lru/ozon/app/android/pdp/offline/widgetfactory/PriceV4WidgetFactory;Lru/ozon/app/android/pdp/offline/widgetfactory/TextProductNameWidgetFactory;Lru/ozon/app/android/pdp/offline/widgetfactory/PdpStatusWidgetFactory;)V", "Lz00/f;", "issue", "Lz00/c;", "createErrorState", "(Lz00/f;)Lz00/c;", "Lru/ozon/app/android/pdp/offline/widgetfactory/GalleryV4WidgetFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/PriceV4WidgetFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/TextProductNameWidgetFactory;", "Lru/ozon/app/android/pdp/offline/widgetfactory/PdpStatusWidgetFactory;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpOfflineScreenFactory implements DefaultEmptyScreenFactory {

    @NotNull
    private final GalleryV4WidgetFactory galleryV4WidgetFactory;

    @NotNull
    private final PdpStatusWidgetFactory pdpStatusWidgetFactory;

    @NotNull
    private final PriceV4WidgetFactory priceV4WidgetFactory;

    @NotNull
    private final TextProductNameWidgetFactory textProductNameWidgetFactory;

    public PdpOfflineScreenFactory(@NotNull GalleryV4WidgetFactory galleryV4WidgetFactory, @NotNull PriceV4WidgetFactory priceV4WidgetFactory, @NotNull TextProductNameWidgetFactory textProductNameWidgetFactory, @NotNull PdpStatusWidgetFactory pdpStatusWidgetFactory) {
        Intrinsics.checkNotNullParameter(galleryV4WidgetFactory, "galleryV4WidgetFactory");
        Intrinsics.checkNotNullParameter(priceV4WidgetFactory, "priceV4WidgetFactory");
        Intrinsics.checkNotNullParameter(textProductNameWidgetFactory, "textProductNameWidgetFactory");
        Intrinsics.checkNotNullParameter(pdpStatusWidgetFactory, "pdpStatusWidgetFactory");
        this.galleryV4WidgetFactory = galleryV4WidgetFactory;
        this.priceV4WidgetFactory = priceV4WidgetFactory;
        this.textProductNameWidgetFactory = textProductNameWidgetFactory;
        this.pdpStatusWidgetFactory = pdpStatusWidgetFactory;
    }

    @Override // E00.a
    @NotNull
    public c createErrorState(@NotNull f issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        return issue instanceof f.a ? d.b(new PdpOfflineScreenFactory$createErrorState$1(this)) : d.a();
    }
}
