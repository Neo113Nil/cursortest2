package b2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f24948a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24949b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24950c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24951d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24952e;
    public final long[] editListDurations;
    public final long[] editListMediaTimes;

    /* renamed from: f, reason: collision with root package name */
    public final long f24953f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.media3.common.a f24954g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24955h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24956i;
    private final u[] sampleDescriptionEncryptionBoxes;

    public t(int i10, int i11, long j10, long j11, long j12, long j13, androidx.media3.common.a aVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f24948a = i10;
        this.f24949b = i11;
        this.f24950c = j10;
        this.f24951d = j11;
        this.f24952e = j12;
        this.f24953f = j13;
        this.f24954g = aVar;
        this.f24955h = i12;
        this.sampleDescriptionEncryptionBoxes = uVarArr;
        this.f24956i = i13;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public t a(androidx.media3.common.a aVar) {
        return new t(this.f24948a, this.f24949b, this.f24950c, this.f24951d, this.f24952e, this.f24953f, aVar, this.f24955h, this.sampleDescriptionEncryptionBoxes, this.f24956i, this.editListDurations, this.editListMediaTimes);
    }

    public u b(int i10) {
        u[] uVarArr = this.sampleDescriptionEncryptionBoxes;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }
}
