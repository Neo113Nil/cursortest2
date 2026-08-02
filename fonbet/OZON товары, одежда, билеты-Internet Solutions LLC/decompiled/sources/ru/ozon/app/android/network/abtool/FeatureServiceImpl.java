package ru.ozon.app.android.network.abtool;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbTool;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.Experiment;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020 2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/network/abtool/FeatureServiceImpl;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureUpdater;", "Lru/ozon/app/android/abtool/AbTool;", "abTool", "<init>", "(Lru/ozon/app/android/abtool/AbTool;)V", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "feature", "", "getStringKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)Ljava/lang/String;", "", "getBooleanKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)Z", "", "getLongKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)J", "", "getIntKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)I", "", "getFloatKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)F", "", "Lru/ozon/app/android/abtool/Experiment;", "getExperiments", "()Ljava/util/List;", "Lru/ozon/app/android/abtool/FeatureFlag;", "getFeatureFlags", "isEnabled", "", "fetch", "()V", "Lru/ozon/app/android/network/abtool/OnChangeFeatureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnChangeFeatureListener", "(Lru/ozon/app/android/network/abtool/OnChangeFeatureListener;)V", "removeOnChangeFeatureListener", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateByName", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/abtool/AbTool;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureServiceImpl implements FeatureService, FeatureChecker, FeatureUpdater {

    @NotNull
    private final AbTool abTool;

    public FeatureServiceImpl(@NotNull AbTool abTool) {
        Intrinsics.checkNotNullParameter(abTool, "abTool");
        this.abTool = abTool;
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public void addOnChangeFeatureListener(@NotNull OnChangeFeatureListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbToolBaseApi.DefaultImpls.addOnChangeFeaturesListener$default(this.abTool, null, new FeatureServiceImpl$addOnChangeFeatureListener$1(listener), 1, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public void fetch() {
        this.abTool.fetch();
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public boolean getBooleanKey(@NotNull FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return AbToolBaseApi.DefaultImpls.getBoolean$default(this.abTool, feature.getFeatureName(), feature.getServiceName(), null, 4, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    @NotNull
    public List<Experiment> getExperiments() {
        return AbTool.DefaultImpls.getExperiments$default(this.abTool, null, 1, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    @NotNull
    public List<ru.ozon.app.android.abtool.FeatureFlag> getFeatureFlags() {
        return AbTool.DefaultImpls.getFeatureFlags$default(this.abTool, null, 1, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public float getFloatKey(@NotNull FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return AbToolBaseApi.DefaultImpls.getFloat$default(this.abTool, feature.getFeatureName(), feature.getServiceName(), null, 4, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public int getIntKey(@NotNull FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return AbToolBaseApi.DefaultImpls.getInt$default(this.abTool, feature.getFeatureName(), feature.getServiceName(), null, 4, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public long getLongKey(@NotNull FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return AbToolBaseApi.DefaultImpls.getLong$default(this.abTool, feature.getFeatureName(), feature.getServiceName(), null, 4, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    @NotNull
    public String getStringKey(@NotNull FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return AbToolBaseApi.DefaultImpls.getString$default(this.abTool, feature.getFeatureName(), feature.getServiceName(), null, 4, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureChecker
    public boolean isEnabled(@NotNull FeatureFlag feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return getBooleanKey(feature);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureService
    public void removeOnChangeFeatureListener(@NotNull OnChangeFeatureListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbToolBaseApi.DefaultImpls.removeOnChangeFeaturesListener$default(this.abTool, null, new FeatureServiceImpl$removeOnChangeFeatureListener$1(listener), 1, null);
    }

    @Override // ru.ozon.app.android.network.abtool.FeatureUpdater
    public void updateByName(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        AbTool.DefaultImpls.updateByName$default(this.abTool, name, value, null, 4, null);
    }
}
