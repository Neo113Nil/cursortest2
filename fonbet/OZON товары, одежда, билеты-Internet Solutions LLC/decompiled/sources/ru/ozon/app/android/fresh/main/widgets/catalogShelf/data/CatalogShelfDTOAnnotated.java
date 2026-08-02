package ru.ozon.app.android.fresh.main.widgets.catalogShelf.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTOAnnotated;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfModel;", "sections", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection;", "<init>", "(Ljava/util/List;)V", "getSections$annotations", "()V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogShelfDTOAnnotated implements CatalogShelfModel {

    @NotNull
    private final List<CatalogShelfDTO.CatalogShelfSection> sections;

    public CatalogShelfDTOAnnotated(@NotNull List<CatalogShelfDTO.CatalogShelfSection> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogShelfDTOAnnotated copy$default(CatalogShelfDTOAnnotated catalogShelfDTOAnnotated, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = catalogShelfDTOAnnotated.sections;
        }
        return catalogShelfDTOAnnotated.copy(list);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getSections$annotations() {
    }

    @NotNull
    public final List<CatalogShelfDTO.CatalogShelfSection> component1() {
        return this.sections;
    }

    @NotNull
    public final CatalogShelfDTOAnnotated copy(@NotNull List<CatalogShelfDTO.CatalogShelfSection> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new CatalogShelfDTOAnnotated(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CatalogShelfDTOAnnotated) && Intrinsics.d(this.sections, ((CatalogShelfDTOAnnotated) other).sections);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfModel
    @NotNull
    public List<CatalogShelfDTO.CatalogShelfSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("CatalogShelfDTOAnnotated(sections=", ")", this.sections);
    }
}
