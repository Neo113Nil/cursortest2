package j9;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f53830c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f53831a;

    /* renamed from: b, reason: collision with root package name */
    public final b f53832b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f53833a = 0;

        /* renamed from: b, reason: collision with root package name */
        public b f53834b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f53833a, this.f53834b);
        }

        public a b(long j10) {
            this.f53833a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f53834b = bVar;
            return this;
        }
    }

    public enum b implements com.google.firebase.encoders.proto.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        public final int f53842a;

        b(int i10) {
            this.f53842a = i10;
        }

        @Override // com.google.firebase.encoders.proto.c
        public int getNumber() {
            return this.f53842a;
        }
    }

    public c(long j10, b bVar) {
        this.f53831a = j10;
        this.f53832b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f53831a;
    }

    public b b() {
        return this.f53832b;
    }
}
