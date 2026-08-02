package ru.ozon.app.android.fresh.main.widgets.catalogShelf.di;

import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfConfig;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfParser;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.header.CatalogShelfHeaderViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfRowViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.optimized.CatalogShelfRowViewMapperNew;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/di/CatalogShelfWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "catalogShelfHeaderViewMapper", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/header/CatalogShelfHeaderViewMapper;", "catalogShelfRowViewMapper", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowViewMapper;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "catalogShelfRowViewMapperNew", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/optimized/CatalogShelfRowViewMapperNew;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogShelfWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull CatalogShelfHeaderViewMapper catalogShelfHeaderViewMapper, @NotNull CatalogShelfRowViewMapper catalogShelfRowViewMapper, @NotNull JsonParser jsonDeserializer, @NotNull Context context, @NotNull CatalogShelfRowViewMapperNew catalogShelfRowViewMapperNew) {
        Intrinsics.checkNotNullParameter(catalogShelfHeaderViewMapper, "catalogShelfHeaderViewMapper");
        Intrinsics.checkNotNullParameter(catalogShelfRowViewMapper, "catalogShelfRowViewMapper");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(catalogShelfRowViewMapperNew, "catalogShelfRowViewMapperNew");
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        CatalogShelfConfig catalogShelfConfig = new CatalogShelfConfig(new CatalogShelfParser(jsonDeserializer, ((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureChecker()));
        return new Widget2(catalogShelfConfig.getVertical(), "catalogShelf", catalogShelfConfig, new ViewMapper2[]{catalogShelfRowViewMapper, catalogShelfHeaderViewMapper, catalogShelfRowViewMapperNew});
    }
}
