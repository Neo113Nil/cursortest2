package ru.ozon.app.android.storefront.widgets.megaRaffle.data;

import B90.C2619v;
import HY.a;
import Pk0.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/data/ProgressItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "productName", "progress", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "progressImage", "", "image", "subtitle", "subtitleImage", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;FLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProductName", "getProgress", "()F", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getProgressImage", "()Ljava/lang/String;", "getImage", "getSubtitle", "getSubtitleImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProgressItemDTO {
    public static final int $stable = TextAtom.$stable;
    private final AtomActionDTO action;
    private final String image;
    private final TextAtom productName;
    private final float progress;
    private final String progressImage;

    @NotNull
    private final TextAtom subtitle;
    private final String subtitleImage;

    @NotNull
    private final TextAtom title;

    public ProgressItemDTO(@NotNull TextAtom title, TextAtom textAtom, float f7, AtomActionDTO atomActionDTO, String str, String str2, @NotNull TextAtom subtitle, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.title = title;
        this.productName = textAtom;
        this.progress = f7;
        this.action = atomActionDTO;
        this.progressImage = str;
        this.image = str2;
        this.subtitle = subtitle;
        this.subtitleImage = str3;
    }

    public static /* synthetic */ ProgressItemDTO copy$default(ProgressItemDTO progressItemDTO, TextAtom textAtom, TextAtom textAtom2, float f7, AtomActionDTO atomActionDTO, String str, String str2, TextAtom textAtom3, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = progressItemDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = progressItemDTO.productName;
        }
        if ((i11 & 4) != 0) {
            f7 = progressItemDTO.progress;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = progressItemDTO.action;
        }
        if ((i11 & 16) != 0) {
            str = progressItemDTO.progressImage;
        }
        if ((i11 & 32) != 0) {
            str2 = progressItemDTO.image;
        }
        if ((i11 & 64) != 0) {
            textAtom3 = progressItemDTO.subtitle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = progressItemDTO.subtitleImage;
        }
        TextAtom textAtom4 = textAtom3;
        String str4 = str3;
        String str5 = str;
        String str6 = str2;
        return progressItemDTO.copy(textAtom, textAtom2, f7, atomActionDTO, str5, str6, textAtom4, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getProductName() {
        return this.productName;
    }

    /* renamed from: component3, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProgressImage() {
        return this.progressImage;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSubtitleImage() {
        return this.subtitleImage;
    }

    @NotNull
    public final ProgressItemDTO copy(@NotNull TextAtom title, TextAtom productName, float progress, AtomActionDTO action, String progressImage, String image, @NotNull TextAtom subtitle, String subtitleImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new ProgressItemDTO(title, productName, progress, action, progressImage, image, subtitle, subtitleImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressItemDTO)) {
            return false;
        }
        ProgressItemDTO progressItemDTO = (ProgressItemDTO) other;
        return Intrinsics.d(this.title, progressItemDTO.title) && Intrinsics.d(this.productName, progressItemDTO.productName) && Float.compare(this.progress, progressItemDTO.progress) == 0 && Intrinsics.d(this.action, progressItemDTO.action) && Intrinsics.d(this.progressImage, progressItemDTO.progressImage) && Intrinsics.d(this.image, progressItemDTO.image) && Intrinsics.d(this.subtitle, progressItemDTO.subtitle) && Intrinsics.d(this.subtitleImage, progressItemDTO.subtitleImage);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getImage() {
        return this.image;
    }

    public final TextAtom getProductName() {
        return this.productName;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getProgressImage() {
        return this.progressImage;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleImage() {
        return this.subtitleImage;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.productName;
        int a11 = b.a(this.progress, (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.progressImage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int b11 = C2619v.b((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.subtitle);
        String str3 = this.subtitleImage;
        return b11 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.productName;
        float f7 = this.progress;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.progressImage;
        String str2 = this.image;
        TextAtom textAtom3 = this.subtitle;
        String str3 = this.subtitleImage;
        StringBuilder a11 = a.a("ProgressItemDTO(title=", textAtom, ", productName=", textAtom2, ", progress=");
        a11.append(f7);
        a11.append(", action=");
        a11.append(atomActionDTO);
        a11.append(", progressImage=");
        Nh.a.h(a11, str, ", image=", str2, ", subtitle=");
        a11.append(textAtom3);
        a11.append(", subtitleImage=");
        a11.append(str3);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ ProgressItemDTO(TextAtom textAtom, TextAtom textAtom2, float f7, AtomActionDTO atomActionDTO, String str, String str2, TextAtom textAtom3, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, (i11 & 4) != 0 ? 0.0f : f7, atomActionDTO, str, str2, textAtom3, str3);
    }
}
