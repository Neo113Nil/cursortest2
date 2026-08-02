package ru.ozon.app.android.geo.addressEditDetail;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "ATOM", "HEADER_ATOM", "TEXT_SMALL_ATOM", "TEXT_MEDIUM_ATOM", "BUTTON_ATOM", "BUTTON_SECONDARY_ATOM", "CHECKOUT_CELL_LIST", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailDynamicElementType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddressEditDetailDynamicElementType[] $VALUES;
    private final int id;
    public static final AddressEditDetailDynamicElementType ATOM = new AddressEditDetailDynamicElementType("ATOM", 0, 1);
    public static final AddressEditDetailDynamicElementType HEADER_ATOM = new AddressEditDetailDynamicElementType("HEADER_ATOM", 1, 2);
    public static final AddressEditDetailDynamicElementType TEXT_SMALL_ATOM = new AddressEditDetailDynamicElementType("TEXT_SMALL_ATOM", 2, 3);
    public static final AddressEditDetailDynamicElementType TEXT_MEDIUM_ATOM = new AddressEditDetailDynamicElementType("TEXT_MEDIUM_ATOM", 3, 4);
    public static final AddressEditDetailDynamicElementType BUTTON_ATOM = new AddressEditDetailDynamicElementType("BUTTON_ATOM", 4, 5);
    public static final AddressEditDetailDynamicElementType BUTTON_SECONDARY_ATOM = new AddressEditDetailDynamicElementType("BUTTON_SECONDARY_ATOM", 5, 6);
    public static final AddressEditDetailDynamicElementType CHECKOUT_CELL_LIST = new AddressEditDetailDynamicElementType("CHECKOUT_CELL_LIST", 6, 7);

    private static final /* synthetic */ AddressEditDetailDynamicElementType[] $values() {
        return new AddressEditDetailDynamicElementType[]{ATOM, HEADER_ATOM, TEXT_SMALL_ATOM, TEXT_MEDIUM_ATOM, BUTTON_ATOM, BUTTON_SECONDARY_ATOM, CHECKOUT_CELL_LIST};
    }

    static {
        AddressEditDetailDynamicElementType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AddressEditDetailDynamicElementType(String str, int i11, int i12) {
        this.id = i12;
    }

    public static AddressEditDetailDynamicElementType valueOf(String str) {
        return (AddressEditDetailDynamicElementType) Enum.valueOf(AddressEditDetailDynamicElementType.class, str);
    }

    public static AddressEditDetailDynamicElementType[] values() {
        return (AddressEditDetailDynamicElementType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
