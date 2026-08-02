package ug;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n extends a {

    /* renamed from: f, reason: collision with root package name */
    public final tg.e f24282f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24283g;

    /* renamed from: h, reason: collision with root package name */
    public int f24284h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tg.c json, tg.e value) {
        super(json, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24282f = value;
        this.f24283g = value.f23942a.size();
        this.f24284h = -1;
    }

    @Override // ug.a
    public final tg.m F(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return (tg.m) this.f24282f.f23942a.get(Integer.parseInt(tag));
    }

    @Override // ug.a
    public final String R(qg.g descriptor, int i5) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i5);
    }

    @Override // ug.a
    public final tg.m T() {
        return this.f24282f;
    }

    @Override // rg.a
    public final int z(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i5 = this.f24284h;
        if (i5 >= this.f24283g - 1) {
            return -1;
        }
        int i10 = i5 + 1;
        this.f24284h = i10;
        return i10;
    }
}
