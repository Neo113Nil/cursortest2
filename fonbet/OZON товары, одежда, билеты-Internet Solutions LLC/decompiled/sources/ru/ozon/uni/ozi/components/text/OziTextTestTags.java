package ru.ozon.uni.ozi.components.text;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/components/text/OziTextTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Text", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTextTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziTextTestTags[] $VALUES;
    public static final OziTextTestTags Text = new OziTextTestTags("Text", 0);

    private static final /* synthetic */ OziTextTestTags[] $values() {
        return new OziTextTestTags[]{Text};
    }

    static {
        OziTextTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziTextTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziTextTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziTextTestTags valueOf(String str) {
        return (OziTextTestTags) Enum.valueOf(OziTextTestTags.class, str);
    }

    public static OziTextTestTags[] values() {
        return (OziTextTestTags[]) $VALUES.clone();
    }
}
