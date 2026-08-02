package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class UserInfo {
    public int uid;
    public String userAccount;

    public UserInfo() {
    }

    @CalledByNative
    public void SetUid(int i10) {
        this.uid = i10;
    }

    @CalledByNative
    public void SetUserAccount(String str) {
        this.userAccount = str;
    }

    public UserInfo(int i10, String str) {
        this.uid = i10;
        this.userAccount = str;
    }
}
