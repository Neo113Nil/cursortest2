package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.vg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2711vg {

    /* renamed from: com.ironsource.vg$a */
    public static final class a extends AbstractC2711vg {
        private final AbstractC2693ug a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2693ug error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.a = error;
        }

        public final AbstractC2693ug a() {
            return this.a;
        }

        public final AbstractC2693ug b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.a + ")";
        }

        public final a a(AbstractC2693ug error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error);
        }

        public static /* synthetic */ a a(a aVar, AbstractC2693ug abstractC2693ug, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC2693ug = aVar.a;
            }
            return aVar.a(abstractC2693ug);
        }
    }

    /* renamed from: com.ironsource.vg$b */
    public static final class b extends AbstractC2711vg {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC2711vg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2711vg() {
    }
}
