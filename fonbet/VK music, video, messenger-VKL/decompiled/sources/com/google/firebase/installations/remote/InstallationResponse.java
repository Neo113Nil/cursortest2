package com.google.firebase.installations.remote;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.installations.remote.a;

/* loaded from: classes13.dex */
public abstract class InstallationResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {
        private static final /* synthetic */ ResponseCode[] $VALUES;
        public static final ResponseCode BAD_CONFIG;
        public static final ResponseCode OK;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            OK = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            BAD_CONFIG = responseCode2;
            $VALUES = new ResponseCode[]{responseCode, responseCode2};
        }

        public ResponseCode() {
            throw null;
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) $VALUES.clone();
        }
    }

    public static abstract class a {
    }

    @NonNull
    public static a.C0139a a() {
        return new a.C0139a();
    }

    @Nullable
    public abstract TokenResult b();

    @Nullable
    public abstract String c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract ResponseCode e();

    @Nullable
    public abstract String f();
}
