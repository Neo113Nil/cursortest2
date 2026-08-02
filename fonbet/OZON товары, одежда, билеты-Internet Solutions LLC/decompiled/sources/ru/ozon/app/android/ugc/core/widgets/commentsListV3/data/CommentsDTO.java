package ru.ozon.app.android.ugc.core.widgets.commentsListV3.data;

import An.C2439a;
import Bi.b;
import C.o0;
import Kk.C3532b;
import Pk0.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO;", "", "commentUuid", "", "comments", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCommentUuid", "()Ljava/lang/String;", "getComments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CommentDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentsDTO {
    public static final int $stable = 8;
    private final String commentUuid;
    private final List<CommentDTO> comments;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001;B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0099\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO;", "", "commentUuid", "", "author", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author;", "answers", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "date", "isPublished", "", "answerButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "reportButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "reportedButton", "deleteButton", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/Map;)V", "getCommentUuid", "()Ljava/lang/String;", "getAuthor", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author;", "getAnswers", "()Ljava/util/List;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "()Z", "getAnswerButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getReportButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getReportedButton", "getDeleteButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "Author", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CommentDTO {
        public static final int $stable = 8;
        private final ButtonV3DTO answerButton;
        private final List<CommentDTO> answers;

        @NotNull
        private final Author author;

        @NotNull
        private final String commentUuid;
        private final TextDTO date;
        private final IconButtonV3DTO deleteButton;
        private final boolean isPublished;
        private final IconButtonV3DTO reportButton;
        private final IconButtonV3DTO reportedButton;
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author;", "", "socialHeader", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$SocialHeader;", "confirmedIndicator", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$SocialHeader;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;)V", "getSocialHeader", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$SocialHeader;", "getConfirmedIndicator", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SocialHeader", "ConfirmedIndicator", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Author {
            public static final int $stable = CellDTO.$stable;
            private final ConfirmedIndicator confirmedIndicator;

            @NotNull
            private final SocialHeader socialHeader;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$ConfirmedIndicator;", "", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "fillColor", "", "borderColor", "<init>", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Ljava/lang/String;)V", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getFillColor", "()Ljava/lang/String;", "getBorderColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ConfirmedIndicator {
                public static final int $stable = 0;
                private final String borderColor;
                private final String fillColor;

                @NotNull
                private final IndicatorDTO indicator;

                public ConfirmedIndicator(@NotNull IndicatorDTO indicator, String str, String str2) {
                    Intrinsics.checkNotNullParameter(indicator, "indicator");
                    this.indicator = indicator;
                    this.fillColor = str;
                    this.borderColor = str2;
                }

                public static /* synthetic */ ConfirmedIndicator copy$default(ConfirmedIndicator confirmedIndicator, IndicatorDTO indicatorDTO, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        indicatorDTO = confirmedIndicator.indicator;
                    }
                    if ((i11 & 2) != 0) {
                        str = confirmedIndicator.fillColor;
                    }
                    if ((i11 & 4) != 0) {
                        str2 = confirmedIndicator.borderColor;
                    }
                    return confirmedIndicator.copy(indicatorDTO, str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final IndicatorDTO getIndicator() {
                    return this.indicator;
                }

                /* renamed from: component2, reason: from getter */
                public final String getFillColor() {
                    return this.fillColor;
                }

                /* renamed from: component3, reason: from getter */
                public final String getBorderColor() {
                    return this.borderColor;
                }

                @NotNull
                public final ConfirmedIndicator copy(@NotNull IndicatorDTO indicator, String fillColor, String borderColor) {
                    Intrinsics.checkNotNullParameter(indicator, "indicator");
                    return new ConfirmedIndicator(indicator, fillColor, borderColor);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ConfirmedIndicator)) {
                        return false;
                    }
                    ConfirmedIndicator confirmedIndicator = (ConfirmedIndicator) other;
                    return Intrinsics.d(this.indicator, confirmedIndicator.indicator) && Intrinsics.d(this.fillColor, confirmedIndicator.fillColor) && Intrinsics.d(this.borderColor, confirmedIndicator.borderColor);
                }

                public final String getBorderColor() {
                    return this.borderColor;
                }

                public final String getFillColor() {
                    return this.fillColor;
                }

                @NotNull
                public final IndicatorDTO getIndicator() {
                    return this.indicator;
                }

                public int hashCode() {
                    int hashCode = this.indicator.hashCode() * 31;
                    String str = this.fillColor;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.borderColor;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    IndicatorDTO indicatorDTO = this.indicator;
                    String str = this.fillColor;
                    String str2 = this.borderColor;
                    StringBuilder sb2 = new StringBuilder("ConfirmedIndicator(indicator=");
                    sb2.append(indicatorDTO);
                    sb2.append(", fillColor=");
                    sb2.append(str);
                    sb2.append(", borderColor=");
                    return o0.c(sb2, str2, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/data/CommentsDTO$CommentDTO$Author$SocialHeader;", "", "subscribe", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribed", "isSubscribed", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SocialHeader {
                public static final int $stable = CellDTO.$stable;
                private final boolean isSubscribed;

                @NotNull
                private final CellDTO subscribe;

                @NotNull
                private final CellDTO subscribed;

                public SocialHeader(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11) {
                    Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                    Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                    this.subscribe = subscribe;
                    this.subscribed = subscribed;
                    this.isSubscribed = z11;
                }

                public static /* synthetic */ SocialHeader copy$default(SocialHeader socialHeader, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        cellDTO = socialHeader.subscribe;
                    }
                    if ((i11 & 2) != 0) {
                        cellDTO2 = socialHeader.subscribed;
                    }
                    if ((i11 & 4) != 0) {
                        z11 = socialHeader.isSubscribed;
                    }
                    return socialHeader.copy(cellDTO, cellDTO2, z11);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final CellDTO getSubscribe() {
                    return this.subscribe;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final CellDTO getSubscribed() {
                    return this.subscribed;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getIsSubscribed() {
                    return this.isSubscribed;
                }

                @NotNull
                public final SocialHeader copy(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean isSubscribed) {
                    Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                    Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                    return new SocialHeader(subscribe, subscribed, isSubscribed);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SocialHeader)) {
                        return false;
                    }
                    SocialHeader socialHeader = (SocialHeader) other;
                    return Intrinsics.d(this.subscribe, socialHeader.subscribe) && Intrinsics.d(this.subscribed, socialHeader.subscribed) && this.isSubscribed == socialHeader.isSubscribed;
                }

                @NotNull
                public final CellDTO getSubscribe() {
                    return this.subscribe;
                }

                @NotNull
                public final CellDTO getSubscribed() {
                    return this.subscribed;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.isSubscribed) + b.c(this.subscribed, this.subscribe.hashCode() * 31, 31);
                }

                public final boolean isSubscribed() {
                    return this.isSubscribed;
                }

                @NotNull
                public String toString() {
                    CellDTO cellDTO = this.subscribe;
                    CellDTO cellDTO2 = this.subscribed;
                    boolean z11 = this.isSubscribed;
                    StringBuilder sb2 = new StringBuilder("SocialHeader(subscribe=");
                    sb2.append(cellDTO);
                    sb2.append(", subscribed=");
                    sb2.append(cellDTO2);
                    sb2.append(", isSubscribed=");
                    return a.a(")", sb2, z11);
                }
            }

            public Author(@NotNull SocialHeader socialHeader, ConfirmedIndicator confirmedIndicator) {
                Intrinsics.checkNotNullParameter(socialHeader, "socialHeader");
                this.socialHeader = socialHeader;
                this.confirmedIndicator = confirmedIndicator;
            }

            public static /* synthetic */ Author copy$default(Author author, SocialHeader socialHeader, ConfirmedIndicator confirmedIndicator, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    socialHeader = author.socialHeader;
                }
                if ((i11 & 2) != 0) {
                    confirmedIndicator = author.confirmedIndicator;
                }
                return author.copy(socialHeader, confirmedIndicator);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final SocialHeader getSocialHeader() {
                return this.socialHeader;
            }

            /* renamed from: component2, reason: from getter */
            public final ConfirmedIndicator getConfirmedIndicator() {
                return this.confirmedIndicator;
            }

            @NotNull
            public final Author copy(@NotNull SocialHeader socialHeader, ConfirmedIndicator confirmedIndicator) {
                Intrinsics.checkNotNullParameter(socialHeader, "socialHeader");
                return new Author(socialHeader, confirmedIndicator);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Author)) {
                    return false;
                }
                Author author = (Author) other;
                return Intrinsics.d(this.socialHeader, author.socialHeader) && Intrinsics.d(this.confirmedIndicator, author.confirmedIndicator);
            }

            public final ConfirmedIndicator getConfirmedIndicator() {
                return this.confirmedIndicator;
            }

            @NotNull
            public final SocialHeader getSocialHeader() {
                return this.socialHeader;
            }

            public int hashCode() {
                int hashCode = this.socialHeader.hashCode() * 31;
                ConfirmedIndicator confirmedIndicator = this.confirmedIndicator;
                return hashCode + (confirmedIndicator == null ? 0 : confirmedIndicator.hashCode());
            }

            @NotNull
            public String toString() {
                return "Author(socialHeader=" + this.socialHeader + ", confirmedIndicator=" + this.confirmedIndicator + ")";
            }
        }

        public CommentDTO(@NotNull String commentUuid, @NotNull Author author, List<CommentDTO> list, TextDTO textDTO, TextDTO textDTO2, boolean z11, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(commentUuid, "commentUuid");
            Intrinsics.checkNotNullParameter(author, "author");
            this.commentUuid = commentUuid;
            this.author = author;
            this.answers = list;
            this.text = textDTO;
            this.date = textDTO2;
            this.isPublished = z11;
            this.answerButton = buttonV3DTO;
            this.reportButton = iconButtonV3DTO;
            this.reportedButton = iconButtonV3DTO2;
            this.deleteButton = iconButtonV3DTO3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CommentDTO copy$default(CommentDTO commentDTO, String str, Author author, List list, TextDTO textDTO, TextDTO textDTO2, boolean z11, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = commentDTO.commentUuid;
            }
            if ((i11 & 2) != 0) {
                author = commentDTO.author;
            }
            if ((i11 & 4) != 0) {
                list = commentDTO.answers;
            }
            if ((i11 & 8) != 0) {
                textDTO = commentDTO.text;
            }
            if ((i11 & 16) != 0) {
                textDTO2 = commentDTO.date;
            }
            if ((i11 & 32) != 0) {
                z11 = commentDTO.isPublished;
            }
            if ((i11 & 64) != 0) {
                buttonV3DTO = commentDTO.answerButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                iconButtonV3DTO = commentDTO.reportButton;
            }
            if ((i11 & 256) != 0) {
                iconButtonV3DTO2 = commentDTO.reportedButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                iconButtonV3DTO3 = commentDTO.deleteButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                map = commentDTO.trackingInfo;
            }
            IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO3;
            Map map2 = map;
            IconButtonV3DTO iconButtonV3DTO5 = iconButtonV3DTO;
            IconButtonV3DTO iconButtonV3DTO6 = iconButtonV3DTO2;
            boolean z12 = z11;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            TextDTO textDTO3 = textDTO2;
            List list2 = list;
            return commentDTO.copy(str, author, list2, textDTO, textDTO3, z12, buttonV3DTO2, iconButtonV3DTO5, iconButtonV3DTO6, iconButtonV3DTO4, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCommentUuid() {
            return this.commentUuid;
        }

        /* renamed from: component10, reason: from getter */
        public final IconButtonV3DTO getDeleteButton() {
            return this.deleteButton;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Author getAuthor() {
            return this.author;
        }

        public final List<CommentDTO> component3() {
            return this.answers;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final TextDTO getDate() {
            return this.date;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsPublished() {
            return this.isPublished;
        }

        /* renamed from: component7, reason: from getter */
        public final ButtonV3DTO getAnswerButton() {
            return this.answerButton;
        }

        /* renamed from: component8, reason: from getter */
        public final IconButtonV3DTO getReportButton() {
            return this.reportButton;
        }

        /* renamed from: component9, reason: from getter */
        public final IconButtonV3DTO getReportedButton() {
            return this.reportedButton;
        }

        @NotNull
        public final CommentDTO copy(@NotNull String commentUuid, @NotNull Author author, List<CommentDTO> answers, TextDTO text, TextDTO date, boolean isPublished, ButtonV3DTO answerButton, IconButtonV3DTO reportButton, IconButtonV3DTO reportedButton, IconButtonV3DTO deleteButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(commentUuid, "commentUuid");
            Intrinsics.checkNotNullParameter(author, "author");
            return new CommentDTO(commentUuid, author, answers, text, date, isPublished, answerButton, reportButton, reportedButton, deleteButton, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentDTO)) {
                return false;
            }
            CommentDTO commentDTO = (CommentDTO) other;
            return Intrinsics.d(this.commentUuid, commentDTO.commentUuid) && Intrinsics.d(this.author, commentDTO.author) && Intrinsics.d(this.answers, commentDTO.answers) && Intrinsics.d(this.text, commentDTO.text) && Intrinsics.d(this.date, commentDTO.date) && this.isPublished == commentDTO.isPublished && Intrinsics.d(this.answerButton, commentDTO.answerButton) && Intrinsics.d(this.reportButton, commentDTO.reportButton) && Intrinsics.d(this.reportedButton, commentDTO.reportedButton) && Intrinsics.d(this.deleteButton, commentDTO.deleteButton) && Intrinsics.d(this.trackingInfo, commentDTO.trackingInfo);
        }

        public final ButtonV3DTO getAnswerButton() {
            return this.answerButton;
        }

        public final List<CommentDTO> getAnswers() {
            return this.answers;
        }

        @NotNull
        public final Author getAuthor() {
            return this.author;
        }

        @NotNull
        public final String getCommentUuid() {
            return this.commentUuid;
        }

        public final TextDTO getDate() {
            return this.date;
        }

        public final IconButtonV3DTO getDeleteButton() {
            return this.deleteButton;
        }

        public final IconButtonV3DTO getReportButton() {
            return this.reportButton;
        }

        public final IconButtonV3DTO getReportedButton() {
            return this.reportedButton;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.author.hashCode() + (this.commentUuid.hashCode() * 31)) * 31;
            List<CommentDTO> list = this.answers;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            TextDTO textDTO = this.text;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.date;
            int a11 = C3532b.a((hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.isPublished);
            ButtonV3DTO buttonV3DTO = this.answerButton;
            int hashCode4 = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.reportButton;
            int hashCode5 = (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO2 = this.reportedButton;
            int hashCode6 = (hashCode5 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO3 = this.deleteButton;
            int hashCode7 = (hashCode6 + (iconButtonV3DTO3 == null ? 0 : iconButtonV3DTO3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isPublished() {
            return this.isPublished;
        }

        @NotNull
        public String toString() {
            String str = this.commentUuid;
            Author author = this.author;
            List<CommentDTO> list = this.answers;
            TextDTO textDTO = this.text;
            TextDTO textDTO2 = this.date;
            boolean z11 = this.isPublished;
            ButtonV3DTO buttonV3DTO = this.answerButton;
            IconButtonV3DTO iconButtonV3DTO = this.reportButton;
            IconButtonV3DTO iconButtonV3DTO2 = this.reportedButton;
            IconButtonV3DTO iconButtonV3DTO3 = this.deleteButton;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CommentDTO(commentUuid=");
            sb2.append(str);
            sb2.append(", author=");
            sb2.append(author);
            sb2.append(", answers=");
            sb2.append(list);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", date=");
            sb2.append(textDTO2);
            sb2.append(", isPublished=");
            sb2.append(z11);
            sb2.append(", answerButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", reportButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", reportedButton=");
            sb2.append(iconButtonV3DTO2);
            sb2.append(", deleteButton=");
            sb2.append(iconButtonV3DTO3);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public CommentsDTO(String str, List<CommentDTO> list) {
        this.commentUuid = str;
        this.comments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommentsDTO copy$default(CommentsDTO commentsDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = commentsDTO.commentUuid;
        }
        if ((i11 & 2) != 0) {
            list = commentsDTO.comments;
        }
        return commentsDTO.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCommentUuid() {
        return this.commentUuid;
    }

    public final List<CommentDTO> component2() {
        return this.comments;
    }

    @NotNull
    public final CommentsDTO copy(String commentUuid, List<CommentDTO> comments) {
        return new CommentsDTO(commentUuid, comments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentsDTO)) {
            return false;
        }
        CommentsDTO commentsDTO = (CommentsDTO) other;
        return Intrinsics.d(this.commentUuid, commentsDTO.commentUuid) && Intrinsics.d(this.comments, commentsDTO.comments);
    }

    public final String getCommentUuid() {
        return this.commentUuid;
    }

    public final List<CommentDTO> getComments() {
        return this.comments;
    }

    public int hashCode() {
        String str = this.commentUuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CommentDTO> list = this.comments;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return C2439a.a("CommentsDTO(commentUuid=", this.commentUuid, ", comments=", ")", this.comments);
    }
}
