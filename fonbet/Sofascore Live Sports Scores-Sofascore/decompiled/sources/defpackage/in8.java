package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class in8 implements b0h {
    public final b0h a;

    public in8(b0h b0hVar) {
        this.a = b0hVar;
    }

    @Override // defpackage.b0h
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.b0h
    public long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // defpackage.b0h
    public zzg getSeekPoints(long j) {
        return this.a.getSeekPoints(j);
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }
}
