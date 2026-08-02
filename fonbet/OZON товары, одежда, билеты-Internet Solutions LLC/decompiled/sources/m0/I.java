package m0;

/* loaded from: classes.dex */
public interface I extends InterfaceC8002m<Float> {
    @Override // m0.InterfaceC8002m
    default X0 a(U0 u02) {
        return new d1(this);
    }

    long b(float f7, float f11, float f12);

    float c(float f7, float f11, float f12, long j11);

    float d(float f7, float f11, float f12, long j11);

    default float e(float f7, float f11, float f12) {
        return d(f7, f11, f12, b(f7, f11, f12));
    }
}
