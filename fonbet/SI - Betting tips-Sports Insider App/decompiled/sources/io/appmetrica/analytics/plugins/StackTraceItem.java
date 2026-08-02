package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    private final String f15253a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15254b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f15255c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15256d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15257e;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f15258a;

        /* renamed from: b, reason: collision with root package name */
        private String f15259b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f15260c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f15261d;

        /* renamed from: e, reason: collision with root package name */
        private String f15262e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.f15258a, this.f15259b, this.f15260c, this.f15261d, this.f15262e, 0);
        }

        @NonNull
        public Builder withClassName(String str) {
            this.f15258a = str;
            return this;
        }

        @NonNull
        public Builder withColumn(Integer num) {
            this.f15261d = num;
            return this;
        }

        @NonNull
        public Builder withFileName(String str) {
            this.f15259b = str;
            return this;
        }

        @NonNull
        public Builder withLine(Integer num) {
            this.f15260c = num;
            return this;
        }

        @NonNull
        public Builder withMethodName(String str) {
            this.f15262e = str;
            return this;
        }
    }

    public /* synthetic */ StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, int i5) {
        this(str, str2, num, num2, str3);
    }

    public String getClassName() {
        return this.f15253a;
    }

    public Integer getColumn() {
        return this.f15256d;
    }

    public String getFileName() {
        return this.f15254b;
    }

    public Integer getLine() {
        return this.f15255c;
    }

    public String getMethodName() {
        return this.f15257e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f15253a = str;
        this.f15254b = str2;
        this.f15255c = num;
        this.f15256d = num2;
        this.f15257e = str3;
    }
}
