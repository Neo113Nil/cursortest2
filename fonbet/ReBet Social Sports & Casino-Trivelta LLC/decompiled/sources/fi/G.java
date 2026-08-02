package fi;

import ei.AbstractC4212b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class G extends AbstractC4287c {

    /* renamed from: h, reason: collision with root package name */
    public final JsonElement f46688h;

    public /* synthetic */ G(AbstractC4212b abstractC4212b, JsonElement jsonElement, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4212b, jsonElement, (i10 & 4) != 0 ? null : str);
    }

    @Override // fi.AbstractC4287c
    public JsonElement A0() {
        return this.f46688h;
    }

    @Override // ci.c
    public int e(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // fi.AbstractC4287c
    public JsonElement m0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return A0();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AbstractC4212b json, JsonElement value, String str) {
        super(json, value, str, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46688h = value;
        d0("primitive");
    }
}
