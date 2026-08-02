package ru.ozon.app.android.marketing.widgets.actionProgress.presentation;

import B90.C2619v;
import Bl.C2639a;
import I0.C3173b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b&\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "progressText", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;", "progress", "subtitle", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "currentMiniWidget", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)V", "copy", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;)Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProgressText", "Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;", "getProgress", "()Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;", "getSubtitle", "Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "getCurrentMiniWidget", "()Lru/ozon/app/android/marketing/widgets/highlightsWrapper/data/HighlightsCurrentMiniWidget;", "Progress", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActionProgressVO implements c {
    public static final int $stable = TextAtom.$stable;
    private final HighlightsCurrentMiniWidget currentMiniWidget;
    private final long id;

    @NotNull
    private final Progress progress;

    @NotNull
    private final TextAtom progressText;
    private final TextAtom subtitle;
    private final TextAtom title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/actionProgress/presentation/ActionProgressVO$Progress;", "", "", "percent", "", "colorStart", "colorEnd", "backgroundColor", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getPercent", "()Ljava/lang/Long;", "Ljava/lang/String;", "getColorStart", "getColorEnd", "getBackgroundColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Progress {
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

    public ActionProgressVO(long j11, TextAtom textAtom, @NotNull TextAtom progressText, @NotNull Progress progress, TextAtom textAtom2, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget) {
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.id = j11;
        this.title = textAtom;
        this.progressText = progressText;
        this.progress = progress;
        this.subtitle = textAtom2;
        this.currentMiniWidget = highlightsCurrentMiniWidget;
    }

    public static /* synthetic */ ActionProgressVO copy$default(ActionProgressVO actionProgressVO, long j11, TextAtom textAtom, TextAtom textAtom2, Progress progress, TextAtom textAtom3, HighlightsCurrentMiniWidget highlightsCurrentMiniWidget, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = actionProgressVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textAtom = actionProgressVO.title;
        }
        TextAtom textAtom4 = textAtom;
        if ((i11 & 4) != 0) {
            textAtom2 = actionProgressVO.progressText;
        }
        TextAtom textAtom5 = textAtom2;
        if ((i11 & 8) != 0) {
            progress = actionProgressVO.progress;
        }
        Progress progress2 = progress;
        if ((i11 & 16) != 0) {
            textAtom3 = actionProgressVO.subtitle;
        }
        TextAtom textAtom6 = textAtom3;
        if ((i11 & 32) != 0) {
            highlightsCurrentMiniWidget = actionProgressVO.currentMiniWidget;
        }
        return actionProgressVO.copy(j12, textAtom4, textAtom5, progress2, textAtom6, highlightsCurrentMiniWidget);
    }

    @NotNull
    public final ActionProgressVO copy(long id2, TextAtom title, @NotNull TextAtom progressText, @NotNull Progress progress, TextAtom subtitle, HighlightsCurrentMiniWidget currentMiniWidget) {
        Intrinsics.checkNotNullParameter(progressText, "progressText");
        Intrinsics.checkNotNullParameter(progress, "progress");
        return new ActionProgressVO(id2, title, progressText, progress, subtitle, currentMiniWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProgressVO)) {
            return false;
        }
        ActionProgressVO actionProgressVO = (ActionProgressVO) other;
        return this.id == actionProgressVO.id && Intrinsics.d(this.title, actionProgressVO.title) && Intrinsics.d(this.progressText, actionProgressVO.progressText) && Intrinsics.d(this.progress, actionProgressVO.progress) && Intrinsics.d(this.subtitle, actionProgressVO.subtitle) && this.currentMiniWidget == actionProgressVO.currentMiniWidget;
    }

    public final HighlightsCurrentMiniWidget getCurrentMiniWidget() {
        return this.currentMiniWidget;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Progress getProgress() {
        return this.progress;
    }

    @NotNull
    public final TextAtom getProgressText() {
        return this.progressText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (this.progress.hashCode() + C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.progressText)) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        return hashCode3 + (highlightsCurrentMiniWidget != null ? highlightsCurrentMiniWidget.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.progressText;
        Progress progress = this.progress;
        TextAtom textAtom3 = this.subtitle;
        HighlightsCurrentMiniWidget highlightsCurrentMiniWidget = this.currentMiniWidget;
        StringBuilder c11 = C2639a.c("ActionProgressVO(id=", j11, ", title=", textAtom);
        c11.append(", progressText=");
        c11.append(textAtom2);
        c11.append(", progress=");
        c11.append(progress);
        c11.append(", subtitle=");
        c11.append(textAtom3);
        c11.append(", currentMiniWidget=");
        c11.append(highlightsCurrentMiniWidget);
        c11.append(")");
        return c11.toString();
    }
}
