package com.braze.enums;

import X9.m;
import com.braze.enums.Gender;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lcom/braze/enums/Gender;", "Lcom/braze/models/IPutIntoJson;", "", "", EventKeys.VALUE_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MALE", "FEMALE", "OTHER", "UNKNOWN", "NOT_APPLICABLE", "PREFER_NOT_TO_SAY", "forJsonPut", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Gender implements IPutIntoJson<String> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;
    public static final Gender MALE = new Gender("MALE", 0, m.f13664a);
    public static final Gender FEMALE = new Gender("FEMALE", 1, "f");
    public static final Gender OTHER = new Gender("OTHER", 2, "o");
    public static final Gender UNKNOWN = new Gender("UNKNOWN", 3, "u");
    public static final Gender NOT_APPLICABLE = new Gender("NOT_APPLICABLE", 4, "n");
    public static final Gender PREFER_NOT_TO_SAY = new Gender("PREFER_NOT_TO_SAY", 5, "p");

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/enums/Gender$Companion;", "", "<init>", "()V", "getGender", "Lcom/braze/enums/Gender;", EventKeys.VALUE_KEY, "", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGender$lambda$1(String str) {
            return "No gender with value " + str + ".";
        }

        @JvmStatic
        public final Gender getGender(final String value) {
            String str;
            Object obj = null;
            if (value != null) {
                str = value.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            Iterator<E> it = Gender.getEntries().iterator();
            boolean z10 = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (Intrinsics.areEqual(((Gender) next).getValue(), str)) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        obj2 = next;
                    }
                } else if (z10) {
                    obj = obj2;
                }
            }
            Gender gender = (Gender) obj;
            if (gender == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: K3.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String gender$lambda$1;
                        gender$lambda$1 = Gender.Companion.getGender$lambda$1(value);
                        return gender$lambda$1;
                    }
                }, 6, (Object) null);
            }
            return gender;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{MALE, FEMALE, OTHER, UNKNOWN, NOT_APPLICABLE, PREFER_NOT_TO_SAY};
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Gender(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries<Gender> getEntries() {
        return $ENTRIES;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method and from getter */
    public String getValue() {
        return this.value;
    }
}
