package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;

/* compiled from: ByteString.java */
/* loaded from: classes12.dex */
public final class e extends ByteString.a {
    public int b = 0;
    public final int c;
    public final /* synthetic */ ByteString d;

    public e(ByteString byteString) {
        this.d = byteString;
        this.c = byteString.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
