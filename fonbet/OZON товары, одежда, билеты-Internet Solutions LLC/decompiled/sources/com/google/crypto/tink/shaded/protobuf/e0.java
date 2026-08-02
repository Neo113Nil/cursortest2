package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class e0 implements P {

    /* renamed from: a, reason: collision with root package name */
    private final S f59363a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59364b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f59365c;

    /* renamed from: d, reason: collision with root package name */
    private final int f59366d;

    e0(S s11, String str, Object[] objArr) {
        this.f59363a = s11;
        this.f59364b = str;
        this.f59365c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f59366d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f59366d = i11 | (charAt2 << i13);
                return;
            } else {
                i11 |= (charAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    final Object[] a() {
        return this.f59365c;
    }

    final String b() {
        return this.f59364b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final S getDefaultInstance() {
        return this.f59363a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final b0 getSyntax() {
        int i11 = this.f59366d;
        return (i11 & 1) != 0 ? b0.PROTO2 : (i11 & 4) == 4 ? b0.EDITIONS : b0.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final boolean isMessageSetWireFormat() {
        return (this.f59366d & 2) == 2;
    }
}
