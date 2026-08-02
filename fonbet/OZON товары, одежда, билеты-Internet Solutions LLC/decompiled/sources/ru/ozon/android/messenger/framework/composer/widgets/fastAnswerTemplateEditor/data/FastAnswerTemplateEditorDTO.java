package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.data;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/data/FastAnswerTemplateEditorDTO;", "", "fastAnswerInput", "Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/data/TextAreaDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/data/TextAreaDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getFastAnswerInput", "()Lru/ozon/android/messenger/framework/composer/widgets/fastAnswerTemplateEditor/data/TextAreaDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FastAnswerTemplateEditorDTO {
    public static final int $stable = 0;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final TextAreaDTO fastAnswerInput;

    public FastAnswerTemplateEditorDTO(@i(name = "textArea") @NotNull TextAreaDTO fastAnswerInput, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(fastAnswerInput, "fastAnswerInput");
        Intrinsics.checkNotNullParameter(button, "button");
        this.fastAnswerInput = fastAnswerInput;
        this.button = button;
    }

    public static /* synthetic */ FastAnswerTemplateEditorDTO copy$default(FastAnswerTemplateEditorDTO fastAnswerTemplateEditorDTO, TextAreaDTO textAreaDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAreaDTO = fastAnswerTemplateEditorDTO.fastAnswerInput;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = fastAnswerTemplateEditorDTO.button;
        }
        return fastAnswerTemplateEditorDTO.copy(textAreaDTO, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAreaDTO getFastAnswerInput() {
        return this.fastAnswerInput;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final FastAnswerTemplateEditorDTO copy(@i(name = "textArea") @NotNull TextAreaDTO fastAnswerInput, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(fastAnswerInput, "fastAnswerInput");
        Intrinsics.checkNotNullParameter(button, "button");
        return new FastAnswerTemplateEditorDTO(fastAnswerInput, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastAnswerTemplateEditorDTO)) {
            return false;
        }
        FastAnswerTemplateEditorDTO fastAnswerTemplateEditorDTO = (FastAnswerTemplateEditorDTO) other;
        return Intrinsics.d(this.fastAnswerInput, fastAnswerTemplateEditorDTO.fastAnswerInput) && Intrinsics.d(this.button, fastAnswerTemplateEditorDTO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final TextAreaDTO getFastAnswerInput() {
        return this.fastAnswerInput;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.fastAnswerInput.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FastAnswerTemplateEditorDTO(fastAnswerInput=" + this.fastAnswerInput + ", button=" + this.button + ")";
    }
}
