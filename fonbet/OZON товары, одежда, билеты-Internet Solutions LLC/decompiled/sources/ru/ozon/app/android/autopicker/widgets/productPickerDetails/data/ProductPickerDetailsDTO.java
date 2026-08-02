package ru.ozon.app.android.autopicker.widgets.productPickerDetails.data;

import G.g;
import GR.b;
import H3.c;
import Nh.a;
import T7.P;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005&'()*B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "", "selector", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SelectorDTO;", "sections", "", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SectionDTO;", "stickyBlock", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO;", "resetButton", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderless;", "currentState", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "<init>", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SelectorDTO;Ljava/util/List;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO;Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderless;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;)V", "getSelector", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SelectorDTO;", "getSections", "()Ljava/util/List;", "getStickyBlock", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO;", "getResetButton", "()Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderless;", "getCurrentState", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SelectorDTO", "StickyBlockDTO", "SectionDTO", "CellDTO", "CurrentState", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductPickerDetailsDTO {

    @NotNull
    private final CurrentState currentState;
    private final CommonButton.ButtonBorderless resetButton;

    @NotNull
    private final List<SectionDTO> sections;
    private final SelectorDTO selector;

    @NotNull
    private final StickyBlockDTO stickyBlock;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "getCell", "()Lru/ozon/uni/atoms/data/AtomDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellDTO {

        @NotNull
        private final AtomDTO cell;

        public CellDTO(@NotNull AtomDTO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
        }

        public static /* synthetic */ CellDTO copy$default(CellDTO cellDTO, AtomDTO atomDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomDTO = cellDTO.cell;
            }
            return cellDTO.copy(atomDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomDTO getCell() {
            return this.cell;
        }

        @NotNull
        public final CellDTO copy(@NotNull AtomDTO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new CellDTO(cell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CellDTO) && Intrinsics.d(this.cell, ((CellDTO) other).cell);
        }

        @NotNull
        public final AtomDTO getCell() {
            return this.cell;
        }

        public int hashCode() {
            return this.cell.hashCode();
        }

        @NotNull
        public String toString() {
            return "CellDTO(cell=" + this.cell + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "params", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getActionType", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CurrentState {

        @NotNull
        private final String actionType;

        @NotNull
        private final Map<String, String> params;

        public CurrentState(@NotNull String actionType, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(params, "params");
            this.actionType = actionType;
            this.params = params;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CurrentState copy$default(CurrentState currentState, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = currentState.actionType;
            }
            if ((i11 & 2) != 0) {
                map = currentState.params;
            }
            return currentState.copy(str, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getActionType() {
            return this.actionType;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.params;
        }

        @NotNull
        public final CurrentState copy(@NotNull String actionType, @NotNull Map<String, String> params) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(params, "params");
            return new CurrentState(actionType, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CurrentState)) {
                return false;
            }
            CurrentState currentState = (CurrentState) other;
            return Intrinsics.d(this.actionType, currentState.actionType) && Intrinsics.d(this.params, currentState.params);
        }

        @NotNull
        public final String getActionType() {
            return this.actionType;
        }

        @NotNull
        public final Map<String, String> getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode() + (this.actionType.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("CurrentState(actionType=", this.actionType, ", params=", ")", this.params);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SectionDTO;", "", "rows", "", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CellDTO;", "<init>", "(Ljava/util/List;)V", "getRows", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionDTO {

        @NotNull
        private final List<CellDTO> rows;

        public SectionDTO(@NotNull List<CellDTO> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.rows = rows;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SectionDTO copy$default(SectionDTO sectionDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = sectionDTO.rows;
            }
            return sectionDTO.copy(list);
        }

        @NotNull
        public final List<CellDTO> component1() {
            return this.rows;
        }

        @NotNull
        public final SectionDTO copy(@NotNull List<CellDTO> rows) {
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new SectionDTO(rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SectionDTO) && Intrinsics.d(this.rows, ((SectionDTO) other).rows);
        }

        @NotNull
        public final List<CellDTO> getRows() {
            return this.rows;
        }

        public int hashCode() {
            return this.rows.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("SectionDTO(rows=", ")", this.rows);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SelectorDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "tags", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectorDTO {

        @NotNull
        private final List<TagV3Atom.TagAtom> tags;

        @NotNull
        private final OzonSpannableString title;

        public SelectorDTO(@NotNull OzonSpannableString title, @NotNull List<TagV3Atom.TagAtom> tags) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.title = title;
            this.tags = tags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectorDTO copy$default(SelectorDTO selectorDTO, OzonSpannableString ozonSpannableString, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = selectorDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = selectorDTO.tags;
            }
            return selectorDTO.copy(ozonSpannableString, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        public final List<TagV3Atom.TagAtom> component2() {
            return this.tags;
        }

        @NotNull
        public final SelectorDTO copy(@NotNull OzonSpannableString title, @NotNull List<TagV3Atom.TagAtom> tags) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tags, "tags");
            return new SelectorDTO(title, tags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorDTO)) {
                return false;
            }
            SelectorDTO selectorDTO = (SelectorDTO) other;
            return Intrinsics.d(this.title, selectorDTO.title) && Intrinsics.d(this.tags, selectorDTO.tags);
        }

        @NotNull
        public final List<TagV3Atom.TagAtom> getTags() {
            return this.tags;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.tags.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            return "SelectorDTO(title=" + ((Object) ozonSpannableString) + ", tags=" + this.tags + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO;", "", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$RestrictionDTO;", "button", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$ButtonDTO;", "<init>", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$RestrictionDTO;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$ButtonDTO;)V", "getRestriction", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$RestrictionDTO;", "getButton", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$ButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RestrictionDTO", "ButtonDTO", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class StickyBlockDTO {

        @NotNull
        private final ButtonDTO button;
        private final RestrictionDTO restriction;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$ButtonDTO;", "", "type", "Lru/ozon/uni/atoms/data/Type;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/Type;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ButtonDTO {

            @NotNull
            private final AtomActionDTO action;

            @NotNull
            private final OzonSpannableString text;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final Type type;

            public ButtonDTO(@NotNull Type type, @NotNull OzonSpannableString text, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(action, "action");
                this.type = type;
                this.text = text;
                this.action = action;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ButtonDTO copy$default(ButtonDTO buttonDTO, Type type, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    type = buttonDTO.type;
                }
                if ((i11 & 2) != 0) {
                    ozonSpannableString = buttonDTO.text;
                }
                if ((i11 & 4) != 0) {
                    atomActionDTO = buttonDTO.action;
                }
                if ((i11 & 8) != 0) {
                    map = buttonDTO.trackingInfo;
                }
                return buttonDTO.copy(type, ozonSpannableString, atomActionDTO, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final ButtonDTO copy(@NotNull Type type, @NotNull OzonSpannableString text, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(action, "action");
                return new ButtonDTO(type, text, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonDTO)) {
                    return false;
                }
                ButtonDTO buttonDTO = (ButtonDTO) other;
                return this.type == buttonDTO.type && Intrinsics.d(this.text, buttonDTO.text) && Intrinsics.d(this.action, buttonDTO.action) && Intrinsics.d(this.trackingInfo, buttonDTO.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.action, P.c(this.text, this.type.hashCode() * 31, 31), 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return b11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                Type type = this.type;
                OzonSpannableString ozonSpannableString = this.text;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("ButtonDTO(type=");
                sb2.append(type);
                sb2.append(", text=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", action=");
                return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO$RestrictionDTO;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "image", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "()Ljava/lang/String;", "getImage", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RestrictionDTO {

            @NotNull
            private final String image;

            @NotNull
            private final OzonSpannableString text;
            private final String textColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public RestrictionDTO(@NotNull OzonSpannableString text, String str, @NotNull String image, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(image, "image");
                this.text = text;
                this.textColor = str;
                this.image = image;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RestrictionDTO copy$default(RestrictionDTO restrictionDTO, OzonSpannableString ozonSpannableString, String str, String str2, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = restrictionDTO.text;
                }
                if ((i11 & 2) != 0) {
                    str = restrictionDTO.textColor;
                }
                if ((i11 & 4) != 0) {
                    str2 = restrictionDTO.image;
                }
                if ((i11 & 8) != 0) {
                    map = restrictionDTO.trackingInfo;
                }
                return restrictionDTO.copy(ozonSpannableString, str, str2, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTextColor() {
                return this.textColor;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final RestrictionDTO copy(@NotNull OzonSpannableString text, String textColor, @NotNull String image, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(image, "image");
                return new RestrictionDTO(text, textColor, image, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RestrictionDTO)) {
                    return false;
                }
                RestrictionDTO restrictionDTO = (RestrictionDTO) other;
                return Intrinsics.d(this.text, restrictionDTO.text) && Intrinsics.d(this.textColor, restrictionDTO.textColor) && Intrinsics.d(this.image, restrictionDTO.image) && Intrinsics.d(this.trackingInfo, restrictionDTO.trackingInfo);
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final String getTextColor() {
                return this.textColor;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.textColor;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.image);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return a11 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.text;
                String str = this.textColor;
                return C4070a.a(b.f("RestrictionDTO(text=", ozonSpannableString, ", textColor=", str, ", image="), this.image, ", trackingInfo=", this.trackingInfo, ")");
            }
        }

        public StickyBlockDTO(RestrictionDTO restrictionDTO, @NotNull ButtonDTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.restriction = restrictionDTO;
            this.button = button;
        }

        public static /* synthetic */ StickyBlockDTO copy$default(StickyBlockDTO stickyBlockDTO, RestrictionDTO restrictionDTO, ButtonDTO buttonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                restrictionDTO = stickyBlockDTO.restriction;
            }
            if ((i11 & 2) != 0) {
                buttonDTO = stickyBlockDTO.button;
            }
            return stickyBlockDTO.copy(restrictionDTO, buttonDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final RestrictionDTO getRestriction() {
            return this.restriction;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ButtonDTO getButton() {
            return this.button;
        }

        @NotNull
        public final StickyBlockDTO copy(RestrictionDTO restriction, @NotNull ButtonDTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new StickyBlockDTO(restriction, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyBlockDTO)) {
                return false;
            }
            StickyBlockDTO stickyBlockDTO = (StickyBlockDTO) other;
            return Intrinsics.d(this.restriction, stickyBlockDTO.restriction) && Intrinsics.d(this.button, stickyBlockDTO.button);
        }

        @NotNull
        public final ButtonDTO getButton() {
            return this.button;
        }

        public final RestrictionDTO getRestriction() {
            return this.restriction;
        }

        public int hashCode() {
            RestrictionDTO restrictionDTO = this.restriction;
            return this.button.hashCode() + ((restrictionDTO == null ? 0 : restrictionDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "StickyBlockDTO(restriction=" + this.restriction + ", button=" + this.button + ")";
        }
    }

    public ProductPickerDetailsDTO(SelectorDTO selectorDTO, @NotNull List<SectionDTO> sections, @NotNull StickyBlockDTO stickyBlock, CommonButton.ButtonBorderless buttonBorderless, @NotNull CurrentState currentState) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(stickyBlock, "stickyBlock");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        this.selector = selectorDTO;
        this.sections = sections;
        this.stickyBlock = stickyBlock;
        this.resetButton = buttonBorderless;
        this.currentState = currentState;
    }

    public static /* synthetic */ ProductPickerDetailsDTO copy$default(ProductPickerDetailsDTO productPickerDetailsDTO, SelectorDTO selectorDTO, List list, StickyBlockDTO stickyBlockDTO, CommonButton.ButtonBorderless buttonBorderless, CurrentState currentState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            selectorDTO = productPickerDetailsDTO.selector;
        }
        if ((i11 & 2) != 0) {
            list = productPickerDetailsDTO.sections;
        }
        if ((i11 & 4) != 0) {
            stickyBlockDTO = productPickerDetailsDTO.stickyBlock;
        }
        if ((i11 & 8) != 0) {
            buttonBorderless = productPickerDetailsDTO.resetButton;
        }
        if ((i11 & 16) != 0) {
            currentState = productPickerDetailsDTO.currentState;
        }
        CurrentState currentState2 = currentState;
        StickyBlockDTO stickyBlockDTO2 = stickyBlockDTO;
        return productPickerDetailsDTO.copy(selectorDTO, list, stickyBlockDTO2, buttonBorderless, currentState2);
    }

    /* renamed from: component1, reason: from getter */
    public final SelectorDTO getSelector() {
        return this.selector;
    }

    @NotNull
    public final List<SectionDTO> component2() {
        return this.sections;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final StickyBlockDTO getStickyBlock() {
        return this.stickyBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonButton.ButtonBorderless getResetButton() {
        return this.resetButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CurrentState getCurrentState() {
        return this.currentState;
    }

    @NotNull
    public final ProductPickerDetailsDTO copy(SelectorDTO selector, @NotNull List<SectionDTO> sections, @NotNull StickyBlockDTO stickyBlock, CommonButton.ButtonBorderless resetButton, @NotNull CurrentState currentState) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(stickyBlock, "stickyBlock");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new ProductPickerDetailsDTO(selector, sections, stickyBlock, resetButton, currentState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPickerDetailsDTO)) {
            return false;
        }
        ProductPickerDetailsDTO productPickerDetailsDTO = (ProductPickerDetailsDTO) other;
        return Intrinsics.d(this.selector, productPickerDetailsDTO.selector) && Intrinsics.d(this.sections, productPickerDetailsDTO.sections) && Intrinsics.d(this.stickyBlock, productPickerDetailsDTO.stickyBlock) && Intrinsics.d(this.resetButton, productPickerDetailsDTO.resetButton) && Intrinsics.d(this.currentState, productPickerDetailsDTO.currentState);
    }

    @NotNull
    public final CurrentState getCurrentState() {
        return this.currentState;
    }

    public final CommonButton.ButtonBorderless getResetButton() {
        return this.resetButton;
    }

    @NotNull
    public final List<SectionDTO> getSections() {
        return this.sections;
    }

    public final SelectorDTO getSelector() {
        return this.selector;
    }

    @NotNull
    public final StickyBlockDTO getStickyBlock() {
        return this.stickyBlock;
    }

    public int hashCode() {
        SelectorDTO selectorDTO = this.selector;
        int hashCode = (this.stickyBlock.hashCode() + g.b((selectorDTO == null ? 0 : selectorDTO.hashCode()) * 31, 31, this.sections)) * 31;
        CommonButton.ButtonBorderless buttonBorderless = this.resetButton;
        return this.currentState.hashCode() + ((hashCode + (buttonBorderless != null ? buttonBorderless.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ProductPickerDetailsDTO(selector=" + this.selector + ", sections=" + this.sections + ", stickyBlock=" + this.stickyBlock + ", resetButton=" + this.resetButton + ", currentState=" + this.currentState + ")";
    }
}
