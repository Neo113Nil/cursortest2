package ru.ozon.app.android.network.cronet;

import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.CronetSettingsFlag;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetSettingsProvider;", "", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lcom/squareup/moshi/Moshi;)V", "provide", "Lru/ozon/app/android/network/cronet/CronetSettings;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetSettingsProvider {

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Moshi moshi;

    public CronetSettingsProvider(@NotNull FeatureService featureService, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.featureService = featureService;
        this.moshi = moshi;
    }

    @NotNull
    public final CronetSettings provide() {
        CronetSettings cronetSettings;
        try {
            cronetSettings = (CronetSettings) this.moshi.c(CronetSettings.class).fromJson(this.featureService.getStringKey(CronetSettingsFlag.INSTANCE));
        } catch (Throwable unused) {
            cronetSettings = null;
        }
        if (cronetSettings != null) {
            return cronetSettings;
        }
        return new CronetSettings(false, false, 0, false, 15, null);
    }
}
