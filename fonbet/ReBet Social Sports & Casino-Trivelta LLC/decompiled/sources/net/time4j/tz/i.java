package net.time4j.tz;

import li.InterfaceC5472f;

/* loaded from: classes5.dex */
public class i implements InterfaceC5472f {

    /* renamed from: a, reason: collision with root package name */
    public final long f58342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58343b;

    public i(long j10, int i10) {
        this.f58342a = j10;
        this.f58343b = i10;
    }

    public static InterfaceC5472f b(long j10, int i10) {
        if (i10 == 0) {
            j10--;
        }
        return new i(j10, i10 == 0 ? 999999999 : i10 - 1);
    }

    @Override // li.InterfaceC5472f
    public int a() {
        return this.f58343b;
    }

    @Override // li.InterfaceC5472f
    public long k() {
        return this.f58342a;
    }
}
