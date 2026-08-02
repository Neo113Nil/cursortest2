package ru.ozon.app.android.commonwidgets.widgets.error.data;

import G.g;
import I1.w;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001'BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "errorId", "buttonTitle", "notificationTitle", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "v2TrackingInfo", "Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getErrorId", "getButtonTitle", "getNotificationTitle", "getButtons", "()Ljava/util/List;", "getV2TrackingInfo", "()Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "V2TrackingInfo", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ErrorDTO {
    private final String buttonTitle;

    @NotNull
    private final List<ButtonV3Atom.SmallButton> buttons;
    private final String errorId;
    private final String notificationTitle;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final V2TrackingInfo v2TrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;", "", "errorId", "", "errorCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getErrorId", "()Ljava/lang/String;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorDTO$V2TrackingInfo;", "equals", "", "other", "hashCode", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class V2TrackingInfo {
        private final Integer errorCode;

        @NotNull
        private final String errorId;

        public V2TrackingInfo(@NotNull String errorId, Integer num) {
            Intrinsics.checkNotNullParameter(errorId, "errorId");
            this.errorId = errorId;
            this.errorCode = num;
        }

        public static /* synthetic */ V2TrackingInfo copy$default(V2TrackingInfo v2TrackingInfo, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = v2TrackingInfo.errorId;
            }
            if ((i11 & 2) != 0) {
                num = v2TrackingInfo.errorCode;
            }
            return v2TrackingInfo.copy(str, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getErrorId() {
            return this.errorId;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final V2TrackingInfo copy(@NotNull String errorId, Integer errorCode) {
            Intrinsics.checkNotNullParameter(errorId, "errorId");
            return new V2TrackingInfo(errorId, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof V2TrackingInfo)) {
                return false;
            }
            V2TrackingInfo v2TrackingInfo = (V2TrackingInfo) other;
            return Intrinsics.d(this.errorId, v2TrackingInfo.errorId) && Intrinsics.d(this.errorCode, v2TrackingInfo.errorCode);
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorId() {
            return this.errorId;
        }

        public int hashCode() {
            int hashCode = this.errorId.hashCode() * 31;
            Integer num = this.errorCode;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "V2TrackingInfo(errorId=" + this.errorId + ", errorCode=" + this.errorCode + ")";
        }
    }

    public ErrorDTO(@NotNull String title, @NotNull String subtitle, String str, String str2, String str3, @NotNull List<ButtonV3Atom.SmallButton> buttons, V2TrackingInfo v2TrackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.title = title;
        this.subtitle = subtitle;
        this.errorId = str;
        this.buttonTitle = str2;
        this.notificationTitle = str3;
        this.buttons = buttons;
        this.v2TrackingInfo = v2TrackingInfo;
    }

    public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, String str, String str2, String str3, String str4, String str5, List list, V2TrackingInfo v2TrackingInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errorDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = errorDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = errorDTO.errorId;
        }
        if ((i11 & 8) != 0) {
            str4 = errorDTO.buttonTitle;
        }
        if ((i11 & 16) != 0) {
            str5 = errorDTO.notificationTitle;
        }
        if ((i11 & 32) != 0) {
            list = errorDTO.buttons;
        }
        if ((i11 & 64) != 0) {
            v2TrackingInfo = errorDTO.v2TrackingInfo;
        }
        List list2 = list;
        V2TrackingInfo v2TrackingInfo2 = v2TrackingInfo;
        String str6 = str5;
        String str7 = str3;
        return errorDTO.copy(str, str2, str7, str4, str6, list2, v2TrackingInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorId() {
        return this.errorId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    @NotNull
    public final List<ButtonV3Atom.SmallButton> component6() {
        return this.buttons;
    }

    /* renamed from: component7, reason: from getter */
    public final V2TrackingInfo getV2TrackingInfo() {
        return this.v2TrackingInfo;
    }

    @NotNull
    public final ErrorDTO copy(@NotNull String title, @NotNull String subtitle, String errorId, String buttonTitle, String notificationTitle, @NotNull List<ButtonV3Atom.SmallButton> buttons, V2TrackingInfo v2TrackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new ErrorDTO(title, subtitle, errorId, buttonTitle, notificationTitle, buttons, v2TrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDTO)) {
            return false;
        }
        ErrorDTO errorDTO = (ErrorDTO) other;
        return Intrinsics.d(this.title, errorDTO.title) && Intrinsics.d(this.subtitle, errorDTO.subtitle) && Intrinsics.d(this.errorId, errorDTO.errorId) && Intrinsics.d(this.buttonTitle, errorDTO.buttonTitle) && Intrinsics.d(this.notificationTitle, errorDTO.notificationTitle) && Intrinsics.d(this.buttons, errorDTO.buttons) && Intrinsics.d(this.v2TrackingInfo, errorDTO.v2TrackingInfo);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @NotNull
    public final List<ButtonV3Atom.SmallButton> getButtons() {
        return this.buttons;
    }

    public final String getErrorId() {
        return this.errorId;
    }

    public final String getNotificationTitle() {
        return this.notificationTitle;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final V2TrackingInfo getV2TrackingInfo() {
        return this.v2TrackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.title.hashCode() * 31, 31, this.subtitle);
        String str = this.errorId;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonTitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notificationTitle;
        int b11 = g.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.buttons);
        V2TrackingInfo v2TrackingInfo = this.v2TrackingInfo;
        return b11 + (v2TrackingInfo != null ? v2TrackingInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.errorId;
        String str4 = this.buttonTitle;
        String str5 = this.notificationTitle;
        List<ButtonV3Atom.SmallButton> list = this.buttons;
        V2TrackingInfo v2TrackingInfo = this.v2TrackingInfo;
        StringBuilder d11 = C3660k.d("ErrorDTO(title=", str, ", subtitle=", str2, ", errorId=");
        a.h(d11, str3, ", buttonTitle=", str4, ", notificationTitle=");
        w.d(str5, ", buttons=", ", v2TrackingInfo=", d11, list);
        d11.append(v2TrackingInfo);
        d11.append(")");
        return d11.toString();
    }

    public ErrorDTO(String str, String str2, String str3, String str4, String str5, List list, V2TrackingInfo v2TrackingInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? K.f71697a : list, v2TrackingInfo);
    }
}
