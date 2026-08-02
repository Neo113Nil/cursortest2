package rh;

import java.util.function.BiConsumer;

/* renamed from: rh.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6299q {
    static InterfaceC6299q getDefault() {
        return AbstractC6284b.a();
    }

    void forEach(BiConsumer biConsumer);

    boolean isEmpty();
}
