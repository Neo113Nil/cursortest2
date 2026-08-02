package com.vk.im.engine.exceptions.stacktrace;

/* compiled from: StackTraceInfoException.kt */
/* loaded from: classes.dex */
public class StackTraceInfoException extends Exception {
    public static final long serialVersionUID = -3145810404727297429L;

    public StackTraceInfoException() {
        this("", null);
    }

    public StackTraceInfoException(String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        if (stackTraceElementArr != null) {
            setStackTrace(stackTraceElementArr);
        }
    }
}
