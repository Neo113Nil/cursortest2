package com.logrocket.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public m(String str) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str));
    }

    public m(RuntimeException runtimeException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
    }

    public m(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
