package ru.ozon.app.android.abtool;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/abtool/AbTool;", "Lru/ozon/app/android/abtool/AbToolBaseApi;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "", "updateByName", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)V", "", "Lru/ozon/app/android/abtool/Experiment;", "getExperiments", "(Lru/ozon/app/android/abtool/AbToolNamespace;)Ljava/util/List;", "Lru/ozon/app/android/abtool/FeatureFlag;", "getFeatureFlags", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AbTool extends AbToolBaseApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ List getExperiments$default(AbTool abTool, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExperiments");
            }
            if ((i11 & 1) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abTool.getExperiments(abToolNamespace);
        }

        public static /* synthetic */ List getFeatureFlags$default(AbTool abTool, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeatureFlags");
            }
            if ((i11 & 1) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abTool.getFeatureFlags(abToolNamespace);
        }

        public static /* synthetic */ void updateByName$default(AbTool abTool, String str, String str2, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateByName");
            }
            if ((i11 & 4) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            abTool.updateByName(str, str2, abToolNamespace);
        }
    }

    @NotNull
    List<Experiment> getExperiments(@NotNull AbToolNamespace namespace);

    @NotNull
    List<FeatureFlag> getFeatureFlags(@NotNull AbToolNamespace namespace);

    void updateByName(@NotNull String name, @NotNull String value, @NotNull AbToolNamespace namespace);
}
