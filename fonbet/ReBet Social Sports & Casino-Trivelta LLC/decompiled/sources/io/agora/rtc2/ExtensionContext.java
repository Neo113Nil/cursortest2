package io.agora.rtc2;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class ExtensionContext {
    public String extensionName;
    public boolean isValid;
    public String providerName;
    public int uid;

    @CalledByNative
    public ExtensionContext() {
        this.isValid = false;
        this.uid = 0;
        this.providerName = "";
        this.extensionName = "";
    }

    @CalledByNative
    public ExtensionContext(int i10, String str, String str2) {
        this.isValid = true;
        this.uid = i10;
        this.providerName = str;
        this.extensionName = str2;
    }
}
