package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class cq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private dz f1506;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private d f1507;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7306(Cif cif, ee eeVar, cl clVar, List<Object> list) {
        d dVar = this.f1507;
        if (dVar != null && !dVar.mo7307(cif)) {
            return false;
        }
        if (this.f1506 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, cif);
        return this.f1506.m7671(eeVar, clVar, arrayList).m7682();
    }

    public static class e {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private cq f1509 = new cq();

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final e m7311(Class cls) {
            this.f1509.f1507 = new c(cls);
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final e m7309(Class cls) {
            this.f1509.f1507 = new b(cls);
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final e m7313(Class cls) {
            this.f1509.f1507 = new a(cls);
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final e m7312(dz dzVar) {
            this.f1509.f1506 = dzVar;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final cq m7310() {
            return this.f1509;
        }
    }

    static abstract class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private Class f1508;

        /* renamed from: ﻛ */
        abstract boolean mo7307(Cif cif);

        d(Class cls) {
            this.f1508 = cls;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        final Class m7308() {
            return this.f1508;
        }
    }

    static class c extends d {
        c(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* renamed from: ﻛ */
        public final boolean mo7307(Cif cif) {
            return m7308().isAssignableFrom(cif.mo7967().getType());
        }
    }

    static class b extends d {
        b(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* renamed from: ﻛ */
        public final boolean mo7307(Cif cif) {
            return m7308().equals(cif.mo7967().getType());
        }
    }

    static class a extends d {
        a(Class cls) {
            super(cls);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.cq.d
        /* renamed from: ﻛ, reason: contains not printable characters */
        final boolean mo7307(Cif cif) {
            return m7308().isInstance(cif.mo7966());
        }
    }
}
