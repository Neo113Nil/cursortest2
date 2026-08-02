package net.time4j.format;

/* loaded from: classes5.dex */
public enum g {
    STRICT,
    SMART,
    LAX;

    public boolean a() {
        return this == LAX;
    }

    public boolean b() {
        return this == SMART;
    }

    public boolean c() {
        return this == STRICT;
    }
}
