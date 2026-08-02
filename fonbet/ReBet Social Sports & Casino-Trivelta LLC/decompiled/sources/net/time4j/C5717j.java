package net.time4j;

import java.io.Serializable;

/* renamed from: net.time4j.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5717j implements Serializable {
    private static final long serialVersionUID = -4124961309622141228L;
    private final long days;
    private final G time;

    public C5717j(long j10, G g10) {
        this.days = j10;
        this.time = g10;
    }

    public long a() {
        return this.days;
    }

    public G b() {
        return this.time;
    }
}
