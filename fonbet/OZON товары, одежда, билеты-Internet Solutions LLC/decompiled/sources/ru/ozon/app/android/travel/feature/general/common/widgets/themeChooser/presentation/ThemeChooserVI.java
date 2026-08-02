package ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation;

import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.data.ThemeChooserDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/data/ThemeChooserDTO$ThemeSelector;", "selectors", "<init>", "(JLjava/util/List;)V", "copy", "(JLjava/util/List;)Lru/ozon/app/android/travel/feature/general/common/widgets/themeChooser/presentation/ThemeChooserVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSelectors", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThemeChooserVI implements c {
    private final long id;

    @NotNull
    private final List<ThemeChooserDTO.ThemeSelector> selectors;

    public ThemeChooserVI(long j11, @NotNull List<ThemeChooserDTO.ThemeSelector> selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        this.id = j11;
        this.selectors = selectors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeChooserVI copy$default(ThemeChooserVI themeChooserVI, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = themeChooserVI.id;
        }
        if ((i11 & 2) != 0) {
            list = themeChooserVI.selectors;
        }
        return themeChooserVI.copy(j11, list);
    }

    @NotNull
    public final ThemeChooserVI copy(long id2, @NotNull List<ThemeChooserDTO.ThemeSelector> selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        return new ThemeChooserVI(id2, selectors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeChooserVI)) {
            return false;
        }
        ThemeChooserVI themeChooserVI = (ThemeChooserVI) other;
        return this.id == themeChooserVI.id && Intrinsics.d(this.selectors, themeChooserVI.selectors);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<ThemeChooserDTO.ThemeSelector> getSelectors() {
        return this.selectors;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.selectors.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "ThemeChooserVI(id=", ", selectors=", this.selectors);
        b11.append(")");
        return b11.toString();
    }
}
