package zh;

import java.util.Random;
import java.util.function.Supplier;

/* renamed from: zh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC6993a implements Supplier {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    public static final Random f69186b = new Random();

    @Override // java.util.function.Supplier
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Random get() {
        return f69186b;
    }
}
