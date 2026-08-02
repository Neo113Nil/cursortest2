package com.vk.core.util;

import androidx.annotation.Keep;
import com.google.gson.ReflectionAccessFilter;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.Regex;
import xsna.brm0;
import xsna.pmi0;

/* compiled from: GsonDisableReflectionAccessFilter.kt */
@Keep
/* loaded from: classes17.dex */
public final class GsonDisableReflectionAccessFilter implements ReflectionAccessFilter {
    private final Regex allowedClassesRegex = new Regex("(\\.RootResponseDto|java\\.util\\.List|java\\.util.ArrayList)");
    private final Set<String> allowedPackages = Collections.singleton("com.huawei.hms.");

    @Override // com.google.gson.ReflectionAccessFilter
    public ReflectionAccessFilter.FilterResult check(Class<?> cls) {
        Package r4;
        String name;
        Field[] declaredFields;
        Set<String> set = this.allowedPackages;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (String str : set) {
                if (cls != null && (r4 = cls.getPackage()) != null && (name = r4.getName()) != null && brm0.B(name, str, false)) {
                    return ReflectionAccessFilter.FilterResult.ALLOW;
                }
            }
        }
        if (cls != null) {
            if (this.allowedClassesRegex.a(cls.getName())) {
                return ReflectionAccessFilter.FilterResult.ALLOW;
            }
        }
        if (cls != null && (declaredFields = cls.getDeclaredFields()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if ((field.getModifiers() & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE) == 0) {
                    arrayList.add(field);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Field) it.next()).getAnnotation(pmi0.class) != null) {
                    }
                }
            }
            return ReflectionAccessFilter.FilterResult.ALLOW;
        }
        return ReflectionAccessFilter.FilterResult.BLOCK_ALL;
    }
}
