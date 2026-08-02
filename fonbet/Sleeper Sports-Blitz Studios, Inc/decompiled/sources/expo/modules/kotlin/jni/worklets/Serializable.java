package expo.modules.kotlin.jni.worklets;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.jni.HybridData;
import expo.modules.kotlin.jni.Destructible;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: Serializable.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0004J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/jni/worklets/Serializable;", "Lexpo/modules/kotlin/jni/Destructible;", "mHybridData", "Lcom/facebook/jni/HybridData;", "type", "", "<init>", "(Lcom/facebook/jni/HybridData;I)V", "Lexpo/modules/kotlin/jni/worklets/Serializable$ValueType;", "getType", "()Lexpo/modules/kotlin/jni/worklets/Serializable$ValueType;", "finalize", "", "getHybridDataForJNIDeallocator", "ValueType", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Serializable implements Destructible {
    private final HybridData mHybridData;
    private final ValueType type;

    private Serializable(HybridData hybridData, int i) {
        this.mHybridData = hybridData;
        for (ValueType valueType : ValueType.getEntries()) {
            if (valueType.getValue() == i) {
                this.type = valueType;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Serializable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/jni/worklets/Serializable$ValueType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undefined", "Null", "Boolean", "Number", "BigInt", "String", "Object", "Array", "Map", "Set", "Worklet", "RemoteFunction", "Handle", "HostObject", "HostFunction", "ArrayBuffer", "TurboModuleLike", "Import", "Synchronizable", TypedValues.Custom.NAME, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValueType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ValueType[] $VALUES;
        private final int value;
        public static final ValueType Undefined = new ValueType("Undefined", 0, 1);
        public static final ValueType Null = new ValueType("Null", 1, 2);
        public static final ValueType Boolean = new ValueType("Boolean", 2, 3);
        public static final ValueType Number = new ValueType("Number", 3, 4);
        public static final ValueType BigInt = new ValueType("BigInt", 4, 5);
        public static final ValueType String = new ValueType("String", 5, 6);
        public static final ValueType Object = new ValueType("Object", 6, 7);
        public static final ValueType Array = new ValueType("Array", 7, 8);
        public static final ValueType Map = new ValueType("Map", 8, 9);
        public static final ValueType Set = new ValueType("Set", 9, 10);
        public static final ValueType Worklet = new ValueType("Worklet", 10, 11);
        public static final ValueType RemoteFunction = new ValueType("RemoteFunction", 11, 12);
        public static final ValueType Handle = new ValueType("Handle", 12, 13);
        public static final ValueType HostObject = new ValueType("HostObject", 13, 14);
        public static final ValueType HostFunction = new ValueType("HostFunction", 14, 15);
        public static final ValueType ArrayBuffer = new ValueType("ArrayBuffer", 15, 16);
        public static final ValueType TurboModuleLike = new ValueType("TurboModuleLike", 16, 17);
        public static final ValueType Import = new ValueType("Import", 17, 18);
        public static final ValueType Synchronizable = new ValueType("Synchronizable", 18, 19);
        public static final ValueType Custom = new ValueType(TypedValues.Custom.NAME, 19, 20);

        private static final /* synthetic */ ValueType[] $values() {
            return new ValueType[]{Undefined, Null, Boolean, Number, BigInt, String, Object, Array, Map, Set, Worklet, RemoteFunction, Handle, HostObject, HostFunction, ArrayBuffer, TurboModuleLike, Import, Synchronizable, Custom};
        }

        public static EnumEntries<ValueType> getEntries() {
            return $ENTRIES;
        }

        private ValueType(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }

        static {
            ValueType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) $VALUES.clone();
        }
    }

    public final ValueType getType() {
        return this.type;
    }

    protected final void finalize() throws Throwable {
        this.mHybridData.resetNative();
    }

    @Override // expo.modules.kotlin.jni.Destructible
    /* renamed from: getHybridDataForJNIDeallocator, reason: from getter */
    public HybridData getMHybridData() {
        return this.mHybridData;
    }
}
