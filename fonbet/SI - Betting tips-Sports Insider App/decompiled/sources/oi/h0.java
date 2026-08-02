package oi;

import androidx.appcompat.widget.c1;
import j$.util.Objects;
import java.lang.reflect.Method;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h0 extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f21265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21266d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21267e;

    /* renamed from: f, reason: collision with root package name */
    public final a f21268f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21269g;

    public h0(Method method, int i5, String str, boolean z5) {
        a aVar = a.f21225b;
        this.f21265c = method;
        this.f21266d = i5;
        Objects.requireNonNull(str, "name == null");
        this.f21267e = str;
        this.f21268f = aVar;
        this.f21269g = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    @Override // oi.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(p0 p0Var, Object obj) {
        String str;
        String replace;
        char c2;
        String str2 = this.f21267e;
        if (obj == null) {
            throw z0.m(this.f21265c, this.f21266d, c1.n("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        this.f21268f.getClass();
        String obj2 = obj.toString();
        if (p0Var.f21289c == null) {
            throw new AssertionError();
        }
        int length = obj2.length();
        int i5 = 0;
        while (i5 < length) {
            int codePointAt = obj2.codePointAt(i5);
            boolean z5 = this.f21269g;
            int i10 = 47;
            int i11 = -1;
            int i12 = 127;
            int i13 = 32;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z5 && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(obj2, 0, i5);
                Buffer buffer2 = null;
                while (i5 < length) {
                    int codePointAt2 = obj2.codePointAt(i5);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < i13 || codePointAt2 >= i12 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i11 || (!z5 && (codePointAt2 == i10 || codePointAt2 == 37))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.writeUtf8CodePoint(codePointAt2);
                            long size = buffer2.size();
                            for (long j = 0; j < size; j++) {
                                byte b10 = buffer2.getByte(j);
                                buffer.writeByte(37);
                                char[] cArr = p0.f21285l;
                                buffer.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                                buffer.writeByte((int) cArr[b10 & 15]);
                            }
                            c2 = '%';
                            buffer2.clear();
                            i5 += Character.charCount(codePointAt2);
                            i10 = 47;
                            i11 = -1;
                            i12 = 127;
                            i13 = 32;
                        } else {
                            buffer.writeUtf8CodePoint(codePointAt2);
                        }
                    }
                    c2 = '%';
                    i5 += Character.charCount(codePointAt2);
                    i10 = 47;
                    i11 = -1;
                    i12 = 127;
                    i13 = 32;
                }
                str = buffer.readUtf8();
                replace = p0Var.f21289c.replace("{" + str2 + "}", str);
                if (!p0.f21286m.matcher(replace).matches()) {
                    throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                }
                p0Var.f21289c = replace;
                return;
            }
            i5 += Character.charCount(codePointAt);
        }
        str = obj2;
        replace = p0Var.f21289c.replace("{" + str2 + "}", str);
        if (!p0.f21286m.matcher(replace).matches()) {
        }
    }
}
