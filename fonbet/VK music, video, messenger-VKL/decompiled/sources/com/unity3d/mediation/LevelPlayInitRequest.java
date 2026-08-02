package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class LevelPlayInitRequest {
    private final String a;
    private final String b;
    private final List<LevelPlay.AdFormat> c;

    public static final class Builder {
        private final String a;
        private String b;

        public Builder(String str) {
            this.a = str;
        }

        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.a, this.b, null, 4, null);
        }

        public final String getAppKey() {
            return this.a;
        }

        public final Builder withUserId(String str) {
            this.b = str;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String getAppKey() {
        return this.a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.c;
    }

    public final String getUserId() {
        return this.b;
    }

    public LevelPlayInitRequest(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? EmptyList.b : list);
    }
}
