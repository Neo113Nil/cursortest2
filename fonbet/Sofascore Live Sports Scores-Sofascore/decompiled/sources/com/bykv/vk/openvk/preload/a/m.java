package com.bykv.vk.openvk.preload.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class m<IN> implements b<IN> {
    private b<IN> a;

    public m(b<IN> bVar) {
        this.a = bVar;
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final <I> I a(Class<? extends d<I, ?>> cls) {
        return (I) this.a.a((Class) cls);
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final <O> O b(Class<? extends d<?, O>> cls) {
        return (O) this.a.b(cls);
    }

    @Override // com.bykv.vk.openvk.preload.a.b
    public final Object a(IN in) throws Exception {
        throw new UnsupportedOperationException();
    }
}
