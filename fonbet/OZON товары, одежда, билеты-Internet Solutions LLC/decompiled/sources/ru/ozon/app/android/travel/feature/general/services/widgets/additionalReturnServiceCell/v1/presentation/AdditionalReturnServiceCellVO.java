package ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation;

import Ak.C2436a;
import Bi.b;
import G.g;
import Kk.C3532b;
import Nh.a;
import Pk0.f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "content", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;)V", "copy", "(JLjava/lang/String;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "Content", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalReturnServiceCellVO implements c {
    private final String asyncData;

    @NotNull
    private final Content content;
    private final long id;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u0017R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b\u000e\u0010,R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b\u000f\u0010,R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b.\u0010,R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b/\u0010,R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b0\u0010'¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellVO$Content;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "returnCell", "infoCell", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEventFromClickControl", "backgroundColor", "borderColor", "", "isCellClickable", "isNotShaded", "viewEvent", "shouldFetchState", "shouldShowSkeleton", "asyncParams", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;ZZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getReturnCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getInfoCell", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getViewEventFromClickControl", "()Ljava/util/Map;", "Ljava/lang/String;", "getBackgroundColor", "getBorderColor", "Z", "()Z", "getViewEvent", "getShouldFetchState", "getShouldShowSkeleton", "getAsyncParams", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
        private final AtomAction action;
        private final Map<String, String> asyncParams;

        @NotNull
        private final String backgroundColor;
        private final String borderColor;

        @NotNull
        private final CellDTO infoCell;
        private final boolean isCellClickable;
        private final boolean isNotShaded;

        @NotNull
        private final CellDTO returnCell;
        private final boolean shouldFetchState;
        private final boolean shouldShowSkeleton;
        private final Map<String, TokenizedTrackingInfo> viewEvent;
        private final Map<String, TokenizedTrackingInfo> viewEventFromClickControl;

        public Content(@NotNull CellDTO returnCell, @NotNull CellDTO infoCell, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, @NotNull String backgroundColor, String str, boolean z11, boolean z12, Map<String, TokenizedTrackingInfo> map2, boolean z13, boolean z14, Map<String, String> map3) {
            Intrinsics.checkNotNullParameter(returnCell, "returnCell");
            Intrinsics.checkNotNullParameter(infoCell, "infoCell");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.returnCell = returnCell;
            this.infoCell = infoCell;
            this.action = atomAction;
            this.viewEventFromClickControl = map;
            this.backgroundColor = backgroundColor;
            this.borderColor = str;
            this.isCellClickable = z11;
            this.isNotShaded = z12;
            this.viewEvent = map2;
            this.shouldFetchState = z13;
            this.shouldShowSkeleton = z14;
            this.asyncParams = map3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.returnCell, content.returnCell) && Intrinsics.d(this.infoCell, content.infoCell) && Intrinsics.d(this.action, content.action) && Intrinsics.d(this.viewEventFromClickControl, content.viewEventFromClickControl) && Intrinsics.d(this.backgroundColor, content.backgroundColor) && Intrinsics.d(this.borderColor, content.borderColor) && this.isCellClickable == content.isCellClickable && this.isNotShaded == content.isNotShaded && Intrinsics.d(this.viewEvent, content.viewEvent) && this.shouldFetchState == content.shouldFetchState && this.shouldShowSkeleton == content.shouldShowSkeleton && Intrinsics.d(this.asyncParams, content.asyncParams);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Map<String, String> getAsyncParams() {
            return this.asyncParams;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final CellDTO getInfoCell() {
            return this.infoCell;
        }

        @NotNull
        public final CellDTO getReturnCell() {
            return this.returnCell;
        }

        public final boolean getShouldFetchState() {
            return this.shouldFetchState;
        }

        public final boolean getShouldShowSkeleton() {
            return this.shouldShowSkeleton;
        }

        public final Map<String, TokenizedTrackingInfo> getViewEvent() {
            return this.viewEvent;
        }

        public final Map<String, TokenizedTrackingInfo> getViewEventFromClickControl() {
            return this.viewEventFromClickControl;
        }

        public int hashCode() {
            int c11 = b.c(this.infoCell, this.returnCell.hashCode() * 31, 31);
            AtomAction atomAction = this.action;
            int hashCode = (c11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.viewEventFromClickControl;
            int a11 = g.a((hashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.backgroundColor);
            String str = this.borderColor;
            int a12 = C3532b.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCellClickable), 31, this.isNotShaded);
            Map<String, TokenizedTrackingInfo> map2 = this.viewEvent;
            int a13 = C3532b.a(C3532b.a((a12 + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.shouldFetchState), 31, this.shouldShowSkeleton);
            Map<String, String> map3 = this.asyncParams;
            return a13 + (map3 != null ? map3.hashCode() : 0);
        }

        /* renamed from: isCellClickable, reason: from getter */
        public final boolean getIsCellClickable() {
            return this.isCellClickable;
        }

        /* renamed from: isNotShaded, reason: from getter */
        public final boolean getIsNotShaded() {
            return this.isNotShaded;
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.returnCell;
            CellDTO cellDTO2 = this.infoCell;
            AtomAction atomAction = this.action;
            Map<String, TokenizedTrackingInfo> map = this.viewEventFromClickControl;
            String str = this.backgroundColor;
            String str2 = this.borderColor;
            boolean z11 = this.isCellClickable;
            boolean z12 = this.isNotShaded;
            Map<String, TokenizedTrackingInfo> map2 = this.viewEvent;
            boolean z13 = this.shouldFetchState;
            boolean z14 = this.shouldShowSkeleton;
            Map<String, String> map3 = this.asyncParams;
            StringBuilder sb2 = new StringBuilder("Content(returnCell=");
            sb2.append(cellDTO);
            sb2.append(", infoCell=");
            sb2.append(cellDTO2);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", viewEventFromClickControl=");
            sb2.append(map);
            sb2.append(", backgroundColor=");
            a.h(sb2, str, ", borderColor=", str2, ", isCellClickable=");
            f.c(", isNotShaded=", ", viewEvent=", sb2, z11, z12);
            sb2.append(map2);
            sb2.append(", shouldFetchState=");
            sb2.append(z13);
            sb2.append(", shouldShowSkeleton=");
            sb2.append(z14);
            sb2.append(", asyncParams=");
            sb2.append(map3);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public AdditionalReturnServiceCellVO(long j11, String str, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.asyncData = str;
        this.content = content;
    }

    public static /* synthetic */ AdditionalReturnServiceCellVO copy$default(AdditionalReturnServiceCellVO additionalReturnServiceCellVO, long j11, String str, Content content, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = additionalReturnServiceCellVO.id;
        }
        if ((i11 & 2) != 0) {
            str = additionalReturnServiceCellVO.asyncData;
        }
        if ((i11 & 4) != 0) {
            content = additionalReturnServiceCellVO.content;
        }
        return additionalReturnServiceCellVO.copy(j11, str, content);
    }

    @NotNull
    public final AdditionalReturnServiceCellVO copy(long id2, String asyncData, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new AdditionalReturnServiceCellVO(id2, asyncData, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalReturnServiceCellVO)) {
            return false;
        }
        AdditionalReturnServiceCellVO additionalReturnServiceCellVO = (AdditionalReturnServiceCellVO) other;
        return this.id == additionalReturnServiceCellVO.id && Intrinsics.d(this.asyncData, additionalReturnServiceCellVO.asyncData) && Intrinsics.d(this.content, additionalReturnServiceCellVO.content);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        return this.content.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        Content content = this.content;
        StringBuilder c11 = C2436a.c(j11, "AdditionalReturnServiceCellVO(id=", ", asyncData=", str);
        c11.append(", content=");
        c11.append(content);
        c11.append(")");
        return c11.toString();
    }
}
