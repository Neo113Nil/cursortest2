package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.s9z0;
import xsna.y9h0;

/* compiled from: OperatorString.java */
/* loaded from: classes13.dex */
public class q {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        Object obj2;
        String str3 = "";
        if (obj == null) {
            str2 = "821";
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("802")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("803")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("804")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("805")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("811")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("812")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("813")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("814")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("815")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("817")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("818")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("819")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("820")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c(str2))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            obj2 = "";
        } else {
            str2 = "821";
            obj2 = obj;
        }
        String obj3 = obj2.toString();
        if (list != null && !list.isEmpty()) {
            str3 = String.valueOf(list.get(0));
        }
        String str4 = str3;
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("800"))) {
                return a(obj2, new y9h0(1));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("801"))) {
                return a(obj2, new s9z0());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("802"))) {
                return a(obj2, str4);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("803"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(obj3.contains(str4)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("804"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(obj3.startsWith(str4)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("805"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(obj3.endsWith(str4)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("806"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(obj3.getBytes(), 0));
            }
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("807"))) {
                return str.equals(com.mbridge.msdk.config.component.common.util.c.c("808")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.b(obj3)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("809")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.a(obj3)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("810")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.b(obj3, str4)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("811")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(obj3.length())) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("812")) ? a(obj3) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("813")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(SameMD5.getMD5(obj3)) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("814")) ? a(obj3, str4) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("815")) ? b(obj3, str4) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("816")) ? b(obj3, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("817")) ? d(obj3, str4) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("818")) ? a(obj3, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("819")) ? d(obj3, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("820")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.d()) : str.equals(com.mbridge.msdk.config.component.common.util.c.c(str2)) ? c(obj3, list) : str.equals(com.mbridge.msdk.config.component.common.util.c.c("896")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.a(obj3, str4)) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
            try {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String(Base64.decode(obj3, 0), C.UTF8_NAME));
            } catch (Exception e) {
                q0.b("StringOperator", "Base64解码失败: " + e.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        } catch (Exception e2) {
            q0.b("StringOperator", e2.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private String c(String str, String str2) {
        if (str2.equals(com.mbridge.msdk.config.component.common.util.c.c("800"))) {
            return str.toLowerCase();
        }
        if (str2.equals(com.mbridge.msdk.config.component.common.util.c.c("801"))) {
            return str.toUpperCase();
        }
        return null;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList.add(str);
        } else {
            arrayList.addAll(Arrays.asList(str.split(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : b(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:20:0x0052, B:22:0x005d, B:23:0x0063, B:24:0x006b, B:26:0x0071, B:28:0x0079, B:30:0x007e, B:33:0x009f), top: B:19:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:20:0x0052, B:22:0x005d, B:23:0x0063, B:24:0x006b, B:26:0x0071, B:28:0x0079, B:30:0x007e, B:33:0x009f), top: B:19:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(String str, List<Object> list) {
        Map map;
        if (list != null) {
            boolean z = true;
            if (list.size() == 1) {
                if (str == null) {
                    str = "";
                }
                Object obj = list.get(0);
                boolean z2 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
                if (!z2 && !(obj instanceof Map)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
                }
                try {
                    if (z2) {
                        HashMap hashMap = new HashMap();
                        Iterator<Map.Entry<String, Object>> it = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a().iterator();
                        while (true) {
                            map = hashMap;
                            if (it.hasNext()) {
                                Map.Entry<String, Object> next = it.next();
                                hashMap.put(next.getKey(), next.getValue());
                            }
                        }
                        StringBuilder sb = new StringBuilder(str);
                        if (!str.contains("?")) {
                            sb.append("?");
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            if (!z) {
                                sb.append("&");
                            }
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append(URLEncoder.encode(String.valueOf(entry.getValue()), C.UTF8_NAME));
                            z = false;
                        }
                        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
                    }
                    map = (Map) obj;
                    StringBuilder sb2 = new StringBuilder(str);
                    if (!str.contains("?")) {
                    }
                    while (r7.hasNext()) {
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
                } catch (Throwable th) {
                    q0.b("StringOperator", "Error encoding URL parameters: " + th.getMessage(), th);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, Function<String, String> function) {
        if (obj != null) {
            try {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(function.apply(String.valueOf(obj)));
            } catch (Exception e) {
                q0.b("StringOperator", e.getMessage(), e);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
        }
        try {
            String encode = URLEncoder.encode(str, C.UTF8_NAME);
            if (!TextUtils.isEmpty(encode)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(encode);
            }
        } catch (Throwable th) {
            q0.b("StringOperator", th.getMessage(), th);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            sb.append(obj);
        }
        if (str != null) {
            sb.append(str);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb.toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("StringOperator", "JSON字符串为空");
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a((Object) new JSONObject(str)));
        } catch (JSONException e) {
            q0.b("StringOperator", "JSON字符串转Map对象失败: " + e.getMessage() + ", JSON字符串: " + str);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e2) {
            q0.b("StringOperator", "JSON字符串转Map对象异常: " + e2.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (TextUtils.isEmpty(next)) {
                q0.d("StringOperator", "跳过空键: " + next);
            } else {
                hashMap.put(next, a(jSONObject.get(next)));
            }
        }
        return hashMap;
    }

    private List<Object> a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(a(jSONArray.get(i)));
        }
        return arrayList;
    }

    private Object a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.indexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            String valueOf = String.valueOf(list.get(0));
            String valueOf2 = String.valueOf(list.get(1));
            if (TextUtils.isEmpty(valueOf)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.replace(valueOf, valueOf2));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.lastIndexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            try {
                int parseInt = Integer.parseInt(String.valueOf(list.get(0)));
                int parseInt2 = Integer.parseInt(String.valueOf(list.get(1)));
                if (parseInt >= 0 && parseInt2 < str.length() && parseInt <= parseInt2) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.substring(parseInt, parseInt2 + 1));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (NumberFormatException e) {
                q0.b("StringOperator", "subString操作参数格式错误: " + e.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (StringIndexOutOfBoundsException e2) {
                q0.b("StringOperator", "subString操作索引越界: " + e2.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("800")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("801")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("802")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("803")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("804")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("805")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("806")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("807")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("808")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("809")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("810")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("811")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("812")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("813")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("814")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("815")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("816")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("817")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("818")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("819")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("820")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("821")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("896"));
    }
}
