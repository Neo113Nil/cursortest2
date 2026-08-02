package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.IlrdRequest;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public interface d {

    public interface a {

        /* renamed from: com.moloco.sdk.internal.ilrd.d$a$a, reason: collision with other inner class name */
        public static final class C0238a implements a {
            public static final int b = 0;
            public final IlrdRequest.LevelPlayImpression a;

            public C0238a(IlrdRequest.LevelPlayImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.a = impression;
            }

            public final IlrdRequest.LevelPlayImpression a() {
                return this.a;
            }

            public final IlrdRequest.LevelPlayImpression b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0238a) && Intrinsics.areEqual(this.a, ((C0238a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "LevelPlay(impression=" + this.a + ')';
            }

            public final C0238a a(IlrdRequest.LevelPlayImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                return new C0238a(impression);
            }

            public static /* synthetic */ C0238a a(C0238a c0238a, IlrdRequest.LevelPlayImpression levelPlayImpression, int i, Object obj) {
                if ((i & 1) != 0) {
                    levelPlayImpression = c0238a.a;
                }
                return c0238a.a(levelPlayImpression);
            }
        }

        public static final class b implements a {
            public static final int b = 0;
            public final IlrdRequest.MaxImpression a;

            public b(IlrdRequest.MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                this.a = impression;
            }

            public final IlrdRequest.MaxImpression a() {
                return this.a;
            }

            public final IlrdRequest.MaxImpression b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Max(impression=" + this.a + ')';
            }

            public final b a(IlrdRequest.MaxImpression impression) {
                Intrinsics.checkNotNullParameter(impression, "impression");
                return new b(impression);
            }

            public static /* synthetic */ b a(b bVar, IlrdRequest.MaxImpression maxImpression, int i, Object obj) {
                if ((i & 1) != 0) {
                    maxImpression = bVar.a;
                }
                return bVar.a(maxImpression);
            }
        }
    }

    com.moloco.sdk.internal.ilrd.model.a a();

    Object b();

    SharedFlow<a> c();

    StateFlow<h> getState();
}
