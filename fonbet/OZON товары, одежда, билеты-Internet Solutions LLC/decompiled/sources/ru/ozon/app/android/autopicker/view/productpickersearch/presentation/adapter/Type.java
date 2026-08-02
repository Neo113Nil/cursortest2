package ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/Type;", "", "<init>", "(Ljava/lang/String;I)V", "CAPTION", "CATEGORY", "RADIO", "CHECKBOX", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Type {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    public static final Type CAPTION = new Type("CAPTION", 0);
    public static final Type CATEGORY = new Type("CATEGORY", 1);
    public static final Type RADIO = new Type("RADIO", 2);
    public static final Type CHECKBOX = new Type("CHECKBOX", 3);

    private static final /* synthetic */ Type[] $values() {
        return new Type[]{CAPTION, CATEGORY, RADIO, CHECKBOX};
    }

    static {
        Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Type(String str, int i11) {
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }
}
