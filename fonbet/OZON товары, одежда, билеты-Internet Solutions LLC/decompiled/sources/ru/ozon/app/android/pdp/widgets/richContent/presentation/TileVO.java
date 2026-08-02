package ru.ozon.app.android.pdp.widgets.richContent.presentation;

import B0.C2454a;
import Co.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b\u0010\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/TileVO;", "", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleBottomMargin", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "imagePosition", "", "isParandja", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ILru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "I", "getTitleBottomMargin", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "getImagePosition", "()Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TileVO {
    private final AtomAction action;

    @NotNull
    private final String image;

    @NotNull
    private final ImagePositionVO imagePosition;
    private final boolean isParandja;
    private final TextDTO text;
    private final TextDTO title;
    private final int titleBottomMargin;
    private final t tokenizedEvent;

    public TileVO(@NotNull String image, TextDTO textDTO, TextDTO textDTO2, int i11, AtomAction atomAction, t tVar, @NotNull ImagePositionVO imagePosition, boolean z11) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
        this.image = image;
        this.text = textDTO;
        this.title = textDTO2;
        this.titleBottomMargin = i11;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.imagePosition = imagePosition;
        this.isParandja = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileVO)) {
            return false;
        }
        TileVO tileVO = (TileVO) other;
        return Intrinsics.d(this.image, tileVO.image) && Intrinsics.d(this.text, tileVO.text) && Intrinsics.d(this.title, tileVO.title) && this.titleBottomMargin == tileVO.titleBottomMargin && Intrinsics.d(this.action, tileVO.action) && Intrinsics.d(this.tokenizedEvent, tileVO.tokenizedEvent) && this.imagePosition == tileVO.imagePosition && this.isParandja == tileVO.isParandja;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final ImagePositionVO getImagePosition() {
        return this.imagePosition;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final int getTitleBottomMargin() {
        return this.titleBottomMargin;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        TextDTO textDTO = this.text;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.title;
        int a11 = C2454a.a(this.titleBottomMargin, (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode3 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isParandja) + ((this.imagePosition.hashCode() + ((hashCode3 + (tVar != null ? tVar.hashCode() : 0)) * 31)) * 31);
    }

    /* renamed from: isParandja, reason: from getter */
    public final boolean getIsParandja() {
        return this.isParandja;
    }

    @NotNull
    public String toString() {
        String str = this.image;
        TextDTO textDTO = this.text;
        TextDTO textDTO2 = this.title;
        int i11 = this.titleBottomMargin;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        ImagePositionVO imagePositionVO = this.imagePosition;
        boolean z11 = this.isParandja;
        StringBuilder b11 = a.b("TileVO(image=", textDTO, str, ", text=", ", title=");
        b11.append(textDTO2);
        b11.append(", titleBottomMargin=");
        b11.append(i11);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", imagePosition=");
        b11.append(imagePositionVO);
        b11.append(", isParandja=");
        b11.append(z11);
        b11.append(")");
        return b11.toString();
    }
}
