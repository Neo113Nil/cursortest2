package com.twilio.voice;

import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes4.dex */
public class LogParameters {

    @NonNull
    public String file;

    @NonNull
    public String function;

    @NonNull
    public LogLevel level;
    public int line;

    @NonNull
    public String message;

    @NonNull
    public LogModule module;

    @NonNull
    public String tag;

    @NonNull
    public String thread;

    @NonNull
    public String timestamp;
    public Throwable tr;

    public static class Builder {

        @NonNull
        private LogLevel level;

        @NonNull
        private String message;

        @NonNull
        private String tag;
        private Throwable tr;

        @NonNull
        private LogModule module = LogModule.PLATFORM;

        @NonNull
        private String timestamp = LogParameters.getTimestamp();

        @NonNull
        public String file = "";

        @NonNull
        private String function = "";
        private int line = 0;

        @NonNull
        private String thread = LogParameters.getThreadNameOrId();

        public Builder(@NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2) {
            this.tag = "";
            this.message = "";
            Preconditions.checkNotNull(logLevel, "Level must not be null");
            Preconditions.checkNotNull(str, "Tag must not be null");
            Preconditions.checkNotNull(str2, "Message must not be null");
            this.level = logLevel;
            this.tag = str;
            this.message = str2;
        }

        @NonNull
        public LogParameters build() {
            return new LogParameters(this);
        }

        @NonNull
        public Builder file(@NonNull String str) {
            Preconditions.checkNotNull(str, "Filename must not be null");
            this.file = str;
            return this;
        }

        @NonNull
        public Builder function(@NonNull String str) {
            Preconditions.checkNotNull(str, "Method name must not be null");
            this.function = str;
            return this;
        }

        public Builder line(int i10) {
            this.line = i10;
            return this;
        }

        @NonNull
        public Builder module(@NonNull LogModule logModule) {
            Preconditions.checkNotNull(logModule, "Module must not be null");
            this.module = logModule;
            return this;
        }

        @NonNull
        public Builder thread(String str) {
            Preconditions.checkNotNull(str, "Thread name or id must not be null");
            this.thread = str;
            return this;
        }

        public Builder throwable(Throwable th2) {
            this.tr = th2;
            return this;
        }

        @NonNull
        public Builder timestamp(@NonNull String str) {
            Preconditions.checkNotNull(str, "Timestamp must not be null");
            this.timestamp = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getThreadNameOrId() {
        return !Thread.currentThread().getName().isEmpty() ? Thread.currentThread().getName() : Long.toString(Thread.currentThread().getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getTimestamp() {
        return new SimpleDateFormat("yy-MM-dd hh:mm:ss.SSS", Locale.US).format(Calendar.getInstance().getTime()).toString();
    }

    private LogParameters(@NonNull Builder builder) {
        Preconditions.checkNotNull(builder, "Builder must not be null");
        this.module = builder.module;
        this.level = builder.level;
        this.timestamp = builder.timestamp;
        this.file = builder.file;
        this.function = builder.function;
        this.line = builder.line;
        this.tag = builder.tag;
        this.message = builder.message;
        this.thread = builder.thread;
        this.tr = builder.tr;
    }

    public LogParameters(@NonNull LogModule logModule, @NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull String str4, @NonNull String str5, @NonNull String str6) {
        Preconditions.checkNotNull(logModule, "Module must not be null");
        Preconditions.checkNotNull(logLevel, "Level must not be null");
        Preconditions.checkNotNull(str, "Timestamp must not be null");
        Preconditions.checkNotNull(str2, "Filename must not be null");
        Preconditions.checkNotNull(str3, "Method name must not be null");
        Preconditions.checkNotNull(str4, "Tag must not be null");
        Preconditions.checkNotNull(str5, "Message must not be null");
        Preconditions.checkNotNull(str6, "Thread name or id must not be null");
        this.module = logModule;
        this.level = logLevel;
        this.timestamp = str.isEmpty() ? getTimestamp() : str;
        this.file = str2;
        this.function = str3;
        this.line = i10;
        this.tag = str4;
        this.message = str5;
        this.thread = str6;
    }

    public LogParameters(@NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2) {
        this(LogModule.PLATFORM, logLevel, getTimestamp(), "", "", 0, str, str2, getThreadNameOrId());
    }
}
