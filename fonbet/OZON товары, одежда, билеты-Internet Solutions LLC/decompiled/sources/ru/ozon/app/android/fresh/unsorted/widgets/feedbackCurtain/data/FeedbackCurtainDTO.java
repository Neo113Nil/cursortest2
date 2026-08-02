package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data;

import B90.C2619v;
import G.g;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackCurtainDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "hint", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/Map;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHint", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FeedbackCurtainDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton button;

    @NotNull
    private final String hint;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public FeedbackCurtainDTO(@NotNull ButtonV3Atom.LargeButton button, @NotNull TextAtom title, @NotNull String hint, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.button = button;
        this.title = title;
        this.hint = hint;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackCurtainDTO copy$default(FeedbackCurtainDTO feedbackCurtainDTO, ButtonV3Atom.LargeButton largeButton, TextAtom textAtom, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = feedbackCurtainDTO.button;
        }
        if ((i11 & 2) != 0) {
            textAtom = feedbackCurtainDTO.title;
        }
        if ((i11 & 4) != 0) {
            str = feedbackCurtainDTO.hint;
        }
        if ((i11 & 8) != 0) {
            map = feedbackCurtainDTO.trackingInfo;
        }
        return feedbackCurtainDTO.copy(largeButton, textAtom, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final FeedbackCurtainDTO copy(@NotNull ButtonV3Atom.LargeButton button, @NotNull TextAtom title, @NotNull String hint, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hint, "hint");
        return new FeedbackCurtainDTO(button, title, hint, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackCurtainDTO)) {
            return false;
        }
        FeedbackCurtainDTO feedbackCurtainDTO = (FeedbackCurtainDTO) other;
        return Intrinsics.d(this.button, feedbackCurtainDTO.button) && Intrinsics.d(this.title, feedbackCurtainDTO.title) && Intrinsics.d(this.hint, feedbackCurtainDTO.hint) && Intrinsics.d(this.trackingInfo, feedbackCurtainDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(C2619v.b(this.button.hashCode() * 31, 31, this.title), 31, this.hint);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.LargeButton largeButton = this.button;
        TextAtom textAtom = this.title;
        String str = this.hint;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("FeedbackCurtainDTO(button=");
        sb2.append(largeButton);
        sb2.append(", title=");
        sb2.append(textAtom);
        sb2.append(", hint=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
