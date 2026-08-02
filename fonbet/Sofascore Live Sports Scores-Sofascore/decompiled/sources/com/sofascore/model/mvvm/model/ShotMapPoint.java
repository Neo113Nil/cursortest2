package com.sofascore.model.mvvm.model;

import defpackage.a7a;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003'(&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B?\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006)"}, d2 = {"Lcom/sofascore/model/mvvm/model/ShotMapPoint;", "", "", "x", "y", "<init>", "(DD)V", "", "seen0", "type", "", "period", "Lt5h;", "serializationConstructorMarker", "(IDDLjava/lang/Integer;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/ShotMapPoint;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/ShotMapPoint$Type;", "getType", "()Lcom/sofascore/model/mvvm/model/ShotMapPoint$Type;", "getPeriod", "()Ljava/lang/String;", "D", "getX", "()D", "setX", "(D)V", "getY", "setY", "Ljava/lang/Integer;", "Ljava/lang/String;", "Companion", "Type", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShotMapPoint {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String period;

    @Nullable
    private final Integer type;
    private double x;
    private double y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/model/mvvm/model/ShotMapPoint$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SHOT_MADE", "SHOT_MISSED", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SHOT_MADE = new Type("SHOT_MADE", 0);
        public static final Type SHOT_MISSED = new Type("SHOT_MISSED", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SHOT_MADE, SHOT_MISSED};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private Type(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ShotMapPoint(int i, double d, double d2, Integer num, String str, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ShotMapPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.x = d;
        this.y = d2;
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i & 8) == 0) {
            this.period = "";
        } else {
            this.period = str;
        }
    }

    public static final /* synthetic */ void write$Self$model_release(ShotMapPoint self, wf3 output, SerialDescriptor serialDesc) {
        output.D(serialDesc, 0, self.x);
        output.D(serialDesc, 1, self.y);
        if (output.o(serialDesc) || self.type != null) {
            output.h(serialDesc, 2, a7a.a, self.type);
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.period, "")) {
            return;
        }
        output.y(serialDesc, 3, self.period);
    }

    @NotNull
    public final String getPeriod() {
        return this.period;
    }

    @NotNull
    public final Type getType() {
        Integer num = this.type;
        return (num != null && num.intValue() == 1) ? Type.SHOT_MADE : Type.SHOT_MISSED;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public final void setX(double d) {
        this.x = d;
    }

    public final void setY(double d) {
        this.y = d;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/ShotMapPoint$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/ShotMapPoint;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ShotMapPoint$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ShotMapPoint(double d, double d2) {
        this.x = d;
        this.y = d2;
        this.period = "";
    }
}
