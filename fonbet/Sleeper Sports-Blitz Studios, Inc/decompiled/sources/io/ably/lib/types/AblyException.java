package io.ably.lib.types;

import io.ably.lib.network.FailedConnectionException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes9.dex */
public class AblyException extends Exception {
    private static final long serialVersionUID = -3804072091596832634L;
    public ErrorInfo errorInfo;

    protected AblyException(Throwable th, ErrorInfo errorInfo) {
        super(th);
        this.errorInfo = errorInfo;
    }

    public static AblyException fromErrorInfo(ErrorInfo errorInfo) {
        return fromErrorInfo(new Exception(errorInfo.message), errorInfo);
    }

    public static AblyException fromErrorInfo(Throwable th, ErrorInfo errorInfo) {
        if (errorInfo.statusCode >= 500 && errorInfo.statusCode <= 504) {
            return new HostFailedException(th, errorInfo);
        }
        return new AblyException(th, errorInfo);
    }

    public static AblyException fromThrowable(Throwable th) {
        if (th instanceof AblyException) {
            return (AblyException) th;
        }
        if ((th instanceof ConnectException) || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof NoRouteToHostException)) {
            return new HostFailedException(th, ErrorInfo.fromThrowable(th));
        }
        if (th instanceof FailedConnectionException) {
            return new HostFailedException(th.getCause(), ErrorInfo.fromThrowable(th.getCause()));
        }
        return new AblyException(th, ErrorInfo.fromThrowable(th));
    }

    public static class HostFailedException extends AblyException {
        private static final long serialVersionUID = 1;

        HostFailedException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }
}
