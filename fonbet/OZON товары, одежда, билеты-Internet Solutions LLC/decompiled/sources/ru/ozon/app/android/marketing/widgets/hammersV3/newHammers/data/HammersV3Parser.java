package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.base.config.ParseException;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3DTO;
import sf.C9681g;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3Parser;", "Lkotlin/Function2;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO;", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3DTO;", "Lcom/squareup/moshi/n$a;", "jsonDTONames", "Lcom/squareup/moshi/n$a;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;", "headerDTOJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;", "productsDTOJsonAdapter", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3GradientHeaderDTO;", "gradientDTOJsonAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HammersV3Parser implements Function2<String, String, HammersV3DTO> {

    @NotNull
    private final JsonAdapter<HammersV3GradientHeaderDTO> gradientDTOJsonAdapter;

    @NotNull
    private final JsonAdapter<HammersV3HeaderDTO> headerDTOJsonAdapter;

    @NotNull
    private final n.a jsonDTONames;

    @NotNull
    private final JsonAdapter<HammersV3BodyDTO> productsDTOJsonAdapter;

    public HammersV3Parser(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        HammersV3DTO.DtoFieldName[] values = HammersV3DTO.DtoFieldName.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (HammersV3DTO.DtoFieldName dtoFieldName : values) {
            arrayList.add(dtoFieldName.getJsonName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.jsonDTONames = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
        this.headerDTOJsonAdapter = moshi.c(HammersV3HeaderDTO.class);
        this.productsDTOJsonAdapter = moshi.c(HammersV3BodyDTO.class);
        this.gradientDTOJsonAdapter = moshi.c(HammersV3GradientHeaderDTO.class);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public HammersV3DTO invoke(String params, String state) {
        C9681g source = new C9681g();
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        source.H0(state);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        pVar.beginObject();
        Object obj = null;
        HammersV3HeaderDTO hammersV3HeaderDTO = null;
        HammersV3GradientHeaderDTO hammersV3GradientHeaderDTO = null;
        while (pVar.hasNext()) {
            int v11 = pVar.v(this.jsonDTONames);
            if (v11 == HammersV3DTO.DtoFieldName.HEADER.ordinal()) {
                hammersV3HeaderDTO = this.headerDTOJsonAdapter.fromJson(pVar);
            } else if (v11 == HammersV3DTO.DtoFieldName.GRADIENT_HEADER.ordinal()) {
                hammersV3GradientHeaderDTO = this.gradientDTOJsonAdapter.fromJson(pVar);
            } else if (v11 == HammersV3DTO.DtoFieldName.PRODUCTS.ordinal()) {
                obj = C10727i.d(C10720e0.a(), new HammersV3Parser$invoke$1$1(pVar, this, null));
            } else {
                pVar.skipValue();
            }
        }
        pVar.endObject();
        List list = (List) obj;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((HammersV3BodyDTO) it.next()).setHasHeader((hammersV3HeaderDTO == null && hammersV3GradientHeaderDTO == null) ? false : true);
            }
        }
        HammersV3HeaderDTO hammersV3HeaderDTO2 = hammersV3HeaderDTO;
        if (list != null) {
            return new HammersV3DTO(hammersV3HeaderDTO2, list, hammersV3GradientHeaderDTO);
        }
        throw new ParseException("Products must not be null");
    }
}
