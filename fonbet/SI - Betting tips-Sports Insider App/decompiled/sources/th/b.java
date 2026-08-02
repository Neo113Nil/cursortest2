package th;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23968a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f23969b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public ByteString f23970c;

    /* renamed from: d, reason: collision with root package name */
    public ByteString f23971d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f23972e;

    public abstract Source a();

    public final void b() {
        try {
            BufferedSource buffer = Okio.buffer(a());
            try {
                ByteString readByteString = buffer.readByteString(buffer.readInt());
                ByteString readByteString2 = buffer.readByteString(buffer.readInt());
                Unit unit = Unit.f19194a;
                buffer.close();
                synchronized (this) {
                    Intrinsics.checkNotNull(readByteString);
                    Intrinsics.checkNotNullParameter(readByteString, "<set-?>");
                    this.f23970c = readByteString;
                    Intrinsics.checkNotNull(readByteString2);
                    Intrinsics.checkNotNullParameter(readByteString2, "<set-?>");
                    this.f23971d = readByteString2;
                }
            } finally {
            }
        } finally {
            this.f23969b.countDown();
        }
    }
}
