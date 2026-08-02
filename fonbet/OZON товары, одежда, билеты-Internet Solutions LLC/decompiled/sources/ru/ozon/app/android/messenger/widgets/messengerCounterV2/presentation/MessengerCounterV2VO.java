package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.v2.NavbarIconVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/storefront/navBar/v2/NavbarIconVO;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "buttonDto", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicatorDto", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "copy", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButtonDto", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicatorDto", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MessengerCounterV2VO implements c, NavbarIconVO {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;
    private final ButtonV3Atom.SmallIconButton buttonDto;
    private final long id;
    private final IndicatorDTO indicatorDto;

    public MessengerCounterV2VO(long j11, ButtonV3Atom.SmallIconButton smallIconButton, IndicatorDTO indicatorDTO) {
        this.id = j11;
        this.buttonDto = smallIconButton;
        this.indicatorDto = indicatorDTO;
    }

    public static /* synthetic */ MessengerCounterV2VO copy$default(MessengerCounterV2VO messengerCounterV2VO, long j11, ButtonV3Atom.SmallIconButton smallIconButton, IndicatorDTO indicatorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = messengerCounterV2VO.id;
        }
        if ((i11 & 2) != 0) {
            smallIconButton = messengerCounterV2VO.buttonDto;
        }
        if ((i11 & 4) != 0) {
            indicatorDTO = messengerCounterV2VO.indicatorDto;
        }
        return messengerCounterV2VO.copy(j11, smallIconButton, indicatorDTO);
    }

    @NotNull
    public final MessengerCounterV2VO copy(long id2, ButtonV3Atom.SmallIconButton buttonDto, IndicatorDTO indicatorDto) {
        return new MessengerCounterV2VO(id2, buttonDto, indicatorDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessengerCounterV2VO)) {
            return false;
        }
        MessengerCounterV2VO messengerCounterV2VO = (MessengerCounterV2VO) other;
        return this.id == messengerCounterV2VO.id && Intrinsics.d(this.buttonDto, messengerCounterV2VO.buttonDto) && Intrinsics.d(this.indicatorDto, messengerCounterV2VO.indicatorDto);
    }

    public final ButtonV3Atom.SmallIconButton getButtonDto() {
        return this.buttonDto;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IndicatorDTO getIndicatorDto() {
        return this.indicatorDto;
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
        ButtonV3Atom.SmallIconButton smallIconButton = this.buttonDto;
        int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicatorDto;
        return hashCode2 + (indicatorDTO != null ? indicatorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessengerCounterV2VO(id=" + this.id + ", buttonDto=" + this.buttonDto + ", indicatorDto=" + this.indicatorDto + ")";
    }
}
