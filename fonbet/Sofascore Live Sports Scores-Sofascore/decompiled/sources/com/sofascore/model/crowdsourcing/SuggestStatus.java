package com.sofascore.model.crowdsourcing;

import defpackage.egi;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUBMITTED", "PENDING", "APPROVED", "IGNORED", "DECLINED", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SuggestStatus {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ SuggestStatus[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SuggestStatus SUBMITTED = new SuggestStatus("SUBMITTED", 0);

    @q5h("pending")
    public static final SuggestStatus PENDING = new SuggestStatus("PENDING", 1);

    @q5h("approved")
    public static final SuggestStatus APPROVED = new SuggestStatus("APPROVED", 2);

    @q5h("ignored")
    public static final SuggestStatus IGNORED = new SuggestStatus("IGNORED", 3);

    @q5h("declined")
    public static final SuggestStatus DECLINED = new SuggestStatus("DECLINED", 4);

    private static final /* synthetic */ SuggestStatus[] $values() {
        return new SuggestStatus[]{SUBMITTED, PENDING, APPROVED, IGNORED, DECLINED};
    }

    static {
        SuggestStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new egi(6));
    }

    private SuggestStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return hz8.F("com.sofascore.model.crowdsourcing.SuggestStatus", values(), new String[]{null, "pending", "approved", "ignored", "declined"}, new Annotation[][]{null, null, null, null, null});
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static SuggestStatus valueOf(String str) {
        return (SuggestStatus) Enum.valueOf(SuggestStatus.class, str);
    }

    public static SuggestStatus[] values() {
        return (SuggestStatus[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/crowdsourcing/SuggestStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/crowdsourcing/SuggestStatus;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SuggestStatus.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
