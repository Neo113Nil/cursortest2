package ru.ozon.uni.ozi.components.loader;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/components/loader/OziLoaderTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "ProgressIndicator", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziLoaderTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziLoaderTestTags[] $VALUES;
    public static final OziLoaderTestTags Container = new OziLoaderTestTags("Container", 0);
    public static final OziLoaderTestTags ProgressIndicator = new OziLoaderTestTags("ProgressIndicator", 1);

    private static final /* synthetic */ OziLoaderTestTags[] $values() {
        return new OziLoaderTestTags[]{Container, ProgressIndicator};
    }

    static {
        OziLoaderTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziLoaderTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziLoaderTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziLoaderTestTags valueOf(String str) {
        return (OziLoaderTestTags) Enum.valueOf(OziLoaderTestTags.class, str);
    }

    public static OziLoaderTestTags[] values() {
        return (OziLoaderTestTags[]) $VALUES.clone();
    }
}
