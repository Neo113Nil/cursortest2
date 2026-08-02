package Fh;

/* loaded from: classes3.dex */
public abstract class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3680a = c(h.RECORD_AND_SAMPLE);

    /* renamed from: b, reason: collision with root package name */
    public static final i f3681b = c(h.DROP);

    /* renamed from: c, reason: collision with root package name */
    public static final i f3682c = c(h.RECORD_ONLY);

    public static i c(h hVar) {
        return new c(hVar, oh.g.empty());
    }

    @Override // Fh.i
    public abstract h b();

    @Override // Fh.i
    public abstract oh.g getAttributes();
}
