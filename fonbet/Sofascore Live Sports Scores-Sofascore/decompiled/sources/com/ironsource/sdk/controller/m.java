package com.ironsource.sdk.controller;

import com.ironsource.C4197m8;
import defpackage.dmi;
import defpackage.fc6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface m {
    @NotNull
    String a();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements m {
        private int a;

        @NotNull
        private String b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m mVar, int i) {
            this(mVar.a(), i);
            mVar.getClass();
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.a != C4197m8.d.MODE_0.b() && (this.a < C4197m8.d.MODE_1.b() || this.a > C4197m8.d.MODE_3.b())) {
                str = "empty";
            }
            return fc6.o(new StringBuilder("try{"), this.b, "}catch(e){", str, "}");
        }

        public b(@NotNull String str, int i) {
            str.getClass();
            this.b = str;
            this.a = i;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements m {

        @NotNull
        private final String a;

        @Nullable
        private final String b;

        @Nullable
        private final String c;

        @Nullable
        private final String d;

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            StringBuilder sb = new StringBuilder(dmi.q("SSA_CORE.SDKController.runFunction('", this.a));
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

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @Nullable String str2) {
            this(str, str2, null, null, 12, null);
            str.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            this(str, str2, str3, null, 8, null);
            str.getClass();
        }

        public a(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            this(str, null, null, null, 14, null);
            str.getClass();
        }
    }
}
