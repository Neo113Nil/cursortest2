package ru.ozon.app.android.favorites.createshoppinglist.data;

import G.g;
import Nh.a;
import Pk0.c;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/data/CreateShoppingListDTO;", "", SuggestionDTO.TYPE_SUGGEST, "", "", "suggestsTitle", "errorForUser", "newListTitle", "sku", "", "hint", "saveButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getSuggests", "()Ljava/util/List;", "getSuggestsTitle", "()Ljava/lang/String;", "getErrorForUser", "getNewListTitle", "getSku", "()J", "getHint", "getSaveButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CreateShoppingListDTO {
    private final String errorForUser;

    @NotNull
    private final String hint;
    private final String newListTitle;

    @NotNull
    private final ButtonV3Atom.LargeButton saveButton;
    private final long sku;
    private final List<String> suggests;
    private final String suggestsTitle;

    public CreateShoppingListDTO(List<String> list, String str, String str2, String str3, long j11, @NotNull String hint, @NotNull ButtonV3Atom.LargeButton saveButton) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.suggests = list;
        this.suggestsTitle = str;
        this.errorForUser = str2;
        this.newListTitle = str3;
        this.sku = j11;
        this.hint = hint;
        this.saveButton = saveButton;
    }

    public static /* synthetic */ CreateShoppingListDTO copy$default(CreateShoppingListDTO createShoppingListDTO, List list, String str, String str2, String str3, long j11, String str4, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = createShoppingListDTO.suggests;
        }
        if ((i11 & 2) != 0) {
            str = createShoppingListDTO.suggestsTitle;
        }
        if ((i11 & 4) != 0) {
            str2 = createShoppingListDTO.errorForUser;
        }
        if ((i11 & 8) != 0) {
            str3 = createShoppingListDTO.newListTitle;
        }
        if ((i11 & 16) != 0) {
            j11 = createShoppingListDTO.sku;
        }
        if ((i11 & 32) != 0) {
            str4 = createShoppingListDTO.hint;
        }
        if ((i11 & 64) != 0) {
            largeButton = createShoppingListDTO.saveButton;
        }
        long j12 = j11;
        String str5 = str2;
        String str6 = str3;
        return createShoppingListDTO.copy(list, str, str5, str6, j12, str4, largeButton);
    }

    public final List<String> component1() {
        return this.suggests;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSuggestsTitle() {
        return this.suggestsTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorForUser() {
        return this.errorForUser;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNewListTitle() {
        return this.newListTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final ButtonV3Atom.LargeButton getSaveButton() {
        return this.saveButton;
    }

    @NotNull
    public final CreateShoppingListDTO copy(List<String> suggests, String suggestsTitle, String errorForUser, String newListTitle, long sku, @NotNull String hint, @NotNull ButtonV3Atom.LargeButton saveButton) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new CreateShoppingListDTO(suggests, suggestsTitle, errorForUser, newListTitle, sku, hint, saveButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateShoppingListDTO)) {
            return false;
        }
        CreateShoppingListDTO createShoppingListDTO = (CreateShoppingListDTO) other;
        return Intrinsics.d(this.suggests, createShoppingListDTO.suggests) && Intrinsics.d(this.suggestsTitle, createShoppingListDTO.suggestsTitle) && Intrinsics.d(this.errorForUser, createShoppingListDTO.errorForUser) && Intrinsics.d(this.newListTitle, createShoppingListDTO.newListTitle) && this.sku == createShoppingListDTO.sku && Intrinsics.d(this.hint, createShoppingListDTO.hint) && Intrinsics.d(this.saveButton, createShoppingListDTO.saveButton);
    }

    public final String getErrorForUser() {
        return this.errorForUser;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    public final String getNewListTitle() {
        return this.newListTitle;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSaveButton() {
        return this.saveButton;
    }

    public final long getSku() {
        return this.sku;
    }

    public final List<String> getSuggests() {
        return this.suggests;
    }

    public final String getSuggestsTitle() {
        return this.suggestsTitle;
    }

    public int hashCode() {
        List<String> list = this.suggests;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.suggestsTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorForUser;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.newListTitle;
        return this.saveButton.hashCode() + g.a(c.a((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.sku), 31, this.hint);
    }

    @NotNull
    public String toString() {
        List<String> list = this.suggests;
        String str = this.suggestsTitle;
        String str2 = this.errorForUser;
        String str3 = this.newListTitle;
        long j11 = this.sku;
        String str4 = this.hint;
        ButtonV3Atom.LargeButton largeButton = this.saveButton;
        StringBuilder a11 = C4055a.a("CreateShoppingListDTO(suggests=", ", suggestsTitle=", str, ", errorForUser=", list);
        a.h(a11, str2, ", newListTitle=", str3, ", sku=");
        a11.append(j11);
        a11.append(", hint=");
        a11.append(str4);
        a11.append(", saveButton=");
        a11.append(largeButton);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ CreateShoppingListDTO(List list, String str, String str2, String str3, long j11, String str4, ButtonV3Atom.LargeButton largeButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, str3, (i11 & 16) != 0 ? 0L : j11, str4, largeButton);
    }
}
