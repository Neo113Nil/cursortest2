package com.appsflyer.sdk_base.referrer;

import android.content.Context;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \"2\u00020\u0001:\u0002\"#B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u001bJ\b\u0010\u001f\u001a\u00020\u001bH\u0014J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/appsflyer/sdk_base/referrer/Referrer;", "", "type", "", "source", "prop", "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V", "getType", "()Ljava/lang/String;", "getSource", "getProp", "()Lcom/appsflyer/sdk_base/referrer/ReferrerProp;", "startTime", "", U3.i.X, "Lcom/appsflyer/sdk_base/referrer/Referrer$State;", "state", "getState", "()Lcom/appsflyer/sdk_base/referrer/Referrer$State;", "map", "", "referrerDataCollectionFinishedCallbacks", "", "Ljava/lang/Runnable;", "start", "", "context", "Landroid/content/Context;", "finish", "addLatency", "setAdditionalReferrerDataCollectionFinishedCallback", "additionalReferrerDataCollectionFinishedCallback", "Companion", "State", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Referrer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> externalReferrers = new LinkedHashSet();

    @NotNull
    public final Map<String, Object> map;

    @NotNull
    private final ReferrerProp prop;

    @NotNull
    private List<Runnable> referrerDataCollectionFinishedCallbacks;

    @Nullable
    private final String source;
    private long startTime;

    @NotNull
    private State state;

    @NotNull
    private final String type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/appsflyer/sdk_base/referrer/Referrer$State;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_STARTED", "STARTED", "FINISHED", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NOT_STARTED = new State("NOT_STARTED", 0);
        public static final State STARTED = new State("STARTED", 1);
        public static final State FINISHED = new State("FINISHED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NOT_STARTED, STARTED, FINISHED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private State(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Referrer(@NotNull String str, @Nullable String str2, @NotNull ReferrerProp referrerProp) {
        str.getClass();
        referrerProp.getClass();
        this.type = str;
        this.source = str2;
        this.prop = referrerProp;
        this.state = State.NOT_STARTED;
        this.map = new LinkedHashMap();
        this.referrerDataCollectionFinishedCallbacks = new ArrayList();
    }

    public static final boolean addExternalReferrers(@NotNull Pair<? extends ReferrerCreator<? extends Referrer>, ? extends Class<? extends BaseReferrerInitProvider>> pair) {
        return INSTANCE.addExternalReferrers(pair);
    }

    public static final void clearExternalReferrersForTesting() {
        INSTANCE.clearExternalReferrersForTesting();
    }

    @NotNull
    public static final Set<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> getExternalReferrers() {
        return INSTANCE.getExternalReferrers();
    }

    public void addLatency() {
        this.map.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - this.startTime));
    }

    public final void finish() {
        this.state = State.FINISHED;
        this.map.put("type", this.type);
        this.map.put("source", this.source);
        addLatency();
        Iterator<T> it = this.referrerDataCollectionFinishedCallbacks.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @NotNull
    public final ReferrerProp getProp() {
        return this.prop;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setAdditionalReferrerDataCollectionFinishedCallback(@NotNull Runnable additionalReferrerDataCollectionFinishedCallback) {
        additionalReferrerDataCollectionFinishedCallback.getClass();
        this.referrerDataCollectionFinishedCallbacks.add(additionalReferrerDataCollectionFinishedCallback);
    }

    public final void start() {
        this.state = State.STARTED;
        this.startTime = System.currentTimeMillis();
        this.referrerDataCollectionFinishedCallbacks.add(this.prop.getListener());
    }

    public abstract void start(@NotNull Context context);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\f2 \u0010\r\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\u0006H\u0007J(\u0010\u000e\u001a\"\u0012\u001e\u0012\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\u00060\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007R.\u0010\u0004\u001a\"\u0012\u001e\u0012\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/appsflyer/sdk_base/referrer/Referrer$Companion;", "", "<init>", "()V", "externalReferrers", "", "Lkotlin/Pair;", "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;", "Lcom/appsflyer/sdk_base/referrer/Referrer;", "Ljava/lang/Class;", "Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;", "addExternalReferrers", "", "creator", "getExternalReferrers", "", "clearExternalReferrersForTesting", "", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean addExternalReferrers(@NotNull Pair<? extends ReferrerCreator<? extends Referrer>, ? extends Class<? extends BaseReferrerInitProvider>> creator) {
            creator.getClass();
            return Referrer.externalReferrers.add(creator);
        }

        public final void clearExternalReferrersForTesting() {
            Referrer.externalReferrers.clear();
        }

        @NotNull
        public final Set<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> getExternalReferrers() {
            return Referrer.externalReferrers;
        }

        private Companion() {
        }
    }
}
