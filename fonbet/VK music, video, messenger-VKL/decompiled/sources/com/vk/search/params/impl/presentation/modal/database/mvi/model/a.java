package com.vk.search.params.impl.presentation.modal.database.mvi.model;

import xsna.cph0;
import xsna.epx;
import xsna.ltx;

/* compiled from: SearchDatabaseSelection.kt */
/* loaded from: classes5.dex */
public interface a<Item> {

    /* compiled from: SearchDatabaseSelection.kt */
    /* renamed from: com.vk.search.params.impl.presentation.modal.database.mvi.model.a$a, reason: collision with other inner class name */
    public static final class C1764a implements a, ltx<cph0> {
        public final C1765a a;

        /* compiled from: SearchDatabaseSelection.kt */
        /* renamed from: com.vk.search.params.impl.presentation.modal.database.mvi.model.a$a$a, reason: collision with other inner class name */
        public static final class C1765a implements ltx<cph0> {
            @Override // xsna.ltx
            public final boolean accept(cph0 cph0Var) {
                cph0Var.getClass();
                return true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1765a)) {
                    return false;
                }
                ((C1765a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(1);
            }

            public final String toString() {
                return "CustomActionByIdItemAcceptor(id=1)";
            }
        }

        public C1764a() {
            throw null;
        }

        public C1764a(int i) {
            this.a = new C1765a();
        }

        @Override // xsna.ltx
        public final boolean accept(cph0 cph0Var) {
            this.a.getClass();
            cph0Var.getClass();
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1764a) && epx.f(this.a, ((C1764a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CustomAction(itemAcceptor=" + this.a + ')';
        }
    }

    /* compiled from: SearchDatabaseSelection.kt */
    public static final class b<I> implements a<I>, ltx<I> {
        public final ltx<I> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ltx<? super I> ltxVar) {
            this.a = ltxVar;
        }

        @Override // xsna.ltx
        public final boolean accept(I i) {
            return this.a.accept(i);
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
            return "Item(itemAcceptor=" + this.a + ')';
        }

        public b(I i) {
            this((ltx) new ltx.a(i));
        }
    }

    /* compiled from: SearchDatabaseSelection.kt */
    public static final class c implements a, ltx<Object> {
        public static final c a = new c();

        @Override // xsna.ltx
        public final boolean accept(Object obj) {
            return false;
        }
    }
}
