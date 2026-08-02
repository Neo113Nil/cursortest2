package ru.ozon.app.android.returns.details.data.dto;

import B90.C2618u;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.data.dto.ReturnTotalDto;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto;", "", "status", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "components", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "items", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto;", "total", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "availableActions", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "<init>", "(Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;Ljava/util/List;Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto;Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;Ljava/util/List;)V", "getStatus", "()Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "getComponents", "()Ljava/util/List;", "getItems", "()Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto;", "getTotal", "()Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "getAvailableActions", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Component", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnDetailsDto {
    public static final int $stable = 8;
    private final List<ButtonV3Atom.SmallButton> availableActions;
    private final List<Component> components;

    @NotNull
    private final ReturnItemsDto items;

    @NotNull
    private final ReturnStatusDto status;
    private final ReturnTotalDto total;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnMethodDto;", "Lru/ozon/app/android/returns/details/data/dto/ReturnTrackingInfoDto;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "trackingInfo", type = ReturnTrackingInfoDto.class), @ProtoOneOfSignature(name = "returnMethod", type = ReturnMethodDto.class)})
    @ProtoOneOf
    public interface Component {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnDetailsDto(@i(name = "status") @NotNull ReturnStatusDto status, @i(name = "components") List<? extends Component> list, @i(name = "items") @NotNull ReturnItemsDto items, @i(name = "total") ReturnTotalDto returnTotalDto, @i(name = "availableActions") List<ButtonV3Atom.SmallButton> list2) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(items, "items");
        this.status = status;
        this.components = list;
        this.items = items;
        this.total = returnTotalDto;
        this.availableActions = list2;
    }

    public static /* synthetic */ ReturnDetailsDto copy$default(ReturnDetailsDto returnDetailsDto, ReturnStatusDto returnStatusDto, List list, ReturnItemsDto returnItemsDto, ReturnTotalDto returnTotalDto, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            returnStatusDto = returnDetailsDto.status;
        }
        if ((i11 & 2) != 0) {
            list = returnDetailsDto.components;
        }
        if ((i11 & 4) != 0) {
            returnItemsDto = returnDetailsDto.items;
        }
        if ((i11 & 8) != 0) {
            returnTotalDto = returnDetailsDto.total;
        }
        if ((i11 & 16) != 0) {
            list2 = returnDetailsDto.availableActions;
        }
        List list3 = list2;
        ReturnItemsDto returnItemsDto2 = returnItemsDto;
        return returnDetailsDto.copy(returnStatusDto, list, returnItemsDto2, returnTotalDto, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ReturnStatusDto getStatus() {
        return this.status;
    }

    public final List<Component> component2() {
        return this.components;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ReturnItemsDto getItems() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final ReturnTotalDto getTotal() {
        return this.total;
    }

    public final List<ButtonV3Atom.SmallButton> component5() {
        return this.availableActions;
    }

    @NotNull
    public final ReturnDetailsDto copy(@i(name = "status") @NotNull ReturnStatusDto status, @i(name = "components") List<? extends Component> components, @i(name = "items") @NotNull ReturnItemsDto items, @i(name = "total") ReturnTotalDto total, @i(name = "availableActions") List<ButtonV3Atom.SmallButton> availableActions) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReturnDetailsDto(status, components, items, total, availableActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnDetailsDto)) {
            return false;
        }
        ReturnDetailsDto returnDetailsDto = (ReturnDetailsDto) other;
        return Intrinsics.d(this.status, returnDetailsDto.status) && Intrinsics.d(this.components, returnDetailsDto.components) && Intrinsics.d(this.items, returnDetailsDto.items) && Intrinsics.d(this.total, returnDetailsDto.total) && Intrinsics.d(this.availableActions, returnDetailsDto.availableActions);
    }

    public final List<ButtonV3Atom.SmallButton> getAvailableActions() {
        return this.availableActions;
    }

    public final List<Component> getComponents() {
        return this.components;
    }

    @NotNull
    public final ReturnItemsDto getItems() {
        return this.items;
    }

    @NotNull
    public final ReturnStatusDto getStatus() {
        return this.status;
    }

    public final ReturnTotalDto getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        List<Component> list = this.components;
        int hashCode2 = (this.items.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        ReturnTotalDto returnTotalDto = this.total;
        int hashCode3 = (hashCode2 + (returnTotalDto == null ? 0 : returnTotalDto.hashCode())) * 31;
        List<ButtonV3Atom.SmallButton> list2 = this.availableActions;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ReturnStatusDto returnStatusDto = this.status;
        List<Component> list = this.components;
        ReturnItemsDto returnItemsDto = this.items;
        ReturnTotalDto returnTotalDto = this.total;
        List<ButtonV3Atom.SmallButton> list2 = this.availableActions;
        StringBuilder sb2 = new StringBuilder("ReturnDetailsDto(status=");
        sb2.append(returnStatusDto);
        sb2.append(", components=");
        sb2.append(list);
        sb2.append(", items=");
        sb2.append(returnItemsDto);
        sb2.append(", total=");
        sb2.append(returnTotalDto);
        sb2.append(", availableActions=");
        return C2618u.h(sb2, list2, ")");
    }
}
