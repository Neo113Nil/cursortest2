package com.sofascore.model.mvvm.model;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = UserSegmentationTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/mvvm/model/UserSegmentationType;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "Default", "Bettor", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserSegmentationType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ UserSegmentationType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int id;
    public static final UserSegmentationType Default = new UserSegmentationType("Default", 0, -1);

    @q5h("1")
    public static final UserSegmentationType Bettor = new UserSegmentationType("Bettor", 1, 1);

    private static final /* synthetic */ UserSegmentationType[] $values() {
        return new UserSegmentationType[]{Default, Bettor};
    }

    static {
        UserSegmentationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private UserSegmentationType(String str, int i, int i2) {
        this.id = i2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static UserSegmentationType valueOf(String str) {
        return (UserSegmentationType) Enum.valueOf(UserSegmentationType.class, str);
    }

    public static UserSegmentationType[] values() {
        return (UserSegmentationType[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/mvvm/model/UserSegmentationType$Companion;", "", "<init>", "()V", "getById", "Lcom/sofascore/model/mvvm/model/UserSegmentationType;", "id", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserSegmentationType getById(int id) {
            Object obj;
            Iterator<E> it = UserSegmentationType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((UserSegmentationType) obj).getId() == id) {
                    break;
                }
            }
            UserSegmentationType userSegmentationType = (UserSegmentationType) obj;
            return userSegmentationType == null ? UserSegmentationType.Default : userSegmentationType;
        }

        @NotNull
        public final KSerializer serializer() {
            return UserSegmentationTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
