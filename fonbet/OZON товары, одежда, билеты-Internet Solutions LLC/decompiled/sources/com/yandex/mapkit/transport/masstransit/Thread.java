package com.yandex.mapkit.transport.masstransit;

import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public class Thread implements BaseMetadata, Serializable {
    private List<ThreadCategory> category;
    private boolean category__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private List<Stop> essentialStops;
    private boolean essentialStops__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f60749id;
    private boolean id__is_initialized;
    private NativeObject nativeObject;

    public Thread() {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.category__is_initialized = false;
    }

    private native List<ThreadCategory> getCategory__Native();

    private native String getDescription__Native();

    private native List<Stop> getEssentialStops__Native();

    private native String getId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::Thread";
    }

    private native NativeObject init(String str, List<Stop> list, String str2, List<ThreadCategory> list2);

    @NonNull
    public synchronized List<ThreadCategory> getCategory() {
        try {
            if (!this.category__is_initialized) {
                this.category = getCategory__Native();
                this.category__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.category;
    }

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.description;
    }

    @NonNull
    public synchronized List<Stop> getEssentialStops() {
        try {
            if (!this.essentialStops__is_initialized) {
                this.essentialStops = getEssentialStops__Native();
                this.essentialStops__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.essentialStops;
    }

    @NonNull
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f60749id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60749id;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((List) getEssentialStops(), false, (ArchivingHandler) new ClassHandler(Stop.class));
            archive.add(getDescription(), true);
            archive.add((List) getCategory(), false, (ArchivingHandler) new EnumHandler(ThreadCategory.class));
            return;
        }
        this.f60749id = archive.add(this.f60749id, false);
        this.id__is_initialized = true;
        this.essentialStops = G.d(Stop.class, archive, this.essentialStops, false);
        this.essentialStops__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        List<ThreadCategory> add = archive.add((List) this.category, false, (ArchivingHandler) new EnumHandler(ThreadCategory.class));
        this.category = add;
        this.category__is_initialized = true;
        this.nativeObject = init(this.f60749id, this.essentialStops, this.description, add);
    }

    public Thread(@NonNull String str, @NonNull List<Stop> list, String str2, @NonNull List<ThreadCategory> list2) {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.category__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("Required field \"essentialStops\" cannot be null");
        }
        if (list2 != null) {
            this.nativeObject = init(str, list, str2, list2);
            this.f60749id = str;
            this.id__is_initialized = true;
            this.essentialStops = list;
            this.essentialStops__is_initialized = true;
            this.description = str2;
            this.description__is_initialized = true;
            this.category = list2;
            this.category__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"category\" cannot be null");
    }

    private Thread(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.essentialStops__is_initialized = false;
        this.description__is_initialized = false;
        this.category__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
