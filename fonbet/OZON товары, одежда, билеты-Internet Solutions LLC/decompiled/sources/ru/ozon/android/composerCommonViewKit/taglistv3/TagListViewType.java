package ru.ozon.android.composerCommonViewKit.taglistv3;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/taglistv3/TagListViewType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "VIEW_TYPE_UNSPECIFIED", "VIEW_TYPE_SCROLL", "VIEW_TYPE_PLAIN", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TagListViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TagListViewType[] $VALUES;

    @NotNull
    private final String value;

    @i(name = "VIEW_TYPE_UNSPECIFIED")
    public static final TagListViewType VIEW_TYPE_UNSPECIFIED = new TagListViewType("VIEW_TYPE_UNSPECIFIED", 0, "VIEW_TYPE_UNSPECIFIED");

    @i(name = "VIEW_TYPE_SCROLL")
    public static final TagListViewType VIEW_TYPE_SCROLL = new TagListViewType("VIEW_TYPE_SCROLL", 1, "VIEW_TYPE_SCROLL");

    @i(name = "VIEW_TYPE_PLAIN")
    public static final TagListViewType VIEW_TYPE_PLAIN = new TagListViewType("VIEW_TYPE_PLAIN", 2, "VIEW_TYPE_PLAIN");

    private static final /* synthetic */ TagListViewType[] $values() {
        return new TagListViewType[]{VIEW_TYPE_UNSPECIFIED, VIEW_TYPE_SCROLL, VIEW_TYPE_PLAIN};
    }

    static {
        TagListViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TagListViewType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static TagListViewType valueOf(String str) {
        return (TagListViewType) Enum.valueOf(TagListViewType.class, str);
    }

    public static TagListViewType[] values() {
        return (TagListViewType[]) $VALUES.clone();
    }
}
