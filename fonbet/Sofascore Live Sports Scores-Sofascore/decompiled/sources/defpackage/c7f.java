package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class c7f extends h13 {
    public final b7f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7f(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new b7f(kSerializer.getDescriptor());
    }

    @Override // defpackage.w2
    public final Object a() {
        return (a7f) g(j());
    }

    @Override // defpackage.w2
    public final int b(Object obj) {
        a7f a7fVar = (a7f) obj;
        a7fVar.getClass();
        return a7fVar.d();
    }

    @Override // defpackage.w2
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.w2, defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return e(decoder);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.w2
    public final Object h(Object obj) {
        a7f a7fVar = (a7f) obj;
        a7fVar.getClass();
        return a7fVar.a();
    }

    @Override // defpackage.h13
    public final void i(int i, Object obj, Object obj2) {
        ((a7f) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(wf3 wf3Var, Object obj, int i);

    @Override // defpackage.h13, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        int d = d(obj);
        b7f b7fVar = this.b;
        wf3 C = encoder.C(b7fVar);
        k(C, obj, d);
        C.c(b7fVar);
    }
}
