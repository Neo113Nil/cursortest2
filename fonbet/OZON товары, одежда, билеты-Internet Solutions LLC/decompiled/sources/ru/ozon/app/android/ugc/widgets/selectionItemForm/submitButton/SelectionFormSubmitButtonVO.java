package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import F3.G;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001!B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "entityType", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;", "buttonWrapper", "<init>", "(JLru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;)V", "copy", "(JLru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "getEntityType", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/data/SelectionItemFormDTO$EntityType;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;", "getButtonWrapper", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;", "ButtonWrapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionFormSubmitButtonVO implements c {

    @NotNull
    private final ButtonWrapper buttonWrapper;

    @NotNull
    private final SelectionItemFormDTO.EntityType entityType;
    private final long id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;", "", "<init>", "()V", "updateDisabled", "isDisabled", "", "SingleButton", "DoubleButton", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper$DoubleButton;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper$SingleButton;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ButtonWrapper {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper$DoubleButton;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "firstButton", "secondButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper$DoubleButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getFirstButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondButton", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DoubleButton extends ButtonWrapper {

            @NotNull
            private final ButtonV3DTO firstButton;

            @NotNull
            private final ButtonV3DTO secondButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DoubleButton(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
                super(null);
                Intrinsics.checkNotNullParameter(firstButton, "firstButton");
                Intrinsics.checkNotNullParameter(secondButton, "secondButton");
                this.firstButton = firstButton;
                this.secondButton = secondButton;
            }

            @NotNull
            public final DoubleButton copy(@NotNull ButtonV3DTO firstButton, @NotNull ButtonV3DTO secondButton) {
                Intrinsics.checkNotNullParameter(firstButton, "firstButton");
                Intrinsics.checkNotNullParameter(secondButton, "secondButton");
                return new DoubleButton(firstButton, secondButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleButton)) {
                    return false;
                }
                DoubleButton doubleButton = (DoubleButton) other;
                return Intrinsics.d(this.firstButton, doubleButton.firstButton) && Intrinsics.d(this.secondButton, doubleButton.secondButton);
            }

            @NotNull
            public final ButtonV3DTO getFirstButton() {
                return this.firstButton;
            }

            @NotNull
            public final ButtonV3DTO getSecondButton() {
                return this.secondButton;
            }

            public int hashCode() {
                return this.secondButton.hashCode() + (this.firstButton.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "DoubleButton(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper$SingleButton;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "singleButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO$ButtonWrapper$SingleButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSingleButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SingleButton extends ButtonWrapper {

            @NotNull
            private final ButtonV3DTO singleButton;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleButton(@NotNull ButtonV3DTO singleButton) {
                super(null);
                Intrinsics.checkNotNullParameter(singleButton, "singleButton");
                this.singleButton = singleButton;
            }

            @NotNull
            public final SingleButton copy(@NotNull ButtonV3DTO singleButton) {
                Intrinsics.checkNotNullParameter(singleButton, "singleButton");
                return new SingleButton(singleButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleButton) && Intrinsics.d(this.singleButton, ((SingleButton) other).singleButton);
            }

            @NotNull
            public final ButtonV3DTO getSingleButton() {
                return this.singleButton;
            }

            public int hashCode() {
                return this.singleButton.hashCode();
            }

            @NotNull
            public String toString() {
                return G.b(this.singleButton, "SingleButton(singleButton=", ")");
            }
        }

        public /* synthetic */ ButtonWrapper(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ButtonWrapper updateDisabled(boolean isDisabled) {
            if (this instanceof SingleButton) {
                SingleButton singleButton = (SingleButton) this;
                return singleButton.copy(ButtonV3DTO.copy$default(singleButton.getSingleButton(), null, null, null, null, null, null, Boolean.valueOf(isDisabled), null, null, null, null, null, null, null, null, null, null, 131007, null));
            }
            if (!(this instanceof DoubleButton)) {
                throw new o();
            }
            DoubleButton doubleButton = (DoubleButton) this;
            return doubleButton.copy(ButtonV3DTO.copy$default(doubleButton.getFirstButton(), null, null, null, null, null, null, Boolean.valueOf(isDisabled), null, null, null, null, null, null, null, null, null, null, 131007, null), ButtonV3DTO.copy$default(doubleButton.getSecondButton(), null, null, null, null, null, null, Boolean.valueOf(isDisabled), null, null, null, null, null, null, null, null, null, null, 131007, null));
        }

        private ButtonWrapper() {
        }
    }

    public SelectionFormSubmitButtonVO(long j11, @NotNull SelectionItemFormDTO.EntityType entityType, @NotNull ButtonWrapper buttonWrapper) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(buttonWrapper, "buttonWrapper");
        this.id = j11;
        this.entityType = entityType;
        this.buttonWrapper = buttonWrapper;
    }

    public static /* synthetic */ SelectionFormSubmitButtonVO copy$default(SelectionFormSubmitButtonVO selectionFormSubmitButtonVO, long j11, SelectionItemFormDTO.EntityType entityType, ButtonWrapper buttonWrapper, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = selectionFormSubmitButtonVO.id;
        }
        if ((i11 & 2) != 0) {
            entityType = selectionFormSubmitButtonVO.entityType;
        }
        if ((i11 & 4) != 0) {
            buttonWrapper = selectionFormSubmitButtonVO.buttonWrapper;
        }
        return selectionFormSubmitButtonVO.copy(j11, entityType, buttonWrapper);
    }

    @NotNull
    public final SelectionFormSubmitButtonVO copy(long id2, @NotNull SelectionItemFormDTO.EntityType entityType, @NotNull ButtonWrapper buttonWrapper) {
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(buttonWrapper, "buttonWrapper");
        return new SelectionFormSubmitButtonVO(id2, entityType, buttonWrapper);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFormSubmitButtonVO)) {
            return false;
        }
        SelectionFormSubmitButtonVO selectionFormSubmitButtonVO = (SelectionFormSubmitButtonVO) other;
        return this.id == selectionFormSubmitButtonVO.id && this.entityType == selectionFormSubmitButtonVO.entityType && Intrinsics.d(this.buttonWrapper, selectionFormSubmitButtonVO.buttonWrapper);
    }

    @NotNull
    public final ButtonWrapper getButtonWrapper() {
        return this.buttonWrapper;
    }

    @NotNull
    public final SelectionItemFormDTO.EntityType getEntityType() {
        return this.entityType;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        return this.buttonWrapper.hashCode() + ((this.entityType.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SelectionFormSubmitButtonVO(id=" + this.id + ", entityType=" + this.entityType + ", buttonWrapper=" + this.buttonWrapper + ")";
    }
}
