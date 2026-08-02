package com.sofascore.model.mvvm.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/sofascore/model/mvvm/model/UserSegmentationTypeConverter;", "", "<init>", "()V", "fromEnum", "", "type", "Lcom/sofascore/model/mvvm/model/UserSegmentationType;", "toEnum", "id", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserSegmentationTypeConverter {

    @NotNull
    public static final UserSegmentationTypeConverter INSTANCE = new UserSegmentationTypeConverter();

    private UserSegmentationTypeConverter() {
    }

    public final int fromEnum(@NotNull UserSegmentationType type) {
        type.getClass();
        return type.getId();
    }

    @NotNull
    public final UserSegmentationType toEnum(int id) {
        return UserSegmentationType.INSTANCE.getById(id);
    }
}
