package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.go7;
import defpackage.gz8;
import defpackage.hz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;", "Lcom/sofascore/model/newNetwork/VoteChoices;", "", "choice", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getChoice", "()Ljava/lang/String;", "HOME_TEAM_SCORE_FIRST", "AWAY_TEAM_SCORE_FIRST", "NO_GOAL", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FirstTeamToScoreOptions implements VoteChoices {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FirstTeamToScoreOptions[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String choice;

    @q5h("1")
    public static final FirstTeamToScoreOptions HOME_TEAM_SCORE_FIRST = new FirstTeamToScoreOptions("HOME_TEAM_SCORE_FIRST", 0, "1");

    @q5h("2")
    public static final FirstTeamToScoreOptions AWAY_TEAM_SCORE_FIRST = new FirstTeamToScoreOptions("AWAY_TEAM_SCORE_FIRST", 1, "2");

    @q5h("noGoal")
    public static final FirstTeamToScoreOptions NO_GOAL = new FirstTeamToScoreOptions("NO_GOAL", 2, "noGoal");

    private static final /* synthetic */ FirstTeamToScoreOptions[] $values() {
        return new FirstTeamToScoreOptions[]{HOME_TEAM_SCORE_FIRST, AWAY_TEAM_SCORE_FIRST, NO_GOAL};
    }

    static {
        FirstTeamToScoreOptions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new go7(26));
    }

    private FirstTeamToScoreOptions(String str, int i, String str2) {
        this.choice = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.FirstTeamToScoreOptions", values(), new String[]{"1", "2", "noGoal"}, new Annotation[][]{null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FirstTeamToScoreOptions valueOf(String str) {
        return (FirstTeamToScoreOptions) Enum.valueOf(FirstTeamToScoreOptions.class, str);
    }

    public static FirstTeamToScoreOptions[] values() {
        return (FirstTeamToScoreOptions[]) $VALUES.clone();
    }

    @Override // com.sofascore.model.newNetwork.VoteChoices
    @NotNull
    public String getChoice() {
        return this.choice;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions$Companion;", "", "<init>", "()V", "getFromChoice", "Lcom/sofascore/model/newNetwork/FirstTeamToScoreOptions;", U3.i.X, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FirstTeamToScoreOptions.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final FirstTeamToScoreOptions getFromChoice(@Nullable String value) {
            Object obj;
            Iterator<E> it = FirstTeamToScoreOptions.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((FirstTeamToScoreOptions) obj).getChoice(), value)) {
                    break;
                }
            }
            return (FirstTeamToScoreOptions) obj;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
