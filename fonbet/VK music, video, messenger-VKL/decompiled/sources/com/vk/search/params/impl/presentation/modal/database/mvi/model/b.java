package com.vk.search.params.impl.presentation.modal.database.mvi.model;

import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import java.util.List;
import xsna.ao50;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.hfz;
import xsna.mph0;
import xsna.yzt0;

/* compiled from: SearchDatabaseViewState.kt */
/* loaded from: classes5.dex */
public final class b<Item> implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;

    /* compiled from: SearchDatabaseViewState.kt */
    public interface a<S extends mph0> extends fm50<mph0> {

        /* compiled from: SearchDatabaseViewState.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.database.mvi.model.b$a$a, reason: collision with other inner class name */
        public static final class C1766a<Item> implements a<SearchDatabaseState.a.d<Item>> {
            public final yzt0<List<hfz>> a;

            public C1766a(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }
        }

        /* compiled from: SearchDatabaseViewState.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.database.mvi.model.b$a$b, reason: collision with other inner class name */
        public static final class C1767b implements a<SearchDatabaseState.a.C1763a> {
            public static final C1767b a = new C1767b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1767b);
            }

            public final int hashCode() {
                return 176103887;
            }

            public final String toString() {
                return "ItemsEmpty";
            }
        }

        /* compiled from: SearchDatabaseViewState.kt */
        public static final class c implements a<SearchDatabaseState.a.b> {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 176254602;
            }

            public final String toString() {
                return "ItemsError";
            }
        }

        /* compiled from: SearchDatabaseViewState.kt */
        public static final class d implements a<SearchDatabaseState.a.e> {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -602380994;
            }

            public final String toString() {
                return "ItemsLoading";
            }
        }

        /* compiled from: SearchDatabaseViewState.kt */
        public static final class e implements a<SearchDatabaseState<mph0>> {
            public final yzt0<String> a;

            public e(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }
        }
    }

    public b(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
    }
}
