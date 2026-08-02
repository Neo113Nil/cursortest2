package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.core;

import Lm0.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CompanyCardDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u001c\u0010\f\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/core/CompanyCardConfig;", "Lj20/a;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "", "", "", "rawOptions", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption;", "parseCompanyOptions", "(Ljava/util/List;)Ljava/util/List;", "T", "json", "Ljava/lang/Class;", "clazz", "parseJson", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lcom/squareup/moshi/JsonAdapter;", "anyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompanyCardConfig implements InterfaceC7243a<CompanyCardDTO> {

    @NotNull
    private final JsonAdapter<Object> anyAdapter;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public CompanyCardConfig(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        this.anyAdapter = new Moshi(new Moshi.a()).c(Object.class);
    }

    private final List<CompanyCardDTO.CompanyCardOption> parseCompanyOptions(List<? extends Map<String, ? extends Object>> rawOptions) {
        List<? extends Map<String, ? extends Object>> list = rawOptions;
        if (list == null || list.isEmpty()) {
            return K.f71697a;
        }
        if (((Map) C7714v.K(rawOptions)).containsKey("centerBlock")) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = rawOptions.iterator();
            while (it.hasNext()) {
                CellDTO cellDTO = (CellDTO) parseJson(this.anyAdapter.toJson((Map) it.next()), CellDTO.class);
                CompanyCardDTO.CompanyCardOption.Cell cell = cellDTO != null ? new CompanyCardDTO.CompanyCardOption.Cell(cellDTO) : null;
                if (cell != null) {
                    arrayList.add(cell);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = rawOptions.iterator();
        while (it2.hasNext()) {
            DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO = (DisclosureTitleSubtitleCellDTO) parseJson(this.anyAdapter.toJson((Map) it2.next()), DisclosureTitleSubtitleCellDTO.class);
            CompanyCardDTO.CompanyCardOption.Disclosure disclosure = disclosureTitleSubtitleCellDTO != null ? new CompanyCardDTO.CompanyCardOption.Disclosure(disclosureTitleSubtitleCellDTO) : null;
            if (disclosure != null) {
                arrayList2.add(disclosure);
            }
        }
        return arrayList2;
    }

    private final <T> T parseJson(String json, Class<T> clazz) {
        try {
            return (T) this.jsonDeserializer.fromJson(json, (Class) clazz);
        } catch (Throwable th2) {
            a.f17149a.e(th2, "Failed to parse CompanyCard ".concat(clazz.getSimpleName()), new Object[0]);
            return null;
        }
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    public CompanyCardDTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CompanyCardDTO.CompanyCardParsedDTO companyCardParsedDTO = (CompanyCardDTO.CompanyCardParsedDTO) parseJson(state.b(), CompanyCardDTO.CompanyCardParsedDTO.class);
        if (companyCardParsedDTO == null) {
            return null;
        }
        return new CompanyCardDTO(companyCardParsedDTO.getLink(), companyCardParsedDTO.getCompanyName(), parseCompanyOptions(companyCardParsedDTO.getCompanyOptions()), companyCardParsedDTO.getButton(), companyCardParsedDTO.getBadge(), companyCardParsedDTO.getEmail(), companyCardParsedDTO.getBackgroundColor());
    }
}
