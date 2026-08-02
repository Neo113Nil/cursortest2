package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content;

import B0.C2454a;
import C.o0;
import El.C2971a;
import F3.G;
import G.g;
import Kk.C3532b;
import Tl.b;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsVO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\"#$%B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010\u0013R%\u0010\f\u001a\u0010\u0012\f\u0012\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b0\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3TabItemVO;", "tabsContent", "", "marginBetweenFlights", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tabsClickTracking", "<init>", "(JLjava/util/List;ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabsContent", "()Ljava/util/List;", "I", "getMarginBetweenFlights", "getTabsClickTracking", "AviaDetailsContentVO", "LuggageContentVO", "LuggageContentItemsVO", "ReturnPolicyContentVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaDetailedInfoV3VO implements c {
    private final long id;
    private final int marginBetweenFlights;

    @NotNull
    private final List<t> tabsClickTracking;

    @NotNull
    private final List<AviaDetailedInfoV3TabItemVO> tabsContent;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$AviaDetailsContentVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3TabItemVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "content", "", "marginBetweenFlights", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTrackingInfo", "<init>", "(Ljava/util/List;ILWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "I", "getMarginBetweenFlights", "LWZ/t;", "getViewTrackingInfo", "()LWZ/t;", "AviaDetails", "NoticeVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AviaDetailsContentVO implements AviaDetailedInfoV3TabItemVO {

        @NotNull
        private final List<AviaDetailedInfoV3ListItemVO> content;
        private final int marginBetweenFlights;
        private final t viewTrackingInfo;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$AviaDetailsContentVO$AviaDetails;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "", "id", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "content", "<init>", "(ILru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "getContent", "()Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AviaDetails implements AviaDetailedInfoV3ListItemVO {

            @NotNull
            private final FlightDetailsVO content;
            private final int id;

            public AviaDetails(int i11, @NotNull FlightDetailsVO content) {
                Intrinsics.checkNotNullParameter(content, "content");
                this.id = i11;
                this.content = content;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AviaDetails)) {
                    return false;
                }
                AviaDetails aviaDetails = (AviaDetails) other;
                return this.id == aviaDetails.id && Intrinsics.d(this.content, aviaDetails.content);
            }

            @NotNull
            public final FlightDetailsVO getContent() {
                return this.content;
            }

            public int hashCode() {
                return this.content.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "AviaDetails(id=" + this.id + ", content=" + this.content + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$AviaDetailsContentVO$NoticeVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "noticeTime", "noticeLuggage", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNoticeTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getNoticeLuggage", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoticeVO implements AviaDetailedInfoV3ListItemVO {
            private final DisclaimerAtom annotation;
            private final int id;
            private final TextDTO noticeLuggage;
            private final TextDTO noticeTime;

            public NoticeVO(int i11, TextDTO textDTO, TextDTO textDTO2, DisclaimerAtom disclaimerAtom) {
                this.id = i11;
                this.noticeTime = textDTO;
                this.noticeLuggage = textDTO2;
                this.annotation = disclaimerAtom;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoticeVO)) {
                    return false;
                }
                NoticeVO noticeVO = (NoticeVO) other;
                return this.id == noticeVO.id && Intrinsics.d(this.noticeTime, noticeVO.noticeTime) && Intrinsics.d(this.noticeLuggage, noticeVO.noticeLuggage) && Intrinsics.d(this.annotation, noticeVO.annotation);
            }

            public final DisclaimerAtom getAnnotation() {
                return this.annotation;
            }

            public final TextDTO getNoticeLuggage() {
                return this.noticeLuggage;
            }

            public final TextDTO getNoticeTime() {
                return this.noticeTime;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.id) * 31;
                TextDTO textDTO = this.noticeTime;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                TextDTO textDTO2 = this.noticeLuggage;
                int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
                DisclaimerAtom disclaimerAtom = this.annotation;
                return hashCode3 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                TextDTO textDTO = this.noticeTime;
                TextDTO textDTO2 = this.noticeLuggage;
                DisclaimerAtom disclaimerAtom = this.annotation;
                StringBuilder b11 = C4055a.b(textDTO, "NoticeVO(id=", ", noticeTime=", ", noticeLuggage=", i11);
                b11.append(textDTO2);
                b11.append(", annotation=");
                b11.append(disclaimerAtom);
                b11.append(")");
                return b11.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AviaDetailsContentVO(@NotNull List<? extends AviaDetailedInfoV3ListItemVO> content, int i11, t tVar) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.marginBetweenFlights = i11;
            this.viewTrackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AviaDetailsContentVO)) {
                return false;
            }
            AviaDetailsContentVO aviaDetailsContentVO = (AviaDetailsContentVO) other;
            return Intrinsics.d(this.content, aviaDetailsContentVO.content) && this.marginBetweenFlights == aviaDetailsContentVO.marginBetweenFlights && Intrinsics.d(this.viewTrackingInfo, aviaDetailsContentVO.viewTrackingInfo);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3TabItemVO
        @NotNull
        public List<AviaDetailedInfoV3ListItemVO> getContent() {
            return this.content;
        }

        public final int getMarginBetweenFlights() {
            return this.marginBetweenFlights;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.marginBetweenFlights, this.content.hashCode() * 31, 31);
            t tVar = this.viewTrackingInfo;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            List<AviaDetailedInfoV3ListItemVO> list = this.content;
            int i11 = this.marginBetweenFlights;
            t tVar = this.viewTrackingInfo;
            StringBuilder sb2 = new StringBuilder("AviaDetailsContentVO(content=");
            sb2.append(list);
            sb2.append(", marginBetweenFlights=");
            sb2.append(i11);
            sb2.append(", viewTrackingInfo=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "", "id", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "items", "tallestItem", "", "isOnlyOneTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "noticeLuggage", "<init>", "(ILjava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;ZLru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "getTallestItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNoticeLuggage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "LuggageItemVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageContentItemsVO implements AviaDetailedInfoV3ListItemVO {
        private final int id;
        private final boolean isOnlyOneTime;

        @NotNull
        private final List<LuggageItemVO> items;

        @NotNull
        private final TextDTO noticeLuggage;
        private final LuggageItemVO tallestItem;

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010\u0016R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "", "", "id", "", "isFullScreen", "Lru/ozon/uni/atoms/data/text/TextDTO;", "route", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlineLogo", "subAirlineLogo", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithReverseSubtitleCounter;", "cells", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTrackingInfo", "<init>", "(IZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Z", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getRoute", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAirlineLogo", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubAirlineLogo", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getViewTrackingInfo", "()LWZ/t;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LuggageItemVO {

            @NotNull
            private final IconDTO airlineLogo;
            private final String backgroundColor;

            @NotNull
            private final List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> cells;
            private final int id;
            private final boolean isFullScreen;

            @NotNull
            private final TextDTO route;
            private final IconDTO subAirlineLogo;
            private final t viewTrackingInfo;

            public LuggageItemVO(int i11, boolean z11, @NotNull TextDTO route, @NotNull IconDTO airlineLogo, IconDTO iconDTO, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> cells, String str, t tVar) {
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.id = i11;
                this.isFullScreen = z11;
                this.route = route;
                this.airlineLogo = airlineLogo;
                this.subAirlineLogo = iconDTO;
                this.cells = cells;
                this.backgroundColor = str;
                this.viewTrackingInfo = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LuggageItemVO)) {
                    return false;
                }
                LuggageItemVO luggageItemVO = (LuggageItemVO) other;
                return this.id == luggageItemVO.id && this.isFullScreen == luggageItemVO.isFullScreen && Intrinsics.d(this.route, luggageItemVO.route) && Intrinsics.d(this.airlineLogo, luggageItemVO.airlineLogo) && Intrinsics.d(this.subAirlineLogo, luggageItemVO.subAirlineLogo) && Intrinsics.d(this.cells, luggageItemVO.cells) && Intrinsics.d(this.backgroundColor, luggageItemVO.backgroundColor) && Intrinsics.d(this.viewTrackingInfo, luggageItemVO.viewTrackingInfo);
            }

            @NotNull
            public final IconDTO getAirlineLogo() {
                return this.airlineLogo;
            }

            @NotNull
            public final List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> getCells() {
                return this.cells;
            }

            public final int getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getRoute() {
                return this.route;
            }

            public final IconDTO getSubAirlineLogo() {
                return this.subAirlineLogo;
            }

            public final t getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            public int hashCode() {
                int a11 = C2971a.a(this.airlineLogo, Ns.b.a(this.route, C3532b.a(Integer.hashCode(this.id) * 31, 31, this.isFullScreen), 31), 31);
                IconDTO iconDTO = this.subAirlineLogo;
                int b11 = g.b((a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.cells);
                String str = this.backgroundColor;
                int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                t tVar = this.viewTrackingInfo;
                return hashCode + (tVar != null ? tVar.hashCode() : 0);
            }

            /* renamed from: isFullScreen, reason: from getter */
            public final boolean getIsFullScreen() {
                return this.isFullScreen;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                boolean z11 = this.isFullScreen;
                TextDTO textDTO = this.route;
                IconDTO iconDTO = this.airlineLogo;
                IconDTO iconDTO2 = this.subAirlineLogo;
                List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> list = this.cells;
                String str = this.backgroundColor;
                t tVar = this.viewTrackingInfo;
                StringBuilder sb2 = new StringBuilder("LuggageItemVO(id=");
                sb2.append(i11);
                sb2.append(", isFullScreen=");
                sb2.append(z11);
                sb2.append(", route=");
                G.f(sb2, textDTO, ", airlineLogo=", iconDTO, ", subAirlineLogo=");
                sb2.append(iconDTO2);
                sb2.append(", cells=");
                sb2.append(list);
                sb2.append(", backgroundColor=");
                sb2.append(str);
                sb2.append(", viewTrackingInfo=");
                sb2.append(tVar);
                sb2.append(")");
                return sb2.toString();
            }
        }

        public LuggageContentItemsVO(int i11, @NotNull List<LuggageItemVO> items, LuggageItemVO luggageItemVO, boolean z11, @NotNull TextDTO noticeLuggage) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(noticeLuggage, "noticeLuggage");
            this.id = i11;
            this.items = items;
            this.tallestItem = luggageItemVO;
            this.isOnlyOneTime = z11;
            this.noticeLuggage = noticeLuggage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageContentItemsVO)) {
                return false;
            }
            LuggageContentItemsVO luggageContentItemsVO = (LuggageContentItemsVO) other;
            return this.id == luggageContentItemsVO.id && Intrinsics.d(this.items, luggageContentItemsVO.items) && Intrinsics.d(this.tallestItem, luggageContentItemsVO.tallestItem) && this.isOnlyOneTime == luggageContentItemsVO.isOnlyOneTime && Intrinsics.d(this.noticeLuggage, luggageContentItemsVO.noticeLuggage);
        }

        @NotNull
        public final List<LuggageItemVO> getItems() {
            return this.items;
        }

        @NotNull
        public final TextDTO getNoticeLuggage() {
            return this.noticeLuggage;
        }

        public final LuggageItemVO getTallestItem() {
            return this.tallestItem;
        }

        public int hashCode() {
            int b11 = g.b(Integer.hashCode(this.id) * 31, 31, this.items);
            LuggageItemVO luggageItemVO = this.tallestItem;
            return this.noticeLuggage.hashCode() + C3532b.a((b11 + (luggageItemVO == null ? 0 : luggageItemVO.hashCode())) * 31, 31, this.isOnlyOneTime);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            List<LuggageItemVO> list = this.items;
            LuggageItemVO luggageItemVO = this.tallestItem;
            boolean z11 = this.isOnlyOneTime;
            TextDTO textDTO = this.noticeLuggage;
            StringBuilder sb2 = new StringBuilder("LuggageContentItemsVO(id=");
            sb2.append(i11);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", tallestItem=");
            sb2.append(luggageItemVO);
            sb2.append(", isOnlyOneTime=");
            sb2.append(z11);
            sb2.append(", noticeLuggage=");
            return b.e(sb2, textDTO, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3TabItemVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "content", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageContentVO implements AviaDetailedInfoV3TabItemVO {

        @NotNull
        private final List<AviaDetailedInfoV3ListItemVO> content;

        /* JADX WARN: Multi-variable type inference failed */
        public LuggageContentVO(@NotNull List<? extends AviaDetailedInfoV3ListItemVO> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LuggageContentVO) && Intrinsics.d(this.content, ((LuggageContentVO) other).content);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3TabItemVO
        @NotNull
        public List<AviaDetailedInfoV3ListItemVO> getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("LuggageContentVO(content=", ")", this.content);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3TabItemVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "content", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "DisclaimerVO", "RouteBlockVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReturnPolicyContentVO implements AviaDetailedInfoV3TabItemVO {

        @NotNull
        private final List<AviaDetailedInfoV3ListItemVO> content;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO$DisclaimerVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "", "id", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "texts", "", "backgroundColor", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getTexts", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DisclaimerVO implements AviaDetailedInfoV3ListItemVO {

            @NotNull
            private final String backgroundColor;
            private final int id;

            @NotNull
            private final List<TextDTO> texts;

            public DisclaimerVO(int i11, @NotNull List<TextDTO> texts, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(texts, "texts");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.id = i11;
                this.texts = texts;
                this.backgroundColor = backgroundColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisclaimerVO)) {
                    return false;
                }
                DisclaimerVO disclaimerVO = (DisclaimerVO) other;
                return this.id == disclaimerVO.id && Intrinsics.d(this.texts, disclaimerVO.texts) && Intrinsics.d(this.backgroundColor, disclaimerVO.backgroundColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final List<TextDTO> getTexts() {
                return this.texts;
            }

            public int hashCode() {
                return this.backgroundColor.hashCode() + g.b(Integer.hashCode(this.id) * 31, 31, this.texts);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                List<TextDTO> list = this.texts;
                String str = this.backgroundColor;
                StringBuilder sb2 = new StringBuilder("DisclaimerVO(id=");
                sb2.append(i11);
                sb2.append(", texts=");
                sb2.append(list);
                sb2.append(", backgroundColor=");
                return o0.c(sb2, str, ")");
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO$RouteBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlineLogo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "route", "text", "<init>", "(ILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAirlineLogo", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getRoute", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RouteBlockVO implements AviaDetailedInfoV3ListItemVO {
            public static final int $stable = IconDTO.$stable;

            @NotNull
            private final IconDTO airlineLogo;
            private final int id;

            @NotNull
            private final TextDTO route;

            @NotNull
            private final TextDTO text;

            public RouteBlockVO(int i11, @NotNull IconDTO airlineLogo, @NotNull TextDTO route, @NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(airlineLogo, "airlineLogo");
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = i11;
                this.airlineLogo = airlineLogo;
                this.route = route;
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RouteBlockVO)) {
                    return false;
                }
                RouteBlockVO routeBlockVO = (RouteBlockVO) other;
                return this.id == routeBlockVO.id && Intrinsics.d(this.airlineLogo, routeBlockVO.airlineLogo) && Intrinsics.d(this.route, routeBlockVO.route) && Intrinsics.d(this.text, routeBlockVO.text);
            }

            @NotNull
            public final IconDTO getAirlineLogo() {
                return this.airlineLogo;
            }

            @NotNull
            public final TextDTO getRoute() {
                return this.route;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + Ns.b.a(this.route, C2971a.a(this.airlineLogo, Integer.hashCode(this.id) * 31, 31), 31);
            }

            @NotNull
            public String toString() {
                return "RouteBlockVO(id=" + this.id + ", airlineLogo=" + this.airlineLogo + ", route=" + this.route + ", text=" + this.text + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ReturnPolicyContentVO(@NotNull List<? extends AviaDetailedInfoV3ListItemVO> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReturnPolicyContentVO) && Intrinsics.d(this.content, ((ReturnPolicyContentVO) other).content);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3TabItemVO
        @NotNull
        public List<AviaDetailedInfoV3ListItemVO> getContent() {
            return this.content;
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("ReturnPolicyContentVO(content=", ")", this.content);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AviaDetailedInfoV3VO(long j11, @NotNull List<? extends AviaDetailedInfoV3TabItemVO> tabsContent, int i11, @NotNull List<t> tabsClickTracking) {
        Intrinsics.checkNotNullParameter(tabsContent, "tabsContent");
        Intrinsics.checkNotNullParameter(tabsClickTracking, "tabsClickTracking");
        this.id = j11;
        this.tabsContent = tabsContent;
        this.marginBetweenFlights = i11;
        this.tabsClickTracking = tabsClickTracking;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaDetailedInfoV3VO)) {
            return false;
        }
        AviaDetailedInfoV3VO aviaDetailedInfoV3VO = (AviaDetailedInfoV3VO) other;
        return this.id == aviaDetailedInfoV3VO.id && Intrinsics.d(this.tabsContent, aviaDetailedInfoV3VO.tabsContent) && this.marginBetweenFlights == aviaDetailedInfoV3VO.marginBetweenFlights && Intrinsics.d(this.tabsClickTracking, aviaDetailedInfoV3VO.tabsClickTracking);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMarginBetweenFlights() {
        return this.marginBetweenFlights;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<t> getTabsClickTracking() {
        return this.tabsClickTracking;
    }

    @NotNull
    public final List<AviaDetailedInfoV3TabItemVO> getTabsContent() {
        return this.tabsContent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.tabsClickTracking.hashCode() + C2454a.a(this.marginBetweenFlights, g.b(Long.hashCode(this.id) * 31, 31, this.tabsContent), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AviaDetailedInfoV3TabItemVO> list = this.tabsContent;
        int i11 = this.marginBetweenFlights;
        List<t> list2 = this.tabsClickTracking;
        StringBuilder b11 = Lh.b.b(j11, "AviaDetailedInfoV3VO(id=", ", tabsContent=", list);
        b11.append(", marginBetweenFlights=");
        b11.append(i11);
        b11.append(", tabsClickTracking=");
        b11.append(list2);
        b11.append(")");
        return b11.toString();
    }
}
