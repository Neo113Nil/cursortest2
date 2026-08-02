package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final P0.b f19794a;

    /* renamed from: b, reason: collision with root package name */
    public final a f19795b = new a(1024);

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f19796c;

    @NonNull
    private final char[] mEmojiCharArray;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f19797a;

        /* renamed from: b, reason: collision with root package name */
        public p f19798b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray sparseArray = this.f19797a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        public final p b() {
            return this.f19798b;
        }

        public void c(p pVar, int i10, int i11) {
            a a10 = a(pVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f19797a.put(pVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(pVar, i10 + 1, i11);
            } else {
                a10.f19798b = pVar;
            }
        }

        public a(int i10) {
            this.f19797a = new SparseArray(i10);
        }
    }

    public n(Typeface typeface, P0.b bVar) {
        this.f19796c = typeface;
        this.f19794a = bVar;
        this.mEmojiCharArray = new char[bVar.k() * 2];
        a(bVar);
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            u0.o.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            u0.o.b();
        }
    }

    public final void a(P0.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.mEmojiCharArray, i10 * 2);
            h(pVar);
        }
    }

    public char[] c() {
        return this.mEmojiCharArray;
    }

    public P0.b d() {
        return this.f19794a;
    }

    public int e() {
        return this.f19794a.l();
    }

    public a f() {
        return this.f19795b;
    }

    public Typeface g() {
        return this.f19796c;
    }

    public void h(p pVar) {
        x0.f.h(pVar, "emoji metadata cannot be null");
        x0.f.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f19795b.c(pVar, 0, pVar.c() - 1);
    }
}
