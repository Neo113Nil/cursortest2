package ug;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l extends a {

    /* renamed from: f, reason: collision with root package name */
    public final tg.m f24277f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tg.c json, tg.m value, String str) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24277f = value;
        this.f24260a.add("primitive");
    }

    @Override // ug.a
    public final tg.m F(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return this.f24277f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // ug.a
    public final tg.m T() {
        return this.f24277f;
    }

    @Override // rg.a
    public final int z(qg.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }
}
