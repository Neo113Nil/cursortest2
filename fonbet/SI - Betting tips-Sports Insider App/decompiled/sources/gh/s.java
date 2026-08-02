package gh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okio.Buffer;
import okio.BufferedSink;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s extends m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f10299d;

    /* renamed from: b, reason: collision with root package name */
    public final List f10300b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10301c;

    static {
        Regex regex = b0.f10117d;
        f10299d = a0.a("application/x-www-form-urlencoded");
    }

    public s(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f10300b = hh.g.j(encodedNames);
        this.f10301c = hh.g.j(encodedValues);
    }

    @Override // gh.m0
    public final long a() {
        return e(null, true);
    }

    @Override // gh.m0
    public final b0 b() {
        return f10299d;
    }

    @Override // gh.m0
    public final void d(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        e(sink, false);
    }

    public final long e(BufferedSink bufferedSink, boolean z5) {
        Buffer buffer;
        if (z5) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        List list = this.f10300b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) list.get(i5));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f10301c.get(i5));
        }
        if (!z5) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }
}
