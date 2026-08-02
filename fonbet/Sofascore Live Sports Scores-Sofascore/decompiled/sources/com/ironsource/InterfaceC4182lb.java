package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.lb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4182lb<T> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.lb$a */
    public static final class a<T> implements InterfaceC4182lb<T> {

        @NotNull
        private final IronSourceError a;

        public a(@NotNull IronSourceError ironSourceError) {
            ironSourceError.getClass();
            this.a = ironSourceError;
        }

        public static /* synthetic */ a a(a aVar, IronSourceError ironSourceError, int i, Object obj) {
            if ((i & 1) != 0) {
                ironSourceError = aVar.a;
            }
            return aVar.a(ironSourceError);
        }

        @NotNull
        public final IronSourceError b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        @NotNull
        public final a<T> a(@NotNull IronSourceError ironSourceError) {
            ironSourceError.getClass();
            return new a<>(ironSourceError);
        }

        @NotNull
        public final IronSourceError a() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.lb$b */
    public static final class b<T> implements InterfaceC4182lb<T> {
        private final T a;

        public b(T t) {
            this.a = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = bVar.a;
            }
            return bVar.a(obj);
        }

        public final T b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @NotNull
        public String toString() {
            return lnb.m(this.a, "Success(value=", ")");
        }

        @NotNull
        public final b<T> a(T t) {
            return new b<>(t);
        }

        public final T a() {
            return this.a;
        }
    }
}
