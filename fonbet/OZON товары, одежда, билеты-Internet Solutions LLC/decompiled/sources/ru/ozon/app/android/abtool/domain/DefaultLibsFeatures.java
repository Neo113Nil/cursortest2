package ru.ozon.app.android.abtool.domain;

import Nd0.b;
import Tc.j;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;
import ru.ozon.app.android.abtool.di.DiStoreWrapper;
import ru.ozon.app.android.abtool.utils.FeatureDTOUtilsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u000bR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/abtool/domain/DefaultLibsFeatures;", "", "<init>", "()V", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "testMasterFlagInstant", "Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "testMasterFlagNewSession", "testMasterFlagBoolInstant", "testMasterFlagBoolNewSession", "isOzonQa", "()Lru/ozon/app/android/abtool/data/model/FeatureDTO;", "isOzonEmployee", "Lkotlin/Pair;", "", "abToolsGNCServiceNamePair", "Lkotlin/Pair;", "getAbToolsGNCServiceNamePair$abzone_release", "()Lkotlin/Pair;", "", "defaultFeatures", "Ljava/util/Set;", "getDefaultFeatures", "()Ljava/util/Set;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultLibsFeatures {

    @NotNull
    public static final DefaultLibsFeatures INSTANCE = new DefaultLibsFeatures();

    @NotNull
    private static final Pair<String, String> abToolsGNCServiceNamePair;

    @NotNull
    private static final Set<FeatureDTO> defaultFeatures;

    @NotNull
    private static final FeatureDTO isOzonEmployee;

    @NotNull
    private static final FeatureDTO isOzonQa;

    @NotNull
    private static final FeatureDTO testMasterFlagBoolInstant;

    @NotNull
    private static final FeatureDTO testMasterFlagBoolNewSession;

    @NotNull
    private static final FeatureDTO testMasterFlagInstant;

    @NotNull
    private static final FeatureDTO testMasterFlagNewSession;

    static {
        ru.ozon.app.android.abtool.data.model.ValueType valueType = ru.ozon.app.android.abtool.data.model.ValueType.INT;
        ru.ozon.app.android.abtool.data.model.UpdateStrategy updateStrategy = ru.ozon.app.android.abtool.data.model.UpdateStrategy.AS_FETCHED;
        FeatureDTO featureDTO = new FeatureDTO("Тестовый платформенный флаг (as_fetched)", "platform_autotest", "test_master_flag_number_instant", valueType, 0, null, updateStrategy);
        testMasterFlagInstant = featureDTO;
        ru.ozon.app.android.abtool.data.model.UpdateStrategy updateStrategy2 = ru.ozon.app.android.abtool.data.model.UpdateStrategy.PER_PROCESS;
        FeatureDTO featureDTO2 = new FeatureDTO("Тестовый платформенный флаг (per_process)", "platform_autotest", "test_master_flag_number_new_session", valueType, 0, null, updateStrategy2);
        testMasterFlagNewSession = featureDTO2;
        ru.ozon.app.android.abtool.data.model.ValueType valueType2 = ru.ozon.app.android.abtool.data.model.ValueType.BOOLEAN;
        Boolean bool = Boolean.FALSE;
        FeatureDTO featureDTO3 = new FeatureDTO("Тестовый платформенный флаг (as_fetched)", "platform_autotest", "test_master_flag_instant", valueType2, bool, null, updateStrategy);
        testMasterFlagBoolInstant = featureDTO3;
        FeatureDTO featureDTO4 = new FeatureDTO("Тестовый платформенный флаг (per_process)", "platform_autotest", "test_master_flag_new_session", valueType2, bool, null, updateStrategy2);
        testMasterFlagBoolNewSession = featureDTO4;
        FeatureDTO featureDTO5 = new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName("Находится ли пользователь в сегменте сотрудников Ozon", "https://jit.o3.ru/browse/LIBMOB-6257", "https://jit.o3.ru/browse/MP-2862"), "platform_shared_configs", "is_ozon_qa", valueType2, bool, null, updateStrategy);
        isOzonQa = featureDTO5;
        FeatureDTO featureDTO6 = new FeatureDTO(FeatureDTOUtilsKt.featureFlagDisplayedName("Находится ли пользователь в сегменте сотрудников Ozon", "https://jit.o3.ru/browse/LIBMOB-6257", "https://jit.o3.ru/browse/MP-2862"), "platform_shared_configs", "is_ozon_employee", valueType2, bool, null, updateStrategy);
        isOzonEmployee = featureDTO6;
        abToolsGNCServiceNamePair = new Pair<>("ozon_network", "abtool_ozon_network_enabled_android");
        j builder = new j();
        builder.add(featureDTO5);
        builder.add(featureDTO6);
        if (DiStoreWrapper.INSTANCE.getStore().c().b() == b.DEBUG) {
            builder.add(featureDTO);
            builder.add(featureDTO2);
            builder.add(featureDTO3);
            builder.add(featureDTO4);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        defaultFeatures = builder.b();
    }

    private DefaultLibsFeatures() {
    }

    @NotNull
    public final Pair<String, String> getAbToolsGNCServiceNamePair$abzone_release() {
        return abToolsGNCServiceNamePair;
    }

    @NotNull
    public final Set<FeatureDTO> getDefaultFeatures() {
        return defaultFeatures;
    }

    @NotNull
    public final FeatureDTO isOzonEmployee() {
        return isOzonEmployee;
    }

    @NotNull
    public final FeatureDTO isOzonQa() {
        return isOzonQa;
    }
}
