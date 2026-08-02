package com.yandex.mapkit.search;

import F3.G;
import androidx.annotation.NonNull;
import com.yandex.mapkit.Image;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes9.dex */
public class Feature implements Serializable {
    private String aref;
    private boolean aref__is_initialized;
    private Image iconDark;
    private boolean iconDark__is_initialized;
    private Image iconLight;
    private boolean iconLight__is_initialized;

    /* renamed from: id, reason: collision with root package name */
    private String f60740id;
    private boolean id__is_initialized;
    private String name;
    private boolean name__is_initialized;
    private NativeObject nativeObject;
    private VariantValue value;
    private boolean value__is_initialized;

    public static class VariantValue implements Serializable {
        private BooleanValue booleanValue;
        private List<FeatureEnumValue> enumValue;
        private List<String> textValue;

        @NonNull
        public static VariantValue fromBooleanValue(@NonNull BooleanValue booleanValue) {
            if (booleanValue == null) {
                throw new IllegalArgumentException("Variant value \"booleanValue\" cannot be null");
            }
            VariantValue variantValue = new VariantValue();
            variantValue.booleanValue = booleanValue;
            return variantValue;
        }

        @NonNull
        public static VariantValue fromEnumValue(@NonNull List<FeatureEnumValue> list) {
            if (list == null) {
                throw new IllegalArgumentException("Variant value \"enumValue\" cannot be null");
            }
            VariantValue variantValue = new VariantValue();
            variantValue.enumValue = list;
            return variantValue;
        }

        @NonNull
        public static VariantValue fromTextValue(@NonNull List<String> list) {
            if (list == null) {
                throw new IllegalArgumentException("Variant value \"textValue\" cannot be null");
            }
            VariantValue variantValue = new VariantValue();
            variantValue.textValue = list;
            return variantValue;
        }

        public BooleanValue getBooleanValue() {
            return this.booleanValue;
        }

        public List<FeatureEnumValue> getEnumValue() {
            return this.enumValue;
        }

        public List<String> getTextValue() {
            return this.textValue;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.booleanValue = (BooleanValue) archive.add((Archive) this.booleanValue, true, (Class<Archive>) BooleanValue.class);
            this.textValue = archive.add((List) this.textValue, true, (ArchivingHandler) new StringHandler());
            this.enumValue = G.d(FeatureEnumValue.class, archive, this.enumValue, true);
        }
    }

    public Feature() {
        this.id__is_initialized = false;
        this.value__is_initialized = false;
        this.name__is_initialized = false;
        this.aref__is_initialized = false;
        this.iconLight__is_initialized = false;
        this.iconDark__is_initialized = false;
    }

    private native String getAref__Native();

    private native Image getIconDark__Native();

    private native Image getIconLight__Native();

    private native String getId__Native();

