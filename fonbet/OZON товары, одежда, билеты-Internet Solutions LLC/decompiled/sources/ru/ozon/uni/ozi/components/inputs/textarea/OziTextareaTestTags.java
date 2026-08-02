package ru.ozon.uni.ozi.components.inputs.textarea;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/inputs/textarea/OziTextareaTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Container", "ClearButton", "SystemContent", "RightContent", "Caption", "TextField", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTextareaTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziTextareaTestTags[] $VALUES;
    public static final OziTextareaTestTags Container = new OziTextareaTestTags("Container", 0);
    public static final OziTextareaTestTags ClearButton = new OziTextareaTestTags("ClearButton", 1);
    public static final OziTextareaTestTags SystemContent = new OziTextareaTestTags("SystemContent", 2);
    public static final OziTextareaTestTags RightContent = new OziTextareaTestTags("RightContent", 3);
    public static final OziTextareaTestTags Caption = new OziTextareaTestTags("Caption", 4);
    public static final OziTextareaTestTags TextField = new OziTextareaTestTags("TextField", 5);

    private static final /* synthetic */ OziTextareaTestTags[] $values() {
        return new OziTextareaTestTags[]{Container, ClearButton, SystemContent, RightContent, Caption, TextField};
    }

    static {
        OziTextareaTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziTextareaTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziTextareaTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziTextareaTestTags valueOf(String str) {
        return (OziTextareaTestTags) Enum.valueOf(OziTextareaTestTags.class, str);
    }

    public static OziTextareaTestTags[] values() {
        return (OziTextareaTestTags[]) $VALUES.clone();
    }
}
