package ru.ozon.app.android.pdp.widgets.brandV2.data;

import C.o0;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brandV2/data/BrandV2DTO;", "", "content", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "tabGroupId", "", "<init>", "(Ljava/lang/Object;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;)V", "getContent", "()Ljava/lang/Object;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTabGroupId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BrandV2DTO {
    public static final int $stable = 8;

    @NotNull
    private final Object content;

    @NotNull
    private final Paddings horizontalPadding;
    private final String tabGroupId;

    public BrandV2DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object content, @NotNull Paddings horizontalPadding, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        this.content = content;
        this.horizontalPadding = horizontalPadding;
        this.tabGroupId = str;
    }

    public static /* synthetic */ BrandV2DTO copy$default(BrandV2DTO brandV2DTO, Object obj, Paddings paddings, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = brandV2DTO.content;
        }
        if ((i11 & 2) != 0) {
            paddings = brandV2DTO.horizontalPadding;
        }
        if ((i11 & 4) != 0) {
            str = brandV2DTO.tabGroupId;
        }
        return brandV2DTO.copy(obj, paddings, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Object getContent() {
        return this.content;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final BrandV2DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "badge", type = BadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object content, @NotNull Paddings horizontalPadding, String tabGroupId) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        return new BrandV2DTO(content, horizontalPadding, tabGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandV2DTO)) {
            return false;
        }
        BrandV2DTO brandV2DTO = (BrandV2DTO) other;
        return Intrinsics.d(this.content, brandV2DTO.content) && this.horizontalPadding == brandV2DTO.horizontalPadding && Intrinsics.d(this.tabGroupId, brandV2DTO.tabGroupId);
    }

    @NotNull
    public final Object getContent() {
        return this.content;
    }

    @NotNull
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public int hashCode() {
        int b11 = b.b(this.horizontalPadding, this.content.hashCode() * 31, 31);
        String str = this.tabGroupId;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        Object obj = this.content;
        Paddings paddings = this.horizontalPadding;
        String str = this.tabGroupId;
        StringBuilder sb2 = new StringBuilder("BrandV2DTO(content=");
        sb2.append(obj);
        sb2.append(", horizontalPadding=");
        sb2.append(paddings);
        sb2.append(", tabGroupId=");
        return o0.c(sb2, str, ")");
    }

    public /* synthetic */ BrandV2DTO(Object obj, Paddings paddings, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings, str);
    }
}
