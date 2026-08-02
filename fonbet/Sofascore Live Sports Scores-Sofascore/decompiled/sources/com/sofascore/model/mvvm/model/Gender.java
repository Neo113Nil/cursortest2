package com.sofascore.model.mvvm.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = GenderSerializer.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/mvvm/model/Gender;", "Ljava/io/Serializable;", "", U3.i.X, "", "backendRequestValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getBackendRequestValue", "Male", "Female", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Gender implements Serializable {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String backendRequestValue;

    @NotNull
    private final String value;

    @q5h(PlayerKt.FOOTBALL_MIDFIELDER)
    public static final Gender Male = new Gender("Male", 0, PlayerKt.FOOTBALL_MIDFIELDER, InneractiveMediationDefs.GENDER_MALE);

    @q5h("F")
    public static final Gender Female = new Gender("Female", 1, "F", InneractiveMediationDefs.GENDER_FEMALE);

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{Male, Female};
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private Gender(String str, int i, String str2, String str3) {
        this.value = str2;
        this.backendRequestValue = str3;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }

    @NotNull
    public final String getBackendRequestValue() {
        return this.backendRequestValue;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/mvvm/model/Gender$Companion;", "", "<init>", "()V", "getFromValue", "Lcom/sofascore/model/mvvm/model/Gender;", U3.i.X, "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Gender getFromValue(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it = Gender.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((Gender) obj).getValue(), value)) {
                    break;
                }
            }
            Gender gender = (Gender) obj;
            return gender == null ? Gender.Male : gender;
        }

        @NotNull
        public final KSerializer serializer() {
            return GenderSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
