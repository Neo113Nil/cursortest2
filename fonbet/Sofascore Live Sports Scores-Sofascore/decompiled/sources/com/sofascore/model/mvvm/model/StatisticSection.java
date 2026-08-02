package com.sofascore.model.mvvm.model;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u001e¨\u0006!"}, d2 = {"Lcom/sofascore/model/mvvm/model/StatisticSection;", "Ljava/io/Serializable;", "", "name", "", "position", "", "isCardStart", "<init>", "(Ljava/lang/String;IZ)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;IZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StatisticSection;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "I", "getPosition", "()I", "Z", "()Z", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatisticSection implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isCardStart;

    @NotNull
    private final String name;
    private final int position;

    public /* synthetic */ StatisticSection(int i, String str, int i2, boolean z, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, StatisticSection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.position = i2;
        if ((i & 4) == 0) {
            this.isCardStart = true;
        } else {
            this.isCardStart = z;
        }
    }

    public static final /* synthetic */ void write$Self$model_release(StatisticSection self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.name);
        output.u(1, self.position, serialDesc);
        if (!output.o(serialDesc) && self.isCardStart) {
            return;
        }
        output.x(serialDesc, 2, self.isCardStart);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
    }

    /* renamed from: isCardStart, reason: from getter */
    public final boolean getIsCardStart() {
        return this.isCardStart;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StatisticSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StatisticSection;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StatisticSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StatisticSection(@NotNull String str, int i, boolean z) {
        str.getClass();
        this.name = str;
        this.position = i;
        this.isCardStart = z;
    }

    public /* synthetic */ StatisticSection(String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? true : z);
    }
}
