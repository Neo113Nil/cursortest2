package ru.ozon.uni.android.cell.text.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.LabelAddonWrapperPresets;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/cell/text/data/TextFieldPresets;", "", "<init>", "()V", "default500Start", "Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "getDefault500Start", "()Lru/ozon/uni/android/cell/text/data/TextFieldPreset;", "default500End", "getDefault500End", "default600Start", "getDefault600Start", "default600End", "getDefault600End", "default600AccentStart", "getDefault600AccentStart", "default600AccentEnd", "getDefault600AccentEnd", "default500ZeroPadding", "getDefault500ZeroPadding", "default600ZeroPadding", "getDefault600ZeroPadding", "default600AccentZeroPadding", "getDefault600AccentZeroPadding", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextFieldPresets {

    @NotNull
    public static final TextFieldPresets INSTANCE = new TextFieldPresets();

    @NotNull
    private static final TextFieldPreset default500End;

    @NotNull
    private static final TextFieldPreset default500Start;

    @NotNull
    private static final TextFieldPreset default500ZeroPadding;

    @NotNull
    private static final TextFieldPreset default600AccentEnd;

    @NotNull
    private static final TextFieldPreset default600AccentStart;

    @NotNull
    private static final TextFieldPreset default600AccentZeroPadding;

    @NotNull
    private static final TextFieldPreset default600End;

    @NotNull
    private static final TextFieldPreset default600Start;

    @NotNull
    private static final TextFieldPreset default600ZeroPadding;

    static {
        TextInputStyle.Companion companion = TextInputStyle.INSTANCE;
        TextInputStyle createInput500Style = companion.createInput500Style();
        LabelAddonWrapperPresets labelAddonWrapperPresets = LabelAddonWrapperPresets.INSTANCE;
        default500Start = new TextFieldPreset(createInput500Style, labelAddonWrapperPresets.getLeadingTitleControl400());
        default500End = new TextFieldPreset(companion.createInput500Style(), labelAddonWrapperPresets.getLeadingSubtitle300());
        default600Start = new TextFieldPreset(companion.createInput600Style(), labelAddonWrapperPresets.getLeadingTitleControl400());
        default600End = new TextFieldPreset(companion.createInput600Style(), labelAddonWrapperPresets.getLeadingSubtitle300());
        default600AccentStart = new TextFieldPreset(companion.createInput600AccentStyle(), labelAddonWrapperPresets.getLeadingTitleControl400());
        default600AccentEnd = new TextFieldPreset(companion.createInput600AccentStyle(), labelAddonWrapperPresets.getLeadingSubtitle300());
        default500ZeroPadding = new TextFieldPreset(companion.createInput500Style(), labelAddonWrapperPresets.getLeadingTitleControl400ZeroPadding());
        default600ZeroPadding = new TextFieldPreset(companion.createInput600Style(), labelAddonWrapperPresets.getLeadingTitleControl400ZeroPadding());
        default600AccentZeroPadding = new TextFieldPreset(companion.createInput600AccentStyle(), labelAddonWrapperPresets.getLeadingTitleControl400ZeroPadding());
    }

    private TextFieldPresets() {
    }

    @NotNull
    public final TextFieldPreset getDefault500End() {
        return default500End;
    }

    @NotNull
    public final TextFieldPreset getDefault500Start() {
        return default500Start;
    }

    @NotNull
    public final TextFieldPreset getDefault500ZeroPadding() {
        return default500ZeroPadding;
    }

    @NotNull
    public final TextFieldPreset getDefault600AccentEnd() {
        return default600AccentEnd;
    }

    @NotNull
    public final TextFieldPreset getDefault600AccentStart() {
        return default600AccentStart;
    }

    @NotNull
    public final TextFieldPreset getDefault600AccentZeroPadding() {
        return default600AccentZeroPadding;
    }

    @NotNull
    public final TextFieldPreset getDefault600End() {
        return default600End;
    }

    @NotNull
    public final TextFieldPreset getDefault600Start() {
        return default600Start;
    }

    @NotNull
    public final TextFieldPreset getDefault600ZeroPadding() {
        return default600ZeroPadding;
    }
}
