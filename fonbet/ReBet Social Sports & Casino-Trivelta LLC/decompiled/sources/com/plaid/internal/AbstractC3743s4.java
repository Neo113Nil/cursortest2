package com.plaid.internal;

import com.twilio.voice.EventKeys;
import ei.AbstractC4212b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3743s4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f41051a;

    /* renamed from: com.plaid.internal.s4$a */
    public static final class a {
        @NotNull
        public static AbstractC3743s4 a(@NotNull String jsonString) {
            JsonPrimitive m10;
            Integer k10;
            JsonElement jsonElement;
            JsonPrimitive m11;
            JsonPrimitive m12;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JsonObject l10 = ei.j.l(AbstractC4212b.f46079d.h(jsonString));
            JsonElement jsonElement2 = (JsonElement) l10.get(EventKeys.URL);
            String str = null;
            String a10 = (jsonElement2 == null || (m12 = ei.j.m(jsonElement2)) == null) ? null : m12.a();
            Intrinsics.checkNotNull(a10);
            JsonElement jsonElement3 = (JsonElement) l10.get("mobile_sdk_url_open_message");
            JsonObject l11 = jsonElement3 != null ? ei.j.l(jsonElement3) : null;
            if (l11 != null && (jsonElement = (JsonElement) l11.get("android_url_open_behavior")) != null && (m11 = ei.j.m(jsonElement)) != null) {
                str = m11.a();
            }
            if (str != null) {
                int hashCode = str.hashCode();
                int i10 = 0;
                if (hashCode != -1436496974) {
                    if (hashCode != -844381507) {
                        if (hashCode != 1225038860) {
                            if (hashCode == 1926770975 && str.equals("ANDROID_URL_OPEN_BEHAVIOR_CUSTOM_TAB")) {
                                return new c(a10);
                            }
                        } else if (str.equals("ANDROID_URL_OPEN_BEHAVIOR_EXTERNAL_BROWSER")) {
                            return new b(a10);
                        }
                    } else if (str.equals("ANDROID_URL_OPEN_BEHAVIOR_PARTIAL_CUSTOM_TAB")) {
                        JsonElement jsonElement4 = (JsonElement) l11.get("android_partial_custom_tab_screen_height_pixels");
                        if (jsonElement4 != null && (m10 = ei.j.m(jsonElement4)) != null && (k10 = ei.j.k(m10)) != null) {
                            i10 = k10.intValue();
                        }
                        return new d(a10, i10);
                    }
                } else if (str.equals("ANDROID_URL_OPEN_BEHAVIOR_UNKNOWN")) {
                    return new d(a10, 0);
                }
            }
            throw new Exception("android_url_open_behavior not supported :" + str);
        }
    }

    /* renamed from: com.plaid.internal.s4$b */
    public static final class b extends AbstractC3743s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String url) {
            super(url);
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* renamed from: com.plaid.internal.s4$c */
    public static final class c extends AbstractC3743s4 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String url) {
            super(url);
            Intrinsics.checkNotNullParameter(url, "url");
        }
    }

    /* renamed from: com.plaid.internal.s4$d */
    public static final class d extends AbstractC3743s4 {

        /* renamed from: b, reason: collision with root package name */
        public final int f41052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String url, int i10) {
            super(url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f41052b = i10;
        }
    }

    public AbstractC3743s4(String str) {
        this.f41051a = str;
    }
}
