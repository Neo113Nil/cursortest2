package om0;

import G.g;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* renamed from: om0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8754a {

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    private static final Regex f78435f = new Regex("\\r\\n|\\r|\\n|\\t");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f78436a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f78437b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f78438c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f78439d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f78440e;

    /* renamed from: om0.a$a, reason: collision with other inner class name */
    public enum EnumC1333a {
        BUSINESS("business"),
        TECHNICAL("technical"),
        SENSITIVE("sensitive");


        @NotNull
        private final String type;

        EnumC1333a(String str) {
            this.type = str;
        }

        @NotNull
        public final String a() {
            return this.type;
        }
    }

    public C8754a(String eventName, EnumC1333a eventType) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f78436a = eventType.a();
        this.f78437b = b(eventName, "unknownAction");
        this.f78438c = b(null, "");
        this.f78439d = b(null, "");
        this.f78440e = new LinkedHashMap();
    }

    private static String b(String str, String str2) {
        String str3;
        if (str == null || str.length() == 0) {
            str3 = "";
        } else {
            str3 = f78435f.replace(h.Y(str, '=', '-'), " ");
            if (str3.length() > 256) {
                str3 = str3.substring(0, 256);
                Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        return str3.length() == 0 ? str2 : str3;
    }

    public final void a(@NotNull LinkedHashMap newProperties) {
        Intrinsics.checkNotNullParameter(newProperties, "newProperties");
        Set<Map.Entry> entrySet = newProperties.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return;
        }
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LinkedHashMap linkedHashMap = this.f78440e;
            if (linkedHashMap.size() >= 64) {
                return;
            } else {
                linkedHashMap.put(b(str, "unknownKey"), b(str2, ""));
            }
        }
    }

    @NotNull
    public final String c() {
        return this.f78437b;
    }

    @NotNull
    public final String d() {
        return this.f78438c;
    }

    @NotNull
    public final String e() {
        return this.f78436a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8754a.class.equals(obj != null ? obj.getClass() : null) || hashCode() != obj.hashCode()) {
            return false;
        }
        C8754a c8754a = (C8754a) obj;
        return Intrinsics.d(this.f78437b, c8754a.f78437b) && Intrinsics.d(this.f78436a, c8754a.f78436a) && Intrinsics.d(this.f78438c, c8754a.f78438c) && Intrinsics.d(this.f78439d, c8754a.f78439d) && Intrinsics.d(this.f78440e, c8754a.f78440e);
    }

    @NotNull
    public final String f() {
        return this.f78439d;
    }

    @NotNull
    public final LinkedHashMap g() {
        return this.f78440e;
    }

    public final int hashCode() {
        return this.f78440e.hashCode() + g.a(g.a(g.a(this.f78437b.hashCode() * 31, 31, this.f78436a), 31, this.f78438c), 31, this.f78439d);
    }

    @NotNull
    public final String toString() {
        return "ClickstreamEvent(eventAction=" + this.f78437b + ", internalEventType=" + this.f78436a + ", internalEventCategory=" + this.f78438c + ", internalValue=" + this.f78439d + ", properties=" + this.f78440e + ')';
    }
}
