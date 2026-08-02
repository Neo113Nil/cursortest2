package bo.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lbo/app/o3;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "innerException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class o3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(String message, Throwable innerException) {
        super(message, innerException);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(innerException, "innerException");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
