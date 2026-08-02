package com.zoho.livechat.android.utils;

import android.content.SharedPreferences;
import com.facebook.react.devsupport.StackTraceHelper;
import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import og.AbstractC5891c;
import og.AbstractC5895g;
import rd.C6218a;
import ug.AbstractC6574b;
import xe.C6822a;

/* renamed from: com.zoho.livechat.android.utils.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3945n {
    public static void b(String str, List list) {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            HashMap hashMap = (HashMap) AbstractC5895g.b(Yd.a.j(), C6218a.M().getString("trigger_departments", null), HashMap.class);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, AbstractC6574b.g(list));
            edit.putString("trigger_departments", Yd.a.j().v(hashMap));
            edit.apply();
        }
    }

    public static void c(String str) {
        if (C6218a.M() != null) {
            SharedPreferences.Editor edit = C6218a.M().edit();
            HashMap hashMap = (HashMap) AbstractC5895g.b(Yd.a.j(), C6218a.M().getString("trigger_departments", null), HashMap.class);
            if (hashMap != null) {
                hashMap.remove(str);
                edit.putString("trigger_departments", Yd.a.j().v(hashMap));
                edit.apply();
            }
        }
    }

    public static List d() {
        if (C6822a.m() != null) {
            return C6822a.m().getChatDepartments();
        }
        return null;
    }

    public static Channel.Department e(final String str) {
        Channel m10 = C6822a.m();
        if (m10 == null || m10.getChatDepartments() == null) {
            return null;
        }
        return (Channel.Department) AbstractC5891c.c(m10.getChatDepartments(), new Function1() { // from class: com.zoho.livechat.android.utils.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean valueOf;
                String str2 = str;
                valueOf = Boolean.valueOf((r2 == null || r2.getId() == null || !r2.getId().equals(r1)) ? false : true);
                return valueOf;
            }
        });
    }

    public static String f(String str) {
        try {
            Hashtable androidChannel = LiveChatUtil.getAndroidChannel();
            if (androidChannel != null) {
                ArrayList arrayList = (ArrayList) androidChannel.get("departments");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Hashtable hashtable = (Hashtable) arrayList.get(i10);
                    if (str.equalsIgnoreCase(LiveChatUtil.getString(hashtable.get("name")))) {
                        return LiveChatUtil.getString(hashtable.get(StackTraceHelper.ID_KEY));
                    }
                }
            }
            return null;
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r0 = com.zoho.livechat.android.utils.LiveChatUtil.getString(r3.get("name"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String g(String str) {
        String str2 = null;
        try {
            Hashtable androidChannel = LiveChatUtil.getAndroidChannel();
            if (androidChannel != null) {
                try {
                    ArrayList arrayList = (ArrayList) androidChannel.get("departments");
                    int i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            Hashtable hashtable = (Hashtable) arrayList.get(i10);
                            if (str.equalsIgnoreCase(LiveChatUtil.getString(hashtable.get(StackTraceHelper.ID_KEY)))) {
                                break;
                            }
                            i10++;
                        }
                    }
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
            break;
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
        return str2;
    }

    public static List h(String str) {
        if (C6218a.M() != null && str != null) {
            HashMap hashMap = (HashMap) AbstractC5895g.b(Yd.a.j(), C6218a.M().getString("trigger_departments", null), HashMap.class);
            if (hashMap != null) {
                return (List) AbstractC6574b.d((String) hashMap.get(str));
            }
        }
        return null;
    }

    public static List i(boolean z10, String str, String str2) {
        List<Channel.Department> arrayList = (C6822a.m() == null || C6822a.m().getChatDepartments() == null) ? new ArrayList<>() : C6822a.m().getChatDepartments();
        if (z10 && C6218a.M() != null && C6218a.M().getString("trigger_departments", null) != null) {
            List h10 = h(str2);
            ArrayList arrayList2 = new ArrayList();
            for (Channel.Department department : arrayList) {
                if (h10 != null && h10.contains(department.getId())) {
                    arrayList2.add(department);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        Pe.b h02 = Te.a.h0(str2);
        if (h02 != null) {
            SalesIQConversationAttributes a10 = Le.b.a(h02);
            if (a10.getDepartments() != null && !a10.getDepartments().isEmpty()) {
                return h02.h(arrayList);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (ZohoSalesIQ.Chat.getDepts() != null) {
            ArrayList<String> depts = ZohoSalesIQ.Chat.getDepts();
            for (Channel.Department department2 : arrayList) {
                if (depts.contains(department2.getName()) && department2.getId() != null && !department2.getId().trim().isEmpty()) {
                    arrayList3.add(department2);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList = arrayList3;
            }
        }
        if (str != null) {
            for (Channel.Department department3 : arrayList) {
                if (department3.getId() != null && department3.getId().equals(str)) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(department3);
                    return arrayList4;
                }
            }
        }
        return arrayList;
    }
}
