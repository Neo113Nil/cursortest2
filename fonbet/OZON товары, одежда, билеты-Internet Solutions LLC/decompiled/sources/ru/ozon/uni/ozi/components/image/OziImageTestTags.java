package ru.ozon.uni.ozi.components.image;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/image/OziImageTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "Image", "EmptyIcon", "Shimmer", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziImageTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziImageTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziImageTestTags> EmptyIconName;

    @NotNull
    private static final OziTestTagParameter<OziImageTestTags> ImageName;
    public static final OziImageTestTags Container = new OziImageTestTags("Container", 0);
    public static final OziImageTestTags Image = new OziImageTestTags("Image", 1);
    public static final OziImageTestTags EmptyIcon = new OziImageTestTags("EmptyIcon", 2);
    public static final OziImageTestTags Shimmer = new OziImageTestTags("Shimmer", 3);

    private static final /* synthetic */ OziImageTestTags[] $values() {
        return new OziImageTestTags[]{Container, Image, EmptyIcon, Shimmer};
    }

    static {
        OziImageTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        ImageName = new OziTestTagParameter<>("imageName");
        EmptyIconName = new OziTestTagParameter<>("emptyIconName");
    }

    private OziImageTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziImageTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziImageTestTags valueOf(String str) {
        return (OziImageTestTags) Enum.valueOf(OziImageTestTags.class, str);
    }

    public static OziImageTestTags[] values() {
        return (OziImageTestTags[]) $VALUES.clone();
    }
}
