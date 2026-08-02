package ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.input;

import Bi.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/input/ComplaintInfo;", "", "reasonIds", "", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getReasonIds", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComplaintInfo {
    public static final int $stable = 8;

    @NotNull
    private final List<String> reasonIds;
    private final String text;

    public ComplaintInfo() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComplaintInfo copy$default(ComplaintInfo complaintInfo, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = complaintInfo.reasonIds;
        }
        if ((i11 & 2) != 0) {
            str = complaintInfo.text;
        }
        return complaintInfo.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.reasonIds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final ComplaintInfo copy(@NotNull List<String> reasonIds, String text) {
        Intrinsics.checkNotNullParameter(reasonIds, "reasonIds");
        return new ComplaintInfo(reasonIds, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplaintInfo)) {
            return false;
        }
        ComplaintInfo complaintInfo = (ComplaintInfo) other;
        return Intrinsics.d(this.reasonIds, complaintInfo.reasonIds) && Intrinsics.d(this.text, complaintInfo.text);
    }

    @NotNull
    public final List<String> getReasonIds() {
        return this.reasonIds;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.reasonIds.hashCode() * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return b.e("ComplaintInfo(reasonIds=", ", text=", this.text, ")", this.reasonIds);
    }

    public ComplaintInfo(@NotNull List<String> reasonIds, String str) {
        Intrinsics.checkNotNullParameter(reasonIds, "reasonIds");
        this.reasonIds = reasonIds;
        this.text = str;
    }

    public ComplaintInfo(List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? null : str);
    }
}
