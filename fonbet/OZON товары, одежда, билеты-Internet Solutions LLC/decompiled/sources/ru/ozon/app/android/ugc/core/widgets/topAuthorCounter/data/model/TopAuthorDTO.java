package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model;

import Ak.C2436a;
import B0.C2454a;
import D40.a;
import H3.c;
import N3.C3660k;
import Ns.b;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002)*BU\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO;", "", "content", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", "topGradientColor", "", "backgroundColor", "paddings", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getContent", "()Ljava/util/List;", "getTopGradientColor", "()Ljava/lang/String;", "getBackgroundColor", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "TopAuthorContent", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TopAuthorDTO {

    @NotNull
    public static final String INITIAL_TOP_AUTHOR_FIELD_NAME = "initialTopAuthor";

    @NotNull
    public static final String INITIAL_TOP_AUTHOR_NAME = "CONTENT_TYPE_INITIAL_TOP_AUTHOR";

    @NotNull
    public static final String SCORES_FIELD_NAME = "scores";

    @NotNull
    public static final String SCORES_NAME = "CONTENT_TYPE_SCORES";

    @NotNull
    public static final String SEPARATOR_FIELD_NAME = "separator";

    @NotNull
    public static final String SEPARATOR_NAME = "CONTENT_TYPE_SEPARATOR";

    @NotNull
    public static final String TOP_AUTHOR_FIELD_NAME = "topAuthor";

    @NotNull
    public static final String TOP_AUTHOR_NAME = "CONTENT_TYPE_TOP_AUTHOR";

    @NotNull
    public static final String TYPE = "type";
    private final AtomActionDTO action;
    private final String backgroundColor;

    @NotNull
    private final List<TopAuthorContent> content;
    private final TopAuthorPaddings paddings;
    private final String topGradientColor;
    private final Map<String, TokenizedTrackingInfo> tracking;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", "", "<init>", "()V", "InitialTopAuthor", "TopAuthor", "Scores", "Separator", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$InitialTopAuthor;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$Scores;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$Separator;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$TopAuthor;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TopAuthorContent {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$InitialTopAuthor;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", "topAuthorCells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundGradient", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTopAuthorCells", "()Ljava/util/List;", "getBackgroundGradient", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InitialTopAuthor extends TopAuthorContent {
            public static final int $stable = 8;
            private final List<String> backgroundGradient;

            @NotNull
            private final List<CellDTO> topAuthorCells;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitialTopAuthor(@NotNull List<CellDTO> topAuthorCells, List<String> list) {
                super(null);
                Intrinsics.checkNotNullParameter(topAuthorCells, "topAuthorCells");
                this.topAuthorCells = topAuthorCells;
                this.backgroundGradient = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitialTopAuthor copy$default(InitialTopAuthor initialTopAuthor, List list, List list2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = initialTopAuthor.topAuthorCells;
                }
                if ((i11 & 2) != 0) {
                    list2 = initialTopAuthor.backgroundGradient;
                }
                return initialTopAuthor.copy(list, list2);
            }

            @NotNull
            public final List<CellDTO> component1() {
                return this.topAuthorCells;
            }

            public final List<String> component2() {
                return this.backgroundGradient;
            }

            @NotNull
            public final InitialTopAuthor copy(@NotNull List<CellDTO> topAuthorCells, List<String> backgroundGradient) {
                Intrinsics.checkNotNullParameter(topAuthorCells, "topAuthorCells");
                return new InitialTopAuthor(topAuthorCells, backgroundGradient);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitialTopAuthor)) {
                    return false;
                }
                InitialTopAuthor initialTopAuthor = (InitialTopAuthor) other;
                return Intrinsics.d(this.topAuthorCells, initialTopAuthor.topAuthorCells) && Intrinsics.d(this.backgroundGradient, initialTopAuthor.backgroundGradient);
            }

            public final List<String> getBackgroundGradient() {
                return this.backgroundGradient;
            }

            @NotNull
            public final List<CellDTO> getTopAuthorCells() {
                return this.topAuthorCells;
            }

            public int hashCode() {
                int hashCode = this.topAuthorCells.hashCode() * 31;
                List<String> list = this.backgroundGradient;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                return C2436a.b("InitialTopAuthor(topAuthorCells=", this.topAuthorCells, ", backgroundGradient=", ")", this.backgroundGradient);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$Scores;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", "items", "", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$Scores$Score;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Score", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Scores extends TopAuthorContent {
            public static final int $stable = 8;

            @NotNull
            private final List<Score> items;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$Scores$Score;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Score {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final IconDTO icon;

                @NotNull
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                public Score(@NotNull IconDTO icon, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    this.icon = icon;
                    this.title = title;
                    this.subtitle = subtitle;
                }

                public static /* synthetic */ Score copy$default(Score score, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        iconDTO = score.icon;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = score.title;
                    }
                    if ((i11 & 4) != 0) {
                        textDTO2 = score.subtitle;
                    }
                    return score.copy(iconDTO, textDTO, textDTO2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final Score copy(@NotNull IconDTO icon, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                    return new Score(icon, title, subtitle);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Score)) {
                        return false;
                    }
                    Score score = (Score) other;
                    return Intrinsics.d(this.icon, score.icon) && Intrinsics.d(this.title, score.title) && Intrinsics.d(this.subtitle, score.subtitle);
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.subtitle.hashCode() + b.a(this.title, this.icon.hashCode() * 31, 31);
                }

                @NotNull
                public String toString() {
                    IconDTO iconDTO = this.icon;
                    TextDTO textDTO = this.title;
                    return Tl.b.e(Bi.b.i("Score(icon=", ", title=", ", subtitle=", iconDTO, textDTO), this.subtitle, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Scores(@NotNull List<Score> items) {
                super(null);
                Intrinsics.checkNotNullParameter(items, "items");
                this.items = items;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Scores copy$default(Scores scores, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = scores.items;
                }
                return scores.copy(list);
            }

            @NotNull
            public final List<Score> component1() {
                return this.items;
            }

            @NotNull
            public final Scores copy(@NotNull List<Score> items) {
                Intrinsics.checkNotNullParameter(items, "items");
                return new Scores(items);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Scores) && Intrinsics.d(this.items, ((Scores) other).items);
            }

            @NotNull
            public final List<Score> getItems() {
                return this.items;
            }

            public int hashCode() {
                return this.items.hashCode();
            }

            @NotNull
            public String toString() {
                return c.a("Scores(items=", ")", this.items);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$Separator;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", "backgroundColor", "", "height", "", "paddings", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;)V", "getBackgroundColor", "()Ljava/lang/String;", "getHeight", "()I", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator extends TopAuthorContent {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final int height;
            private final TopAuthorPaddings paddings;

            public Separator(String str, int i11, TopAuthorPaddings topAuthorPaddings) {
                super(null);
                this.backgroundColor = str;
                this.height = i11;
                this.paddings = topAuthorPaddings;
            }

            public static /* synthetic */ Separator copy$default(Separator separator, String str, int i11, TopAuthorPaddings topAuthorPaddings, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = separator.backgroundColor;
                }
                if ((i12 & 2) != 0) {
                    i11 = separator.height;
                }
                if ((i12 & 4) != 0) {
                    topAuthorPaddings = separator.paddings;
                }
                return separator.copy(str, i11, topAuthorPaddings);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            /* renamed from: component3, reason: from getter */
            public final TopAuthorPaddings getPaddings() {
                return this.paddings;
            }

            @NotNull
            public final Separator copy(String backgroundColor, int height, TopAuthorPaddings paddings) {
                return new Separator(backgroundColor, height, paddings);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Separator)) {
                    return false;
                }
                Separator separator = (Separator) other;
                return Intrinsics.d(this.backgroundColor, separator.backgroundColor) && this.height == separator.height && Intrinsics.d(this.paddings, separator.paddings);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getHeight() {
                return this.height;
            }

            public final TopAuthorPaddings getPaddings() {
                return this.paddings;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int a11 = C2454a.a(this.height, (str == null ? 0 : str.hashCode()) * 31, 31);
                TopAuthorPaddings topAuthorPaddings = this.paddings;
                return a11 + (topAuthorPaddings != null ? topAuthorPaddings.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                int i11 = this.height;
                TopAuthorPaddings topAuthorPaddings = this.paddings;
                StringBuilder c11 = C3660k.c(i11, "Separator(backgroundColor=", str, ", height=", ", paddings=");
                c11.append(topAuthorPaddings);
                c11.append(")");
                return c11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent$TopAuthor;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO$TopAuthorContent;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TopAuthor extends TopAuthorContent {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO cell;

            @NotNull
            private final TextDTO title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopAuthor(@NotNull TextDTO title, @NotNull CellDTO cell) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.title = title;
                this.cell = cell;
            }

            public static /* synthetic */ TopAuthor copy$default(TopAuthor topAuthor, TextDTO textDTO, CellDTO cellDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = topAuthor.title;
                }
                if ((i11 & 2) != 0) {
                    cellDTO = topAuthor.cell;
                }
                return topAuthor.copy(textDTO, cellDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CellDTO getCell() {
                return this.cell;
            }

            @NotNull
            public final TopAuthor copy(@NotNull TextDTO title, @NotNull CellDTO cell) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new TopAuthor(title, cell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TopAuthor)) {
                    return false;
                }
                TopAuthor topAuthor = (TopAuthor) other;
                return Intrinsics.d(this.title, topAuthor.title) && Intrinsics.d(this.cell, topAuthor.cell);
            }

            @NotNull
            public final CellDTO getCell() {
                return this.cell;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.cell.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "TopAuthor(title=" + this.title + ", cell=" + this.cell + ")";
            }
        }

        public /* synthetic */ TopAuthorContent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TopAuthorContent() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopAuthorDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "initialTopAuthor", name = "CONTENT_TYPE_INITIAL_TOP_AUTHOR", type = TopAuthorContent.InitialTopAuthor.class), @ProtoOneOfSignature(fieldName = "topAuthor", name = "CONTENT_TYPE_TOP_AUTHOR", type = TopAuthorContent.TopAuthor.class), @ProtoOneOfSignature(fieldName = "scores", name = "CONTENT_TYPE_SCORES", type = TopAuthorContent.Scores.class), @ProtoOneOfSignature(fieldName = "separator", name = "CONTENT_TYPE_SEPARATOR", type = TopAuthorContent.Separator.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TopAuthorContent> content, String str, String str2, TopAuthorPaddings topAuthorPaddings, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.topGradientColor = str;
        this.backgroundColor = str2;
        this.paddings = topAuthorPaddings;
        this.action = atomActionDTO;
        this.tracking = map;
    }

    public static /* synthetic */ TopAuthorDTO copy$default(TopAuthorDTO topAuthorDTO, List list, String str, String str2, TopAuthorPaddings topAuthorPaddings, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = topAuthorDTO.content;
        }
        if ((i11 & 2) != 0) {
            str = topAuthorDTO.topGradientColor;
        }
        if ((i11 & 4) != 0) {
            str2 = topAuthorDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            topAuthorPaddings = topAuthorDTO.paddings;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = topAuthorDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = topAuthorDTO.tracking;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return topAuthorDTO.copy(list, str, str2, topAuthorPaddings, atomActionDTO2, map2);
    }

    @NotNull
    public final List<TopAuthorContent> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopGradientColor() {
        return this.topGradientColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final TopAuthorPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.tracking;
    }

    @NotNull
    public final TopAuthorDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(fieldName = "initialTopAuthor", name = "CONTENT_TYPE_INITIAL_TOP_AUTHOR", type = TopAuthorContent.InitialTopAuthor.class), @ProtoOneOfSignature(fieldName = "topAuthor", name = "CONTENT_TYPE_TOP_AUTHOR", type = TopAuthorContent.TopAuthor.class), @ProtoOneOfSignature(fieldName = "scores", name = "CONTENT_TYPE_SCORES", type = TopAuthorContent.Scores.class), @ProtoOneOfSignature(fieldName = "separator", name = "CONTENT_TYPE_SEPARATOR", type = TopAuthorContent.Separator.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TopAuthorContent> content, String topGradientColor, String backgroundColor, TopAuthorPaddings paddings, AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new TopAuthorDTO(content, topGradientColor, backgroundColor, paddings, action, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAuthorDTO)) {
            return false;
        }
        TopAuthorDTO topAuthorDTO = (TopAuthorDTO) other;
        return Intrinsics.d(this.content, topAuthorDTO.content) && Intrinsics.d(this.topGradientColor, topAuthorDTO.topGradientColor) && Intrinsics.d(this.backgroundColor, topAuthorDTO.backgroundColor) && Intrinsics.d(this.paddings, topAuthorDTO.paddings) && Intrinsics.d(this.action, topAuthorDTO.action) && Intrinsics.d(this.tracking, topAuthorDTO.tracking);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<TopAuthorContent> getContent() {
        return this.content;
    }

    public final TopAuthorPaddings getPaddings() {
        return this.paddings;
    }

    public final String getTopGradientColor() {
        return this.topGradientColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        String str = this.topGradientColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TopAuthorPaddings topAuthorPaddings = this.paddings;
        int hashCode4 = (hashCode3 + (topAuthorPaddings == null ? 0 : topAuthorPaddings.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopAuthorContent> list = this.content;
        String str = this.topGradientColor;
        String str2 = this.backgroundColor;
        TopAuthorPaddings topAuthorPaddings = this.paddings;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder a11 = C4055a.a("TopAuthorDTO(content=", ", topGradientColor=", str, ", backgroundColor=", list);
        a11.append(str2);
        a11.append(", paddings=");
        a11.append(topAuthorPaddings);
        a11.append(", action=");
        return a.d(a11, atomActionDTO, ", tracking=", map, ")");
    }
}
