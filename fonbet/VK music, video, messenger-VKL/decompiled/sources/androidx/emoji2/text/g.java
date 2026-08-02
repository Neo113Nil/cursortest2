package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import xsna.jup0;
import xsna.obr;
import xsna.ri20;
import xsna.si20;

/* compiled from: MetadataRepo.java */
/* loaded from: classes12.dex */
public final class g {

    @NonNull
    public final si20 a;

    @NonNull
    public final char[] b;

    @NonNull
    public final a c = new a(1024);

    @NonNull
    public final Typeface d;

    /* compiled from: MetadataRepo.java */
    public static class a {
        public final SparseArray<a> a;
        public jup0 b;

        public a() {
            this(1);
        }

        public final void a(@NonNull jup0 jup0Var, int i, int i2) {
            int a = jup0Var.a(i);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(a);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(jup0Var.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(jup0Var, i + 1, i2);
            } else {
                aVar.b = jup0Var;
            }
        }

        public a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    public g(@NonNull Typeface typeface, @NonNull si20 si20Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = si20Var;
        int a2 = si20Var.a(6);
        if (a2 != 0) {
            int i5 = a2 + si20Var.a;
            i = si20Var.b.getInt(si20Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int a3 = si20Var.a(6);
        if (a3 != 0) {
            int i6 = a3 + si20Var.a;
            i2 = si20Var.b.getInt(si20Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            jup0 jup0Var = new jup0(this, i7);
            ri20 b = jup0Var.b();
            int a4 = b.a(4);
            Character.toChars(a4 != 0 ? b.b.getInt(a4 + b.a) : 0, this.b, i7 * 2);
            ri20 b2 = jup0Var.b();
            int a5 = b2.a(16);
            if (a5 != 0) {
                int i8 = a5 + b2.a;
                i3 = b2.b.getInt(b2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            obr.a("invalid metadata codepoint length", i3 > 0);
            a aVar = this.c;
            ri20 b3 = jup0Var.b();
            int a6 = b3.a(16);
            if (a6 != 0) {
                int i9 = a6 + b3.a;
                i4 = b3.b.getInt(b3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            aVar.a(jup0Var, 0, i4 - 1);
        }
    }
}
