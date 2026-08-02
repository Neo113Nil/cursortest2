package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/mvvm/model/SportVariant;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "RugbyUnion", "RugbySevens", "RugbyBeachFives", "MotorsportAuto", "MotorsportMoto", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SportVariant {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ SportVariant[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int id;
    public static final SportVariant RugbyUnion = new SportVariant("RugbyUnion", 0, 1);
    public static final SportVariant RugbySevens = new SportVariant("RugbySevens", 1, 2);
    public static final SportVariant RugbyBeachFives = new SportVariant("RugbyBeachFives", 2, 3);
    public static final SportVariant MotorsportAuto = new SportVariant("MotorsportAuto", 3, 4);
    public static final SportVariant MotorsportMoto = new SportVariant("MotorsportMoto", 4, 5);

    private static final /* synthetic */ SportVariant[] $values() {
        return new SportVariant[]{RugbyUnion, RugbySevens, RugbyBeachFives, MotorsportAuto, MotorsportMoto};
    }

    static {
        SportVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private SportVariant(String str, int i, int i2) {
        this.id = i2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static SportVariant valueOf(String str) {
        return (SportVariant) Enum.valueOf(SportVariant.class, str);
    }

    public static SportVariant[] values() {
        return (SportVariant[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/sofascore/model/mvvm/model/SportVariant$Companion;", "", "<init>", "()V", "fromId", "Lcom/sofascore/model/mvvm/model/SportVariant;", "id", "", "(Ljava/lang/Integer;)Lcom/sofascore/model/mvvm/model/SportVariant;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SportVariant fromId(@Nullable Integer id) {
            Object obj;
            Iterator<E> it = SportVariant.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int id2 = ((SportVariant) obj).getId();
                if (id != null && id2 == id.intValue()) {
                    break;
                }
            }
            return (SportVariant) obj;
        }

        private Companion() {
        }
    }
}
