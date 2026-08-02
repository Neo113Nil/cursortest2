package ru.ozon.app.android.pikazon.flags;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/flags/PikazonFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) RetriesOnConnectionRestoredFlag.INSTANCE, 3, FeatureFlagKt.featureFlagDisplayedName("Количество повторных попыток для загрузки изображений в случае обрыва и восстановления соединения с Интернетом", "https://jit.o3.ru/browse/ANDROID-40227", "https://jit.o3.ru/browse/MOB-11266")), new FeatureFlagRegistrationModel((FeatureFlag) QuicPikazonEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Поддержка HTTP/3 (http over QUIC) Для картинок", "https://jit.o3.ru/browse/ANDROID-21693", "https://jit.o3.ru/browse/MOB-809")), new FeatureFlagRegistrationModel((FeatureFlag) PikazonImageFailuresLoggingEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Включение логирования ошибок загрузки картинок в logging.o3", "https://jit.o3.ru/browse/ANDROID-33405", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) Other2ThresholdFlag.INSTANCE, 20000, FeatureFlagKt.featureFlagDisplayedName$default("Время в ms для отправки лога о том, что картинка загрузилась, но грузилась долго", "https://jit.o3.ru/browse/ANDROID-43255", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) Cancellation1ThresholdFlag.INSTANCE, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, FeatureFlagKt.featureFlagDisplayedName$default("Время в ms для отправки лога о том, что пользователь ждал загрузку картинки.Она не загрузилась,  запрос отменился", "https://jit.o3.ru/browse/ANDROID-43255", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) NewVisibilityCheckerEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Учет overlay view при расчете placeholder_rate картинок", "https://jit.o3.ru/browse/MP-4543", null, 4, null)), FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) IsComposeIntrinsicSizeEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName$default("Новая логика резолвинга размеров Image в pikazon-compose", "http://jit.o3.ru/browse/MP-4757", null, 4, null)))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
