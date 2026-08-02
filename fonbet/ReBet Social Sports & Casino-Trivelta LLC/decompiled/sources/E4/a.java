package E4;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3000a;

    /* renamed from: E4.a$a, reason: collision with other inner class name */
    public static class C0067a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f3000a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f3000a.position(0);
        return this.f3000a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }
}
