package com.vk.superapp;

import xsna.asp;
import xsna.zrp;

/* compiled from: SuperAppFeatures.kt */
/* loaded from: classes11.dex */
public interface SuperAppFeatures {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppFeatures.kt */
    /* loaded from: classes6.dex */
    public static final class RequestName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RequestName[] $VALUES;
        public static final RequestName EDIT_WIDGET_SETTINGS;
        public static final RequestName GET_ALL_WIDGET_SETTINGS;
        public static final RequestName GET_MINI_APPS_CATALOG;
        public static final RequestName GET_SHOWCASE;
        public static final RequestName GET_TABBAR;
        public static final RequestName GET_TABBAR_SETTINGS;
        public static final RequestName SET_TABBAR_SETTINGS;

        static {
            RequestName requestName = new RequestName("GET_ALL_WIDGET_SETTINGS", 0);
            GET_ALL_WIDGET_SETTINGS = requestName;
            RequestName requestName2 = new RequestName("EDIT_WIDGET_SETTINGS", 1);
            EDIT_WIDGET_SETTINGS = requestName2;
            RequestName requestName3 = new RequestName("GET_SHOWCASE", 2);
            GET_SHOWCASE = requestName3;
            RequestName requestName4 = new RequestName("GET_MINI_APPS_CATALOG", 3);
            GET_MINI_APPS_CATALOG = requestName4;
            RequestName requestName5 = new RequestName("GET_TABBAR", 4);
            GET_TABBAR = requestName5;
            RequestName requestName6 = new RequestName("GET_TABBAR_SETTINGS", 5);
            GET_TABBAR_SETTINGS = requestName6;
            RequestName requestName7 = new RequestName("SET_TABBAR_SETTINGS", 6);
            SET_TABBAR_SETTINGS = requestName7;
            RequestName[] requestNameArr = {requestName, requestName2, requestName3, requestName4, requestName5, requestName6, requestName7};
            $VALUES = requestNameArr;
            $ENTRIES = new asp(requestNameArr);
        }

        public RequestName() {
            throw null;
        }

        public static RequestName valueOf(String str) {
            return (RequestName) Enum.valueOf(RequestName.class, str);
        }

        public static RequestName[] values() {
            return (RequestName[]) $VALUES.clone();
        }
    }

    String a(RequestName requestName);

    String getSupportedFeatures();
}
