package kotlin.io.encoding;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/io/encoding/Base64$PaddingOption", "", "Lkotlin/io/encoding/Base64$PaddingOption;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Base64$PaddingOption {
    public static final /* synthetic */ Base64$PaddingOption[] a = {new Base64$PaddingOption("PRESENT", 0), new Base64$PaddingOption("ABSENT", 1), new Base64$PaddingOption("PRESENT_OPTIONAL", 2), new Base64$PaddingOption("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    Base64$PaddingOption EF5;

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) a.clone();
    }
}
