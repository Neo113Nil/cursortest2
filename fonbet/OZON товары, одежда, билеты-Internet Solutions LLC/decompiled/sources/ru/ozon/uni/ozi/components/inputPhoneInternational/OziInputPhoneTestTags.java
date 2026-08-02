package ru.ozon.uni.ozi.components.inputPhoneInternational;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/inputPhoneInternational/OziInputPhoneTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "CountryCodeSelector", "Flag", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziInputPhoneTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziInputPhoneTestTags[] $VALUES;
    public static final OziInputPhoneTestTags Container = new OziInputPhoneTestTags("Container", 0);
    public static final OziInputPhoneTestTags CountryCodeSelector = new OziInputPhoneTestTags("CountryCodeSelector", 1);
    public static final OziInputPhoneTestTags Flag = new OziInputPhoneTestTags("Flag", 2);

    private static final /* synthetic */ OziInputPhoneTestTags[] $values() {
        return new OziInputPhoneTestTags[]{Container, CountryCodeSelector, Flag};
    }

    static {
        OziInputPhoneTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziInputPhoneTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziInputPhoneTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziInputPhoneTestTags valueOf(String str) {
        return (OziInputPhoneTestTags) Enum.valueOf(OziInputPhoneTestTags.class, str);
    }

    public static OziInputPhoneTestTags[] values() {
        return (OziInputPhoneTestTags[]) $VALUES.clone();
    }
}
