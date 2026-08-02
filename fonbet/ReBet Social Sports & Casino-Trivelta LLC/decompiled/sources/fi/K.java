package fi;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K implements InterfaceC4306w {

    /* renamed from: a, reason: collision with root package name */
    public int f46693a;

    @NotNull
    private char[] array = C4295k.f46774c.d();

    @Override // fi.InterfaceC4306w
    public void a(char c10) {
        e(1);
        char[] cArr = this.array;
        int i10 = this.f46693a;
        this.f46693a = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // fi.InterfaceC4306w
    public void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        e(text.length() + 2);
        char[] cArr = this.array;
        int i10 = this.f46693a;
        int i11 = i10 + 1;
        cArr[i10] = Typography.quote;
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < a0.a().length && a0.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = Typography.quote;
        this.f46693a = i12 + 1;
    }

    @Override // fi.InterfaceC4306w
    public void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.array, this.f46693a);
        this.f46693a += length;
    }

    public final void d(int i10, int i11, String str) {
        int i12;
        int length = str.length();
        while (i10 < length) {
            int f10 = f(i11, 2);
            char charAt = str.charAt(i10);
            if (charAt < a0.a().length) {
                byte b10 = a0.a()[charAt];
                if (b10 == 0) {
                    i12 = f10 + 1;
                    this.array[f10] = charAt;
                } else {
                    if (b10 == 1) {
                        String str2 = a0.b()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int f11 = f(f10, str2.length());
                        str2.getChars(0, str2.length(), this.array, f11);
                        i11 = f11 + str2.length();
                        this.f46693a = i11;
                    } else {
                        char[] cArr = this.array;
                        cArr[f10] = '\\';
                        cArr[f10 + 1] = (char) b10;
                        i11 = f10 + 2;
                        this.f46693a = i11;
                    }
                    i10++;
                }
            } else {
                i12 = f10 + 1;
                this.array[f10] = charAt;
            }
            i11 = i12;
            i10++;
        }
        int f12 = f(i11, 1);
        this.array[f12] = Typography.quote;
        this.f46693a = f12 + 1;
    }

    public final void e(int i10) {
        f(this.f46693a, i10);
    }

    public final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.array;
        if (cArr.length <= i12) {
            char[] copyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i12, i10 * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.array = copyOf;
        }
        return i10;
    }

    public void g() {
        C4295k.f46774c.c(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.f46693a);
    }

    @Override // fi.InterfaceC4306w
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
