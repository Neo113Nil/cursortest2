package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class flf extends glf implements Serializable {
    public flf(DefaultConstructorMarker defaultConstructorMarker) {
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return elf.a;
    }

    @Override // defpackage.glf
    public final int a(int i) {
        return glf.b.a(i);
    }

    @Override // defpackage.glf
    public final int d() {
        return glf.b.d();
    }

    @Override // defpackage.glf
    public final int e(int i, int i2) {
        return glf.b.e(0, i2);
    }

    @Override // defpackage.glf
    public final long g() {
        return glf.b.g();
    }

    @Override // defpackage.glf
    public final long h(long j, long j2) {
        return glf.b.h(0L, 1000L);
    }

    @Override // defpackage.glf
    public final long i() {
        throw null;
    }
}
