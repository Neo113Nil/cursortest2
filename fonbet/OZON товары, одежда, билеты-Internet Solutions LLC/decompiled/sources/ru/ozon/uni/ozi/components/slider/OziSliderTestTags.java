package ru.ozon.uni.ozi.components.slider;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/components/slider/OziSliderTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "Thumb", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziSliderTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziSliderTestTags[] $VALUES;
    public static final OziSliderTestTags Container = new OziSliderTestTags("Container", 0);
    public static final OziSliderTestTags Thumb = new OziSliderTestTags("Thumb", 1);

    private static final /* synthetic */ OziSliderTestTags[] $values() {
        return new OziSliderTestTags[]{Container, Thumb};
    }

    static {
        OziSliderTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziSliderTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziSliderTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziSliderTestTags valueOf(String str) {
        return (OziSliderTestTags) Enum.valueOf(OziSliderTestTags.class, str);
    }

    public static OziSliderTestTags[] values() {
        return (OziSliderTestTags[]) $VALUES.clone();
    }
}
