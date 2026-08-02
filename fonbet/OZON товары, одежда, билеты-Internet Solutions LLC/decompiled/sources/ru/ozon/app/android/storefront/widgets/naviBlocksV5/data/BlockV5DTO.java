package ru.ozon.app.android.storefront.widgets.naviBlocksV5.data;

import Co.a;
import El.C2971a;
import F3.G;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "settings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockV5DTO {
    public static final int $stable = IconDTO.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final IconDTO icon;
    private final CommonControlSettings settings;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public BlockV5DTO(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO icon, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.backgroundColor = backgroundColor;
        this.title = title;
        this.subtitle = subtitle;
        this.icon = icon;
        this.settings = commonControlSettings;
    }

    public static /* synthetic */ BlockV5DTO copy$default(BlockV5DTO blockV5DTO, String str, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blockV5DTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textDTO = blockV5DTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = blockV5DTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            iconDTO = blockV5DTO.icon;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = blockV5DTO.settings;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        TextDTO textDTO3 = textDTO2;
        return blockV5DTO.copy(str, textDTO, textDTO3, iconDTO, commonControlSettings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final BlockV5DTO copy(@NotNull String backgroundColor, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull IconDTO icon, CommonControlSettings settings) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new BlockV5DTO(backgroundColor, title, subtitle, icon, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockV5DTO)) {
            return false;
        }
        BlockV5DTO blockV5DTO = (BlockV5DTO) other;
        return Intrinsics.d(this.backgroundColor, blockV5DTO.backgroundColor) && Intrinsics.d(this.title, blockV5DTO.title) && Intrinsics.d(this.subtitle, blockV5DTO.subtitle) && Intrinsics.d(this.icon, blockV5DTO.icon) && Intrinsics.d(this.settings, blockV5DTO.settings);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final CommonControlSettings getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = C2971a.a(this.icon, b.a(this.subtitle, b.a(this.title, this.backgroundColor.hashCode() * 31, 31), 31), 31);
        CommonControlSettings commonControlSettings = this.settings;
        return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        IconDTO iconDTO = this.icon;
        CommonControlSettings commonControlSettings = this.settings;
        StringBuilder b11 = a.b("BlockV5DTO(backgroundColor=", textDTO, str, ", title=", ", subtitle=");
        G.f(b11, textDTO2, ", icon=", iconDTO, ", settings=");
        return Ak.b.g(b11, commonControlSettings, ")");
    }
}
