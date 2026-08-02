package nh;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public enum d {
    TEXT(false, 1),
    BINARY(false, 2),
    CLOSE(true, 8),
    PING(true, 9),
    PONG(true, 10);


    @NotNull
    private static final d[] byOpcodeArray;

    /* renamed from: c, reason: collision with root package name */
    public static final a f58555c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f58556d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58562a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58563b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    static {
        d dVar;
        d[] values = values();
        if (values.length == 0) {
            dVar = null;
        } else {
            dVar = values[0];
            int lastIndex = ArraysKt.getLastIndex(values);
            if (lastIndex != 0) {
                int i10 = dVar.f58563b;
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    d dVar2 = values[it.nextInt()];
                    int i11 = dVar2.f58563b;
                    if (i10 < i11) {
                        dVar = dVar2;
                        i10 = i11;
                    }
                }
            }
        }
        Intrinsics.checkNotNull(dVar);
        int i12 = dVar.f58563b;
        f58556d = i12;
        int i13 = i12 + 1;
        d[] dVarArr = new d[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            d[] values2 = values();
            int length = values2.length;
            d dVar3 = null;
            int i15 = 0;
            boolean z10 = false;
            while (true) {
                if (i15 < length) {
                    d dVar4 = values2[i15];
                    if (dVar4.f58563b == i14) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        dVar3 = dVar4;
                    }
                    i15++;
                } else if (z10) {
                }
            }
            dVarArr[i14] = dVar3;
        }
        byOpcodeArray = dVarArr;
    }

    d(boolean z10, int i10) {
        this.f58562a = z10;
        this.f58563b = i10;
    }
}
