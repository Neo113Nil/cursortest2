package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.ByteString;

/* compiled from: ByteString.java */
/* loaded from: classes12.dex */
public final class f extends ByteString.a {
    public int b = 0;
    public final int c;
    public final /* synthetic */ ByteString d;

    public f(ByteString byteString) {
        this.d = byteString;
        this.c = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
