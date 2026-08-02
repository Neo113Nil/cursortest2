package com.unity3d.ads.core.data.model;

import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* compiled from: ShowConfigurationInternal.kt */
/* loaded from: classes14.dex */
public final class ShowConfigurationInternal {
    private final String customRewardString;
    private final Map<String, String> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowConfigurationInternal() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShowConfigurationInternal copy$default(ShowConfigurationInternal showConfigurationInternal, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showConfigurationInternal.customRewardString;
        }
        if ((i & 2) != 0) {
            map = showConfigurationInternal.extras;
        }
        return showConfigurationInternal.copy(str, map);
    }

    public final String component1() {
        return this.customRewardString;
    }

    public final Map<String, String> component2() {
        return this.extras;
    }

    public final ShowConfigurationInternal copy(String str, Map<String, String> map) {
        return new ShowConfigurationInternal(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowConfigurationInternal)) {
            return false;
        }
        ShowConfigurationInternal showConfigurationInternal = (ShowConfigurationInternal) obj;
        return epx.f(this.customRewardString, showConfigurationInternal.customRewardString) && epx.f(this.extras, showConfigurationInternal.extras);
    }

    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public int hashCode() {
        String str = this.customRewardString;
        return this.extras.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ShowConfigurationInternal(customRewardString=");
        sb.append(this.customRewardString);
        sb.append(", extras=");
        return cjl0.a(sb, this.extras, ')');
    }

    public ShowConfigurationInternal(String str, Map<String, String> map) {
        this.customRewardString = str;
        this.extras = map;
    }

    public /* synthetic */ ShowConfigurationInternal(String str, Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? jgp.b : map);
    }
}
