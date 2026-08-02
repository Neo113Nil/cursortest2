package com.sofascore.model.newNetwork.hockeyplaybyplay;

import com.sofascore.model.mvvm.model.Incident;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = HockeyPlayTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;", "", "<init>", "(Ljava/lang/String;I)V", "SHORTHANDED", "POWERPLAY", "EVEN", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HockeyPlayType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ HockeyPlayType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h(Incident.GoalIncident.TYPE_SHORT_HANDED)
    public static final HockeyPlayType SHORTHANDED = new HockeyPlayType("SHORTHANDED", 0);

    @q5h(Incident.GoalIncident.TYPE_POWER_PLAY)
    public static final HockeyPlayType POWERPLAY = new HockeyPlayType("POWERPLAY", 1);

    @q5h("even")
    public static final HockeyPlayType EVEN = new HockeyPlayType("EVEN", 2);

    private static final /* synthetic */ HockeyPlayType[] $values() {
        return new HockeyPlayType[]{SHORTHANDED, POWERPLAY, EVEN};
    }

    static {
        HockeyPlayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private HockeyPlayType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static HockeyPlayType valueOf(String str) {
        return (HockeyPlayType) Enum.valueOf(HockeyPlayType.class, str);
    }

    public static HockeyPlayType[] values() {
        return (HockeyPlayType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyPlayType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HockeyPlayTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
