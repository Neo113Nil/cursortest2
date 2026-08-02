package com.mbridge.msdk.dycreator.error;

import org.chromium.net.NetError;

/* compiled from: FixedError.java */
/* loaded from: classes13.dex */
public enum b {
    NOT_FOUND_VIEWOPTION(NetError.ERR_CONNECTION_RESET, "ViewOption is null"),
    NOT_FOUND_CONTEXT(NetError.ERR_CONNECTION_REFUSED, "context is null"),
    FILE_CREATE_VIEW_FILE(NetError.ERR_CONNECTION_ABORTED, "file create view is null"),
    CAMPAIGNEX_IS_NULL(NetError.ERR_CONNECTION_FAILED, "Campaign size only one"),
    NOT_FOUND_CAMPAIGN(NetError.ERR_NAME_NOT_RESOLVED, "campaign is null"),
    NOT_FOUND_DYNAMIC_FILE(NetError.ERR_INTERNET_DISCONNECTED, "dynamic file is not exits"),
    BIND_DATA_FILE_OR_DIR(NetError.ERR_SSL_PROTOCOL_ERROR, "data file or file dir is not exits "),
    NOT_FOUND_DYNAMIC_OPTION(NetError.ERR_ADDRESS_INVALID, "dynamic_option is not exits");

    private int a;
    private String b;

    b(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int g() {
        return this.a;
    }

    public String h() {
        return this.b;
    }
}
