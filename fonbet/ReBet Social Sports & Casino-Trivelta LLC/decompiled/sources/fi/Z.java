package fi;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class Z extends X {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // fi.AbstractC4285a
    public byte F() {
        String C10 = C();
        int J10 = J();
        if (J10 >= C10.length() || J10 == -1) {
            return (byte) 10;
        }
        this.f46745a = J10;
        return AbstractC4286b.a(C10.charAt(J10));
    }

    @Override // fi.X, fi.AbstractC4285a
    public int J() {
        int i10;
        int i11 = this.f46745a;
        if (i11 == -1) {
            return i11;
        }
        String C10 = C();
        while (i11 < C10.length()) {
            char charAt = C10.charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i10 = i11 + 1) >= C10.length()) {
                    break;
                }
                char charAt2 = C10.charAt(i10);
                if (charAt2 == '*') {
                    int indexOf$default = StringsKt.indexOf$default((CharSequence) C10, "*/", i11 + 2, false, 4, (Object) null);
                    if (indexOf$default == -1) {
                        this.f46745a = C10.length();
                        AbstractC4285a.z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i11 = indexOf$default + 2;
                } else {
                    if (charAt2 != '/') {
                        break;
                    }
                    i11 = StringsKt.indexOf$default((CharSequence) C10, '\n', i11 + 2, false, 4, (Object) null);
                    if (i11 == -1) {
                        i11 = C10.length();
                    }
                }
            }
            i11++;
        }
        this.f46745a = i11;
        return i11;
    }

    @Override // fi.X, fi.AbstractC4285a
    public boolean f() {
        int J10 = J();
        if (J10 >= C().length() || J10 == -1) {
            return false;
        }
        return D(C().charAt(J10));
    }

    @Override // fi.X, fi.AbstractC4285a
    public byte k() {
        String C10 = C();
        int J10 = J();
        if (J10 >= C10.length() || J10 == -1) {
            return (byte) 10;
        }
        this.f46745a = J10 + 1;
        return AbstractC4286b.a(C10.charAt(J10));
    }

    @Override // fi.X, fi.AbstractC4285a
    public void m(char c10) {
        String C10 = C();
        int J10 = J();
        if (J10 >= C10.length() || J10 == -1) {
            this.f46745a = -1;
            P(c10);
        }
        char charAt = C10.charAt(J10);
        this.f46745a = J10 + 1;
        if (charAt == c10) {
            return;
        }
        P(c10);
    }
}
