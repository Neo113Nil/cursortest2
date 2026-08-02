package com.unity3d.ads;

import java.util.Map;
import xsna.jgp;
import xsna.zcl;

/* compiled from: ShowConfiguration.kt */
/* loaded from: classes14.dex */
public final class ShowConfiguration {
    private final String customRewardString;
    private final Map<String, String> extras;

    /* compiled from: ShowConfiguration.kt */
    public static final class Builder {
        private String customRewardString;
        private Map<String, String> extras = jgp.b;

        public final ShowConfiguration build() {
            return new ShowConfiguration(this.customRewardString, this.extras, null);
        }

        public final Builder withCustomRewardString(String str) {
            this.customRewardString = str;
            return this;
        }

        public final Builder withExtras(Map<String, String> map) {
            this.extras = map;
            return this;
        }
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, zcl zclVar) {
        this(str, map);
    }

    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    private ShowConfiguration(String str, Map<String, String> map) {
        this.customRewardString = str;
        this.extras = map;
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? jgp.b : map);
    }
}
