package kotlin.collections;

import com.google.android.material.navigation.NavigationBarView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "", "firstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = NavigationBarView.ITEM_GRAVITY_TOP_CENTER, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3794:1\n295#1,2:3795\n528#1,7:3797\n543#1,6:3804\n865#1,2:3811\n796#1:3813\n1878#1,2:3814\n797#1,2:3816\n1880#1:3818\n799#1:3819\n1878#1,3:3820\n817#1,2:3823\n855#1,2:3825\n1267#1,4:3831\n1236#1,4:3835\n1252#1,4:3839\n1299#1,4:3843\n1460#1,5:3847\n1475#1,5:3852\n1516#1,3:3857\n1519#1,3:3867\n1534#1,3:3870\n1537#1,3:3880\n1634#1,3:3897\n1604#1,4:3900\n1593#1:3904\n1878#1,2:3905\n1880#1:3908\n1594#1:3909\n1878#1,3:3910\n1625#1:3913\n1869#1:3914\n1870#1:3916\n1626#1:3917\n1869#1,2:3918\n1878#1,3:3920\n2967#1,3:3923\n2970#1,6:3927\n2992#1,3:3933\n2995#1,7:3937\n865#1,2:3944\n827#1:3946\n855#1,2:3947\n827#1:3949\n855#1,2:3950\n827#1:3952\n855#1,2:3953\n3516#1,8:3959\n3544#1,7:3967\n3575#1,10:3974\n1#2:3810\n1#2:3907\n1#2:3915\n1#2:3926\n1#2:3936\n37#3,2:3827\n37#3,2:3829\n382#4,7:3860\n382#4,7:3873\n382#4,7:3883\n382#4,7:3890\n32#5,2:3955\n32#5,2:3957\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n174#1:3795,2\n184#1:3797,7\n194#1:3804,6\n774#1:3811,2\n785#1:3813\n785#1:3814,2\n785#1:3816,2\n785#1:3818\n785#1:3819\n796#1:3820,3\n808#1:3823,2\n827#1:3825,2\n1194#1:3831,4\n1209#1:3835,4\n1223#1:3839,4\n1286#1:3843,4\n1374#1:3847,5\n1387#1:3852,5\n1491#1:3857,3\n1491#1:3867,3\n1504#1:3870,3\n1504#1:3880,3\n1563#1:3897,3\n1573#1:3900,4\n1583#1:3904\n1583#1:3905,2\n1583#1:3908\n1583#1:3909\n1593#1:3910,3\n1617#1:3913\n1617#1:3914\n1617#1:3916\n1617#1:3917\n1625#1:3918,2\n2767#1:3920,3\n3067#1:3923,3\n3067#1:3927,6\n3084#1:3933,3\n3084#1:3937,7\n3254#1:3944,2\n3262#1:3946\n3262#1:3947,2\n3272#1:3949\n3272#1:3950,2\n3282#1:3952\n3282#1:3953,2\n3505#1:3959,8\n3533#1:3967,7\n3562#1:3974,10\n1583#1:3907\n1617#1:3915\n3067#1:3926\n3084#1:3936\n1042#1:3827,2\n1089#1:3829,2\n1491#1:3860,7\n1504#1:3873,7\n1518#1:3883,7\n1536#1:3890,7\n3450#1:3955,2\n3492#1:3957,2\n*E\n"})
/* loaded from: classes.dex */
public class CollectionsKt___CollectionsKt extends b0 {
    @Nullable
    public static <T> T firstOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void w(Iterable iterable, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append(prefix);
        int i5 = 0;
        for (Object obj : iterable) {
            i5++;
            if (i5 > 1) {
                buffer.append(separator);
            }
            kotlin.text.s.a(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    public static final void x(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static final List y(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return CollectionsKt.X((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        x(iterable, arrayList);
        return arrayList;
    }
}
