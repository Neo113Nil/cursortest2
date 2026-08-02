package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class IceServer {
    public final String password;
    public final String serverUrl;
    public final String username;

    public IceServer(@NonNull String str) {
        this(str, "", "");
    }

    public IceServer(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        this.username = str2;
        this.password = str3;
        this.serverUrl = str;
    }
}
