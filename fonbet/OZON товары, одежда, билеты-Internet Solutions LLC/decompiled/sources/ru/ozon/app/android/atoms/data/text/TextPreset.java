package ru.ozon.app.android.atoms.data.text;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/atoms/data/text/TextPreset;", "", "<init>", "(Ljava/lang/String;I)V", "H1", "H2", "H3", "H4", "PARAGRAPH", "PARAGRAPH_COMPACT", "UI_H2", "UI_H2_COMPACT", "UI_H1", "PRESET_CUSTOM", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextPreset {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextPreset[] $VALUES;

    /* renamed from: H1, reason: collision with root package name */
    public static final TextPreset f92183H1 = new TextPreset("H1", 0);

    /* renamed from: H2, reason: collision with root package name */
    public static final TextPreset f92184H2 = new TextPreset("H2", 1);

    /* renamed from: H3, reason: collision with root package name */
    public static final TextPreset f92185H3 = new TextPreset("H3", 2);

    /* renamed from: H4, reason: collision with root package name */
    public static final TextPreset f92186H4 = new TextPreset("H4", 3);
    public static final TextPreset PARAGRAPH = new TextPreset("PARAGRAPH", 4);
    public static final TextPreset PARAGRAPH_COMPACT = new TextPreset("PARAGRAPH_COMPACT", 5);
    public static final TextPreset UI_H2 = new TextPreset("UI_H2", 6);
    public static final TextPreset UI_H2_COMPACT = new TextPreset("UI_H2_COMPACT", 7);
    public static final TextPreset UI_H1 = new TextPreset("UI_H1", 8);
    public static final TextPreset PRESET_CUSTOM = new TextPreset("PRESET_CUSTOM", 9);

    private static final /* synthetic */ TextPreset[] $values() {
        return new TextPreset[]{f92183H1, f92184H2, f92185H3, f92186H4, PARAGRAPH, PARAGRAPH_COMPACT, UI_H2, UI_H2_COMPACT, UI_H1, PRESET_CUSTOM};
    }

    static {
        TextPreset[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private TextPreset(String str, int i11) {
    }

    @NotNull
    public static a<TextPreset> getEntries() {
        return $ENTRIES;
    }

    public static TextPreset valueOf(String str) {
        return (TextPreset) Enum.valueOf(TextPreset.class, str);
    }

    public static TextPreset[] values() {
        return (TextPreset[]) $VALUES.clone();
    }
}
