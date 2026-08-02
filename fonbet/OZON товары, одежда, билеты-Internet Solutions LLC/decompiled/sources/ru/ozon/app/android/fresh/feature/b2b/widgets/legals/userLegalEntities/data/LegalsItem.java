package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data;

import HY.a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/LegalsItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "payprops", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "controls", "", "Lru/ozon/uni/atoms/data/AtomDTO;", ProductAction.ACTION_REMOVE, "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPayprops", "getAddress", "getControls", "()Ljava/util/List;", "getRemove", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalsItem {
    public static final int $stable = 8;
    private final TextAtom address;
    private final List<AtomDTO> controls;
    private final TextAtom payprops;
    private final Remove remove;

    @NotNull
    private final TextAtom title;

    /* JADX WARN: Multi-variable type inference failed */
    public LegalsItem(@NotNull TextAtom title, TextAtom textAtom, TextAtom textAtom2, List<? extends AtomDTO> list, Remove remove) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.payprops = textAtom;
        this.address = textAtom2;
        this.controls = list;
        this.remove = remove;
    }

    public static /* synthetic */ LegalsItem copy$default(LegalsItem legalsItem, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, List list, Remove remove, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = legalsItem.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = legalsItem.payprops;
        }
        if ((i11 & 4) != 0) {
            textAtom3 = legalsItem.address;
        }
        if ((i11 & 8) != 0) {
            list = legalsItem.controls;
        }
        if ((i11 & 16) != 0) {
            remove = legalsItem.remove;
        }
        Remove remove2 = remove;
        TextAtom textAtom4 = textAtom3;
        return legalsItem.copy(textAtom, textAtom2, textAtom4, list, remove2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getPayprops() {
        return this.payprops;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getAddress() {
        return this.address;
    }

    public final List<AtomDTO> component4() {
        return this.controls;
    }

    /* renamed from: component5, reason: from getter */
    public final Remove getRemove() {
        return this.remove;
    }

    @NotNull
    public final LegalsItem copy(@NotNull TextAtom title, TextAtom payprops, TextAtom address, List<? extends AtomDTO> controls, Remove remove) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new LegalsItem(title, payprops, address, controls, remove);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalsItem)) {
            return false;
        }
        LegalsItem legalsItem = (LegalsItem) other;
        return Intrinsics.d(this.title, legalsItem.title) && Intrinsics.d(this.payprops, legalsItem.payprops) && Intrinsics.d(this.address, legalsItem.address) && Intrinsics.d(this.controls, legalsItem.controls) && Intrinsics.d(this.remove, legalsItem.remove);
    }

    public final TextAtom getAddress() {
        return this.address;
    }

    public final List<AtomDTO> getControls() {
        return this.controls;
    }

    public final TextAtom getPayprops() {
        return this.payprops;
    }

    public final Remove getRemove() {
        return this.remove;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.payprops;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.address;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        List<AtomDTO> list = this.controls;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Remove remove = this.remove;
        return hashCode4 + (remove != null ? remove.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.payprops;
        TextAtom textAtom3 = this.address;
        List<AtomDTO> list = this.controls;
        Remove remove = this.remove;
        StringBuilder a11 = a.a("LegalsItem(title=", textAtom, ", payprops=", textAtom2, ", address=");
        a11.append(textAtom3);
        a11.append(", controls=");
        a11.append(list);
        a11.append(", remove=");
        a11.append(remove);
        a11.append(")");
        return a11.toString();
    }
}
