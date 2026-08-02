package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation;

import B90.C2619v;
import El.C2971a;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data.SellerTransparencyProfileDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010H\u001a\u0004\u0018\u00010G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010L\u001a\u0004\u0018\u00010B8\u0006¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010FR\u0019\u0010N\u001a\u0004\u0018\u00010G8\u0006¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u0017\u0010P\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bP\u0010RR%\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bS\u0010?\u001a\u0004\bT\u0010A¨\u0006U"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatar", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "subscribers", "reviews", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "subscribe", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "share", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "sellerName", "", "Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO;", "trustFactors", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;Lru/ozon/app/android/atoms/data/button/SwitchingButton;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;LWZ/t;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "getSubscribers", "()Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO$StatisticsItem;", "getReviews", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getSubscribe", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getShare", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSellerName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getTrustFactors", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/AtomDTO;", "subscribeSingleAtom", "Lru/ozon/uni/atoms/data/AtomDTO;", "getSubscribeSingleAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "subscribeAction", "Lru/ozon/uni/atoms/af/AtomAction;", "getSubscribeAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "unSubscribeSingleAtom", "getUnSubscribeSingleAtom", "unSubscribeAction", "getUnSubscribeAction", "isActive", "Z", "()Z", "sellerParams", "getSellerParams", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerTransparencyProfileVO implements c {

    @NotNull
    private final IconDTO avatar;
    private final long id;
    private final boolean isActive;

    @NotNull
    private final SellerTransparencyProfileDTO.StatisticsItem reviews;

    @NotNull
    private final TextAtom sellerName;
    private final Map<String, String> sellerParams;

    @NotNull
    private final IconButtonDTO share;

    @NotNull
    private final SwitchingButton subscribe;
    private final AtomAction subscribeAction;

    @NotNull
    private final AtomDTO subscribeSingleAtom;

    @NotNull
    private final SellerTransparencyProfileDTO.StatisticsItem subscribers;
    private final t tokenizedEvent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final List<IconLabelButtonDTO> trustFactors;
    private final AtomAction unSubscribeAction;
    private final AtomDTO unSubscribeSingleAtom;

    public SellerTransparencyProfileVO(long j11, @NotNull IconDTO avatar, @NotNull SellerTransparencyProfileDTO.StatisticsItem subscribers, @NotNull SellerTransparencyProfileDTO.StatisticsItem reviews, @NotNull SwitchingButton subscribe, @NotNull IconButtonDTO share, @NotNull TextAtom sellerName, List<IconLabelButtonDTO> list, t tVar, Map<String, TokenizedTrackingInfo> map) {
        AtomAction atomAction;
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(reviews, "reviews");
        Intrinsics.checkNotNullParameter(subscribe, "subscribe");
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(sellerName, "sellerName");
        this.id = j11;
        this.avatar = avatar;
        this.subscribers = subscribers;
        this.reviews = reviews;
        this.subscribe = subscribe;
        this.share = share;
        this.sellerName = sellerName;
        this.trustFactors = list;
        this.tokenizedEvent = tVar;
        this.trackingInfo = map;
        AtomDTO defaultButton = subscribe.getDefaultButton();
        this.subscribeSingleAtom = defaultButton;
        AtomDTO defaultButton2 = subscribe.getDefaultButton();
        Intrinsics.g(defaultButton2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.LargeButton");
        AtomActionDTO action = ((ButtonV3Atom.LargeButton) defaultButton2).getAction();
        this.subscribeAction = action != null ? AtomActionMapperKt.toAtomAction(action, defaultButton.getTrackingInfo()) : null;
        AtomDTO activeButton = subscribe.getActiveButton();
        this.unSubscribeSingleAtom = activeButton;
        AtomDTO activeButton2 = subscribe.getActiveButton();
        Intrinsics.g(activeButton2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.LargeButton");
        AtomActionDTO action2 = ((ButtonV3Atom.LargeButton) activeButton2).getAction();
        if (action2 != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action2, activeButton != null ? activeButton.getTrackingInfo() : null);
        } else {
            atomAction = null;
        }
        this.unSubscribeAction = atomAction;
        this.isActive = subscribe.isActive();
        AtomDTO defaultButton3 = subscribe.getDefaultButton();
        Intrinsics.g(defaultButton3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.button.ButtonV3Atom.LargeButton");
        AtomActionDTO action3 = ((ButtonV3Atom.LargeButton) defaultButton3).getAction();
        this.sellerParams = action3 != null ? action3.getParams() : null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerTransparencyProfileVO)) {
            return false;
        }
        SellerTransparencyProfileVO sellerTransparencyProfileVO = (SellerTransparencyProfileVO) other;
        return this.id == sellerTransparencyProfileVO.id && Intrinsics.d(this.avatar, sellerTransparencyProfileVO.avatar) && Intrinsics.d(this.subscribers, sellerTransparencyProfileVO.subscribers) && Intrinsics.d(this.reviews, sellerTransparencyProfileVO.reviews) && Intrinsics.d(this.subscribe, sellerTransparencyProfileVO.subscribe) && Intrinsics.d(this.share, sellerTransparencyProfileVO.share) && Intrinsics.d(this.sellerName, sellerTransparencyProfileVO.sellerName) && Intrinsics.d(this.trustFactors, sellerTransparencyProfileVO.trustFactors) && Intrinsics.d(this.tokenizedEvent, sellerTransparencyProfileVO.tokenizedEvent) && Intrinsics.d(this.trackingInfo, sellerTransparencyProfileVO.trackingInfo);
    }

    @NotNull
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final SellerTransparencyProfileDTO.StatisticsItem getReviews() {
        return this.reviews;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextAtom getSellerName() {
        return this.sellerName;
    }

    public final Map<String, String> getSellerParams() {
        return this.sellerParams;
    }

    @NotNull
    public final IconButtonDTO getShare() {
        return this.share;
    }

    @NotNull
    public final AtomDTO getSubscribeSingleAtom() {
        return this.subscribeSingleAtom;
    }

    @NotNull
    public final SellerTransparencyProfileDTO.StatisticsItem getSubscribers() {
        return this.subscribers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final List<IconLabelButtonDTO> getTrustFactors() {
        return this.trustFactors;
    }

    public final AtomDTO getUnSubscribeSingleAtom() {
        return this.unSubscribeSingleAtom;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b((this.share.hashCode() + ((this.subscribe.hashCode() + ((this.reviews.hashCode() + ((this.subscribers.hashCode() + C2971a.a(this.avatar, Long.hashCode(this.id) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31, this.sellerName);
        List<IconLabelButtonDTO> list = this.trustFactors;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.avatar;
        SellerTransparencyProfileDTO.StatisticsItem statisticsItem = this.subscribers;
        SellerTransparencyProfileDTO.StatisticsItem statisticsItem2 = this.reviews;
        SwitchingButton switchingButton = this.subscribe;
        IconButtonDTO iconButtonDTO = this.share;
        TextAtom textAtom = this.sellerName;
        List<IconLabelButtonDTO> list = this.trustFactors;
        t tVar = this.tokenizedEvent;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = D40.c.b("SellerTransparencyProfileVO(id=", j11, ", avatar=", iconDTO);
        b11.append(", subscribers=");
        b11.append(statisticsItem);
        b11.append(", reviews=");
        b11.append(statisticsItem2);
        b11.append(", subscribe=");
        b11.append(switchingButton);
        b11.append(", share=");
        b11.append(iconButtonDTO);
        b11.append(", sellerName=");
        b11.append(textAtom);
        b11.append(", trustFactors=");
        b11.append(list);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(")");
        return b11.toString();
    }
}
