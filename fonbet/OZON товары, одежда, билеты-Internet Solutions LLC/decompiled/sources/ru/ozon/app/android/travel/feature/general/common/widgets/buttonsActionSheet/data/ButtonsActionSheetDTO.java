package ru.ozon.app.android.travel.feature.general.common.widgets.buttonsActionSheet.data;

import B90.C2618u;
import HY.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonsActionSheet/data/ButtonsActionSheetDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "actions", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getActions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonsActionSheetDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3Atom.LargeButton> actions;
    private final TextAtom subtitle;
    private final TextAtom title;

    public ButtonsActionSheetDTO(TextAtom textAtom, TextAtom textAtom2, @NotNull List<ButtonV3Atom.LargeButton> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.actions = actions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonsActionSheetDTO copy$default(ButtonsActionSheetDTO buttonsActionSheetDTO, TextAtom textAtom, TextAtom textAtom2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = buttonsActionSheetDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = buttonsActionSheetDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = buttonsActionSheetDTO.actions;
        }
        return buttonsActionSheetDTO.copy(textAtom, textAtom2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<ButtonV3Atom.LargeButton> component3() {
        return this.actions;
    }

    @NotNull
    public final ButtonsActionSheetDTO copy(TextAtom title, TextAtom subtitle, @NotNull List<ButtonV3Atom.LargeButton> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new ButtonsActionSheetDTO(title, subtitle, actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsActionSheetDTO)) {
            return false;
        }
        ButtonsActionSheetDTO buttonsActionSheetDTO = (ButtonsActionSheetDTO) other;
        return Intrinsics.d(this.title, buttonsActionSheetDTO.title) && Intrinsics.d(this.subtitle, buttonsActionSheetDTO.subtitle) && Intrinsics.d(this.actions, buttonsActionSheetDTO.actions);
    }

    @NotNull
    public final List<ButtonV3Atom.LargeButton> getActions() {
        return this.actions;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.subtitle;
        return this.actions.hashCode() + ((hashCode + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        return C2618u.h(a.a("ButtonsActionSheetDTO(title=", textAtom, ", subtitle=", textAtom2, ", actions="), this.actions, ")");
    }

    public ButtonsActionSheetDTO(TextAtom textAtom, TextAtom textAtom2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, (i11 & 4) != 0 ? K.f71697a : list);
    }
}
