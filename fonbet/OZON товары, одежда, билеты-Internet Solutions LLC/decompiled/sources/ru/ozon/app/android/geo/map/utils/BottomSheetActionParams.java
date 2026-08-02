package ru.ozon.app.android.geo.map.utils;

import C.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/geo/map/utils/BottomSheetActionParams;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "skipCollapsed", "state", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "getSkipCollapsed", "()Ljava/lang/Boolean;", "getState", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BottomSheetActionParams {
    private final Boolean skipCollapsed;
    private final String state;
    private final String title;

    public BottomSheetActionParams(String str, Boolean bool, String str2) {
        this.title = str;
        this.skipCollapsed = bool;
        this.state = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetActionParams)) {
            return false;
        }
        BottomSheetActionParams bottomSheetActionParams = (BottomSheetActionParams) other;
        return Intrinsics.d(this.title, bottomSheetActionParams.title) && Intrinsics.d(this.skipCollapsed, bottomSheetActionParams.skipCollapsed) && Intrinsics.d(this.state, bottomSheetActionParams.state);
    }

    public final Boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.skipCollapsed;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.state;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        Boolean bool = this.skipCollapsed;
        String str2 = this.state;
        StringBuilder sb2 = new StringBuilder("BottomSheetActionParams(title=");
        sb2.append(str);
        sb2.append(", skipCollapsed=");
        sb2.append(bool);
        sb2.append(", state=");
        return o0.c(sb2, str2, ")");
    }
}
