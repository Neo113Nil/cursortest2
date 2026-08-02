package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum p6k extends u6k {
    public p6k() {
        super("JAVA7", 1);
    }

    @Override // defpackage.u6k
    public final Type a(Type type) {
        if (!(type instanceof Class)) {
            return new a(1, type);
        }
        uea ueaVar = z6k.a;
        return Array.newInstance((Class<?>) type, 0).getClass();
    }

    @Override // defpackage.u6k
    public final Type d(Type type) {
        type.getClass();
        return type;
    }
}
