package ru.ozon.android.messenger.blocks.disclaimer;

import B90.C2619v;
import C.o0;
import Cm.e;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/blocks/disclaimer/DisclaimerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "backgroundColor", "", "backgroundImage", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getButtons", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DisclaimerDTO {
    public static final int $stable;

    @NotNull
    private final String backgroundColor;
    private final String backgroundImage;
    private final List<ButtonV3Atom.SmallBorderlessButton> buttons;

    @NotNull
    private final TextAtom description;
    private final TextAtom title;

    static {
        int i11 = ButtonV3Atom.SmallBorderlessButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public DisclaimerDTO(TextAtom textAtom, @NotNull TextAtom description, List<ButtonV3Atom.SmallBorderlessButton> list, @NotNull String backgroundColor, String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = textAtom;
        this.description = description;
        this.buttons = list;
        this.backgroundColor = backgroundColor;
        this.backgroundImage = str;
    }

    public static /* synthetic */ DisclaimerDTO copy$default(DisclaimerDTO disclaimerDTO, TextAtom textAtom, TextAtom textAtom2, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = disclaimerDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = disclaimerDTO.description;
        }
        if ((i11 & 4) != 0) {
            list = disclaimerDTO.buttons;
        }
        if ((i11 & 8) != 0) {
            str = disclaimerDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            str2 = disclaimerDTO.backgroundImage;
        }
        String str3 = str2;
        List list2 = list;
        return disclaimerDTO.copy(textAtom, textAtom2, list2, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    public final List<ButtonV3Atom.SmallBorderlessButton> component3() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final DisclaimerDTO copy(TextAtom title, @NotNull TextAtom description, List<ButtonV3Atom.SmallBorderlessButton> buttons, @NotNull String backgroundColor, String backgroundImage) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new DisclaimerDTO(title, description, buttons, backgroundColor, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerDTO)) {
            return false;
        }
        DisclaimerDTO disclaimerDTO = (DisclaimerDTO) other;
        return Intrinsics.d(this.title, disclaimerDTO.title) && Intrinsics.d(this.description, disclaimerDTO.description) && Intrinsics.d(this.buttons, disclaimerDTO.buttons) && Intrinsics.d(this.backgroundColor, disclaimerDTO.backgroundColor) && Intrinsics.d(this.backgroundImage, disclaimerDTO.backgroundImage);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final List<ButtonV3Atom.SmallBorderlessButton> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final TextAtom getDescription() {
        return this.description;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int b11 = C2619v.b((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.description);
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        int a11 = g.a((b11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.backgroundColor);
        String str = this.backgroundImage;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        String str = this.backgroundColor;
        String str2 = this.backgroundImage;
        StringBuilder a11 = HY.a.a("DisclaimerDTO(title=", textAtom, ", description=", textAtom2, ", buttons=");
        e.i(", backgroundColor=", str, ", backgroundImage=", a11, list);
        return o0.c(a11, str2, ")");
    }
}
