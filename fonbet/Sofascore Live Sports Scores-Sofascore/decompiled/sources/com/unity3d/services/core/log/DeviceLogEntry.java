package com.unity3d.services.core.log;

import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class DeviceLogEntry {
    private DeviceLogLevel _logLevel;
    private String _originalMessage;
    private StackTraceElement _stackTraceElement;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel, String str, StackTraceElement stackTraceElement) {
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        String str;
        String str2;
        int i;
        String str3 = this._originalMessage;
        StackTraceElement stackTraceElement = this._stackTraceElement;
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
            str2 = this._stackTraceElement.getMethodName();
            i = this._stackTraceElement.getLineNumber();
        } else {
            str = "UnknownClass";
            str2 = "unknownMethod";
            i = -1;
        }
        if (str3 != null && !str3.isEmpty()) {
            str3 = " :: ".concat(str3);
        }
        if (str3 == null) {
            str3 = "";
        }
        return str + "." + str2 + "()" + lnb.k(i, " (line:", ")") + str3;
    }
}
