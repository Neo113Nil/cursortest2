package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    public final P f19471a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19473c;
    private final Object[] objects;

    public d0(P p10, String str, Object[] objArr) {
        this.f19471a = p10;
        this.f19472b = str;
        this.objects = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f19473c = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f19473c = i10 | (charAt2 << i11);
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
        return this.f19472b;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public P getDefaultInstance() {
        return this.f19471a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public a0 getSyntax() {
        int i10 = this.f19473c;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean isMessageSetWireFormat() {
        return (this.f19473c & 2) == 2;
    }
}
