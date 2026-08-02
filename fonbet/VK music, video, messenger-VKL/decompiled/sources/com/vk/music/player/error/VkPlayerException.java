package com.vk.music.player.error;

import android.net.Uri;

/* compiled from: VkPlayerException.kt */
/* loaded from: classes3.dex */
public abstract class VkPlayerException extends Throwable {
    private final ErrorType errorType;

    /* compiled from: VkPlayerException.kt */
    public static final class EmptyUuidException extends VkPlayerException {
        public EmptyUuidException() {
            super(ErrorType.unknown, null);
        }
    }

    /* compiled from: VkPlayerException.kt */
    public static final class HttpDataSourceVkPlayerException extends VkPlayerException {
        private final int responseError;
        private final Uri uri;

        public HttpDataSourceVkPlayerException(Exception exc, int i, Uri uri) {
            super(ErrorType.source_error, exc);
            this.responseError = i;
            this.uri = uri;
        }
    }

    /* compiled from: VkPlayerException.kt */
    public static final class NetworkError extends VkPlayerException {
        private final boolean isNoNetwork;

        public NetworkError() {
            this(null, false);
        }

        public final boolean g() {
            return this.isNoNetwork;
        }

        public NetworkError(Throwable th, boolean z) {
            super(ErrorType.unknown, th);
            this.isNoNetwork = z;
        }
    }

    /* compiled from: VkPlayerException.kt */
    public static final class NoVkMixException extends VkPlayerException {
        public NoVkMixException() {
            this(0);
        }

        public NoVkMixException(int i) {
            super(ErrorType.unknown, null);
        }
    }

    /* compiled from: VkPlayerException.kt */
    public static final class OfflineKeysMissingVkPlayerException extends VkPlayerException {
        public OfflineKeysMissingVkPlayerException(Exception exc) {
            super(ErrorType.offline_keys_missing, exc);
        }
    }

    /* compiled from: VkPlayerException.kt */
    public static final class UnknownVkPlayerException extends VkPlayerException {
        public UnknownVkPlayerException(Exception exc) {
            super(ErrorType.unknown, exc);
        }
    }

    public VkPlayerException(ErrorType errorType, Throwable th) {
        super(th);
        this.errorType = errorType;
    }

    public final ErrorType d() {
        return this.errorType;
    }
}
