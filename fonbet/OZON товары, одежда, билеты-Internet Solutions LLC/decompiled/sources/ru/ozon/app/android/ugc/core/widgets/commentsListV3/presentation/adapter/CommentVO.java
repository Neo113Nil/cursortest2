package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter;

import Ak.C2436a;
import B3.p;
import Bi.b;
import C.o0;
import G.g;
import Kk.C3532b;
import Pk0.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b \b\u0081\b\u0018\u00002\u00020\u0001:\u0001OB«\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b%\u0010$JÔ\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010$J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u000100H\u0002¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b\f\u0010@R\u001a\u0010\r\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b\r\u0010@R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b\u000e\u0010@R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bA\u0010@R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bH\u0010GR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bI\u0010GR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\bJ\u0010@R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\b\u0017\u0010@R\u0017\u0010\u0018\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b\u0018\u0010@R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bN\u0010M¨\u0006P"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentsAdapterVO;", "", "widgetId", "", "uuid", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;", "author", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "date", "", "isPublished", "isNested", "isLastNested", "hasAnswers", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "answerButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "reportButton", "reportedButton", "deleteButton", "withSeparator", "isFirst", "isLast", "LWZ/t;", "deleteTokenizedEvent", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZZZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZZLWZ/t;LWZ/t;)V", "authorId", "sellerId", "isSubscribe", "updateSubscribeState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;", "getAuthorName", "()Ljava/lang/String;", "getAuthorId", "copy", "(JLjava/lang/String;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZZZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZZZLWZ/t;LWZ/t;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "getSubscribeActionParams", "()Ljava/util/Map;", "J", "getWidgetId", "()J", "Ljava/lang/String;", "getUuid", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;", "getAuthor", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "Z", "()Z", "getHasAnswers", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAnswerButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getReportButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getReportedButton", "getDeleteButton", "getWithSeparator", "LWZ/t;", "getDeleteTokenizedEvent", "()LWZ/t;", "getTokenizedEvent", "AuthorVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommentVO implements CommentsAdapterVO {
    private final ButtonV3DTO answerButton;

    @NotNull
    private final AuthorVO author;
    private final TextDTO date;
    private final IconButtonV3DTO deleteButton;
    private final t deleteTokenizedEvent;
    private final boolean hasAnswers;
    private final boolean isFirst;
    private final boolean isLast;
    private final boolean isLastNested;
    private final boolean isNested;
    private final boolean isPublished;
    private final IconButtonV3DTO reportButton;
    private final IconButtonV3DTO reportedButton;
    private final TextDTO text;
    private final t tokenizedEvent;

    @NotNull
    private final String uuid;
    private final long widgetId;
    private final boolean withSeparator;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;", "", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;", "socialHeader", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;", "confirmedIndicator", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;)V", "copy", "(Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;", "getSocialHeader", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;", "Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;", "getConfirmedIndicator", "()Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;", "SocialHeaderVO", "ConfirmedIndicatorVO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthorVO {
        public static final int $stable = CellDTO.$stable;
        private final ConfirmedIndicatorVO confirmedIndicator;

        @NotNull
        private final SocialHeaderVO socialHeader;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$ConfirmedIndicatorVO;", "", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "fillColor", "borderColor", "<init>", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Ljava/lang/String;", "getFillColor", "getBorderColor", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConfirmedIndicatorVO {
            private final String borderColor;
            private final String fillColor;

            @NotNull
            private final IndicatorDTO indicator;

            public ConfirmedIndicatorVO(@NotNull IndicatorDTO indicator, String str, String str2) {
                Intrinsics.checkNotNullParameter(indicator, "indicator");
                this.indicator = indicator;
                this.fillColor = str;
                this.borderColor = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConfirmedIndicatorVO)) {
                    return false;
                }
                ConfirmedIndicatorVO confirmedIndicatorVO = (ConfirmedIndicatorVO) other;
                return Intrinsics.d(this.indicator, confirmedIndicatorVO.indicator) && Intrinsics.d(this.fillColor, confirmedIndicatorVO.fillColor) && Intrinsics.d(this.borderColor, confirmedIndicatorVO.borderColor);
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
                StringBuilder sb2 = new StringBuilder("ConfirmedIndicatorVO(indicator=");
                sb2.append(indicatorDTO);
                sb2.append(", fillColor=");
                sb2.append(str);
                sb2.append(", borderColor=");
                return o0.c(sb2, str2, ")");
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "subscribe", "subscribed", "", "isSubscribed", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)Lru/ozon/app/android/ugc/core/widgets/commentsListV3/presentation/adapter/CommentVO$AuthorVO$SocialHeaderVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribe", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSubscribed", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SocialHeaderVO {
            public static final int $stable = CellDTO.$stable;
            private final boolean isSubscribed;

            @NotNull
            private final CellDTO subscribe;

            @NotNull
            private final CellDTO subscribed;

            public SocialHeaderVO(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean z11) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                this.subscribe = subscribe;
                this.subscribed = subscribed;
                this.isSubscribed = z11;
            }

            public static /* synthetic */ SocialHeaderVO copy$default(SocialHeaderVO socialHeaderVO, CellDTO cellDTO, CellDTO cellDTO2, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = socialHeaderVO.subscribe;
                }
                if ((i11 & 2) != 0) {
                    cellDTO2 = socialHeaderVO.subscribed;
                }
                if ((i11 & 4) != 0) {
                    z11 = socialHeaderVO.isSubscribed;
                }
                return socialHeaderVO.copy(cellDTO, cellDTO2, z11);
            }

            @NotNull
            public final SocialHeaderVO copy(@NotNull CellDTO subscribe, @NotNull CellDTO subscribed, boolean isSubscribed) {
                Intrinsics.checkNotNullParameter(subscribe, "subscribe");
                Intrinsics.checkNotNullParameter(subscribed, "subscribed");
                return new SocialHeaderVO(subscribe, subscribed, isSubscribed);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SocialHeaderVO)) {
                    return false;
                }
                SocialHeaderVO socialHeaderVO = (SocialHeaderVO) other;
                return Intrinsics.d(this.subscribe, socialHeaderVO.subscribe) && Intrinsics.d(this.subscribed, socialHeaderVO.subscribed) && this.isSubscribed == socialHeaderVO.isSubscribed;
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

            /* renamed from: isSubscribed, reason: from getter */
            public final boolean getIsSubscribed() {
                return this.isSubscribed;
            }

            @NotNull
            public String toString() {
                CellDTO cellDTO = this.subscribe;
                CellDTO cellDTO2 = this.subscribed;
                boolean z11 = this.isSubscribed;
                StringBuilder sb2 = new StringBuilder("SocialHeaderVO(subscribe=");
                sb2.append(cellDTO);
                sb2.append(", subscribed=");
                sb2.append(cellDTO2);
                sb2.append(", isSubscribed=");
                return a.a(")", sb2, z11);
            }
        }

        public AuthorVO(@NotNull SocialHeaderVO socialHeader, ConfirmedIndicatorVO confirmedIndicatorVO) {
            Intrinsics.checkNotNullParameter(socialHeader, "socialHeader");
            this.socialHeader = socialHeader;
            this.confirmedIndicator = confirmedIndicatorVO;
        }

        public static /* synthetic */ AuthorVO copy$default(AuthorVO authorVO, SocialHeaderVO socialHeaderVO, ConfirmedIndicatorVO confirmedIndicatorVO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                socialHeaderVO = authorVO.socialHeader;
            }
            if ((i11 & 2) != 0) {
                confirmedIndicatorVO = authorVO.confirmedIndicator;
            }
            return authorVO.copy(socialHeaderVO, confirmedIndicatorVO);
        }

        @NotNull
        public final AuthorVO copy(@NotNull SocialHeaderVO socialHeader, ConfirmedIndicatorVO confirmedIndicator) {
            Intrinsics.checkNotNullParameter(socialHeader, "socialHeader");
            return new AuthorVO(socialHeader, confirmedIndicator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorVO)) {
                return false;
            }
            AuthorVO authorVO = (AuthorVO) other;
            return Intrinsics.d(this.socialHeader, authorVO.socialHeader) && Intrinsics.d(this.confirmedIndicator, authorVO.confirmedIndicator);
        }

        public final ConfirmedIndicatorVO getConfirmedIndicator() {
            return this.confirmedIndicator;
        }

        @NotNull
        public final SocialHeaderVO getSocialHeader() {
            return this.socialHeader;
        }

        public int hashCode() {
            int hashCode = this.socialHeader.hashCode() * 31;
            ConfirmedIndicatorVO confirmedIndicatorVO = this.confirmedIndicator;
            return hashCode + (confirmedIndicatorVO == null ? 0 : confirmedIndicatorVO.hashCode());
        }

        @NotNull
        public String toString() {
            return "AuthorVO(socialHeader=" + this.socialHeader + ", confirmedIndicator=" + this.confirmedIndicator + ")";
        }
    }

    public CommentVO(long j11, @NotNull String uuid, @NotNull AuthorVO author, TextDTO textDTO, TextDTO textDTO2, boolean z11, boolean z12, boolean z13, boolean z14, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, boolean z15, boolean z16, boolean z17, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(author, "author");
        this.widgetId = j11;
        this.uuid = uuid;
        this.author = author;
        this.text = textDTO;
        this.date = textDTO2;
        this.isPublished = z11;
        this.isNested = z12;
        this.isLastNested = z13;
        this.hasAnswers = z14;
        this.answerButton = buttonV3DTO;
        this.reportButton = iconButtonV3DTO;
        this.reportedButton = iconButtonV3DTO2;
        this.deleteButton = iconButtonV3DTO3;
        this.withSeparator = z15;
        this.isFirst = z16;
        this.isLast = z17;
        this.deleteTokenizedEvent = tVar;
        this.tokenizedEvent = tVar2;
    }

    public static /* synthetic */ CommentVO copy$default(CommentVO commentVO, long j11, String str, AuthorVO authorVO, TextDTO textDTO, TextDTO textDTO2, boolean z11, boolean z12, boolean z13, boolean z14, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, boolean z15, boolean z16, boolean z17, t tVar, t tVar2, int i11, Object obj) {
        t tVar3;
        t tVar4;
        long j12 = (i11 & 1) != 0 ? commentVO.widgetId : j11;
        String str2 = (i11 & 2) != 0 ? commentVO.uuid : str;
        AuthorVO authorVO2 = (i11 & 4) != 0 ? commentVO.author : authorVO;
        TextDTO textDTO3 = (i11 & 8) != 0 ? commentVO.text : textDTO;
        TextDTO textDTO4 = (i11 & 16) != 0 ? commentVO.date : textDTO2;
        boolean z18 = (i11 & 32) != 0 ? commentVO.isPublished : z11;
        boolean z19 = (i11 & 64) != 0 ? commentVO.isNested : z12;
        boolean z21 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? commentVO.isLastNested : z13;
        boolean z22 = (i11 & 256) != 0 ? commentVO.hasAnswers : z14;
        ButtonV3DTO buttonV3DTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? commentVO.answerButton : buttonV3DTO;
        IconButtonV3DTO iconButtonV3DTO4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? commentVO.reportButton : iconButtonV3DTO;
        IconButtonV3DTO iconButtonV3DTO5 = (i11 & 2048) != 0 ? commentVO.reportedButton : iconButtonV3DTO2;
        IconButtonV3DTO iconButtonV3DTO6 = (i11 & 4096) != 0 ? commentVO.deleteButton : iconButtonV3DTO3;
        long j13 = j12;
        boolean z23 = (i11 & 8192) != 0 ? commentVO.withSeparator : z15;
        boolean z24 = (i11 & 16384) != 0 ? commentVO.isFirst : z16;
        boolean z25 = (i11 & 32768) != 0 ? commentVO.isLast : z17;
        t tVar5 = (i11 & 65536) != 0 ? commentVO.deleteTokenizedEvent : tVar;
        if ((i11 & 131072) != 0) {
            tVar4 = tVar5;
            tVar3 = commentVO.tokenizedEvent;
        } else {
            tVar3 = tVar2;
            tVar4 = tVar5;
        }
        return commentVO.copy(j13, str2, authorVO2, textDTO3, textDTO4, z18, z19, z21, z22, buttonV3DTO2, iconButtonV3DTO4, iconButtonV3DTO5, iconButtonV3DTO6, z23, z24, z25, tVar4, tVar3);
    }

    private final Map<String, String> getSubscribeActionParams() {
        CommonControlSettings common;
        AtomActionDTO action;
        CellDTO.RightBlock rightBlock = this.author.getSocialHeader().getSubscribe().getRightBlock();
        if (rightBlock == null || (common = rightBlock.getCommon()) == null || (action = common.getAction()) == null) {
            return null;
        }
        return action.getParams();
    }

    @NotNull
    public final CommentVO copy(long widgetId, @NotNull String uuid, @NotNull AuthorVO author, TextDTO text, TextDTO date, boolean isPublished, boolean isNested, boolean isLastNested, boolean hasAnswers, ButtonV3DTO answerButton, IconButtonV3DTO reportButton, IconButtonV3DTO reportedButton, IconButtonV3DTO deleteButton, boolean withSeparator, boolean isFirst, boolean isLast, t deleteTokenizedEvent, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(author, "author");
        return new CommentVO(widgetId, uuid, author, text, date, isPublished, isNested, isLastNested, hasAnswers, answerButton, reportButton, reportedButton, deleteButton, withSeparator, isFirst, isLast, deleteTokenizedEvent, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentVO)) {
            return false;
        }
        CommentVO commentVO = (CommentVO) other;
        return this.widgetId == commentVO.widgetId && Intrinsics.d(this.uuid, commentVO.uuid) && Intrinsics.d(this.author, commentVO.author) && Intrinsics.d(this.text, commentVO.text) && Intrinsics.d(this.date, commentVO.date) && this.isPublished == commentVO.isPublished && this.isNested == commentVO.isNested && this.isLastNested == commentVO.isLastNested && this.hasAnswers == commentVO.hasAnswers && Intrinsics.d(this.answerButton, commentVO.answerButton) && Intrinsics.d(this.reportButton, commentVO.reportButton) && Intrinsics.d(this.reportedButton, commentVO.reportedButton) && Intrinsics.d(this.deleteButton, commentVO.deleteButton) && this.withSeparator == commentVO.withSeparator && this.isFirst == commentVO.isFirst && this.isLast == commentVO.isLast && Intrinsics.d(this.deleteTokenizedEvent, commentVO.deleteTokenizedEvent) && Intrinsics.d(this.tokenizedEvent, commentVO.tokenizedEvent);
    }

    public final ButtonV3DTO getAnswerButton() {
        return this.answerButton;
    }

    @NotNull
    public final AuthorVO getAuthor() {
        return this.author;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    public String getAuthorId() {
        Map<String, String> subscribeActionParams = getSubscribeActionParams();
        if (subscribeActionParams != null) {
            return subscribeActionParams.get("authorId");
        }
        return null;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    @NotNull
    public String getAuthorName() {
        String obj = this.author.getSocialHeader().getSubscribe().getCenterBlock().getTitle().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        return obj;
    }

    public final TextDTO getDate() {
        return this.date;
    }

    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    public final t getDeleteTokenizedEvent() {
        return this.deleteTokenizedEvent;
    }

    public final boolean getHasAnswers() {
        return this.hasAnswers;
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

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    @NotNull
    public String getUuid() {
        return this.uuid;
    }

    public final boolean getWithSeparator() {
        return this.withSeparator;
    }

    public int hashCode() {
        int hashCode = (this.author.hashCode() + g.a(Long.hashCode(this.widgetId) * 31, 31, this.uuid)) * 31;
        TextDTO textDTO = this.text;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.date;
        int a11 = C3532b.a(C3532b.a(C3532b.a(C3532b.a((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.isPublished), 31, this.isNested), 31, this.isLastNested), 31, this.hasAnswers);
        ButtonV3DTO buttonV3DTO = this.answerButton;
        int hashCode3 = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.reportButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.reportedButton;
        int hashCode5 = (hashCode4 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO3 = this.deleteButton;
        int a12 = C3532b.a(C3532b.a(C3532b.a((hashCode5 + (iconButtonV3DTO3 == null ? 0 : iconButtonV3DTO3.hashCode())) * 31, 31, this.withSeparator), 31, this.isFirst), 31, this.isLast);
        t tVar = this.deleteTokenizedEvent;
        int hashCode6 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.tokenizedEvent;
        return hashCode6 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    /* renamed from: isFirst, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    /* renamed from: isLast, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    /* renamed from: isLastNested, reason: from getter */
    public final boolean getIsLastNested() {
        return this.isLastNested;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    /* renamed from: isNested, reason: from getter */
    public boolean getIsNested() {
        return this.isNested;
    }

    /* renamed from: isPublished, reason: from getter */
    public final boolean getIsPublished() {
        return this.isPublished;
    }

    @NotNull
    public String toString() {
        long j11 = this.widgetId;
        String str = this.uuid;
        AuthorVO authorVO = this.author;
        TextDTO textDTO = this.text;
        TextDTO textDTO2 = this.date;
        boolean z11 = this.isPublished;
        boolean z12 = this.isNested;
        boolean z13 = this.isLastNested;
        boolean z14 = this.hasAnswers;
        ButtonV3DTO buttonV3DTO = this.answerButton;
        IconButtonV3DTO iconButtonV3DTO = this.reportButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.reportedButton;
        IconButtonV3DTO iconButtonV3DTO3 = this.deleteButton;
        boolean z15 = this.withSeparator;
        boolean z16 = this.isFirst;
        boolean z17 = this.isLast;
        t tVar = this.deleteTokenizedEvent;
        t tVar2 = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "CommentVO(widgetId=", ", uuid=", str);
        c11.append(", author=");
        c11.append(authorVO);
        c11.append(", text=");
        c11.append(textDTO);
        c11.append(", date=");
        c11.append(textDTO2);
        c11.append(", isPublished=");
        c11.append(z11);
        C2436a.e(", isNested=", ", isLastNested=", c11, z12, z13);
        c11.append(", hasAnswers=");
        c11.append(z14);
        c11.append(", answerButton=");
        c11.append(buttonV3DTO);
        c11.append(", reportButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", reportedButton=");
        c11.append(iconButtonV3DTO2);
        c11.append(", deleteButton=");
        c11.append(iconButtonV3DTO3);
        c11.append(", withSeparator=");
        c11.append(z15);
        C2436a.e(", isFirst=", ", isLast=", c11, z16, z17);
        p.d(c11, ", deleteTokenizedEvent=", tVar, ", tokenizedEvent=", tVar2);
        c11.append(")");
        return c11.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.adapter.CommentsAdapterVO
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommentVO updateSubscribeState(String authorId, String sellerId, Boolean isSubscribe) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        boolean z14 = authorId != null && authorId.equals(getAuthorId());
        if (sellerId != null) {
            Map<String, String> subscribeActionParams = getSubscribeActionParams();
            if (sellerId.equals(subscribeActionParams != null ? subscribeActionParams.get("sellerId") : null)) {
                z11 = true;
                if (z14 && !z11) {
                    return this;
                }
                AuthorVO authorVO = this.author;
                AuthorVO.SocialHeaderVO socialHeader = authorVO.getSocialHeader();
                if (isSubscribe == null) {
                    z13 = isSubscribe.booleanValue();
                } else if (!this.author.getSocialHeader().getIsSubscribed()) {
                    z12 = true;
                    return copy$default(this, 0L, null, AuthorVO.copy$default(authorVO, AuthorVO.SocialHeaderVO.copy$default(socialHeader, null, null, z12, 3, null), null, 2, null), null, null, false, false, false, false, null, null, null, null, false, false, false, null, null, 262139, null);
                }
                z12 = z13;
                return copy$default(this, 0L, null, AuthorVO.copy$default(authorVO, AuthorVO.SocialHeaderVO.copy$default(socialHeader, null, null, z12, 3, null), null, 2, null), null, null, false, false, false, false, null, null, null, null, false, false, false, null, null, 262139, null);
            }
        }
        z11 = false;
        if (z14) {
        }
        AuthorVO authorVO2 = this.author;
        AuthorVO.SocialHeaderVO socialHeader2 = authorVO2.getSocialHeader();
        if (isSubscribe == null) {
        }
        z12 = z13;
        return copy$default(this, 0L, null, AuthorVO.copy$default(authorVO2, AuthorVO.SocialHeaderVO.copy$default(socialHeader2, null, null, z12, 3, null), null, 2, null), null, null, false, false, false, false, null, null, null, null, false, false, false, null, null, 262139, null);
    }

    public /* synthetic */ CommentVO(long j11, String str, AuthorVO authorVO, TextDTO textDTO, TextDTO textDTO2, boolean z11, boolean z12, boolean z13, boolean z14, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, boolean z15, boolean z16, boolean z17, t tVar, t tVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, authorVO, textDTO, textDTO2, z11, z12, z13, z14, buttonV3DTO, iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, z15, (i11 & 16384) != 0 ? false : z16, (i11 & 32768) != 0 ? false : z17, tVar, tVar2);
    }
}
