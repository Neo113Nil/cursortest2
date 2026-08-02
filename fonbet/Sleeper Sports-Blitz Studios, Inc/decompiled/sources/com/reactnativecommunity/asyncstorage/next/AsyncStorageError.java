package com.reactnativecommunity.asyncstorage.next;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ErrorHelpers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageError;", "", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AsyncStorageError extends Throwable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String errorMessage;

    public /* synthetic */ AsyncStorageError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    private AsyncStorageError(String str) {
        super(str);
        this.errorMessage = str;
    }

    /* compiled from: ErrorHelpers.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageError$Companion;", "", "<init>", "()V", "keyIsNull", "Lcom/reactnativecommunity/asyncstorage/next/AsyncStorageError;", "keyNotString", "valueNotString", SDKConstants.PARAM_KEY, "", "invalidKeyValueFormat", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AsyncStorageError keyIsNull() {
            return new AsyncStorageError("Key cannot be null.", null);
        }

        public final AsyncStorageError keyNotString() {
            return new AsyncStorageError("Provided key is not string. Only strings are supported as storage key.", null);
        }

        public final AsyncStorageError valueNotString(String key) {
            String str;
            if (key == null) {
                str = "Provided value";
            } else {
                str = "Value for key \"" + key + "\"";
            }
            return new AsyncStorageError(str + " is not a string. Only strings are supported as a value.", null);
        }

        public final AsyncStorageError invalidKeyValueFormat() {
            return new AsyncStorageError("Invalid key-value format. Expected a list of [key, value] list.", null);
        }
    }
}
