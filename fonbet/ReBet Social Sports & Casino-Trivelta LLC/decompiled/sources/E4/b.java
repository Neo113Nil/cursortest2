package E4;

import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.util.k;

/* loaded from: classes2.dex */
public class b implements v {
    private final byte[] bytes;

    public b(byte[] bArr) {
        this.bytes = (byte[]) k.d(bArr);
    }

    @Override // com.bumptech.glide.load.engine.v
    public Class a() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.bytes;
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return this.bytes.length;
    }

    @Override // com.bumptech.glide.load.engine.v
    public void recycle() {
    }
}
