package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import Bi.b;
import El.C2971a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.t;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.utils.CornersConfig;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "WithCorners", "DsCell", "ProgressLadderCell", "ProgressLadder", "Separator", "Async", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Separator;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$WithCorners;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SellerActionsPreviewVO extends c {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO;", "", "id", "", "asyncData", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Async implements SellerActionsPreviewVO {
        private final String asyncData;
        private final long id;

        public Async(long j11, String str) {
            this.id = j11;
            this.asyncData = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Async)) {
                return false;
            }
            Async async = (Async) other;
            return this.id == async.id && Intrinsics.d(this.asyncData, async.asyncData);
        }

        public final String getAsyncData() {
            return this.asyncData;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.asyncData;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = C2436a.c(this.id, "Async(id=", ", asyncData=", this.asyncData);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull SellerActionsPreviewVO sellerActionsPreviewVO) {
            return null;
        }

        public static int getViewItemKey(@NotNull SellerActionsPreviewVO sellerActionsPreviewVO) {
            return sellerActionsPreviewVO.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b\u0010\u0010/R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$DsCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$WithCorners;", "", "id", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "cornersConfig", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "widgetBackgroundColor", "", "isSelect", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/marketing/utils/CornersConfig;Lru/ozon/uni/atoms/data/dsCell/CellDTO;IIILjava/lang/String;Ljava/lang/String;ZLWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "getCornersConfig", "()Lru/ozon/app/android/marketing/utils/CornersConfig;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "I", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "getWidgetBackgroundColor", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DsCell extends WithCorners {

        @NotNull
        private final CellDTO cell;
        private final String containerBgColor;

        @NotNull
        private final CornersConfig cornersConfig;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final long id;
        private final boolean isSelect;
        private final t tokenizedEvent;
        private final int verticalPadding;

        @NotNull
        private final String widgetBackgroundColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DsCell(long j11, @NotNull CornersConfig cornersConfig, @NotNull CellDTO cell, int i11, int i12, int i13, String str, @NotNull String widgetBackgroundColor, boolean z11, t tVar) {
            super(z11);
            Intrinsics.checkNotNullParameter(cornersConfig, "cornersConfig");
            Intrinsics.checkNotNullParameter(cell, "cell");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            this.id = j11;
            this.cornersConfig = cornersConfig;
            this.cell = cell;
            this.horizontalPadding = i11;
            this.verticalPadding = i12;
            this.horizontalMargin = i13;
            this.containerBgColor = str;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.isSelect = z11;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DsCell)) {
                return false;
            }
            DsCell dsCell = (DsCell) other;
            return this.id == dsCell.id && this.cornersConfig == dsCell.cornersConfig && Intrinsics.d(this.cell, dsCell.cell) && this.horizontalPadding == dsCell.horizontalPadding && this.verticalPadding == dsCell.verticalPadding && this.horizontalMargin == dsCell.horizontalMargin && Intrinsics.d(this.containerBgColor, dsCell.containerBgColor) && Intrinsics.d(this.widgetBackgroundColor, dsCell.widgetBackgroundColor) && this.isSelect == dsCell.isSelect && Intrinsics.d(this.tokenizedEvent, dsCell.tokenizedEvent);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final String getContainerBgColor() {
            return this.containerBgColor;
        }

        @NotNull
        public CornersConfig getCornersConfig() {
            return this.cornersConfig;
        }

        public final int getHorizontalMargin() {
            return this.horizontalMargin;
        }

        public final int getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final int getVerticalPadding() {
            return this.verticalPadding;
        }

        @NotNull
        public final String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, b.c(this.cell, (this.cornersConfig.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31), 31), 31);
            String str = this.containerBgColor;
            int a12 = C3532b.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.widgetBackgroundColor), 31, this.isSelect);
            t tVar = this.tokenizedEvent;
            return a12 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            CornersConfig cornersConfig = this.cornersConfig;
            CellDTO cellDTO = this.cell;
            int i11 = this.horizontalPadding;
            int i12 = this.verticalPadding;
            int i13 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            boolean z11 = this.isSelect;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("DsCell(id=");
            sb2.append(j11);
            sb2.append(", cornersConfig=");
            sb2.append(cornersConfig);
            sb2.append(", cell=");
            sb2.append(cellDTO);
            sb2.append(", horizontalPadding=");
            sb2.append(i11);
            A0.c(i12, i13, ", verticalPadding=", ", horizontalMargin=", sb2);
            a.h(sb2, ", containerBgColor=", str, ", widgetBackgroundColor=", str2);
            C2971a.d(sb2, ", isSelect=", z11, ", tokenizedEvent=", tVar);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u0010\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadder;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$WithCorners;", "", "id", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "cornersConfig", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "progressLadder", "", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "widgetBackgroundColor", "", "isSelect", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/marketing/utils/CornersConfig;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;IIILjava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "getCornersConfig", "()Lru/ozon/app/android/marketing/utils/CornersConfig;", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "getProgressLadder", "()Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "I", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "getWidgetBackgroundColor", "Z", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressLadder extends WithCorners {
        private final AtomAction action;
        private final String containerBgColor;

        @NotNull
        private final CornersConfig cornersConfig;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final long id;
        private final boolean isSelect;

        @NotNull
        private final ProgressLadderDTO progressLadder;
        private final t tokenizedEvent;
        private final int verticalPadding;

        @NotNull
        private final String widgetBackgroundColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressLadder(long j11, @NotNull CornersConfig cornersConfig, @NotNull ProgressLadderDTO progressLadder, int i11, int i12, int i13, String str, @NotNull String widgetBackgroundColor, boolean z11, AtomAction atomAction, t tVar) {
            super(z11);
            Intrinsics.checkNotNullParameter(cornersConfig, "cornersConfig");
            Intrinsics.checkNotNullParameter(progressLadder, "progressLadder");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            this.id = j11;
            this.cornersConfig = cornersConfig;
            this.progressLadder = progressLadder;
            this.horizontalPadding = i11;
            this.verticalPadding = i12;
            this.horizontalMargin = i13;
            this.containerBgColor = str;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.isSelect = z11;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressLadder)) {
                return false;
            }
            ProgressLadder progressLadder = (ProgressLadder) other;
            return this.id == progressLadder.id && this.cornersConfig == progressLadder.cornersConfig && Intrinsics.d(this.progressLadder, progressLadder.progressLadder) && this.horizontalPadding == progressLadder.horizontalPadding && this.verticalPadding == progressLadder.verticalPadding && this.horizontalMargin == progressLadder.horizontalMargin && Intrinsics.d(this.containerBgColor, progressLadder.containerBgColor) && Intrinsics.d(this.widgetBackgroundColor, progressLadder.widgetBackgroundColor) && this.isSelect == progressLadder.isSelect && Intrinsics.d(this.action, progressLadder.action) && Intrinsics.d(this.tokenizedEvent, progressLadder.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getContainerBgColor() {
            return this.containerBgColor;
        }

        @NotNull
        public CornersConfig getCornersConfig() {
            return this.cornersConfig;
        }

        public final int getHorizontalMargin() {
            return this.horizontalMargin;
        }

        public final int getHorizontalPadding() {
            return this.horizontalPadding;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final ProgressLadderDTO getProgressLadder() {
            return this.progressLadder;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final int getVerticalPadding() {
            return this.verticalPadding;
        }

        @NotNull
        public final String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, (this.progressLadder.hashCode() + ((this.cornersConfig.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31, 31), 31), 31);
            String str = this.containerBgColor;
            int a12 = C3532b.a(g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.widgetBackgroundColor), 31, this.isSelect);
            AtomAction atomAction = this.action;
            int hashCode = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            CornersConfig cornersConfig = this.cornersConfig;
            ProgressLadderDTO progressLadderDTO = this.progressLadder;
            int i11 = this.horizontalPadding;
            int i12 = this.verticalPadding;
            int i13 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            boolean z11 = this.isSelect;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("ProgressLadder(id=");
            sb2.append(j11);
            sb2.append(", cornersConfig=");
            sb2.append(cornersConfig);
            sb2.append(", progressLadder=");
            sb2.append(progressLadderDTO);
            sb2.append(", horizontalPadding=");
            sb2.append(i11);
            A0.c(i12, i13, ", verticalPadding=", ", horizontalMargin=", sb2);
            a.h(sb2, ", containerBgColor=", str, ", widgetBackgroundColor=", str2);
            sb2.append(", isSelect=");
            sb2.append(z11);
            sb2.append(", action=");
            sb2.append(atomAction);
            return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b6\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b\u0015\u0010;R\u001f\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$ProgressLadderCell;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$WithCorners;", "", "id", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "cornersConfig", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconLeft", "iconRight", "", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "widgetBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "isSelect", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/marketing/utils/CornersConfig;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;IIILjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;ZLWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/utils/CornersConfig;", "getCornersConfig", "()Lru/ozon/app/android/marketing/utils/CornersConfig;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconLeft", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIconRight", "I", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "getWidgetBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressLadderCell extends WithCorners {
        private final AtomAction action;
        private final String containerBgColor;

        @NotNull
        private final CornersConfig cornersConfig;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final IconDTO iconLeft;
        private final IconDTO iconRight;
        private final long id;
        private final boolean isSelect;
        private final TextDTO title;
        private final t tokenizedEvent;
        private final int verticalPadding;

        @NotNull
        private final String widgetBackgroundColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressLadderCell(long j11, @NotNull CornersConfig cornersConfig, TextDTO textDTO, IconDTO iconDTO, IconDTO iconDTO2, int i11, int i12, int i13, String str, @NotNull String widgetBackgroundColor, AtomAction atomAction, boolean z11, t tVar) {
            super(z11);
            Intrinsics.checkNotNullParameter(cornersConfig, "cornersConfig");
            Intrinsics.checkNotNullParameter(widgetBackgroundColor, "widgetBackgroundColor");
            this.id = j11;
            this.cornersConfig = cornersConfig;
            this.title = textDTO;
            this.iconLeft = iconDTO;
            this.iconRight = iconDTO2;
            this.horizontalPadding = i11;
            this.verticalPadding = i12;
            this.horizontalMargin = i13;
            this.containerBgColor = str;
            this.widgetBackgroundColor = widgetBackgroundColor;
            this.action = atomAction;
            this.isSelect = z11;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressLadderCell)) {
                return false;
            }
            ProgressLadderCell progressLadderCell = (ProgressLadderCell) other;
            return this.id == progressLadderCell.id && this.cornersConfig == progressLadderCell.cornersConfig && Intrinsics.d(this.title, progressLadderCell.title) && Intrinsics.d(this.iconLeft, progressLadderCell.iconLeft) && Intrinsics.d(this.iconRight, progressLadderCell.iconRight) && this.horizontalPadding == progressLadderCell.horizontalPadding && this.verticalPadding == progressLadderCell.verticalPadding && this.horizontalMargin == progressLadderCell.horizontalMargin && Intrinsics.d(this.containerBgColor, progressLadderCell.containerBgColor) && Intrinsics.d(this.widgetBackgroundColor, progressLadderCell.widgetBackgroundColor) && Intrinsics.d(this.action, progressLadderCell.action) && this.isSelect == progressLadderCell.isSelect && Intrinsics.d(this.tokenizedEvent, progressLadderCell.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getContainerBgColor() {
            return this.containerBgColor;
        }

        @NotNull
        public CornersConfig getCornersConfig() {
            return this.cornersConfig;
        }

        public final int getHorizontalMargin() {
            return this.horizontalMargin;
        }

        public final int getHorizontalPadding() {
            return this.horizontalPadding;
        }

        public final IconDTO getIconLeft() {
            return this.iconLeft;
        }

        public final IconDTO getIconRight() {
            return this.iconRight;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final int getVerticalPadding() {
            return this.verticalPadding;
        }

        @NotNull
        public final String getWidgetBackgroundColor() {
            return this.widgetBackgroundColor;
        }

        public int hashCode() {
            int hashCode = (this.cornersConfig.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.iconLeft;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            IconDTO iconDTO2 = this.iconRight;
            int a11 = C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, (hashCode3 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31, 31), 31), 31);
            String str = this.containerBgColor;
            int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.widgetBackgroundColor);
            AtomAction atomAction = this.action;
            int a13 = C3532b.a((a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isSelect);
            t tVar = this.tokenizedEvent;
            return a13 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            CornersConfig cornersConfig = this.cornersConfig;
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.iconLeft;
            IconDTO iconDTO2 = this.iconRight;
            int i11 = this.horizontalPadding;
            int i12 = this.verticalPadding;
            int i13 = this.horizontalMargin;
            String str = this.containerBgColor;
            String str2 = this.widgetBackgroundColor;
            AtomAction atomAction = this.action;
            boolean z11 = this.isSelect;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("ProgressLadderCell(id=");
            sb2.append(j11);
            sb2.append(", cornersConfig=");
            sb2.append(cornersConfig);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", iconLeft=");
            sb2.append(iconDTO);
            sb2.append(", iconRight=");
            sb2.append(iconDTO2);
            sb2.append(", horizontalPadding=");
            sb2.append(i11);
            A0.c(i12, i13, ", verticalPadding=", ", horizontalMargin=", sb2);
            a.h(sb2, ", containerBgColor=", str, ", widgetBackgroundColor=", str2);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", isSelect=");
            sb2.append(z11);
            return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Separator;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO;", "", "id", "", "horizontalPadding", "verticalPadding", "horizontalMargin", "", "containerBgColor", "<init>", "(JIIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getHorizontalPadding", "getVerticalPadding", "getHorizontalMargin", "Ljava/lang/String;", "getContainerBgColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator implements SellerActionsPreviewVO {
        private final String containerBgColor;
        private final int horizontalMargin;
        private final int horizontalPadding;
        private final long id;
        private final int verticalPadding;

        public Separator(long j11, int i11, int i12, int i13, String str) {
            this.id = j11;
            this.horizontalPadding = i11;
            this.verticalPadding = i12;
            this.horizontalMargin = i13;
            this.containerBgColor = str;
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

        public final String getContainerBgColor() {
            return this.containerBgColor;
        }

        public final int getHorizontalMargin() {
            return this.horizontalMargin;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int a11 = C2454a.a(this.horizontalMargin, C2454a.a(this.verticalPadding, C2454a.a(this.horizontalPadding, Long.hashCode(this.id) * 31, 31), 31), 31);
            String str = this.containerBgColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.horizontalPadding;
            int i12 = this.verticalPadding;
            int i13 = this.horizontalMargin;
            String str = this.containerBgColor;
            StringBuilder b11 = Ql.c.b(j11, "Separator(id=", i11, ", horizontalPadding=");
            A0.c(i12, i13, ", verticalPadding=", ", horizontalMargin=", b11);
            return C6594f.a(", containerBgColor=", str, ")", b11);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b'\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$WithCorners;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO;", "", "isSelect", "<init>", "(Z)V", "", "cornerRadius$delegate", "LSc/j;", "getCornerRadius", "()F", "cornerRadius", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WithCorners implements SellerActionsPreviewVO {

        /* renamed from: cornerRadius$delegate, reason: from kotlin metadata */
        @NotNull
        private final InterfaceC4008j cornerRadius;
        public static final int $stable = 8;
        private static final float dp16 = UiExtKt.toPxF(16);
        private static final float dp20 = UiExtKt.toPxF(20);

        public WithCorners(boolean z11) {
            this.cornerRadius = k.b(new SellerActionsPreviewVO$WithCorners$cornerRadius$2(z11));
        }

        public final float getCornerRadius() {
            return ((Number) this.cornerRadius.getValue()).floatValue();
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }
    }
}
