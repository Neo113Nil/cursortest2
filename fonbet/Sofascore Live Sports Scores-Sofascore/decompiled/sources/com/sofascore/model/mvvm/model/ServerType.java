package com.sofascore.model.mvvm.model;

import com.ironsource.mediationsdk.j;
import defpackage.gz8;
import defpackage.jp5;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/sofascore/model/mvvm/model/ServerType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "SPORT", "SEASON", "EVENT", "PRACTICE", "QUALIFYING", "QUALIFYING_PART", "RACE", "LAP", "STAGE", "PROLOGUE", "SPRINT", "DISCIPLINE", "SPRINT_QUALIFYING", "SPRINT_QUALIFYING_PART", "PRACTICE_PART", "DAY", "AFTER_STAGE", "CYCLING_OVERALL", j.f, "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServerType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ServerType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int id;
    public static final ServerType SPORT = new ServerType("SPORT", 0, 0);
    public static final ServerType SEASON = new ServerType("SEASON", 1, 1);
    public static final ServerType EVENT = new ServerType("EVENT", 2, 2);
    public static final ServerType PRACTICE = new ServerType("PRACTICE", 3, 3);
    public static final ServerType QUALIFYING = new ServerType("QUALIFYING", 4, 4);
    public static final ServerType QUALIFYING_PART = new ServerType("QUALIFYING_PART", 5, 5);
    public static final ServerType RACE = new ServerType("RACE", 6, 6);
    public static final ServerType LAP = new ServerType("LAP", 7, 7);
    public static final ServerType STAGE = new ServerType("STAGE", 8, 8);
    public static final ServerType PROLOGUE = new ServerType("PROLOGUE", 9, 9);
    public static final ServerType SPRINT = new ServerType("SPRINT", 10, 10);
    public static final ServerType DISCIPLINE = new ServerType("DISCIPLINE", 11, 11);
    public static final ServerType SPRINT_QUALIFYING = new ServerType("SPRINT_QUALIFYING", 12, 12);
    public static final ServerType SPRINT_QUALIFYING_PART = new ServerType("SPRINT_QUALIFYING_PART", 13, 13);
    public static final ServerType PRACTICE_PART = new ServerType("PRACTICE_PART", 14, 14);
    public static final ServerType DAY = new ServerType("DAY", 15, 15);
    public static final ServerType AFTER_STAGE = new ServerType("AFTER_STAGE", 16, 18);
    public static final ServerType CYCLING_OVERALL = new ServerType("CYCLING_OVERALL", 17, -99);
    public static final ServerType CUSTOM = new ServerType(j.f, 18, -100);

    private static final /* synthetic */ ServerType[] $values() {
        return new ServerType[]{SPORT, SEASON, EVENT, PRACTICE, QUALIFYING, QUALIFYING_PART, RACE, LAP, STAGE, PROLOGUE, SPRINT, DISCIPLINE, SPRINT_QUALIFYING, SPRINT_QUALIFYING_PART, PRACTICE_PART, DAY, AFTER_STAGE, CYCLING_OVERALL, CUSTOM};
    }

    static {
        ServerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private ServerType(String str, int i, int i2) {
        this.id = i2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ServerType valueOf(String str) {
        return (ServerType) Enum.valueOf(ServerType.class, str);
    }

    public static ServerType[] values() {
        return (ServerType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/mvvm/model/ServerType$Companion;", "", "<init>", "()V", "fromId", "Lcom/sofascore/model/mvvm/model/ServerType;", "id", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ServerType fromId(int id) {
            Object obj;
            Iterator<E> it = ServerType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ServerType) obj).getId() == id) {
                    break;
                }
            }
            return (ServerType) obj;
        }

        private Companion() {
        }
    }
}
