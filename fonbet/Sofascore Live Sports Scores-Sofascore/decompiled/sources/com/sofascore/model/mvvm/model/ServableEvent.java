package com.sofascore.model.mvvm.model;

import defpackage.a0f;
import defpackage.a70;
import defpackage.dtg;
import defpackage.duf;
import defpackage.joa;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/sofascore/model/mvvm/model/ServableEvent;", "Lcom/sofascore/model/mvvm/model/Event;", "<init>", "()V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/sofascore/model/mvvm/model/ServableEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "firstToServe", "assignFirstToServe", "(Ljava/lang/Integer;)V", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getFirstToServe", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setFirstToServe", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ServableEvent extends Event {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa $cachedSerializer$delegate = ypa.a(ysa.b, new dtg(27));

    public ServableEvent() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        return new a0f(duf.a.getOrCreateKotlinClass(ServableEvent.class), new Annotation[0]);
    }

    public static /* synthetic */ Integer getFirstToServe$default(ServableEvent servableEvent, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getFirstToServe");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return servableEvent.getFirstToServe(teamSides);
    }

    public final void assignFirstToServe(@Nullable Integer firstToServe) {
        setFirstToServe(firstToServe);
    }

    @Nullable
    public abstract Integer getFirstToServe();

    @Nullable
    public final Integer getFirstToServe(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer firstToServe = getFirstToServe();
        if (firstToServe != null && firstToServe.intValue() == 0) {
            return 0;
        }
        if (firstToServe != null && firstToServe.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (firstToServe == null || firstToServe.intValue() != 2) {
            return getFirstToServe();
        }
        num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public abstract void setFirstToServe(@Nullable Integer num);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/ServableEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ServableEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ServableEvent.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ServableEvent(int i, t5h t5hVar) {
        super(null);
    }

    public static final /* synthetic */ void write$Self(ServableEvent self, wf3 output, SerialDescriptor serialDesc) {
    }
}
