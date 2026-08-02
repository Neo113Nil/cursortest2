package kotlin.text;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7751b implements Sequence<IntRange> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f71953a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71954b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f71955c;

    /* renamed from: kotlin.text.b$a */
    public static final class a implements Iterator<IntRange>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private int f71956a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f71957b;

        /* renamed from: c, reason: collision with root package name */
        private int f71958c;

        /* renamed from: d, reason: collision with root package name */
        private IntRange f71959d;

        /* renamed from: e, reason: collision with root package name */
        private int f71960e;

        a() {
            C7751b.this.getClass();
            int e11 = kotlin.ranges.h.e(0, 0, C7751b.this.f71953a.length());
            this.f71957b = e11;
            this.f71958c = e11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            if (r2 < r0.f71954b) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void b() {
            if (this.f71958c < 0) {
                this.f71956a = 0;
                this.f71959d = null;
                return;
            }
            C7751b c7751b = C7751b.this;
            if (c7751b.f71954b > 0) {
                int i11 = this.f71960e + 1;
                this.f71960e = i11;
            }
            if (this.f71958c <= c7751b.f71953a.length()) {
                Pair pair = (Pair) c7751b.f71955c.invoke(c7751b.f71953a, Integer.valueOf(this.f71958c));
                if (pair == null) {
                    this.f71959d = new IntRange(this.f71957b, h.G(c7751b.f71953a), 1);
                    this.f71958c = -1;
                } else {
                    int intValue = ((Number) pair.a()).intValue();
                    int intValue2 = ((Number) pair.b()).intValue();
                    this.f71959d = kotlin.ranges.h.o(this.f71957b, intValue);
                    int i12 = intValue + intValue2;
                    this.f71957b = i12;
                    this.f71958c = i12 + (intValue2 == 0 ? 1 : 0);
                }
                this.f71956a = 1;
            }
            this.f71959d = new IntRange(this.f71957b, h.G(c7751b.f71953a), 1);
            this.f71958c = -1;
            this.f71956a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f71956a == -1) {
                b();
            }
            return this.f71956a == 1;
        }

        @Override // java.util.Iterator
        public final IntRange next() {
            if (this.f71956a == -1) {
                b();
            }
            if (this.f71956a == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.f71959d;
            Intrinsics.g(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f71959d = null;
            this.f71956a = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7751b(@NotNull CharSequence input, int i11, @NotNull Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f71953a = input;
        this.f71954b = i11;
        this.f71955c = (AbstractC7737t) getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<IntRange> iterator() {
        return new a();
    }
}
