package com.appsflyer.internal;

/* loaded from: classes6.dex */
public class AFe1mSDK {
    public final long getCurrencyIso4217Code;

    public AFe1mSDK(long j) {
        this.getCurrencyIso4217Code = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getCurrencyIso4217Code == ((AFe1mSDK) obj).getCurrencyIso4217Code;
    }

    public int hashCode() {
        long j = this.getCurrencyIso4217Code;
        return (int) (j ^ (j >>> 32));
    }
}
