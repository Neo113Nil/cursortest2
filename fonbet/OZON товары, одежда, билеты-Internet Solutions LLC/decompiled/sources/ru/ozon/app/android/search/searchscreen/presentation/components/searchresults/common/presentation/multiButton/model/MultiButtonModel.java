package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model;

import Bl.b;
import Ep.a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel;", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;", "buttonModel", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "footerLabelTextHeight", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;", "getButtonModel", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;", "Lru/ozon/uni/atoms/data/AtomDTO;", "getText", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Ljava/lang/Integer;", "getFooterLabelTextHeight", "()Ljava/lang/Integer;", "setFooterLabelTextHeight", "(Ljava/lang/Integer;)V", "ButtonModel", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MultiButtonModel {
    private final ButtonModel buttonModel;
    private Integer footerLabelTextHeight;
    private final AtomDTO text;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;", "", "", "widgetId", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "Lru/ozon/uni/atoms/data/AtomDTO;", "button", "<init>", "(JZLru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Z", "()Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonModel {
        public static final int $stable = AtomDTO.$stable;

        @NotNull
        private final AtomDTO button;
        private final boolean isAdult;
        private final long widgetId;

        public ButtonModel(long j11, boolean z11, @NotNull AtomDTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.widgetId = j11;
            this.isAdult = z11;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonModel)) {
                return false;
            }
            ButtonModel buttonModel = (ButtonModel) other;
            return this.widgetId == buttonModel.widgetId && this.isAdult == buttonModel.isAdult && Intrinsics.d(this.button, buttonModel.button);
        }

        @NotNull
        public final AtomDTO getButton() {
            return this.button;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return this.button.hashCode() + C3532b.a(Long.hashCode(this.widgetId) * 31, 31, this.isAdult);
        }

        /* renamed from: isAdult, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            long j11 = this.widgetId;
            boolean z11 = this.isAdult;
            AtomDTO atomDTO = this.button;
            StringBuilder c11 = b.c(j11, "ButtonModel(widgetId=", ", isAdult=", z11);
            c11.append(", button=");
            c11.append(atomDTO);
            c11.append(")");
            return c11.toString();
        }
    }

    public MultiButtonModel(ButtonModel buttonModel, AtomDTO atomDTO, Integer num) {
        this.buttonModel = buttonModel;
        this.text = atomDTO;
        this.footerLabelTextHeight = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiButtonModel)) {
            return false;
        }
        MultiButtonModel multiButtonModel = (MultiButtonModel) other;
        return Intrinsics.d(this.buttonModel, multiButtonModel.buttonModel) && Intrinsics.d(this.text, multiButtonModel.text) && Intrinsics.d(this.footerLabelTextHeight, multiButtonModel.footerLabelTextHeight);
    }

    public final ButtonModel getButtonModel() {
        return this.buttonModel;
    }

    public final Integer getFooterLabelTextHeight() {
        return this.footerLabelTextHeight;
    }

    public final AtomDTO getText() {
        return this.text;
    }

    public int hashCode() {
        ButtonModel buttonModel = this.buttonModel;
        int hashCode = (buttonModel == null ? 0 : buttonModel.hashCode()) * 31;
        AtomDTO atomDTO = this.text;
        int hashCode2 = (hashCode + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        Integer num = this.footerLabelTextHeight;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setFooterLabelTextHeight(Integer num) {
        this.footerLabelTextHeight = num;
    }

    @NotNull
    public String toString() {
        ButtonModel buttonModel = this.buttonModel;
        AtomDTO atomDTO = this.text;
        Integer num = this.footerLabelTextHeight;
        StringBuilder sb2 = new StringBuilder("MultiButtonModel(buttonModel=");
        sb2.append(buttonModel);
        sb2.append(", text=");
        sb2.append(atomDTO);
        sb2.append(", footerLabelTextHeight=");
        return a.c(sb2, num, ")");
    }

    public /* synthetic */ MultiButtonModel(ButtonModel buttonModel, AtomDTO atomDTO, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonModel, atomDTO, (i11 & 4) != 0 ? null : num);
    }
}
