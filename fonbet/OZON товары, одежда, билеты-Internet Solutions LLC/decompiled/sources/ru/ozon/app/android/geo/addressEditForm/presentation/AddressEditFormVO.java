package ru.ozon.app.android.geo.addressEditForm.presentation;

import G.g;
import Lh.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "formBlocks", "", "", "dataForSend", "timestamp", "", "isInitialStateNotSent", "<init>", "(JLjava/util/List;Ljava/util/Map;JZ)V", "copy", "(JLjava/util/List;Ljava/util/Map;JZ)Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getFormBlocks", "()Ljava/util/List;", "Ljava/util/Map;", "getDataForSend", "()Ljava/util/Map;", "getTimestamp", "Z", "()Z", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditFormVO implements c {

    @NotNull
    private final Map<String, String> dataForSend;

    @NotNull
    private final List<FormBuilderBlockVO> formBlocks;
    private final long id;
    private final boolean isInitialStateNotSent;
    private final long timestamp;

    public AddressEditFormVO(long j11, @NotNull List<FormBuilderBlockVO> formBlocks, @NotNull Map<String, String> dataForSend, long j12, boolean z11) {
        Intrinsics.checkNotNullParameter(formBlocks, "formBlocks");
        Intrinsics.checkNotNullParameter(dataForSend, "dataForSend");
        this.id = j11;
        this.formBlocks = formBlocks;
        this.dataForSend = dataForSend;
        this.timestamp = j12;
        this.isInitialStateNotSent = z11;
    }

    public static /* synthetic */ AddressEditFormVO copy$default(AddressEditFormVO addressEditFormVO, long j11, List list, Map map, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = addressEditFormVO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            list = addressEditFormVO.formBlocks;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            map = addressEditFormVO.dataForSend;
        }
        Map map2 = map;
        if ((i11 & 8) != 0) {
            j12 = addressEditFormVO.timestamp;
        }
        long j14 = j12;
        if ((i11 & 16) != 0) {
            z11 = addressEditFormVO.isInitialStateNotSent;
        }
        return addressEditFormVO.copy(j13, list2, map2, j14, z11);
    }

    @NotNull
    public final AddressEditFormVO copy(long id2, @NotNull List<FormBuilderBlockVO> formBlocks, @NotNull Map<String, String> dataForSend, long timestamp, boolean isInitialStateNotSent) {
        Intrinsics.checkNotNullParameter(formBlocks, "formBlocks");
        Intrinsics.checkNotNullParameter(dataForSend, "dataForSend");
        return new AddressEditFormVO(id2, formBlocks, dataForSend, timestamp, isInitialStateNotSent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditFormVO)) {
            return false;
        }
        AddressEditFormVO addressEditFormVO = (AddressEditFormVO) other;
        return this.id == addressEditFormVO.id && Intrinsics.d(this.formBlocks, addressEditFormVO.formBlocks) && Intrinsics.d(this.dataForSend, addressEditFormVO.dataForSend) && this.timestamp == addressEditFormVO.timestamp && this.isInitialStateNotSent == addressEditFormVO.isInitialStateNotSent;
    }

    @NotNull
    public final Map<String, String> getDataForSend() {
        return this.dataForSend;
    }

    @NotNull
    public final List<FormBuilderBlockVO> getFormBlocks() {
        return this.formBlocks;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isInitialStateNotSent) + Pk0.c.a(D40.c.a(this.dataForSend, g.b(Long.hashCode(this.id) * 31, 31, this.formBlocks), 31), 31, this.timestamp);
    }

    /* renamed from: isInitialStateNotSent, reason: from getter */
    public final boolean getIsInitialStateNotSent() {
        return this.isInitialStateNotSent;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<FormBuilderBlockVO> list = this.formBlocks;
        Map<String, String> map = this.dataForSend;
        long j12 = this.timestamp;
        boolean z11 = this.isInitialStateNotSent;
        StringBuilder b11 = b.b(j11, "AddressEditFormVO(id=", ", formBlocks=", list);
        b11.append(", dataForSend=");
        b11.append(map);
        b11.append(", timestamp=");
        b11.append(j12);
        b11.append(", isInitialStateNotSent=");
        b11.append(z11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ AddressEditFormVO(long j11, List list, Map map, long j12, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, map, (i11 & 8) != 0 ? System.currentTimeMillis() : j12, (i11 & 16) != 0 ? true : z11);
    }
}
