package ru.ozon.app.android.geo.addressEditDetail;

import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/geo/addressEditDetail/AddressEditDetailDynamicElementVO;", "newAddress", "button", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "options", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAddress", "()Ljava/util/List;", "getNewAddress", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "getOptions", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditDetailVO implements c {
    private final List<AtomDTO> address;
    private final AtomDTO button;
    private final long id;
    private final List<AddressEditDetailDynamicElementVO> newAddress;
    private final YandexSearchSheetFragment.Data options;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditDetailVO(long j11, List<? extends AtomDTO> list, List<? extends AddressEditDetailDynamicElementVO> list2, AtomDTO atomDTO, YandexSearchSheetFragment.Data data, t tVar) {
        this.id = j11;
        this.address = list;
        this.newAddress = list2;
        this.button = atomDTO;
        this.options = data;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditDetailVO)) {
            return false;
        }
        AddressEditDetailVO addressEditDetailVO = (AddressEditDetailVO) other;
        return this.id == addressEditDetailVO.id && Intrinsics.d(this.address, addressEditDetailVO.address) && Intrinsics.d(this.newAddress, addressEditDetailVO.newAddress) && Intrinsics.d(this.button, addressEditDetailVO.button) && Intrinsics.d(this.options, addressEditDetailVO.options) && Intrinsics.d(this.tokenizedEvent, addressEditDetailVO.tokenizedEvent);
    }

    public final List<AtomDTO> getAddress() {
        return this.address;
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<AddressEditDetailDynamicElementVO> getNewAddress() {
        return this.newAddress;
    }

    public final YandexSearchSheetFragment.Data getOptions() {
        return this.options;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<AtomDTO> list = this.address;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<AddressEditDetailDynamicElementVO> list2 = this.newAddress;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode4 = (hashCode3 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        YandexSearchSheetFragment.Data data = this.options;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.address;
        List<AddressEditDetailDynamicElementVO> list2 = this.newAddress;
        AtomDTO atomDTO = this.button;
        YandexSearchSheetFragment.Data data = this.options;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "AddressEditDetailVO(id=", ", address=", list);
        b11.append(", newAddress=");
        b11.append(list2);
        b11.append(", button=");
        b11.append(atomDTO);
        b11.append(", options=");
        b11.append(data);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
