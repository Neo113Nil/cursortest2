package pd;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, int i10) {
        super(i5);
        this.f21728a = i10;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f21728a) {
            case 0:
                String key = (String) obj;
                Bitmap value = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                return value.getByteCount() / Segment.SHARE_MINIMUM;
            case 1:
                ((Number) obj).intValue();
                Bitmap value2 = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(value2, "value");
                return value2.getByteCount() / Segment.SHARE_MINIMUM;
            default:
                ((Number) obj).intValue();
                Bitmap value3 = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(value3, "value");
                return value3.getByteCount() / Segment.SHARE_MINIMUM;
        }
    }
}
