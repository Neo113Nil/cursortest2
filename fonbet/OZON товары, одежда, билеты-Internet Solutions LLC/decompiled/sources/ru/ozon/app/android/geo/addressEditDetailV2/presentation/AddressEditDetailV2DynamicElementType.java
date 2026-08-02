package ru.ozon.app.android.geo.addressEditDetailV2.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "BUTTON", "CHECKOUT_CELL_LIST", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditDetailV2DynamicElementType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AddressEditDetailV2DynamicElementType[] $VALUES;
    public static final AddressEditDetailV2DynamicElementType BUTTON = new AddressEditDetailV2DynamicElementType("BUTTON", 0, 1);
    public static final AddressEditDetailV2DynamicElementType CHECKOUT_CELL_LIST = new AddressEditDetailV2DynamicElementType("CHECKOUT_CELL_LIST", 1, 2);
    private final int id;

    private static final /* synthetic */ AddressEditDetailV2DynamicElementType[] $values() {
        return new AddressEditDetailV2DynamicElementType[]{BUTTON, CHECKOUT_CELL_LIST};
    }

    static {
        AddressEditDetailV2DynamicElementType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private AddressEditDetailV2DynamicElementType(String str, int i11, int i12) {
        this.id = i12;
    }

    public static AddressEditDetailV2DynamicElementType valueOf(String str) {
        return (AddressEditDetailV2DynamicElementType) Enum.valueOf(AddressEditDetailV2DynamicElementType.class, str);
    }

    public static AddressEditDetailV2DynamicElementType[] values() {
        return (AddressEditDetailV2DynamicElementType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
