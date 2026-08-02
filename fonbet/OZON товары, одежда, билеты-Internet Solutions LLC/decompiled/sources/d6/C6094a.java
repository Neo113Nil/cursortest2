package d6;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6094a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f61204a;

    /* renamed from: d6.a$a, reason: collision with other inner class name */
    public static class C0946a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final e<ByteBuffer> a(ByteBuffer byteBuffer) {
            return new C6094a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public final Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }
    }

    public C6094a(ByteBuffer byteBuffer) {
        this.f61204a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    public final ByteBuffer a() throws IOException {
        ByteBuffer byteBuffer = this.f61204a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
    }
}
