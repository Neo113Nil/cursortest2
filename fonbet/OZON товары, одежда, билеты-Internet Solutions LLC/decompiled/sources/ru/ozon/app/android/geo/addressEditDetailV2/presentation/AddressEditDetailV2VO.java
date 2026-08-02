package ru.ozon.app.android.geo.addressEditDetailV2.presentation;

import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2DynamicElementVO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "options", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAddress", "()Ljava/util/List;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "getOptions", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditDetailV2VO implements c {
    private final List<AddressEditDetailV2DynamicElementVO> address;
    private final long id;
    private final YandexSearchSheetFragment.Data options;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditDetailV2VO(long j11, List<? extends AddressEditDetailV2DynamicElementVO> list, YandexSearchSheetFragment.Data data, t tVar) {
        this.id = j11;
        this.address = list;
        this.options = data;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditDetailV2VO)) {
            return false;
        }
        AddressEditDetailV2VO addressEditDetailV2VO = (AddressEditDetailV2VO) other;
        return this.id == addressEditDetailV2VO.id && Intrinsics.d(this.address, addressEditDetailV2VO.address) && Intrinsics.d(this.options, addressEditDetailV2VO.options) && Intrinsics.d(this.tokenizedEvent, addressEditDetailV2VO.tokenizedEvent);
    }

    public final List<AddressEditDetailV2DynamicElementVO> getAddress() {
        return this.address;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        List<AddressEditDetailV2DynamicElementVO> list = this.address;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        YandexSearchSheetFragment.Data data = this.options;
        int hashCode3 = (hashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AddressEditDetailV2DynamicElementVO> list = this.address;
        YandexSearchSheetFragment.Data data = this.options;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "AddressEditDetailV2VO(id=", ", address=", list);
        b11.append(", options=");
        b11.append(data);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
