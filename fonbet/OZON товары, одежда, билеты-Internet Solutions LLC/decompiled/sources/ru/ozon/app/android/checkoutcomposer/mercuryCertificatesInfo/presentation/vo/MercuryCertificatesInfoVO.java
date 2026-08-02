package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesInfo.presentation.vo;

import B0.A0;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001:\u000223BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b+\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "aspectList", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "caption", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;", "settings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "getAspectList", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAddress", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCaption", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;", "getSettings", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "AspectListVO", "SettingsVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MercuryCertificatesInfoVO implements c {
    private final CellDTO address;
    private final AspectListVO aspectList;
    private final TextDTO caption;
    private final long id;
    private final SettingsVO settings;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO;", "", "", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO$AspectItemVO;", "items", "", "selectedItemIndex", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getSelectedItemIndex", "AspectItemVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AspectListVO {

        @NotNull
        private final List<AspectItemVO> items;
        private final int selectedItemIndex;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$AspectListVO$AspectItemVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AspectItemVO {
            public static final int $stable = AtomAction.$stable;
            private final AtomAction action;

            @NotNull
            private final TextDTO text;

            public AspectItemVO(@NotNull TextDTO text, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AspectItemVO)) {
                    return false;
                }
                AspectItemVO aspectItemVO = (AspectItemVO) other;
                return Intrinsics.d(this.text, aspectItemVO.text) && Intrinsics.d(this.action, aspectItemVO.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                AtomAction atomAction = this.action;
                return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
            }

            @NotNull
            public String toString() {
                return "AspectItemVO(text=" + this.text + ", action=" + this.action + ")";
            }
        }

        public AspectListVO(@NotNull List<AspectItemVO> items, int i11) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.selectedItemIndex = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AspectListVO)) {
                return false;
            }
            AspectListVO aspectListVO = (AspectListVO) other;
            return Intrinsics.d(this.items, aspectListVO.items) && this.selectedItemIndex == aspectListVO.selectedItemIndex;
        }

        @NotNull
        public final List<AspectItemVO> getItems() {
            return this.items;
        }

        public final int getSelectedItemIndex() {
            return this.selectedItemIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectedItemIndex) + (this.items.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AspectListVO(items=" + this.items + ", selectedItemIndex=" + this.selectedItemIndex + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesInfo/presentation/vo/MercuryCertificatesInfoVO$SettingsVO;", "", "", "backgroundColor", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsVO {
        private final String backgroundColor;

        public SettingsVO(String str) {
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SettingsVO) && Intrinsics.d(this.backgroundColor, ((SettingsVO) other).backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("SettingsVO(backgroundColor=", this.backgroundColor, ")");
        }
    }

    public MercuryCertificatesInfoVO(long j11, @NotNull TextDTO title, TextDTO textDTO, AspectListVO aspectListVO, CellDTO cellDTO, TextDTO textDTO2, SettingsVO settingsVO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.aspectList = aspectListVO;
        this.address = cellDTO;
        this.caption = textDTO2;
        this.settings = settingsVO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MercuryCertificatesInfoVO)) {
            return false;
        }
        MercuryCertificatesInfoVO mercuryCertificatesInfoVO = (MercuryCertificatesInfoVO) other;
        return this.id == mercuryCertificatesInfoVO.id && Intrinsics.d(this.title, mercuryCertificatesInfoVO.title) && Intrinsics.d(this.subtitle, mercuryCertificatesInfoVO.subtitle) && Intrinsics.d(this.aspectList, mercuryCertificatesInfoVO.aspectList) && Intrinsics.d(this.address, mercuryCertificatesInfoVO.address) && Intrinsics.d(this.caption, mercuryCertificatesInfoVO.caption) && Intrinsics.d(this.settings, mercuryCertificatesInfoVO.settings) && Intrinsics.d(this.tokenizedEvent, mercuryCertificatesInfoVO.tokenizedEvent);
    }

    public final CellDTO getAddress() {
        return this.address;
    }

    public final AspectListVO getAspectList() {
        return this.aspectList;
    }

    public final TextDTO getCaption() {
        return this.caption;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SettingsVO getSettings() {
        return this.settings;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AspectListVO aspectListVO = this.aspectList;
        int hashCode2 = (hashCode + (aspectListVO == null ? 0 : aspectListVO.hashCode())) * 31;
        CellDTO cellDTO = this.address;
        int hashCode3 = (hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.caption;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        SettingsVO settingsVO = this.settings;
        int hashCode5 = (hashCode4 + (settingsVO == null ? 0 : settingsVO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        AspectListVO aspectListVO = this.aspectList;
        CellDTO cellDTO = this.address;
        TextDTO textDTO3 = this.caption;
        SettingsVO settingsVO = this.settings;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("MercuryCertificatesInfoVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", aspectList=");
        b11.append(aspectListVO);
        b11.append(", address=");
        b11.append(cellDTO);
        b11.append(", caption=");
        b11.append(textDTO3);
        b11.append(", settings=");
        b11.append(settingsVO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
