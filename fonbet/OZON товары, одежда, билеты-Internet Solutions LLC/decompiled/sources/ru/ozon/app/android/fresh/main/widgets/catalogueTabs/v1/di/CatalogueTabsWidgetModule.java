package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di;

import android.content.Context;
import com.squareup.moshi.Moshi;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.common.flags.FreshCatalogueTabsPerformance;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsConfig;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsParser;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsViewMapper;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "catalogueTabsViewMapper", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsViewMapper;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "context", "Landroid/content/Context;", "moshi", "Lcom/squareup/moshi/Moshi;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogueTabsWidgetModule {
    @NotNull
    public final Widget2 provideWidget(@NotNull CatalogueTabsViewMapper catalogueTabsViewMapper, @NotNull final JsonParser jsonDeserializer, @NotNull Context context, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(catalogueTabsViewMapper, "catalogueTabsViewMapper");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        CatalogueTabsConfig catalogueTabsConfig = new CatalogueTabsConfig(((NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class)).getFeatureChecker().isEnabled(FreshCatalogueTabsPerformance.INSTANCE) ? new CatalogueTabsParser(moshi) : new Function2<String, String, CatalogueTabsDTO>() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsWidgetModule$provideWidget$$inlined$getDefaultWidgetParser$1
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO] */
            @Override // kotlin.jvm.functions.Function2
            public CatalogueTabsDTO invoke(String params, String state) {
                JsonParser jsonParser = JsonParser.this;
                if (state != null) {
                    return jsonParser.fromJson(state, CatalogueTabsDTO.class);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        });
        return new Widget2(catalogueTabsConfig.getVertical(), "catalogueTabs", catalogueTabsConfig, new ViewMapper2[]{catalogueTabsViewMapper});
    }
}
