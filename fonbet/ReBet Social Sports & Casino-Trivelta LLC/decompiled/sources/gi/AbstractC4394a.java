package gi;

import Zh.InterfaceC1901b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gi.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4394a {

    /* renamed from: gi.a$a, reason: collision with other inner class name */
    public static final class C0708a extends AbstractC4394a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1901b f47456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0708a(InterfaceC1901b serializer) {
            super(null);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.f47456a = serializer;
        }

        @Override // gi.AbstractC4394a
        public InterfaceC1901b a(List typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f47456a;
        }

        public final InterfaceC1901b b() {
            return this.f47456a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0708a) && Intrinsics.areEqual(((C0708a) obj).f47456a, this.f47456a);
        }

        public int hashCode() {
            return this.f47456a.hashCode();
        }
    }

    /* renamed from: gi.a$b */
    public static final class b extends AbstractC4394a {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f47457a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 provider) {
            super(null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.f47457a = provider;
        }

        @Override // gi.AbstractC4394a
        public InterfaceC1901b a(List typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (InterfaceC1901b) this.f47457a.invoke(typeArgumentsSerializers);
        }

        public final Function1 b() {
            return this.f47457a;
        }
    }

    public /* synthetic */ AbstractC4394a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract InterfaceC1901b a(List list);

    public AbstractC4394a() {
    }
}
