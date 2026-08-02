package fi;

import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public final class N extends AbstractC4287c {

    /* renamed from: h, reason: collision with root package name */
    public final JsonArray f46699h;

    /* renamed from: i, reason: collision with root package name */
    public final int f46700i;

    /* renamed from: j, reason: collision with root package name */
    public int f46701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC4212b json, JsonArray value) {
        super(json, value, null, 4, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f46699h = value;
        this.f46700i = A0().size();
        this.f46701j = -1;
    }

    @Override // fi.AbstractC4287c
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public JsonArray A0() {
        return this.f46699h;
    }

    @Override // ci.c
    public int e(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i10 = this.f46701j;
        if (i10 >= this.f46700i - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f46701j = i11;
        return i11;
    }

    @Override // di.AbstractC4110q0
    public String g0(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // fi.AbstractC4287c
    public JsonElement m0(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return A0().get(Integer.parseInt(tag));
    }
}
