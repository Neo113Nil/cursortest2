package com.microsoft.codepush.react;

import android.content.Context;

/* loaded from: classes8.dex */
public class CodePushBuilder {
    private Context mContext;
    private boolean mIsDebugMode;
    private Integer mPublicKeyResourceDescriptor;
    private String mServerUrl = CodePush.getServiceUrl();

    public CodePushBuilder(Context context) {
        this.mContext = context;
    }

    public CodePushBuilder setIsDebugMode(boolean z) {
        this.mIsDebugMode = z;
        return this;
    }

    public CodePushBuilder setServerUrl(String str) {
        this.mServerUrl = str;
        return this;
    }

    public CodePushBuilder setPublicKeyResourceDescriptor(int i) {
        this.mPublicKeyResourceDescriptor = Integer.valueOf(i);
        return this;
    }

    public CodePush build() {
        return new CodePush(this.mContext, this.mIsDebugMode, this.mServerUrl, this.mPublicKeyResourceDescriptor);
    }
}
