package fi;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public class X extends AbstractC4285a {

    /* renamed from: e, reason: collision with root package name */
    public final String f46744e;

    public X(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f46744e = source;
    }

    @Override // fi.AbstractC4285a
    public String E(String keyToMatch, boolean z10) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i10 = this.f46745a;
        try {
            if (k() == 6 && Intrinsics.areEqual(G(z10), keyToMatch)) {
                v();
                if (k() == 5) {
                    return G(z10);
                }
            }
            return null;
        } finally {
            this.f46745a = i10;
            v();
        }
    }

    @Override // fi.AbstractC4285a
    public int H(int i10) {
        if (i10 < C().length()) {
            return i10;
        }
        return -1;
    }

    @Override // fi.AbstractC4285a
    public int J() {
        char charAt;
        int i10 = this.f46745a;
        if (i10 == -1) {
            return i10;
        }
        String C10 = C();
        while (i10 < C10.length() && ((charAt = C10.charAt(i10)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i10++;
        }
        this.f46745a = i10;
        return i10;
    }

    @Override // fi.AbstractC4285a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String C() {
        return this.f46744e;
    }

    @Override // fi.AbstractC4285a
    public boolean f() {
        int i10 = this.f46745a;
        if (i10 == -1) {
            return false;
        }
        String C10 = C();
        while (i10 < C10.length()) {
            char charAt = C10.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f46745a = i10;
                return D(charAt);
            }
            i10++;
        }
        this.f46745a = i10;
        return false;
    }

    @Override // fi.AbstractC4285a
    public String j() {
        m(Typography.quote);
        int i10 = this.f46745a;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) C(), Typography.quote, i10, false, 4, (Object) null);
        if (indexOf$default != -1) {
            for (int i11 = i10; i11 < indexOf$default; i11++) {
                if (C().charAt(i11) == '\\') {
                    return r(C(), this.f46745a, i11);
                }
            }
            this.f46745a = indexOf$default + 1;
            String substring = C().substring(i10, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        s();
        String c10 = AbstractC4286b.c((byte) 1);
        int i12 = this.f46745a;
        AbstractC4285a.z(this, "Expected " + c10 + ", but had '" + ((i12 == C().length() || i12 < 0) ? "EOF" : String.valueOf(C().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // fi.AbstractC4285a
    public byte k() {
        String C10 = C();
        int i10 = this.f46745a;
        while (i10 != -1 && i10 < C10.length()) {
            int i11 = i10 + 1;
            char charAt = C10.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f46745a = i11;
                return AbstractC4286b.a(charAt);
            }
            i10 = i11;
        }
        this.f46745a = C10.length();
        return (byte) 10;
    }

    @Override // fi.AbstractC4285a
    public void m(char c10) {
        if (this.f46745a == -1) {
            P(c10);
        }
        String C10 = C();
        int i10 = this.f46745a;
        while (i10 < C10.length()) {
            int i11 = i10 + 1;
            char charAt = C10.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f46745a = i11;
                if (charAt == c10) {
                    return;
                } else {
                    P(c10);
                }
            }
            i10 = i11;
        }
        this.f46745a = -1;
        P(c10);
    }
}
