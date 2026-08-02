package com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title;

import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: TitleViewState.kt */
/* loaded from: classes7.dex */
public final class TitleViewState {
    public final String a;
    public final ErrorType b;
    public final boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TitleViewState.kt */
    public static final class ErrorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType LONG;
        public static final ErrorType SHORT;

        static {
            ErrorType errorType = new ErrorType("SHORT", 0);
            SHORT = errorType;
            ErrorType errorType2 = new ErrorType("LONG", 1);
            LONG = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            $VALUES = errorTypeArr;
            $ENTRIES = new asp(errorTypeArr);
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public TitleViewState(String str, ErrorType errorType, boolean z) {
        this.a = str;
        this.b = errorType;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleViewState)) {
            return false;
        }
        TitleViewState titleViewState = (TitleViewState) obj;
        return epx.f(this.a, titleViewState.a) && this.b == titleViewState.b && this.c == titleViewState.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ErrorType errorType = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (errorType == null ? 0 : errorType.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TitleViewState(title=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", isFocused=");
        return q0.a(sb, this.c, ')');
    }
}
