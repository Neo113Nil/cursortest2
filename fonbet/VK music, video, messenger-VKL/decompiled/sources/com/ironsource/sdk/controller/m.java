package com.ironsource.sdk.controller;

import com.ironsource.C4492p8;
import xsna.h5s;
import xsna.zcl;

/* loaded from: classes13.dex */
public interface m {

    public static final class a implements m {
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public a(String str) {
            this(str, null, null, null, 14, null);
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.a);
            String str = this.b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.b);
            }
            String str2 = this.c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.c);
            }
            String str3 = this.d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.d);
            }
            sb.append("');");
            return sb.toString();
        }

        public a(String str, String str2) {
            this(str, str2, null, null, 12, null);
        }

        public a(String str, String str2, String str3) {
            this(str, str2, str3, null, 8, null);
        }

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public static final class b implements m {
        private int a;
        private String b;

        public b(m mVar, int i) {
            this(mVar.a(), i);
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.a != C4492p8.d.MODE_0.b() && (this.a < C4492p8.d.MODE_1.b() || this.a > C4492p8.d.MODE_3.b())) {
                str = "empty";
            }
            return h5s.d(new StringBuilder("try{"), this.b, "}catch(e){", str, "}");
        }

        public b(String str, int i) {
            this.b = str;
            this.a = i;
        }
    }

    String a();
}
