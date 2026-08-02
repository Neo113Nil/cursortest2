package expo.modules.blur;

import expo.modules.kotlin.exception.CodedException;
import kotlin.Metadata;

/* compiled from: BlurModuleExceptions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/blur/InvalidBlurTargetIdException;", "Lexpo/modules/kotlin/exception/CodedException;", "info", "", "<init>", "(Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "expo-blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvalidBlurTargetIdException extends CodedException {
    private final String info;

    public final String getInfo() {
        return this.info;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        if (r0 == null) goto L5;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InvalidBlurTargetIdException(String str) {
        super("The provided blur target id is invalid." + r0, null, 2, null);
        String str2;
        if (str != null) {
            str2 = " " + str;
        }
        str2 = "";
        this.info = str;
    }
}
