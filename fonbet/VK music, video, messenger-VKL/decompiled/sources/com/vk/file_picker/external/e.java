package com.vk.file_picker.external;

import java.io.File;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.oeq;
import xsna.tr;
import xsna.yzt0;

/* compiled from: ExternalFilePickerContract.kt */
/* loaded from: classes18.dex */
public final class e implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class a implements fm50<oeq> {
        public final yzt0<List<File>> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Data(files="), this.a, ')');
        }
    }

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class b implements fm50<oeq> {
        public final yzt0<String> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: ExternalFilePickerContract.kt */
    public static final class c implements fm50<oeq> {
        public static final c a = new c();
    }

    public e(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