    private native String getName__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Feature";
    }

    private native VariantValue getValue__Native();

    private native NativeObject init(String str, VariantValue variantValue, String str2, String str3, Image image, Image image2);

    public synchronized String getAref() {
        try {
            if (!this.aref__is_initialized) {
                this.aref = getAref__Native();
                this.aref__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.aref;
    }

    public synchronized Image getIconDark() {
        try {
            if (!this.iconDark__is_initialized) {
                this.iconDark = getIconDark__Native();
                this.iconDark__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconDark;
    }

    public synchronized Image getIconLight() {
        try {
            if (!this.iconLight__is_initialized) {
                this.iconLight = getIconLight__Native();
                this.iconLight__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.iconLight;
    }

    @NonNull
    public synchronized String getId() {
        try {
            if (!this.id__is_initialized) {
                this.f60740id = getId__Native();
                this.id__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60740id;
    }

    public synchronized String getName() {
        try {
            if (!this.name__is_initialized) {
                this.name = getName__Native();
                this.name__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.name;
    }

    @NonNull
    public synchronized VariantValue getValue() {
        try {
            if (!this.value__is_initialized) {
                this.value = getValue__Native();
                this.value__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getId(), false);
            archive.add((Archive) getValue(), false, (Class<Archive>) VariantValue.class);
            archive.add(getName(), true);
            archive.add(getAref(), true);
            archive.add((Archive) getIconLight(), true, (Class<Archive>) Image.class);
            archive.add((Archive) getIconDark(), true, (Class<Archive>) Image.class);
            return;
        }
        this.f60740id = archive.add(this.f60740id, false);
        this.id__is_initialized = true;
        this.value = (VariantValue) archive.add((Archive) this.value, false, (Class<Archive>) VariantValue.class);
        this.value__is_initialized = true;
        this.name = archive.add(this.name, true);
        this.name__is_initialized = true;
        this.aref = archive.add(this.aref, true);
        this.aref__is_initialized = true;
        this.iconLight = (Image) archive.add((Archive) this.iconLight, true, (Class<Archive>) Image.class);
        this.iconLight__is_initialized = true;
        Image image = (Image) archive.add((Archive) this.iconDark, true, (Class<Archive>) Image.class);
        this.iconDark = image;
        this.iconDark__is_initialized = true;
        this.nativeObject = init(this.f60740id, this.value, this.name, this.aref, this.iconLight, image);
    }

    public static class BooleanValue implements Serializable {
        private boolean value;

        public BooleanValue(boolean z11) {
            this.value = z11;
        }

        public boolean getValue() {
            return this.value;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.value = archive.add(this.value);
        }

        public BooleanValue() {
        }
    }

    public static class FeatureEnumValue implements Serializable {

        /* renamed from: id, reason: collision with root package name */
        private String f60741id;
        private boolean id__is_initialized;
        private String imageUrlTemplate;
        private boolean imageUrlTemplate__is_initialized;
        private String name;
        private boolean name__is_initialized;
        private NativeObject nativeObject;
        private List<String> tags;
        private boolean tags__is_initialized;

        public FeatureEnumValue() {
            this.id__is_initialized = false;
            this.name__is_initialized = false;
            this.imageUrlTemplate__is_initialized = false;
            this.tags__is_initialized = false;
        }

        private native String getId__Native();

        private native String getImageUrlTemplate__Native();

        private native String getName__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::Feature::EnumValue";
        }

        private native List<String> getTags__Native();

        private native NativeObject init(String str, String str2, String str3, List<String> list);

        @NonNull
        public synchronized String getId() {
            try {
                if (!this.id__is_initialized) {
                    this.f60741id = getId__Native();
                    this.id__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f60741id;
        }

        public synchronized String getImageUrlTemplate() {
            try {
                if (!this.imageUrlTemplate__is_initialized) {
                    this.imageUrlTemplate = getImageUrlTemplate__Native();
                    this.imageUrlTemplate__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.imageUrlTemplate;
        }

        @NonNull
        public synchronized String getName() {
            try {
                if (!this.name__is_initialized) {
                    this.name = getName__Native();
                    this.name__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.name;
        }

        @NonNull
        public synchronized List<String> getTags() {
            try {
                if (!this.tags__is_initialized) {
                    this.tags = getTags__Native();
                    this.tags__is_initialized = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.tags;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getId(), false);
                archive.add(getName(), false);
                archive.add(getImageUrlTemplate(), true);
                archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
                return;
            }
            this.f60741id = archive.add(this.f60741id, false);
            this.id__is_initialized = true;
            this.name = archive.add(this.name, false);
            this.name__is_initialized = true;
            this.imageUrlTemplate = archive.add(this.imageUrlTemplate, true);
            this.imageUrlTemplate__is_initialized = true;
            List<String> add = archive.add((List) this.tags, false, (ArchivingHandler) new StringHandler());
            this.tags = add;
            this.tags__is_initialized = true;
            this.nativeObject = init(this.f60741id, this.name, this.imageUrlTemplate, add);
        }

        public FeatureEnumValue(@NonNull String str, @NonNull String str2, String str3, @NonNull List<String> list) {
            this.id__is_initialized = false;
            this.name__is_initialized = false;
            this.imageUrlTemplate__is_initialized = false;
            this.tags__is_initialized = false;
            if (str == null) {
                throw new IllegalArgumentException("Required field \"id\" cannot be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Required field \"name\" cannot be null");
            }
            if (list != null) {
                this.nativeObject = init(str, str2, str3, list);
                this.f60741id = str;
                this.id__is_initialized = true;
                this.name = str2;
                this.name__is_initialized = true;
                this.imageUrlTemplate = str3;
                this.imageUrlTemplate__is_initialized = true;
                this.tags = list;
                this.tags__is_initialized = true;
                return;
            }
            throw new IllegalArgumentException("Required field \"tags\" cannot be null");
        }

        private FeatureEnumValue(NativeObject nativeObject) {
            this.id__is_initialized = false;
            this.name__is_initialized = false;
            this.imageUrlTemplate__is_initialized = false;
            this.tags__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public Feature(@NonNull String str, @NonNull VariantValue variantValue, String str2, String str3, Image image, Image image2) {
        this.id__is_initialized = false;
        this.value__is_initialized = false;
        this.name__is_initialized = false;
        this.aref__is_initialized = false;
        this.iconLight__is_initialized = false;
        this.iconDark__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"id\" cannot be null");
        }
        if (variantValue != null) {
            this.nativeObject = init(str, variantValue, str2, str3, image, image2);
            this.f60740id = str;
            this.id__is_initialized = true;
            this.value = variantValue;
            this.value__is_initialized = true;
            this.name = str2;
            this.name__is_initialized = true;
            this.aref = str3;
            this.aref__is_initialized = true;
            this.iconLight = image;
            this.iconLight__is_initialized = true;
            this.iconDark = image2;
            this.iconDark__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"value\" cannot be null");
    }

    private Feature(NativeObject nativeObject) {
        this.id__is_initialized = false;
        this.value__is_initialized = false;
        this.name__is_initialized = false;
        this.aref__is_initialized = false;
        this.iconLight__is_initialized = false;
        this.iconDark__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
