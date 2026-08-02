package com.vk.geo.impl.presentation;

import com.vk.geo.impl.model.VisibleStyle;
import java.util.List;
import java.util.Map;
import xsna.ao50;
import xsna.do00;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.jnt;
import xsna.jo00;
import xsna.lif0;
import xsna.vby;
import xsna.yzt0;

/* compiled from: GeoViewState.kt */
/* loaded from: classes2.dex */
public final class j implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: GeoViewState.kt */
    public static final class a implements fm50<jnt> {
        public final yzt0<jo00> a;
        public final yzt0<List<lif0>> b;
        public final yzt0<Map<do00, VisibleStyle>> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: GeoViewState.kt */
    @vby
    public static final class b implements fm50<jnt> {
        public final h0u0 a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.a + ')';
        }
    }

    /* compiled from: GeoViewState.kt */
    public static final class c implements fm50<jnt> {
    }

    public j(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
