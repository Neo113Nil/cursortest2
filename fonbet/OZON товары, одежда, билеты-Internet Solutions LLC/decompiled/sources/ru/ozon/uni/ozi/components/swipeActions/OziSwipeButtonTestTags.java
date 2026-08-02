package ru.ozon.uni.ozi.components.swipeActions;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/components/swipeActions/OziSwipeButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Icon", "Label", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziSwipeButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziSwipeButtonTestTags[] $VALUES;
    public static final OziSwipeButtonTestTags Icon = new OziSwipeButtonTestTags("Icon", 0);
    public static final OziSwipeButtonTestTags Label = new OziSwipeButtonTestTags("Label", 1);

    private static final /* synthetic */ OziSwipeButtonTestTags[] $values() {
        return new OziSwipeButtonTestTags[]{Icon, Label};
    }

    static {
        OziSwipeButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziSwipeButtonTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziSwipeButtonTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziSwipeButtonTestTags valueOf(String str) {
        return (OziSwipeButtonTestTags) Enum.valueOf(OziSwipeButtonTestTags.class, str);
    }

    public static OziSwipeButtonTestTags[] values() {
        return (OziSwipeButtonTestTags[]) $VALUES.clone();
    }
}
