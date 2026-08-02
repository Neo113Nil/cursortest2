package ru.ozon.app.android.injection.widget;

import android.app.Application;
import android.content.Context;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.di.WidgetRegistrationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/injection/widget/WidgetRegistrationComponent;", "Lru/ozon/app/android/composer/di/WidgetRegistrationComponentApi;", "Factory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WidgetRegistrationComponent extends WidgetRegistrationComponentApi {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\f\b\u0001\u0010\b\u001a\u00060\tj\u0002`\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/injection/widget/WidgetRegistrationComponent$Factory;", "", "create", "Lru/ozon/app/android/injection/widget/WidgetRegistrationComponent;", "context", "Landroid/content/Context;", "application", "Landroid/app/Application;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonSerializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "moshi", "Lcom/squareup/moshi/Moshi;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "appType", "Lru/ozon/app/android/utils/AppType;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        WidgetRegistrationComponent create(@NotNull Context context, @NotNull Application application, @NotNull JsonParser jsonDeserializer, @NotNull JsonSerializer jsonSerializer, @NotNull Moshi moshi, @NotNull FeatureChecker featureChecker, @NotNull AppType appType);
    }
}
