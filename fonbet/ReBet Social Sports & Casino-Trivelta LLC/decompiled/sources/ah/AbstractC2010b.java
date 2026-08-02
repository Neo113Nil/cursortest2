package ah;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jh.AbstractC5136b;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.CharRange;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import lh.C5466a;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: ah.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2010b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f15999a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f16000b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f16001c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f16002d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f16003e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f16004f;

    /* renamed from: g, reason: collision with root package name */
    public static final List f16005g;

    /* renamed from: ah.b$a */
    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f16006d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f16007e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb2, boolean z10) {
            super(1);
            this.f16006d = sb2;
            this.f16007e = z10;
        }

        public final void a(byte b10) {
            if (AbstractC2010b.f15999a.contains(Byte.valueOf(b10)) || AbstractC2010b.f16005g.contains(Byte.valueOf(b10))) {
                this.f16006d.append((char) b10);
            } else if (this.f16007e && b10 == 32) {
                this.f16006d.append('+');
            } else {
                this.f16006d.append(AbstractC2010b.u(b10));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).byteValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ah.b$b, reason: collision with other inner class name */
    public static final class C0333b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f16008d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0333b(StringBuilder sb2) {
            super(1);
            this.f16008d = sb2;
        }

        public final void a(byte b10) {
            this.f16008d.append(AbstractC2010b.u(b10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).byteValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ah.b$c */
    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f16009d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f16010e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f16011f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, StringBuilder sb2, boolean z11) {
            super(1);
            this.f16009d = z10;
            this.f16010e = sb2;
            this.f16011f = z11;
        }

        public final void a(byte b10) {
            if (b10 == 32) {
                if (this.f16009d) {
                    this.f16010e.append('+');
                    return;
                } else {
                    this.f16010e.append("%20");
                    return;
                }
            }
            if (AbstractC2010b.f15999a.contains(Byte.valueOf(b10)) || (!this.f16011f && AbstractC2010b.f16002d.contains(Byte.valueOf(b10)))) {
                this.f16010e.append((char) b10);
            } else {
                this.f16010e.append(AbstractC2010b.u(b10));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).byteValue());
            return Unit.INSTANCE;
        }
    }

    static {
        Character valueOf = Character.valueOf(Typography.amp);
        Character valueOf2 = Character.valueOf(Typography.dollar);
        List plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', Matrix.MATRIX_TYPE_ZERO)), (Iterable) new CharRange('0', '9'));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(plus, 10));
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f15999a = CollectionsKt.toSet(arrayList);
        f16000b = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', Matrix.MATRIX_TYPE_ZERO)), (Iterable) new CharRange('0', '9')));
        f16001c = CollectionsKt.toSet(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'f'), (Iterable) new CharRange('A', 'F')), (Iterable) new CharRange('0', '9')));
        Set of2 = SetsKt.setOf((Object[]) new Character[]{':', '/', '?', '#', '[', ']', '@', '!', valueOf2, valueOf, '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of2, 10));
        Iterator it2 = of2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f16002d = arrayList2;
        f16003e = SetsKt.setOf((Object[]) new Character[]{':', '@', '!', valueOf2, valueOf, '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        f16004f = SetsKt.plus(f16000b, (Iterable) SetsKt.setOf((Object[]) new Character[]{'!', '#', valueOf2, valueOf, '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listOf = CollectionsKt.listOf((Object[]) new Character[]{'-', '.', '_', '~'});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf, 10));
        Iterator it3 = listOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f16005g = arrayList3;
    }

    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    public static final String f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Charset charset) {
        int i13 = i11 - i10;
        if (i13 > 255) {
            i13 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i13);
        if (i12 > i10) {
            sb2.append(charSequence, i10, i12);
        }
        byte[] bArr = null;
        while (i12 < i11) {
            char charAt = charSequence.charAt(i12);
            if (z10 && charAt == '+') {
                sb2.append(' ');
            } else if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i11 - i12) / 3];
                }
                int i14 = 0;
                while (i12 < i11 && charSequence.charAt(i12) == '%') {
                    int i15 = i12 + 2;
                    if (i15 >= i11) {
                        throw new I("Incomplete trailing HEX escape: " + charSequence.subSequence(i12, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i12);
                    }
                    int i16 = i12 + 1;
                    int e10 = e(charSequence.charAt(i16));
                    int e11 = e(charSequence.charAt(i15));
                    if (e10 == -1 || e11 == -1) {
                        throw new I("Wrong HEX escape: %" + charSequence.charAt(i16) + charSequence.charAt(i15) + ", in " + ((Object) charSequence) + ", at " + i12);
                    }
                    bArr[i14] = (byte) ((e10 * 16) + e11);
                    i12 += 3;
                    i14++;
                }
                sb2.append(new String(bArr, 0, i14, charset));
            } else {
                sb2.append(charAt);
            }
            i12++;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }

    public static final String g(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (z10 && charAt == '+')) {
                return f(str, i10, i11, i12, z10, charset);
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String h(String str, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return g(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String i(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return h(str, i10, i11, charset);
    }

    public static final String j(String str, int i10, int i11, boolean z10, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return g(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String k(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = Charsets.UTF_8;
        }
        return j(str, i10, i11, z10, charset);
    }

    public static final String l(String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = Charsets.UTF_8.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "UTF_8.newEncoder()");
        s(AbstractC5136b.d(newEncoder, str, 0, 0, 6, null), new a(sb2, z10));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String m(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l(str, z10);
    }

    public static final String n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l(str, true);
    }

    public static final String o(String str, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = Charsets.UTF_8;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if ((!z10 && charAt == '/') || f16000b.contains(Character.valueOf(charAt)) || f16003e.contains(Character.valueOf(charAt))) {
                sb2.append(charAt);
                i11++;
            } else {
                if (charAt == '%' && (i10 = i11 + 2) < str.length()) {
                    Set set = f16001c;
                    int i12 = i11 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i12))) && set.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(charAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                int i13 = CharsKt.isSurrogate(charAt) ? 2 : 1;
                CharsetEncoder newEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(newEncoder, "charset.newEncoder()");
                int i14 = i13 + i11;
                s(AbstractC5136b.c(newEncoder, str, i11, i14), new C0333b(sb2));
                i11 = i14;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return o(str, true);
    }

    public static final String q(String str, boolean z10, boolean z11, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        Intrinsics.checkNotNullExpressionValue(newEncoder, "charset.newEncoder()");
        s(AbstractC5136b.d(newEncoder, str, 0, 0, 6, null), new c(z11, sb2, z10));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String r(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = Charsets.UTF_8;
        }
        return q(str, z10, z11, charset);
    }

    public static final void s(kh.l lVar, Function1 function1) {
        boolean z10 = true;
        C5466a b10 = lh.e.b(lVar, 1);
        if (b10 == null) {
            return;
        }
        while (true) {
            try {
                if (b10.j() > b10.h()) {
                    function1.invoke(Byte.valueOf(b10.k()));
                } else {
                    try {
                        b10 = lh.e.c(lVar, b10);
                        if (b10 == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            lh.e.a(lVar, b10);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final char t(int i10) {
        return (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48);
    }

    public static final String u(byte b10) {
        return StringsKt.concatToString(new char[]{'%', t((b10 & UByte.MAX_VALUE) >> 4), t(b10 & 15)});
    }
}
