package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/ViewType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "TEXT", "CHECKBOX", "SELECTOR", "SEARCH", "YANDEX_SEARCH", "ATOMS", "ACTION", "FIELD_TYPE_CHIPS_WITH_FIELD", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ViewType[] $VALUES;
    private final int id;
    public static final ViewType TEXT = new ViewType("TEXT", 0, 1);
    public static final ViewType CHECKBOX = new ViewType("CHECKBOX", 1, 2);
    public static final ViewType SELECTOR = new ViewType("SELECTOR", 2, 3);
    public static final ViewType SEARCH = new ViewType("SEARCH", 3, 4);
    public static final ViewType YANDEX_SEARCH = new ViewType("YANDEX_SEARCH", 4, 5);
    public static final ViewType ATOMS = new ViewType("ATOMS", 5, 6);
    public static final ViewType ACTION = new ViewType("ACTION", 6, 7);
    public static final ViewType FIELD_TYPE_CHIPS_WITH_FIELD = new ViewType("FIELD_TYPE_CHIPS_WITH_FIELD", 7, 8);

    private static final /* synthetic */ ViewType[] $values() {
        return new ViewType[]{TEXT, CHECKBOX, SELECTOR, SEARCH, YANDEX_SEARCH, ATOMS, ACTION, FIELD_TYPE_CHIPS_WITH_FIELD};
    }

    static {
        ViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ViewType(String str, int i11, int i12) {
        this.id = i12;
    }

    public static ViewType valueOf(String str) {
        return (ViewType) Enum.valueOf(ViewType.class, str);
    }

    public static ViewType[] values() {
        return (ViewType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
