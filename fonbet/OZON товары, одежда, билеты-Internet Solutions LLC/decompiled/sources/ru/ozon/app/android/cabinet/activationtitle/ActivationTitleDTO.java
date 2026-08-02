package ru.ozon.app.android.cabinet.activationtitle;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", HammersV3BodyDTO.PLACEHOLDER, "buttonTitle", "description", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getButtonTitle", "getDescription", "getCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActivationTitleDTO {

    @NotNull
    private final String buttonTitle;
    private final String code;
    private final String description;

    @NotNull
    private final String placeholder;

    @NotNull
    private final String title;

    public ActivationTitleDTO(@NotNull String title, @NotNull String placeholder, @NotNull String buttonTitle, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.title = title;
        this.placeholder = placeholder;
        this.buttonTitle = buttonTitle;
        this.description = str;
        this.code = str2;
    }

    public static /* synthetic */ ActivationTitleDTO copy$default(ActivationTitleDTO activationTitleDTO, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = activationTitleDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = activationTitleDTO.placeholder;
        }
        if ((i11 & 4) != 0) {
            str3 = activationTitleDTO.buttonTitle;
        }
        if ((i11 & 8) != 0) {
            str4 = activationTitleDTO.description;
        }
        if ((i11 & 16) != 0) {
            str5 = activationTitleDTO.code;
        }
        String str6 = str5;
        String str7 = str3;
        return activationTitleDTO.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final ActivationTitleDTO copy(@NotNull String title, @NotNull String placeholder, @NotNull String buttonTitle, String description, String code) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        return new ActivationTitleDTO(title, placeholder, buttonTitle, description, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationTitleDTO)) {
            return false;
        }
        ActivationTitleDTO activationTitleDTO = (ActivationTitleDTO) other;
        return Intrinsics.d(this.title, activationTitleDTO.title) && Intrinsics.d(this.placeholder, activationTitleDTO.placeholder) && Intrinsics.d(this.buttonTitle, activationTitleDTO.buttonTitle) && Intrinsics.d(this.description, activationTitleDTO.description) && Intrinsics.d(this.code, activationTitleDTO.code);
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.placeholder), 31, this.buttonTitle);
        String str = this.description;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.placeholder;
        String str3 = this.buttonTitle;
        String str4 = this.description;
        String str5 = this.code;
        StringBuilder d11 = C3660k.d("ActivationTitleDTO(title=", str, ", placeholder=", str2, ", buttonTitle=");
        a.h(d11, str3, ", description=", str4, ", code=");
        return o0.c(d11, str5, ")");
    }
}
