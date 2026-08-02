package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data;

import Am.C2438a;
import B0.C2454a;
import B3.p;
import Bi.b;
import C.o0;
import Ek.a;
import G.g;
import Pk0.i;
import T7.P;
import Tz.C4055a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.utils.CornersConfig;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0005\u0010\u0011\u0012\u0013\u0014J+\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000fR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "T", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO;", "", "id", "", "getId", "()I", "mapToVo", "widgetId", "", "asyncData", "", "isSelect", "", "(JLjava/lang/String;Z)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO;", "Async", "DsCell", "ProgressLadderCell", "ProgressLadder", "Separator", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Async;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$DsCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$ProgressLadder;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$ProgressLadderCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Separator;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SellerActionsPreviewDtoWrapper<T extends SellerActionsPreviewVO> {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\rHÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Async;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;", "<init>", "()V", "id", "", "getId", "()I", "mapToVo", "widgetId", "", "asyncData", "", "isSelect", "", "equals", "other", "", "hashCode", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Async implements SellerActionsPreviewDtoWrapper<SellerActionsPreviewVO.Async> {

        @NotNull
        public static final Async INSTANCE = new Async();
        private static final int id = 0;

        private Async() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Async);
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        public int getId() {
            return id;
        }

        public int hashCode() {
            return -432839240;
        }

        @NotNull
        public String toString() {
            return "Async";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        @NotNull
        public SellerActionsPreviewVO.Async mapToVo(long widgetId, String asyncData, boolean isSelect) {
            return new SellerActionsPreviewVO.Async(widgetId, asyncData);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ SellerActionsPreviewVO mapToVo$default(SellerActionsPreviewDtoWrapper sellerActionsPreviewDtoWrapper, long j11, String str, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mapToVo");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return sellerActionsPreviewDtoWrapper.mapToVo(j11, str, z11);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$DsCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "widgetBackgroundColor", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "corners", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;IIILjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/utils/CornersConfig;Ljava/util/Map;)V", "", "widgetId", "asyncData", "", "isSelect", "mapToVo", "(JLjava/lang/String;Z)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "getWidgetBackgroundColor", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "getCorners", "()Lru/ozon/app/android/marketing/utils/CornersConfig;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DsCell implements SellerActionsPreviewDtoWrapper<SellerActionsPreviewVO.DsCell> {

        @NotNull
        private final CellDTO cell;

        @NotNull
        private final String containerBgColor;

        @NotNull
        private final CornersConfig corners;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final int id;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final int verticalPadding;

        @NotNull
        private final String widgetBackgroundColor;

        public DsCell(int i11, @NotNull CellDTO cell, int i12, int i13, int i14, @NotNull String containerBgColor, @NotNull String widgetBackgroundColor, @NotNull CornersConfig corners, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(containerBgColor, "containerBgColor");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            Intrinsics.checkNotNullParameter(corners, "corners");
            this.id = i11;
            this.cell = cell;
            this.horizontalPadding = i12;
            this.verticalPadding = i13;
            this.horizontalMargin = i14;
            this.containerBgColor = containerBgColor;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.corners = corners;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DsCell)) {
                return false;
            }
            DsCell dsCell = (DsCell) other;
            return this.id == dsCell.id && Intrinsics.d(this.cell, dsCell.cell) && this.horizontalPadding == dsCell.horizontalPadding && this.verticalPadding == dsCell.verticalPadding && this.horizontalMargin == dsCell.horizontalMargin && Intrinsics.d(this.containerBgColor, dsCell.containerBgColor) && Intrinsics.d(this.widgetBackgroundColor, dsCell.widgetBackgroundColor) && this.corners == dsCell.corners && Intrinsics.d(this.trackingInfo, dsCell.trackingInfo);
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            int hashCode = (this.corners.hashCode() + g.a(g.a(C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, b.c(this.cell, Integer.hashCode(this.id) * 31, 31), 31), 31), 31), 31, this.containerBgColor), 31, this.widgetBackgroundColor)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CellDTO cellDTO = this.cell;
            int i12 = this.horizontalPadding;
            int i13 = this.verticalPadding;
            int i14 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            CornersConfig cornersConfig = this.corners;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("DsCell(id=");
            sb2.append(i11);
            sb2.append(", cell=");
            sb2.append(cellDTO);
            sb2.append(", horizontalPadding=");
            a.f(i12, i13, ", verticalPadding=", ", horizontalMargin=", sb2);
            i.c(i14, ", containerBgColor=", str, ", widgetBackgroundColor=", sb2);
            sb2.append(str2);
            sb2.append(", corners=");
            sb2.append(cornersConfig);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        @NotNull
        public SellerActionsPreviewVO.DsCell mapToVo(long widgetId, String asyncData, boolean isSelect) {
            CornersConfig cornersConfig = this.corners;
            CellDTO cellDTO = this.cell;
            int i11 = this.horizontalPadding;
            int i12 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            int i13 = this.verticalPadding;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return new SellerActionsPreviewVO.DsCell(widgetId, cornersConfig, cellDTO, i11, i13, i12, str, str2, isSelect, map != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(map, Long.valueOf(widgetId), null, 2, null) : null);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010 R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010 R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b/\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$ProgressLadder;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;", "", "id", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "progressLadder", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "widgetBackgroundColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "corners", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;IIILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/marketing/utils/CornersConfig;Ljava/util/Map;)V", "", "widgetId", "asyncData", "", "isSelect", "mapToVo", "(JLjava/lang/String;Z)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getProgressLadder", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "getWidgetBackgroundColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "getCorners", "()Lru/ozon/app/android/marketing/utils/CornersConfig;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressLadder implements SellerActionsPreviewDtoWrapper<SellerActionsPreviewVO.ProgressLadder> {
        private final AtomActionDTO action;

        @NotNull
        private final String containerBgColor;

        @NotNull
        private final CornersConfig corners;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final int id;

        @NotNull
        private final ProgressLadderDTO progressLadder;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final int verticalPadding;

        @NotNull
        private final String widgetBackgroundColor;

        public ProgressLadder(int i11, @NotNull ProgressLadderDTO progressLadder, int i12, int i13, int i14, @NotNull String containerBgColor, @NotNull String widgetBackgroundColor, AtomActionDTO atomActionDTO, @NotNull CornersConfig corners, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(progressLadder, "progressLadder");
            Intrinsics.checkNotNullParameter(containerBgColor, "containerBgColor");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            Intrinsics.checkNotNullParameter(corners, "corners");
            this.id = i11;
            this.progressLadder = progressLadder;
            this.horizontalPadding = i12;
            this.verticalPadding = i13;
            this.horizontalMargin = i14;
            this.containerBgColor = containerBgColor;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.action = atomActionDTO;
            this.corners = corners;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressLadder)) {
                return false;
            }
            ProgressLadder progressLadder = (ProgressLadder) other;
            return this.id == progressLadder.id && Intrinsics.d(this.progressLadder, progressLadder.progressLadder) && this.horizontalPadding == progressLadder.horizontalPadding && this.verticalPadding == progressLadder.verticalPadding && this.horizontalMargin == progressLadder.horizontalMargin && Intrinsics.d(this.containerBgColor, progressLadder.containerBgColor) && Intrinsics.d(this.widgetBackgroundColor, progressLadder.widgetBackgroundColor) && Intrinsics.d(this.action, progressLadder.action) && this.corners == progressLadder.corners && Intrinsics.d(this.trackingInfo, progressLadder.trackingInfo);
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            int a11 = g.a(g.a(C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, (this.progressLadder.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31), 31), 31, this.containerBgColor), 31, this.widgetBackgroundColor);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (this.corners.hashCode() + ((a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            ProgressLadderDTO progressLadderDTO = this.progressLadder;
            int i12 = this.horizontalPadding;
            int i13 = this.verticalPadding;
            int i14 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            CornersConfig cornersConfig = this.corners;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ProgressLadder(id=");
            sb2.append(i11);
            sb2.append(", progressLadder=");
            sb2.append(progressLadderDTO);
            sb2.append(", horizontalPadding=");
            a.f(i12, i13, ", verticalPadding=", ", horizontalMargin=", sb2);
            i.c(i14, ", containerBgColor=", str, ", widgetBackgroundColor=", sb2);
            p.c(str2, ", action=", ", corners=", sb2, atomActionDTO);
            sb2.append(cornersConfig);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        @NotNull
        public SellerActionsPreviewVO.ProgressLadder mapToVo(long widgetId, String asyncData, boolean isSelect) {
            CornersConfig cornersConfig = this.corners;
            ProgressLadderDTO progressLadderDTO = this.progressLadder;
            int i11 = this.horizontalPadding;
            int i12 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            AtomAction atomAction = atomActionDTO != null ? AtomActionMapperKt.toAtomAction(atomActionDTO, this.trackingInfo) : null;
            int i13 = this.verticalPadding;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return new SellerActionsPreviewVO.ProgressLadder(widgetId, cornersConfig, progressLadderDTO, i11, i13, i12, str, str2, isSelect, atomAction, map != null ? TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(widgetId), null, 2, null) : null);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b1\u0010#R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b2\u0010#R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b3\u0010#R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b6\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b;\u0010<R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$ProgressLadderCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadderCell;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconLeft", "iconRight", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "widgetBackgroundColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "corners", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;IIILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/marketing/utils/CornersConfig;Ljava/util/Map;)V", "", "widgetId", "asyncData", "", "isSelect", "mapToVo", "(JLjava/lang/String;Z)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadderCell;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconLeft", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconRight", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "getWidgetBackgroundColor", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "getCorners", "()Lru/ozon/app/android/marketing/utils/CornersConfig;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressLadderCell implements SellerActionsPreviewDtoWrapper<SellerActionsPreviewVO.ProgressLadderCell> {
        private final AtomActionDTO action;

        @NotNull
        private final String containerBgColor;

        @NotNull
        private final CornersConfig corners;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final IconDTO iconLeft;
        private final IconDTO iconRight;
        private final int id;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final int verticalPadding;

        @NotNull
        private final String widgetBackgroundColor;

        public ProgressLadderCell(int i11, TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, int i12, int i13, int i14, @NotNull String containerBgColor, @NotNull String widgetBackgroundColor, AtomActionDTO atomActionDTO, @NotNull CornersConfig corners, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(containerBgColor, "containerBgColor");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            Intrinsics.checkNotNullParameter(corners, "corners");
            this.id = i11;
            this.title = textDTO;
            this.iconLeft = iconDTO;
            this.iconRight = iconDTO2;
            this.horizontalPadding = i12;
            this.verticalPadding = i13;
            this.horizontalMargin = i14;
            this.containerBgColor = containerBgColor;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.action = atomActionDTO;
            this.corners = corners;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressLadderCell)) {
                return false;
            }
            ProgressLadderCell progressLadderCell = (ProgressLadderCell) other;
            return this.id == progressLadderCell.id && Intrinsics.d(this.title, progressLadderCell.title) && Intrinsics.d(this.iconLeft, progressLadderCell.iconLeft) && Intrinsics.d(this.iconRight, progressLadderCell.iconRight) && this.horizontalPadding == progressLadderCell.horizontalPadding && this.verticalPadding == progressLadderCell.verticalPadding && this.horizontalMargin == progressLadderCell.horizontalMargin && Intrinsics.d(this.containerBgColor, progressLadderCell.containerBgColor) && Intrinsics.d(this.widgetBackgroundColor, progressLadderCell.widgetBackgroundColor) && Intrinsics.d(this.action, progressLadderCell.action) && this.corners == progressLadderCell.corners && Intrinsics.d(this.trackingInfo, progressLadderCell.trackingInfo);
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.iconLeft;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            IconDTO iconDTO2 = this.iconRight;
            int a11 = g.a(g.a(C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, (hashCode3 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31, 31), 31), 31), 31, this.containerBgColor), 31, this.widgetBackgroundColor);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (this.corners.hashCode() + ((a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.iconLeft;
            IconDTO iconDTO2 = this.iconRight;
            int i12 = this.horizontalPadding;
            int i13 = this.verticalPadding;
            int i14 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            CornersConfig cornersConfig = this.corners;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = C4055a.b(textDTO, "ProgressLadderCell(id=", ", title=", ", iconLeft=", i11);
            b11.append(iconDTO);
            b11.append(", iconRight=");
            b11.append(iconDTO2);
            b11.append(", horizontalPadding=");
            a.f(i12, i13, ", verticalPadding=", ", horizontalMargin=", b11);
            i.c(i14, ", containerBgColor=", str, ", widgetBackgroundColor=", b11);
            p.c(str2, ", action=", ", corners=", b11, atomActionDTO);
            b11.append(cornersConfig);
            b11.append(", trackingInfo=");
            b11.append(map);
            b11.append(")");
            return b11.toString();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        @NotNull
        public SellerActionsPreviewVO.ProgressLadderCell mapToVo(long widgetId, String asyncData, boolean isSelect) {
            CornersConfig cornersConfig = this.corners;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.iconLeft;
            IconDTO iconDTO2 = this.iconRight;
            int i11 = this.horizontalPadding;
            int i12 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            int i13 = this.verticalPadding;
            AtomActionDTO atomActionDTO = this.action;
            AtomAction atomAction = atomActionDTO != null ? AtomActionMapperKt.toAtomAction(atomActionDTO, this.trackingInfo) : null;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return new SellerActionsPreviewVO.ProgressLadderCell(widgetId, cornersConfig, textDTO, iconDTO, iconDTO2, i11, i13, i12, str, str2, atomAction, isSelect, map != null ? TrackingInfoMapperKt.toTokenizedEvent$default(map, Long.valueOf(widgetId), null, 2, null) : null);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Separator;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Separator;", "", "id", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "<init>", "(IIIILjava/lang/String;)V", "", "widgetId", "asyncData", "", "isSelect", "mapToVo", "(JLjava/lang/String;Z)Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Separator;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator implements SellerActionsPreviewDtoWrapper<SellerActionsPreviewVO.Separator> {

        @NotNull
        private final String containerBgColor;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final int id;
        private final int verticalPadding;

        public Separator(int i11, int i12, int i13, int i14, @NotNull String containerBgColor) {
            Intrinsics.checkNotNullParameter(containerBgColor, "containerBgColor");
            this.id = i11;
            this.horizontalPadding = i12;
            this.verticalPadding = i13;
            this.horizontalMargin = i14;
            this.containerBgColor = containerBgColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Separator)) {
                return false;
            }
            Separator separator = (Separator) other;
            return this.id == separator.id && this.horizontalPadding == separator.horizontalPadding && this.verticalPadding == separator.verticalPadding && this.horizontalMargin == separator.horizontalMargin && Intrinsics.d(this.containerBgColor, separator.containerBgColor);
        }

        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.containerBgColor.hashCode() + C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, Integer.hashCode(this.id) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            int i12 = this.horizontalPadding;
            int i13 = this.verticalPadding;
            int i14 = this.horizontalMargin;
            String str = this.containerBgColor;
            StringBuilder a11 = C2438a.a("Separator(id=", i11, ", horizontalPadding=", ", verticalPadding=", i12);
            a.f(i13, i14, ", horizontalMargin=", ", containerBgColor=", a11);
            return o0.c(a11, str, ")");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper
        @NotNull
        public SellerActionsPreviewVO.Separator mapToVo(long widgetId, String asyncData, boolean isSelect) {
            return new SellerActionsPreviewVO.Separator(widgetId, this.horizontalPadding, this.verticalPadding, this.horizontalMargin, this.containerBgColor);
        }
    }

    int getId();

    @NotNull
    T mapToVo(long widgetId, String asyncData, boolean isSelect);
}
