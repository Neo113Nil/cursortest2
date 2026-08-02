package gh;

import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f10135a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f10136b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10137c;

    public c0() {
        String boundary = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(boundary, "toString(...)");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.f10135a = ByteString.INSTANCE.encodeUtf8(boundary);
        this.f10136b = e0.f10140f;
        this.f10137c = new ArrayList();
    }
}
