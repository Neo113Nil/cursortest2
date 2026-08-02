package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class c0 implements M {

    /* renamed from: a, reason: collision with root package name */
    public final O f37276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37277b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37278c;
    private final Object[] objects;

    public c0(O o10, String str, Object[] objArr) {
        this.f37276a = o10;
        this.f37277b = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f37278c = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f37278c = i10 | (charAt2 << i11);
                return;
            } else {
                i10 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public Object[] a() {
        return this.objects;
    }

    public String b() {
        return this.f37277b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public O getDefaultInstance() {
        return this.f37276a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public Z getSyntax() {
        return (this.f37278c & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public boolean isMessageSetWireFormat() {
        return (this.f37278c & 2) == 2;
    }
}
