package od;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f61173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f61174b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f61175c;

    /* renamed from: d, reason: collision with root package name */
    public final String f61176d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61177e;

    /* renamed from: f, reason: collision with root package name */
    public final long f61178f;

    /* renamed from: g, reason: collision with root package name */
    public final long f61179g;

    /* renamed from: h, reason: collision with root package name */
    public final Se.a f61180h;

    public w(String str, String str2, Boolean bool, String str3, boolean z10, long j10, long j11, Se.a aVar) {
        this.f61173a = str;
        this.f61174b = str2;
        this.f61175c = bool;
        this.f61176d = str3;
        this.f61177e = z10;
        this.f61178f = j10;
        this.f61179g = j11;
        this.f61180h = aVar;
    }

    public static /* synthetic */ w b(w wVar, String str, String str2, Boolean bool, String str3, boolean z10, long j10, long j11, Se.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = wVar.f61173a;
        }
        if ((i10 & 2) != 0) {
            str2 = wVar.f61174b;
        }
        if ((i10 & 4) != 0) {
            bool = wVar.f61175c;
        }
        if ((i10 & 8) != 0) {
            str3 = wVar.f61176d;
        }
        if ((i10 & 16) != 0) {
            z10 = wVar.f61177e;
        }
        if ((i10 & 32) != 0) {
            j10 = wVar.f61178f;
        }
        if ((i10 & 64) != 0) {
            j11 = wVar.f61179g;
        }
        if ((i10 & 128) != 0) {
            aVar = wVar.f61180h;
        }
        Se.a aVar2 = aVar;
        long j12 = j11;
        long j13 = j10;
        boolean z11 = z10;
        Boolean bool2 = bool;
        return wVar.a(str, str2, bool2, str3, z11, j13, j12, aVar2);
    }

    public final w a(String str, String str2, Boolean bool, String str3, boolean z10, long j10, long j11, Se.a aVar) {
        return new w(str, str2, bool, str3, z10, j10, j11, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f61173a, wVar.f61173a) && Intrinsics.areEqual(this.f61174b, wVar.f61174b) && Intrinsics.areEqual(this.f61175c, wVar.f61175c) && Intrinsics.areEqual(this.f61176d, wVar.f61176d) && this.f61177e == wVar.f61177e && this.f61178f == wVar.f61178f && this.f61179g == wVar.f61179g && this.f61180h == wVar.f61180h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f61173a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61174b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f61175c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f61176d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z10 = this.f61177e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode5 = (((((hashCode4 + i10) * 31) + Long.hashCode(this.f61178f)) * 31) + Long.hashCode(this.f61179g)) * 31;
        Se.a aVar = this.f61180h;
        return hashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "SIQDepartment(id=" + this.f61173a + ", name=" + this.f61174b + ", available=" + this.f61175c + ", displayName=" + this.f61176d + ", isEngaged=" + this.f61177e + ", queueSize=" + this.f61178f + ", currentQueueSize=" + this.f61179g + ", communicationMode=" + this.f61180h + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ w(java.lang.String r14, java.lang.String r15, java.lang.Boolean r16, java.lang.String r17, boolean r18, long r19, long r21, Se.a r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto La
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5 = r1
            goto Lc
        La:
            r5 = r16
        Lc:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L13
            r6 = r2
            goto L15
        L13:
            r6 = r17
        L15:
            r1 = r0 & 16
            if (r1 == 0) goto L1c
            r1 = 0
            r7 = r1
            goto L1e
        L1c:
            r7 = r18
        L1e:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L26
            r8 = r3
            goto L28
        L26:
            r8 = r19
        L28:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r10 = r3
            goto L30
        L2e:
            r10 = r21
        L30:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L39
            r12 = r2
            r3 = r14
            r4 = r15
            r2 = r13
            goto L3e
        L39:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
        L3e:
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: od.w.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, boolean, long, long, Se.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, Se.a communicationMode) {
        this(str, str2, null, null, false, 0L, 0L, communicationMode);
        Intrinsics.checkNotNullParameter(communicationMode, "communicationMode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(String str, Se.a communicationMode) {
        this(null, str, null, null, false, 0L, 0L, communicationMode);
        Intrinsics.checkNotNullParameter(communicationMode, "communicationMode");
    }
}
