package u8;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import s8.InterfaceC9625b;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f100382a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f100383b;

    /* renamed from: c, reason: collision with root package name */
    private final g f100384c;

    public static final class a implements InterfaceC9625b<a> {

        /* renamed from: d, reason: collision with root package name */
        private static final g f100385d = new g();

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f100386a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f100387b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private g f100388c = f100385d;

        public final h a() {
            return new h(new HashMap(this.f100386a), new HashMap(this.f100387b), this.f100388c);
        }

        @Override // s8.InterfaceC9625b
        @NonNull
        public final a registerEncoder(@NonNull Class cls, @NonNull r8.d dVar) {
            this.f100386a.put(cls, dVar);
            this.f100387b.remove(cls);
            return this;
        }
    }

    h(HashMap hashMap, HashMap hashMap2, g gVar) {
        this.f100382a = hashMap;
        this.f100383b = hashMap2;
        this.f100384c = gVar;
    }

    @NonNull
    public final byte[] a(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new f(byteArrayOutputStream, this.f100382a, this.f100383b, this.f100384c).f(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
