package kd;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC7713u;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7662a extends AbstractC7713u {

    /* renamed from: a, reason: collision with root package name */
    private final int f71419a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71420b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f71421c;

    /* renamed from: d, reason: collision with root package name */
    private int f71422d;

    public C7662a(char c11, char c12, int i11) {
        this.f71419a = i11;
        this.f71420b = c12;
        boolean z11 = false;
        if (i11 <= 0 ? Intrinsics.i(c11, c12) >= 0 : Intrinsics.i(c11, c12) <= 0) {
            z11 = true;
        }
        this.f71421c = z11;
        this.f71422d = z11 ? c11 : c12;
    }

    @Override // kotlin.collections.AbstractC7713u
    public final char b() {
        int i11 = this.f71422d;
        if (i11 != this.f71420b) {
            this.f71422d = this.f71419a + i11;
        } else {
            if (!this.f71421c) {
                throw new NoSuchElementException();
            }
            this.f71421c = false;
        }
        return (char) i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71421c;
    }
}
