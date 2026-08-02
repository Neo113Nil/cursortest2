package ru.ozon.app.android.bank.widgets.openBankAccount.data;

import B3.p;
import T7.P;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/bank/widgets/openBankAccount/data/OpenBankAccountDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "subTitle", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "getSubTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OpenBankAccountDTO {
    private final AtomActionDTO action;
    private final String image;
    private final TextAtom subTitle;

    @NotNull
    private final SocialTextAtomDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OpenBankAccountDTO(@i(name = "titleTextAtom") @NotNull SocialTextAtomDTO title, @i(name = "subTitleTextAtom") TextAtom textAtom, @i(name = "rightImage") String str, @i(name = "action") AtomActionDTO atomActionDTO, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subTitle = textAtom;
        this.image = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ OpenBankAccountDTO copy$default(OpenBankAccountDTO openBankAccountDTO, SocialTextAtomDTO socialTextAtomDTO, TextAtom textAtom, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            socialTextAtomDTO = openBankAccountDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom = openBankAccountDTO.subTitle;
        }
        if ((i11 & 4) != 0) {
            str = openBankAccountDTO.image;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = openBankAccountDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = openBankAccountDTO.trackingInfo;
        }
        Map map2 = map;
        String str2 = str;
        return openBankAccountDTO.copy(socialTextAtomDTO, textAtom, str2, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SocialTextAtomDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final OpenBankAccountDTO copy(@i(name = "titleTextAtom") @NotNull SocialTextAtomDTO title, @i(name = "subTitleTextAtom") TextAtom subTitle, @i(name = "rightImage") String image, @i(name = "action") AtomActionDTO action, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OpenBankAccountDTO(title, subTitle, image, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBankAccountDTO)) {
            return false;
        }
        OpenBankAccountDTO openBankAccountDTO = (OpenBankAccountDTO) other;
        return Intrinsics.d(this.title, openBankAccountDTO.title) && Intrinsics.d(this.subTitle, openBankAccountDTO.subTitle) && Intrinsics.d(this.image, openBankAccountDTO.image) && Intrinsics.d(this.action, openBankAccountDTO.action) && Intrinsics.d(this.trackingInfo, openBankAccountDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getImage() {
        return this.image;
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final SocialTextAtomDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subTitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.image;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SocialTextAtomDTO socialTextAtomDTO = this.title;
        TextAtom textAtom = this.subTitle;
        String str = this.image;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OpenBankAccountDTO(title=");
        sb2.append(socialTextAtomDTO);
        sb2.append(", subTitle=");
        sb2.append(textAtom);
        sb2.append(", image=");
        p.c(str, ", action=", ", trackingInfo=", sb2, atomActionDTO);
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ OpenBankAccountDTO(SocialTextAtomDTO socialTextAtomDTO, TextAtom textAtom, String str, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(socialTextAtomDTO, (i11 & 2) != 0 ? null : textAtom, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? null : map);
    }
}
