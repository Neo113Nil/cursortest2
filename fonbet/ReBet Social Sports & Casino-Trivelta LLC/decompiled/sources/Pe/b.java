package Pe;

import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8981a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8982b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8983c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8984d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8985e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f8986f;

    public b(String str, String str2, Object obj, List list, String str3, Map map) {
        this.f8981a = str;
        this.f8982b = str2;
        this.f8983c = obj;
        this.f8984d = list;
        this.f8985e = str3;
        this.f8986f = map;
    }

    public static /* synthetic */ b b(b bVar, String str, String str2, Object obj, List list, String str3, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = bVar.f8981a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f8982b;
        }
        if ((i10 & 4) != 0) {
            obj = bVar.f8983c;
        }
        if ((i10 & 8) != 0) {
            list = bVar.f8984d;
        }
        if ((i10 & 16) != 0) {
            str3 = bVar.f8985e;
        }
        if ((i10 & 32) != 0) {
            map = bVar.f8986f;
        }
        String str4 = str3;
        Map map2 = map;
        return bVar.a(str, str2, obj, list, str4, map2);
    }

    public final b a(String str, String str2, Object obj, List list, String str3, Map map) {
        return new b(str, str2, obj, list, str3, map);
    }

    public final String c() {
        return this.f8982b;
    }

    public final Map d() {
        return this.f8986f;
    }

    public final List e() {
        return this.f8984d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f8981a, bVar.f8981a) && Intrinsics.areEqual(this.f8982b, bVar.f8982b) && Intrinsics.areEqual(this.f8983c, bVar.f8983c) && Intrinsics.areEqual(this.f8984d, bVar.f8984d) && Intrinsics.areEqual(this.f8985e, bVar.f8985e) && Intrinsics.areEqual(this.f8986f, bVar.f8986f);
    }

    public final Object f() {
        return this.f8983c;
    }

    public final String g() {
        return this.f8985e;
    }

    public final List h(List serverDepartments) {
        Object obj;
        Intrinsics.checkNotNullParameter(serverDepartments, "serverDepartments");
        List<Channel.Department> list = this.f8984d;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Channel.Department department : list) {
            Iterator it = serverDepartments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Channel.Department) obj).getId(), department.getId())) {
                    break;
                }
            }
            Channel.Department department2 = (Channel.Department) obj;
            if (department2 != null) {
                arrayList.add(department2);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        String str = this.f8981a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8982b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.f8983c;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        List list = this.f8984d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f8985e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.f8986f;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String i() {
        return this.f8981a;
    }

    public String toString() {
        return "SalesIQConversationAttributes(name=" + this.f8981a + ", additionalInfo=" + this.f8982b + ", displayPicture=" + this.f8983c + ", departments=" + this.f8984d + ", encodedDisplayPicture=" + this.f8985e + ", customSecretFields=" + this.f8986f + ')';
    }

    public /* synthetic */ b(String str, String str2, Object obj, List list, String str3, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, obj, list, (i10 & 16) != 0 ? null : str3, map);
    }
}
