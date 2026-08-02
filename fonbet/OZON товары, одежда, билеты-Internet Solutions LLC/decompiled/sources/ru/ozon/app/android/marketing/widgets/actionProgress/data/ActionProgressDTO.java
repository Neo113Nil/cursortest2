package ru.ozon.app.android.marketing.widgets.actionProgress.data;

import B90.C2619v;
import HY.a;
import I0.C3173b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsWrapperProgressText;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "progressText", "progress", "Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO$Progress;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO$Progress;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProgressText", "getProgress", "()Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO$Progress;", "getSubtitle", "currentMiniWidget", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "setCurrentMiniWidget", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "miniProgressText", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "getMiniProgressText", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;", "setMiniProgressText", "(Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsWrapperProgressText;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Progress", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActionProgressDTO {
    public static final int $stable = 8;
    private HighlightsCurrentMiniWidget currentMiniWidget;
    private HighlightsWrapperProgressText miniProgressText;

    @NotNull
    private final Progress progress;

    @NotNull
    private final TextAtom progressText;
    private final TextAtom subtitle;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO$Progress;", "", "percent", "", "colorStart", "", "colorEnd", "backgroundColor", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPercent", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getColorStart", "()Ljava/lang/String;", "getColorEnd", "getBackgroundColor", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/marketing/widgets/actionProgress/data/ActionProgressDTO$Progress;", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String colorEnd;
        private final String colorStart;
        private final Long percent;

        public Progress(Long l11, String str, String str2, String str3) {
            this.percent = l11;
            this.colorStart = str;
            this.colorEnd = str2;
            this.backgroundColor = str3;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, Long l11, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = progress.percent;
            }
            if ((i11 & 2) != 0) {
                str = progress.colorStart;
            }
            if ((i11 & 4) != 0) {
                str2 = progress.colorEnd;
            }
            if ((i11 & 8) != 0) {
                str3 = progress.backgroundColor;
            }
            return progress.copy(l11, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getPercent() {
            return this.percent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColorStart() {
            return this.colorStart;
        }

        /* renamed from: component3, reason: from getter */
        public final String getColorEnd() {
            return this.colorEnd;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Progress copy(Long percent, String colorStart, String colorEnd, String backgroundColor) {
            return new Progress(percent, colorStart, colorEnd, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Intrinsics.d(this.percent, progress.percent) && Intrinsics.d(this.colorStart, progress.colorStart) && Intrinsics.d(this.colorEnd, progress.colorEnd) && Intrinsics.d(this.backgroundColor, progress.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getColorEnd() {
            return this.colorEnd;
        }

        public final String getColorStart() {
            return this.colorStart;
        }

        public final Long getPercent() {
            return this.percent;
        }

        public int hashCode() {
            Long l11 = this.percent;
            int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
            String str = this.colorStart;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.colorEnd;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.backgroundColor;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Long l11 = this.percent;
            String str = this.colorStart;
            String str2 = this.colorEnd;
            String str3 = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("Progress(percent=");
            sb2.append(l11);
            sb2.append(", colorStart=");
            sb2.append(str);
            sb2.append(", colorEnd=");
            return C3173b.c(sb2, str2, ", backgroundColor=", str3, ")");
        }
    }

    public ActionProgressDTO(TextAtom textAtom, @NotNull TextAtom progressText, @NotNull Progress progress, TextAtom textAtom2) {
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.title = textAtom;
        this.progressText = progressText;
        this.progress = progress;
        this.subtitle = textAtom2;
    }

    public static /* synthetic */ ActionProgressDTO copy$default(ActionProgressDTO actionProgressDTO, TextAtom textAtom, TextAtom textAtom2, Progress progress, TextAtom textAtom3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = actionProgressDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = actionProgressDTO.progressText;
        }
        if ((i11 & 4) != 0) {
            progress = actionProgressDTO.progress;
        }
        if ((i11 & 8) != 0) {
            textAtom3 = actionProgressDTO.subtitle;
        }
        return actionProgressDTO.copy(textAtom, textAtom2, progress, textAtom3);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getProgressText() {
        return this.progressText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Progress getProgress() {
        return this.progress;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final ActionProgressDTO copy(TextAtom title, @NotNull TextAtom progressText, @NotNull Progress progress, TextAtom subtitle) {
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new ActionProgressDTO(title, progressText, progress, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProgressDTO)) {
            return false;
        }
        ActionProgressDTO actionProgressDTO = (ActionProgressDTO) other;
        return Intrinsics.d(this.title, actionProgressDTO.title) && Intrinsics.d(this.progressText, actionProgressDTO.progressText) && Intrinsics.d(this.progress, actionProgressDTO.progress) && Intrinsics.d(this.subtitle, actionProgressDTO.subtitle);
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    public final HighlightsWrapperProgressText getMiniProgressText() {
        return this.miniProgressText;
    }

    @NotNull
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final TextAtom getProgressText() {
        return this.progressText;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (this.progress.hashCode() + C2619v.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.progressText)) * 31;
        TextAtom textAtom2 = this.subtitle;
        return hashCode + (textAtom2 != null ? textAtom2.hashCode() : 0);
    }

    public final void setCurrentMiniWidget(HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    public final void setMiniProgressText(HighlightsWrapperProgressText highlightsWrapperProgressText) {
        this.miniProgressText = highlightsWrapperProgressText;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.progressText;
        Progress progress = this.progress;
        TextAtom textAtom3 = this.subtitle;
        StringBuilder a11 = a.a("ActionProgressDTO(title=", textAtom, ", progressText=", textAtom2, ", progress=");
        a11.append(progress);
        a11.append(", subtitle=");
        a11.append(textAtom3);
        a11.append(")");
        return a11.toString();
    }
}
