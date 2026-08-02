package ru.ozon.android.messenger.blocks.emptystate;

import Ak.C2436a;
import B90.C2619v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JH\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/blocks/emptystate/EmptyStateDTO;", "", "imageUrl", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "isFullScreen", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;)V", "getImageUrl", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Boolean;)Lru/ozon/android/messenger/blocks/emptystate/EmptyStateDTO;", "equals", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateDTO {
    public static final int $stable;
    private final TextAtom description;
    private final String imageUrl;
    private final Boolean isFullScreen;
    private final ButtonV3Atom.LargeButton largeButton;

    @NotNull
    private final TextAtom title;

    static {
        int i11 = ButtonV3Atom.LargeButton.$stable;
        int i12 = TextAtom.$stable;
        $stable = i11 | i12 | i12;
    }

    public EmptyStateDTO(String str, @NotNull TextAtom title, TextAtom textAtom, ButtonV3Atom.LargeButton largeButton, Boolean bool) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.imageUrl = str;
        this.title = title;
        this.description = textAtom;
        this.largeButton = largeButton;
        this.isFullScreen = bool;
    }

    public static /* synthetic */ EmptyStateDTO copy$default(EmptyStateDTO emptyStateDTO, String str, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.LargeButton largeButton, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emptyStateDTO.imageUrl;
        }
        if ((i11 & 2) != 0) {
            textAtom = emptyStateDTO.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = emptyStateDTO.description;
        }
        if ((i11 & 8) != 0) {
            largeButton = emptyStateDTO.largeButton;
        }
        if ((i11 & 16) != 0) {
            bool = emptyStateDTO.isFullScreen;
        }
        Boolean bool2 = bool;
        TextAtom textAtom3 = textAtom2;
        return emptyStateDTO.copy(str, textAtom, textAtom3, largeButton, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    @NotNull
    public final EmptyStateDTO copy(String imageUrl, @NotNull TextAtom title, TextAtom description, ButtonV3Atom.LargeButton largeButton, Boolean isFullScreen) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new EmptyStateDTO(imageUrl, title, description, largeButton, isFullScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateDTO)) {
            return false;
        }
        EmptyStateDTO emptyStateDTO = (EmptyStateDTO) other;
        return Intrinsics.d(this.imageUrl, emptyStateDTO.imageUrl) && Intrinsics.d(this.title, emptyStateDTO.title) && Intrinsics.d(this.description, emptyStateDTO.description) && Intrinsics.d(this.largeButton, emptyStateDTO.largeButton) && Intrinsics.d(this.isFullScreen, emptyStateDTO.isFullScreen);
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int b11 = C2619v.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        TextAtom textAtom = this.description;
        int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        int hashCode2 = (hashCode + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Boolean bool = this.isFullScreen;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isFullScreen() {
        return this.isFullScreen;
    }

    @NotNull
    public String toString() {
        String str = this.imageUrl;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        ButtonV3Atom.LargeButton largeButton = this.largeButton;
        Boolean bool = this.isFullScreen;
        StringBuilder d11 = C2436a.d("EmptyStateDTO(imageUrl=", str, ", title=", ", description=", textAtom);
        d11.append(textAtom2);
        d11.append(", largeButton=");
        d11.append(largeButton);
        d11.append(", isFullScreen=");
        return D3.g.d(d11, bool, ")");
    }
}
