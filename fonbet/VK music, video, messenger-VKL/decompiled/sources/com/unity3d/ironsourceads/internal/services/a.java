package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C4385j9;
import com.ironsource.EnumC4421l9;
import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* loaded from: classes14.dex */
public interface a {

    /* renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0369a {

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0370a extends AbstractC0369a {
            private final String a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0370a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0370a) && epx.f(this.a, ((C0370a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return zr.a("Error(errorMessage=", this.a, ")");
            }

            public C0370a(String str) {
                super(null);
                this.a = str;
            }

            public final C0370a a(String str) {
                return new C0370a(str);
            }

            public /* synthetic */ C0370a(String str, int i, zcl zclVar) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0370a a(C0370a c0370a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0370a.a;
                }
                return c0370a.a(str);
            }
        }

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC0369a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0369a(zcl zclVar) {
            this();
        }

        private AbstractC0369a() {
        }
    }

    static /* synthetic */ AbstractC0369a a(a aVar, Context context, EnumC4421l9 enumC4421l9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i & 2) != 0) {
            enumC4421l9 = EnumC4421l9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC4421l9);
    }

    AbstractC0369a a(Context context, C4385j9 c4385j9);

    AbstractC0369a a(Context context, EnumC4421l9 enumC4421l9);
}
