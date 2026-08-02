package ru.ozon.uni.components.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/components/button/UniButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "IconName", "Loader", "Title", "Subtitle", "DataText", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniButtonTestTags[] $VALUES;
    public static final UniButtonTestTags Container = new UniButtonTestTags("Container", 0);
    public static final UniButtonTestTags IconName = new UniButtonTestTags("IconName", 1);
    public static final UniButtonTestTags Loader = new UniButtonTestTags("Loader", 2);
    public static final UniButtonTestTags Title = new UniButtonTestTags("Title", 3);
    public static final UniButtonTestTags Subtitle = new UniButtonTestTags("Subtitle", 4);
    public static final UniButtonTestTags DataText = new UniButtonTestTags("DataText", 5);

    private static final /* synthetic */ UniButtonTestTags[] $values() {
        return new UniButtonTestTags[]{Container, IconName, Loader, Title, Subtitle, DataText};
    }

    static {
        UniButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UniButtonTestTags(String str, int i11) {
    }

    @NotNull
    public static a<UniButtonTestTags> getEntries() {
        return $ENTRIES;
    }

    public static UniButtonTestTags valueOf(String str) {
        return (UniButtonTestTags) Enum.valueOf(UniButtonTestTags.class, str);
    }

    public static UniButtonTestTags[] values() {
        return (UniButtonTestTags[]) $VALUES.clone();
    }
}
