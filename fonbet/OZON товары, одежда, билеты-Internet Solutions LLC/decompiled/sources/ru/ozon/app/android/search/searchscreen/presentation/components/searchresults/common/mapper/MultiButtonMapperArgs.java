package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.mapper;

import Bi.b;
import Kk.C3532b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/MultiButtonMapperArgs;", "", "", "id", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "fixedFooterHeight", "<init>", "(JZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "getFixedFooterHeight", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MultiButtonMapperArgs {
    private final boolean fixedFooterHeight;
    private final long id;
    private final boolean isAdult;

    public MultiButtonMapperArgs(long j11, boolean z11, boolean z12) {
        this.id = j11;
        this.isAdult = z11;
        this.fixedFooterHeight = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiButtonMapperArgs)) {
            return false;
        }
        MultiButtonMapperArgs multiButtonMapperArgs = (MultiButtonMapperArgs) other;
        return this.id == multiButtonMapperArgs.id && this.isAdult == multiButtonMapperArgs.isAdult && this.fixedFooterHeight == multiButtonMapperArgs.fixedFooterHeight;
    }

    public final boolean getFixedFooterHeight() {
        return this.fixedFooterHeight;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fixedFooterHeight) + C3532b.a(Long.hashCode(this.id) * 31, 31, this.isAdult);
    }

    /* renamed from: isAdult, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isAdult;
        return b.f(Bl.b.c(j11, "MultiButtonMapperArgs(id=", ", isAdult=", z11), ", fixedFooterHeight=", this.fixedFooterHeight, ")");
    }
}
