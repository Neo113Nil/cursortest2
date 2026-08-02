package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v1.presentation;

import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import G.g;
import Lc.a;
import Ve.C4598rp;
import WZ.t;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import we0.m;
import we0.n;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u000e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b=\u00101R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010\"R\u001f\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\bI\u00101¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v1/presentation/HotelsPageMapPreviewVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lwe0/m;", "pinCoordinate", "Lru/ozon/uni/atoms/data/button/Icon;", "pinIcon", "", "pinCacheKey", "Landroid/graphics/PointF;", "pinAnchorPoint", "Lwe0/n;", "boundingBox", "moveToCoordinate", "Lru/ozon/uni/atoms/af/AtomAction;", "selectAction", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "copyButton", "", "cornerRadius", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "locationPoint", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lwe0/m;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Landroid/graphics/PointF;Lwe0/n;Lwe0/m;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;ILWZ/t;Lwe0/m;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Lwe0/m;", "getPinCoordinate", "()Lwe0/m;", "Lru/ozon/uni/atoms/data/button/Icon;", "getPinIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getPinCacheKey", "Landroid/graphics/PointF;", "getPinAnchorPoint", "()Landroid/graphics/PointF;", "Lwe0/n;", "getBoundingBox", "()Lwe0/n;", "getMoveToCoordinate", "Lru/ozon/uni/atoms/af/AtomAction;", "getSelectAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getCopyButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "I", "getCornerRadius", "LWZ/t;", "getViewEvent", "()LWZ/t;", "getLocationPoint", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageMapPreviewVO implements c {

    @NotNull
    private final n boundingBox;

    @NotNull
    private final LinkButtonVO copyButton;
    private final int cornerRadius;
    private final long id;
    private final m locationPoint;

    @NotNull
    private final m moveToCoordinate;

    @NotNull
    private final PointF pinAnchorPoint;

    @NotNull
    private final String pinCacheKey;

    @NotNull
    private final m pinCoordinate;

    @NotNull
    private final Icon pinIcon;

    @NotNull
    private final AtomAction selectAction;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t viewEvent;

    public HotelsPageMapPreviewVO(long j11, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull m pinCoordinate, @NotNull Icon pinIcon, @NotNull String pinCacheKey, @NotNull PointF pinAnchorPoint, @NotNull n boundingBox, @NotNull m moveToCoordinate, @NotNull AtomAction selectAction, @NotNull LinkButtonVO copyButton, int i11, t tVar, m mVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(pinCoordinate, "pinCoordinate");
        Intrinsics.checkNotNullParameter(pinIcon, "pinIcon");
        Intrinsics.checkNotNullParameter(pinCacheKey, "pinCacheKey");
        Intrinsics.checkNotNullParameter(pinAnchorPoint, "pinAnchorPoint");
        Intrinsics.checkNotNullParameter(boundingBox, "boundingBox");
        Intrinsics.checkNotNullParameter(moveToCoordinate, "moveToCoordinate");
        Intrinsics.checkNotNullParameter(selectAction, "selectAction");
        Intrinsics.checkNotNullParameter(copyButton, "copyButton");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.pinCoordinate = pinCoordinate;
        this.pinIcon = pinIcon;
        this.pinCacheKey = pinCacheKey;
        this.pinAnchorPoint = pinAnchorPoint;
        this.boundingBox = boundingBox;
        this.moveToCoordinate = moveToCoordinate;
        this.selectAction = selectAction;
        this.copyButton = copyButton;
        this.cornerRadius = i11;
        this.viewEvent = tVar;
        this.locationPoint = mVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageMapPreviewVO)) {
            return false;
        }
        HotelsPageMapPreviewVO hotelsPageMapPreviewVO = (HotelsPageMapPreviewVO) other;
        return this.id == hotelsPageMapPreviewVO.id && Intrinsics.d(this.title, hotelsPageMapPreviewVO.title) && Intrinsics.d(this.subtitle, hotelsPageMapPreviewVO.subtitle) && Intrinsics.d(this.pinCoordinate, hotelsPageMapPreviewVO.pinCoordinate) && Intrinsics.d(this.pinIcon, hotelsPageMapPreviewVO.pinIcon) && Intrinsics.d(this.pinCacheKey, hotelsPageMapPreviewVO.pinCacheKey) && Intrinsics.d(this.pinAnchorPoint, hotelsPageMapPreviewVO.pinAnchorPoint) && Intrinsics.d(this.boundingBox, hotelsPageMapPreviewVO.boundingBox) && Intrinsics.d(this.moveToCoordinate, hotelsPageMapPreviewVO.moveToCoordinate) && Intrinsics.d(this.selectAction, hotelsPageMapPreviewVO.selectAction) && Intrinsics.d(this.copyButton, hotelsPageMapPreviewVO.copyButton) && this.cornerRadius == hotelsPageMapPreviewVO.cornerRadius && Intrinsics.d(this.viewEvent, hotelsPageMapPreviewVO.viewEvent) && Intrinsics.d(this.locationPoint, hotelsPageMapPreviewVO.locationPoint);
    }

    @NotNull
    public final n getBoundingBox() {
        return this.boundingBox;
    }

    @NotNull
    public final LinkButtonVO getCopyButton() {
        return this.copyButton;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final m getLocationPoint() {
        return this.locationPoint;
    }

    @NotNull
    public final m getMoveToCoordinate() {
        return this.moveToCoordinate;
    }

    @NotNull
    public final PointF getPinAnchorPoint() {
        return this.pinAnchorPoint;
    }

    @NotNull
    public final String getPinCacheKey() {
        return this.pinCacheKey;
    }

    @NotNull
    public final m getPinCoordinate() {
        return this.pinCoordinate;
    }

    @NotNull
    public final Icon getPinIcon() {
        return this.pinIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final AtomAction getSelectAction() {
        return this.selectAction;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.cornerRadius, (this.copyButton.hashCode() + C4598rp.a(this.selectAction, (this.moveToCoordinate.hashCode() + ((this.boundingBox.hashCode() + ((this.pinAnchorPoint.hashCode() + g.a(a.a(this.pinIcon, (this.pinCoordinate.hashCode() + C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle)) * 31, 31), 31, this.pinCacheKey)) * 31)) * 31)) * 31, 31)) * 31, 31);
        t tVar = this.viewEvent;
        int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        m mVar = this.locationPoint;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        m mVar = this.pinCoordinate;
        Icon icon = this.pinIcon;
        String str = this.pinCacheKey;
        PointF pointF = this.pinAnchorPoint;
        n nVar = this.boundingBox;
        m mVar2 = this.moveToCoordinate;
        AtomAction atomAction = this.selectAction;
        LinkButtonVO linkButtonVO = this.copyButton;
        int i11 = this.cornerRadius;
        t tVar = this.viewEvent;
        m mVar3 = this.locationPoint;
        StringBuilder c11 = C2639a.c("HotelsPageMapPreviewVO(id=", j11, ", title=", textAtom);
        c11.append(", subtitle=");
        c11.append(textAtom2);
        c11.append(", pinCoordinate=");
        c11.append(mVar);
        c11.append(", pinIcon=");
        c11.append(icon);
        c11.append(", pinCacheKey=");
        c11.append(str);
        c11.append(", pinAnchorPoint=");
        c11.append(pointF);
        c11.append(", boundingBox=");
        c11.append(nVar);
        c11.append(", moveToCoordinate=");
        c11.append(mVar2);
        c11.append(", selectAction=");
        c11.append(atomAction);
        c11.append(", copyButton=");
        c11.append(linkButtonVO);
        c11.append(", cornerRadius=");
        c11.append(i11);
        c11.append(", viewEvent=");
        c11.append(tVar);
        c11.append(", locationPoint=");
        c11.append(mVar3);
        c11.append(")");
        return c11.toString();
    }
}
