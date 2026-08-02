package com.zoho.livechat.android.utils;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class O {
    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d -v time -t 4000").getInputStream()), 8192);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                if (sb2.length() >= 500) {
                    arrayList.add(sb2.toString());
                    sb2 = new StringBuilder();
                }
            }
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
        arrayList.add(sb2.toString());
        return arrayList;
    }
}
