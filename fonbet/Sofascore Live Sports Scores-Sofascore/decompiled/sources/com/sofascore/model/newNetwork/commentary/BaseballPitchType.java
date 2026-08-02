package com.sofascore.model.newNetwork.commentary;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.i91;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001c\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;", "", "<init>", "(Ljava/lang/String;I)V", "Fastball", "FourSeamFastball", "Cutter", "Sinker", "Splitter", "Forkball", "Changeup", "Screwball", "Slider", "Curveball", "SlowCurve", "KnuckleCurve", "Slurve", "Sweeper", "Slutter", "Gyroball", "Knuckleball", "EephusPitch", "IntentionalBall", "Pitchout", "AutomaticBall", "AutomaticStrike", "NoPitch", "Unknown", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballPitchType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BaseballPitchType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("FA")
    public static final BaseballPitchType Fastball = new BaseballPitchType("Fastball", 0);

    @q5h("FF")
    public static final BaseballPitchType FourSeamFastball = new BaseballPitchType("FourSeamFastball", 1);

    @q5h("FC")
    public static final BaseballPitchType Cutter = new BaseballPitchType("Cutter", 2);

    @q5h("SI")
    public static final BaseballPitchType Sinker = new BaseballPitchType("Sinker", 3);

    @q5h(PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY)
    public static final BaseballPitchType Splitter = new BaseballPitchType("Splitter", 4);

    @q5h("FO")
    public static final BaseballPitchType Forkball = new BaseballPitchType("Forkball", 5);

    @q5h("CH")
    public static final BaseballPitchType Changeup = new BaseballPitchType("Changeup", 6);

    @q5h("SC")
    public static final BaseballPitchType Screwball = new BaseballPitchType("Screwball", 7);

    @q5h("SL")
    public static final BaseballPitchType Slider = new BaseballPitchType("Slider", 8);

    @q5h("CU")
    public static final BaseballPitchType Curveball = new BaseballPitchType("Curveball", 9);

    @q5h("CS")
    public static final BaseballPitchType SlowCurve = new BaseballPitchType("SlowCurve", 10);

    @q5h("KC")
    public static final BaseballPitchType KnuckleCurve = new BaseballPitchType("KnuckleCurve", 11);

    @q5h("SV")
    public static final BaseballPitchType Slurve = new BaseballPitchType("Slurve", 12);

    @q5h("ST")
    public static final BaseballPitchType Sweeper = new BaseballPitchType("Sweeper", 13);

    @q5h("FL")
    public static final BaseballPitchType Slutter = new BaseballPitchType("Slutter", 14);

    @q5h("GY")
    public static final BaseballPitchType Gyroball = new BaseballPitchType("Gyroball", 15);

    @q5h("KN")
    public static final BaseballPitchType Knuckleball = new BaseballPitchType("Knuckleball", 16);

    @q5h("EP")
    public static final BaseballPitchType EephusPitch = new BaseballPitchType("EephusPitch", 17);

    @q5h("IN")
    public static final BaseballPitchType IntentionalBall = new BaseballPitchType("IntentionalBall", 18);

    @q5h("PO")
    public static final BaseballPitchType Pitchout = new BaseballPitchType("Pitchout", 19);

    @q5h("AB")
    public static final BaseballPitchType AutomaticBall = new BaseballPitchType("AutomaticBall", 20);

    @q5h("AS")
    public static final BaseballPitchType AutomaticStrike = new BaseballPitchType("AutomaticStrike", 21);

    @q5h("NP")
    public static final BaseballPitchType NoPitch = new BaseballPitchType("NoPitch", 22);

    @q5h("UN")
    public static final BaseballPitchType Unknown = new BaseballPitchType("Unknown", 23);

    private static final /* synthetic */ BaseballPitchType[] $values() {
        return new BaseballPitchType[]{Fastball, FourSeamFastball, Cutter, Sinker, Splitter, Forkball, Changeup, Screwball, Slider, Curveball, SlowCurve, KnuckleCurve, Slurve, Sweeper, Slutter, Gyroball, Knuckleball, EephusPitch, IntentionalBall, Pitchout, AutomaticBall, AutomaticStrike, NoPitch, Unknown};
    }

    static {
        BaseballPitchType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new i91(2));
    }

    private BaseballPitchType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.commentary.BaseballPitchType", values(), new String[]{"FA", "FF", "FC", "SI", PlayerKt.AMERICAN_FOOTBALL_FREE_SAFETY, "FO", "CH", "SC", "SL", "CU", "CS", "KC", "SV", "ST", "FL", "GY", "KN", "EP", "IN", "PO", "AB", "AS", "NP", "UN"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BaseballPitchType valueOf(String str) {
        return (BaseballPitchType) Enum.valueOf(BaseballPitchType.class, str);
    }

    public static BaseballPitchType[] values() {
        return (BaseballPitchType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/commentary/BaseballPitchType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) BaseballPitchType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
