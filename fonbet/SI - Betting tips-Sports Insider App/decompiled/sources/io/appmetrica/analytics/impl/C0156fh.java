package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156fh extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final String f13737a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13738b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13739c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13740d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13741e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13742f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13743g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13744h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, String> f13745i;
    public final int j;

    public C0156fh(@NonNull C0372o4 c0372o4) {
        this(c0372o4.f14381a, c0372o4.f14382b, c0372o4.f14384d, c0372o4.f14385e, c0372o4.f14386f, c0372o4.f14387g, c0372o4.f14388h, c0372o4.f14389i, c0372o4.j, c0372o4.f14390k);
    }

    public static C0156fh a() {
        return new C0156fh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0156fh mergeFrom(@NonNull C0372o4 c0372o4) {
        return new C0156fh((String) WrapUtils.getOrDefaultNullable(c0372o4.f14381a, this.f13737a), (Boolean) WrapUtils.getOrDefaultNullable(c0372o4.f14382b, Boolean.valueOf(this.f13738b)), (Boolean) WrapUtils.getOrDefaultNullable(c0372o4.f14384d, Boolean.valueOf(this.f13739c)), (Integer) WrapUtils.getOrDefaultNullable(c0372o4.f14385e, Integer.valueOf(this.f13740d)), (Integer) WrapUtils.getOrDefaultNullable(c0372o4.f14386f, Integer.valueOf(this.f13741e)), (Integer) WrapUtils.getOrDefaultNullable(c0372o4.f14387g, Integer.valueOf(this.f13742f)), (Boolean) WrapUtils.getOrDefaultNullable(c0372o4.f14388h, Boolean.valueOf(this.f13743g)), (Boolean) WrapUtils.getOrDefaultNullable(c0372o4.f14389i, Boolean.valueOf(this.f13744h)), (Map) WrapUtils.getOrDefaultNullable(c0372o4.j, this.f13745i), (Integer) WrapUtils.getOrDefaultNullable(c0372o4.f14390k, Integer.valueOf(this.j)));
    }

    public C0156fh(String str, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f13737a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f13738b = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f13739c = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f13740d = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f13741e = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f13742f = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f13743g = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f13744h = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f13745i = map;
        this.j = ((Integer) WrapUtils.getOrDefault(num4, Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull C0372o4 c0372o4) {
        Map<String, String> map;
        String str;
        Boolean bool = c0372o4.f14382b;
        if (bool != null && this.f13738b != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c0372o4.f14384d;
        if (bool2 != null && this.f13739c != bool2.booleanValue()) {
            return false;
        }
        Integer num = c0372o4.f14385e;
        if (num != null && this.f13740d != num.intValue()) {
            return false;
        }
        Integer num2 = c0372o4.f14386f;
        if (num2 != null && this.f13741e != num2.intValue()) {
            return false;
        }
        Integer num3 = c0372o4.f14387g;
        if (num3 != null && this.f13742f != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c0372o4.f14388h;
        if (bool3 != null && this.f13743g != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c0372o4.f14389i;
        if (bool4 != null && this.f13744h != bool4.booleanValue()) {
            return false;
        }
        String str2 = c0372o4.f14381a;
        if (str2 != null && ((str = this.f13737a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c0372o4.j;
        if (map2 != null && ((map = this.f13745i) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c0372o4.f14390k;
        return num4 == null || this.j == num4.intValue();
    }
}
