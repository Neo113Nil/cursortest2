package ru.ozon.app.android.returns.creation.widgets.photoPicker.logging;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.errors.Error;
import sj.f;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0011*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLoggerImpl;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLogger;", "Lqj/a;", "networkInfoProvider", "<init>", "(Lqj/a;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Picking;", "error", "", "logPickingError", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Picking;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Resizing;", "logResizingError", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Resizing;)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Uploading;", "logUploadingError", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error$Uploading;)V", "", "defaultMessage", "orDefault", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/lang/StackTraceElement;", "toReadableStacktrace", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "", "toFileSizeInMb", "(J)Ljava/lang/String;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error;", "logError", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/errors/Error;)V", "Lqj/a;", "Lru/ozon/android/ozonLogger/core/h;", "logger$delegate", "LSc/j;", "getLogger", "()Lru/ozon/android/ozonLogger/core/h;", "logger", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageUploadingLoggerImpl implements ImageUploadingLogger {

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logger;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/logging/ImageUploadingLoggerImpl$Companion;", "", "<init>", "()V", "ARG_FILENAME", "", "ARG_FILE_SIZE", "ARG_RESIZED_FILE_SIZE", "ARG_ERROR_MESSAGE", "ARG_STACKTRACE", "ARG_NETWORK_TYPE", "ARG_VPN_ENABLED", "ARG_PROXY_ENABLED", "NO_ERROR_MESSAGE", "DEFAULT_UPLOADING_ERROR", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ImageUploadingLoggerImpl(@NotNull C9067a networkInfoProvider) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        this.networkInfoProvider = networkInfoProvider;
        this.logger = k.b(ImageUploadingLoggerImpl$logger$2.INSTANCE);
    }

    private final h getLogger() {
        return (h) this.logger.getValue();
    }

    private final void logPickingError(Error.Picking error) {
        h logger = getLogger();
        Pair pair = new Pair("error_message", orDefault$default(this, error.getMessage(), null, 1, null));
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        h.a.a(logger, "Ошибка получения фото из галереи", f.b(pair, new Pair("stacktrace", toReadableStacktrace(stackTrace))), null, 4);
    }

    private final void logResizingError(Error.Resizing error) {
        h logger = getLogger();
        Pair pair = new Pair("filename", error.getFilename());
        Pair pair2 = new Pair("fileSize", toFileSizeInMb(error.getFileSize()));
        Pair pair3 = new Pair("error_message", orDefault$default(this, error.getMessage(), null, 1, null));
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        h.a.a(logger, "Ошибка при сжатии файла", f.b(pair, pair2, pair3, new Pair("stacktrace", toReadableStacktrace(stackTrace))), null, 4);
    }

    private final void logUploadingError(Error.Uploading error) {
        h logger = getLogger();
        Pair pair = new Pair("filename", error.getFilename());
        Pair pair2 = new Pair("resizedFileSize", toFileSizeInMb(error.getResizedFileSize()));
        Pair pair3 = new Pair("error_message", orDefault(error.getMessage(), "Ничего не было загружено"));
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        h.a.a(logger, "Ошибка загрузки фото", f.b(pair, pair2, pair3, new Pair("stacktrace", toReadableStacktrace(stackTrace)), new Pair("network_type", C9067a.g(this.networkInfoProvider).name()), new Pair("vpn_enabled", Boolean.valueOf(this.networkInfoProvider.m())), new Pair("proxy_enabled", Boolean.valueOf(this.networkInfoProvider.k()))), null, 4);
    }

    private final String orDefault(String str, String str2) {
        return str == null ? str2 == null ? "Нет текста ошибки" : str2 : str;
    }

    static /* synthetic */ String orDefault$default(ImageUploadingLoggerImpl imageUploadingLoggerImpl, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = null;
        }
        return imageUploadingLoggerImpl.orDefault(str, str2);
    }

    private final String toFileSizeInMb(long j11) {
        String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf((j11 / 1024.0d) / 1024.0d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format.concat(" MB");
    }

    private final String toReadableStacktrace(StackTraceElement[] stackTraceElementArr) {
        return C7705l.P(stackTraceElementArr, " \n", null, null, null, 62);
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.logging.ImageUploadingLogger
    public void logError(@NotNull Error error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof Error.Picking) {
            logPickingError((Error.Picking) error);
        } else if (error instanceof Error.Resizing) {
            logResizingError((Error.Resizing) error);
        } else {
            if (!(error instanceof Error.Uploading)) {
                throw new o();
            }
            logUploadingError((Error.Uploading) error);
        }
    }
}
