package ru.ozon.app.android.video.player.logs;

import B3.s;
import Sc.InterfaceC4008j;
import Sc.k;
import Sh.b;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import j3.w;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.video.MediaFormat;
import ru.ozon.app.android.video.MediaFormatKt;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import sj.d;
import sj.f;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006$"}, d2 = {"Lru/ozon/app/android/video/player/logs/PlayerLoggerImpl;", "Lru/ozon/app/android/video/player/logs/PlayerLogger;", "<init>", "()V", "", "videoUrl", "getVideoFormat", "(Ljava/lang/String;)Ljava/lang/String;", "", "code", "Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "exoPlayerCodeToErrorType", "(I)Lru/ozon/app/android/video/player/performance/metricsManager/VideoPerfMetricAction$PutVideoPlaybackMetricAction$ErrorDetails$FatalErrorType;", "exoPlayerErrorCodeToDescription", "(I)Ljava/lang/String;", "Lj3/w;", "error", "widgetName", "", "logFatalPlayerError", "(Lj3/w;Ljava/lang/String;Ljava/lang/String;)V", "nonFatalReason", "errorMessage", "errorCause", "logNonFatalPlayerError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lsj/d;", "fatalErrorLogger$delegate", "LSc/j;", "getFatalErrorLogger", "()Lsj/d;", "fatalErrorLogger", "nonFatalErrorLogger$delegate", "getNonFatalErrorLogger", "nonFatalErrorLogger", "Companion", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerLoggerImpl implements PlayerLogger {

    /* renamed from: fatalErrorLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fatalErrorLogger = k.b(PlayerLoggerImpl$fatalErrorLogger$2.INSTANCE);

    /* renamed from: nonFatalErrorLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nonFatalErrorLogger = k.b(PlayerLoggerImpl$nonFatalErrorLogger$2.INSTANCE);

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/video/player/logs/PlayerLoggerImpl$Companion;", "", "<init>", "()V", "PLAYER_ERROR_MESSAGE", "", "UNKNOWN_FORMAT", "UNDEFINED_WIDGET_NAME", "CUSTOM_FIELD_VIDEO_URL", "CUSTOM_FIELD_VIDEO_FORMAT", "CUSTOM_FIELD_WIDGET_NAME", "CUSTOM_FIELD_ERROR_CAUSE", "CUSTOM_FIELD_ERROR_MESSAGE", "CUSTOM_FIELD_ERROR_CODE", "CUSTOM_FIELD_ERROR_CODE_NAME", "CUSTOM_FIELD_NON_FATAL_REASON", "CUSTOM_FIELD_ERROR_DESCRIPTION", "CUSTOM_FIELD_ERROR_DIAGNOSTIC_INFO", "CUSTOM_FIELD_ERROR_CAUSE_MESSAGE", "video_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType exoPlayerCodeToErrorType(int code) {
        return (2001 > code || code >= 2005) ? (3000 > code || code >= 5000) ? VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType.OTHER_ERROR : VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType.DECODING_ERROR : VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType.NETWORK_ERROR;
    }

    private final String exoPlayerErrorCodeToDescription(int code) {
        if (code == 1003) {
            return "Таймаут.";
        }
        if (code == 1004) {
            return "Неожиданная ошибка в рантайме.";
        }
        switch (code) {
            case 2000:
                return "Не определенная ошибка ввода/вывода.";
            case 2001:
                return "Ошибка сетевого подключения.";
            case 2002:
                return "Таймаут сетевого соединения.";
            case 2003:
                return "Невалидное значение в HTTP заголовке Content-Type.";
            case 2004:
                return "HTTP сервер вернул неожиданный код статуса в ответе.";
            case 2005:
                return "Файл не найден.";
            case 2006:
                return "Нет разрешения на операцию ввода-вывода";
            default:
                switch (code) {
                    case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                        return "Ошибка парсинга битового потока, связанного с форматом медиа контейнера. Возможно, битый файл или неверный источник.";
                    case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                        return "Ошибка парсинга манифеста потокового видео.";
                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                        return "Попытка распаковать файл с неподдерживаемым медиа контейнером, форматом или неподдерживамой feature медиа контейнера.";
                    case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                        return "Манифест потокового видео использует неподдерживаемую feature.";
                    default:
                        switch (code) {
                            case 4001:
                                return "Ошибка инициализации декодера.";
                            case 4002:
                                return "Не удалось запросить декодеры.";
                            case 4003:
                                return "Не удалось декодировать медиа сэмплы.";
                            case 4004:
                                return "Характеристики контента превосходят возможности устройства. Например, слишком высокие разрешение + частота кадров.";
                            case 4005:
                                return "Попытка декодировать контент неподдерживаемого формата.";
                            case 4006:
                                return "Более высокоприоритетная задача забрала ресурсы необходимые для декодирования.";
                            default:
                                return "неизвестный код ошибки.";
                        }
                }
        }
    }

    private final d getFatalErrorLogger() {
        return (d) this.fatalErrorLogger.getValue();
    }

    private final d getNonFatalErrorLogger() {
        return (d) this.nonFatalErrorLogger.getValue();
    }

    private final String getVideoFormat(String videoUrl) {
        String stringRepresentation;
        MediaFormat extractMediaFormatFromUrl = MediaFormatKt.extractMediaFormatFromUrl(videoUrl);
        return (extractMediaFormatFromUrl == null || (stringRepresentation = extractMediaFormatFromUrl.getStringRepresentation()) == null) ? FraudMonInfo.UNKNOWN : stringRepresentation;
    }

    @Override // ru.ozon.app.android.video.player.logs.PlayerLogger
    public void logFatalPlayerError(@NotNull w error, @NotNull String videoUrl, String widgetName) {
        String str;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        String valueOf = String.valueOf(error.getCause());
        Throwable cause = error.getCause();
        s sVar = cause instanceof s ? (s) cause : null;
        if (sVar == null || (str = sVar.f2367a) == null) {
            str = "no info";
        }
        int i11 = error.f69342a;
        String exoPlayerErrorCodeToDescription = exoPlayerErrorCodeToDescription(i11);
        VideoPerfMetricAction.PutVideoPlaybackMetricAction.ErrorDetails.FatalErrorType exoPlayerCodeToErrorType = exoPlayerCodeToErrorType(i11);
        String str2 = widgetName == null ? "UNDEFINED" : widgetName;
        String str3 = "Player error " + str2 + " " + exoPlayerCodeToErrorType + " " + valueOf;
        String videoFormat = getVideoFormat(videoUrl);
        Pair pair = new Pair("videoUrl", videoUrl);
        Pair pair2 = new Pair("videoFormat", videoFormat);
        Pair pair3 = new Pair("widgetName", str2);
        Pair pair4 = new Pair("errorCause", valueOf);
        Pair pair5 = new Pair("errorMessage", error.getMessage());
        Pair pair6 = new Pair("errorCode", Integer.valueOf(i11));
        Pair pair7 = new Pair("errorCodeName", error.a());
        Pair pair8 = new Pair("errorDescription", exoPlayerErrorCodeToDescription);
        Pair pair9 = new Pair("errorDiagnosticInfo", str);
        Throwable cause2 = error.getCause();
        getFatalErrorLogger().f(c.ERROR, str3, f.a(U.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("errorCauseMessage", String.valueOf(cause2 != null ? cause2.getMessage() : null)))), Boolean.FALSE);
    }

    @Override // ru.ozon.app.android.video.player.logs.PlayerLogger
    public void logNonFatalPlayerError(@NotNull String nonFatalReason, @NotNull String videoUrl, @NotNull String errorMessage, @NotNull String errorCause, String widgetName) {
        Intrinsics.checkNotNullParameter(nonFatalReason, "nonFatalReason");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorCause, "errorCause");
        String str = widgetName == null ? "UNDEFINED" : widgetName;
        getNonFatalErrorLogger().f(c.ERROR, b.c("Player error ", str, " ", nonFatalReason), f.a(U.j(new Pair("videoUrl", videoUrl), new Pair("videoFormat", getVideoFormat(videoUrl)), new Pair("widgetName", str), new Pair("nonFatalReason", nonFatalReason), new Pair("errorMessage", errorMessage), new Pair("errorCause", errorCause))), Boolean.FALSE);
    }
}
