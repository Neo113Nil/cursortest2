package mi;

import java.text.ParsePosition;
import java.util.Locale;

/* renamed from: mi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5591b extends m {
    private static final C5591b[] INSTANCES;
    private static final long serialVersionUID = 4908662352833192131L;

    /* renamed from: mi.b$a */
    public class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f56615a;

        public a(int i10) {
            this.f56615a = i10;
        }

        @Override // mi.h
        public int d() {
            return (((this.f56615a - 1) * 60) + C5591b.this.getNumber()) - 1;
        }
    }

    static {
        C5591b[] c5591bArr = new C5591b[60];
        int i10 = 0;
        while (i10 < 60) {
            int i11 = i10 + 1;
            c5591bArr[i10] = new C5591b(i11);
            i10 = i11;
        }
        INSTANCES = c5591bArr;
    }

    public C5591b(int i10) {
        super(i10);
    }

    public static C5591b n(int i10) {
        if (i10 >= 1 && i10 <= 60) {
            return INSTANCES[i10 - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i10);
    }

    public static C5591b o(CharSequence charSequence, ParsePosition parsePosition, Locale locale, boolean z10) {
        m k10 = m.k(charSequence, parsePosition, locale, z10);
        if (k10 == null) {
            return null;
        }
        return n(k10.getNumber());
    }

    public h m(int i10) {
        if (i10 >= 1) {
            return new a(i10);
        }
        throw new IllegalArgumentException("Cycle number must not be smaller than 1: " + i10);
    }

    @Override // mi.m
    public Object readResolve() {
        return n(super.getNumber());
    }
}
