package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public class j0 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: a, reason: collision with root package name */
    public final List f37326a;

    public j0(O o10) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f37326a = null;
    }

    public A a() {
        return new A(getMessage());
    }
}
