package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import defpackage.km5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class LevelPlayInitRequest {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    @NotNull
    private final List<LevelPlay.AdFormat> c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {

        @NotNull
        private final String a;

        @Nullable
        private String b;

        public Builder(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.a, this.b, null, 4, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.a;
        }

        @NotNull
        public final Builder withUserId(@NotNull String str) {
            str.getClass();
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

    @NotNull
    public final String getAppKey() {
        return this.a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.c;
    }

    @Nullable
    public final String getUserId() {
        return this.b;
    }

    public LevelPlayInitRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? km5.a : list);
    }
}
