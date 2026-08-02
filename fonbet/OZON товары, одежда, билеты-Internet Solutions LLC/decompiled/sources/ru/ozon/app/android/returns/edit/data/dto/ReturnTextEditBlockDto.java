package ru.ozon.app.android.returns.edit.data.dto;

import D3.g;
import K1.G;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/edit/data/dto/ReturnTextEditBlockDto;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "validationText", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTextArea", "()Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "getValidationText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnTextEditBlockDto {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final RmsTextAreaDto textArea;

    @NotNull
    private final TextDTO title;
    private final String validationText;

    public ReturnTextEditBlockDto(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull RmsTextAreaDto textArea, String str, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.subtitle = subtitle;
        this.textArea = textArea;
        this.validationText = str;
        this.action = action;
    }

    public static /* synthetic */ ReturnTextEditBlockDto copy$default(ReturnTextEditBlockDto returnTextEditBlockDto, TextDTO textDTO, TextDTO textDTO2, RmsTextAreaDto rmsTextAreaDto, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = returnTextEditBlockDto.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = returnTextEditBlockDto.subtitle;
        }
        if ((i11 & 4) != 0) {
            rmsTextAreaDto = returnTextEditBlockDto.textArea;
        }
        if ((i11 & 8) != 0) {
            str = returnTextEditBlockDto.validationText;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = returnTextEditBlockDto.action;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        RmsTextAreaDto rmsTextAreaDto2 = rmsTextAreaDto;
        return returnTextEditBlockDto.copy(textDTO, textDTO2, rmsTextAreaDto2, str, atomActionDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RmsTextAreaDto getTextArea() {
        return this.textArea;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValidationText() {
        return this.validationText;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ReturnTextEditBlockDto copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull RmsTextAreaDto textArea, String validationText, @NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ReturnTextEditBlockDto(title, subtitle, textArea, validationText, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnTextEditBlockDto)) {
            return false;
        }
        ReturnTextEditBlockDto returnTextEditBlockDto = (ReturnTextEditBlockDto) other;
        return Intrinsics.d(this.title, returnTextEditBlockDto.title) && Intrinsics.d(this.subtitle, returnTextEditBlockDto.subtitle) && Intrinsics.d(this.textArea, returnTextEditBlockDto.textArea) && Intrinsics.d(this.validationText, returnTextEditBlockDto.validationText) && Intrinsics.d(this.action, returnTextEditBlockDto.action);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final RmsTextAreaDto getTextArea() {
        return this.textArea;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final String getValidationText() {
        return this.validationText;
    }

    public int hashCode() {
        int hashCode = (this.textArea.hashCode() + b.a(this.subtitle, this.title.hashCode() * 31, 31)) * 31;
        String str = this.validationText;
        return this.action.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        RmsTextAreaDto rmsTextAreaDto = this.textArea;
        String str = this.validationText;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder g10 = g.g("ReturnTextEditBlockDto(title=", textDTO, ", subtitle=", textDTO2, ", textArea=");
        g10.append(rmsTextAreaDto);
        g10.append(", validationText=");
        g10.append(str);
        g10.append(", action=");
        return G.c(g10, atomActionDTO, ")");
    }
}
