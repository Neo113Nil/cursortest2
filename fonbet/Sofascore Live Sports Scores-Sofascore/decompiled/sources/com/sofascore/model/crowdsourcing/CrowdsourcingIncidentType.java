package com.sofascore.model.crowdsourcing;

import defpackage.duf;
import defpackage.fuf;
import defpackage.g14;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zvg;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;", "", "Goal", "Card", "Companion", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CrowdsourcingIncidentType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            fuf fufVar = duf.a;
            return new zvg("com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType", fufVar.getOrCreateKotlinClass(CrowdsourcingIncidentType.class), new KClass[]{fufVar.getOrCreateKotlinClass(Card.class), fufVar.getOrCreateKotlinClass(Goal.class)}, new KSerializer[]{hz8.F("com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType.Card", Card.values(), new String[]{"Yellow", "Red", "YellowRed"}, new Annotation[][]{null, null, null}), hz8.F("com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType.Goal", Goal.values(), new String[]{"regular", "penalty", "owngoal"}, new Annotation[][]{null, null, null})}, new Annotation[0]);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;", "", "<init>", "(Ljava/lang/String;I)V", "YELLOW", "RED", "SECOND_YELLOW", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Card implements CrowdsourcingIncidentType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Card[] $VALUES;

        @NotNull
        private static final joa $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @q5h("Yellow")
        public static final Card YELLOW = new Card("YELLOW", 0);

        @q5h("Red")
        public static final Card RED = new Card("RED", 1);

        @q5h("YellowRed")
        public static final Card SECOND_YELLOW = new Card("SECOND_YELLOW", 2);

        private static final /* synthetic */ Card[] $values() {
            return new Card[]{YELLOW, RED, SECOND_YELLOW};
        }

        static {
            Card[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = ypa.a(ysa.b, new g14(14));
        }

        private Card(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return hz8.F("com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType.Card", values(), new String[]{"Yellow", "Red", "YellowRed"}, new Annotation[][]{null, null, null});
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Card valueOf(String str) {
            return (Card) Enum.valueOf(Card.class, str);
        }

        public static Card[] values() {
            return (Card[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Card.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @r5h
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "PENALTY", "OWN_GOAL", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Goal implements CrowdsourcingIncidentType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Goal[] $VALUES;

        @NotNull
        private static final joa $cachedSerializer$delegate;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @q5h("regular")
        public static final Goal REGULAR = new Goal("REGULAR", 0);

        @q5h("penalty")
        public static final Goal PENALTY = new Goal("PENALTY", 1);

        @q5h("owngoal")
        public static final Goal OWN_GOAL = new Goal("OWN_GOAL", 2);

        private static final /* synthetic */ Goal[] $values() {
            return new Goal[]{REGULAR, PENALTY, OWN_GOAL};
        }

        static {
            Goal[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = ypa.a(ysa.b, new g14(15));
        }

        private Goal(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return hz8.F("com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType.Goal", values(), new String[]{"regular", "penalty", "owngoal"}, new Annotation[][]{null, null, null});
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Goal valueOf(String str) {
            return (Goal) Enum.valueOf(Goal.class, str);
        }

        public static Goal[] values() {
            return (Goal[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Goal;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Goal.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }
    }
}
