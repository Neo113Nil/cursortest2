package ru.ozon.app.android.ugc.widgets.createlistwrapper.data;

import Ep.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/createlistwrapper/data/CreateListWrapperDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "skus", "", "", "limit", "", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Ljava/lang/Integer;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSkus", "()Ljava/util/List;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/widgets/createlistwrapper/data/CreateListWrapperDTO;", "equals", "", "other", "hashCode", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateListWrapperDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton button;
    private final Integer limit;
    private final List<Long> skus;

    public CreateListWrapperDTO(@NotNull ButtonV3Atom.LargeButton button, List<Long> list, Integer num) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.skus = list;
        this.limit = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateListWrapperDTO copy$default(CreateListWrapperDTO createListWrapperDTO, ButtonV3Atom.LargeButton largeButton, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            largeButton = createListWrapperDTO.button;
        }
        if ((i11 & 2) != 0) {
            list = createListWrapperDTO.skus;
        }
        if ((i11 & 4) != 0) {
            num = createListWrapperDTO.limit;
        }
        return createListWrapperDTO.copy(largeButton, list, num);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final List<Long> component2() {
        return this.skus;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    @NotNull
    public final CreateListWrapperDTO copy(@NotNull ButtonV3Atom.LargeButton button, List<Long> skus, Integer limit) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new CreateListWrapperDTO(button, skus, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateListWrapperDTO)) {
            return false;
        }
        CreateListWrapperDTO createListWrapperDTO = (CreateListWrapperDTO) other;
        return Intrinsics.d(this.button, createListWrapperDTO.button) && Intrinsics.d(this.skus, createListWrapperDTO.skus) && Intrinsics.d(this.limit, createListWrapperDTO.limit);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final List<Long> getSkus() {
        return this.skus;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        List<Long> list = this.skus;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.limit;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.LargeButton largeButton = this.button;
        List<Long> list = this.skus;
        Integer num = this.limit;
        StringBuilder sb2 = new StringBuilder("CreateListWrapperDTO(button=");
        sb2.append(largeButton);
        sb2.append(", skus=");
        sb2.append(list);
        sb2.append(", limit=");
        return a.c(sb2, num, ")");
    }
}
