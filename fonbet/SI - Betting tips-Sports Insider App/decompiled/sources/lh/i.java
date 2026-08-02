package lh;

import gh.a0;
import gh.b0;
import gh.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okio.BufferedSource;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f20098c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20099d;

    /* renamed from: e, reason: collision with root package name */
    public final BufferedSource f20100e;

    public i(String str, long j, BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f20098c = str;
        this.f20099d = j;
        this.f20100e = source;
    }

    @Override // gh.r0
    public final long k() {
        return this.f20099d;
    }

    @Override // gh.r0
    public final BufferedSource m0() {
        return this.f20100e;
    }

    @Override // gh.r0
    public final b0 n() {
        String str = this.f20098c;
        if (str == null) {
            return null;
        }
        Regex regex = b0.f10117d;
        return a0.b(str);
    }
}
