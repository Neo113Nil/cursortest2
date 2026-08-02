package rh;

import java.util.List;
import java.util.function.BiConsumer;

/* renamed from: rh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6283a implements InterfaceC6299q {
    public static AbstractC6283a a(List list) {
        return new C6285c(list);
    }

    public abstract List b();

    @Override // rh.InterfaceC6299q
    public void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return;
        }
        List b10 = b();
        for (int i10 = 0; i10 < b10.size(); i10 += 2) {
            biConsumer.accept((String) b10.get(i10), (String) b10.get(i10 + 1));
        }
    }

    @Override // rh.InterfaceC6299q
    public boolean isEmpty() {
        return b().isEmpty();
    }
}
