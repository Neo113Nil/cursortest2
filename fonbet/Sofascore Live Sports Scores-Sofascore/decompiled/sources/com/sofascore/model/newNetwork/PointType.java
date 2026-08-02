package com.sofascore.model.newNetwork;

import defpackage.bxe;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = PointTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/sofascore/model/newNetwork/PointType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "Normal", "Break", "Set", "Match", "None", "MiniBreak", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PointType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ PointType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int type;
    public static final PointType Normal = new PointType("Normal", 0, 1);
    public static final PointType Break = new PointType("Break", 1, 2);
    public static final PointType Set = new PointType("Set", 2, 3);
    public static final PointType Match = new PointType("Match", 3, 4);
    public static final PointType None = new PointType("None", 4, 5);
    public static final PointType MiniBreak = new PointType("MiniBreak", 5, 6);

    private static final /* synthetic */ PointType[] $values() {
        return new PointType[]{Normal, Break, Set, Match, None, MiniBreak};
    }

    static {
        PointType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new bxe(15));
    }

    private PointType(String str, int i, int i2) {
        this.type = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PointTypeSerializer();
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static PointType valueOf(String str) {
        return (PointType) Enum.valueOf(PointType.class, str);
    }

    public static PointType[] values() {
        return (PointType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/newNetwork/PointType$Companion;", "", "<init>", "()V", "getFromType", "Lcom/sofascore/model/newNetwork/PointType;", "type", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) PointType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final PointType getFromType(int type) {
            Object obj;
            Iterator<E> it = PointType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PointType) obj).getType() == type) {
                    break;
                }
            }
            PointType pointType = (PointType) obj;
            return pointType == null ? PointType.None : pointType;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
