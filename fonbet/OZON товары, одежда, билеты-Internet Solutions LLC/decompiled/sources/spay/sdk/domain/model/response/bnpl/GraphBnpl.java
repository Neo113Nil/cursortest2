package spay.sdk.domain.model.response.bnpl;

import Ak.b;
import B90.C2618u;
import C.J;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "Landroid/os/Parcelable;", CommentV3DTO.HEADER_FIELD_NAME, "", "content", "count", "text", "payments", "", "Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getCount", "getHeader", "getPayments", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GraphBnpl implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GraphBnpl> CREATOR = new Creator();

    @NotNull
    private final String content;
    private final String count;

    @NotNull
    private final String header;
    private final List<BnplPayment> payments;
    private final String text;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GraphBnpl> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GraphBnpl createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.b(BnplPayment.CREATOR, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            return new GraphBnpl(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GraphBnpl[] newArray(int i11) {
            return new GraphBnpl[i11];
        }
    }

    public GraphBnpl(@NotNull String header, @NotNull String content, String str, String str2, List<BnplPayment> list) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        this.header = header;
        this.content = content;
        this.count = str;
        this.text = str2;
        this.payments = list;
    }

    public static /* synthetic */ GraphBnpl copy$default(GraphBnpl graphBnpl, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = graphBnpl.header;
        }
        if ((i11 & 2) != 0) {
            str2 = graphBnpl.content;
        }
        if ((i11 & 4) != 0) {
            str3 = graphBnpl.count;
        }
        if ((i11 & 8) != 0) {
            str4 = graphBnpl.text;
        }
        if ((i11 & 16) != 0) {
            list = graphBnpl.payments;
        }
        List list2 = list;
        String str5 = str3;
        return graphBnpl.copy(str, str2, str5, str4, list2);
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

    public final List<BnplPayment> component5() {
        return this.payments;
    }

    @NotNull
    public final GraphBnpl copy(@NotNull String header, @NotNull String content, String count, String text, List<BnplPayment> payments) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(content, "content");
        return new GraphBnpl(header, content, count, text, payments);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphBnpl)) {
            return false;
        }
        GraphBnpl graphBnpl = (GraphBnpl) other;
        return Intrinsics.d(this.header, graphBnpl.header) && Intrinsics.d(this.content, graphBnpl.content) && Intrinsics.d(this.count, graphBnpl.count) && Intrinsics.d(this.text, graphBnpl.text) && Intrinsics.d(this.payments, graphBnpl.payments);
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

    public final List<BnplPayment> getPayments() {
        return this.payments;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int b02 = a.b0(this.header.hashCode() * 31, this.content);
        String str = this.count;
        int hashCode = (b02 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BnplPayment> list = this.payments;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.header;
        String str2 = this.content;
        String str3 = this.count;
        String str4 = this.text;
        List<BnplPayment> list = this.payments;
        StringBuilder d11 = C3660k.d("GraphBnpl(header=", str, ", content=", str2, ", count=");
        Nh.a.h(d11, str3, ", text=", str4, ", payments=");
        return C2618u.h(d11, list, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.header);
        parcel.writeString(this.content);
        parcel.writeString(this.count);
        parcel.writeString(this.text);
        List<BnplPayment> list = this.payments;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator c11 = J.c(parcel, 1, list);
        while (c11.hasNext()) {
            ((BnplPayment) c11.next()).writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ GraphBnpl(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : list);
    }
}
