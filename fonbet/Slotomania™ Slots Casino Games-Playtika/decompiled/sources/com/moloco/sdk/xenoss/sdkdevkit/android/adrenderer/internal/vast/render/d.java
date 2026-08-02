package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public interface d {

    public static abstract class a {
        public static final int a = 0;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$a, reason: collision with other inner class name */
        public static final class C0370a extends a {
            public static final C0370a b = new C0370a();
            public static final int c = 0;

            public C0370a() {
                super(null);
            }
        }

        public static final class b extends a {
            public static final int c = 0;
            public final int b;

            public /* synthetic */ b(int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(i);
            }

            public final int a() {
                return this.b;
            }

            public final int b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public int hashCode() {
                return UInt.m11289hashCodeimpl(this.b);
            }

            public String toString() {
                return "Countdown(seconds=" + ((Object) UInt.m11323toStringimpl(this.b)) + ')';
            }

            public b(int i) {
                super(null);
                this.b = i;
            }

            public final b a(int i) {
                return new b(i, null);
            }

            public static /* synthetic */ b a(b bVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = bVar.b;
                }
                return bVar.a(i);
            }
        }

        public static final class c extends a {
            public static final c b = new c();
            public static final int c = 0;

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    StateFlow<a> l();
}
