package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.data;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/DisclaimerV2DTO;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "paddings", "Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;Ljava/lang/String;)V", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getPaddings", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DisclaimerV2DTO {
    public static final int $stable = DisclaimerDTO.$stable;
    private final String backgroundColor;

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final LayoutPaddings paddings;

    public DisclaimerV2DTO(@NotNull DisclaimerDTO disclaimer, LayoutPaddings layoutPaddings, String str) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.disclaimer = disclaimer;
        this.paddings = layoutPaddings;
        this.backgroundColor = str;
    }

    public static /* synthetic */ DisclaimerV2DTO copy$default(DisclaimerV2DTO disclaimerV2DTO, DisclaimerDTO disclaimerDTO, LayoutPaddings layoutPaddings, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerDTO = disclaimerV2DTO.disclaimer;
        }
        if ((i11 & 2) != 0) {
            layoutPaddings = disclaimerV2DTO.paddings;
        }
        if ((i11 & 4) != 0) {
            str = disclaimerV2DTO.backgroundColor;
        }
        return disclaimerV2DTO.copy(disclaimerDTO, layoutPaddings, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component2, reason: from getter */
    public final LayoutPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DisclaimerV2DTO copy(@NotNull DisclaimerDTO disclaimer, LayoutPaddings paddings, String backgroundColor) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new DisclaimerV2DTO(disclaimer, paddings, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerV2DTO)) {
            return false;
        }
        DisclaimerV2DTO disclaimerV2DTO = (DisclaimerV2DTO) other;
        return Intrinsics.d(this.disclaimer, disclaimerV2DTO.disclaimer) && Intrinsics.d(this.paddings, disclaimerV2DTO.paddings) && Intrinsics.d(this.backgroundColor, disclaimerV2DTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    public final LayoutPaddings getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        int hashCode = this.disclaimer.hashCode() * 31;
        LayoutPaddings layoutPaddings = this.paddings;
        int hashCode2 = (hashCode + (layoutPaddings == null ? 0 : layoutPaddings.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        LayoutPaddings layoutPaddings = this.paddings;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("DisclaimerV2DTO(disclaimer=");
        sb2.append(disclaimerDTO);
        sb2.append(", paddings=");
        sb2.append(layoutPaddings);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
