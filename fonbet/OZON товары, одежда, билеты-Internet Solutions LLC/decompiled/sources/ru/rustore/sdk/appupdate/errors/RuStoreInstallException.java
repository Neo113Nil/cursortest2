package ru.rustore.sdk.appupdate.errors;

import kotlin.Metadata;
import wl0.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/rustore/sdk/appupdate/errors/RuStoreInstallException;", "Lwl0/c;", "", "code", "<init>", "(I)V", "I", "getCode", "()I", "sdk-public-appupdate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RuStoreInstallException extends c {
    private final int code;

    public RuStoreInstallException(int i11) {
        super("app update error");
        this.code = i11;
    }

    public final int getCode() {
        return this.code;
    }
}
