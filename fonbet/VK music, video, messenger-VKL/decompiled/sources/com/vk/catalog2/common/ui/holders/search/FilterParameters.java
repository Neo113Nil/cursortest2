package com.vk.catalog2.common.ui.holders.search;

import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterParameters.kt */
/* loaded from: classes16.dex */
public final class FilterParameters {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FilterParameters[] $VALUES;
    public static final FilterParameters CATEGORY_FILTER;
    public static final a Companion;
    public static final FilterParameters DEFAULT;
    private final String filter;

    /* compiled from: FilterParameters.kt */
    public static final class a {
        public static FilterParameters a(String str) {
            Object obj;
            Iterator<E> it = FilterParameters.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((FilterParameters) obj).i(), str)) {
                    break;
                }
            }
            FilterParameters filterParameters = (FilterParameters) obj;
            return filterParameters == null ? FilterParameters.DEFAULT : filterParameters;
        }
    }

    static {
        FilterParameters filterParameters = new FilterParameters("CATEGORY_FILTER", 0, "category");
        CATEGORY_FILTER = filterParameters;
        FilterParameters filterParameters2 = new FilterParameters("DEFAULT", 1, BuildConfig.FLAVOR);
        DEFAULT = filterParameters2;
        FilterParameters[] filterParametersArr = {filterParameters, filterParameters2};
        $VALUES = filterParametersArr;
        $ENTRIES = new asp(filterParametersArr);
        Companion = new a();
    }

    public FilterParameters(String str, int i, String str2) {
        this.filter = str2;
    }

    public static zrp<FilterParameters> h() {
        return $ENTRIES;
    }

    public static FilterParameters valueOf(String str) {
        return (FilterParameters) Enum.valueOf(FilterParameters.class, str);
    }

    public static FilterParameters[] values() {
        return (FilterParameters[]) $VALUES.clone();
    }

    public final String i() {
        return this.filter;
    }
}
