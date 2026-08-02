package ru.ozon.app.android.travel.molecules.view.iconField;

import El.C2971a;
import G.g;
import Kk.C3532b;
import TY.a;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "isCompact", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettings", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;ZLru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Z", "()Z", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IconFieldVO {
    public static final int $stable = IconDTO.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CommonControlSettings commonControlSettings;

    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final IconDTO icon;
    private final long id;
    private final boolean isCompact;

    @NotNull
    private final TextDTO text;

    public IconFieldVO(long j11, @NotNull TextDTO text, @NotNull IconDTO icon, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, boolean z11, @NotNull CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        this.id = j11;
        this.text = text;
        this.icon = icon;
        this.backgroundColor = backgroundColor;
        this.cornerRadius = cornerRadius;
        this.isCompact = z11;
        this.commonControlSettings = commonControlSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconFieldVO)) {
            return false;
        }
        IconFieldVO iconFieldVO = (IconFieldVO) other;
        return this.id == iconFieldVO.id && Intrinsics.d(this.text, iconFieldVO.text) && Intrinsics.d(this.icon, iconFieldVO.icon) && Intrinsics.d(this.backgroundColor, iconFieldVO.backgroundColor) && this.cornerRadius == iconFieldVO.cornerRadius && this.isCompact == iconFieldVO.isCompact && Intrinsics.d(this.commonControlSettings, iconFieldVO.commonControlSettings);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        return this.commonControlSettings.hashCode() + C3532b.a(b.b(this.cornerRadius, g.a(C2971a.a(this.icon, Ns.b.a(this.text, Long.hashCode(this.id) * 31, 31), 31), 31, this.backgroundColor), 31), 31, this.isCompact);
    }

    /* renamed from: isCompact, reason: from getter */
    public final boolean getIsCompact() {
        return this.isCompact;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.text;
        IconDTO iconDTO = this.icon;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        boolean z11 = this.isCompact;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        StringBuilder b11 = a.b("IconFieldVO(id=", j11, ", text=", textDTO);
        b11.append(", icon=");
        b11.append(iconDTO);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(", cornerRadius=");
        b11.append(cornerRadius);
        b11.append(", isCompact=");
        b11.append(z11);
        b11.append(", commonControlSettings=");
        b11.append(commonControlSettings);
        b11.append(")");
        return b11.toString();
    }
}
