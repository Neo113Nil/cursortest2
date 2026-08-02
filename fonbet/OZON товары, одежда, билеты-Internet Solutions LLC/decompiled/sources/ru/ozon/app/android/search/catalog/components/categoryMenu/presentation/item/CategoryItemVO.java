package ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item;

import B0.C2454a;
import Bl.b;
import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b#\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010\u0013R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isSelected", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "startOffset", "modalUrl", "categoryUrl", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "Ljava/lang/String;", "getName", "I", "getStartOffset", "getModalUrl", "getCategoryUrl", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryItemVO implements c {

    @NotNull
    private final String categoryUrl;
    private final long id;
    private final boolean isSelected;

    @NotNull
    private final String modalUrl;

    @NotNull
    private final String name;
    private final int startOffset;
    private final t tokenizedEvent;

    public CategoryItemVO(long j11, boolean z11, @NotNull String name, int i11, @NotNull String modalUrl, @NotNull String categoryUrl, t tVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modalUrl, "modalUrl");
        Intrinsics.checkNotNullParameter(categoryUrl, "categoryUrl");
        this.id = j11;
        this.isSelected = z11;
        this.name = name;
        this.startOffset = i11;
        this.modalUrl = modalUrl;
        this.categoryUrl = categoryUrl;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryItemVO)) {
            return false;
        }
        CategoryItemVO categoryItemVO = (CategoryItemVO) other;
        return this.id == categoryItemVO.id && this.isSelected == categoryItemVO.isSelected && Intrinsics.d(this.name, categoryItemVO.name) && this.startOffset == categoryItemVO.startOffset && Intrinsics.d(this.modalUrl, categoryItemVO.modalUrl) && Intrinsics.d(this.categoryUrl, categoryItemVO.categoryUrl) && Intrinsics.d(this.tokenizedEvent, categoryItemVO.tokenizedEvent);
    }

    @NotNull
    public final String getCategoryUrl() {
        return this.categoryUrl;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getModalUrl() {
        return this.modalUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getStartOffset() {
        return this.startOffset;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(C2454a.a(this.startOffset, g.a(C3532b.a(Long.hashCode(this.id) * 31, 31, this.isSelected), 31, this.name), 31), 31, this.modalUrl), 31, this.categoryUrl);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isSelected;
        String str = this.name;
        int i11 = this.startOffset;
        String str2 = this.modalUrl;
        String str3 = this.categoryUrl;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = b.c(j11, "CategoryItemVO(id=", ", isSelected=", z11);
        c11.append(", name=");
        c11.append(str);
        c11.append(", startOffset=");
        c11.append(i11);
        a.h(c11, ", modalUrl=", str2, ", categoryUrl=", str3);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
