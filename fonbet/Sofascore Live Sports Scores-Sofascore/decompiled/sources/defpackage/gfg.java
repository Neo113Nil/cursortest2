package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gfg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ gfg(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pwh pwhVar = null;
        r2 = null;
        iej iejVar = null;
        pwhVar = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                return new xeg(context);
            case 1:
                Context context2 = (Context) obj;
                context2.getClass();
                return new igg(context2);
            case 2:
                Context context3 = (Context) obj;
                Object systemService = context3 != null ? context3.getSystemService("audio") : null;
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    return Integer.valueOf(audioManager.getRingerMode());
                }
                return null;
            case 3:
                Context context4 = (Context) obj;
                context4.getClass();
                return new xeg(context4);
            case 4:
                Context context5 = (Context) obj;
                context5.getClass();
                return new idg(context5);
            case 5:
                Context context6 = (Context) obj;
                context6.getClass();
                return new xeg(context6);
            case 6:
                Context context7 = (Context) obj;
                Object systemService2 = context7 != null ? context7.getSystemService("audio") : null;
                AudioManager audioManager2 = systemService2 instanceof AudioManager ? (AudioManager) systemService2 : null;
                if (audioManager2 != null) {
                    return Integer.valueOf(audioManager2.getRingerMode());
                }
                return null;
            case 7:
                xkg xkgVar = (xkg) obj;
                if (!hl3.a.contains(xkgVar.a) && !hl3.b.contains(xkgVar.a)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return new ppg((Map) obj);
            case 9:
                List list = (List) obj;
                list.getClass();
                return new g1d((KSerializer) CollectionsKt.Y(list), 0);
            case 10:
                List list2 = (List) obj;
                list2.getClass();
                return new g1d((KSerializer) CollectionsKt.Y(list2), 1);
            case 11:
                return obj;
            case 12:
                obj.getClass();
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                Function1 function1 = (Function1) yqg.i.c;
                Boolean bool = Boolean.FALSE;
                pwh pwhVar2 = (Intrinsics.c(obj2, bool) || obj2 == null) ? null : (pwh) function1.invoke(obj2);
                Object obj3 = list3.get(1);
                pwh pwhVar3 = (Intrinsics.c(obj3, bool) || obj3 == null) ? null : (pwh) function1.invoke(obj3);
                Object obj4 = list3.get(2);
                pwh pwhVar4 = (Intrinsics.c(obj4, bool) || obj4 == null) ? null : (pwh) function1.invoke(obj4);
                Object obj5 = list3.get(3);
                if (!Intrinsics.c(obj5, bool) && obj5 != null) {
                    pwhVar = (pwh) function1.invoke(obj5);
                }
                return new iej(pwhVar2, pwhVar3, pwhVar4, pwhVar);
            case 13:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(1);
                List list5 = (Intrinsics.c(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) yqg.b.c).invoke(obj6);
                Object obj7 = list4.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new q80(list5, str);
            case 14:
                obj.getClass();
                return new v8j(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                List list6 = (List) obj;
                return new zcj(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case 16:
                obj.getClass();
                List list7 = (List) obj;
                Object obj8 = list7.get(0);
                mfj[] mfjVarArr = lfj.b;
                Function1 function12 = yqg.x.b;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.c(obj8, bool2);
                lfj lfjVar = obj8 != null ? (lfj) function12.invoke(obj8) : null;
                lfjVar.getClass();
                long j = lfjVar.a;
                Object obj9 = list7.get(1);
                Intrinsics.c(obj9, bool2);
                lfj lfjVar2 = obj9 != null ? (lfj) function12.invoke(obj9) : null;
                lfjVar2.getClass();
                return new bdj(j, lfjVar2.a);
            case 17:
                obj.getClass();
                return new wg8(((Integer) obj).intValue());
            case 18:
                obj.getClass();
                return new sn1(((Float) obj).floatValue());
            case 19:
                obj.getClass();
                List list8 = (List) obj;
                Object obj10 = list8.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list8.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new pej(t6a.g(intValue, num2.intValue()));
            case 20:
                obj.getClass();
                List list9 = (List) obj;
                Object obj12 = list9.get(0);
                int i = r13.j;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.c(obj12, bool3);
                r13 r13Var = obj12 != null ? obj12.equals(bool3) ? new r13(r13.i) : new r13(hkg.b(((Integer) obj12).intValue())) : null;
                r13Var.getClass();
                long j2 = r13Var.a;
                Object obj13 = list9.get(1);
                xqg xqgVar = yqg.z;
                Intrinsics.c(obj13, bool3);
                dnd dndVar = obj13 != null ? (dnd) xqgVar.b.invoke(obj13) : null;
                dndVar.getClass();
                long j3 = dndVar.a;
                Object obj14 = list9.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new qah(j2, j3, f.floatValue());
            case 21:
                obj.getClass();
                return new p7j(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                List list10 = (List) obj;
                Object obj15 = list10.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list10.get(1);
                y3g y3gVar = yqg.j;
                if (!Intrinsics.c(obj16, Boolean.FALSE) && obj16 != null) {
                    iejVar = (iej) ((Function1) y3gVar.c).invoke(obj16);
                }
                return new fbb(str2, iejVar, 4);
            case 23:
                obj.getClass();
                return new z8j(((Integer) obj).intValue());
            case 24:
                obj.getClass();
                return new ql9(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj17 = list11.get(i2);
                    p80 p80Var = (Intrinsics.c(obj17, Boolean.FALSE) || obj17 == null) ? null : (p80) ((Function1) yqg.c.c).invoke(obj17);
                    p80Var.getClass();
                    arrayList.add(p80Var);
                }
                return arrayList;
            case 26:
                obj.getClass();
                return new rg8(((Integer) obj).intValue());
            case 27:
                obj.getClass();
                return new sg8(((Integer) obj).intValue());
            case 28:
                Boolean bool4 = Boolean.FALSE;
                if (Intrinsics.c(obj, bool4)) {
                    return new lfj(lfj.c);
                }
                obj.getClass();
                List list12 = (List) obj;
                Object obj18 = list12.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                Object obj19 = list12.get(1);
                xqg xqgVar2 = yqg.y;
                Intrinsics.c(obj19, bool4);
                mfj mfjVar = obj19 != null ? (mfj) xqgVar2.b.invoke(obj19) : null;
                mfjVar.getClass();
                return new lfj(v8a.E(mfjVar.a, floatValue));
            default:
                return Intrinsics.c(obj, 0) ? new mfj(8589934592L) : Intrinsics.c(obj, 1) ? new mfj(4294967296L) : new mfj(0L);
        }
    }
}
