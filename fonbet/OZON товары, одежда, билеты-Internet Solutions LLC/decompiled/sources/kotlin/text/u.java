package kotlin.text;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/Pair;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u extends AbstractC7737t implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<String> f71978b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(List list) {
        super(2);
        this.f71978b = list;
    }

    public final Pair<Integer, Integer> a(CharSequence $receiver, int i11) {
        CharSequence charSequence;
        Object obj;
        Pair pair;
        Object obj2;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        List<String> list = this.f71978b;
        if (list.size() == 1) {
            String str = (String) C7714v.A0(list);
            int J11 = h.J($receiver, str, i11, false, 4);
            if (J11 >= 0) {
                pair = new Pair(Integer.valueOf(J11), str);
            }
            pair = null;
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            IntRange intRange = new IntRange(i11, $receiver.length(), 1);
            if ($receiver instanceof String) {
                int f71842a = intRange.getF71842a();
                int f71843b = intRange.getF71843b();
                int f71844c = intRange.getF71844c();
                if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                    int i12 = f71842a;
                    while (true) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (r.a(0, i12, str2.length(), str2, (String) $receiver, false)) {
                                break;
                            }
                        }
                        String str3 = (String) obj2;
                        if (str3 == null) {
                            if (i12 == f71843b) {
                                break;
                            }
                            i12 += f71844c;
                        } else {
                            pair = new Pair(Integer.valueOf(i12), str3);
                            break;
                        }
                    }
                }
                pair = null;
            } else {
                int f71842a2 = intRange.getF71842a();
                int f71843b2 = intRange.getF71843b();
                int f71844c2 = intRange.getF71844c();
                if ((f71844c2 > 0 && f71842a2 <= f71843b2) || (f71844c2 < 0 && f71843b2 <= f71842a2)) {
                    int i13 = f71842a2;
                    while (true) {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                charSequence = $receiver;
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str4 = (String) obj;
                            charSequence = $receiver;
                            if (w.i(str4, 0, charSequence, i13, str4.length(), false)) {
                                break;
                            }
                            $receiver = charSequence;
                        }
                        String str5 = (String) obj;
                        if (str5 == null) {
                            if (i13 == f71843b2) {
                                break;
                            }
                            i13 += f71844c2;
                            $receiver = charSequence;
                        } else {
                            pair = new Pair(Integer.valueOf(i13), str5);
                            break;
                        }
                    }
                }
                pair = null;
            }
        }
        if (pair != null) {
            return new Pair<>(pair.e(), Integer.valueOf(((String) pair.f()).length()));
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        return a(charSequence, num.intValue());
    }
}
