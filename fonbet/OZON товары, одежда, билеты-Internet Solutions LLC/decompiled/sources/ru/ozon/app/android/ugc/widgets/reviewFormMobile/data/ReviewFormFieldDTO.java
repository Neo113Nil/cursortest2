package ru.ozon.app.android.ugc.widgets.reviewFormMobile.data;

import B0.C2454a;
import B90.C2618u;
import Bi.b;
import D3.g;
import Ek.a;
import I1.w;
import N3.C3660k;
import T7.P;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.plainText.data.PlainTextDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b`\u0018\u00002\u00020\u0001:\n\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "", "isHidden", "", "()Ljava/lang/Boolean;", "VariantPickerDTO", "CommentDTO", "QuestionsDTO", "AnonymousDTO", "AuthorCellDTO", "CellItemDTO", "DisclaimerItemDTO", "PlainTextItemDTO", "SeparatorItemDTO", "IslandSeparatorItemDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewFormFieldDTO {

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$AnonymousDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "uploadKey", "", "anonymousCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isHidden", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;)V", "getUploadKey", "()Ljava/lang/String;", "getAnonymousCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$AnonymousDTO;", "equals", "other", "", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnonymousDTO implements ReviewFormFieldDTO {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO anonymousCell;
        private final Boolean isHidden;

        @NotNull
        private final String uploadKey;

        public AnonymousDTO(@NotNull String uploadKey, @NotNull CellDTO anonymousCell, Boolean bool) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(anonymousCell, "anonymousCell");
            this.uploadKey = uploadKey;
            this.anonymousCell = anonymousCell;
            this.isHidden = bool;
        }

        public static /* synthetic */ AnonymousDTO copy$default(AnonymousDTO anonymousDTO, String str, CellDTO cellDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = anonymousDTO.uploadKey;
            }
            if ((i11 & 2) != 0) {
                cellDTO = anonymousDTO.anonymousCell;
            }
            if ((i11 & 4) != 0) {
                bool = anonymousDTO.isHidden;
            }
            return anonymousDTO.copy(str, cellDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getAnonymousCell() {
            return this.anonymousCell;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final AnonymousDTO copy(@NotNull String uploadKey, @NotNull CellDTO anonymousCell, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(anonymousCell, "anonymousCell");
            return new AnonymousDTO(uploadKey, anonymousCell, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnonymousDTO)) {
                return false;
            }
            AnonymousDTO anonymousDTO = (AnonymousDTO) other;
            return Intrinsics.d(this.uploadKey, anonymousDTO.uploadKey) && Intrinsics.d(this.anonymousCell, anonymousDTO.anonymousCell) && Intrinsics.d(this.isHidden, anonymousDTO.isHidden);
        }

        @NotNull
        public final CellDTO getAnonymousCell() {
            return this.anonymousCell;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int c11 = b.c(this.anonymousCell, this.uploadKey.hashCode() * 31, 31);
            Boolean bool = this.isHidden;
            return c11 + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            CellDTO cellDTO = this.anonymousCell;
            Boolean bool = this.isHidden;
            StringBuilder sb2 = new StringBuilder("AnonymousDTO(uploadKey=");
            sb2.append(str);
            sb2.append(", anonymousCell=");
            sb2.append(cellDTO);
            sb2.append(", isHidden=");
            return g.d(sb2, bool, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$AuthorCellDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isTopAuthor", "", "isHidden", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$AuthorCellDTO;", "equals", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthorCellDTO implements ReviewFormFieldDTO {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final Boolean isHidden;
        private final Boolean isTopAuthor;

        public AuthorCellDTO(@NotNull CellDTO cell, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.isTopAuthor = bool;
            this.isHidden = bool2;
        }

        public static /* synthetic */ AuthorCellDTO copy$default(AuthorCellDTO authorCellDTO, CellDTO cellDTO, Boolean bool, Boolean bool2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = authorCellDTO.cell;
            }
            if ((i11 & 2) != 0) {
                bool = authorCellDTO.isTopAuthor;
            }
            if ((i11 & 4) != 0) {
                bool2 = authorCellDTO.isHidden;
            }
            return authorCellDTO.copy(cellDTO, bool, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsTopAuthor() {
            return this.isTopAuthor;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final AuthorCellDTO copy(@NotNull CellDTO cell, Boolean isTopAuthor, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new AuthorCellDTO(cell, isTopAuthor, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorCellDTO)) {
                return false;
            }
            AuthorCellDTO authorCellDTO = (AuthorCellDTO) other;
            return Intrinsics.d(this.cell, authorCellDTO.cell) && Intrinsics.d(this.isTopAuthor, authorCellDTO.isTopAuthor) && Intrinsics.d(this.isHidden, authorCellDTO.isHidden);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            Boolean bool = this.isTopAuthor;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isHidden;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        public final Boolean isTopAuthor() {
            return this.isTopAuthor;
        }

        @NotNull
        public String toString() {
            CellDTO cellDTO = this.cell;
            Boolean bool = this.isTopAuthor;
            Boolean bool2 = this.isHidden;
            StringBuilder sb2 = new StringBuilder("AuthorCellDTO(cell=");
            sb2.append(cellDTO);
            sb2.append(", isTopAuthor=");
            sb2.append(bool);
            sb2.append(", isHidden=");
            return g.d(sb2, bool2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CellItemDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isHidden", "", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CellItemDTO;", "equals", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellItemDTO implements ReviewFormFieldDTO {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;
        private final Boolean isHidden;

        public CellItemDTO(@NotNull CellDTO cell, Boolean bool) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.isHidden = bool;
        }

        public static /* synthetic */ CellItemDTO copy$default(CellItemDTO cellItemDTO, CellDTO cellDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = cellItemDTO.cell;
            }
            if ((i11 & 2) != 0) {
                bool = cellItemDTO.isHidden;
            }
            return cellItemDTO.copy(cellDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final CellItemDTO copy(@NotNull CellDTO cell, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new CellItemDTO(cell, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellItemDTO)) {
                return false;
            }
            CellItemDTO cellItemDTO = (CellItemDTO) other;
            return Intrinsics.d(this.cell, cellItemDTO.cell) && Intrinsics.d(this.isHidden, cellItemDTO.isHidden);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            Boolean bool = this.isHidden;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            return "CellItemDTO(cell=" + this.cell + ", isHidden=" + this.isHidden + ")";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ABB\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010,J¨\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00162\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\nHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0015\u0010,¨\u0006C"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "uploadKey", "", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, "hints", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$HintDTO;", "points", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", SuggestionDTO.TYPE_SUGGEST, "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$SuggestsDTO;", "maxLines", "minLines", "maxInputLength", "mediaPickerButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "isHidden", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$SuggestsDTO;IIILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)V", "getUploadKey", "()Ljava/lang/String;", "getPlaceholder", "getValue", "getHints", "()Ljava/util/List;", "getPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "getSuggests", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$SuggestsDTO;", "getMaxLines", "()I", "getMinLines", "getMaxInputLength", "getMediaPickerButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$SuggestsDTO;IIILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO;", "equals", "other", "", "hashCode", "toString", "HintDTO", "SuggestsDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CommentDTO implements ReviewFormFieldDTO {
        public static final int $stable = 8;
        private final List<HintDTO> hints;
        private final Boolean isHidden;
        private final int maxInputLength;
        private final int maxLines;
        private final IconButtonV3DTO mediaPickerButton;
        private final int minLines;
        private final String placeholder;
        private final Integer points;
        private final SuggestsDTO suggests;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String uploadKey;
        private final String value;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$HintDTO;", "", "minInputLength", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "hintTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getMinInputLength", "()I", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getHintTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HintDTO {
            public static final int $stable = 8;
            private final Map<String, TokenizedTrackingInfo> hintTracking;
            private final int minInputLength;

            @NotNull
            private final TextDTO text;

            public HintDTO(int i11, @NotNull TextDTO text, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.minInputLength = i11;
                this.text = text;
                this.hintTracking = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ HintDTO copy$default(HintDTO hintDTO, int i11, TextDTO textDTO, Map map, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = hintDTO.minInputLength;
                }
                if ((i12 & 2) != 0) {
                    textDTO = hintDTO.text;
                }
                if ((i12 & 4) != 0) {
                    map = hintDTO.hintTracking;
                }
                return hintDTO.copy(i11, textDTO, map);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMinInputLength() {
                return this.minInputLength;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.hintTracking;
            }

            @NotNull
            public final HintDTO copy(int minInputLength, @NotNull TextDTO text, Map<String, TokenizedTrackingInfo> hintTracking) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new HintDTO(minInputLength, text, hintTracking);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HintDTO)) {
                    return false;
                }
                HintDTO hintDTO = (HintDTO) other;
                return this.minInputLength == hintDTO.minInputLength && Intrinsics.d(this.text, hintDTO.text) && Intrinsics.d(this.hintTracking, hintDTO.hintTracking);
            }

            public final Map<String, TokenizedTrackingInfo> getHintTracking() {
                return this.hintTracking;
            }

            public final int getMinInputLength() {
                return this.minInputLength;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.text, Integer.hashCode(this.minInputLength) * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.hintTracking;
                return a11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                int i11 = this.minInputLength;
                TextDTO textDTO = this.text;
                return P.f(C4055a.b(textDTO, "HintDTO(minInputLength=", ", text=", ", hintTracking=", i11), this.hintTracking, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$CommentDTO$SuggestsDTO;", "", "placeholders", "", "", "delay", "", "<init>", "(Ljava/util/List;I)V", "getPlaceholders", "()Ljava/util/List;", "getDelay", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuggestsDTO {
            public static final int $stable = 8;
            private final int delay;

            @NotNull
            private final List<String> placeholders;

            public SuggestsDTO(@NotNull List<String> placeholders, int i11) {
                Intrinsics.checkNotNullParameter(placeholders, "placeholders");
                this.placeholders = placeholders;
                this.delay = i11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SuggestsDTO copy$default(SuggestsDTO suggestsDTO, List list, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    list = suggestsDTO.placeholders;
                }
                if ((i12 & 2) != 0) {
                    i11 = suggestsDTO.delay;
                }
                return suggestsDTO.copy(list, i11);
            }

            @NotNull
            public final List<String> component1() {
                return this.placeholders;
            }

            /* renamed from: component2, reason: from getter */
            public final int getDelay() {
                return this.delay;
            }

            @NotNull
            public final SuggestsDTO copy(@NotNull List<String> placeholders, int delay) {
                Intrinsics.checkNotNullParameter(placeholders, "placeholders");
                return new SuggestsDTO(placeholders, delay);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuggestsDTO)) {
                    return false;
                }
                SuggestsDTO suggestsDTO = (SuggestsDTO) other;
                return Intrinsics.d(this.placeholders, suggestsDTO.placeholders) && this.delay == suggestsDTO.delay;
            }

            public final int getDelay() {
                return this.delay;
            }

            @NotNull
            public final List<String> getPlaceholders() {
                return this.placeholders;
            }

            public int hashCode() {
                return Integer.hashCode(this.delay) + (this.placeholders.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "SuggestsDTO(placeholders=" + this.placeholders + ", delay=" + this.delay + ")";
            }
        }

        public CommentDTO(@NotNull String uploadKey, String str, String str2, List<HintDTO> list, Integer num, Map<String, TokenizedTrackingInfo> map, SuggestsDTO suggestsDTO, int i11, int i12, int i13, IconButtonV3DTO iconButtonV3DTO, Boolean bool) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            this.uploadKey = uploadKey;
            this.placeholder = str;
            this.value = str2;
            this.hints = list;
            this.points = num;
            this.trackingInfo = map;
            this.suggests = suggestsDTO;
            this.maxLines = i11;
            this.minLines = i12;
            this.maxInputLength = i13;
            this.mediaPickerButton = iconButtonV3DTO;
            this.isHidden = bool;
        }

        public static /* synthetic */ CommentDTO copy$default(CommentDTO commentDTO, String str, String str2, String str3, List list, Integer num, Map map, SuggestsDTO suggestsDTO, int i11, int i12, int i13, IconButtonV3DTO iconButtonV3DTO, Boolean bool, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = commentDTO.uploadKey;
            }
            if ((i14 & 2) != 0) {
                str2 = commentDTO.placeholder;
            }
            if ((i14 & 4) != 0) {
                str3 = commentDTO.value;
            }
            if ((i14 & 8) != 0) {
                list = commentDTO.hints;
            }
            if ((i14 & 16) != 0) {
                num = commentDTO.points;
            }
            if ((i14 & 32) != 0) {
                map = commentDTO.trackingInfo;
            }
            if ((i14 & 64) != 0) {
                suggestsDTO = commentDTO.suggests;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i11 = commentDTO.maxLines;
            }
            if ((i14 & 256) != 0) {
                i12 = commentDTO.minLines;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i13 = commentDTO.maxInputLength;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iconButtonV3DTO = commentDTO.mediaPickerButton;
            }
            if ((i14 & 2048) != 0) {
                bool = commentDTO.isHidden;
            }
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            Boolean bool2 = bool;
            int i15 = i12;
            int i16 = i13;
            SuggestsDTO suggestsDTO2 = suggestsDTO;
            int i17 = i11;
            Integer num2 = num;
            Map map2 = map;
            return commentDTO.copy(str, str2, str3, list, num2, map2, suggestsDTO2, i17, i15, i16, iconButtonV3DTO2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        /* renamed from: component10, reason: from getter */
        public final int getMaxInputLength() {
            return this.maxInputLength;
        }

        /* renamed from: component11, reason: from getter */
        public final IconButtonV3DTO getMediaPickerButton() {
            return this.mediaPickerButton;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component3, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final List<HintDTO> component4() {
            return this.hints;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getPoints() {
            return this.points;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final SuggestsDTO getSuggests() {
            return this.suggests;
        }

        /* renamed from: component8, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component9, reason: from getter */
        public final int getMinLines() {
            return this.minLines;
        }

        @NotNull
        public final CommentDTO copy(@NotNull String uploadKey, String placeholder, String value, List<HintDTO> hints, Integer points, Map<String, TokenizedTrackingInfo> trackingInfo, SuggestsDTO suggests, int maxLines, int minLines, int maxInputLength, IconButtonV3DTO mediaPickerButton, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            return new CommentDTO(uploadKey, placeholder, value, hints, points, trackingInfo, suggests, maxLines, minLines, maxInputLength, mediaPickerButton, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommentDTO)) {
                return false;
            }
            CommentDTO commentDTO = (CommentDTO) other;
            return Intrinsics.d(this.uploadKey, commentDTO.uploadKey) && Intrinsics.d(this.placeholder, commentDTO.placeholder) && Intrinsics.d(this.value, commentDTO.value) && Intrinsics.d(this.hints, commentDTO.hints) && Intrinsics.d(this.points, commentDTO.points) && Intrinsics.d(this.trackingInfo, commentDTO.trackingInfo) && Intrinsics.d(this.suggests, commentDTO.suggests) && this.maxLines == commentDTO.maxLines && this.minLines == commentDTO.minLines && this.maxInputLength == commentDTO.maxInputLength && Intrinsics.d(this.mediaPickerButton, commentDTO.mediaPickerButton) && Intrinsics.d(this.isHidden, commentDTO.isHidden);
        }

        public final List<HintDTO> getHints() {
            return this.hints;
        }

        public final int getMaxInputLength() {
            return this.maxInputLength;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final IconButtonV3DTO getMediaPickerButton() {
            return this.mediaPickerButton;
        }

        public final int getMinLines() {
            return this.minLines;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Integer getPoints() {
            return this.points;
        }

        public final SuggestsDTO getSuggests() {
            return this.suggests;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = this.uploadKey.hashCode() * 31;
            String str = this.placeholder;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<HintDTO> list = this.hints;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num = this.points;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            SuggestsDTO suggestsDTO = this.suggests;
            int a11 = C2454a.a(this.maxInputLength, C2454a.a(this.minLines, C2454a.a(this.maxLines, (hashCode6 + (suggestsDTO == null ? 0 : suggestsDTO.hashCode())) * 31, 31), 31), 31);
            IconButtonV3DTO iconButtonV3DTO = this.mediaPickerButton;
            int hashCode7 = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            Boolean bool = this.isHidden;
            return hashCode7 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.placeholder;
            String str3 = this.value;
            List<HintDTO> list = this.hints;
            Integer num = this.points;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            SuggestsDTO suggestsDTO = this.suggests;
            int i11 = this.maxLines;
            int i12 = this.minLines;
            int i13 = this.maxInputLength;
            IconButtonV3DTO iconButtonV3DTO = this.mediaPickerButton;
            Boolean bool = this.isHidden;
            StringBuilder d11 = C3660k.d("CommentDTO(uploadKey=", str, ", placeholder=", str2, ", value=");
            w.d(str3, ", hints=", ", points=", d11, list);
            d11.append(num);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(", suggests=");
            d11.append(suggestsDTO);
            d11.append(", maxLines=");
            d11.append(i11);
            d11.append(", minLines=");
            a.f(i12, i13, ", maxInputLength=", ", mediaPickerButton=", d11);
            d11.append(iconButtonV3DTO);
            d11.append(", isHidden=");
            d11.append(bool);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$DisclaimerItemDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "isHidden", "", "<init>", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/lang/Boolean;)V", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$DisclaimerItemDTO;", "equals", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerItemDTO implements ReviewFormFieldDTO {
        public static final int $stable = DisclaimerDTO.$stable;

        @NotNull
        private final DisclaimerDTO disclaimer;
        private final Boolean isHidden;

        public DisclaimerItemDTO(@NotNull DisclaimerDTO disclaimer, Boolean bool) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            this.disclaimer = disclaimer;
            this.isHidden = bool;
        }

        public static /* synthetic */ DisclaimerItemDTO copy$default(DisclaimerItemDTO disclaimerItemDTO, DisclaimerDTO disclaimerDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                disclaimerDTO = disclaimerItemDTO.disclaimer;
            }
            if ((i11 & 2) != 0) {
                bool = disclaimerItemDTO.isHidden;
            }
            return disclaimerItemDTO.copy(disclaimerDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final DisclaimerItemDTO copy(@NotNull DisclaimerDTO disclaimer, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            return new DisclaimerItemDTO(disclaimer, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerItemDTO)) {
                return false;
            }
            DisclaimerItemDTO disclaimerItemDTO = (DisclaimerItemDTO) other;
            return Intrinsics.d(this.disclaimer, disclaimerItemDTO.disclaimer) && Intrinsics.d(this.isHidden, disclaimerItemDTO.isHidden);
        }

        @NotNull
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        public int hashCode() {
            int hashCode = this.disclaimer.hashCode() * 31;
            Boolean bool = this.isHidden;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            return "DisclaimerItemDTO(disclaimer=" + this.disclaimer + ", isHidden=" + this.isHidden + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$IslandSeparatorItemDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "islandSeparator", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "isHidden", "", "<init>", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Ljava/lang/Boolean;)V", "getIslandSeparator", "()Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$IslandSeparatorItemDTO;", "equals", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IslandSeparatorItemDTO implements ReviewFormFieldDTO {
        public static final int $stable = IslandSeparatorDTO.$stable;
        private final Boolean isHidden;

        @NotNull
        private final IslandSeparatorDTO islandSeparator;

        public IslandSeparatorItemDTO(@NotNull IslandSeparatorDTO islandSeparator, Boolean bool) {
            Intrinsics.checkNotNullParameter(islandSeparator, "islandSeparator");
            this.islandSeparator = islandSeparator;
            this.isHidden = bool;
        }

        public static /* synthetic */ IslandSeparatorItemDTO copy$default(IslandSeparatorItemDTO islandSeparatorItemDTO, IslandSeparatorDTO islandSeparatorDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                islandSeparatorDTO = islandSeparatorItemDTO.islandSeparator;
            }
            if ((i11 & 2) != 0) {
                bool = islandSeparatorItemDTO.isHidden;
            }
            return islandSeparatorItemDTO.copy(islandSeparatorDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IslandSeparatorDTO getIslandSeparator() {
            return this.islandSeparator;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final IslandSeparatorItemDTO copy(@NotNull IslandSeparatorDTO islandSeparator, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(islandSeparator, "islandSeparator");
            return new IslandSeparatorItemDTO(islandSeparator, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IslandSeparatorItemDTO)) {
                return false;
            }
            IslandSeparatorItemDTO islandSeparatorItemDTO = (IslandSeparatorItemDTO) other;
            return Intrinsics.d(this.islandSeparator, islandSeparatorItemDTO.islandSeparator) && Intrinsics.d(this.isHidden, islandSeparatorItemDTO.isHidden);
        }

        @NotNull
        public final IslandSeparatorDTO getIslandSeparator() {
            return this.islandSeparator;
        }

        public int hashCode() {
            int hashCode = this.islandSeparator.hashCode() * 31;
            Boolean bool = this.isHidden;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            return "IslandSeparatorItemDTO(islandSeparator=" + this.islandSeparator + ", isHidden=" + this.isHidden + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$PlainTextItemDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", SelectionItemFormDTO.PLAIN_TEXT_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "isHidden", "", "<init>", "(Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;Ljava/lang/Boolean;)V", "getPlainText", "()Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$PlainTextItemDTO;", "equals", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlainTextItemDTO implements ReviewFormFieldDTO {
        public static final int $stable = PlainTextDTO.$stable;
        private final Boolean isHidden;

        @NotNull
        private final PlainTextDTO plainText;

        public PlainTextItemDTO(@NotNull PlainTextDTO plainText, Boolean bool) {
            Intrinsics.checkNotNullParameter(plainText, "plainText");
            this.plainText = plainText;
            this.isHidden = bool;
        }

        public static /* synthetic */ PlainTextItemDTO copy$default(PlainTextItemDTO plainTextItemDTO, PlainTextDTO plainTextDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                plainTextDTO = plainTextItemDTO.plainText;
            }
            if ((i11 & 2) != 0) {
                bool = plainTextItemDTO.isHidden;
            }
            return plainTextItemDTO.copy(plainTextDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PlainTextDTO getPlainText() {
            return this.plainText;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final PlainTextItemDTO copy(@NotNull PlainTextDTO plainText, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(plainText, "plainText");
            return new PlainTextItemDTO(plainText, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlainTextItemDTO)) {
                return false;
            }
            PlainTextItemDTO plainTextItemDTO = (PlainTextItemDTO) other;
            return Intrinsics.d(this.plainText, plainTextItemDTO.plainText) && Intrinsics.d(this.isHidden, plainTextItemDTO.isHidden);
        }

        @NotNull
        public final PlainTextDTO getPlainText() {
            return this.plainText;
        }

        public int hashCode() {
            int hashCode = this.plainText.hashCode() * 31;
            Boolean bool = this.isHidden;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            return "PlainTextItemDTO(plainText=" + this.plainText + ", isHidden=" + this.isHidden + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "uploadKey", "", "questions", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO;", "isHidden", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "getUploadKey", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO;", "equals", "other", "", "hashCode", "", "toString", "QuestionDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class QuestionsDTO implements ReviewFormFieldDTO {
        public static final int $stable = 8;
        private final Boolean isHidden;

        @NotNull
        private final List<QuestionDTO> questions;

        @NotNull
        private final String uploadKey;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "answers", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO$AnswerDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAnswers", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AnswerDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class QuestionDTO {
            public static final int $stable = 8;

            @NotNull
            private final List<AnswerDTO> answers;

            @NotNull
            private final String id;

            @NotNull
            private final TextDTO title;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$QuestionsDTO$QuestionDTO$AnswerDTO;", "", "id", "", "tagButton", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "getId", "()Ljava/lang/String;", "getTagButton", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AnswerDTO {
                public static final int $stable = TagButtonDTO.$stable;

                @NotNull
                private final String id;

                @NotNull
                private final TagButtonDTO tagButton;

                public AnswerDTO(@NotNull String id2, @NotNull TagButtonDTO tagButton) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                    this.id = id2;
                    this.tagButton = tagButton;
                }

                public static /* synthetic */ AnswerDTO copy$default(AnswerDTO answerDTO, String str, TagButtonDTO tagButtonDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = answerDTO.id;
                    }
                    if ((i11 & 2) != 0) {
                        tagButtonDTO = answerDTO.tagButton;
                    }
                    return answerDTO.copy(str, tagButtonDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TagButtonDTO getTagButton() {
                    return this.tagButton;
                }

                @NotNull
                public final AnswerDTO copy(@NotNull String id2, @NotNull TagButtonDTO tagButton) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(tagButton, "tagButton");
                    return new AnswerDTO(id2, tagButton);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AnswerDTO)) {
                        return false;
                    }
                    AnswerDTO answerDTO = (AnswerDTO) other;
                    return Intrinsics.d(this.id, answerDTO.id) && Intrinsics.d(this.tagButton, answerDTO.tagButton);
                }

                @NotNull
                public final String getId() {
                    return this.id;
                }

                @NotNull
                public final TagButtonDTO getTagButton() {
                    return this.tagButton;
                }

                public int hashCode() {
                    return this.tagButton.hashCode() + (this.id.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "AnswerDTO(id=" + this.id + ", tagButton=" + this.tagButton + ")";
                }
            }

            public QuestionDTO(@NotNull String id2, @NotNull TextDTO title, @NotNull List<AnswerDTO> answers) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(answers, "answers");
                this.id = id2;
                this.title = title;
                this.answers = answers;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ QuestionDTO copy$default(QuestionDTO questionDTO, String str, TextDTO textDTO, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = questionDTO.id;
                }
                if ((i11 & 2) != 0) {
                    textDTO = questionDTO.title;
                }
                if ((i11 & 4) != 0) {
                    list = questionDTO.answers;
                }
                return questionDTO.copy(str, textDTO, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            @NotNull
            public final List<AnswerDTO> component3() {
                return this.answers;
            }

            @NotNull
            public final QuestionDTO copy(@NotNull String id2, @NotNull TextDTO title, @NotNull List<AnswerDTO> answers) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(answers, "answers");
                return new QuestionDTO(id2, title, answers);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof QuestionDTO)) {
                    return false;
                }
                QuestionDTO questionDTO = (QuestionDTO) other;
                return Intrinsics.d(this.id, questionDTO.id) && Intrinsics.d(this.title, questionDTO.title) && Intrinsics.d(this.answers, questionDTO.answers);
            }

            @NotNull
            public final List<AnswerDTO> getAnswers() {
                return this.answers;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.answers.hashCode() + Ns.b.a(this.title, this.id.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                TextDTO textDTO = this.title;
                return C2618u.h(Co.a.b("QuestionDTO(id=", textDTO, str, ", title=", ", answers="), this.answers, ")");
            }
        }

        public QuestionsDTO(@NotNull String uploadKey, @NotNull List<QuestionDTO> questions, Boolean bool) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(questions, "questions");
            this.uploadKey = uploadKey;
            this.questions = questions;
            this.isHidden = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QuestionsDTO copy$default(QuestionsDTO questionsDTO, String str, List list, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = questionsDTO.uploadKey;
            }
            if ((i11 & 2) != 0) {
                list = questionsDTO.questions;
            }
            if ((i11 & 4) != 0) {
                bool = questionsDTO.isHidden;
            }
            return questionsDTO.copy(str, list, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        public final List<QuestionDTO> component2() {
            return this.questions;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final QuestionsDTO copy(@NotNull String uploadKey, @NotNull List<QuestionDTO> questions, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(questions, "questions");
            return new QuestionsDTO(uploadKey, questions, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuestionsDTO)) {
                return false;
            }
            QuestionsDTO questionsDTO = (QuestionsDTO) other;
            return Intrinsics.d(this.uploadKey, questionsDTO.uploadKey) && Intrinsics.d(this.questions, questionsDTO.questions) && Intrinsics.d(this.isHidden, questionsDTO.isHidden);
        }

        @NotNull
        public final List<QuestionDTO> getQuestions() {
            return this.questions;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public int hashCode() {
            int b11 = G.g.b(this.uploadKey.hashCode() * 31, 31, this.questions);
            Boolean bool = this.isHidden;
            return b11 + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            List<QuestionDTO> list = this.questions;
            return g.d(Tl.b.f("QuestionsDTO(uploadKey=", str, ", questions=", ", isHidden=", list), this.isHidden, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$SeparatorItemDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "separator", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "isHidden", "", "<init>", "(Lru/ozon/app/android/widgets/separator/SeparatorDTO;Ljava/lang/Boolean;)V", "getSeparator", "()Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/ozon/app/android/widgets/separator/SeparatorDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$SeparatorItemDTO;", "equals", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorItemDTO implements ReviewFormFieldDTO {
        public static final int $stable = 8;
        private final Boolean isHidden;

        @NotNull
        private final SeparatorDTO separator;

        public SeparatorItemDTO(@NotNull SeparatorDTO separator, Boolean bool) {
            Intrinsics.checkNotNullParameter(separator, "separator");
            this.separator = separator;
            this.isHidden = bool;
        }

        public static /* synthetic */ SeparatorItemDTO copy$default(SeparatorItemDTO separatorItemDTO, SeparatorDTO separatorDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                separatorDTO = separatorItemDTO.separator;
            }
            if ((i11 & 2) != 0) {
                bool = separatorItemDTO.isHidden;
            }
            return separatorItemDTO.copy(separatorDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SeparatorDTO getSeparator() {
            return this.separator;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final SeparatorItemDTO copy(@NotNull SeparatorDTO separator, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(separator, "separator");
            return new SeparatorItemDTO(separator, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorItemDTO)) {
                return false;
            }
            SeparatorItemDTO separatorItemDTO = (SeparatorItemDTO) other;
            return Intrinsics.d(this.separator, separatorItemDTO.separator) && Intrinsics.d(this.isHidden, separatorItemDTO.isHidden);
        }

        @NotNull
        public final SeparatorDTO getSeparator() {
            return this.separator;
        }

        public int hashCode() {
            int hashCode = this.separator.hashCode() * 31;
            Boolean bool = this.isHidden;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            return "SeparatorItemDTO(separator=" + this.separator + ", isHidden=" + this.isHidden + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0019JV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\f\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO;", "uploadKey", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "selectionButton", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "variantsHeader", "variants", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO$VariantDTO;", "isHidden", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Boolean;)V", "getUploadKey", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSelectionButton", "()Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "getVariantsHeader", "getVariants", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO;", "equals", "other", "", "hashCode", "", "toString", "VariantDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class VariantPickerDTO implements ReviewFormFieldDTO {
        public static final int $stable = 8;
        private final Boolean isHidden;

        @NotNull
        private final InputSelectButtonDTO selectionButton;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final String uploadKey;
        private final List<VariantDTO> variants;
        private final TextDTO variantsHeader;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/data/ReviewFormFieldDTO$VariantPickerDTO$VariantDTO;", "", "id", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isSelected", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getId", "()Ljava/lang/String;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VariantDTO {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO cell;

            @NotNull
            private final String id;
            private final boolean isSelected;

            public VariantDTO(@NotNull String id2, @NotNull CellDTO cell, boolean z11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.id = id2;
                this.cell = cell;
                this.isSelected = z11;
            }

            public static /* synthetic */ VariantDTO copy$default(VariantDTO variantDTO, String str, CellDTO cellDTO, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = variantDTO.id;
                }
                if ((i11 & 2) != 0) {
                    cellDTO = variantDTO.cell;
                }
                if ((i11 & 4) != 0) {
                    z11 = variantDTO.isSelected;
                }
                return variantDTO.copy(str, cellDTO, z11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CellDTO getCell() {
                return this.cell;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public final VariantDTO copy(@NotNull String id2, @NotNull CellDTO cell, boolean isSelected) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new VariantDTO(id2, cell, isSelected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VariantDTO)) {
                    return false;
                }
                VariantDTO variantDTO = (VariantDTO) other;
                return Intrinsics.d(this.id, variantDTO.id) && Intrinsics.d(this.cell, variantDTO.cell) && this.isSelected == variantDTO.isSelected;
            }

            @NotNull
            public final CellDTO getCell() {
                return this.cell;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSelected) + b.c(this.cell, this.id.hashCode() * 31, 31);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                CellDTO cellDTO = this.cell;
                boolean z11 = this.isSelected;
                StringBuilder sb2 = new StringBuilder("VariantDTO(id=");
                sb2.append(str);
                sb2.append(", cell=");
                sb2.append(cellDTO);
                sb2.append(", isSelected=");
                return Pk0.a.a(")", sb2, z11);
            }
        }

        public VariantPickerDTO(@NotNull String uploadKey, @NotNull TextDTO title, @NotNull InputSelectButtonDTO selectionButton, TextDTO textDTO, List<VariantDTO> list, Boolean bool) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(selectionButton, "selectionButton");
            this.uploadKey = uploadKey;
            this.title = title;
            this.selectionButton = selectionButton;
            this.variantsHeader = textDTO;
            this.variants = list;
            this.isHidden = bool;
        }

        public static /* synthetic */ VariantPickerDTO copy$default(VariantPickerDTO variantPickerDTO, String str, TextDTO textDTO, InputSelectButtonDTO inputSelectButtonDTO, TextDTO textDTO2, List list, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = variantPickerDTO.uploadKey;
            }
            if ((i11 & 2) != 0) {
                textDTO = variantPickerDTO.title;
            }
            if ((i11 & 4) != 0) {
                inputSelectButtonDTO = variantPickerDTO.selectionButton;
            }
            if ((i11 & 8) != 0) {
                textDTO2 = variantPickerDTO.variantsHeader;
            }
            if ((i11 & 16) != 0) {
                list = variantPickerDTO.variants;
            }
            if ((i11 & 32) != 0) {
                bool = variantPickerDTO.isHidden;
            }
            List list2 = list;
            Boolean bool2 = bool;
            return variantPickerDTO.copy(str, textDTO, inputSelectButtonDTO, textDTO2, list2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final InputSelectButtonDTO getSelectionButton() {
            return this.selectionButton;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getVariantsHeader() {
            return this.variantsHeader;
        }

        public final List<VariantDTO> component5() {
            return this.variants;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsHidden() {
            return this.isHidden;
        }

        @NotNull
        public final VariantPickerDTO copy(@NotNull String uploadKey, @NotNull TextDTO title, @NotNull InputSelectButtonDTO selectionButton, TextDTO variantsHeader, List<VariantDTO> variants, Boolean isHidden) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(selectionButton, "selectionButton");
            return new VariantPickerDTO(uploadKey, title, selectionButton, variantsHeader, variants, isHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VariantPickerDTO)) {
                return false;
            }
            VariantPickerDTO variantPickerDTO = (VariantPickerDTO) other;
            return Intrinsics.d(this.uploadKey, variantPickerDTO.uploadKey) && Intrinsics.d(this.title, variantPickerDTO.title) && Intrinsics.d(this.selectionButton, variantPickerDTO.selectionButton) && Intrinsics.d(this.variantsHeader, variantPickerDTO.variantsHeader) && Intrinsics.d(this.variants, variantPickerDTO.variants) && Intrinsics.d(this.isHidden, variantPickerDTO.isHidden);
        }

        @NotNull
        public final InputSelectButtonDTO getSelectionButton() {
            return this.selectionButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        public final List<VariantDTO> getVariants() {
            return this.variants;
        }

        public final TextDTO getVariantsHeader() {
            return this.variantsHeader;
        }

        public int hashCode() {
            int hashCode = (this.selectionButton.hashCode() + Ns.b.a(this.title, this.uploadKey.hashCode() * 31, 31)) * 31;
            TextDTO textDTO = this.variantsHeader;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            List<VariantDTO> list = this.variants;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isHidden;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.ugc.widgets.reviewFormMobile.data.ReviewFormFieldDTO
        public Boolean isHidden() {
            return this.isHidden;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            TextDTO textDTO = this.title;
            InputSelectButtonDTO inputSelectButtonDTO = this.selectionButton;
            TextDTO textDTO2 = this.variantsHeader;
            List<VariantDTO> list = this.variants;
            Boolean bool = this.isHidden;
            StringBuilder b11 = Co.a.b("VariantPickerDTO(uploadKey=", textDTO, str, ", title=", ", selectionButton=");
            b11.append(inputSelectButtonDTO);
            b11.append(", variantsHeader=");
            b11.append(textDTO2);
            b11.append(", variants=");
            b11.append(list);
            b11.append(", isHidden=");
            b11.append(bool);
            b11.append(")");
            return b11.toString();
        }
    }

    Boolean isHidden();
}
