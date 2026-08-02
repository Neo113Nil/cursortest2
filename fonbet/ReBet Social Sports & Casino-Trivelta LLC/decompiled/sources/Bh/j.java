package Bh;

import java.util.Random;
import java.util.function.Supplier;
import rh.AbstractC6294l;
import rh.AbstractC6298p;
import zh.AbstractC7009q;

/* loaded from: classes3.dex */
public enum j implements f {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    public static final Supplier f941b = AbstractC7009q.a();

    @Override // Bh.f
    public String b() {
        long nextLong;
        Random random = (Random) f941b.get();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return AbstractC6294l.a(nextLong);
    }

    @Override // Bh.f
    public String c() {
        long nextLong;
        Random random = (Random) f941b.get();
        long nextLong2 = random.nextLong();
        do {
            nextLong = random.nextLong();
        } while (nextLong == 0);
        return AbstractC6298p.a(nextLong2, nextLong);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "RandomIdGenerator{}";
    }
}
