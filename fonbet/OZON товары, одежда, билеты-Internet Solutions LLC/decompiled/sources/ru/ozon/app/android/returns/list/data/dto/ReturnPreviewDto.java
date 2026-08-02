package ru.ozon.app.android.returns.list.data.dto;

import D3.g;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.data.dto.ReturnTotalDto;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001.BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003JK\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u001dHÖ\u0001J\t\u0010-\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006/"}, d2 = {"Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto$Header;", "status", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "total", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "action", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto$Header;Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getHeader", "()Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto$Header;", "getStatus", "()Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "getTotal", "()Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "getAction", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Header", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnPreviewDto {
    public static final int $stable = 8;
    private final ButtonV3DTO action;
    private final String backgroundColor;
    private final CommonControlSettings common;

    @NotNull
    private final Header header;
    private int index;

    @NotNull
    private final ReturnStatusDto status;

    @NotNull
    private final ReturnTotalDto total;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/list/data/dto/ReturnPreviewDto$Header;", "", "newTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "newSubtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "separatorColor", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;)V", "getNewTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getNewSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSeparatorColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = IconDTO.$stable;
        private final IconDTO icon;
        private final TextDTO newSubtitle;
        private final TextDTO newTitle;
        private final String separatorColor;

        public Header(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, String str) {
            this.newTitle = textDTO;
            this.newSubtitle = textDTO2;
            this.icon = iconDTO;
            this.separatorColor = str;
        }

        public static /* synthetic */ Header copy$default(Header header, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = header.newTitle;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = header.newSubtitle;
            }
            if ((i11 & 4) != 0) {
                iconDTO = header.icon;
            }
            if ((i11 & 8) != 0) {
                str = header.separatorColor;
            }
            return header.copy(textDTO, textDTO2, iconDTO, str);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getNewTitle() {
            return this.newTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getNewSubtitle() {
            return this.newSubtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSeparatorColor() {
            return this.separatorColor;
        }

        @NotNull
        public final Header copy(TextDTO newTitle, TextDTO newSubtitle, IconDTO icon, String separatorColor) {
            return new Header(newTitle, newSubtitle, icon, separatorColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.newTitle, header.newTitle) && Intrinsics.d(this.newSubtitle, header.newSubtitle) && Intrinsics.d(this.icon, header.icon) && Intrinsics.d(this.separatorColor, header.separatorColor);
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getNewSubtitle() {
            return this.newSubtitle;
        }

        public final TextDTO getNewTitle() {
            return this.newTitle;
        }

        public final String getSeparatorColor() {
            return this.separatorColor;
        }

        public int hashCode() {
            TextDTO textDTO = this.newTitle;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.newSubtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            String str = this.separatorColor;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.newTitle;
            TextDTO textDTO2 = this.newSubtitle;
            IconDTO iconDTO = this.icon;
            String str = this.separatorColor;
            StringBuilder g10 = g.g("Header(newTitle=", textDTO, ", newSubtitle=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(", separatorColor=");
            g10.append(str);
            g10.append(")");
            return g10.toString();
        }
    }

    public ReturnPreviewDto(@i(name = "header") @NotNull Header header, @i(name = "status") @NotNull ReturnStatusDto status, @i(name = "total") @NotNull ReturnTotalDto total, ButtonV3DTO buttonV3DTO, String str, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(total, "total");
        this.header = header;
        this.status = status;
        this.total = total;
        this.action = buttonV3DTO;
        this.backgroundColor = str;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ ReturnPreviewDto copy$default(ReturnPreviewDto returnPreviewDto, Header header, ReturnStatusDto returnStatusDto, ReturnTotalDto returnTotalDto, ButtonV3DTO buttonV3DTO, String str, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = returnPreviewDto.header;
        }
        if ((i11 & 2) != 0) {
            returnStatusDto = returnPreviewDto.status;
        }
        if ((i11 & 4) != 0) {
            returnTotalDto = returnPreviewDto.total;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = returnPreviewDto.action;
        }
        if ((i11 & 16) != 0) {
            str = returnPreviewDto.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = returnPreviewDto.common;
        }
        String str2 = str;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        return returnPreviewDto.copy(header, returnStatusDto, returnTotalDto, buttonV3DTO, str2, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ReturnStatusDto getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ReturnTotalDto getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ReturnPreviewDto copy(@i(name = "header") @NotNull Header header, @i(name = "status") @NotNull ReturnStatusDto status, @i(name = "total") @NotNull ReturnTotalDto total, ButtonV3DTO action, String backgroundColor, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(total, "total");
        return new ReturnPreviewDto(header, status, total, action, backgroundColor, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnPreviewDto)) {
            return false;
        }
        ReturnPreviewDto returnPreviewDto = (ReturnPreviewDto) other;
        return Intrinsics.d(this.header, returnPreviewDto.header) && Intrinsics.d(this.status, returnPreviewDto.status) && Intrinsics.d(this.total, returnPreviewDto.total) && Intrinsics.d(this.action, returnPreviewDto.action) && Intrinsics.d(this.backgroundColor, returnPreviewDto.backgroundColor) && Intrinsics.d(this.common, returnPreviewDto.common);
    }

    public final ButtonV3DTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final Header getHeader() {
        return this.header;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ReturnStatusDto getStatus() {
        return this.status;
    }

    @NotNull
    public final ReturnTotalDto getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode = (this.total.hashCode() + ((this.status.hashCode() + (this.header.hashCode() * 31)) * 31)) * 31;
        ButtonV3DTO buttonV3DTO = this.action;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    public final void setIndex(int i11) {
        this.index = i11;
    }

    @NotNull
    public String toString() {
        return "ReturnPreviewDto(header=" + this.header + ", status=" + this.status + ", total=" + this.total + ", action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", common=" + this.common + ")";
    }
}
