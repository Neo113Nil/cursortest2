package com.sofascore.model.database;

import com.ironsource.U3;
import com.unity3d.ads.BuildConfig;
import defpackage.gz8;
import defpackage.jp5;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/database/DisplayType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "DEFAULT", "CHRONOLOGICAL", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisplayType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ DisplayType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String type;
    public static final DisplayType DEFAULT = new DisplayType("DEFAULT", 0, BuildConfig.FLAVOR);
    public static final DisplayType CHRONOLOGICAL = new DisplayType("CHRONOLOGICAL", 1, "chronological");

    private static final /* synthetic */ DisplayType[] $values() {
        return new DisplayType[]{DEFAULT, CHRONOLOGICAL};
    }

    static {
        DisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private DisplayType(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static DisplayType valueOf(String str) {
        return (DisplayType) Enum.valueOf(DisplayType.class, str);
    }

    public static DisplayType[] values() {
        return (DisplayType[]) $VALUES.clone();
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sofascore/model/database/DisplayType$Companion;", "", "<init>", "()V", "getFromValue", "Lcom/sofascore/model/database/DisplayType;", U3.i.X, "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DisplayType getFromValue(@NotNull String value) {
            Object obj;
            value.getClass();
            Iterator<E> it = DisplayType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((DisplayType) obj).getType(), value)) {
                    break;
                }
            }
            DisplayType displayType = (DisplayType) obj;
            return displayType == null ? DisplayType.DEFAULT : displayType;
        }

        private Companion() {
        }
    }
}
