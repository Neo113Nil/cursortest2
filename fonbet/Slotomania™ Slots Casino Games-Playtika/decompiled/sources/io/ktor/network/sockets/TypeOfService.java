package io.ktor.network.sockets;

import com.google.common.base.Ascii;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TypeOfService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lio/ktor/network/sockets/TypeOfService;", "", "Lkotlin/UByte;", "value", "constructor-impl", "(B)B", "", "(I)B", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "B", "getValue-w2LRezQ", "()B", "getIntValue-impl", "(B)I", "intValue", k.M, "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes5.dex */
public final class TypeOfService {
    private final byte value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte UNDEFINED = m10999constructorimpl((byte) 0);
    private static final byte IPTOS_LOWCOST = m10999constructorimpl((byte) 2);
    private static final byte IPTOS_RELIABILITY = m10999constructorimpl((byte) 4);
    private static final byte IPTOS_THROUGHPUT = m10999constructorimpl((byte) 8);
    private static final byte IPTOS_LOWDELAY = m10999constructorimpl(Ascii.DLE);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TypeOfService m10998boximpl(byte b) {
        return new TypeOfService(b);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m10999constructorimpl(byte b) {
        return b;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11001equalsimpl(byte b, Object obj) {
        return (obj instanceof TypeOfService) && b == ((TypeOfService) obj).m11007unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11002equalsimpl0(byte b, byte b2) {
        return UByte.m11205equalsimpl0(b, b2);
    }

    /* renamed from: getIntValue-impl, reason: not valid java name */
    public static final int m11003getIntValueimpl(byte b) {
        return b & 255;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11004hashCodeimpl(byte b) {
        return UByte.m11210hashCodeimpl(b);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11005toStringimpl(byte b) {
        return "TypeOfService(value=" + ((Object) UByte.m11242toStringimpl(b)) + ')';
    }

    public boolean equals(Object other) {
        return m11001equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m11004hashCodeimpl(this.value);
    }

    public String toString() {
        return m11005toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m11007unboximpl() {
        return this.value;
    }

    private /* synthetic */ TypeOfService(byte b) {
        this.value = b;
    }

    /* renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m11000constructorimpl(int i) {
        return m10999constructorimpl(UByte.m11198constructorimpl((byte) i));
    }

    /* compiled from: TypeOfService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lio/ktor/network/sockets/TypeOfService$Companion;", "", "<init>", "()V", "Lio/ktor/network/sockets/TypeOfService;", "UNDEFINED", "B", "getUNDEFINED-zieKYfw", "()B", "IPTOS_LOWCOST", "getIPTOS_LOWCOST-zieKYfw", "IPTOS_RELIABILITY", "getIPTOS_RELIABILITY-zieKYfw", "IPTOS_THROUGHPUT", "getIPTOS_THROUGHPUT-zieKYfw", "IPTOS_LOWDELAY", "getIPTOS_LOWDELAY-zieKYfw", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getUNDEFINED-zieKYfw, reason: not valid java name */
        public final byte m11012getUNDEFINEDzieKYfw() {
            return TypeOfService.UNDEFINED;
        }

        /* renamed from: getIPTOS_LOWCOST-zieKYfw, reason: not valid java name */
        public final byte m11008getIPTOS_LOWCOSTzieKYfw() {
            return TypeOfService.IPTOS_LOWCOST;
        }

        /* renamed from: getIPTOS_RELIABILITY-zieKYfw, reason: not valid java name */
        public final byte m11010getIPTOS_RELIABILITYzieKYfw() {
            return TypeOfService.IPTOS_RELIABILITY;
        }

        /* renamed from: getIPTOS_THROUGHPUT-zieKYfw, reason: not valid java name */
        public final byte m11011getIPTOS_THROUGHPUTzieKYfw() {
            return TypeOfService.IPTOS_THROUGHPUT;
        }

        /* renamed from: getIPTOS_LOWDELAY-zieKYfw, reason: not valid java name */
        public final byte m11009getIPTOS_LOWDELAYzieKYfw() {
            return TypeOfService.IPTOS_LOWDELAY;
        }
    }
}
