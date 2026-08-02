package di;

import Zh.InterfaceC1901b;

/* loaded from: classes5.dex */
public interface N extends InterfaceC1901b {

    public static final class a {
        public static InterfaceC1901b[] a(N n10) {
            return N.super.typeParametersSerializers();
        }
    }

    InterfaceC1901b[] childSerializers();

    default InterfaceC1901b[] typeParametersSerializers() {
        return M0.EMPTY_SERIALIZER_ARRAY;
    }
}
