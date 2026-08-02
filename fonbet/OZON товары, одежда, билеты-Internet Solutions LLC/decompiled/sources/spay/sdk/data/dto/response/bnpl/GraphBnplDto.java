package spay.sdk.data.dto.response.bnpl;

import B90.C2618u;
import J8.b;
import N3.C3660k;
import Nh.a;
import Ve.C4452mn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/response/bnpl/GraphBnplDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", CommentV3DTO.HEADER_FIELD_NAME, "", "content", "count", "text", "payments", "", "Lspay/sdk/data/dto/response/bnpl/BnplPaymentDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getCount", "getHeader", "getPayments", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GraphBnplDto implements DataDtoInterface<GraphBnpl> {

    @b("content")
    private final String content;

    @b("count")
    private final String count;

    @b(CommentV3DTO.HEADER_FIELD_NAME)
    private final String header;

    @b("payments")
    private final List<BnplPaymentDto> payments;

    @b("text")
    private final String text;

    public GraphBnplDto(String str, String str2, String str3, String str4, List<BnplPaymentDto> list) {
        this.header = str;
        this.content = str2;
        this.count = str3;
        this.text = str4;
        this.payments = list;
    }

    public static /* synthetic */ GraphBnplDto copy$default(GraphBnplDto graphBnplDto, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = graphBnplDto.header;
        }
        if ((i11 & 2) != 0) {
            str2 = graphBnplDto.content;
        }
        if ((i11 & 4) != 0) {
            str3 = graphBnplDto.count;
        }
        if ((i11 & 8) != 0) {
            str4 = graphBnplDto.text;
        }
        if ((i11 & 16) != 0) {
            list = graphBnplDto.payments;
        }
        List list2 = list;
        String str5 = str3;
        return graphBnplDto.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

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

    public final List<BnplPaymentDto> component5() {
        return this.payments;
    }

    @NotNull
    public final GraphBnplDto copy(String header, String content, String count, String text, List<BnplPaymentDto> payments) {
        return new GraphBnplDto(header, content, count, text, payments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphBnplDto)) {
            return false;
        }
        GraphBnplDto graphBnplDto = (GraphBnplDto) other;
        return Intrinsics.d(this.header, graphBnplDto.header) && Intrinsics.d(this.content, graphBnplDto.content) && Intrinsics.d(this.count, graphBnplDto.count) && Intrinsics.d(this.text, graphBnplDto.text) && Intrinsics.d(this.payments, graphBnplDto.payments);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCount() {
        return this.count;
    }

    public final String getHeader() {
        return this.header;
    }

    public final List<BnplPaymentDto> getPayments() {
        return this.payments;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.header;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.content;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.count;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BnplPaymentDto> list = this.payments;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.header;
        String str2 = this.content;
        String str3 = this.count;
        String str4 = this.text;
        List<BnplPaymentDto> list = this.payments;
        StringBuilder d11 = C3660k.d("GraphBnplDto(header=", str, ", content=", str2, ", count=");
        a.h(d11, str3, ", text=", str4, ", payments=");
        return C2618u.h(d11, list, ")");
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public GraphBnpl toModel() {
        String str = this.header;
        if (str == null) {
            throw new C4452mn(CommentV3DTO.HEADER_FIELD_NAME);
        }
        String str2 = this.content;
        if (str2 == null) {
            throw new C4452mn("content");
        }
        String str3 = this.count;
        String str4 = this.text;
        List<BnplPaymentDto> list = this.payments;
        return new GraphBnpl(str, str2, str3, str4, list != null ? GraphBnplDtoKt.toModelList(list) : null);
    }

    public /* synthetic */ GraphBnplDto(String str, String str2, String str3, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : list);
    }
}
