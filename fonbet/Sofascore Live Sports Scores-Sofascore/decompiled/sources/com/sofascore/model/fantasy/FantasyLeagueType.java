package com.sofascore.model.fantasy;

import defpackage.au6;
import defpackage.gz8;
import defpackage.hz8;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueType;", "", "<init>", "(Ljava/lang/String;I)V", "GLOBAL", "COUNTRY", "RANDOM", "PRIVATE", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyLeagueType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("1")
    public static final FantasyLeagueType GLOBAL = new FantasyLeagueType("GLOBAL", 0);

    @q5h("4")
    public static final FantasyLeagueType COUNTRY = new FantasyLeagueType("COUNTRY", 1);

    @q5h("3")
    public static final FantasyLeagueType RANDOM = new FantasyLeagueType("RANDOM", 2);

    @q5h("2")
    public static final FantasyLeagueType PRIVATE = new FantasyLeagueType("PRIVATE", 3);

    private static final /* synthetic */ FantasyLeagueType[] $values() {
        return new FantasyLeagueType[]{GLOBAL, COUNTRY, RANDOM, PRIVATE};
    }

    static {
        FantasyLeagueType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new au6(28));
    }

    private FantasyLeagueType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.fantasy.FantasyLeagueType", values(), new String[]{"1", "4", "3", "2"}, new Annotation[][]{null, null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyLeagueType valueOf(String str) {
        return (FantasyLeagueType) Enum.valueOf(FantasyLeagueType.class, str);
    }

    public static FantasyLeagueType[] values() {
        return (FantasyLeagueType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FantasyLeagueType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
