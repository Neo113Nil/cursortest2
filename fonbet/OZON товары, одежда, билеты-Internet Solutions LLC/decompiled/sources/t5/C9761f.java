package t5;

import android.graphics.Bitmap;
import androidx.collection.C5155y;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import t5.InterfaceC9758c;

/* renamed from: t5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9761f implements InterfaceC9763h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9764i f99181a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f99182b;

    /* renamed from: t5.f$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bitmap f99183a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f99184b;

        /* renamed from: c, reason: collision with root package name */
        private final int f99185c;

        public a(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i11) {
            this.f99183a = bitmap;
            this.f99184b = map;
            this.f99185c = i11;
        }

        @NotNull
        public final Bitmap a() {
            return this.f99183a;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.f99184b;
        }

        public final int c() {
            return this.f99185c;
        }
    }

    /* renamed from: t5.f$b */
    public static final class b extends C5155y<InterfaceC9758c.b, a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9761f f99186a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, C9761f c9761f) {
            super(i11);
            this.f99186a = c9761f;
        }

        @Override // androidx.collection.C5155y
        public final void entryRemoved(boolean z11, InterfaceC9758c.b bVar, a aVar, a aVar2) {
            a aVar3 = aVar;
            this.f99186a.f99181a.c(bVar, aVar3.a(), aVar3.b(), aVar3.c());
        }

        @Override // androidx.collection.C5155y
        public final int sizeOf(InterfaceC9758c.b bVar, a aVar) {
            return aVar.c();
        }
    }

    public C9761f(int i11, @NotNull InterfaceC9764i interfaceC9764i) {
        this.f99181a = interfaceC9764i;
        this.f99182b = new b(i11, this);
    }

    @Override // t5.InterfaceC9763h
    public final void a(int i11) {
        b bVar = this.f99182b;
        if (i11 >= 40) {
            bVar.evictAll();
        } else {
            if (10 > i11 || i11 >= 20) {
                return;
            }
            bVar.trimToSize(bVar.size() / 2);
        }
    }

    @Override // t5.InterfaceC9763h
    public final InterfaceC9758c.C2178c b(@NotNull InterfaceC9758c.b bVar) {
        a aVar = this.f99182b.get(bVar);
        if (aVar != null) {
            return new InterfaceC9758c.C2178c(aVar.a(), aVar.b());
        }
        return null;
    }

    @Override // t5.InterfaceC9763h
    public final void c(@NotNull InterfaceC9758c.b bVar, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int a11 = A5.a.a(bitmap);
        b bVar2 = this.f99182b;
        if (a11 <= bVar2.maxSize()) {
            bVar2.put(bVar, new a(bitmap, map, a11));
        } else {
            bVar2.remove(bVar);
            this.f99181a.c(bVar, bitmap, map, a11);
        }
    }
}
