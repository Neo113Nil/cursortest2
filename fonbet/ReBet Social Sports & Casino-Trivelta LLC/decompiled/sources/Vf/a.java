package Vf;

import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import od.t;
import rd.C6218a;

/* loaded from: classes4.dex */
public abstract class a {
    private static final String[] DYNAMICVARIABLES = {"visitor.name", "visitor.email", "visitor.id", "visitor.phone", "visitor.department", "visitor.ip", "visitor.platform", "visitor.city", "visitor.state", "visitor.country", "visitor.question", "visitor.timezone", "visitor.operating.system", "attender.name", "attender.email", "smart.timenow", "screen.resolution", "visitor.latitude", "visitor.longitude", "visitor.pagetitle", "web.embed.name"};

    /* renamed from: a, reason: collision with root package name */
    public static HashMap f12888a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static Pattern f12889b = Pattern.compile("%([^%]*)%");

    static {
        int i10 = 0;
        while (true) {
            String[] strArr = DYNAMICVARIABLES;
            if (i10 >= strArr.length) {
                return;
            }
            f12888a.put(strArr[i10], Integer.valueOf(i10));
            i10++;
        }
    }

    public static String a(SalesIQChat salesIQChat, String str) {
        String visitid;
        String str2;
        try {
            Matcher matcher = f12889b.matcher(str);
            while (matcher.find()) {
                String group = matcher.group(1);
                String replaceAll = group.replaceAll("\\s", "");
                Integer num = replaceAll.contains("|") ? (Integer) f12888a.get(replaceAll.substring(0, replaceAll.indexOf("|"))) : (Integer) f12888a.get(replaceAll);
                if (num != null) {
                    switch (num.intValue()) {
                        case 0:
                            String visitorName = LiveChatUtil.getVisitorName();
                            if (visitorName == null || visitorName.startsWith("Visitor")) {
                                visitorName = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitorName);
                            break;
                        case 1:
                            String e10 = ZohoLiveChat.e.e();
                            if (e10 == null) {
                                e10 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", e10);
                            break;
                        case 2:
                            visitid = salesIQChat != null ? salesIQChat.getVisitid() : null;
                            if (visitid == null) {
                                visitid = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitid);
                            break;
                        case 3:
                            String d10 = ZohoLiveChat.e.d();
                            if (d10 == null) {
                                d10 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", d10);
                            break;
                        case 4:
                            visitid = salesIQChat != null ? salesIQChat.getDepartmentName() : null;
                            if (visitid == null) {
                                visitid = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitid);
                            break;
                        case 5:
                            str = str.replace("%" + group + "%", replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "");
                            break;
                        case 6:
                            String L10 = C6218a.L();
                            if (L10.equalsIgnoreCase("9")) {
                                L10 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", L10);
                            break;
                        case 7:
                            str = str.replace("%" + group + "%", replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "");
                            break;
                        case 8:
                            str = str.replace("%" + group + "%", replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "");
                            break;
                        case 9:
                            str = str.replace("%" + group + "%", replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "");
                            break;
                        case 10:
                            visitid = salesIQChat != null ? salesIQChat.getQuestion() : null;
                            if (visitid == null) {
                                visitid = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitid);
                            break;
                        case 11:
                            TimeZone timeZone = TimeZone.getDefault();
                            String str3 = timeZone.getID() + " " + timeZone.getDisplayName(false, 0);
                            if (str3 == null || str3.equalsIgnoreCase("9")) {
                                str3 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", str3);
                            break;
                        case 12:
                            String K10 = C6218a.K();
                            if (K10 == null || K10.equalsIgnoreCase("9")) {
                                K10 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", K10);
                            break;
                        case 13:
                            visitid = salesIQChat != null ? salesIQChat.getAttenderName() : null;
                            if (visitid == null) {
                                visitid = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitid);
                            break;
                        case 14:
                            visitid = salesIQChat != null ? salesIQChat.getAttenderEmail() : null;
                            if (visitid == null) {
                                visitid = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitid);
                            break;
                        case 15:
                            int i10 = Calendar.getInstance().get(11);
                            if (i10 >= 0 && i10 < 12) {
                                try {
                                    str2 = MobilistenInitProvider.k().getResources().getString(t.f60881J);
                                } catch (Exception unused) {
                                    str2 = "Morning";
                                }
                            } else if (i10 >= 12 && i10 < 15) {
                                try {
                                    str2 = MobilistenInitProvider.k().getResources().getString(t.f60893L);
                                } catch (Exception unused2) {
                                    str2 = "Noon";
                                }
                            } else if (i10 < 15 || i10 >= 19) {
                                try {
                                    str2 = MobilistenInitProvider.k().getResources().getString(t.f60887K);
                                } catch (Exception unused3) {
                                    str2 = "Night";
                                }
                            } else {
                                try {
                                    str2 = MobilistenInitProvider.k().getResources().getString(t.f60875I);
                                } catch (Exception unused4) {
                                    str2 = "Evening";
                                }
                            }
                            if (str2 == null || str2.equalsIgnoreCase("9")) {
                                str2 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", str2);
                            break;
                        case 16:
                            String S10 = C6218a.S();
                            if (S10 == null || S10.equalsIgnoreCase("9")) {
                                S10 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", S10);
                            break;
                        case 17:
                            str = str.replace("%" + group + "%", replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "");
                            break;
                        case 18:
                            str = str.replace("%" + group + "%", replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "");
                            break;
                        case 19:
                            String canonicalName = ZohoLiveChat.getApplicationManager().l().getClass().getCanonicalName();
                            visitid = ZohoLiveChat.getApplicationManager().v().containsKey(canonicalName) ? (String) ZohoLiveChat.getApplicationManager().v().get(canonicalName) : null;
                            if (visitid == null) {
                                visitid = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", visitid);
                            break;
                        case 20:
                            String g10 = MobilistenUtil.g();
                            if (g10 == null) {
                                g10 = replaceAll.contains("|") ? group.substring(replaceAll.lastIndexOf("|") + 1) : "";
                            }
                            str = str.replace("%" + group + "%", g10);
                            break;
                    }
                }
            }
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
        return str;
    }

    public static String b(String str, String str2) {
        return a(LiveChatUtil.getChat(str), str2);
    }
}
