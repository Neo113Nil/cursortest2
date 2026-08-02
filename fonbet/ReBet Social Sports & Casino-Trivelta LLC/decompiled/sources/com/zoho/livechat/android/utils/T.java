package com.zoho.livechat.android.utils;

import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public abstract class T {

    public static class a implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public String f44474a;

        public a(String str) {
            this.f44474a = str;
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Map map, Map map2) {
            Object obj = map.get(this.f44474a);
            Object obj2 = map2.get(this.f44474a);
            if (!d(obj)) {
                return d(obj2) ? 1 : 0;
            }
            if (d(obj2)) {
                return ((Comparable) obj).compareTo(obj2);
            }
            return -1;
        }

        public final boolean d(Object obj) {
            return obj != null && (obj instanceof Comparable);
        }
    }

    public static Map a(TimeZone timeZone, String str, String str2, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(StackTraceHelper.ID_KEY, timeZone.getID());
        hashMap.put("name", str2);
        hashMap.put("gmt", str);
        hashMap.put("offset", Integer.valueOf(i10));
        hashMap.put("tz_name", timeZone.getDisplayName());
        return hashMap;
    }

    public static Map b() {
        Locale locale = Locale.getDefault();
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        return a(timeZone, c(locale, timeZone, date), timeZone.getID().replaceAll(".*/", "").replaceAll("_", " "), timeZone.getOffset(date.getTime()));
    }

    public static String c(Locale locale, TimeZone timeZone, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", locale);
        simpleDateFormat.setTimeZone(timeZone);
        return BidiFormatter.getInstance().unicodeWrap(simpleDateFormat.format(date), TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
    }

    public static int d(ArrayList arrayList, String str) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equals((String) ((Map) arrayList.get(i10)).get(StackTraceHelper.ID_KEY))) {
                return i10;
            }
        }
        return -1;
    }

    public static ArrayList e(String str) {
        Locale locale = Locale.getDefault();
        Date date = new Date();
        String[] availableIDs = TimeZone.getAvailableIDs();
        ArrayList arrayList = new ArrayList();
        for (String str2 : availableIDs) {
            TimeZone timeZone = TimeZone.getTimeZone(str2);
            if (str2.matches(".*/.*")) {
                String replaceAll = str2.replaceAll(".*/", "").replaceAll("_", " ");
                String c10 = c(locale, timeZone, date);
                if (str == null || replaceAll.toLowerCase().contains(str) || c10.toLowerCase().contains(str)) {
                    arrayList.add(a(timeZone, c10, replaceAll, timeZone.getOffset(date.getTime())));
                }
            }
        }
        if (arrayList.size() > 0) {
            Collections.sort(arrayList, new a("offset"));
        }
        return arrayList;
    }
}
