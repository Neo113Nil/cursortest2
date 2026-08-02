package okhttp3.internal.publicsuffix;

import bg.d;
import bg.q;
import d9.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import okio.ByteString;
import th.a;
import th.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "th/c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: b, reason: collision with root package name */
    public static final ByteString f21365b = ByteString.INSTANCE.of(42);

    /* renamed from: c, reason: collision with root package name */
    public static final List f21366c = t.c("*");

    /* renamed from: d, reason: collision with root package name */
    public static final PublicSuffixDatabase f21367d;

    /* renamed from: a, reason: collision with root package name */
    public final a f21368a;

    static {
        Intrinsics.checkNotNullParameter(c.f23973a, "<this>");
        f21367d = new PublicSuffixDatabase(new a());
    }

    public PublicSuffixDatabase(a publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.f21368a = publicSuffixList;
    }

    public static List b(String str) {
        List R = StringsKt.R(str, new char[]{'.'});
        return Intrinsics.areEqual(CollectionsKt.K(R), "") ? CollectionsKt.C(R) : R;
    }

    public final String a(String domain) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.checkNotNull(unicode);
        List b10 = b(unicode);
        a aVar = this.f21368a;
        AtomicBoolean atomicBoolean = aVar.f23968a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                aVar.f23969b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z5 = false;
            while (true) {
                try {
                    try {
                        try {
                            aVar.b();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z5 = true;
                        }
                    } catch (IOException e7) {
                        aVar.f23972e = e7;
                        if (z5) {
                        }
                    }
                } finally {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (aVar.f23970c == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) aVar.f23967f) + " resource.");
            illegalStateException.initCause(aVar.f23972e);
            throw illegalStateException;
        }
        int size3 = b10.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i5 = 0; i5 < size3; i5++) {
            byteStringArr[i5] = ByteString.INSTANCE.encodeUtf8((String) b10.get(i5));
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                str = null;
                break;
            }
            ByteString byteString = aVar.f23970c;
            if (byteString == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bytes");
                byteString = null;
            }
            str = c.a(byteString, byteStringArr, i10);
            if (str != null) {
                break;
            }
            i10++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i11 = 0; i11 < length; i11++) {
                byteStringArr2[i11] = f21365b;
                ByteString byteString2 = aVar.f23970c;
                if (byteString2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bytes");
                    byteString2 = null;
                }
                str2 = c.a(byteString2, byteStringArr2, i11);
                if (str2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        if (str2 != null) {
            int i12 = size3 - 1;
            for (int i13 = 0; i13 < i12; i13++) {
                ByteString byteString3 = aVar.f23971d;
                if (byteString3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("exceptionBytes");
                    byteString3 = null;
                }
                str3 = c.a(byteString3, byteStringArr, i13);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            list2 = StringsKt.R("!".concat(str3), new char[]{'.'});
        } else if (str == null && str2 == null) {
            list2 = f21366c;
        } else {
            if (str == null || (list = StringsKt.R(str, new char[]{'.'})) == null) {
                list = e0.f19204a;
            }
            if (str2 == null || (list2 = StringsKt.R(str2, new char[]{'.'})) == null) {
                list2 = e0.f19204a;
            }
            if (list.size() > list2.size()) {
                list2 = list;
            }
        }
        if (b10.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list2.get(0)).charAt(0) == '!') {
            size = b10.size();
            size2 = list2.size();
        } else {
            size = b10.size();
            size2 = list2.size() + 1;
        }
        int i14 = size - size2;
        Sequence z7 = CollectionsKt.z(b(domain));
        Intrinsics.checkNotNullParameter(z7, "<this>");
        if (i14 < 0) {
            throw new IllegalArgumentException(e.f(i14, "Requested element count ", " is less than zero.").toString());
        }
        if (i14 != 0) {
            z7 = z7 instanceof d ? ((d) z7).a(i14) : new bg.c(z7, i14);
        }
        return q.e(z7, ".");
    }
}
