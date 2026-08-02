package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import defpackage.bf3;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_LoggableException extends LoggableException {

    @Nullable
    private final String message;

    @Nullable
    private final String name;

    @Nullable
    private final String stackTrace;

    public AutoValue_LoggableException(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.message = str2;
        this.stackTrace = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoggableException) {
            LoggableException loggableException = (LoggableException) obj;
            String str = this.name;
            if (str != null ? str.equals(loggableException.name()) : loggableException.name() == null) {
                String str2 = this.message;
                if (str2 != null ? str2.equals(loggableException.message()) : loggableException.message() == null) {
                    String str3 = this.stackTrace;
                    if (str3 != null ? str3.equals(loggableException.stackTrace()) : loggableException.stackTrace() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.stackTrace;
        return (((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.LoggableException
    @Nullable
    public String message() {
        return this.message;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.LoggableException
    @Nullable
    public String name() {
        return this.name;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.LoggableException
    @Nullable
    public String stackTrace() {
        return this.stackTrace;
    }

    public String toString() {
        String str = this.name;
        int length = String.valueOf(str).length();
        String str2 = this.message;
        int length2 = String.valueOf(str2).length();
        String str3 = this.stackTrace;
        StringBuilder sb = new StringBuilder(wt3.h(length, 33, length2, 13, String.valueOf(str3).length()) + 1);
        bf3.v(sb, "LoggableException{name=", str, ", message=", str2);
        return wt3.m(", stackTrace=", str3, sb, "}");
    }
}
