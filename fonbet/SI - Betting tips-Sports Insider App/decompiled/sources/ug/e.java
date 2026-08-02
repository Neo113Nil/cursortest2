package ug;

import com.android.billingclient.api.l0;
import com.android.billingclient.api.u0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l0 writer, boolean z5) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f24269c = z5;
    }

    @Override // com.android.billingclient.api.u0
    public final void j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f24269c) {
            super.j(value);
        } else {
            h(value);
        }
    }
}
