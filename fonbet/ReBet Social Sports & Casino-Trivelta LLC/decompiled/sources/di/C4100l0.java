package di;

import Zh.InterfaceC1901b;
import bi.C2425a;
import bi.n;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: di.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4100l0 extends AbstractC4080b0 {

    /* renamed from: c, reason: collision with root package name */
    public final bi.f f45385c;

    /* renamed from: di.l0$a */
    public static final class a implements Map.Entry, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        public final Object f45386a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f45387b;

        public a(Object obj, Object obj2) {
            this.f45386a = obj;
            this.f45387b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f45386a, aVar.f45386a) && Intrinsics.areEqual(this.f45387b, aVar.f45387b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f45386a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f45387b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f45386a;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f45387b;
            return hashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f45386a + ", value=" + this.f45387b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4100l0(final InterfaceC1901b keySerializer, final InterfaceC1901b valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f45385c = bi.l.g("kotlin.collections.Map.Entry", n.c.f25232a, new bi.f[0], new Function1() { // from class: di.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit h10;
                h10 = C4100l0.h(InterfaceC1901b.this, valueSerializer, (C2425a) obj);
                return h10;
            }
        });
    }

    public static final Unit h(InterfaceC1901b interfaceC1901b, InterfaceC1901b interfaceC1901b2, C2425a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        C2425a.b(buildSerialDescriptor, "key", interfaceC1901b.getDescriptor(), null, false, 12, null);
        C2425a.b(buildSerialDescriptor, EventKeys.VALUE_KEY, interfaceC1901b2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public bi.f getDescriptor() {
        return this.f45385c;
    }

    @Override // di.AbstractC4080b0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Object b(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // di.AbstractC4080b0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Object d(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @Override // di.AbstractC4080b0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map.Entry f(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
