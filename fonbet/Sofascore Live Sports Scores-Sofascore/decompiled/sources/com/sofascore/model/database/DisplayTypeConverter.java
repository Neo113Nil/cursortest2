package com.sofascore.model.database;

import com.ironsource.U3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/sofascore/model/database/DisplayTypeConverter;", "", "<init>", "()V", "displayTypeToString", "", "displayType", "Lcom/sofascore/model/database/DisplayType;", "stringToDisplayType", U3.i.X, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisplayTypeConverter {

    @NotNull
    public static final DisplayTypeConverter INSTANCE = new DisplayTypeConverter();

    private DisplayTypeConverter() {
    }

    @NotNull
    public static final String displayTypeToString(@NotNull DisplayType displayType) {
        displayType.getClass();
        return displayType.getType();
    }

    @NotNull
    public static final DisplayType stringToDisplayType(@NotNull String value) {
        value.getClass();
        return DisplayType.INSTANCE.getFromValue(value);
    }
}
