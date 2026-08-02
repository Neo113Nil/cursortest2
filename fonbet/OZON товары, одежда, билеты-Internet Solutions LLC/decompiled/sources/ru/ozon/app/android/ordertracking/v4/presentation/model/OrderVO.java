package ru.ozon.app.android.ordertracking.v4.presentation.model;

import Ak.C2436a;
import Bi.b;
import Fj.c;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b;\u0010.R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0017\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\u0018\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\b\u0018\u0010DR\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\b\u0019\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingItemVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;", "image", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "subtitle", "Lru/ozon/app/android/ordertracking/v4/presentation/model/DescriptionVO;", "description", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "actionBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isFullWidth", "<init>", "(JLru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;Lru/ozon/app/android/ordertracking/v4/presentation/model/DescriptionVO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;", "getImage", "()Lru/ozon/app/android/ordertracking/v4/presentation/model/ImageVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;", "getTitle", "()Lru/ozon/app/android/ordertracking/v4/presentation/model/TitleVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "getSubtitle", "()Lru/ozon/app/android/ordertracking/v4/presentation/model/SubtitleVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/DescriptionVO;", "getDescription", "()Lru/ozon/app/android/ordertracking/v4/presentation/model/DescriptionVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getActionBadge", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderVO extends OrderTrackingItemVO implements AdultVO {
    private final AtomAction action;
    private final BadgeDTO actionBadge;
    private final BadgeDTO badge;
    private final ButtonDTO button;
    private final DescriptionVO description;
    private final long id;

    @NotNull
    private final ImageVO image;
    private final boolean isAdult;
    private final boolean isFullWidth;
    private boolean shouldBlur;
    private final SubtitleVO subtitle;

    @NotNull
    private final TitleVO title;
    private final t tokenizedEvent;

    public /* synthetic */ OrderVO(long j11, ImageVO imageVO, BadgeDTO badgeDTO, TitleVO titleVO, SubtitleVO subtitleVO, DescriptionVO descriptionVO, ButtonDTO buttonDTO, BadgeDTO badgeDTO2, AtomAction atomAction, t tVar, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, imageVO, badgeDTO, titleVO, subtitleVO, descriptionVO, buttonDTO, badgeDTO2, atomAction, tVar, z11, (i11 & 2048) != 0 ? z11 : z12, z13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderVO)) {
            return false;
        }
        OrderVO orderVO = (OrderVO) other;
        return this.id == orderVO.id && Intrinsics.d(this.image, orderVO.image) && Intrinsics.d(this.badge, orderVO.badge) && Intrinsics.d(this.title, orderVO.title) && Intrinsics.d(this.subtitle, orderVO.subtitle) && Intrinsics.d(this.description, orderVO.description) && Intrinsics.d(this.button, orderVO.button) && Intrinsics.d(this.actionBadge, orderVO.actionBadge) && Intrinsics.d(this.action, orderVO.action) && Intrinsics.d(this.tokenizedEvent, orderVO.tokenizedEvent) && this.shouldBlur == orderVO.shouldBlur && this.isAdult == orderVO.isAdult && this.isFullWidth == orderVO.isFullWidth;
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final BadgeDTO getActionBadge() {
        return this.actionBadge;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    public final DescriptionVO getDescription() {
        return this.description;
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingItemVO
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageVO getImage() {
        return this.image;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final SubtitleVO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TitleVO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = (this.image.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode2 = (this.title.hashCode() + ((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31)) * 31;
        SubtitleVO subtitleVO = this.subtitle;
        int hashCode3 = (hashCode2 + (subtitleVO == null ? 0 : subtitleVO.hashCode())) * 31;
        DescriptionVO descriptionVO = this.description;
        int hashCode4 = (hashCode3 + (descriptionVO == null ? 0 : descriptionVO.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        int hashCode5 = (hashCode4 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.actionBadge;
        int hashCode6 = (hashCode5 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        AtomAction atomAction = this.action;
        int hashCode7 = (hashCode6 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isFullWidth) + C3532b.a(C3532b.a((hashCode7 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.shouldBlur), 31, this.isAdult);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: isFullWidth, reason: from getter */
    public final boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageVO imageVO = this.image;
        BadgeDTO badgeDTO = this.badge;
        TitleVO titleVO = this.title;
        SubtitleVO subtitleVO = this.subtitle;
        DescriptionVO descriptionVO = this.description;
        ButtonDTO buttonDTO = this.button;
        BadgeDTO badgeDTO2 = this.actionBadge;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        boolean z11 = this.shouldBlur;
        boolean z12 = this.isAdult;
        boolean z13 = this.isFullWidth;
        StringBuilder sb2 = new StringBuilder("OrderVO(id=");
        sb2.append(j11);
        sb2.append(", image=");
        sb2.append(imageVO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", title=");
        sb2.append(titleVO);
        sb2.append(", subtitle=");
        sb2.append(subtitleVO);
        sb2.append(", description=");
        sb2.append(descriptionVO);
        sb2.append(", button=");
        sb2.append(buttonDTO);
        sb2.append(", actionBadge=");
        sb2.append(badgeDTO2);
        c.e(tVar, ", action=", ", tokenizedEvent=", sb2, atomAction);
        C2436a.e(", shouldBlur=", ", isAdult=", sb2, z11, z12);
        return b.f(sb2, ", isFullWidth=", z13, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderVO(long j11, @NotNull ImageVO image, BadgeDTO badgeDTO, @NotNull TitleVO title, SubtitleVO subtitleVO, DescriptionVO descriptionVO, ButtonDTO buttonDTO, BadgeDTO badgeDTO2, AtomAction atomAction, t tVar, boolean z11, boolean z12, boolean z13) {
        super(j11, null);
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.image = image;
        this.badge = badgeDTO;
        this.title = title;
        this.subtitle = subtitleVO;
        this.description = descriptionVO;
        this.button = buttonDTO;
        this.actionBadge = badgeDTO2;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.shouldBlur = z11;
        this.isAdult = z12;
        this.isFullWidth = z13;
    }
}
