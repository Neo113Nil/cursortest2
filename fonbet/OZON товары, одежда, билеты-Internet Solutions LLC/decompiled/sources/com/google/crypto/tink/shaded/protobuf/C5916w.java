package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5916w implements Q {

    /* renamed from: a, reason: collision with root package name */
    private static final C5916w f59474a = new C5916w();

    public static C5916w a() {
        return f59474a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final boolean isSupported(Class<?> cls) {
        return AbstractC5917x.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final P messageInfoFor(Class<?> cls) {
        if (!AbstractC5917x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (P) AbstractC5917x.l(cls.asSubclass(AbstractC5917x.class)).j(AbstractC5917x.f.BUILD_MESSAGE_INFO);
        } catch (Exception e11) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e11);
        }
    }
}
