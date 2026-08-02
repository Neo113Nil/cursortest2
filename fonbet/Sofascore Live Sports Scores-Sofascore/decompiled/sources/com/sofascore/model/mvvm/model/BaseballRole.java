package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = BaseballRoleSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballRole;", "", "serialName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSerialName", "()Ljava/lang/String;", "Pitcher", "Catcher", "FirstBase", "SecondBase", "ThirdBase", "Shortstop", "LeftField", "CenterField", "RightField", "DesignatedHitter", "PinchHitter", "PinchRunner", "HomePlate", "Unknown", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballRole {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BaseballRole[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("DH")
    public static final BaseballRole DesignatedHitter;

    @q5h("HP")
    public static final BaseballRole HomePlate;

    @q5h("PH")
    public static final BaseballRole PinchHitter;

    @q5h(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER)
    public static final BaseballRole PinchRunner;
    public static final BaseballRole Unknown;

    @NotNull
    private static final List<BaseballRole> battingPositions;

    @NotNull
    private final String serialName;

    @q5h("P")
    public static final BaseballRole Pitcher = new BaseballRole("Pitcher", 0, "P");

    @q5h("C")
    public static final BaseballRole Catcher = new BaseballRole("Catcher", 1, "C");

    @q5h("1B")
    public static final BaseballRole FirstBase = new BaseballRole("FirstBase", 2, "1B");

    @q5h("2B")
    public static final BaseballRole SecondBase = new BaseballRole("SecondBase", 3, "2B");

    @q5h("3B")
    public static final BaseballRole ThirdBase = new BaseballRole("ThirdBase", 4, "3B");

    @q5h(PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY)
    public static final BaseballRole Shortstop = new BaseballRole("Shortstop", 5, PlayerKt.AMERICAN_FOOTBALL_STRONG_SAFETY);

    @q5h("LF")
    public static final BaseballRole LeftField = new BaseballRole("LeftField", 6, "LF");

    @q5h("CF")
    public static final BaseballRole CenterField = new BaseballRole("CenterField", 7, "CF");

    @q5h("RF")
    public static final BaseballRole RightField = new BaseballRole("RightField", 8, "RF");

    private static final /* synthetic */ BaseballRole[] $values() {
        return new BaseballRole[]{Pitcher, Catcher, FirstBase, SecondBase, ThirdBase, Shortstop, LeftField, CenterField, RightField, DesignatedHitter, PinchHitter, PinchRunner, HomePlate, Unknown};
    }

    static {
        BaseballRole baseballRole = new BaseballRole("DesignatedHitter", 9, "DH");
        DesignatedHitter = baseballRole;
        BaseballRole baseballRole2 = new BaseballRole("PinchHitter", 10, "PH");
        PinchHitter = baseballRole2;
        BaseballRole baseballRole3 = new BaseballRole("PinchRunner", 11, PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER);
        PinchRunner = baseballRole3;
        HomePlate = new BaseballRole("HomePlate", 12, "HP");
        Unknown = new BaseballRole("Unknown", 13, "");
        BaseballRole[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        battingPositions = b.j(baseballRole, baseballRole2, baseballRole3);
    }

    private BaseballRole(String str, int i, String str2) {
        this.serialName = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BaseballRole valueOf(String str) {
        return (BaseballRole) Enum.valueOf(BaseballRole.class, str);
    }

    public static BaseballRole[] values() {
        return (BaseballRole[]) $VALUES.clone();
    }

    @NotNull
    public final String getSerialName() {
        return this.serialName;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/mvvm/model/BaseballRole$Companion;", "", "<init>", "()V", "battingPositions", "", "Lcom/sofascore/model/mvvm/model/BaseballRole;", "getBattingPositions", "()Ljava/util/List;", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<BaseballRole> getBattingPositions() {
            return BaseballRole.battingPositions;
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballRoleSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
