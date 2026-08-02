package H;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class f implements Iterable, KMappedMarker {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4274d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final f f4275e = new f(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f4276a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4277b;

    @Nullable
    private final int[] belowBound;

    /* renamed from: c, reason: collision with root package name */
    public final int f4278c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.f4275e;
        }

        public a() {
        }
    }

    public static final class b extends RestrictedSuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f4279n;

        /* renamed from: o, reason: collision with root package name */
        public int f4280o;

        /* renamed from: p, reason: collision with root package name */
        public int f4281p;

        /* renamed from: q, reason: collision with root package name */
        public int f4282q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f4283r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f4283r = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
        
            if (r13.yield(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
        
            if (r15.yield(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d2 -> B:8:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00f0 -> B:7:0x00f1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009b -> B:22:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b4 -> B:22:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0079 -> B:33:0x007d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            SequenceScope sequenceScope2;
            int length;
            int[] iArr;
            int i10;
            long j10;
            SequenceScope sequenceScope3;
            int i11;
            SequenceScope sequenceScope4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f4282q;
            int i13 = 0;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f4283r;
                int[] iArr2 = f.this.belowBound;
                if (iArr2 != null) {
                    sequenceScope2 = sequenceScope;
                    length = iArr2.length;
                    iArr = iArr2;
                    i10 = 0;
                    if (i10 < length) {
                    }
                }
                j10 = 1;
                if (f.this.f4277b != 0) {
                }
                if (f.this.f4276a != 0) {
                }
                return Unit.INSTANCE;
            }
            if (i12 == 1) {
                length = this.f4281p;
                i10 = this.f4280o;
                iArr = (int[]) this.f4279n;
                sequenceScope2 = (SequenceScope) this.f4283r;
                ResultKt.throwOnFailure(obj);
                i10++;
                if (i10 < length) {
                    sequenceScope = sequenceScope2;
                    j10 = 1;
                    if (f.this.f4277b != 0) {
                        sequenceScope3 = sequenceScope;
                        i11 = 0;
                        if (i11 >= 64) {
                        }
                    }
                    if (f.this.f4276a != 0) {
                    }
                    return Unit.INSTANCE;
                }
                Integer boxInt = Boxing.boxInt(iArr[i10]);
                this.f4283r = sequenceScope2;
                this.f4279n = iArr;
                this.f4280o = i10;
                this.f4281p = length;
                this.f4282q = 1;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = this.f4280o;
                    sequenceScope4 = (SequenceScope) this.f4283r;
                    ResultKt.throwOnFailure(obj);
                    j10 = 1;
                    i13 = i14;
                    i13++;
                    if (i13 < 64) {
                        if ((f.this.f4276a & (j10 << i13)) != 0) {
                            Integer boxInt2 = Boxing.boxInt(i13 + 64 + f.this.f4278c);
                            this.f4283r = sequenceScope4;
                            this.f4279n = null;
                            this.f4280o = i13;
                            this.f4282q = 3;
                            if (sequenceScope4.yield(boxInt2, this) != coroutine_suspended) {
                                i14 = i13;
                                i13 = i14;
                            }
                            return coroutine_suspended;
                        }
                        i13++;
                        if (i13 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                i11 = this.f4280o;
                sequenceScope3 = (SequenceScope) this.f4283r;
                ResultKt.throwOnFailure(obj);
                j10 = 1;
                i11++;
                if (i11 >= 64) {
                    sequenceScope = sequenceScope3;
                    if (f.this.f4276a != 0) {
                        sequenceScope4 = sequenceScope;
                        if (i13 < 64) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if ((f.this.f4277b & (j10 << i11)) != 0) {
                    Integer boxInt3 = Boxing.boxInt(f.this.f4278c + i11);
                    this.f4283r = sequenceScope3;
                    this.f4279n = null;
                    this.f4280o = i11;
                    this.f4282q = 2;
                }
                i11++;
                if (i11 >= 64) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((b) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public f(long j10, long j11, int i10, int[] iArr) {
        this.f4276a = j10;
        this.f4277b = j11;
        this.f4278c = i10;
        this.belowBound = iArr;
    }

    public final boolean g(int i10) {
        int[] iArr;
        int i11 = i10 - this.f4278c;
        return (i11 < 0 || i11 >= 64) ? (i11 < 64 || i11 >= 128) ? i11 <= 0 && (iArr = this.belowBound) != null && g.a(iArr, i10) >= 0 : ((1 << (i11 - 64)) & this.f4276a) != 0 : ((1 << i11) & this.f4277b) != 0;
    }

    public final int h(int i10) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.f4277b;
        if (j10 != 0) {
            return this.f4278c + Long.numberOfTrailingZeros(j10);
        }
        long j11 = this.f4276a;
        return j11 != 0 ? this.f4278c + 64 + Long.numberOfTrailingZeros(j11) : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f i(int i10) {
        int i11;
        int[] iArr;
        long j10;
        long j11;
        int i12;
        int i13 = this.f4278c;
        int i14 = i10 - i13;
        long j12 = 1;
        long j13 = 0;
        if (i14 >= 0 && i14 < 64) {
            long j14 = 1 << i14;
            long j15 = this.f4277b;
            if ((j15 & j14) == 0) {
                return new f(this.f4276a, j15 | j14, i13, this.belowBound);
            }
        } else if (i14 >= 64 && i14 < 128) {
            long j16 = 1 << (i14 - 64);
            long j17 = this.f4276a;
            if ((j17 & j16) == 0) {
                return new f(j17 | j16, this.f4277b, i13, this.belowBound);
            }
        } else if (i14 < 128) {
            int[] iArr2 = this.belowBound;
            if (iArr2 == null) {
                return new f(this.f4276a, this.f4277b, i13, new int[]{i10});
            }
            int a10 = g.a(iArr2, i10);
            if (a10 < 0) {
                int i15 = -(a10 + 1);
                int length = iArr2.length;
                int[] iArr3 = new int[length + 1];
                ArraysKt.copyInto(iArr2, iArr3, 0, 0, i15);
                ArraysKt.copyInto(iArr2, iArr3, i15 + 1, i15, length);
                iArr3[i15] = i10;
                return new f(this.f4276a, this.f4277b, this.f4278c, iArr3);
            }
        } else if (!g(i10)) {
            long j18 = this.f4276a;
            long j19 = this.f4277b;
            int i16 = this.f4278c;
            int i17 = ((i10 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j20 = j19;
            long j21 = j18;
            while (true) {
                if (i16 >= i17) {
                    i11 = i16;
                    break;
                }
                if (j20 != j13) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.belowBound;
                        if (iArr4 != null) {
                            j10 = j12;
                            int length2 = iArr4.length;
                            int i18 = 0;
                            while (i18 < length2) {
                                arrayList.add(Integer.valueOf(iArr4[i18]));
                                i18++;
                                j13 = j13;
                            }
                            j11 = j13;
                            for (i12 = 0; i12 < 64; i12++) {
                                if (((j10 << i12) & j20) != j11) {
                                    arrayList.add(Integer.valueOf(i12 + i16));
                                }
                            }
                        }
                    }
                    j10 = j12;
                    j11 = j13;
                    while (i12 < 64) {
                    }
                } else {
                    j10 = j12;
                    j11 = j13;
                }
                if (j21 == j11) {
                    i11 = i17;
                    j20 = j11;
                    break;
                }
                i16 += 64;
                j20 = j21;
                j12 = j10;
                j13 = j11;
                j21 = j13;
            }
            if (arrayList == null || (iArr = CollectionsKt.toIntArray(arrayList)) == null) {
                iArr = this.belowBound;
            }
            return new f(j21, j20, i11, iArr).i(i10);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return SequencesKt.sequence(new b(null)).iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb2.append(H.b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}
