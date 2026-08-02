package com.sofascore.model.database;

import com.sofascore.model.mvvm.model.UserSegmentationType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/database/DbUserSegmentation;", "", "type", "Lcom/sofascore/model/mvvm/model/UserSegmentationType;", "<init>", "(Lcom/sofascore/model/mvvm/model/UserSegmentationType;)V", "getType", "()Lcom/sofascore/model/mvvm/model/UserSegmentationType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DbUserSegmentation {

    @NotNull
    private final UserSegmentationType type;

    public DbUserSegmentation(@NotNull UserSegmentationType userSegmentationType) {
        userSegmentationType.getClass();
        this.type = userSegmentationType;
    }

    public static /* synthetic */ DbUserSegmentation copy$default(DbUserSegmentation dbUserSegmentation, UserSegmentationType userSegmentationType, int i, Object obj) {
        if ((i & 1) != 0) {
            userSegmentationType = dbUserSegmentation.type;
        }
        return dbUserSegmentation.copy(userSegmentationType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final UserSegmentationType getType() {
        return this.type;
    }

    @NotNull
    public final DbUserSegmentation copy(@NotNull UserSegmentationType type) {
        type.getClass();
        return new DbUserSegmentation(type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DbUserSegmentation) && this.type == ((DbUserSegmentation) other).type;
    }

    @NotNull
    public final UserSegmentationType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "DbUserSegmentation(type=" + this.type + ")";
    }
}
