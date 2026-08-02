package spay.sdk.domain.model.response.bnpl;

import Ak.b;
import B90.C2618u;
import Lf.a;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/PartsGraphBnpl;", "Landroid/os/Parcelable;", CommentV3DTO.HEADER_FIELD_NAME, "", "content", "count", "text", "sixPartPay", "", "Lspay/sdk/domain/model/response/bnpl/SixPartPay;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getCount", "getHeader", "getSixPartPay", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PartsGraphBnpl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PartsGraphBnpl> CREATOR = new Creator();

    @NotNull
    private final String content;
    private final String count;

    @NotNull
    private final String header;

    @NotNull
    private final List<SixPartPay> sixPartPay;
    private final String text;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartsGraphBnpl> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PartsGraphBnpl createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(SixPartPay.CREATOR, parcel, arrayList, i11, 1);
            }
            return new PartsGraphBnpl(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PartsGraphBnpl[] newArray(int i11) {
            return new PartsGraphBnpl[i11];
        }
    }

    public PartsGraphBnpl(@NotNull String header, @NotNull String content, String str, String str2, @NotNull List<SixPartPay> sixPartPay) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(sixPartPay, "sixPartPay");
        this.header = header;
        this.content = content;
        this.count = str;
        this.text = str2;
        this.sixPartPay = sixPartPay;
    }

    public static /* synthetic */ PartsGraphBnpl copy$default(PartsGraphBnpl partsGraphBnpl, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = partsGraphBnpl.header;
        }
        if ((i11 & 2) != 0) {
            str2 = partsGraphBnpl.content;
        }
        if ((i11 & 4) != 0) {
            str3 = partsGraphBnpl.count;
        }
        if ((i11 & 8) != 0) {
            str4 = partsGraphBnpl.text;
        }
        if ((i11 & 16) != 0) {
            list = partsGraphBnpl.sixPartPay;
        }
        List list2 = list;
        String str5 = str3;
        return partsGraphBnpl.copy(str, str2, str5, str4, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<SixPartPay> component5() {
        return this.sixPartPay;
    }

    @NotNull
    public final PartsGraphBnpl copy(@NotNull String header, @NotNull String content, String count, String text, @NotNull List<SixPartPay> sixPartPay) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(sixPartPay, "sixPartPay");
        return new PartsGraphBnpl(header, content, count, text, sixPartPay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartsGraphBnpl)) {
            return false;
        }
        PartsGraphBnpl partsGraphBnpl = (PartsGraphBnpl) other;
        return Intrinsics.d(this.header, partsGraphBnpl.header) && Intrinsics.d(this.content, partsGraphBnpl.content) && Intrinsics.d(this.count, partsGraphBnpl.count) && Intrinsics.d(this.text, partsGraphBnpl.text) && Intrinsics.d(this.sixPartPay, partsGraphBnpl.sixPartPay);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final String getCount() {
        return this.count;
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SixPartPay> getSixPartPay() {
        return this.sixPartPay;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int b02 = a.b0(this.header.hashCode() * 31, this.content);
        String str = this.count;
        int hashCode = (b02 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        return this.sixPartPay.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.header;
        String str2 = this.content;
        String str3 = this.count;
        String str4 = this.text;
        List<SixPartPay> list = this.sixPartPay;
        StringBuilder d11 = C3660k.d("PartsGraphBnpl(header=", str, ", content=", str2, ", count=");
        Nh.a.h(d11, str3, ", text=", str4, ", sixPartPay=");
        return C2618u.h(d11, list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.header);
        parcel.writeString(this.content);
        parcel.writeString(this.count);
        parcel.writeString(this.text);
        Iterator c11 = Bi.a.c(this.sixPartPay, parcel);
        while (c11.hasNext()) {
            ((SixPartPay) c11.next()).writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PartsGraphBnpl(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, r6, r7);
        List list2;
        String str5;
        str3 = (i11 & 4) != 0 ? null : str3;
        if ((i11 & 8) != 0) {
            list2 = list;
            str5 = null;
        } else {
            list2 = list;
            str5 = str4;
        }
    }
}
