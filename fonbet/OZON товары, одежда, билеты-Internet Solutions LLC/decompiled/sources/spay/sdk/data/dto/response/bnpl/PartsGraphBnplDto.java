package spay.sdk.data.dto.response.bnpl;

import B90.C2618u;
import J8.b;
import N3.C3660k;
import Nh.a;
import Ve.C4452mn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.bnpl.PartsGraphBnpl;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/response/bnpl/PartsGraphBnplDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/bnpl/PartsGraphBnpl;", CommentV3DTO.HEADER_FIELD_NAME, "", "content", "count", "text", "singleProductSixPart", "", "Lspay/sdk/data/dto/response/bnpl/SixPartPayDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "getCount", "getHeader", "getSingleProductSixPart", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PartsGraphBnplDto implements DataDtoInterface<PartsGraphBnpl> {

    @b("content")
    private final String content;

    @b("count")
    private final String count;

    @b(CommentV3DTO.HEADER_FIELD_NAME)
    private final String header;

    @b("singleProductSixPart")
    @NotNull
    private final List<SixPartPayDto> singleProductSixPart;

    @b("text")
    private final String text;

    public PartsGraphBnplDto(String str, String str2, String str3, String str4, @NotNull List<SixPartPayDto> singleProductSixPart) {
        Intrinsics.checkNotNullParameter(singleProductSixPart, "singleProductSixPart");
        this.header = str;
        this.content = str2;
        this.count = str3;
        this.text = str4;
        this.singleProductSixPart = singleProductSixPart;
    }

    public static /* synthetic */ PartsGraphBnplDto copy$default(PartsGraphBnplDto partsGraphBnplDto, String str, String str2, String str3, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = partsGraphBnplDto.header;
        }
        if ((i11 & 2) != 0) {
            str2 = partsGraphBnplDto.content;
        }
        if ((i11 & 4) != 0) {
            str3 = partsGraphBnplDto.count;
        }
        if ((i11 & 8) != 0) {
            str4 = partsGraphBnplDto.text;
        }
        if ((i11 & 16) != 0) {
            list = partsGraphBnplDto.singleProductSixPart;
        }
        List list2 = list;
        String str5 = str3;
        return partsGraphBnplDto.copy(str, str2, str5, str4, list2);
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

    @NotNull
    public final List<SixPartPayDto> component5() {
        return this.singleProductSixPart;
    }

    @NotNull
    public final PartsGraphBnplDto copy(String header, String content, String count, String text, @NotNull List<SixPartPayDto> singleProductSixPart) {
        Intrinsics.checkNotNullParameter(singleProductSixPart, "singleProductSixPart");
        return new PartsGraphBnplDto(header, content, count, text, singleProductSixPart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartsGraphBnplDto)) {
            return false;
        }
        PartsGraphBnplDto partsGraphBnplDto = (PartsGraphBnplDto) other;
        return Intrinsics.d(this.header, partsGraphBnplDto.header) && Intrinsics.d(this.content, partsGraphBnplDto.content) && Intrinsics.d(this.count, partsGraphBnplDto.count) && Intrinsics.d(this.text, partsGraphBnplDto.text) && Intrinsics.d(this.singleProductSixPart, partsGraphBnplDto.singleProductSixPart);
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

    @NotNull
    public final List<SixPartPayDto> getSingleProductSixPart() {
        return this.singleProductSixPart;
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
        return this.singleProductSixPart.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.header;
        String str2 = this.content;
        String str3 = this.count;
        String str4 = this.text;
        List<SixPartPayDto> list = this.singleProductSixPart;
        StringBuilder d11 = C3660k.d("PartsGraphBnplDto(header=", str, ", content=", str2, ", count=");
        a.h(d11, str3, ", text=", str4, ", singleProductSixPart=");
        return C2618u.h(d11, list, ")");
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public PartsGraphBnpl toModel() {
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
        List<SixPartPayDto> list = this.singleProductSixPart;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SixPartPayDto) it.next()).toModel());
        }
        return new PartsGraphBnpl(str, str2, str3, str4, arrayList);
    }
}
