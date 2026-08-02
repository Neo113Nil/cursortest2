package wf;

import Gb.c;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private final String typeValue;

    @c("text")
    public static final b Text = new b("Text", 0, "text");

    @c("chat_attachment")
    public static final b Attachment = new b("Attachment", 1, "chat_attachment");

    @c("voice_note")
    public static final b VoiceNote = new b("VoiceNote", 2, "voice_note");

    @c("applogs")
    public static final b AppLogs = new b("AppLogs", 3, "applogs");

    private static final /* synthetic */ b[] $values() {
        return new b[]{Text, Attachment, VoiceNote, AppLogs};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private b(String str, int i10, String str2) {
        this.typeValue = str2;
    }

    @NotNull
    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String getTypeValue() {
        return this.typeValue;
    }
}
