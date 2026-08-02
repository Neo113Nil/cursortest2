package com.vk.debug.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.a03;
import xsna.a0a;
import xsna.asp;
import xsna.drm0;
import xsna.emb;
import xsna.epx;
import xsna.j9x;
import xsna.jgp;
import xsna.k73;
import xsna.k9x;
import xsna.o2l;
import xsna.swe0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ApiResponseMocks.kt */
/* loaded from: classes17.dex */
public final class ApiResponseMocks {
    public static final ApiResponseMocks a = new ApiResponseMocks();

    /* compiled from: ApiResponseMocks.kt */
    public static final class Mock {
        public final String a;
        public final Type b;
        public final String c;
        public final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ApiResponseMocks.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type FILE;
            public static final Type TEXT;

            static {
                Type type = new Type("TEXT", 0);
                TEXT = type;
                Type type2 = new Type("FILE", 1);
                FILE = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        /* compiled from: ApiResponseMocks.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.TEXT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.FILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Mock(String str, Type type, String str2, Map<String, String> map) {
            this.a = str;
            this.b = type;
            this.c = str2;
            this.d = map;
        }

        public final String a() {
            return this.a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
        public final Map<String, String> b() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final a03 d() {
            int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
            String str = this.c;
            if (i == 1) {
                return new a03.b(str);
            }
            if (i == 2) {
                return new a03.a(str);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mock)) {
                return false;
            }
            Mock mock = (Mock) obj;
            return epx.f(this.a, mock.a) && this.b == mock.b && epx.f(this.c, mock.c) && this.d.equals(mock.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Mock(method=");
            sb.append(this.a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", value=");
            sb.append(this.c);
            sb.append(", params=");
            return k73.c(sb, this.d, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static List a() {
        Object failure;
        Map map;
        Mock mock;
        o2l.a.getClass();
        String c = o2l.c("mockApiResponses", "");
        if (drm0.N(c)) {
            return EmptyList.b;
        }
        try {
            JSONArray jSONArray = new JSONArray(c);
            k9x q = swe0.q(0, jSONArray.length());
            failure = new ArrayList();
            j9x it = q.iterator();
            while (it.d) {
                JSONObject optJSONObject = jSONArray.optJSONObject(it.nextInt());
                if (optJSONObject == null) {
                    mock = null;
                } else {
                    String optString = optJSONObject.optString("method");
                    Mock.Type type = epx.f(optJSONObject.optString("type"), "FILE") ? Mock.Type.FILE : Mock.Type.TEXT;
                    String optString2 = optJSONObject.optString("value");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    if (optJSONObject2 == null) {
                        map = jgp.b;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator<String> keys = optJSONObject2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            linkedHashMap.put(next, optJSONObject2.optString(next));
                        }
                        map = linkedHashMap;
                    }
                    mock = new Mock(optString, type, optString2, map);
                }
                if (mock != null) {
                    failure.add(mock);
                }
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        EmptyList emptyList = failure;
        if (a2 != null) {
            Log.e("ApiResponseMocks", "Failed to parse api responses", a2);
            emptyList = EmptyList.b;
        }
        return emptyList;
    }

    public static String b(ApiResponseMocks apiResponseMocks, Context context, a03 a03Var) {
        Object failure;
        apiResponseMocks.getClass();
        if (a03Var instanceof a03.b) {
            return ((a03.b) a03Var).a;
        }
        if (!(a03Var instanceof a03.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(Uri.parse(((a03.a) a03Var).a));
            if (openInputStream != null) {
                try {
                    failure = a0a.b(new BufferedReader(new InputStreamReader(openInputStream, emb.b), 8192));
                    openInputStream.close();
                } finally {
                }
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 == null) {
            obj = failure;
        } else {
            Log.e("ApiResponseMocks", "Failed to read mock file: " + ((a03.a) a03Var).a, a2);
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }
}
