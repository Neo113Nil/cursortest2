package ru.ozon.app.android.pdp.view.animationsaleblock;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/view/animationsaleblock/ObjectAnimation;", "", "priority", "", "<init>", "(Ljava/lang/String;II)V", "getPriority", "()I", "PRICE_INSTALLMENT", "PRICE_ACTION", "PRICE_CELL", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ObjectAnimation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ObjectAnimation[] $VALUES;
    private final int priority;
    public static final ObjectAnimation PRICE_INSTALLMENT = new ObjectAnimation("PRICE_INSTALLMENT", 0, 3);
    public static final ObjectAnimation PRICE_ACTION = new ObjectAnimation("PRICE_ACTION", 1, 2);
    public static final ObjectAnimation PRICE_CELL = new ObjectAnimation("PRICE_CELL", 2, 1);

    private static final /* synthetic */ ObjectAnimation[] $values() {
        return new ObjectAnimation[]{PRICE_INSTALLMENT, PRICE_ACTION, PRICE_CELL};
    }

    static {
        ObjectAnimation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ObjectAnimation(String str, int i11, int i12) {
        this.priority = i12;
    }

    public static ObjectAnimation valueOf(String str) {
        return (ObjectAnimation) Enum.valueOf(ObjectAnimation.class, str);
    }

    public static ObjectAnimation[] values() {
        return (ObjectAnimation[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
