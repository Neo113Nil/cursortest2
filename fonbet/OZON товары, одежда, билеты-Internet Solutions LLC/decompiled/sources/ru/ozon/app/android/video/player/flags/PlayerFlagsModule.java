package ru.ozon.app.android.video.player.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/video/player/flags/PlayerFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel featureFlagRegistrationModel = new FeatureFlagRegistrationModel((FeatureFlag) BlockVideoPlayingFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Останавливает показ видео", "https://jit.o3.ru/browse/ANDROID-32300", "https://jit.o3.ru/browse/MOB-6954"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel2 = new FeatureFlagRegistrationModel((FeatureFlag) PlayerBufferForPlaybackMsFlag.INSTANCE, 1000, FeatureFlagKt.featureFlagDisplayedName("Необходимая длительность загрузки видео для его старта воспроизведения", "https://jit.ozon.ru/browse/ANDROID-21210", "https://jit.ozon.ru/browse/MOB-1094"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel3 = new FeatureFlagRegistrationModel((FeatureFlag) LvsPerfVideoTrackingEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Сэмплирование performance-метрик видео", "https://jit.o3.ru/browse/ANDROID-22451", "https://jit.o3.ru/browse/MOB-1765"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel4 = new FeatureFlagRegistrationModel((FeatureFlag) LvsPerfLoadVideoTrackingEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Трекинг событий загрузчика плеера", "https://jit.o3.ru/browse/ANDROID-23091", "https://jit.o3.ru/browse/MOB-235"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel5 = new FeatureFlagRegistrationModel((FeatureFlag) PlayerLogVideoLoadErrorsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Добавить нон фатал на ошибку загрузки видео в медиагалерее для виджета rpProduct.reviewGallery v2", "https://jit.o3.ru/browse/ANDROID-27314", "https://jit.o3.ru/browse/MOB-4154"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel6 = new FeatureFlagRegistrationModel((FeatureFlag) BufferForPlaybackAfterRebufferMsFlag.INSTANCE, 2000, FeatureFlagKt.featureFlagDisplayedName("Длительность видео, которая должна быть буферизирована, чтобы продолжить воспроизведение после ребуферизации.", "https://jit.o3.ru/browse/ANDROID-30675", "https://jit.o3.ru/browse/MOB-6075"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel7 = new FeatureFlagRegistrationModel((FeatureFlag) MinBufferMsFlag.INSTANCE, 50000, FeatureFlagKt.featureFlagDisplayedName("Минимальная длительность видео, наличие в буфере которой будет всегда проверять плеер", "https://jit.o3.ru/browse/ANDROID-30675", "https://jit.o3.ru/browse/MOB-6075"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel8 = new FeatureFlagRegistrationModel((FeatureFlag) MaxBufferMsFlag.INSTANCE, 50000, FeatureFlagKt.featureFlagDisplayedName("Максимальная длительность видео, которую плеер будет пытаться буферизировать", "https://jit.o3.ru/browse/ANDROID-30675", "https://jit.o3.ru/browse/MOB-6075"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel9 = new FeatureFlagRegistrationModel((FeatureFlag) BackBufferSizeMsPlayerFlag.INSTANCE, 0, FeatureFlagKt.featureFlagDisplayedName("Задать backBuffer в ms в плеерах в отзывах", "https://jit.o3.ru/browse/ANDROID-31149", "https://jit.o3.ru/browse/MOB-6408"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel10 = new FeatureFlagRegistrationModel((FeatureFlag) FirstChunkLengthForFragmentedMP4Flag.INSTANCE, -1, FeatureFlagKt.featureFlagDisplayedName("Размер первого фрагмента для fmp4 в Кб", "https://jit.o3.ru/browse/ANDROID-31970", "https://jit.o3.ru/browse/MOB-6885"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel11 = new FeatureFlagRegistrationModel((FeatureFlag) ChunkLengthForFragmentedMP4Flag.INSTANCE, -1, FeatureFlagKt.featureFlagDisplayedName("Размер 2-го и след. фрагментов для fmp4 в Кб", "https://jit.o3.ru/browse/ANDROID-31970", "https://jit.o3.ru/browse/MOB-6885"));
        FeatureFlagRegistrationModel featureFlagRegistrationModel12 = new FeatureFlagRegistrationModel((FeatureFlag) MP4AssetPreferredQualityFlag.INSTANCE, -1, FeatureFlagKt.featureFlagDisplayedName("Качество видео asset mp4", "https://jit.o3.ru/browse/ANDROID-32100", "https://jit.o3.ru/browse/MOB-6883"));
        CronetInPlayerEnabledFlag cronetInPlayerEnabledFlag = CronetInPlayerEnabledFlag.INSTANCE;
        FeatureFlagRegistrationModel[] elements = {featureFlagRegistrationModel, featureFlagRegistrationModel2, featureFlagRegistrationModel3, featureFlagRegistrationModel4, featureFlagRegistrationModel5, featureFlagRegistrationModel6, featureFlagRegistrationModel7, featureFlagRegistrationModel8, featureFlagRegistrationModel9, featureFlagRegistrationModel10, featureFlagRegistrationModel11, featureFlagRegistrationModel12, FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) cronetInPlayerEnabledFlag, false, FeatureFlagKt.featureFlagDisplayedName$default(cronetInPlayerEnabledFlag.getFeatureName(), null, "https://jit.o3.ru/browse/MOB-6902", 2, null)))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
