package If;

import android.app.Application;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.crypto.tink.integration.android.b;
import com.google.gson.h;
import com.google.gson.k;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.notifications.sdk.entities.SalesIQNotificationPayload;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.L;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import od.t;
import og.AbstractC5896h;
import sd.d;

/* loaded from: classes4.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:215:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SalesIQNotificationPayload a(HashMap hashMap, String str, k kVar, SalesIQChat salesIQChat) {
        String str2;
        String str3;
        String f10;
        List split$default;
        String str4;
        String f11;
        String f12;
        h r10;
        int hashCode;
        String str5;
        String f13;
        h r11;
        h r12;
        h r13;
        h r14;
        String str6;
        String f14;
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        r3 = null;
        SalesIQNotificationPayload.EndChatDetails.Department department = null;
        r3 = null;
        SalesIQNotificationPayload.Call.Department department2 = null;
        r3 = null;
        SalesIQNotificationPayload.Chat.Department department3 = null;
        if (kVar == null || hashMap.get("msg") == null) {
            return null;
        }
        h r15 = kVar.r("groupid");
        String f15 = r15 != null ? AbstractC5896h.f(r15) : null;
        if (StringsKt.equals(f15, "siq_vh", true) || StringsKt.equals(f15, "siq_customer", true)) {
            h r16 = kVar.r("imgpath");
            if (r16 != null && (str2 = AbstractC5896h.f(r16)) != null) {
                if (!StringsKt.equals(f15, "siq_customer", true)) {
                    if ((str != null ? hashMap : null) != null) {
                        str2 = d.d() + '/' + str + "/downloadsdkimg.ls?imgpath=" + str2 + "&downloadtype=sdkimage";
                    }
                }
                h r17 = kVar.r("targetlink");
                String f16 = r17 == null ? AbstractC5896h.f(r17) : null;
                h r18 = kVar.r("title");
                String f17 = r18 == null ? AbstractC5896h.f(r18) : null;
                Object obj = hashMap.get("msg");
                return new SalesIQNotificationPayload.VisitorHistory(str2, f16, f17, obj != null ? obj.toString() : null);
            }
            str2 = null;
            h r172 = kVar.r("targetlink");
            if (r172 == null) {
            }
            h r182 = kVar.r("title");
            if (r182 == null) {
            }
            Object obj2 = hashMap.get("msg");
            return new SalesIQNotificationPayload.VisitorHistory(str2, f16, f17, obj2 != null ? obj2.toString() : null);
        }
        if (Intrinsics.areEqual(f15, "siq_endchat")) {
            Object obj3 = hashMap.get("msg");
            String obj4 = obj3 != null ? obj3.toString() : null;
            Object obj5 = hashMap.get("uid");
            String obj6 = obj5 != null ? obj5.toString() : null;
            if (salesIQChat == null || (f14 = salesIQChat.getVisitid()) == null) {
                h r19 = kVar.r("chid");
                if (r19 == null) {
                    str6 = null;
                    h r20 = kVar.r("title");
                    String f18 = r20 == null ? AbstractC5896h.f(r20) : null;
                    if (salesIQChat != null && salesIQChat.getDeptid() != null) {
                        department = new SalesIQNotificationPayload.EndChatDetails.Department(salesIQChat.getDeptid(), salesIQChat.getDepartmentName());
                    }
                    return new SalesIQNotificationPayload.EndChatDetails(obj4, obj6, str6, f18, department);
                }
                f14 = AbstractC5896h.f(r19);
            }
            str6 = f14;
            h r202 = kVar.r("title");
            if (r202 == null) {
            }
            if (salesIQChat != null) {
                department = new SalesIQNotificationPayload.EndChatDetails.Department(salesIQChat.getDeptid(), salesIQChat.getDepartmentName());
            }
            return new SalesIQNotificationPayload.EndChatDetails(obj4, obj6, str6, f18, department);
        }
        if (Intrinsics.areEqual(f15, "siq_call")) {
            h r21 = kVar.r("msg");
            k d10 = r21 != null ? AbstractC5896h.d(r21) : null;
            String f19 = (d10 == null || (r14 = d10.r("operation")) == null) ? null : AbstractC5896h.f(r14);
            if (d10 == null || (r10 = d10.r("opr_user")) == null) {
                r10 = d10 != null ? d10.r("opruser") : null;
            }
            k d11 = r10 != null ? AbstractC5896h.d(r10) : null;
            SalesIQNotificationPayload.Call.Operation operation = Intrinsics.areEqual(f19, "invite") ? SalesIQNotificationPayload.Call.Operation.INCOMING : Intrinsics.areEqual(f19, "miss") ? SalesIQNotificationPayload.Call.Operation.MISS : SalesIQNotificationPayload.Call.Operation.CANCEL;
            if (f19 == null || ((hashCode = f19.hashCode()) == -1367724422 ? !f19.equals("cancel") : !(hashCode == -1183699191 ? f19.equals("invite") : hashCode == 3351804 && f19.equals("miss")))) {
                return null;
            }
            Object obj7 = hashMap.get("notification_message");
            String obj8 = obj7 != null ? obj7.toString() : null;
            Object obj9 = hashMap.get("notification_title");
            String obj10 = obj9 != null ? obj9.toString() : null;
            if (Intrinsics.areEqual(f19, "invite")) {
                Application e10 = MobilistenInitProvider.INSTANCE.e();
                obj8 = e10 != null ? e10.getString(t.f60874H4) : null;
                obj10 = (d11 == null || (r13 = d11.r("dname")) == null) ? null : AbstractC5896h.f(r13);
            }
            String str7 = obj10;
            String str8 = obj8;
            String f20 = (d11 == null || (r12 = d11.r(StackTraceHelper.ID_KEY)) == null) ? null : AbstractC5896h.f(r12);
            String f21 = (d11 == null || (r11 = d11.r("dname")) == null) ? null : AbstractC5896h.f(r11);
            if (salesIQChat == null || (f13 = salesIQChat.getVisitid()) == null) {
                h r22 = kVar.r("chid");
                if (r22 != null) {
                    f13 = AbstractC5896h.f(r22);
                } else {
                    h r23 = kVar.r("conversation_id");
                    if (r23 == null) {
                        str5 = null;
                        if (salesIQChat != null && salesIQChat.getDeptid() != null) {
                            department2 = new SalesIQNotificationPayload.Call.Department(salesIQChat.getDeptid(), salesIQChat.getDepartmentName());
                        }
                        return new SalesIQNotificationPayload.Call(str8, f20, f21, str5, str7, operation, department2);
                    }
                    f13 = AbstractC5896h.f(r23);
                }
            }
            str5 = f13;
            if (salesIQChat != null) {
                department2 = new SalesIQNotificationPayload.Call.Department(salesIQChat.getDeptid(), salesIQChat.getDepartmentName());
            }
            return new SalesIQNotificationPayload.Call(str8, f20, f21, str5, str7, operation, department2);
        }
        h r24 = kVar.r("dname");
        String f22 = r24 != null ? AbstractC5896h.f(r24) : null;
        h r25 = kVar.r("rmsg");
        if (r25 == null) {
            r25 = kVar.r("msg");
        }
        String z10 = L.z(r25 != null ? AbstractC5896h.f(r25) : null);
        Object obj11 = hashMap.get("uid");
        String obj12 = obj11 != null ? obj11.toString() : null;
        String visitid = salesIQChat != null ? salesIQChat.getVisitid() : null;
        if (visitid != null && StringsKt.startsWith$default(visitid, "0", false, 2, (Object) null)) {
            visitid = null;
        }
        if (visitid == null) {
            h r26 = kVar.r("chid");
            if (r26 == null || (visitid = AbstractC5896h.f(r26)) == null || StringsKt.startsWith$default(visitid, "LD", false, 2, (Object) null)) {
                visitid = null;
            }
            if (visitid == null) {
                if (salesIQChat == null || (visitid = salesIQChat.getChid()) == null || StringsKt.contains$default((CharSequence) visitid, (CharSequence) "temp", false, 2, (Object) null)) {
                    visitid = null;
                }
                if (visitid == null) {
                    if (salesIQChat == null) {
                        str3 = null;
                        h r27 = kVar.r("lmsguid");
                        String replace$default = (r27 != null || (f12 = AbstractC5896h.f(r27)) == null) ? null : StringsKt.replace$default(f12, "%", "_", false, 4, (Object) null);
                        h r28 = kVar.r("msguid");
                        String replace$default2 = (r28 != null || (f11 = AbstractC5896h.f(r28)) == null) ? null : StringsKt.replace$default(f11, "%", "_", false, 4, (Object) null);
                        h r29 = kVar.r("sender");
                        String replaceFirst$default = (r29 != null || (f10 = AbstractC5896h.f(r29)) == null || (split$default = StringsKt.split$default((CharSequence) f10, new String[]{"_"}, false, 0, 6, (Object) null)) == null || (str4 = (String) CollectionsKt.lastOrNull(split$default)) == null) ? null : StringsKt.replaceFirst$default(str4, b.f37029b, "", false, 4, (Object) null);
                        if (salesIQChat != null && salesIQChat.getDeptid() != null) {
                            department3 = new SalesIQNotificationPayload.Chat.Department(salesIQChat.getDeptid(), salesIQChat.getDepartmentName());
                        }
                        return new SalesIQNotificationPayload.Chat(z10, obj12, str3, f22, replace$default, replace$default2, replaceFirst$default, f22, department3);
                    }
                    visitid = salesIQChat.getConvID();
                }
            }
        }
        str3 = visitid;
        h r272 = kVar.r("lmsguid");
        if (r272 != null) {
        }
        h r282 = kVar.r("msguid");
        if (r282 != null) {
        }
        h r292 = kVar.r("sender");
        if (r292 != null) {
        }
        if (salesIQChat != null) {
            department3 = new SalesIQNotificationPayload.Chat.Department(salesIQChat.getDeptid(), salesIQChat.getDepartmentName());
        }
        return new SalesIQNotificationPayload.Chat(z10, obj12, str3, f22, replace$default, replace$default2, replaceFirst$default, f22, department3);
    }
}
