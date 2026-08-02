package ru.ozon.app.android.video.playerV2.utils;

import androidx.media3.exoplayer.C5446h;
import androidx.media3.exoplayer.L;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.video.player.flags.BackBufferSizeMsPlayerFlag;
import ru.ozon.app.android.video.player.flags.BufferForPlaybackAfterRebufferMsFlag;
import ru.ozon.app.android.video.player.flags.MaxBufferMsFlag;
import ru.ozon.app.android.video.player.flags.MinBufferMsFlag;
import ru.ozon.app.android.video.player.flags.PlayerBufferForPlaybackMsFlag;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Landroidx/media3/exoplayer/L;", "createLoadControl", "(Lru/ozon/app/android/network/abtool/FeatureService;)Landroidx/media3/exoplayer/L;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "flagKey", "", "validationFailureValue", "Lkotlin/Function1;", "", "isValid", "getFeatureValueOrDefaultAfterValidation", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/abtool/flag/FeatureFlag;ILkotlin/jvm/functions/Function1;)I", "video_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerConfigUtilsKt {
    @NotNull
    public static final L createLoadControl(@NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        int featureValueOrDefaultAfterValidation = getFeatureValueOrDefaultAfterValidation(featureService, PlayerBufferForPlaybackMsFlag.INSTANCE, 1000, PlayerConfigUtilsKt$createLoadControl$bufferForPlaybackMs$1.INSTANCE);
        int featureValueOrDefaultAfterValidation2 = getFeatureValueOrDefaultAfterValidation(featureService, BufferForPlaybackAfterRebufferMsFlag.INSTANCE, 2000, PlayerConfigUtilsKt$createLoadControl$bufferForPlaybackAfterRebufferMs$1.INSTANCE);
        int intKey = featureService.getIntKey(BackBufferSizeMsPlayerFlag.INSTANCE);
        int featureValueOrDefaultAfterValidation3 = getFeatureValueOrDefaultAfterValidation(featureService, MinBufferMsFlag.INSTANCE, Math.max(featureValueOrDefaultAfterValidation, featureValueOrDefaultAfterValidation2), new PlayerConfigUtilsKt$createLoadControl$minBufferMs$1(featureValueOrDefaultAfterValidation, featureValueOrDefaultAfterValidation2));
        int featureValueOrDefaultAfterValidation4 = getFeatureValueOrDefaultAfterValidation(featureService, MaxBufferMsFlag.INSTANCE, featureValueOrDefaultAfterValidation3, new PlayerConfigUtilsKt$createLoadControl$maxBufferMs$1(featureValueOrDefaultAfterValidation3));
        C5446h.a aVar = new C5446h.a();
        aVar.c(featureValueOrDefaultAfterValidation3, featureValueOrDefaultAfterValidation4, featureValueOrDefaultAfterValidation, featureValueOrDefaultAfterValidation2);
        Intrinsics.checkNotNullExpressionValue(aVar, "setBufferDurationsMs(...)");
        if (intKey > 0) {
            aVar.b(intKey);
        }
        C5446h a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        return a11;
    }

    private static final int getFeatureValueOrDefaultAfterValidation(FeatureService featureService, FeatureFlag featureFlag, int i11, Function1<? super Integer, Boolean> function1) {
        int intKey = featureService.getIntKey(featureFlag);
        return function1.invoke(Integer.valueOf(intKey)).booleanValue() ? intKey : i11;
    }
}
