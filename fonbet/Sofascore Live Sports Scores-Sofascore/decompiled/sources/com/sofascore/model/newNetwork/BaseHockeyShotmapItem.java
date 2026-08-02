package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Point2D;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010 \u001a\u00020\u0005H\u0096\u0080\u0004R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0012\u0010\u0011\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseHockeyShotmapItem;", "", "<init>", "()V", "id", "", "getId", "()I", "x", "", "getX", "()F", "setX", "(F)V", "y", "getY", "setY", "type", "getType", "period", "", "getPeriod", "()Ljava/lang/String;", "point", "Lcom/sofascore/model/mvvm/model/Point2D;", "getPoint", "()Lcom/sofascore/model/mvvm/model/Point2D;", "mirror", "", "equals", "", "other", "hashCode", "ShotmapItemType", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseHockeyShotmapItem {
    public static final int PROVIDER_FIELD_HEIGHT = 102;
    public static final int PROVIDER_FIELD_WIDTH = 240;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseHockeyShotmapItem$ShotmapItemType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "MISSED_SHOT", "GOAL", "SAVED_SHOT", "BLOCKED_SHOT", "FACEOFF", "SUSPENSION", "HIT", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ShotmapItemType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ ShotmapItemType[] $VALUES;
        private final int id;
        public static final ShotmapItemType MISSED_SHOT = new ShotmapItemType("MISSED_SHOT", 0, 0);
        public static final ShotmapItemType GOAL = new ShotmapItemType("GOAL", 1, 1);
        public static final ShotmapItemType SAVED_SHOT = new ShotmapItemType("SAVED_SHOT", 2, 2);
        public static final ShotmapItemType BLOCKED_SHOT = new ShotmapItemType("BLOCKED_SHOT", 3, 3);
        public static final ShotmapItemType FACEOFF = new ShotmapItemType("FACEOFF", 4, 101);
        public static final ShotmapItemType SUSPENSION = new ShotmapItemType("SUSPENSION", 5, 102);
        public static final ShotmapItemType HIT = new ShotmapItemType("HIT", 6, 103);

        private static final /* synthetic */ ShotmapItemType[] $values() {
            return new ShotmapItemType[]{MISSED_SHOT, GOAL, SAVED_SHOT, BLOCKED_SHOT, FACEOFF, SUSPENSION, HIT};
        }

        static {
            ShotmapItemType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private ShotmapItemType(String str, int i, int i2) {
            this.id = i2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static ShotmapItemType valueOf(String str) {
            return (ShotmapItemType) Enum.valueOf(ShotmapItemType.class, str);
        }

        public static ShotmapItemType[] values() {
            return (ShotmapItemType[]) $VALUES.clone();
        }

        public final int getId() {
            return this.id;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        BaseHockeyShotmapItem baseHockeyShotmapItem = (BaseHockeyShotmapItem) other;
        return getId() == baseHockeyShotmapItem.getId() && getX() == baseHockeyShotmapItem.getX() && getY() == baseHockeyShotmapItem.getY() && getType() == baseHockeyShotmapItem.getType() && Intrinsics.c(getPeriod(), baseHockeyShotmapItem.getPeriod());
    }

    public abstract int getId();

    @Nullable
    public abstract String getPeriod();

    @NotNull
    public final Point2D getPoint() {
        return new Point2D(getX(), getY());
    }

    public abstract int getType();

    public abstract float getX();

    public abstract float getY();

    public int hashCode() {
        int type = (getType() + ((Float.hashCode(getY()) + ((Float.hashCode(getX()) + (getId() * 31)) * 31)) * 31)) * 31;
        String period = getPeriod();
        return type + (period != null ? period.hashCode() : 0);
    }

    public final void mirror() {
        setX(240.0f - getX());
        setY(102.0f - getY());
    }

    public abstract void setX(float f);

    public abstract void setY(float f);
}
