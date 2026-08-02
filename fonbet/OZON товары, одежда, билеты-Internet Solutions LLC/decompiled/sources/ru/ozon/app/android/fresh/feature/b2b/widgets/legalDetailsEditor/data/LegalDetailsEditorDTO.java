package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import C.o0;
import Co.a;
import D40.c;
import G.g;
import Ns.b;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004 !\"#B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO;", "", "textField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;", "attachField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "policyField", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTextField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;", "getAttachField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getPolicyField", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TextFieldDTO", "AttachFieldDTO", "FileFieldDTO", "ButtonStates", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalDetailsEditorDTO {
    public static final int $stable = 8;

    @NotNull
    private final AttachFieldDTO attachField;
    private final TextDTO policyField;

    @NotNull
    private final ButtonDTO submitButton;

    @NotNull
    private final TextFieldDTO textField;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "fileFields", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFileFields", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachFieldDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<FileFieldDTO> fileFields;

        @NotNull
        private final TextDTO title;

        public AttachFieldDTO(@NotNull TextDTO title, @NotNull List<FileFieldDTO> fileFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(fileFields, "fileFields");
            this.title = title;
            this.fileFields = fileFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AttachFieldDTO copy$default(AttachFieldDTO attachFieldDTO, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = attachFieldDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = attachFieldDTO.fileFields;
            }
            return attachFieldDTO.copy(textDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final List<FileFieldDTO> component2() {
            return this.fileFields;
        }

        @NotNull
        public final AttachFieldDTO copy(@NotNull TextDTO title, @NotNull List<FileFieldDTO> fileFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(fileFields, "fileFields");
            return new AttachFieldDTO(title, fileFields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachFieldDTO)) {
                return false;
            }
            AttachFieldDTO attachFieldDTO = (AttachFieldDTO) other;
            return Intrinsics.d(this.title, attachFieldDTO.title) && Intrinsics.d(this.fileFields, attachFieldDTO.fileFields);
        }

        @NotNull
        public final List<FileFieldDTO> getFileFields() {
            return this.fileFields;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.fileFields.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AttachFieldDTO(title=" + this.title + ", fileFields=" + this.fileFields + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "", "defaultState", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "successState", "errorState", "loadingState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;)V", "getDefaultState", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getSuccessState", "getErrorState", "getLoadingState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LoadingButtonStateDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonStates {
        public static final int $stable = IconButtonDTO.$stable;

        @NotNull
        private final IconButtonDTO defaultState;

        @NotNull
        private final IconButtonDTO errorState;

        @NotNull
        private final LoadingButtonStateDTO loadingState;

        @NotNull
        private final IconButtonDTO successState;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates$LoadingButtonStateDTO;", "", "backgroundColor", "", "loaderColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getLoaderColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LoadingButtonStateDTO {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final String loaderColor;

            public LoadingButtonStateDTO(String str, String str2) {
                this.backgroundColor = str;
                this.loaderColor = str2;
            }

            public static /* synthetic */ LoadingButtonStateDTO copy$default(LoadingButtonStateDTO loadingButtonStateDTO, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = loadingButtonStateDTO.backgroundColor;
                }
                if ((i11 & 2) != 0) {
                    str2 = loadingButtonStateDTO.loaderColor;
                }
                return loadingButtonStateDTO.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLoaderColor() {
                return this.loaderColor;
            }

            @NotNull
            public final LoadingButtonStateDTO copy(String backgroundColor, String loaderColor) {
                return new LoadingButtonStateDTO(backgroundColor, loaderColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingButtonStateDTO)) {
                    return false;
                }
                LoadingButtonStateDTO loadingButtonStateDTO = (LoadingButtonStateDTO) other;
                return Intrinsics.d(this.backgroundColor, loadingButtonStateDTO.backgroundColor) && Intrinsics.d(this.loaderColor, loadingButtonStateDTO.loaderColor);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getLoaderColor() {
                return this.loaderColor;
            }

            public int hashCode() {
                String str = this.backgroundColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.loaderColor;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return e.a("LoadingButtonStateDTO(backgroundColor=", this.backgroundColor, ", loaderColor=", this.loaderColor, ")");
            }
        }

        public ButtonStates(@NotNull IconButtonDTO defaultState, @NotNull IconButtonDTO successState, @NotNull IconButtonDTO errorState, @NotNull LoadingButtonStateDTO loadingState) {
            Intrinsics.checkNotNullParameter(defaultState, "defaultState");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(loadingState, "loadingState");
            this.defaultState = defaultState;
            this.successState = successState;
            this.errorState = errorState;
            this.loadingState = loadingState;
        }

        public static /* synthetic */ ButtonStates copy$default(ButtonStates buttonStates, IconButtonDTO iconButtonDTO, IconButtonDTO iconButtonDTO2, IconButtonDTO iconButtonDTO3, LoadingButtonStateDTO loadingButtonStateDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonDTO = buttonStates.defaultState;
            }
            if ((i11 & 2) != 0) {
                iconButtonDTO2 = buttonStates.successState;
            }
            if ((i11 & 4) != 0) {
                iconButtonDTO3 = buttonStates.errorState;
            }
            if ((i11 & 8) != 0) {
                loadingButtonStateDTO = buttonStates.loadingState;
            }
            return buttonStates.copy(iconButtonDTO, iconButtonDTO2, iconButtonDTO3, loadingButtonStateDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonDTO getDefaultState() {
            return this.defaultState;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconButtonDTO getSuccessState() {
            return this.successState;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconButtonDTO getErrorState() {
            return this.errorState;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final LoadingButtonStateDTO getLoadingState() {
            return this.loadingState;
        }

        @NotNull
        public final ButtonStates copy(@NotNull IconButtonDTO defaultState, @NotNull IconButtonDTO successState, @NotNull IconButtonDTO errorState, @NotNull LoadingButtonStateDTO loadingState) {
            Intrinsics.checkNotNullParameter(defaultState, "defaultState");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(loadingState, "loadingState");
            return new ButtonStates(defaultState, successState, errorState, loadingState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonStates)) {
                return false;
            }
            ButtonStates buttonStates = (ButtonStates) other;
            return Intrinsics.d(this.defaultState, buttonStates.defaultState) && Intrinsics.d(this.successState, buttonStates.successState) && Intrinsics.d(this.errorState, buttonStates.errorState) && Intrinsics.d(this.loadingState, buttonStates.loadingState);
        }

        @NotNull
        public final IconButtonDTO getDefaultState() {
            return this.defaultState;
        }

        @NotNull
        public final IconButtonDTO getErrorState() {
            return this.errorState;
        }

        @NotNull
        public final LoadingButtonStateDTO getLoadingState() {
            return this.loadingState;
        }

        @NotNull
        public final IconButtonDTO getSuccessState() {
            return this.successState;
        }

        public int hashCode() {
            return this.loadingState.hashCode() + ((this.errorState.hashCode() + ((this.successState.hashCode() + (this.defaultState.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonStates(defaultState=" + this.defaultState + ", successState=" + this.successState + ", errorState=" + this.errorState + ", loadingState=" + this.loadingState + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "formats", "", "maxSize", "", "lexemes", "", "buttonsStates", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;JLjava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;)V", "getName", "()Ljava/lang/String;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFormats", "()Ljava/util/List;", "getMaxSize", "()J", "getLexemes", "()Ljava/util/Map;", "getButtonsStates", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$ButtonStates;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FileFieldDTO {
        public static final int $stable = 8;

        @NotNull
        private final ButtonStates buttonsStates;

        @NotNull
        private final List<String> formats;

        @NotNull
        private final TextDTO label;

        @NotNull
        private final Map<String, String> lexemes;
        private final long maxSize;

        @NotNull
        private final String name;

        public FileFieldDTO(@NotNull String name, @NotNull TextDTO label, @NotNull List<String> formats, long j11, @NotNull Map<String, String> lexemes, @NotNull ButtonStates buttonsStates) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(buttonsStates, "buttonsStates");
            this.name = name;
            this.label = label;
            this.formats = formats;
            this.maxSize = j11;
            this.lexemes = lexemes;
            this.buttonsStates = buttonsStates;
        }

        public static /* synthetic */ FileFieldDTO copy$default(FileFieldDTO fileFieldDTO, String str, TextDTO textDTO, List list, long j11, Map map, ButtonStates buttonStates, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fileFieldDTO.name;
            }
            if ((i11 & 2) != 0) {
                textDTO = fileFieldDTO.label;
            }
            if ((i11 & 4) != 0) {
                list = fileFieldDTO.formats;
            }
            if ((i11 & 8) != 0) {
                j11 = fileFieldDTO.maxSize;
            }
            if ((i11 & 16) != 0) {
                map = fileFieldDTO.lexemes;
            }
            if ((i11 & 32) != 0) {
                buttonStates = fileFieldDTO.buttonsStates;
            }
            long j12 = j11;
            List list2 = list;
            return fileFieldDTO.copy(str, textDTO, list2, j12, map, buttonStates);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final List<String> component3() {
            return this.formats;
        }

        /* renamed from: component4, reason: from getter */
        public final long getMaxSize() {
            return this.maxSize;
        }

        @NotNull
        public final Map<String, String> component5() {
            return this.lexemes;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ButtonStates getButtonsStates() {
            return this.buttonsStates;
        }

        @NotNull
        public final FileFieldDTO copy(@NotNull String name, @NotNull TextDTO label, @NotNull List<String> formats, long maxSize, @NotNull Map<String, String> lexemes, @NotNull ButtonStates buttonsStates) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(buttonsStates, "buttonsStates");
            return new FileFieldDTO(name, label, formats, maxSize, lexemes, buttonsStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileFieldDTO)) {
                return false;
            }
            FileFieldDTO fileFieldDTO = (FileFieldDTO) other;
            return Intrinsics.d(this.name, fileFieldDTO.name) && Intrinsics.d(this.label, fileFieldDTO.label) && Intrinsics.d(this.formats, fileFieldDTO.formats) && this.maxSize == fileFieldDTO.maxSize && Intrinsics.d(this.lexemes, fileFieldDTO.lexemes) && Intrinsics.d(this.buttonsStates, fileFieldDTO.buttonsStates);
        }

        @NotNull
        public final ButtonStates getButtonsStates() {
            return this.buttonsStates;
        }

        @NotNull
        public final List<String> getFormats() {
            return this.formats;
        }

        @NotNull
        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final long getMaxSize() {
            return this.maxSize;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.buttonsStates.hashCode() + c.a(this.lexemes, Pk0.c.a(g.b(b.a(this.label, this.name.hashCode() * 31, 31), 31, this.formats), 31, this.maxSize), 31);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            TextDTO textDTO = this.label;
            List<String> list = this.formats;
            long j11 = this.maxSize;
            Map<String, String> map = this.lexemes;
            ButtonStates buttonStates = this.buttonsStates;
            StringBuilder b11 = a.b("FileFieldDTO(name=", textDTO, str, ", label=", ", formats=");
            b11.append(list);
            b11.append(", maxSize=");
            b11.append(j11);
            b11.append(", lexemes=");
            b11.append(map);
            b11.append(", buttonsStates=");
            b11.append(buttonStates);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "", "errorRequiredText", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "()Ljava/lang/String;", "getErrorRequiredText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldDTO {
        public static final int $stable = 0;

        @NotNull
        private final String errorRequiredText;

        @NotNull
        private final String placeholder;

        @NotNull
        private final TextDTO title;

        public TextFieldDTO(@NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            this.title = title;
            this.placeholder = placeholder;
            this.errorRequiredText = errorRequiredText;
        }

        public static /* synthetic */ TextFieldDTO copy$default(TextFieldDTO textFieldDTO, TextDTO textDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textFieldDTO.title;
            }
            if ((i11 & 2) != 0) {
                str = textFieldDTO.placeholder;
            }
            if ((i11 & 4) != 0) {
                str2 = textFieldDTO.errorRequiredText;
            }
            return textFieldDTO.copy(textDTO, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final TextFieldDTO copy(@NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            return new TextFieldDTO(title, placeholder, errorRequiredText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFieldDTO)) {
                return false;
            }
            TextFieldDTO textFieldDTO = (TextFieldDTO) other;
            return Intrinsics.d(this.title, textFieldDTO.title) && Intrinsics.d(this.placeholder, textFieldDTO.placeholder) && Intrinsics.d(this.errorRequiredText, textFieldDTO.errorRequiredText);
        }

        @NotNull
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.errorRequiredText.hashCode() + g.a(this.title.hashCode() * 31, 31, this.placeholder);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.placeholder;
            return o0.c(D3.g.f("TextFieldDTO(title=", textDTO, ", placeholder=", str, ", errorRequiredText="), this.errorRequiredText, ")");
        }
    }

    public LegalDetailsEditorDTO(@NotNull TextFieldDTO textField, @NotNull AttachFieldDTO attachField, @NotNull ButtonDTO submitButton, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.textField = textField;
        this.attachField = attachField;
        this.submitButton = submitButton;
        this.policyField = textDTO;
    }

    public static /* synthetic */ LegalDetailsEditorDTO copy$default(LegalDetailsEditorDTO legalDetailsEditorDTO, TextFieldDTO textFieldDTO, AttachFieldDTO attachFieldDTO, ButtonDTO buttonDTO, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textFieldDTO = legalDetailsEditorDTO.textField;
        }
        if ((i11 & 2) != 0) {
            attachFieldDTO = legalDetailsEditorDTO.attachField;
        }
        if ((i11 & 4) != 0) {
            buttonDTO = legalDetailsEditorDTO.submitButton;
        }
        if ((i11 & 8) != 0) {
            textDTO = legalDetailsEditorDTO.policyField;
        }
        return legalDetailsEditorDTO.copy(textFieldDTO, attachFieldDTO, buttonDTO, textDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextFieldDTO getTextField() {
        return this.textField;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AttachFieldDTO getAttachField() {
        return this.attachField;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getPolicyField() {
        return this.policyField;
    }

    @NotNull
    public final LegalDetailsEditorDTO copy(@NotNull TextFieldDTO textField, @NotNull AttachFieldDTO attachField, @NotNull ButtonDTO submitButton, TextDTO policyField) {
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new LegalDetailsEditorDTO(textField, attachField, submitButton, policyField);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDetailsEditorDTO)) {
            return false;
        }
        LegalDetailsEditorDTO legalDetailsEditorDTO = (LegalDetailsEditorDTO) other;
        return Intrinsics.d(this.textField, legalDetailsEditorDTO.textField) && Intrinsics.d(this.attachField, legalDetailsEditorDTO.attachField) && Intrinsics.d(this.submitButton, legalDetailsEditorDTO.submitButton) && Intrinsics.d(this.policyField, legalDetailsEditorDTO.policyField);
    }

    @NotNull
    public final AttachFieldDTO getAttachField() {
        return this.attachField;
    }

    public final TextDTO getPolicyField() {
        return this.policyField;
    }

    @NotNull
    public final ButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextFieldDTO getTextField() {
        return this.textField;
    }

    public int hashCode() {
        int hashCode = (this.submitButton.hashCode() + ((this.attachField.hashCode() + (this.textField.hashCode() * 31)) * 31)) * 31;
        TextDTO textDTO = this.policyField;
        return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "LegalDetailsEditorDTO(textField=" + this.textField + ", attachField=" + this.attachField + ", submitButton=" + this.submitButton + ", policyField=" + this.policyField + ")";
    }
}
