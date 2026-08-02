package com.reactnativecompressor.Utils;

import kotlin.Metadata;

/* compiled from: UploaderHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nB\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/reactnativecompressor/Utils/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/reactnativecompressor/Utils/CodedThrowable;", "message", "", "<init>", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "code", "getCode", "()Ljava/lang/String;", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class CodedException extends Exception implements CodedThrowable {
    public CodedException(String str) {
        super(str);
    }

    public CodedException(Throwable th) {
        super(th);
    }

    public CodedException(String str, Throwable th) {
        super(str, th);
    }

    @Override // com.reactnativecompressor.Utils.CodedThrowable
    public String getCode() {
        return "ERR_UNSPECIFIED_ANDROID_EXCEPTION";
    }
}
