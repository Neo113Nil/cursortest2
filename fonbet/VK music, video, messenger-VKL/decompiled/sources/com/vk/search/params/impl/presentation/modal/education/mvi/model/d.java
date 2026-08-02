package com.vk.search.params.impl.presentation.modal.education.mvi.model;

import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import defpackage.q0;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.k9x;
import xsna.yzt0;

/* compiled from: EducationViewState.kt */
/* loaded from: classes5.dex */
public final class d implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: EducationViewState.kt */
    public static final class a<Value> {
        public final Value a;
        public final boolean b;

        public a(Value value, boolean z) {
            this.a = value;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            Value value = this.a;
            return Boolean.hashCode(this.b) + ((value == null ? 0 : value.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FieldState(value=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: EducationViewState.kt */
    public interface b extends fm50<EducationState> {

        /* compiled from: EducationViewState.kt */
        public static final class a implements b {
            public final yzt0<EducationState.InstitutionType> a;
            public final yzt0<a<String>> b;
            public final yzt0<a<String>> c;
            public final yzt0<a<Integer>> d;
            public final yzt0<k9x> e;
            public final yzt0<Boolean> f;
            public final yzt0<Boolean> g;

            public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
            }
        }

        /* compiled from: EducationViewState.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.education.mvi.model.d$b$b, reason: collision with other inner class name */
        public static final class C1771b implements b {
            public static final C1771b a = new C1771b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1771b);
            }

            public final int hashCode() {
                return 114697009;
            }

            public final String toString() {
                return "Empty";
            }
        }
    }

    public d(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
