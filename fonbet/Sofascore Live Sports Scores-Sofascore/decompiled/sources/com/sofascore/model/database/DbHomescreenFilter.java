package com.sofascore.model.database;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sofascore/model/database/DbHomescreenFilter;", "", "sportName", "", "selectedFilters", "", "displayType", "Lcom/sofascore/model/database/DisplayType;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/sofascore/model/database/DisplayType;)V", "getSportName", "()Ljava/lang/String;", "getSelectedFilters", "()Ljava/util/Map;", "getDisplayType", "()Lcom/sofascore/model/database/DisplayType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DbHomescreenFilter {

    @NotNull
    private final DisplayType displayType;

    @NotNull
    private final Map<String, String> selectedFilters;

    @NotNull
    private final String sportName;

    public DbHomescreenFilter(@NotNull String str, @NotNull Map<String, String> map, @NotNull DisplayType displayType) {
        str.getClass();
        map.getClass();
        displayType.getClass();
        this.sportName = str;
        this.selectedFilters = map;
        this.displayType = displayType;
    }

    @NotNull
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @NotNull
    public final Map<String, String> getSelectedFilters() {
        return this.selectedFilters;
    }

    @NotNull
    public final String getSportName() {
        return this.sportName;
    }
}
