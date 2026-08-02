package ru.ozon.app.android.faq.data.model;

import Ds.C2880a;
import G.g;
import GR.b;
import Hj.C3143a;
import Kk.C3532b;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/faq/data/model/AnnotationDTO;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "style", "", "icon", "isFullWidth", "", "isSticky", "bgColor", "actionButtons", "", "Lru/ozon/app/android/faq/data/model/AnnotationDTO$Button;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getStyle", "()Ljava/lang/String;", "getIcon", "()Z", "getBgColor", "getActionButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Button", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AnnotationDTO {
    private final List<Button> actionButtons;
    private final String bgColor;
    private final String icon;
    private final boolean isFullWidth;
    private final boolean isSticky;

    @NotNull
    private final String style;

    @NotNull
    private final OzonSpannableString text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/faq/data/model/AnnotationDTO$Button;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String title;

        public Button(@NotNull String title, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = button.title;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = button.action;
            }
            return button.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Button copy(@NotNull String title, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Button(title, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.d(this.title, button.title) && Intrinsics.d(this.action, button.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Button(title=" + this.title + ", action=" + this.action + ")";
        }
    }

    public AnnotationDTO(@NotNull OzonSpannableString text, @NotNull String style, String str, boolean z11, boolean z12, String str2, List<Button> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.text = text;
        this.style = style;
        this.icon = str;
        this.isFullWidth = z11;
        this.isSticky = z12;
        this.bgColor = str2;
        this.actionButtons = list;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AnnotationDTO copy$default(AnnotationDTO annotationDTO, OzonSpannableString ozonSpannableString, String str, String str2, boolean z11, boolean z12, String str3, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = annotationDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = annotationDTO.style;
        }
        if ((i11 & 4) != 0) {
            str2 = annotationDTO.icon;
        }
        if ((i11 & 8) != 0) {
            z11 = annotationDTO.isFullWidth;
        }
        if ((i11 & 16) != 0) {
            z12 = annotationDTO.isSticky;
        }
        if ((i11 & 32) != 0) {
            str3 = annotationDTO.bgColor;
        }
        if ((i11 & 64) != 0) {
            list = annotationDTO.actionButtons;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = annotationDTO.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        boolean z13 = z12;
        String str4 = str3;
        return annotationDTO.copy(ozonSpannableString, str, str2, z11, z13, str4, list2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFullWidth() {
        return this.isFullWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    public final List<Button> component7() {
        return this.actionButtons;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final AnnotationDTO copy(@NotNull OzonSpannableString text, @NotNull String style, String icon, boolean isFullWidth, boolean isSticky, String bgColor, List<Button> actionButtons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        return new AnnotationDTO(text, style, icon, isFullWidth, isSticky, bgColor, actionButtons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationDTO)) {
            return false;
        }
        AnnotationDTO annotationDTO = (AnnotationDTO) other;
        return Intrinsics.d(this.text, annotationDTO.text) && Intrinsics.d(this.style, annotationDTO.style) && Intrinsics.d(this.icon, annotationDTO.icon) && this.isFullWidth == annotationDTO.isFullWidth && this.isSticky == annotationDTO.isSticky && Intrinsics.d(this.bgColor, annotationDTO.bgColor) && Intrinsics.d(this.actionButtons, annotationDTO.actionButtons) && Intrinsics.d(this.trackingInfo, annotationDTO.trackingInfo);
    }

    public final List<Button> getActionButtons() {
        return this.actionButtons;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.text.hashCode() * 31, 31, this.style);
        String str = this.icon;
        int a12 = C3532b.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isFullWidth), 31, this.isSticky);
        String str2 = this.bgColor;
        int hashCode = (a12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Button> list = this.actionButtons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isFullWidth() {
        return this.isFullWidth;
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.style;
        String str2 = this.icon;
        boolean z11 = this.isFullWidth;
        boolean z12 = this.isSticky;
        String str3 = this.bgColor;
        List<Button> list = this.actionButtons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = b.f("AnnotationDTO(text=", ozonSpannableString, ", style=", str, ", icon=");
        C2880a.c(str2, ", isFullWidth=", ", isSticky=", f7, z11);
        C5766e.a(", bgColor=", str3, ", actionButtons=", f7, z12);
        return C3143a.h(f7, list, ", trackingInfo=", map, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnnotationDTO(OzonSpannableString ozonSpannableString, String str, String str2, boolean z11, boolean z12, String str3, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, str, str2, z11, r7, r8, r9, r10);
        Map map2;
        List list2;
        String str4;
        boolean z13;
        z11 = (i11 & 8) != 0 ? false : z11;
        if ((i11 & 16) != 0) {
            map2 = map;
            list2 = list;
            str4 = str3;
            z13 = false;
        } else {
            map2 = map;
            list2 = list;
            str4 = str3;
            z13 = z12;
        }
    }
}
