package com.yandex.mapkit.search;

import F3.G;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes9.dex */
public class BusinessResultMetadata implements Serializable {
    private List<BusinessFilter> businessFilters;
    private boolean businessFilters__is_initialized;
    private List<Category> categories;
    private boolean categories__is_initialized;
    private List<Chain> chains;
    private boolean chains__is_initialized;
    private FilterSet importantFilters;
    private boolean importantFilters__is_initialized;
    private NativeObject nativeObject;
    private List<String> pricesCurrencies;
    private boolean pricesCurrencies__is_initialized;

    public BusinessResultMetadata() {
        this.categories__is_initialized = false;
        this.chains__is_initialized = false;
        this.businessFilters__is_initialized = false;
        this.importantFilters__is_initialized = false;
        this.pricesCurrencies__is_initialized = false;
    }

    private native List<BusinessFilter> getBusinessFilters__Native();

    private native List<Category> getCategories__Native();

    private native List<Chain> getChains__Native();

    private native FilterSet getImportantFilters__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BusinessResultMetadata";
    }

    private native List<String> getPricesCurrencies__Native();

    private native NativeObject init(List<Category> list, List<Chain> list2, List<BusinessFilter> list3, FilterSet filterSet, List<String> list4);

    @NonNull
    public synchronized List<BusinessFilter> getBusinessFilters() {
        try {
            if (!this.businessFilters__is_initialized) {
                this.businessFilters = getBusinessFilters__Native();
                this.businessFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.businessFilters;
    }

    @NonNull
    public synchronized List<Category> getCategories() {
        try {
            if (!this.categories__is_initialized) {
                this.categories = getCategories__Native();
                this.categories__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.categories;
    }

    @NonNull
    public synchronized List<Chain> getChains() {
        try {
            if (!this.chains__is_initialized) {
                this.chains = getChains__Native();
                this.chains__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.chains;
    }

    public synchronized FilterSet getImportantFilters() {
        try {
            if (!this.importantFilters__is_initialized) {
                this.importantFilters = getImportantFilters__Native();
                this.importantFilters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.importantFilters;
    }

    @NonNull
    public synchronized List<String> getPricesCurrencies() {
        try {
            if (!this.pricesCurrencies__is_initialized) {
                this.pricesCurrencies = getPricesCurrencies__Native();
                this.pricesCurrencies__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.pricesCurrencies;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getCategories(), false, (ArchivingHandler) new ClassHandler(Category.class));
            archive.add((List) getChains(), false, (ArchivingHandler) new ClassHandler(Chain.class));
            archive.add((List) getBusinessFilters(), false, (ArchivingHandler) new ClassHandler(BusinessFilter.class));
            archive.add((Archive) getImportantFilters(), true, (Class<Archive>) FilterSet.class);
            archive.add((List) getPricesCurrencies(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        this.categories = G.d(Category.class, archive, this.categories, false);
        this.categories__is_initialized = true;
        this.chains = G.d(Chain.class, archive, this.chains, false);
        this.chains__is_initialized = true;
        this.businessFilters = G.d(BusinessFilter.class, archive, this.businessFilters, false);
        this.businessFilters__is_initialized = true;
        this.importantFilters = (FilterSet) archive.add((Archive) this.importantFilters, true, (Class<Archive>) FilterSet.class);
        this.importantFilters__is_initialized = true;
        List<String> add = archive.add((List) this.pricesCurrencies, false, (ArchivingHandler) new StringHandler());
        this.pricesCurrencies = add;
        this.pricesCurrencies__is_initialized = true;
        this.nativeObject = init(this.categories, this.chains, this.businessFilters, this.importantFilters, add);
    }

    public BusinessResultMetadata(@NonNull List<Category> list, @NonNull List<Chain> list2, @NonNull List<BusinessFilter> list3, FilterSet filterSet, @NonNull List<String> list4) {
        this.categories__is_initialized = false;
        this.chains__is_initialized = false;
        this.businessFilters__is_initialized = false;
        this.importantFilters__is_initialized = false;
        this.pricesCurrencies__is_initialized = false;
        if (list == null) {
            throw new IllegalArgumentException("Required field \"categories\" cannot be null");
        }
        if (list2 == null) {
            throw new IllegalArgumentException("Required field \"chains\" cannot be null");
        }
        if (list3 == null) {
            throw new IllegalArgumentException("Required field \"businessFilters\" cannot be null");
        }
        if (list4 != null) {
            this.nativeObject = init(list, list2, list3, filterSet, list4);
            this.categories = list;
            this.categories__is_initialized = true;
            this.chains = list2;
            this.chains__is_initialized = true;
            this.businessFilters = list3;
            this.businessFilters__is_initialized = true;
            this.importantFilters = filterSet;
            this.importantFilters__is_initialized = true;
            this.pricesCurrencies = list4;
            this.pricesCurrencies__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"pricesCurrencies\" cannot be null");
    }

    private BusinessResultMetadata(NativeObject nativeObject) {
        this.categories__is_initialized = false;
        this.chains__is_initialized = false;
        this.businessFilters__is_initialized = false;
        this.importantFilters__is_initialized = false;
        this.pricesCurrencies__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
