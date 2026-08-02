package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class b extends Exception {

    @NonNull
    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Status status) {
        super(r4.toString());
        int i10 = status.i();
        String j10 = status.j() != null ? status.j() : "";
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2 + String.valueOf(j10).length());
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(j10);
        this.mStatus = status;
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.i();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.j();
    }
}
