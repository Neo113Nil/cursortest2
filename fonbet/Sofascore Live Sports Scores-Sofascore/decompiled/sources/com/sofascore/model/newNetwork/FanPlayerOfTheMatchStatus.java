package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.ec6;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSED", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FanPlayerOfTheMatchStatus {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ FanPlayerOfTheMatchStatus[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("open")
    public static final FanPlayerOfTheMatchStatus OPEN = new FanPlayerOfTheMatchStatus("OPEN", 0);

    @q5h(StatusKt.STATUS_FINISHED)
    public static final FanPlayerOfTheMatchStatus CLOSED = new FanPlayerOfTheMatchStatus("CLOSED", 1);

    private static final /* synthetic */ FanPlayerOfTheMatchStatus[] $values() {
        return new FanPlayerOfTheMatchStatus[]{OPEN, CLOSED};
    }

    static {
        FanPlayerOfTheMatchStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new ec6(24));
    }

    private FanPlayerOfTheMatchStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.newNetwork.FanPlayerOfTheMatchStatus", values(), new String[]{"open", StatusKt.STATUS_FINISHED}, new Annotation[][]{null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static FanPlayerOfTheMatchStatus valueOf(String str) {
        return (FanPlayerOfTheMatchStatus) Enum.valueOf(FanPlayerOfTheMatchStatus.class, str);
    }

    public static FanPlayerOfTheMatchStatus[] values() {
        return (FanPlayerOfTheMatchStatus[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FanPlayerOfTheMatchStatus;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) FanPlayerOfTheMatchStatus.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
