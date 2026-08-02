package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.margelo.nitro.core.ArrayBuffer;
import io.sentry.metrics.MetricsUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Variant_ArrayBuffer_String.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ?\u0010\f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\r0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\u0015\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String;", "", "<init>", "()V", "isFirst", "", "()Z", "isSecond", "asFirstOrNull", "Lcom/margelo/nitro/core/ArrayBuffer;", "asSecondOrNull", "", "match", "R", "first", "Lkotlin/Function1;", MetricsUnit.Duration.SECOND, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "First", "Second", "Companion", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String$First;", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String$Second;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Variant_ArrayBuffer_String {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ Variant_ArrayBuffer_String(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final Variant_ArrayBuffer_String create(ArrayBuffer arrayBuffer) {
        return INSTANCE.create(arrayBuffer);
    }

    @JvmStatic
    public static final Variant_ArrayBuffer_String create(String str) {
        return INSTANCE.create(str);
    }

    private Variant_ArrayBuffer_String() {
    }

    /* compiled from: Variant_ArrayBuffer_String.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String$First;", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String;", "value", "Lcom/margelo/nitro/core/ArrayBuffer;", "<init>", "(Lcom/margelo/nitro/core/ArrayBuffer;)V", "getValue", "()Lcom/margelo/nitro/core/ArrayBuffer;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class First extends Variant_ArrayBuffer_String {
        private final ArrayBuffer value;

        public static /* synthetic */ First copy$default(First first, ArrayBuffer arrayBuffer, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayBuffer = first.value;
            }
            return first.copy(arrayBuffer);
        }

        /* renamed from: component1, reason: from getter */
        public final ArrayBuffer getValue() {
            return this.value;
        }

        public final First copy(ArrayBuffer value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new First(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof First) && Intrinsics.areEqual(this.value, ((First) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "First(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public First(ArrayBuffer value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final ArrayBuffer getValue() {
            return this.value;
        }
    }

    /* compiled from: Variant_ArrayBuffer_String.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String$Second;", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Second extends Variant_ArrayBuffer_String {
        private final String value;

        public static /* synthetic */ Second copy$default(Second second, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = second.value;
            }
            return second.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Second copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Second(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Second) && Intrinsics.areEqual(this.value, ((Second) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Second(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Second(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public final boolean isFirst() {
        return this instanceof First;
    }

    public final boolean isSecond() {
        return this instanceof Second;
    }

    public final ArrayBuffer asFirstOrNull() {
        ArrayBuffer value;
        First first = this instanceof First ? (First) this : null;
        if (first == null || (value = first.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final String asSecondOrNull() {
        String value;
        Second second = this instanceof Second ? (Second) this : null;
        if (second == null || (value = second.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final <R> R match(Function1<? super ArrayBuffer, ? extends R> first, Function1<? super String, ? extends R> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (this instanceof First) {
            return first.invoke(((First) this).getValue());
        }
        if (this instanceof Second) {
            return second.invoke(((Second) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: Variant_ArrayBuffer_String.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String$Companion;", "", "<init>", "()V", "create", "Lcom/margelo/nitro/nitrofetch/Variant_ArrayBuffer_String;", "value", "Lcom/margelo/nitro/core/ArrayBuffer;", "", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Variant_ArrayBuffer_String create(ArrayBuffer value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new First(value);
        }

        @JvmStatic
        public final Variant_ArrayBuffer_String create(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Second(value);
        }
    }
}
