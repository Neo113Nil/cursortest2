package org.slf4j.event;

/* loaded from: classes5.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");


    /* renamed from: a, reason: collision with root package name */
    public int f62212a;

    /* renamed from: b, reason: collision with root package name */
    public String f62213b;

    b(int i10, String str) {
        this.f62212a = i10;
        this.f62213b = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f62213b;
    }
}
