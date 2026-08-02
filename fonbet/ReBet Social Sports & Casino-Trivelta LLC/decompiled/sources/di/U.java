package di;

import Zh.InterfaceC1901b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class U {

    public static final class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1901b f45330a;

        public a(InterfaceC1901b interfaceC1901b) {
            this.f45330a = interfaceC1901b;
        }

        @Override // di.N
        public InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{this.f45330a};
        }

        @Override // Zh.InterfaceC1900a
        public Object deserialize(ci.e decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public bi.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // Zh.p
        public void serialize(ci.f encoder, Object obj) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return super.typeParametersSerializers();
        }
    }

    public static final bi.f a(String name, InterfaceC1901b primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new T(name, new a(primitiveSerializer));
    }
}
