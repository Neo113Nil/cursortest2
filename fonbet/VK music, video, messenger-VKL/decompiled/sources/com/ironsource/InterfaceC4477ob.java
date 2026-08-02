package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.epx;
import xsna.so;

/* renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4477ob<T> {

    /* renamed from: com.ironsource.ob$a */
    public static final class a<T> implements InterfaceC4477ob<T> {
        private final IronSourceError a;

        public a(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        public final IronSourceError a() {
            return this.a;
        }

        public final IronSourceError b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        public final a<T> a(IronSourceError ironSourceError) {
            return new a<>(ironSourceError);
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.a;
            }
            return aVar.a(ironSourceError);
        }
    }

    /* renamed from: com.ironsource.ob$b */
    public static final class b<T> implements InterfaceC4477ob<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }

        public final T b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return so.a(this.a, "Success(value=", ")");
        }

        public final b<T> a(T t) {
            return new b<>(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.a;
            }
            return bVar.a(obj);
        }
    }
}
