package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import defpackage.km5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class InitRequest {

    @NotNull
    private final String a;

    @NotNull
    private final List<IronSourceAds.AdFormat> b;

    @NotNull
    private final LogLevel c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {

        @NotNull
        private final String a;

        @Nullable
        private List<? extends IronSourceAds.AdFormat> b;

        @Nullable
        private LogLevel c;

        public Builder(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final InitRequest build() {
            String str = this.a;
            List list = this.b;
            if (list == null) {
                list = km5.a;
            }
            LogLevel logLevel = this.c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> list) {
            list.getClass();
            this.b = list;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            logLevel.getClass();
            this.c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.a = str;
        this.b = list;
        this.c = logLevel;
    }

    @NotNull
    public final String getAppKey() {
        return this.a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.c;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }
}
