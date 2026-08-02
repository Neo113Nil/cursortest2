package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.b1c;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaPostMatchVotingOptions;", "Lcom/sofascore/model/newNetwork/VoteChoices;", "", "choice", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getChoice", "()Ljava/lang/String;", "FIRST_FIGHTER_WIN", "SECOND_FIGHTER_WIN", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MmaPostMatchVotingOptions implements VoteChoices {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ MmaPostMatchVotingOptions[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("1")
    public static final MmaPostMatchVotingOptions FIRST_FIGHTER_WIN = new MmaPostMatchVotingOptions("FIRST_FIGHTER_WIN", 0, "1");

    @q5h("2")
    public static final MmaPostMatchVotingOptions SECOND_FIGHTER_WIN = new MmaPostMatchVotingOptions("SECOND_FIGHTER_WIN", 1, "2");

    @NotNull
    private final String choice;

    private static final /* synthetic */ MmaPostMatchVotingOptions[] $values() {
        return new MmaPostMatchVotingOptions[]{FIRST_FIGHTER_WIN, SECOND_FIGHTER_WIN};
    }

    static {
        MmaPostMatchVotingOptions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new b1c(26));
    }

    private MmaPostMatchVotingOptions(String str, int i, String str2) {
        this.choice = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.MmaPostMatchVotingOptions", values(), new String[]{"1", "2"}, new Annotation[][]{null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static MmaPostMatchVotingOptions valueOf(String str) {
        return (MmaPostMatchVotingOptions) Enum.valueOf(MmaPostMatchVotingOptions.class, str);
    }

    public static MmaPostMatchVotingOptions[] values() {
        return (MmaPostMatchVotingOptions[]) $VALUES.clone();
    }

    @Override // com.sofascore.model.newNetwork.VoteChoices
    @NotNull
    public String getChoice() {
        return this.choice;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaPostMatchVotingOptions$Companion;", "", "<init>", "()V", "getFromChoice", "Lcom/sofascore/model/newNetwork/MmaPostMatchVotingOptions;", U3.i.X, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MmaPostMatchVotingOptions.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final MmaPostMatchVotingOptions getFromChoice(@Nullable String value) {
            Object obj;
            Iterator<E> it = MmaPostMatchVotingOptions.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((MmaPostMatchVotingOptions) obj).getChoice(), value)) {
                    break;
                }
            }
            return (MmaPostMatchVotingOptions) obj;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
