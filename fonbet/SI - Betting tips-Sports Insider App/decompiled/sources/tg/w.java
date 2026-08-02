package tg;

import com.sports.insider.data.repository.room.live.LiveTable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f23961a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final qg.h f23962b = y4.a.d("kotlinx.serialization.json.JsonNull", qg.j.f22177e, new qg.g[0], new k2.d0(16));

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y4.a.c(decoder);
        if (!decoder.x()) {
            return v.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", LiveTable.messageColumn);
        Intrinsics.checkNotNullParameter("Expected 'null' literal", LiveTable.messageColumn);
        throw new ug.h("Expected 'null' literal");
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        v value = (v) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y4.a.b(encoder);
        encoder.m();
    }

    @Override // og.a
    public final qg.g d() {
        return f23962b;
    }
}
