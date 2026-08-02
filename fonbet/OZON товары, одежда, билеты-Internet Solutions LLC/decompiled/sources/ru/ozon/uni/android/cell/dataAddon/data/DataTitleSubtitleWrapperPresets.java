package ru.ozon.uni.android.cell.dataAddon.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPresets;", "", "<init>", "()V", "data500CenterEnd500Control500Control500", "Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "getData500CenterEnd500Control500Control500", "()Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "data500CenterEnd500Control600Control500", "getData500CenterEnd500Control600Control500", "data600centerEnd500Control800Control500", "getData600centerEnd500Control800Control500", "data500CenterEnd500LeadingControl500Control500", "getData500CenterEnd500LeadingControl500Control500", "data500CenterEnd500LeadingControl600Control500", "getData500CenterEnd500LeadingControl600Control500", "data600CenterEnd500LeadingControl800Control500", "getData600CenterEnd500LeadingControl800Control500", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataTitleSubtitleWrapperPresets {

    @NotNull
    public static final DataTitleSubtitleWrapperPresets INSTANCE = new DataTitleSubtitleWrapperPresets();

    @NotNull
    private static final DataTitleSubtitleWrapperPreset data500CenterEnd500Control500Control500;

    @NotNull
    private static final DataTitleSubtitleWrapperPreset data500CenterEnd500Control600Control500;

    @NotNull
    private static final DataTitleSubtitleWrapperPreset data500CenterEnd500LeadingControl500Control500;

    @NotNull
    private static final DataTitleSubtitleWrapperPreset data500CenterEnd500LeadingControl600Control500;

    @NotNull
    private static final DataTitleSubtitleWrapperPreset data600CenterEnd500LeadingControl800Control500;

    @NotNull
    private static final DataTitleSubtitleWrapperPreset data600centerEnd500Control800Control500;

    static {
        DataAddonWrapperPresets dataAddonWrapperPresets = DataAddonWrapperPresets.INSTANCE;
        DataAddonWrapperPreset data500CenterEnd500 = dataAddonWrapperPresets.getData500CenterEnd500();
        TitleSubtitleWrapperPresets titleSubtitleWrapperPresets = TitleSubtitleWrapperPresets.INSTANCE;
        data500CenterEnd500Control500Control500 = new DataTitleSubtitleWrapperPreset(data500CenterEnd500, titleSubtitleWrapperPresets.getControl500Control500$uni_release());
        data500CenterEnd500Control600Control500 = new DataTitleSubtitleWrapperPreset(dataAddonWrapperPresets.getData500CenterEnd500(), titleSubtitleWrapperPresets.getControl600Control500$uni_release());
        data600centerEnd500Control800Control500 = new DataTitleSubtitleWrapperPreset(dataAddonWrapperPresets.getData600CenterEnd500(), titleSubtitleWrapperPresets.getControl800Control500$uni_release());
        data500CenterEnd500LeadingControl500Control500 = new DataTitleSubtitleWrapperPreset(dataAddonWrapperPresets.getData500CenterEnd500(), titleSubtitleWrapperPresets.getLeadingControl500Control500$uni_release());
        data500CenterEnd500LeadingControl600Control500 = new DataTitleSubtitleWrapperPreset(dataAddonWrapperPresets.getData500CenterEnd500(), titleSubtitleWrapperPresets.getLeadingControl600Control500$uni_release());
        data600CenterEnd500LeadingControl800Control500 = new DataTitleSubtitleWrapperPreset(dataAddonWrapperPresets.getData600CenterEnd500(), titleSubtitleWrapperPresets.getLeadingControl800Control500$uni_release());
    }

    private DataTitleSubtitleWrapperPresets() {
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getData500CenterEnd500Control500Control500() {
        return data500CenterEnd500Control500Control500;
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getData500CenterEnd500Control600Control500() {
        return data500CenterEnd500Control600Control500;
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getData500CenterEnd500LeadingControl500Control500() {
        return data500CenterEnd500LeadingControl500Control500;
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getData500CenterEnd500LeadingControl600Control500() {
        return data500CenterEnd500LeadingControl600Control500;
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getData600CenterEnd500LeadingControl800Control500() {
        return data600CenterEnd500LeadingControl800Control500;
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getData600centerEnd500Control800Control500() {
        return data600centerEnd500Control800Control500;
    }
}
