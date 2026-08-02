package com.sofascore.model.fantasy;

import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueGameType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLASSIC", "HEAD_TO_HEAD", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueGameType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FantasyLeagueGameType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int value;

    @q5h("1")
    public static final FantasyLeagueGameType CLASSIC = new FantasyLeagueGameType("CLASSIC", 0, 1);

    @q5h("2")
    public static final FantasyLeagueGameType HEAD_TO_HEAD = new FantasyLeagueGameType("HEAD_TO_HEAD", 1, 2);

    private static final /* synthetic */ FantasyLeagueGameType[] $values() {
        return new FantasyLeagueGameType[]{CLASSIC, HEAD_TO_HEAD};
    }

    static {
        FantasyLeagueGameType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new au6(22));
    }

    private FantasyLeagueGameType(String str, int i, int i2) {
        this.value = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.fantasy.FantasyLeagueGameType", values(), new String[]{"1", "2"}, new Annotation[][]{null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FantasyLeagueGameType valueOf(String str) {
        return (FantasyLeagueGameType) Enum.valueOf(FantasyLeagueGameType.class, str);
    }

    public static FantasyLeagueGameType[] values() {
        return (FantasyLeagueGameType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueGameType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueGameType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FantasyLeagueGameType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
