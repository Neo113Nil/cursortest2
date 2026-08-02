package ru.ozon.app.android.storage.appversion;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.di.StorageComponentConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AppVersionStorageImpl$versionNameWithoutSuffix$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ AppVersionStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppVersionStorageImpl$versionNameWithoutSuffix$2(AppVersionStorageImpl appVersionStorageImpl) {
        super(0);
        this.this$0 = appVersionStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        SharedPreferences sharedPrefs;
        StorageComponentConfig storageComponentConfig;
        StorageComponentConfig storageComponentConfig2;
        sharedPrefs = this.this$0.getSharedPrefs();
        storageComponentConfig = this.this$0.config;
        String string = sharedPrefs.getString("version_name", storageComponentConfig.getVersionNameWithoutSuffix());
        if (string != null) {
            return string;
        }
        storageComponentConfig2 = this.this$0.config;
        return storageComponentConfig2.getVersionNameWithoutSuffix();
    }
}
