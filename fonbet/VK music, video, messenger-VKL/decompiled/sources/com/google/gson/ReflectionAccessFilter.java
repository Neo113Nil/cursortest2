package com.google.gson;

/* loaded from: classes13.dex */
public interface ReflectionAccessFilter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class FilterResult {
        private static final /* synthetic */ FilterResult[] $VALUES;
        public static final FilterResult ALLOW;
        public static final FilterResult BLOCK_ALL;
        public static final FilterResult BLOCK_INACCESSIBLE;
        public static final FilterResult INDECISIVE;

        static {
            FilterResult filterResult = new FilterResult("ALLOW", 0);
            ALLOW = filterResult;
            FilterResult filterResult2 = new FilterResult("INDECISIVE", 1);
            INDECISIVE = filterResult2;
            FilterResult filterResult3 = new FilterResult("BLOCK_INACCESSIBLE", 2);
            BLOCK_INACCESSIBLE = filterResult3;
            FilterResult filterResult4 = new FilterResult("BLOCK_ALL", 3);
            BLOCK_ALL = filterResult4;
            $VALUES = new FilterResult[]{filterResult, filterResult2, filterResult3, filterResult4};
        }

        public FilterResult() {
            throw null;
        }

        public static FilterResult valueOf(String str) {
            return (FilterResult) Enum.valueOf(FilterResult.class, str);
        }

        public static FilterResult[] values() {
            return (FilterResult[]) $VALUES.clone();
        }
    }

    FilterResult check(Class<?> cls);
}
