package ru.ozon.app.android.network.abtool;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.Experiment;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/network/abtool/FeatureService;", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "feature", "", "getStringKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)Ljava/lang/String;", "", "getBooleanKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)Z", "", "getLongKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)J", "", "getIntKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)I", "", "getFloatKey", "(Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)F", "", "Lru/ozon/app/android/abtool/Experiment;", "getExperiments", "()Ljava/util/List;", "Lru/ozon/app/android/abtool/FeatureFlag;", "getFeatureFlags", "", "fetch", "()V", "Lru/ozon/app/android/network/abtool/OnChangeFeatureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnChangeFeatureListener", "(Lru/ozon/app/android/network/abtool/OnChangeFeatureListener;)V", "removeOnChangeFeatureListener", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FeatureService {
    void addOnChangeFeatureListener(@NotNull OnChangeFeatureListener listener);

    void fetch();

    boolean getBooleanKey(@NotNull FeatureFlag feature);

    @NotNull
    List<Experiment> getExperiments();

    @NotNull
    List<ru.ozon.app.android.abtool.FeatureFlag> getFeatureFlags();

    float getFloatKey(@NotNull FeatureFlag feature);

    int getIntKey(@NotNull FeatureFlag feature);

    long getLongKey(@NotNull FeatureFlag feature);

    @NotNull
    String getStringKey(@NotNull FeatureFlag feature);

    void removeOnChangeFeatureListener(@NotNull OnChangeFeatureListener listener);
}
