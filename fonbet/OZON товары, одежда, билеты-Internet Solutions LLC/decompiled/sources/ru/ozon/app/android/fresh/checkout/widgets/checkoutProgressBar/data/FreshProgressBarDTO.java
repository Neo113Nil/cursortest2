package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "", "duration", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getDuration", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshProgressBarDTO {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final String duration;
    private final TextAtom title;

    public FreshProgressBarDTO(@NotNull String duration, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.duration = duration;
        this.title = textAtom;
    }

    public static /* synthetic */ FreshProgressBarDTO copy$default(FreshProgressBarDTO freshProgressBarDTO, String str, TextAtom textAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = freshProgressBarDTO.duration;
        }
        if ((i11 & 2) != 0) {
            textAtom = freshProgressBarDTO.title;
        }
        return freshProgressBarDTO.copy(str, textAtom);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final FreshProgressBarDTO copy(@NotNull String duration, TextAtom title) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        return new FreshProgressBarDTO(duration, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshProgressBarDTO)) {
            return false;
        }
        FreshProgressBarDTO freshProgressBarDTO = (FreshProgressBarDTO) other;
        return Intrinsics.d(this.duration, freshProgressBarDTO.duration) && Intrinsics.d(this.title, freshProgressBarDTO.title);
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.duration.hashCode() * 31;
        TextAtom textAtom = this.title;
        return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        return "FreshProgressBarDTO(duration=" + this.duration + ", title=" + this.title + ")";
    }
}
