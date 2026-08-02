package ru.ozon.android.messenger.framework.data.requests;

import B90.C2616s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SuspiciousLinkModalDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "link", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getLink", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SuspiciousLinkModalDTO {
    public static final int $stable = DisclaimerDTO.$stable;

    @NotNull
    private final ButtonV3DTO button;
    private final DisclaimerDTO disclaimer;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final TextDTO link;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public SuspiciousLinkModalDTO(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull TextDTO link, DisclaimerDTO disclaimerDTO, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(button, "button");
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.link = link;
        this.disclaimer = disclaimerDTO;
        this.button = button;
    }

    public static /* synthetic */ SuspiciousLinkModalDTO copy$default(SuspiciousLinkModalDTO suspiciousLinkModalDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, DisclaimerDTO disclaimerDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = suspiciousLinkModalDTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = suspiciousLinkModalDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = suspiciousLinkModalDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            textDTO3 = suspiciousLinkModalDTO.link;
        }
        if ((i11 & 16) != 0) {
            disclaimerDTO = suspiciousLinkModalDTO.disclaimer;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = suspiciousLinkModalDTO.button;
        }
        DisclaimerDTO disclaimerDTO2 = disclaimerDTO;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return suspiciousLinkModalDTO.copy(imageDTO, textDTO, textDTO2, textDTO3, disclaimerDTO2, buttonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getLink() {
        return this.link;
    }

    /* renamed from: component5, reason: from getter */
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final SuspiciousLinkModalDTO copy(@NotNull ImageDTO image, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull TextDTO link, DisclaimerDTO disclaimer, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(button, "button");
        return new SuspiciousLinkModalDTO(image, title, subtitle, link, disclaimer, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspiciousLinkModalDTO)) {
            return false;
        }
        SuspiciousLinkModalDTO suspiciousLinkModalDTO = (SuspiciousLinkModalDTO) other;
        return Intrinsics.d(this.image, suspiciousLinkModalDTO.image) && Intrinsics.d(this.title, suspiciousLinkModalDTO.title) && Intrinsics.d(this.subtitle, suspiciousLinkModalDTO.subtitle) && Intrinsics.d(this.link, suspiciousLinkModalDTO.link) && Intrinsics.d(this.disclaimer, suspiciousLinkModalDTO.disclaimer) && Intrinsics.d(this.button, suspiciousLinkModalDTO.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final TextDTO getLink() {
        return this.link;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.link, Ns.b.a(this.subtitle, Ns.b.a(this.title, this.image.hashCode() * 31, 31), 31), 31);
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        return this.button.hashCode() + ((a11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        TextDTO textDTO3 = this.link;
        DisclaimerDTO disclaimerDTO = this.disclaimer;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder d11 = C2616s.d("SuspiciousLinkModalDTO(image=", imageDTO, ", title=", textDTO, ", subtitle=");
        D40.d.e(", link=", ", disclaimer=", d11, textDTO2, textDTO3);
        d11.append(disclaimerDTO);
        d11.append(", button=");
        d11.append(buttonV3DTO);
        d11.append(")");
        return d11.toString();
    }
}
