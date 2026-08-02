package ru.ozon.uni.android.cell.label.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007¨\u0006("}, d2 = {"Lru/ozon/uni/android/cell/label/data/SmartLabelPresets;", "", "<init>", "()V", "leadingTitleAccent700", "Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "getLeadingTitleAccent700", "()Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "leadingTitle500", "getLeadingTitle500", "leadingTitleControl500", "getLeadingTitleControl500", "leadingTitle400", "getLeadingTitle400", "leadingTitleControl400", "getLeadingTitleControl400", "leadingTitle300", "getLeadingTitle300", "centerTitle500", "getCenterTitle500", "centerTitleControl500", "getCenterTitleControl500", "centerTitle400", "getCenterTitle400", "centerTitleControl400", "getCenterTitleControl400", "centerTitle300", "getCenterTitle300", "leadingSubtitle500", "getLeadingSubtitle500", "leadingSubtitle400", "getLeadingSubtitle400", "leadingSubtitle300", "getLeadingSubtitle300", "centerSubtitle400", "getCenterSubtitle400", "centerSubtitle300", "getCenterSubtitle300", "leadingNumeric500", "getLeadingNumeric500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SmartLabelPresets {

    @NotNull
    private static final SmartLabelPreset centerSubtitle300;

    @NotNull
    private static final SmartLabelPreset centerSubtitle400;

    @NotNull
    private static final SmartLabelPreset centerTitle300;

    @NotNull
    private static final SmartLabelPreset centerTitle400;

    @NotNull
    private static final SmartLabelPreset centerTitle500;

    @NotNull
    private static final SmartLabelPreset centerTitleControl400;

    @NotNull
    private static final SmartLabelPreset centerTitleControl500;

    @NotNull
    private static final SmartLabelPreset leadingNumeric500;

    @NotNull
    private static final SmartLabelPreset leadingSubtitle300;

    @NotNull
    private static final SmartLabelPreset leadingSubtitle400;

    @NotNull
    private static final SmartLabelPreset leadingSubtitle500;

    @NotNull
    private static final SmartLabelPreset leadingTitle300;

    @NotNull
    private static final SmartLabelPreset leadingTitle400;

    @NotNull
    private static final SmartLabelPreset leadingTitle500;

    @NotNull
    private static final SmartLabelPreset leadingTitleControl400;

    @NotNull
    private static final SmartLabelPreset leadingTitleControl500;

    @NotNull
    public static final SmartLabelPresets INSTANCE = new SmartLabelPresets();

    @NotNull
    private static final SmartLabelPreset leadingTitleAccent700 = new SmartLabelPreset(UniTextStyles.HEADLINE_500_MEDIUM.getResId(), 8388611, 4);

    static {
        UniTextStyles uniTextStyles = UniTextStyles.COMPACT_500_MEDIUM;
        leadingTitle500 = new SmartLabelPreset(uniTextStyles.getResId(), 8388611, 2);
        UniTextStyles uniTextStyles2 = UniTextStyles.COMPACT_CONTROL_500_MEDIUM;
        leadingTitleControl500 = new SmartLabelPreset(uniTextStyles2.getResId(), 8388611, 2);
        UniTextStyles uniTextStyles3 = UniTextStyles.COMPACT_400_SMALL;
        leadingTitle400 = new SmartLabelPreset(uniTextStyles3.getResId(), 8388611, 2);
        UniTextStyles uniTextStyles4 = UniTextStyles.COMPACT_CONTROL_400_SMALL;
        leadingTitleControl400 = new SmartLabelPreset(uniTextStyles4.getResId(), 8388611, 2);
        UniTextStyles uniTextStyles5 = UniTextStyles.COMPACT_300_X_SMALL;
        leadingTitle300 = new SmartLabelPreset(uniTextStyles5.getResId(), 8388611, 2);
        centerTitle500 = new SmartLabelPreset(uniTextStyles.getResId(), 17, 2);
        centerTitleControl500 = new SmartLabelPreset(uniTextStyles2.getResId(), 17, 2);
        centerTitle400 = new SmartLabelPreset(uniTextStyles3.getResId(), 17, 2);
        centerTitleControl400 = new SmartLabelPreset(uniTextStyles4.getResId(), 17, 2);
        centerTitle300 = new SmartLabelPreset(uniTextStyles5.getResId(), 17, 2);
        leadingSubtitle500 = new SmartLabelPreset(UniTextStyles.BODY_500_MEDIUM.getResId(), 8388611, 2);
        UniTextStyles uniTextStyles6 = UniTextStyles.BODY_400_SMALL;
        leadingSubtitle400 = new SmartLabelPreset(uniTextStyles6.getResId(), 8388611, 2);
        UniTextStyles uniTextStyles7 = UniTextStyles.BODY_300_X_SMALL;
        leadingSubtitle300 = new SmartLabelPreset(uniTextStyles7.getResId(), 8388611, 2);
        centerSubtitle400 = new SmartLabelPreset(uniTextStyles6.getResId(), 17, 2);
        centerSubtitle300 = new SmartLabelPreset(uniTextStyles7.getResId(), 17, 2);
        leadingNumeric500 = new SmartLabelPreset(UniTextStyles.BODY_NUMERIC_500_MEDIUM.getResId(), 8388611, 2);
    }

    private SmartLabelPresets() {
    }

    @NotNull
    public final SmartLabelPreset getCenterSubtitle300() {
        return centerSubtitle300;
    }

    @NotNull
    public final SmartLabelPreset getCenterSubtitle400() {
        return centerSubtitle400;
    }

    @NotNull
    public final SmartLabelPreset getCenterTitle300() {
        return centerTitle300;
    }

    @NotNull
    public final SmartLabelPreset getCenterTitle400() {
        return centerTitle400;
    }

    @NotNull
    public final SmartLabelPreset getCenterTitle500() {
        return centerTitle500;
    }

    @NotNull
    public final SmartLabelPreset getCenterTitleControl400() {
        return centerTitleControl400;
    }

    @NotNull
    public final SmartLabelPreset getCenterTitleControl500() {
        return centerTitleControl500;
    }

    @NotNull
    public final SmartLabelPreset getLeadingNumeric500() {
        return leadingNumeric500;
    }

    @NotNull
    public final SmartLabelPreset getLeadingSubtitle300() {
        return leadingSubtitle300;
    }

    @NotNull
    public final SmartLabelPreset getLeadingSubtitle400() {
        return leadingSubtitle400;
    }

    @NotNull
    public final SmartLabelPreset getLeadingSubtitle500() {
        return leadingSubtitle500;
    }

    @NotNull
    public final SmartLabelPreset getLeadingTitle300() {
        return leadingTitle300;
    }

    @NotNull
    public final SmartLabelPreset getLeadingTitle400() {
        return leadingTitle400;
    }

    @NotNull
    public final SmartLabelPreset getLeadingTitle500() {
        return leadingTitle500;
    }

    @NotNull
    public final SmartLabelPreset getLeadingTitleAccent700() {
        return leadingTitleAccent700;
    }

    @NotNull
    public final SmartLabelPreset getLeadingTitleControl400() {
        return leadingTitleControl400;
    }

    @NotNull
    public final SmartLabelPreset getLeadingTitleControl500() {
        return leadingTitleControl500;
    }
}
