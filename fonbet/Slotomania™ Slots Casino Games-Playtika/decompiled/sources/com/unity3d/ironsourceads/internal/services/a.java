package com.unity3d.ironsourceads.internal.services;

import android.content.Context;
import com.ironsource.C2472i9;
import com.ironsource.EnumC2507k9;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.unity3d.ironsourceads.internal.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0392a {

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$a, reason: collision with other inner class name */
        public static final class C0393a extends AbstractC0392a {
            private final String a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0393a() {
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
                return (obj instanceof C0393a) && Intrinsics.areEqual(this.a, ((C0393a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0393a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.a = errorMessage;
            }

            public final C0393a a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new C0393a(errorMessage);
            }

            public /* synthetic */ C0393a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ C0393a a(C0393a c0393a, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0393a.a;
                }
                return c0393a.a(str);
            }
        }

        /* renamed from: com.unity3d.ironsourceads.internal.services.a$a$b */
        public static final class b extends AbstractC0392a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC0392a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0392a() {
        }
    }

    static /* synthetic */ AbstractC0392a a(a aVar, Context context, EnumC2507k9 enumC2507k9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i & 2) != 0) {
            enumC2507k9 = EnumC2507k9.APP_ACTIVITY;
        }
        return aVar.a(context, enumC2507k9);
    }

    AbstractC0392a a(Context context, C2472i9 c2472i9);

    AbstractC0392a a(Context context, EnumC2507k9 enumC2507k9);
}
