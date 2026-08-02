package ru.ozon.app.android.regulardraw.widgets.emptyscreen.data;

import Ep.a;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J4\u0010\u0016\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/IslandDTO;", "", "items", "", "showBackground", "", "topMargin", "", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;)V", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getShowBackground", "()Z", "getTopMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/util/List;ZLjava/lang/Integer;)Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/IslandDTO;", "equals", "other", "hashCode", "toString", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class IslandDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> items;
    private final boolean showBackground;
    private final Integer topMargin;

    public IslandDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "title", type = Text$TitleDTO.class), @ProtoOneOfSignature(name = "text", type = Text$TextDTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "animatedImage", type = AnimatedImageDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, boolean z11, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.showBackground = z11;
        this.topMargin = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IslandDTO copy$default(IslandDTO islandDTO, List list, boolean z11, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = islandDTO.items;
        }
        if ((i11 & 2) != 0) {
            z11 = islandDTO.showBackground;
        }
        if ((i11 & 4) != 0) {
            num = islandDTO.topMargin;
        }
        return islandDTO.copy(list, z11, num);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowBackground() {
        return this.showBackground;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @NotNull
    public final IslandDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "title", type = Text$TitleDTO.class), @ProtoOneOfSignature(name = "text", type = Text$TextDTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = "animatedImage", type = AnimatedImageDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, boolean showBackground, Integer topMargin) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new IslandDTO(items, showBackground, topMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IslandDTO)) {
            return false;
        }
        IslandDTO islandDTO = (IslandDTO) other;
        return Intrinsics.d(this.items, islandDTO.items) && this.showBackground == islandDTO.showBackground && Intrinsics.d(this.topMargin, islandDTO.topMargin);
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final boolean getShowBackground() {
        return this.showBackground;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.items.hashCode() * 31, 31, this.showBackground);
        Integer num = this.topMargin;
        return a11 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        List<Object> list = this.items;
        boolean z11 = this.showBackground;
        Integer num = this.topMargin;
        StringBuilder sb2 = new StringBuilder("IslandDTO(items=");
        sb2.append(list);
        sb2.append(", showBackground=");
        sb2.append(z11);
        sb2.append(", topMargin=");
        return a.c(sb2, num, ")");
    }

    public /* synthetic */ IslandDTO(List list, boolean z11, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? false : z11, num);
    }
}
