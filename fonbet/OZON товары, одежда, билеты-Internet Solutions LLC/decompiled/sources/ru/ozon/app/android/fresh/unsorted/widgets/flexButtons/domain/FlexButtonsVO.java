package ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.domain;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import G.g;
import K00.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.data.FlexButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "buttonsArrangement", "<init>", "(JLjava/util/List;LWZ/t;Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "getButtonsArrangement", "()Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "Spacers", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FlexButtonsVO implements c {

    @NotNull
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final FlexButtonsDTO.ButtonsArrangement buttonsArrangement;
    private final long id;

    @NotNull
    private final Spacers spacers;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/domain/FlexButtonsVO$Spacers;", "", "", "left", "right", "top", "bottom", "betweenButtons", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getRight", "getTop", "getBottom", "getBetweenButtons", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final int betweenButtons;
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public Spacers(int i11, int i12, int i13, int i14, int i15) {
            this.left = i11;
            this.right = i12;
            this.top = i13;
            this.bottom = i14;
            this.betweenButtons = i15;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.left == spacers.left && this.right == spacers.right && this.top == spacers.top && this.bottom == spacers.bottom && this.betweenButtons == spacers.betweenButtons;
        }

        public final int getBetweenButtons() {
            return this.betweenButtons;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.betweenButtons) + C2454a.a(this.bottom, C2454a.a(this.top, C2454a.a(this.right, Integer.hashCode(this.left) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.left;
            int i12 = this.right;
            int i13 = this.top;
            int i14 = this.bottom;
            int i15 = this.betweenButtons;
            StringBuilder a11 = C2438a.a("Spacers(left=", i11, ", right=", ", top=", i12);
            a.f(i13, i14, ", bottom=", ", betweenButtons=", a11);
            return b.e(i15, ")", a11);
        }
    }

    public FlexButtonsVO(long j11, @NotNull List<ButtonV3DTO> buttons, t tVar, @NotNull Spacers spacers, @NotNull FlexButtonsDTO.ButtonsArrangement buttonsArrangement) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(buttonsArrangement, "buttonsArrangement");
        this.id = j11;
        this.buttons = buttons;
        this.tokenizedEvent = tVar;
        this.spacers = spacers;
        this.buttonsArrangement = buttonsArrangement;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexButtonsVO)) {
            return false;
        }
        FlexButtonsVO flexButtonsVO = (FlexButtonsVO) other;
        return this.id == flexButtonsVO.id && Intrinsics.d(this.buttons, flexButtonsVO.buttons) && Intrinsics.d(this.tokenizedEvent, flexButtonsVO.tokenizedEvent) && Intrinsics.d(this.spacers, flexButtonsVO.spacers) && this.buttonsArrangement == flexButtonsVO.buttonsArrangement;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final FlexButtonsDTO.ButtonsArrangement getButtonsArrangement() {
        return this.buttonsArrangement;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.buttons);
        t tVar = this.tokenizedEvent;
        return this.buttonsArrangement.hashCode() + ((this.spacers.hashCode() + ((b11 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ButtonV3DTO> list = this.buttons;
        t tVar = this.tokenizedEvent;
        Spacers spacers = this.spacers;
        FlexButtonsDTO.ButtonsArrangement buttonsArrangement = this.buttonsArrangement;
        StringBuilder b11 = Lh.b.b(j11, "FlexButtonsVO(id=", ", buttons=", list);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", spacers=");
        b11.append(spacers);
        b11.append(", buttonsArrangement=");
        b11.append(buttonsArrangement);
        b11.append(")");
        return b11.toString();
    }
}
