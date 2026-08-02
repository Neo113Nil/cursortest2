package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.networkhandler.ConnectionHandler;
import xe.Y;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aF\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "", "maxRetries", "Lru/ozon/app/android/network/networkhandler/ConnectionHandler;", "connectionHandler", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "withRetry", "(ILru/ozon/app/android/network/networkhandler/ConnectionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "", "isTimeoutException", "(Ljava/io/IOException;)Z", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RetryHelperKt {
    private static final boolean isTimeoutException(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if (iOException2 instanceof SocketTimeoutException) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:11:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withRetry(int i11, @NotNull ConnectionHandler connectionHandler, @NotNull Function1<? super d<? super T>, ? extends Object> function1, @NotNull d<? super T> dVar) {
        RetryHelperKt$withRetry$1 retryHelperKt$withRetry$1;
        int i12;
        int i13;
        int i14;
        Function1<? super d<? super T>, ? extends Object> function12;
        ConnectionHandler connectionHandler2;
        Exception exc;
        IOException iOException;
        ConnectionHandler connectionHandler3;
        IOException iOException2;
        if (dVar instanceof RetryHelperKt$withRetry$1) {
            retryHelperKt$withRetry$1 = (RetryHelperKt$withRetry$1) dVar;
            int i15 = retryHelperKt$withRetry$1.label;
            if ((i15 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                retryHelperKt$withRetry$1.label = i15 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = retryHelperKt$withRetry$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = retryHelperKt$withRetry$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    i13 = i11;
                    i14 = 0;
                    function12 = function1;
                    connectionHandler2 = connectionHandler;
                    exc = null;
                } else {
                    if (i12 == 1) {
                        i14 = retryHelperKt$withRetry$1.I$1;
                        i13 = retryHelperKt$withRetry$1.I$0;
                        Function1<? super d<? super T>, ? extends Object> function13 = (Function1) retryHelperKt$withRetry$1.L$1;
                        connectionHandler3 = (ConnectionHandler) retryHelperKt$withRetry$1.L$0;
                        try {
                            s.b(obj);
                            return obj;
                        } catch (IOException e11) {
                            iOException = e11;
                            function12 = function13;
                            iOException2 = iOException;
                            if (isTimeoutException(iOException2)) {
                                throw iOException2;
                            }
                            if (i14 == i13) {
                                throw iOException2;
                            }
                            if (!connectionHandler3.hasInternetConnection()) {
                                throw iOException2;
                            }
                            i14++;
                            long j11 = (1 << i14) * 1000;
                            if (j11 > 32000) {
                                j11 = 32000;
                            }
                            retryHelperKt$withRetry$1.L$0 = connectionHandler3;
                            retryHelperKt$withRetry$1.L$1 = function12;
                            retryHelperKt$withRetry$1.L$2 = iOException2;
                            retryHelperKt$withRetry$1.I$0 = i13;
                            retryHelperKt$withRetry$1.I$1 = i14;
                            retryHelperKt$withRetry$1.label = 2;
                            if (Y.b(j11, retryHelperKt$withRetry$1) != aVar) {
                                ConnectionHandler connectionHandler4 = connectionHandler3;
                                exc = iOException2;
                                connectionHandler2 = connectionHandler4;
                                if (i14 > i13) {
                                }
                            }
                        }
                    }
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = retryHelperKt$withRetry$1.I$1;
                    i13 = retryHelperKt$withRetry$1.I$0;
                    Exception exc2 = (Exception) retryHelperKt$withRetry$1.L$2;
                    Function1<? super d<? super T>, ? extends Object> function14 = (Function1) retryHelperKt$withRetry$1.L$1;
                    ConnectionHandler connectionHandler5 = (ConnectionHandler) retryHelperKt$withRetry$1.L$0;
                    s.b(obj);
                    function12 = function14;
                    exc = exc2;
                    connectionHandler2 = connectionHandler5;
                }
                if (i14 > i13) {
                    if (exc != null) {
                        throw exc;
                    }
                    throw new RuntimeException("Неизвестная ошибка");
                }
                try {
                } catch (IOException e12) {
                    iOException = e12;
                    connectionHandler3 = connectionHandler2;
                    iOException2 = iOException;
                    if (isTimeoutException(iOException2)) {
                    }
                }
                retryHelperKt$withRetry$1.L$0 = connectionHandler2;
                retryHelperKt$withRetry$1.L$1 = function12;
                retryHelperKt$withRetry$1.L$2 = null;
                retryHelperKt$withRetry$1.I$0 = i13;
                retryHelperKt$withRetry$1.I$1 = i14;
                retryHelperKt$withRetry$1.label = 1;
                Object invoke = function12.invoke(retryHelperKt$withRetry$1);
                return invoke == aVar ? aVar : invoke;
            }
        }
        retryHelperKt$withRetry$1 = new RetryHelperKt$withRetry$1(dVar);
        Object obj2 = retryHelperKt$withRetry$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = retryHelperKt$withRetry$1.label;
        if (i12 != 0) {
        }
        if (i14 > i13) {
        }
    }

    public static /* synthetic */ Object withRetry$default(int i11, ConnectionHandler connectionHandler, Function1 function1, d dVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 6;
        }
        return withRetry(i11, connectionHandler, function1, dVar);
    }
}
