package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.ListHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class FilterCollection implements Serializable {
    private List<String> booleanFilters;
    private boolean booleanFilters__is_initialized;
    private Map<String, DateRange> dateFilters;
    private boolean dateFilters__is_initialized;
    private Map<String, List<String>> enumFilters;
    private boolean enumFilters__is_initialized;
    private NativeObject nativeObject;
    private Map<String, NumberRange> rangeFilters;
    private boolean rangeFilters__is_initialized;

    public FilterCollection() {
        this.booleanFilters__is_initialized = false;
        this.enumFilters__is_initialized = false;
        this.rangeFilters__is_initialized = false;
        this.dateFilters__is_initialized = false;
    }

    private native List<String> getBooleanFilters__Native();

    private native Map<String, DateRange> getDateFilters__Native();

    private native Map<String, List<String>> getEnumFilters__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::FilterCollection";
    }

    private native Map<String, NumberRange> getRangeFilters__Native();

    private native NativeObject init(List<String> list, Map<String, List<String>> map, Map<String, NumberRange> map2, Map<String, DateRange> map3);

    @NonNull
    public synchronized List<String> getBooleanFilters() {
        try {
            if (!this.booleanFilters__is_initialized) {
                this.booleanFilters = getBooleanFilters__Native();
                this.booleanFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.booleanFilters;
    }

    @NonNull
    public synchronized Map<String, DateRange> getDateFilters() {
        try {
            if (!this.dateFilters__is_initialized) {
                this.dateFilters = getDateFilters__Native();
                this.dateFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.dateFilters;
    }

    @NonNull
    public synchronized Map<String, List<String>> getEnumFilters() {
        try {
            if (!this.enumFilters__is_initialized) {
                this.enumFilters = getEnumFilters__Native();
                this.enumFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.enumFilters;
    }

    @NonNull
    public synchronized Map<String, NumberRange> getRangeFilters() {
        try {
            if (!this.rangeFilters__is_initialized) {
                this.rangeFilters = getRangeFilters__Native();
                this.rangeFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.rangeFilters;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getBooleanFilters(), false, (ArchivingHandler) new StringHandler());
            archive.add(getEnumFilters(), false, new StringHandler(), new ListHandler(new StringHandler()));
            archive.add(getRangeFilters(), false, new StringHandler(), new ClassHandler(NumberRange.class));
            archive.add(getDateFilters(), false, new StringHandler(), new ClassHandler(DateRange.class));
            return;
        }
        this.booleanFilters = archive.add((List) this.booleanFilters, false, (ArchivingHandler) new StringHandler());
        this.booleanFilters__is_initialized = true;
        this.enumFilters = archive.add(this.enumFilters, false, new StringHandler(), new ListHandler(new StringHandler()));
        this.enumFilters__is_initialized = true;
        this.rangeFilters = archive.add(this.rangeFilters, false, new StringHandler(), new ClassHandler(NumberRange.class));
        this.rangeFilters__is_initialized = true;
        Map<String, DateRange> add = archive.add(this.dateFilters, false, new StringHandler(), new ClassHandler(DateRange.class));
        this.dateFilters = add;
        this.dateFilters__is_initialized = true;
        this.nativeObject = init(this.booleanFilters, this.enumFilters, this.rangeFilters, add);
    }

    public static class NumberRange implements Serializable {
        private double from;
        private double to;

        public NumberRange(double d11, double d12) {
            this.from = d11;
            this.to = d12;
        }

        public double getFrom() {
            return this.from;
        }

        public double getTo() {
            return this.to;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.from = archive.add(this.from);
            this.to = archive.add(this.to);
        }

        public NumberRange() {
        }
    }

    public static class DateRange implements Serializable {
        private String from;
        private String to;

        public DateRange(@NonNull String str, @NonNull String str2) {
            if (str == null) {
                throw new IllegalArgumentException("Required field \"from\" cannot be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required field \"to\" cannot be null");
            }
            this.from = str;
            this.to = str2;
        }

        @NonNull
        public String getFrom() {
            return this.from;
        }

        @NonNull
        public String getTo() {
            return this.to;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.from = archive.add(this.from, false);
            this.to = archive.add(this.to, false);
        }

        public DateRange() {
        }
    }

    public FilterCollection(@NonNull List<String> list, @NonNull Map<String, List<String>> map, @NonNull Map<String, NumberRange> map2, @NonNull Map<String, DateRange> map3) {
        this.booleanFilters__is_initialized = false;
        this.enumFilters__is_initialized = false;
        this.rangeFilters__is_initialized = false;
        this.dateFilters__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"booleanFilters\" cannot be null");
        }
        if (map == null) {
            throw new IllegalArgumentException("Required field \"enumFilters\" cannot be null");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Required field \"rangeFilters\" cannot be null");
        }
        if (map3 != null) {
            this.nativeObject = init(list, map, map2, map3);
            this.booleanFilters = list;
            this.booleanFilters__is_initialized = true;
            this.enumFilters = map;
            this.enumFilters__is_initialized = true;
            this.rangeFilters = map2;
            this.rangeFilters__is_initialized = true;
            this.dateFilters = map3;
            this.dateFilters__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"dateFilters\" cannot be null");
    }

    private FilterCollection(NativeObject nativeObject) {
        this.booleanFilters__is_initialized = false;
        this.enumFilters__is_initialized = false;
        this.rangeFilters__is_initialized = false;
        this.dateFilters__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
