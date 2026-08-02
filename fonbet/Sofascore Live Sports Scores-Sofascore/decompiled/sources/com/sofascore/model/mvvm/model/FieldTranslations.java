package com.sofascore.model.mvvm.model;

import defpackage.go7;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B3\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J@\u0010\u0019\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0017R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010\u0017¨\u0006)"}, d2 = {"Lcom/sofascore/model/mvvm/model/FieldTranslations;", "Ljava/io/Serializable;", "", "", "nameTranslation", "shortNameTranslation", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/FieldTranslations;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/sofascore/model/mvvm/model/FieldTranslations;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getNameTranslation", "getShortNameTranslation", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FieldTranslations implements Serializable {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Map<String, String> nameTranslation;

    @Nullable
    private final Map<String, String> shortNameTranslation;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new go7(23)), ypa.a(ysaVar, new go7(24))};
    }

    public /* synthetic */ FieldTranslations(int i, Map map, Map map2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FieldTranslations$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.nameTranslation = map;
        this.shortNameTranslation = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, uhiVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        uhi uhiVar = uhi.a;
        return new q79(uhiVar, uhiVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FieldTranslations copy$default(FieldTranslations fieldTranslations, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fieldTranslations.nameTranslation;
        }
        if ((i & 2) != 0) {
            map2 = fieldTranslations.shortNameTranslation;
        }
        return fieldTranslations.copy(map, map2);
    }

    public static final /* synthetic */ void write$Self$model_release(FieldTranslations self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.nameTranslation);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.shortNameTranslation);
    }

    @Nullable
    public final Map<String, String> component1() {
        return this.nameTranslation;
    }

    @Nullable
    public final Map<String, String> component2() {
        return this.shortNameTranslation;
    }

    @NotNull
    public final FieldTranslations copy(@Nullable Map<String, String> nameTranslation, @Nullable Map<String, String> shortNameTranslation) {
        return new FieldTranslations(nameTranslation, shortNameTranslation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldTranslations)) {
            return false;
        }
        FieldTranslations fieldTranslations = (FieldTranslations) other;
        return Intrinsics.c(this.nameTranslation, fieldTranslations.nameTranslation) && Intrinsics.c(this.shortNameTranslation, fieldTranslations.shortNameTranslation);
    }

    @Nullable
    public final Map<String, String> getNameTranslation() {
        return this.nameTranslation;
    }

    @Nullable
    public final Map<String, String> getShortNameTranslation() {
        return this.shortNameTranslation;
    }

    public int hashCode() {
        Map<String, String> map = this.nameTranslation;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.shortNameTranslation;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FieldTranslations(nameTranslation=" + this.nameTranslation + ", shortNameTranslation=" + this.shortNameTranslation + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/FieldTranslations$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/FieldTranslations;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FieldTranslations$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FieldTranslations(@Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        this.nameTranslation = map;
        this.shortNameTranslation = map2;
    }
}
