package ru.ozon.app.android.returns.actionModal.data.dto;

import G.g;
import H3.c;
import HY.a;
import N3.C3660k;
import Tl.b;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.returns.ui.data.components.RmsInputDto;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002ABB¯\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0001\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J±\u0001\u0010:\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0003\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0016\b\u0003\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'¨\u0006C"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "", "returnNumber", "", "action", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/Tabs;", "hint", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "photos", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "components", "", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;", "componentGroups", "", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponentGroup;", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "cancelButton", "extraValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/tabs/Tabs;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/gallery/Gallery;Ljava/util/Map;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getReturnNumber", "()Ljava/lang/String;", "getAction", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "getHint", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getPhotos", "()Lru/ozon/app/android/atoms/data/gallery/Gallery;", "getComponents", "()Ljava/util/Map;", "getComponentGroups", "()Ljava/util/List;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getCancelButton", "getExtraValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "ActionComponentGroup", "ActionComponent", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnActionModalDto {
    public static final int $stable = 8;

    @NotNull
    private final String action;
    private final ButtonV3Atom.LargeButton cancelButton;
    private final List<ActionComponentGroup> componentGroups;
    private final Map<String, ActionComponent> components;
    private final Map<String, String> extraValues;
    private final DisclaimerAtom hint;
    private final Gallery photos;

    @NotNull
    private final String returnNumber;

    @NotNull
    private final ButtonV3Atom.LargeButton submitButton;
    private final TextAtom subtitle;
    private final Tabs tabs;
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "emptyComponentErrorText", "", "input", "Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "uploadPhotos", "Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getEmptyComponentErrorText", "()Ljava/lang/String;", "getInput", "()Lru/ozon/app/android/returns/ui/data/components/RmsInputDto;", "getTextArea", "()Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "getUploadPhotos", "()Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionComponent {
        public static final int $stable = 8;
        private final String emptyComponentErrorText;
        private final RmsInputDto input;
        private final TextAtom subtitle;
        private final RmsTextAreaDto textArea;

        @NotNull
        private final TextAtom title;
        private final RmsUploadPhotosDto uploadPhotos;

        public ActionComponent(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") TextAtom textAtom, @i(name = "emptyComponentErrorText") String str, @i(name = "input") RmsInputDto rmsInputDto, @i(name = "textArea") RmsTextAreaDto rmsTextAreaDto, @i(name = "uploadPhotos") RmsUploadPhotosDto rmsUploadPhotosDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textAtom;
            this.emptyComponentErrorText = str;
            this.input = rmsInputDto;
            this.textArea = rmsTextAreaDto;
            this.uploadPhotos = rmsUploadPhotosDto;
        }

        public static /* synthetic */ ActionComponent copy$default(ActionComponent actionComponent, TextAtom textAtom, TextAtom textAtom2, String str, RmsInputDto rmsInputDto, RmsTextAreaDto rmsTextAreaDto, RmsUploadPhotosDto rmsUploadPhotosDto, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = actionComponent.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = actionComponent.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = actionComponent.emptyComponentErrorText;
            }
            if ((i11 & 8) != 0) {
                rmsInputDto = actionComponent.input;
            }
            if ((i11 & 16) != 0) {
                rmsTextAreaDto = actionComponent.textArea;
            }
            if ((i11 & 32) != 0) {
                rmsUploadPhotosDto = actionComponent.uploadPhotos;
            }
            RmsTextAreaDto rmsTextAreaDto2 = rmsTextAreaDto;
            RmsUploadPhotosDto rmsUploadPhotosDto2 = rmsUploadPhotosDto;
            return actionComponent.copy(textAtom, textAtom2, str, rmsInputDto, rmsTextAreaDto2, rmsUploadPhotosDto2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmptyComponentErrorText() {
            return this.emptyComponentErrorText;
        }

        /* renamed from: component4, reason: from getter */
        public final RmsInputDto getInput() {
            return this.input;
        }

        /* renamed from: component5, reason: from getter */
        public final RmsTextAreaDto getTextArea() {
            return this.textArea;
        }

        /* renamed from: component6, reason: from getter */
        public final RmsUploadPhotosDto getUploadPhotos() {
            return this.uploadPhotos;
        }

        @NotNull
        public final ActionComponent copy(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") TextAtom subtitle, @i(name = "emptyComponentErrorText") String emptyComponentErrorText, @i(name = "input") RmsInputDto input, @i(name = "textArea") RmsTextAreaDto textArea, @i(name = "uploadPhotos") RmsUploadPhotosDto uploadPhotos) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ActionComponent(title, subtitle, emptyComponentErrorText, input, textArea, uploadPhotos);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionComponent)) {
                return false;
            }
            ActionComponent actionComponent = (ActionComponent) other;
            return Intrinsics.d(this.title, actionComponent.title) && Intrinsics.d(this.subtitle, actionComponent.subtitle) && Intrinsics.d(this.emptyComponentErrorText, actionComponent.emptyComponentErrorText) && Intrinsics.d(this.input, actionComponent.input) && Intrinsics.d(this.textArea, actionComponent.textArea) && Intrinsics.d(this.uploadPhotos, actionComponent.uploadPhotos);
        }

        public final String getEmptyComponentErrorText() {
            return this.emptyComponentErrorText;
        }

        public final RmsInputDto getInput() {
            return this.input;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final RmsTextAreaDto getTextArea() {
            return this.textArea;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final RmsUploadPhotosDto getUploadPhotos() {
            return this.uploadPhotos;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            String str = this.emptyComponentErrorText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            RmsInputDto rmsInputDto = this.input;
            int hashCode4 = (hashCode3 + (rmsInputDto == null ? 0 : rmsInputDto.hashCode())) * 31;
            RmsTextAreaDto rmsTextAreaDto = this.textArea;
            int hashCode5 = (hashCode4 + (rmsTextAreaDto == null ? 0 : rmsTextAreaDto.hashCode())) * 31;
            RmsUploadPhotosDto rmsUploadPhotosDto = this.uploadPhotos;
            return hashCode5 + (rmsUploadPhotosDto != null ? rmsUploadPhotosDto.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            String str = this.emptyComponentErrorText;
            RmsInputDto rmsInputDto = this.input;
            RmsTextAreaDto rmsTextAreaDto = this.textArea;
            RmsUploadPhotosDto rmsUploadPhotosDto = this.uploadPhotos;
            StringBuilder a11 = a.a("ActionComponent(title=", textAtom, ", subtitle=", textAtom2, ", emptyComponentErrorText=");
            a11.append(str);
            a11.append(", input=");
            a11.append(rmsInputDto);
            a11.append(", textArea=");
            a11.append(rmsTextAreaDto);
            a11.append(", uploadPhotos=");
            a11.append(rmsUploadPhotosDto);
            a11.append(")");
            return a11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponentGroup;", "", "componentKeys", "", "", "<init>", "(Ljava/util/List;)V", "getComponentKeys", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionComponentGroup {
        public static final int $stable = 8;

        @NotNull
        private final List<String> componentKeys;

        public ActionComponentGroup(@i(name = "components") @NotNull List<String> componentKeys) {
            Intrinsics.checkNotNullParameter(componentKeys, "componentKeys");
            this.componentKeys = componentKeys;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionComponentGroup copy$default(ActionComponentGroup actionComponentGroup, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = actionComponentGroup.componentKeys;
            }
            return actionComponentGroup.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.componentKeys;
        }

        @NotNull
        public final ActionComponentGroup copy(@i(name = "components") @NotNull List<String> componentKeys) {
            Intrinsics.checkNotNullParameter(componentKeys, "componentKeys");
            return new ActionComponentGroup(componentKeys);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ActionComponentGroup) && Intrinsics.d(this.componentKeys, ((ActionComponentGroup) other).componentKeys);
        }

        @NotNull
        public final List<String> getComponentKeys() {
            return this.componentKeys;
        }

        public int hashCode() {
            return this.componentKeys.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ActionComponentGroup(componentKeys=", ")", this.componentKeys);
        }
    }

    public ReturnActionModalDto(@i(name = "returnNumber") @NotNull String returnNumber, @i(name = "action") @NotNull String action, @i(name = "title") TextAtom textAtom, @i(name = "subTitle") TextAtom textAtom2, @i(name = "tabs") Tabs tabs, @i(name = "hint") DisclaimerAtom disclaimerAtom, @i(name = "photos") Gallery gallery, @i(name = "components") Map<String, ActionComponent> map, @i(name = "componentGroups") List<ActionComponentGroup> list, @i(name = "submitButton") @NotNull ButtonV3Atom.LargeButton submitButton, @i(name = "cancelButton") ButtonV3Atom.LargeButton largeButton, @i(name = "extraValues") Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(returnNumber, "returnNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.returnNumber = returnNumber;
        this.action = action;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.tabs = tabs;
        this.hint = disclaimerAtom;
        this.photos = gallery;
        this.components = map;
        this.componentGroups = list;
        this.submitButton = submitButton;
        this.cancelButton = largeButton;
        this.extraValues = map2;
    }

    public static /* synthetic */ ReturnActionModalDto copy$default(ReturnActionModalDto returnActionModalDto, String str, String str2, TextAtom textAtom, TextAtom textAtom2, Tabs tabs, DisclaimerAtom disclaimerAtom, Gallery gallery, Map map, List list, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = returnActionModalDto.returnNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = returnActionModalDto.action;
        }
        if ((i11 & 4) != 0) {
            textAtom = returnActionModalDto.title;
        }
        if ((i11 & 8) != 0) {
            textAtom2 = returnActionModalDto.subtitle;
        }
        if ((i11 & 16) != 0) {
            tabs = returnActionModalDto.tabs;
        }
        if ((i11 & 32) != 0) {
            disclaimerAtom = returnActionModalDto.hint;
        }
        if ((i11 & 64) != 0) {
            gallery = returnActionModalDto.photos;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = returnActionModalDto.components;
        }
        if ((i11 & 256) != 0) {
            list = returnActionModalDto.componentGroups;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            largeButton = returnActionModalDto.submitButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            largeButton2 = returnActionModalDto.cancelButton;
        }
        if ((i11 & 2048) != 0) {
            map2 = returnActionModalDto.extraValues;
        }
        ButtonV3Atom.LargeButton largeButton3 = largeButton2;
        Map map3 = map2;
        List list2 = list;
        ButtonV3Atom.LargeButton largeButton4 = largeButton;
        Gallery gallery2 = gallery;
        Map map4 = map;
        Tabs tabs2 = tabs;
        DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
        return returnActionModalDto.copy(str, str2, textAtom, textAtom2, tabs2, disclaimerAtom2, gallery2, map4, list2, largeButton4, largeButton3, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReturnNumber() {
        return this.returnNumber;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component11, reason: from getter */
    public final ButtonV3Atom.LargeButton getCancelButton() {
        return this.cancelButton;
    }

    public final Map<String, String> component12() {
        return this.extraValues;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final Tabs getTabs() {
        return this.tabs;
    }

    /* renamed from: component6, reason: from getter */
    public final DisclaimerAtom getHint() {
        return this.hint;
    }

    /* renamed from: component7, reason: from getter */
    public final Gallery getPhotos() {
        return this.photos;
    }

    public final Map<String, ActionComponent> component8() {
        return this.components;
    }

    public final List<ActionComponentGroup> component9() {
        return this.componentGroups;
    }

    @NotNull
    public final ReturnActionModalDto copy(@i(name = "returnNumber") @NotNull String returnNumber, @i(name = "action") @NotNull String action, @i(name = "title") TextAtom title, @i(name = "subTitle") TextAtom subtitle, @i(name = "tabs") Tabs tabs, @i(name = "hint") DisclaimerAtom hint, @i(name = "photos") Gallery photos, @i(name = "components") Map<String, ActionComponent> components, @i(name = "componentGroups") List<ActionComponentGroup> componentGroups, @i(name = "submitButton") @NotNull ButtonV3Atom.LargeButton submitButton, @i(name = "cancelButton") ButtonV3Atom.LargeButton cancelButton, @i(name = "extraValues") Map<String, String> extraValues) {
        Intrinsics.checkNotNullParameter(returnNumber, "returnNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new ReturnActionModalDto(returnNumber, action, title, subtitle, tabs, hint, photos, components, componentGroups, submitButton, cancelButton, extraValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnActionModalDto)) {
            return false;
        }
        ReturnActionModalDto returnActionModalDto = (ReturnActionModalDto) other;
        return Intrinsics.d(this.returnNumber, returnActionModalDto.returnNumber) && Intrinsics.d(this.action, returnActionModalDto.action) && Intrinsics.d(this.title, returnActionModalDto.title) && Intrinsics.d(this.subtitle, returnActionModalDto.subtitle) && Intrinsics.d(this.tabs, returnActionModalDto.tabs) && Intrinsics.d(this.hint, returnActionModalDto.hint) && Intrinsics.d(this.photos, returnActionModalDto.photos) && Intrinsics.d(this.components, returnActionModalDto.components) && Intrinsics.d(this.componentGroups, returnActionModalDto.componentGroups) && Intrinsics.d(this.submitButton, returnActionModalDto.submitButton) && Intrinsics.d(this.cancelButton, returnActionModalDto.cancelButton) && Intrinsics.d(this.extraValues, returnActionModalDto.extraValues);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final ButtonV3Atom.LargeButton getCancelButton() {
        return this.cancelButton;
    }

    public final List<ActionComponentGroup> getComponentGroups() {
        return this.componentGroups;
    }

    public final Map<String, ActionComponent> getComponents() {
        return this.components;
    }

    public final Map<String, String> getExtraValues() {
        return this.extraValues;
    }

    public final DisclaimerAtom getHint() {
        return this.hint;
    }

    public final Gallery getPhotos() {
        return this.photos;
    }

    @NotNull
    public final String getReturnNumber() {
        return this.returnNumber;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSubmitButton() {
        return this.submitButton;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Tabs getTabs() {
        return this.tabs;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(this.returnNumber.hashCode() * 31, 31, this.action);
        TextAtom textAtom = this.title;
        int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        Tabs tabs = this.tabs;
        int hashCode3 = (hashCode2 + (tabs == null ? 0 : tabs.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.hint;
        int hashCode4 = (hashCode3 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        Gallery gallery = this.photos;
        int hashCode5 = (hashCode4 + (gallery == null ? 0 : gallery.hashCode())) * 31;
        Map<String, ActionComponent> map = this.components;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        List<ActionComponentGroup> list = this.componentGroups;
        int a12 = b.a(this.submitButton, (hashCode6 + (list == null ? 0 : list.hashCode())) * 31, 31);
        ButtonV3Atom.LargeButton largeButton = this.cancelButton;
        int hashCode7 = (a12 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Map<String, String> map2 = this.extraValues;
        return hashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.returnNumber;
        String str2 = this.action;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        Tabs tabs = this.tabs;
        DisclaimerAtom disclaimerAtom = this.hint;
        Gallery gallery = this.photos;
        Map<String, ActionComponent> map = this.components;
        List<ActionComponentGroup> list = this.componentGroups;
        ButtonV3Atom.LargeButton largeButton = this.submitButton;
        ButtonV3Atom.LargeButton largeButton2 = this.cancelButton;
        Map<String, String> map2 = this.extraValues;
        StringBuilder d11 = C3660k.d("ReturnActionModalDto(returnNumber=", str, ", action=", str2, ", title=");
        C4636t5.c(", subtitle=", ", tabs=", d11, textAtom, textAtom2);
        d11.append(tabs);
        d11.append(", hint=");
        d11.append(disclaimerAtom);
        d11.append(", photos=");
        d11.append(gallery);
        d11.append(", components=");
        d11.append(map);
        d11.append(", componentGroups=");
        d11.append(list);
        d11.append(", submitButton=");
        d11.append(largeButton);
        d11.append(", cancelButton=");
        d11.append(largeButton2);
        d11.append(", extraValues=");
        d11.append(map2);
        d11.append(")");
        return d11.toString();
    }
}
