package di;

import Zh.InterfaceC1901b;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* renamed from: di.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4104n0 extends AbstractC4077a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1901b f45396a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1901b f45397b;

    public /* synthetic */ AbstractC4104n0(InterfaceC1901b interfaceC1901b, InterfaceC1901b interfaceC1901b2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1901b, interfaceC1901b2);
    }

    @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
    public abstract bi.f getDescriptor();

    public final InterfaceC1901b n() {
        return this.f45396a;
    }

    public final InterfaceC1901b o() {
        return this.f45397b;
    }

    @Override // di.AbstractC4077a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(ci.c decoder, Map builder, int i10, int i11) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        IntProgression step = RangesKt.step(RangesKt.until(0, i11 * 2), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            i(decoder, i10 + first, builder, false);
            if (first == last) {
                return;
            } else {
                first += step2;
            }
        }
    }

    @Override // di.AbstractC4077a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(ci.c decoder, int i10, Map builder, boolean z10) {
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object u10 = ci.c.u(decoder, getDescriptor(), i10, this.f45396a, null, 8, null);
        if (z10) {
            i11 = decoder.e(getDescriptor());
            if (i11 != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + i11).toString());
            }
        } else {
            i11 = i10 + 1;
        }
        int i12 = i11;
        builder.put(u10, (!builder.containsKey(u10) || (this.f45397b.getDescriptor().getKind() instanceof bi.e)) ? ci.c.u(decoder, getDescriptor(), i12, this.f45397b, null, 8, null) : decoder.i(getDescriptor(), i12, this.f45397b, MapsKt.getValue(builder, u10)));
    }

    @Override // Zh.p
    public void serialize(ci.f encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int f10 = f(obj);
        bi.f descriptor = getDescriptor();
        ci.d j10 = encoder.j(descriptor, f10);
        Iterator e10 = e(obj);
        int i10 = 0;
        while (e10.hasNext()) {
            Map.Entry entry = (Map.Entry) e10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            j10.B(getDescriptor(), i10, n(), key);
            i10 += 2;
            j10.B(getDescriptor(), i11, o(), value);
        }
        j10.b(descriptor);
    }

    public AbstractC4104n0(InterfaceC1901b interfaceC1901b, InterfaceC1901b interfaceC1901b2) {
        super(null);
        this.f45396a = interfaceC1901b;
        this.f45397b = interfaceC1901b2;
    }
}
