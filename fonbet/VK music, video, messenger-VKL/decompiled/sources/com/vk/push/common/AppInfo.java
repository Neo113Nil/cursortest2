package com.vk.push.common;

import xsna.epx;
import xsna.ho8;

/* compiled from: AppInfo.kt */
/* loaded from: classes5.dex */
public final class AppInfo {
    public final String a;
    public final String b;

    public AppInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.b;
        }
        return appInfo.copy(str, str2);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final AppInfo copy(String str, String str2) {
        return new AppInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return epx.f(this.a, appInfo.a) && epx.f(this.b, appInfo.b);
    }

    public final String getPackageName() {
        return this.a;
    }

    public final String getPubKey() {
        return this.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfo(packageName=");
        sb.append(this.a);
        sb.append(", pubKey=");
        return ho8.a(sb, this.b, ')');
    }
}
