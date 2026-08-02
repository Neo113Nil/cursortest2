package ru.ozon.tracker.performance;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/tracker/performance/ObjectTypes;", "", "<init>", "(Ljava/lang/String;I)V", "APPLICATION", "PAGE", "PAGE_PART", "IMAGE", "WIDGET", "PDF", "PAGE_SCROLL", "CUSTOM", "ASYNC_WIDGET", "ACTION", "MAP", "PCL_PAGE", "MAP_SDK", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ObjectTypes {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ ObjectTypes[] $VALUES;
    public static final ObjectTypes APPLICATION = new ObjectTypes("APPLICATION", 0);
    public static final ObjectTypes PAGE = new ObjectTypes("PAGE", 1);
    public static final ObjectTypes PAGE_PART = new ObjectTypes("PAGE_PART", 2);
    public static final ObjectTypes IMAGE = new ObjectTypes("IMAGE", 3);
    public static final ObjectTypes WIDGET = new ObjectTypes("WIDGET", 4);
    public static final ObjectTypes PDF = new ObjectTypes("PDF", 5);
    public static final ObjectTypes PAGE_SCROLL = new ObjectTypes("PAGE_SCROLL", 6);
    public static final ObjectTypes CUSTOM = new ObjectTypes("CUSTOM", 7);
    public static final ObjectTypes ASYNC_WIDGET = new ObjectTypes("ASYNC_WIDGET", 8);
    public static final ObjectTypes ACTION = new ObjectTypes("ACTION", 9);
    public static final ObjectTypes MAP = new ObjectTypes("MAP", 10);
    public static final ObjectTypes PCL_PAGE = new ObjectTypes("PCL_PAGE", 11);
    public static final ObjectTypes MAP_SDK = new ObjectTypes("MAP_SDK", 12);

    private static final /* synthetic */ ObjectTypes[] $values() {
        return new ObjectTypes[]{APPLICATION, PAGE, PAGE_PART, IMAGE, WIDGET, PDF, PAGE_SCROLL, CUSTOM, ASYNC_WIDGET, ACTION, MAP, PCL_PAGE, MAP_SDK};
    }

    static {
        ObjectTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private ObjectTypes(String str, int i11) {
    }

    @NotNull
    public static Xc.a<ObjectTypes> getEntries() {
        return $ENTRIES;
    }

    public static ObjectTypes valueOf(String str) {
        return (ObjectTypes) Enum.valueOf(ObjectTypes.class, str);
    }

    public static ObjectTypes[] values() {
        return (ObjectTypes[]) $VALUES.clone();
    }
}
