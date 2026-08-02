package com.google.firebase.storage;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseException;
import xsna.exc0;

/* loaded from: classes13.dex */
public class StorageException extends FirebaseException {
    public static final /* synthetic */ int b = 0;
    private Throwable cause;
    private final int errorCode;
    private final int httpResultCode;

    public StorageException(int i, Exception exc, int i2) {
        super(b(i));
        this.cause = exc;
        this.errorCode = i;
        this.httpResultCode = i2;
        Log.e("StorageException", "StorageException has occurred.\n" + b(i) + "\n Code: " + i + " HttpResult: " + i2);
        Throwable th = this.cause;
        if (th != null) {
            Log.e("StorageException", th.getMessage(), this.cause);
        }
    }

    @NonNull
    public static StorageException a(@NonNull Status status) {
        exc0.i(status);
        exc0.b(!status.i());
        return new StorageException(status.b == 16 ? -13040 : status.equals(Status.i) ? -13030 : -13000, null, 0);
    }

    public static String b(int i) {
        if (i == -13040) {
            return "The operation was cancelled.";
        }
        if (i == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    @Override // java.lang.Throwable
    @Nullable
    public final synchronized Throwable getCause() {
        Throwable th = this.cause;
        if (th == this) {
            return null;
        }
        return th;
    }
}
