package a2;

import a2.m;
import android.content.res.Resources;
import androidx.lifecycle.d1;
import c1.b1;
import com.sports.insider.data.repository.room.billing.PurchaseSubsTable;
import com.sports.insider.data.repository.room.billing.SkuDetailsTable;
import eg.w;
import eg.x0;
import io.appmetrica.analytics.impl.C0122e9;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import k2.x;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y1.b0;
import y1.d0;
import y1.j0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41a;

    public /* synthetic */ j(int i5) {
        this.f41a = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f41a) {
            case 0:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (String) it.f19192a;
            case 1:
                Intrinsics.checkNotNullParameter((t1.c) obj, "$this$initializer");
                return new m.a();
            case 2:
                ag.c it2 = (ag.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return li.a.a(it2);
            case 3:
                t1.c initializer = (t1.c) obj;
                Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
                return new b2.c(d1.d(initializer));
            case 4:
                b0 it3 = (b0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Integer.valueOf(it3.f25534b.f3017e);
            case 5:
                j0 navOptions = (j0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.f25575c = true;
                return Unit.f19194a;
            case 6:
                b0 destination = (b0) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                d0 d0Var = destination.f25535c;
                if (d0Var == null || d0Var.f25543g.f3078a != destination.f25534b.f3017e) {
                    return null;
                }
                return d0Var;
            case 7:
                b0 destination2 = (b0) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                d0 d0Var2 = destination2.f25535c;
                if (d0Var2 == null || d0Var2.f25543g.f3078a != destination2.f25534b.f3017e) {
                    return null;
                }
                return d0Var2;
            case 8:
                return Boolean.valueOf(obj == null);
            case 9:
                File file = (File) obj;
                Intrinsics.checkNotNullParameter(file, "it");
                Intrinsics.checkNotNullParameter(file, "file");
                String filePath = file.getCanonicalFile().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(filePath, "getAbsolutePath(...)");
                Intrinsics.checkNotNullParameter(filePath, "filePath");
                return new b1(filePath);
            case 10:
                return Unit.f19194a;
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 12:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 13:
                char charValue = ((Character) obj).charValue();
                return Boolean.valueOf(charValue == 'T' || charValue == 't');
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 15:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 16:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 17:
                Intrinsics.checkNotNullParameter((Resources) obj, "<unused var>");
                return Boolean.TRUE;
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder c2 = v.f.c(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    Intrinsics.checkNotNullExpressionValue(value, "toString(...)");
                }
                c2.append(value);
                return c2.toString();
            case 19:
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("SELECT id FROM sku_id_content_type_table WHERE typeSkuContent == 1 AND typeSku == 2");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (r02.n0()) {
                        arrayList.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList;
                } finally {
                }
            case 20:
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("SELECT id FROM sku_id_content_type_table WHERE typeSku == 0");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (r02.n0()) {
                        arrayList2.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 21:
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("SELECT * FROM sku_details_table");
                try {
                    int r5 = x.r(r02, PurchaseSubsTable.skuColumn);
                    int r6 = x.r(r02, PurchaseSubsTable.jsonStringColumn);
                    ArrayList arrayList3 = new ArrayList();
                    while (r02.n0()) {
                        arrayList3.add(new SkuDetailsTable(r02.V(r5), r02.V(r6)));
                    }
                    return arrayList3;
                } finally {
                }
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("SELECT id FROM sku_id_content_type_table WHERE typeSkuContent == 4 AND typeSku == 2");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (r02.n0()) {
                        arrayList4.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList4;
                } finally {
                }
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("SELECT id FROM sku_id_content_type_table WHERE typeSkuContent == 2 AND typeSku == 0");
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (r02.n0()) {
                        arrayList5.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList5;
                } finally {
                }
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("SELECT id FROM sku_id_content_type_table WHERE typeSkuContent == 2 AND typeSku == 2");
                try {
                    ArrayList arrayList6 = new ArrayList();
                    while (r02.n0()) {
                        arrayList6.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList6;
                } finally {
                }
            case C0122e9.F /* 25 */:
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("SELECT id FROM sku_id_content_type_table WHERE typeSkuContent == 1 AND typeSku == 0");
                try {
                    ArrayList arrayList7 = new ArrayList();
                    while (r02.n0()) {
                        arrayList7.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList7;
                } finally {
                }
            case C0122e9.G /* 26 */:
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0("SELECT id FROM sku_id_content_type_table WHERE typeSkuContent == 3 AND typeSku == 2");
                try {
                    ArrayList arrayList8 = new ArrayList();
                    while (r02.n0()) {
                        arrayList8.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList8;
                } finally {
                }
            case C0122e9.H /* 27 */:
                s2.a _connection9 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection9, "_connection");
                r02 = _connection9.r0("SELECT id FROM sku_id_content_type_table WHERE typeSku == 2");
                try {
                    ArrayList arrayList9 = new ArrayList();
                    while (r02.n0()) {
                        arrayList9.add(r02.isNull(0) ? null : r02.V(0));
                    }
                    return arrayList9;
                } finally {
                }
            case 28:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof w) {
                    return (w) element;
                }
                return null;
            default:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof x0) {
                    return (x0) element2;
                }
                return null;
        }
    }
}
